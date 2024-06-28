package visitor;

import AST.*;
import SymbolTable.SymbolTable;
import SymbolTable.Symbol;

import antlr.*;

import java.util.Objects;
import java.util.Random;



public class BaseVisitor extends ReactParserBaseVisitor {
    public SymbolTable symbolTable = SymbolTable.getInstance();

    @Override
    public Program visitProgram(ReactParser.ProgramContext ctx) {
        Program program = new Program();
        for (int i = 0; i < ctx.children.size(); i++) {
            program.addChild((ASTNode) visit(ctx.getChild(i)));
        }
        return program;
    }
    @Override //NEW_EDIT TODO : check if useState is transforming
    public Object visitSemantic_rule(ReactParser.Semantic_ruleContext ctx) {
//        String errorMessage = "Semantic Error:is not valid the role";
//        symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
        System.out.println( super.visitSemantic_rule(ctx).toString());
//        return super.visitSemantic_rule(ctx);
        return null;
    }

    @Override
    public ASTNode visitMemberExpression(ReactParser.MemberExpressionContext ctx) {
        if (ctx.children.size() == 1) {
            ASTNode left = (ASTNode) visit(ctx.getChild(0));
            if (left instanceof Identifier) {
                if (symbolTable.statusArgs()) {
                    Symbol symbol = new Symbol("Identifier", "");
                    symbolTable.put(((Identifier) left).id, symbol);
                } else {

                    if (!symbolTable.isDeclare(((Identifier) left).id)) {
                        String errorMessage = "Semantic Error: variable '" + ((Identifier) left).id + "' is not declare";
                        symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
                    }
                }
            }
            return new MemberExpression(left);
        } else if (ctx.DOT() != null) {//id.fn()
            ASTNode left = (ASTNode) visit(ctx.getChild(0));
            ASTNode right = (ASTNode) visit(ctx.getChild(2));
            if (left instanceof Identifier) {
                if (!symbolTable.isDeclare(((Identifier) left).id)) {
                    String errorMessage = "Semantic Error: variable '" + ((Identifier) left).id + "' is not declare";
                    symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
                }
            }
            if (right instanceof Identifier) {
                if (!symbolTable.isDeclare(((Identifier) right).id)) {
                    String errorMessage = "Semantic Error: variable '" + ((Identifier) right).id + "' is not declare";
                    symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
                }
            }
            return new MemberExpression(left, right ,"DOT");
        } else if(ctx.LSBRACKET()!=null){// id[id1]
            return new MemberExpression(visitId(ctx.id()),
                    (ASTNode) visit(ctx.getChild(2)),"LSBRACKET");
        }

        return null;
    }

    @Override
    public ASTNode visitExpression(ReactParser.ExpressionContext ctx) {
        if (ctx.literal() != null) {
            return visitLiteral(ctx.literal());
        } else if (ctx.id() != null) {
            ASTNode left = visitId(ctx.id());
            if (symbolTable.statusArgs()) {
                Symbol symbol = new Symbol("Identifier", "");
                symbolTable.put(((Identifier) left).id, symbol);
            } else {
                if (!symbolTable.isDeclare(((Identifier) left).id)) {
                    String errorMessage = "Semantic Error: variable '" + ((Identifier) left).id + "' is not declare";
                    symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
                }
            }
            return left;
        } else if (ctx.memberExpression() != null) {
            return visitMemberExpression(ctx.memberExpression());
        } else if (ctx.jsx() != null) {
            return visitJsx(ctx.jsx());
        } else {
            Expression exp = new Expression();
            ASTNode left = visitExpression(ctx.expression(0));
            if (left instanceof Identifier) {
                if (!symbolTable.isDeclare(((Identifier) left).id)) {
                    String errorMessage = "Semantic Error: variable '" + ((Identifier) left).id + "' is not declare";
                    symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
                }
            }

            exp.setLeftExpression(left);
            if(ctx.operator()!=null){
                exp.setOperator((Operator) visitOperator(ctx.operator()));
            }
            if (ctx.expression(1) != null) {
                ASTNode right = visitExpression(ctx.expression(1));
                if (right instanceof Identifier) {
                    if (!symbolTable.isDeclare(((Identifier) right).id)) {
                        String errorMessage = "Semantic Error: variable '" + ((Identifier) right).id + "' is not declare";
                        symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
                    }
                }
                exp.setRightExpression(right);
            }
            return exp;
        }
    }

    @Override
    public ASTNode visitComment(ReactParser.CommentContext ctx) {
        String type, content;
        if (ctx.SINGLE_LINE_COMMENT() != null) {
            type = "single_line_comment";
            content = ctx.getText();
        } else {
            type = "Block_comment";
            content = ctx.getText();
        }
        return new Comment(type, content);
    }


    @Override
    public ASTNode visitSelfClosingElement(ReactParser.SelfClosingElementContext ctx) {
        String name = ctx.id(0).getText();
        for (int i = 1; i < ctx.id().size(); i++) {
            name += '.' + ctx.id(i).getText();
        }
        SelfClosingTag selfClosingTag = new SelfClosingTag(name);
        //ASTNode.jsxExpDepth+=1;
        for (ReactParser.JsxAttributeContext jsxAtCtx : ctx.jsxAttribute()) {
            selfClosingTag.addJsxAttribute((ASTNode) visit(jsxAtCtx));
        }
      //ASTNode.jsxExpDepth-=1;

        return selfClosingTag;
    }


    @Override
    public ASTNode visitSpreadOperation(ReactParser.SpreadOperationContext ctx) {
        return new SpreadOperation((ASTNode) visit(ctx.getChild(3)));
    }

    @Override

    public ASTNode visitJsx(ReactParser.JsxContext ctx) {

        if (ctx.selfClosingElement() != null) {
            return new jsx(visitSelfClosingElement(ctx.selfClosingElement()));
        } else if (ctx.normalJsxElement() != null) {
            return new jsx(visitNormalJsxElement(ctx.normalJsxElement()));
        } else {//jsx Fragment
            return new jsx(visitJsxFragment(ctx.jsxFragment()));
        }
    }


    @Override
    public ASTNode visitJsxSpreadAttribute(ReactParser.JsxSpreadAttributeContext ctx) {
        return new JsxSpreadAttribute((SpreadOperation) visitSpreadOperation(ctx.spreadOperation()));
    }

    @Override
    public ASTNode visitJsxIdentifier(ReactParser.JsxIdentifierContext ctx) {
        if (ctx.children.size() == 1) {//id
            return new JsxIdentifier((ctx.id().getText()));
        } else {//id=
            return new JsxIdentifier((ASTNode) visit(ctx.getChild(2)), (ctx.id().getText()));
        }
    }

    @Override
    public ASTNode visitJsxFragment(ReactParser.JsxFragmentContext ctx) {
        JsxFragment jsxFragment = new JsxFragment();
        for (int i = 1; i < ctx.children.size(); i++) {
            if (ctx.getChild(i) instanceof ReactParser.StatementContext) {
                jsxFragment.addChild(ctx.getChild(i).getText());
            } else if (ctx.getChild(i) instanceof ReactParser.JsxContext) {
                jsxFragment.addChild(visitJsx((ReactParser.JsxContext) ctx.getChild(i)));
            } else if (ctx.getChild(i) instanceof ReactParser.JsxExpressionContext) {
                jsxFragment.addChild(visitJsxExpression((ReactParser.JsxExpressionContext) ctx.getChild(i)));
            }
        }
        return jsxFragment;
    }

    @Override
    public ASTNode visitNormalJsxElement(ReactParser.NormalJsxElementContext ctx) {
        OpenTag openTag=(OpenTag) visitOpenTag(ctx.openTag());
        CloseTag closeTag=(CloseTag) visitCloseTag(ctx.closeTag());
        if(!Objects.equals(openTag.getId(), closeTag.getId())){
            System.out.println("openTag:   "+openTag.getId()+"    closeTag:   "+closeTag.getId());
            String errorMessage = "Semantic Error: tag '"+openTag.getId()+ "' has no matching tag";
            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
        }
        NormalJsxElement normalJsxElement =
                new NormalJsxElement(openTag, closeTag);
        for (int i = 1; i < ctx.children.size(); i++) {
            if (ctx.getChild(i) instanceof ReactParser.StatementContext) {
                StringBuilder jsxText = new StringBuilder();
                while((ctx.getChild(i) instanceof ReactParser.StatementContext)){
                    jsxText.append(ctx.getChild(i).getText()).append(" ");
                    ++i;
                }
                i-=1;
                normalJsxElement.addChild(jsxText.toString());
            } else if (ctx.getChild(i) instanceof ReactParser.JsxContext) {
                normalJsxElement.addChild(visitJsx((ReactParser.JsxContext) ctx.getChild(i)));
            } else if (ctx.getChild(i) instanceof ReactParser.JsxExpressionContext) {
                normalJsxElement.addChild(visitJsxExpression((ReactParser.JsxExpressionContext) ctx.getChild(i)));
            }
        }
        return normalJsxElement;
    }

    @Override
    public ASTNode visitJsxExpression(ReactParser.JsxExpressionContext ctx) {
        JsxExpression jsxexp = new JsxExpression();
       // ASTNode.jsxExpDepth+=1;
        for (int i = 1; i < ctx.children.size(); i++) {
            if (ctx.getChild(i) != null) {
                jsxexp.addChild((ASTNode) visit(ctx.getChild(i)));
            }
        }
        //ASTNode.jsxExpDepth-=1;
        return jsxexp;
    }

    @Override
    public ASTNode visitOpenTag(ReactParser.OpenTagContext ctx) {
        String name = ctx.id(0).getText();
        for (int i = 1; i < ctx.id().size(); i++) {
            name += '.' + ctx.id(i).getText();
        }
        OpenTag openTag = new OpenTag(name);
        for (ReactParser.JsxAttributeContext jsxAtCtx : ctx.jsxAttribute()) {
            openTag.addJsxAttribute((ASTNode) visit(jsxAtCtx));
        }

        return openTag;
    }


    @Override
    public ASTNode visitCloseTag(ReactParser.CloseTagContext ctx) {
        String name = ctx.id(0).getText();
        for (int i = 1; i < ctx.id().size(); i++) {
            name += '.' + ctx.id(i).getText();
        }
        return new CloseTag(name);
    }


    @Override
    public ASTNode visitId(ReactParser.IdContext ctx) {
        String id = ctx.getText();
        return new Identifier(id);
    }

    @Override
    public ASTNode visitLiteral(ReactParser.LiteralContext ctx) {
        String type = "", value = "";
        if (ctx.Integer() != null) {
            type = "integer";
            value = ctx.getText();
        } else if (ctx.Float() != null) {
            type = "float";
            value = ctx.getText();
        } else if (ctx.Boolean() != null) {
            type = "boolean";
            value = ctx.getText();
        } else if (ctx.Undefined() != null) {
            type = "undefined";
            value = ctx.getText();
        } else if (ctx.Null() != null) {
            type = "null";
            value = ctx.getText();
        } else if (ctx.String() != null) {
            type = "string";
           // System.out.println("the first child of the string is "+ctx.String().toString().charAt(0));
            value = ctx.getText();
        }

        return new Literal(type, value);
    }

    @Override
    public ASTNode visitOperator(ReactParser.OperatorContext ctx) {
        return new Operator(ctx.getText());
    }

    @Override
    public ASTNode visitArrayElement(ReactParser.ArrayElementContext ctx) {
        ASTNode element = null;
        if (ctx.id() != null) {
            element = visitId(ctx.id());
            if (!symbolTable.isDeclare(((Identifier) element).id)) {
                String errorMessage = "Semantic Error: variable '" + ((Identifier) element).id + "' is not declare";
                symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
            }
        } else if (ctx.literal() != null) {
            element = visitLiteral(ctx.literal());
        } else if (ctx.jsx() != null) {
            element = visitJsx(ctx.jsx());
        } else if (ctx.objectLiteral() != null) {
            element = visitObjectLiteral(ctx.objectLiteral());
        } else if (ctx.array() != null) {
            element = visitArray(ctx.array());
        } else {//function
            element = visitFunction(ctx.function());
        }
        return new ArrayElement(element);
    }

    @Override
    public ASTNode visitArray(ReactParser.ArrayContext ctx) {
        Array array = new Array();
        for (ReactParser.ArrayElementContext arrayElementctx : ctx.arrayElement()) {
            ArrayElement element = (ArrayElement) visitArrayElement(arrayElementctx);
            array.addToElementList(element);
        }
        return array;
    }

    @Override
    public ASTNode visitProps(ReactParser.PropsContext ctx) {

        if (ctx.id() != null) {
            return new Props( (ASTNode) new Identifier(ctx.id().getText()));
        }else if(ctx.objectLiteral()!=null){
            return new Props( (ASTNode)  visitObjectLiteral(ctx.objectLiteral()));

        }
        return new Props( (ASTNode)  null);
    }

    @Override
    public ASTNode visitPureReactElement(ReactParser.PureReactElementContext ctx) {
        Props props = new Props(visitProps((ReactParser.PropsContext) ctx.getChild(4)));//props

        ASTNode element_name = (ASTNode) visit( ctx.getChild(2));
        PureReactElement pureReactElement = new PureReactElement(props, element_name);
        for (int i = 6; i < ctx.children.size() - 1; i++) {
            if (ctx.getChild(i) != ctx.COMMA(0)) {
                pureReactElement.addChild((ASTNode) visit(ctx.getChild(6)));
            }

        }
        return pureReactElement;
    }

    @Override
    public ASTNode visitObjectExpression(ReactParser.ObjectExpressionContext ctx) {
        if (ctx.array() != null) {
            return new ObjectExpression(visitArray(ctx.array()));
        } else if (ctx.expression() != null) {
            return new ObjectExpression(visitExpression(ctx.expression()));
        } else if (ctx.objectLiteral() != null) {
            return new ObjectExpression(visitObjectLiteral(ctx.objectLiteral()));
        } else {
            return new ObjectExpression(visitArrowFunctionDeclaration(ctx.arrowFunctionDeclaration()));
        }
    }


    @Override
    public ASTNode visitUnaryExpression(ReactParser.UnaryExpressionContext ctx) {
        if (ctx.literal() != null) {
            return visitLiteral(ctx.literal());
        } else if (ctx.id() != null) {
            return visitId(ctx.id());
        } else if (ctx.expression() != null) {
            return visitExpression(ctx.expression());
        } else {
            return new UnaryExpression(visitUnaryExpression(ctx.unaryExpression()), (Operator) visitOperator(ctx.operator()));
        }

    }

    @Override
    public ASTNode visitProperty(ReactParser.PropertyContext ctx) {
        Identifier key = null;
        ObjectExpression value = null;

        if (ctx.id() != null && ctx.objectExpression() != null) {//{ id:"s",id1:5 }
            key = (Identifier) visitId(ctx.id());
            value = (ObjectExpression) visitObjectExpression(ctx.objectExpression());
        } else {// {id,id1}
            if(ctx.ONCLICK()!=null){
                key=new Identifier("OnClick");
            }else{
                key = (Identifier) visitId(ctx.id());
            }
        }
        return new Property(key, value);
    }
    //Edit_Hef
    @Override
    public ASTNode visitObjectLiteral(ReactParser.ObjectLiteralContext ctx) {
        int x = new Random().nextInt(100) + 1;
        symbolTable.enterScope("ObjectLiteral[" + x + "]");
        ObjectLiteral objectLiteral = new ObjectLiteral();
        if (ctx.property() != null) {
            for (ReactParser.PropertyContext propertyctx : ctx.property()) {
                Property property = (Property) visitProperty(propertyctx);
                objectLiteral.addProperty(property);
                if (symbolTable.containsSymbol(property.key.id)) {
                    // Handle the case where a symbol with the same name already exists
                    String errorMessage = "Semantic Error: object '" + property.key.id + "' already exists";
                    symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
                    return objectLiteral;
                }
                Symbol symbol ;
//                System.out.println("||||||||||||||||||||||"+property.key.id);
                if (propertyctx.COLON() != null) {
                    symbol = new Symbol("ObjectLiteral", property.value.toString());

                }else{
                    symbol = new Symbol("ObjectLiteral", "null");
                }
                symbolTable.put2(property.key.id, symbol);
                symbolTable.put(property.key.id, symbol);

            }
        }
        symbolTable.removeScope();
        symbolTable.exitScope();
        return objectLiteral;

    }


    @Override
    public ASTNode visitUseRefDeclaration(ReactParser.UseRefDeclarationContext ctx) {

        Identifier id = (Identifier) visitId(ctx.id(0));
        ASTNode initialValue;

        if (ctx.getChild(5) instanceof ReactParser.IdContext) {
            initialValue = visitId((ReactParser.IdContext) ctx.getChild(5));
        } else if (ctx.getChild(5) instanceof ReactParser.LiteralContext) {
            initialValue = visitLiteral((ReactParser.LiteralContext) ctx.getChild(5));
        } else if (ctx.getChild(5) instanceof ReactParser.ObjectLiteralContext) {
            initialValue = visitObjectLiteral((ReactParser.ObjectLiteralContext) ctx.getChild(5));
        } else {//expression
            initialValue = visitExpression((ReactParser.ExpressionContext) ctx.getChild(5));
        }
        if (symbolTable.containsSymbol(id.id)) {
            String errorMessage = "Semantic Error: UseRef '" + id.id + "' already exists";
            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
            return new UserRefDeclaration(id, initialValue);
        }
        Symbol symbol = new Symbol("UseRef", initialValue);
        symbolTable.put(id.id, symbol);
        return new UserRefDeclaration(id, initialValue);

    }

    @Override
    public ASTNode visitVariableDeclarator(ReactParser.VariableDeclaratorContext ctx) {
        Identifier id = null;
        if (ctx.id(0) != null) {
            id = (Identifier) visitId(ctx.id(0));
        } else return null;

        //Handle the case where a symbol with the same name already exists
        if (symbolTable.containsSymbol(id.id)) {
            String errorMessage = "Semantic Error: Variable '" + id.id + "' already exists";
            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
        }

//        if (!symbolTable.isDeclare(id.id)) {
//            String errorMessage = "Semantic Error: variable '" + id.id + "' is not declare";
//            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
//        }


        if (ctx.getChild(2) != null) {
            if (ctx.getChild(2) instanceof ReactParser.LiteralContext) {
                Literal literal = (Literal) visitLiteral((ReactParser.LiteralContext) ctx.getChild(2));
                Symbol symbol = new Symbol(literal.type, literal.value);
                symbolTable.put(id.id, symbol);
                return new VariableDeclarator(id, literal);

            }
            if (ctx.getChild(2) instanceof ReactParser.FunctionCallContext) {
                FunctionCall functionCall = (FunctionCall) visitFunctionCall(ctx.object().functionCall());
                Symbol symbol = new Symbol(functionCall.functionName.toUpperCase(), "new " + functionCall.functionName.toUpperCase() + "()");
                symbolTable.put(id.id, symbol);
                return new VariableDeclarator(id, functionCall);
            }

            if (ctx.getChild(2) instanceof ReactParser.MemberExpressionContext) {
                MemberExpression memberExpression = (MemberExpression) visitMemberExpression((ReactParser.MemberExpressionContext) ctx.getChild(2));
                Symbol symbol = new Symbol("MemberExpression", memberExpression.toString());
                symbolTable.put(id.id, symbol);
                return new VariableDeclarator(id, memberExpression);

            }
            if (ctx.getChild(2) instanceof ReactParser.IdContext) {
                Identifier identifier = (Identifier) visitId((ReactParser.IdContext) ctx.getChild(2));
                if (!symbolTable.isDeclare(identifier.id)) {
                    String errorMessage = "Semantic Error: variable '" + identifier.id + "' is not declare";
                    symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
                }
//                Symbol symbol = new Symbol("Identifier", identifier.id);
//                symbolTable.put(id.id, symbol);
                return new VariableDeclarator(id, identifier);

            }
            if (ctx.getChild(2) instanceof ReactParser.ObjectLiteralContext) {
                ObjectLiteral objectLiteral = (ObjectLiteral) visitObjectLiteral((ReactParser.ObjectLiteralContext) ctx.getChild(2));
                Symbol symbol = new Symbol("ObjectLiteral", "{key:val}");
                symbolTable.put(id.id, symbol);
                return new VariableDeclarator(id, objectLiteral);
            }
            if (ctx.getChild(2) instanceof ReactParser.ArrayContext) {
                Array array = (Array) visitArray((ReactParser.ArrayContext) ctx.getChild(2));
                Symbol symbol = new Symbol("Array", array);
                symbolTable.put(id.id, symbol);
                return new VariableDeclarator(id, array);
            }
            if (ctx.getChild(2) instanceof ReactParser.ArrowFunctionDeclarationContext) {
                ArrowFunction arrowFunction = (ArrowFunction) visitArrowFunctionDeclaration((ReactParser.ArrowFunctionDeclarationContext) ctx.getChild(2));
                Symbol symbol = new Symbol("ArrowFunction", arrowFunction);
                symbolTable.put(id.id, symbol);
                return new VariableDeclarator(id, arrowFunction);
            }
            if (ctx.getChild(2) instanceof ReactParser.AnonymousFunctionDeclarationContext) {
                AnonymousFunction anonymousFunction=(AnonymousFunction) visitAnonymousFunctionDeclaration((ReactParser.AnonymousFunctionDeclarationContext) ctx.getChild(2));
                Symbol symbol = new Symbol("AnonymousFunction", anonymousFunction);
                symbolTable.put(id.id, symbol);
                return new VariableDeclarator(id, anonymousFunction);
            }

            if (ctx.getChild(2) instanceof ReactParser.ExpressionContext){
                return new VariableDeclarator(id, visitExpression((ReactParser.ExpressionContext) ctx.getChild(2)));
            }

        } else {
            Symbol symbol = new Symbol("undefined", "null");
            symbolTable.put(id.id, symbol);
        }
        return new VariableDeclarator(id);
    }

    @Override
    public ASTNode visitVariable_declaration_keywords(ReactParser.Variable_declaration_keywordsContext ctx) {
        return new VariableDeclarationKeyword(ctx.getText());
    }

    @Override
    public ASTNode visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx) {
       // System.out.println("from visitVariableDeclaration------------------"+ctx.getText());
        VariableDeclarationKeyword keyword = (VariableDeclarationKeyword) visitVariable_declaration_keywords(ctx.variable_declaration_keywords());
        VariableDeclaration variableDeclaration = new VariableDeclaration(keyword);
        if (ctx.variableDeclarator() != null) {
            for (ReactParser.VariableDeclaratorContext vdctx : ctx.variableDeclarator()) {
                variableDeclaration.addVariableDeclarator((VariableDeclarator) visitVariableDeclarator(vdctx));
            }
        }
        return variableDeclaration;
    }

    @Override
    public ASTNode visitArgument(ReactParser.ArgumentContext ctx) {

        return new Argument((ASTNode) visit(ctx.getChild(0)));

    }

    @Override
    public ASTNode visitFunctionCall(ReactParser.FunctionCallContext ctx) {
        //functionName()
         String functionName="";
         Boolean isAwait=Boolean.FALSE;
        if(ctx.AWAIT()==null){
            functionName = ctx.getChild(0).getText();//functionName
        }else{
            isAwait=Boolean.TRUE;
            functionName = ctx.getChild(1).getText();//functionName
        }
        if (!symbolTable.isDeclare(functionName)) {
            String errorMessage = "Semantic Error: function '" + functionName + "' is not declare";
            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
        }
        FunctionCall functioncall = new FunctionCall(functionName,isAwait);
        for (ReactParser.ArgumentContext argctx : ctx.argument()) {
            functioncall.addArgument((Argument) visitArgument(argctx));
        }
        return functioncall;

    }

    @Override
    public ASTNode visitStatement(ReactParser.StatementContext ctx) {
        ASTNode value = (ASTNode) visit(ctx.getChild(0));
        return new Statement(value);
    }

    //edit
    //and_or
    @Override
    public Object visitConditions(ReactParser.ConditionsContext ctx) {
        Conditions conditions = new Conditions();
        if (!ctx.condition().isEmpty()) {
            for (ReactParser.ConditionContext condctx : ctx.condition()) {
                conditions.addCondition((Condition) visitCondition(condctx));
            }
        }
        if (!ctx.and_or().isEmpty()) {
            for (int i = 0; i < ctx.and_or().size(); i++) {
                conditions.addAnd_Or(ctx.and_or(i).getText());
            }
        }
        return conditions;
    }

    @Override
    public ASTNode visitReturnStatement(ReactParser.ReturnStatementContext ctx) {
        ASTNode value;
        if (ctx.getChild(1) != ctx.LPAREN()) {
            value = (ASTNode) visit(ctx.getChild(1));
        } else {
            value = (ASTNode) visit(ctx.getChild(2));
        }

        return new ReturnStatement(value);
    }

    @Override
    public ASTNode visitFunctionBody(ReactParser.FunctionBodyContext ctx) {
        FunctionBody functionBody = new FunctionBody();
        if (!ctx.statement().isEmpty()) {
            for (ReactParser.StatementContext stmntctx : ctx.statement()) {
                functionBody.addStatement((Statement) visitStatement(stmntctx));
            }
        }
        if (ctx.returnStatement() != null) {
            functionBody.setReturnStatement((ReturnStatement) visitReturnStatement(ctx.returnStatement()));
        }
        return functionBody;
    }


    @Override
    public ASTNode visitNamedFunctionDeclaration(ReactParser.NamedFunctionDeclarationContext ctx) {
        NamedFunction namedFunction;
        Identifier functionName;
        FunctionBody functionBody;
        Boolean isAsync= Boolean.FALSE;
        if (ctx.ASYNC()!=null) isAsync=Boolean.TRUE;
        functionName = (Identifier) visitId(ctx.id());
        if (symbolTable.containsSymbol(functionName.id)) {
            // Handle the case where a symbol with the same name already exists
            String errorMessage = "Semantic Error: Function '" + functionName.id + "' already exists";
            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
            return new NamedFunction(functionName,isAsync); // Return null or handle the error case as per your requirements
        }

        Symbol symbol = new Symbol("NamedFunction", functionName.id);
        symbolTable.put(functionName.id, symbol);



        namedFunction = new NamedFunction(functionName,isAsync);
        if (!ctx.argument().isEmpty()) {
            symbolTable.arg();
            for (ReactParser.ArgumentContext argCtx : ctx.argument()) {
                namedFunction.addArgument((Argument) visitArgument(argCtx));
            }
            symbolTable.arg();
        }

        symbolTable.enterScope("Function[" + functionName.id + "]");
        functionBody = (FunctionBody) visitFunctionBody(ctx.functionBody());
        namedFunction.setFunctionBody(functionBody);
        return namedFunction;
    }

    @Override
    public ASTNode visitAnonymousFunctionDeclaration(ReactParser.AnonymousFunctionDeclarationContext ctx) {
        int x = new Random().nextInt(100) + 1;
        symbolTable.enterScope("AnonymousFunction[" + x + "]");

        FunctionBody functionBody;
        AnonymousFunction anonymousFunction = new AnonymousFunction();

        if (!ctx.argument().isEmpty()) {
            symbolTable.arg();

            for (ReactParser.ArgumentContext argCtx : ctx.argument()) {
                anonymousFunction.addArgument((Argument) visitArgument(argCtx));
            }
            symbolTable.arg();

        }
        functionBody = (FunctionBody) visitFunctionBody(ctx.functionBody());
        anonymousFunction.setFunctionBody(functionBody);

        return anonymousFunction;
    }

    @Override
    public ASTNode visitArrowFunctionDeclaration(ReactParser.ArrowFunctionDeclarationContext ctx) {
        int x = new Random().nextInt(100) + 1;

        FunctionBody functionBody;

        Boolean isLambdaExpression= Boolean.FALSE;
        if(ctx.LCURLY()==null) {
            isLambdaExpression = Boolean.TRUE;
        }
        ArrowFunction arrowFunction = new ArrowFunction(isLambdaExpression);

        symbolTable.enterScope("ArrowFunction[" + x + "]");
        if (!ctx.argument().isEmpty()) {
            symbolTable.arg();
            for (ReactParser.ArgumentContext argCtx : ctx.argument()) {
                arrowFunction.addArgument((Argument) visitArgument(argCtx));
            }
            symbolTable.arg();
        }
        functionBody = (FunctionBody) visitFunctionBody(ctx.functionBody());
        arrowFunction.setFunctionBody(functionBody);
        return arrowFunction;
    }

    @Override
    public ASTNode visitFunction(ReactParser.FunctionContext ctx) {
        String type;
        ASTNode function;
        if (ctx.namedFunctionDeclaration() != null) {
            type = "NamedFunction";
            function = visitNamedFunctionDeclaration(ctx.namedFunctionDeclaration());
        } else if (ctx.anonymousFunctionDeclaration() != null) {
            type = "AnonymousFunction";
            function = visitAnonymousFunctionDeclaration(ctx.anonymousFunctionDeclaration());
        } else if (ctx.arrowFunctionDeclaration() != null) {
            type = "ArrowFunction";
            function = visitArrowFunctionDeclaration(ctx.arrowFunctionDeclaration());
        } else {
            type = "";
            function = null;
        }
        symbolTable.exitScope();
        return new Function(type, function);
    }

    @Override
    public ASTNode visitUseStateDeclaration(ReactParser.UseStateDeclarationContext ctx) {
        Identifier state = (Identifier) visitId(ctx.id(0));
        Identifier setStateFunction = (Identifier) visitId(ctx.id(1));
        Symbol symbol1 = new Symbol("Identifier", state.id);
        symbolTable.put(state.id, symbol1);
        Symbol symbol2 = new Symbol("Function", setStateFunction.id + "()");
        symbolTable.put(setStateFunction.id, symbol2);
        ASTNode initialValue;
        initialValue = (ASTNode) visit(ctx.getChild(9));
        UseState useState = new UseState(state, setStateFunction, initialValue);
       // System.out.println(useState.toJS());
        return useState;
    }

    @Override
    public ASTNode visitDependencyArray(ReactParser.DependencyArrayContext ctx) {
        DependencyArray dependencyArray = new DependencyArray();
        for (ReactParser.IdContext idCtx : ctx.id()) {
            dependencyArray.addToIdentifierList((Identifier) visitId(idCtx));
        }
        return dependencyArray;
    }

    @Override
    public ASTNode visitUseEffectDeclaration(ReactParser.UseEffectDeclarationContext ctx) {
        UseEffect useEffect;
        DependencyArray dependencyArray =null;
        if(ctx.dependencyArray()!=null){
            dependencyArray = (DependencyArray) visitDependencyArray(ctx.dependencyArray());
        }

        ArrowFunction arrowFunction = (ArrowFunction) visitArrowFunctionDeclaration(ctx.arrowFunctionDeclaration());
        useEffect = new UseEffect(dependencyArray, arrowFunction);

        return useEffect;
    }

    @Override
    public ASTNode visitOperation_element(ReactParser.Operation_elementContext ctx) {
        ASTNode value = (ASTNode) visit(ctx.getChild(0));
        OperatorElement operatorElement = new OperatorElement(value);
        if (value instanceof Identifier) {
            if (!symbolTable.isDeclare(((Identifier) value).id)) {
                String errorMessage = "Semantic Error: variable '" + ((Identifier) value).id + "' is not declare";
                symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
            }
        }
        return operatorElement;
    }

    @Override
    public ASTNode visitCondition(ReactParser.ConditionContext ctx) {
        OperatorElement operatorElement1 = (OperatorElement) visitOperation_element(ctx.operation_element(0));
        OperatorElement operatorElement2 = null;
        String operationConditon = null;
        if (ctx.operation_element().size() > 1) {
            operatorElement2 = (OperatorElement) visitOperation_element(ctx.operation_element(1));
            operationConditon = ctx.operation_condition().getText();
        }
        Condition condition = new Condition(operatorElement1, operationConditon, operatorElement2);
        return condition;
    }

    //edit
    // class + returnVal
    @Override
    public ASTNode visitIf_condition(ReactParser.If_conditionContext ctx) {
        int x = new Random().nextInt(100) + 1;
        symbolTable.enterScope("IfCondition[" + x + "]");
        String breakOrContinue = null;
        ASTNode returnVal = null;
        Conditions conditions = null;

        if (ctx.BREAK() != null) {
            breakOrContinue = "break";
        } else if (ctx.CONTINUE() != null) {
            breakOrContinue = "continue";
        }

        if (ctx.returnStatement() != null) {
            returnVal = visitReturnStatement(ctx.returnStatement());
        }


        if (ctx.conditions() != null) {
            conditions = (Conditions) visitConditions(ctx.conditions());
        }

        If ifCondition = new If(breakOrContinue, returnVal, conditions);


        if (!ctx.statement().isEmpty()) {
            for (ReactParser.StatementContext stmntCtx : ctx.statement()) {
                ifCondition.addStatement((Statement) visitStatement(stmntCtx));
            }
        }

        if (!ctx.elseIf_condition().isEmpty()) {
            for (ReactParser.ElseIf_conditionContext elseIfCtx : ctx.elseIf_condition()) {
                ifCondition.addElseIf((ElseIf) visitElseIf_condition(elseIfCtx));
            }
        }
        if (ctx.else_condition() != null) {
            ifCondition.setElse((Else) visitElse_condition(ctx.else_condition()));
        }

        symbolTable.exitScope();
        return ifCondition;
    }

    //edit
    // calss + returnVal;
    @Override
    public ASTNode visitElseIf_condition(ReactParser.ElseIf_conditionContext ctx) {
        int x = new Random().nextInt(100) + 1;
        symbolTable.enterScope("ElseIfCondition[" + x + "]");
        String breakOrContinue = null;
        ASTNode returnVal = null;
        Conditions conditions = null;

        if (ctx.BREAK() != null) {
            breakOrContinue = "break";
        } else if (ctx.CONTINUE() != null) {
            breakOrContinue = "continue";
        }
        if (ctx.returnStatement() != null) {
            returnVal = visitReturnStatement(ctx.returnStatement());
        }


        if (ctx.conditions() != null) {
            conditions = (Conditions) visitConditions(ctx.conditions());
        }
        ElseIf elseIfCondition = new ElseIf(breakOrContinue, returnVal, conditions);

        if (!ctx.statement().isEmpty()) {
            for (ReactParser.StatementContext stmntCtx : ctx.statement()) {
                elseIfCondition.addStatement((Statement) visitStatement(stmntCtx));
            }
        }
        symbolTable.exitScope();
        return elseIfCondition;
    }

    //edit
    //calss + returnVal
    @Override
    public ASTNode visitElse_condition(ReactParser.Else_conditionContext ctx) {
        int x = new Random().nextInt(100) + 1;
        symbolTable.enterScope("ElseCondition[" + x + "]");
        String breakOrContinue = null;
        ASTNode returnVal = null;

        if (ctx.BREAK() != null) {
            breakOrContinue = "break";
        } else if (ctx.CONTINUE() != null) {
            breakOrContinue = "continue";
        }
        if (ctx.returnStatement() != null) {
            returnVal = visitReturnStatement(ctx.returnStatement());
        }
        Else elseCondition = new Else(breakOrContinue, returnVal);


        if (!ctx.statement().isEmpty()) {
            for (ReactParser.StatementContext stmntCtx : ctx.statement()) {
                elseCondition.addStatement((Statement) visitStatement(stmntCtx));
            }
        }
        symbolTable.exitScope();
        return elseCondition;
    }

    @Override
    public ASTNode visitTenaryExpression(ReactParser.TenaryExpressionContext ctx) {
        TernaryExpression ternaryExpression;
        if (ctx.tenaryExpression() != null) {
            ternaryExpression = new TernaryExpression((TernaryExpression) visitTenaryExpression(ctx.tenaryExpression()));
        } else {
            ternaryExpression = new TernaryExpression(null);

        }

        if (ctx.conditions() != null) {
            ternaryExpression.setConditions((Conditions) visitConditions(ctx.conditions()));
        }
        if (!ctx.statement().isEmpty()) {
            for (ReactParser.StatementContext stmntCtx : ctx.statement()) {
                ternaryExpression.addStatement((Statement) visitStatement(stmntCtx));
            }
        }
        return ternaryExpression;
    }

    //edit
    //class + returnVal
    @Override
    public Object visitWhile(ReactParser.WhileContext ctx) {

        int x = new Random().nextInt(100) + 1;
        symbolTable.enterScope("WhileLoop[" + x + "]");

        String breakOrContinue = null;
        ASTNode returnVal = null;
        Conditions conditions = null;

        if (ctx.BREAK() != null) {
            breakOrContinue = "break";
        } else if (ctx.CONTINUE() != null) {
            breakOrContinue = "continue";
        }

        if (ctx.returnStatement() != null) {
            returnVal = visitReturnStatement(ctx.returnStatement());
        }

        if (ctx.conditions() != null) {
            conditions = (Conditions) visitConditions(ctx.conditions());
        }

        WhileLoop whileLoop = new WhileLoop(breakOrContinue, returnVal, conditions);

        if (!ctx.statement().isEmpty()) {
            for (ReactParser.StatementContext stmntCtx : ctx.statement()) {
                whileLoop.addStatement((Statement) visitStatement(stmntCtx));
            }
        }
        symbolTable.exitScope();
        return whileLoop;
    }
    //edit
    //class + returnVal
    @Override
    public ASTNode visitDo_while(ReactParser.Do_whileContext ctx) {
        int x = new Random().nextInt(100) + 1;
        symbolTable.enterScope("DoWhileLoop[" + x + "]");
        String breakOrContinue = null;
        ASTNode returnVal = null;
        Conditions conditions = null;


        if (ctx.BREAK() != null) {
            breakOrContinue = "break";
        } else if (ctx.CONTINUE() != null) {
            breakOrContinue = "continue";
        }

        if (ctx.returnStatement() != null) {
            returnVal = visitReturnStatement(ctx.returnStatement());
        }

        if (ctx.conditions() != null) {
            conditions = (Conditions) visitConditions(ctx.conditions());
        }

        DoWhileLoop doWhileLoop = new DoWhileLoop(breakOrContinue, returnVal, conditions);

        if (!ctx.statement().isEmpty()) {
            for (ReactParser.StatementContext stmntCtx : ctx.statement()) {
                doWhileLoop.addStatement((Statement) visitStatement(stmntCtx));
            }
        }
        symbolTable.exitScope();
        return doWhileLoop;
    }

    //Edit
    //class + returnVal
    @Override
    public ASTNode visitFor_loop(ReactParser.For_loopContext ctx) {
        int x = new Random().nextInt(100) + 1;
        symbolTable.enterScope("ForLoop[" + x + "]");
        String breakOrContinue = null;
        ASTNode returnVal = null;
        Conditions conditions = null;
        ASTNode expression = null;
        ASTNode variableDeclaration = null;

        if (ctx.BREAK() != null) {
            breakOrContinue = "break";
        } else if (ctx.CONTINUE() != null) {
            breakOrContinue = "continue";
        }

        if (ctx.returnStatement() != null) {
            returnVal = visitReturnStatement(ctx.returnStatement());
        }

        if (ctx.variableDeclaration() != null) {
            variableDeclaration = visitVariableDeclaration(ctx.variableDeclaration());
        } else if (ctx.variableDeclarator() != null) {
            variableDeclaration = visitVariableDeclarator(ctx.variableDeclarator());
        }


        if (ctx.expression() != null) {
            expression =  visitExpression(ctx.expression());
        }

        if (ctx.conditions() != null) {
            conditions = (Conditions) visitConditions(ctx.conditions());
        }
        ForLoop forLoop = new ForLoop(breakOrContinue, returnVal, variableDeclaration, expression, conditions);


        if (!ctx.statement().isEmpty()) {
            for (ReactParser.StatementContext stmntCtx : ctx.statement()) {
                forLoop.addStatement((Statement) visitStatement(stmntCtx));
            }
        }
        symbolTable.exitScope();
        return forLoop;
    }

    @Override
    public ASTNode visitThrowEx(ReactParser.ThrowExContext ctx) {
        ThrowExpression throwExpression = null;
        if (ctx.statement() != null) {
            throwExpression = new ThrowExpression(visitStatement(ctx.statement()));
        } else {
            throwExpression = new ThrowExpression((ASTNode) visitObject(ctx.object()));

        }
        return throwExpression;
    }

    @Override
    public ASTNode visitObject(ReactParser.ObjectContext ctx) {
        FunctionCall functionCall = (FunctionCall) visitFunctionCall(ctx.functionCall());
        objectCalss objectCalss = new objectCalss(functionCall.functionName);
        return objectCalss;
    }


    //Edit
    //class + returnVal
    @Override
    public ASTNode visitTry_expression(ReactParser.Try_expressionContext ctx) {
        int x = new Random().nextInt(100) + 1;
        symbolTable.enterScope("TryExpression[" + x + "]");

        String breakOrContinue = null;
        ASTNode returnVal = null;
        ThrowExpression throwEx = null;
        FinallyExpression finallyExpression = null;
        CatchExpression catchExpression = null;

        if (ctx.BREAK() != null) {
            breakOrContinue = "break";
        } else if (ctx.CONTINUE() != null) {
            breakOrContinue = "continue";
        }

        if (ctx.returnStatement() != null) {
            returnVal = visitReturnStatement(ctx.returnStatement());
        }

        if (ctx.throwEx() != null) {
            throwEx = (ThrowExpression) visitThrowEx(ctx.throwEx());
        }

        if (ctx.catch_expression() != null) {
            symbolTable.enterScope("catchExpression[" + x + "]");
            catchExpression = (CatchExpression) visitCatch_expression(ctx.catch_expression());
            symbolTable.exitScope();
        }


        if (ctx.finally_expression() != null) {
            symbolTable.enterScope("finallyExpression[" + x + "]");
            finallyExpression = (FinallyExpression) visitFinally_expression(ctx.finally_expression());
            symbolTable.exitScope();
        }


        TryExpression tryExpression = new TryExpression(breakOrContinue, returnVal, throwEx, finallyExpression, catchExpression);


        if (!ctx.statement().isEmpty()) {
            for (ReactParser.StatementContext stmntCtx : ctx.statement()) {
                tryExpression.addStatement((Statement) visitStatement(stmntCtx));
            }
        }
        symbolTable.exitScope();
        return tryExpression;
    }

    // catch(arg){ statment }
    //Edit
    //class + returnVal
    @Override
    public ASTNode visitCatch_expression(ReactParser.Catch_expressionContext ctx) {
        String breakOrContinue = null;

        ASTNode returnVal = null;

        Identifier argument = null;


        if (ctx.BREAK() != null) {
            breakOrContinue = "break";
        } else if (ctx.CONTINUE() != null) {
            breakOrContinue = "continue";
        }

        if (ctx.returnStatement() != null) {
            returnVal = visitReturnStatement(ctx.returnStatement());
        }

        if (ctx.id() != null) {
            argument = (Identifier) visitId(ctx.id());

        }

        CatchExpression catchExpression = new CatchExpression(breakOrContinue, argument, returnVal);

        if (!ctx.statement().isEmpty()) {
            for (ReactParser.StatementContext stmntCtx : ctx.statement()) {

                catchExpression.addStatement((Statement) visitStatement(stmntCtx));

            }
        }

        return catchExpression;
    }

    // finaly{statment}
    //Edit
    //class + returnVal
    @Override
    public ASTNode visitFinally_expression(ReactParser.Finally_expressionContext ctx) {
        String breakOrContinue = null;

        ASTNode returnVal = null;


        if (ctx.BREAK() != null) {
            breakOrContinue = "break";
        } else if (ctx.CONTINUE() != null) {
            breakOrContinue = "continue";
        }

        if (ctx.returnStatement() != null) {
            returnVal = visitReturnStatement(ctx.returnStatement());
        }

        FinallyExpression finallyExpression = new FinallyExpression(breakOrContinue, returnVal);

        if (!ctx.statement().isEmpty()) {
            for (ReactParser.StatementContext stmntCtx : ctx.statement()) {

                finallyExpression.addStatement((Statement) visitStatement(stmntCtx));

            }
        }

        return finallyExpression;
    }


    @Override
    public ASTNode visitExportSpecifier(ReactParser.ExportSpecifierContext ctx) {
        ExportSpecifier exportSpecifier = new ExportSpecifier();
        if (ctx.AS() != null) {//2
            exportSpecifier.setLocal(ctx.id(0).getText());
            exportSpecifier.setExported(ctx.getChild(2).getText());
        } else {
            exportSpecifier.setLocal(ctx.id(0).getText());
            exportSpecifier.setExported(exportSpecifier.getLocal());
        }

        return exportSpecifier;
    }

    @Override
    public ASTNode visitExportAll(ReactParser.ExportAllContext ctx) {
        ExportSpecifier exportSpecifier = new ExportSpecifier();
        String source = ctx.getChild(ctx.children.size() - 1).getText();
        if (ctx.AS() != null) {
            exportSpecifier.setExported(ctx.getChild(3).getText());
            exportSpecifier.setLocal("*");
        } else {
            exportSpecifier.setExported("*");
            exportSpecifier.setLocal("*");
        }
        return exportSpecifier;
    }

    @Override
    public ASTNode visitExportDefault(ReactParser.ExportDefaultContext ctx) {
        ExportDefault exportDefault = new ExportDefault();
        exportDefault.setExported((ASTNode) visit(ctx.getChild(1)));
        return exportDefault;
    }

    @Override
    public ASTNode visitVariableDeclarationExport(ReactParser.VariableDeclarationExportContext ctx) {
        return new VariableDeclarationExport((VariableDeclaration) visit(ctx.variableDeclaration()));
    }

    @Override
    public ASTNode visitSpecifiedExport(ReactParser.SpecifiedExportContext ctx) {
        SpecifiedExport specifiedExport;

        if (Objects.equals(ctx.getChild(ctx.getChildCount() - 1).getText(), "from")){
            String source=ctx.getChild(ctx.getChildCount()).getText();
            specifiedExport = new SpecifiedExport(source);
        }else{
            specifiedExport = new SpecifiedExport();
        }

        for (ReactParser.ExportSpecifierContext esCtx : ctx.exportSpecifier()) {
            specifiedExport.addExportSpecifier((ExportSpecifier) visitExportSpecifier(esCtx));
        }
        return specifiedExport;
    }

    @Override
    public ASTNode visitNamedFunctionExport(ReactParser.NamedFunctionExportContext ctx) {
        return new NamedFunctionExport((NamedFunction) visitNamedFunctionDeclaration(ctx.namedFunctionDeclaration()));
    }

    @Override
    public ASTNode visitExportStatement(ReactParser.ExportStatementContext ctx) {
        return new ExportStatement((ASTNode) visit(ctx.getChild(0)));
    }

    @Override
    public ASTNode visitImportSpecifier(ReactParser.ImportSpecifierContext ctx) {
        String local, imported;
        if (ctx.AS() != null) {
            local = ctx.getChild(2).getText();
            imported = ctx.getChild(0).getText();
        } else {
            local = imported = ctx.getChild(0).getText();
        }
        if (symbolTable.containsSymbol(local)) {
            // Handle the case where a symbol with the same name already exists
            String errorMessage = "Semantic Error: Import '" + local + "' already exists";
            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
            return new ImportSpecifier(local, imported);
        }
        Symbol symbol = new Symbol("Import", local);
        symbolTable.put(local, symbol);
        return new ImportSpecifier(local, imported);
    }

    @Override
    public ASTNode visitImportStatement(ReactParser.ImportStatementContext ctx) {
        ImportStatement importStatement;
        if (ctx.STAR() != null) {//import all
            importStatement = new ImportStatement("Import All");
            ImportSpecifier importSpecifier = new ImportSpecifier(ctx.id().getText(), "*");
            importStatement.addImportSpecifier(importSpecifier);
        } else if (ctx.importSpecifier().size() == 1 && ctx.LCURLY() == null) {//default
            importStatement = new ImportStatement("Default import");
            importStatement.addImportSpecifier((ImportSpecifier) visitImportSpecifier(ctx.importSpecifier(0)));
        } else if (ctx.getChild(1) instanceof ReactParser.ImportSpecifierContext && ctx.importSpecifier().size() > 1) {//default and none-default
            importStatement = new ImportStatement("Default and non-default import");
            for (ReactParser.ImportSpecifierContext importSpecifierContext : ctx.importSpecifier()) {
                importStatement.addImportSpecifier((ImportSpecifier) visitImportSpecifier(importSpecifierContext));
            }
        } else {//non-default import
            importStatement = new ImportStatement("Non-default import");
            for (ReactParser.ImportSpecifierContext importSpecifierContext : ctx.importSpecifier()) {
                importStatement.addImportSpecifier((ImportSpecifier) visitImportSpecifier(importSpecifierContext));
            }
        }
        //get the source if any
        if (ctx.FROM() != null) {
            importStatement.setSource(ctx.getChild(ctx.children.size() - 1).getText());

        }
        return importStatement;
    }


    @Override
    public ASTNode visitComponent_return_statment(ReactParser.Component_return_statmentContext ctx) {
        if (ctx.getChild(1) != ctx.LPAREN())
            return new ComponentReturnStatement((ASTNode) visit(ctx.getChild(1)));
        return new ComponentReturnStatement((ASTNode) visit(ctx.getChild(2)));

    }

    @Override
    public Object visitComponentFunctionBody(ReactParser.ComponentFunctionBodyContext ctx) {
        ComponentFunctionBody componentFunctionBody = new ComponentFunctionBody();
        for (ReactParser.StatementContext stmntCtxt : ctx.statement()) {
            componentFunctionBody.addStatement((Statement) visitStatement(stmntCtxt));
        }
        componentFunctionBody.setComponentReturnStatement((ComponentReturnStatement) visitComponent_return_statment(ctx.component_return_statment()));
        return componentFunctionBody;
    }


    @Override
    public ASTNode visitArrowComponentDeclaration(ReactParser.ArrowComponentDeclarationContext ctx) {
        Identifier componentName = (Identifier) visit(ctx.getChild(1));
        ComponentFunctionBody componentFunctionBody = null;
        if (symbolTable.containsSymbol(componentName.id)) {
            // Handle the case where a symbol with the same name already exists
            String errorMessage = "Semantic Error: ComponentName '" + componentName.id + "' already exists";
            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
            return new NamedComponentDeclaration(componentName, componentFunctionBody);
        }
        Symbol symbol = new Symbol("ComponentName", componentName.id);
        symbolTable.put(componentName.id, symbol);
        symbolTable.enterScope("Component[" + componentName.id + "]");
        componentFunctionBody = (ComponentFunctionBody) visitComponentFunctionBody(ctx.componentFunctionBody());
        if (ctx.props() != null) {
            Props props = (Props) visit(ctx.props());
            return new NamedComponentDeclaration(componentName, props, componentFunctionBody);
        }
        symbolTable.exitScope();
        return new ArrowComponentDeclaration(componentName, componentFunctionBody);
    }


    @Override
    public ASTNode visitNamedComponentDeclaration(ReactParser.NamedComponentDeclarationContext ctx) {
        Identifier componentName = (Identifier) visit(ctx.getChild(1));
        ComponentFunctionBody componentFunctionBody = null;
        if (symbolTable.containsSymbol(componentName.id)) {
            String errorMessage = "Semantic Error: ComponentName '" + componentName.id + "' already exists";
            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
            return new NamedComponentDeclaration(componentName, componentFunctionBody);
        }
        Symbol symbol = new Symbol("ComponentName", componentName.id);
        symbolTable.put(componentName.id, symbol);
        symbolTable.enterScope("Component[" + componentName.id + "]");
        componentFunctionBody = (ComponentFunctionBody) visitComponentFunctionBody(ctx.componentFunctionBody());
        if (ctx.props() != null) {
            Props props = (Props) visit(ctx.props());
            return new NamedComponentDeclaration(componentName, props, componentFunctionBody);
        }
        symbolTable.exitScope();
        return new NamedComponentDeclaration(componentName, componentFunctionBody);
    }

    @Override
    public ASTNode visitFunctionalComponent(ReactParser.FunctionalComponentContext ctx) {
        return new FunctionalComponent((ASTNode) visit(ctx.getChild(0)));
    }

    @Override
    public Object visitEventAttribute(ReactParser.EventAttributeContext ctx) {
        String event=ctx.getChild(0).getText();
        String type;
        if (ctx.getChild(3) instanceof ReactParser.MemberExpressionContext){
            type="expression";
        }else if(Objects.equals(ctx.getChild(5).getText(), "=>")) {
            type="arrow";
        }else{
            type="lambda";
        }

        if (ctx.memberExpression() != null) {
            return new EventAttribute((MemberExpression) visitMemberExpression(ctx.memberExpression()),type,event);
        }
        return null;
    }
}






















