parser grammar ReactParser;
options {tokenVocab=ReactLexer;}
program: (statement)* (( functionalComponent (statement)*  exportDefault SEMI*)|( EXPORT_DEFAULT functionalComponent (statement)*   SEMI*)) ;
//   program:((
//             statement |objectLiteral|
//             array|useStateDeclaration|
//             useEffectDeclaration|jsx)(SEMI)*)*;
//

        id:IDENTIFIER|EVENT_ATTRIBUTE|HTML_ATTRIBUTE_NAME|USESTATE|USEEFFECT|USEREF;

//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//Start_Semantic_rules
        hooks:(useStateDeclaration|
                             useEffectDeclaration|
                             useRefDeclaration)SEMI?;

        if_condition_semantic:IF LPAREN NOT* conditions RPAREN LCURLY (hooks+ ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? hooks+) returnStatement? RCURLY elseIf_condition* else_condition?;//
        elseIf_condition_semantic:ELSEIF LPAREN NOT* conditions RPAREN LCURLY (hooks+ ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? hooks+) returnStatement? RCURLY;//
        else_condition_semantic:ELSE  LCURLY (hooks+ ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? hooks+) returnStatement? RCURLY;//
        //condition?hooks1:
        tenaryExpression_semantic:NOT* conditions  QUESITIONMARK (LPAREN hooks RPAREN|hooks) COLON ((LPAREN hooks|tenaryExpression RPAREN)|(hooks|tenaryExpression));//
        while_semantic:WHILE LPAREN NOT* conditions RPAREN LCURLY (hooks+ ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? hooks+) returnStatement? RCURLY;//
        do_while_semantic:DO LCURLY (hooks+ ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? hooks+) returnStatement? RCURLY WHILE LPAREN NOT? conditions RPAREN;//
        for_loop_semantic:FOR  LPAREN (variableDeclaration|variableDeclarator)? SEMI conditions SEMI expression?  RPAREN LCURLY (hooks+ ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? hooks+)  returnStatement? RCURLY;//
        try_expression_semantic:TRY LCURLY (hooks+ ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? hooks+) throwEx? returnStatement? RCURLY (catch_expression? finally_expression?) SEMI*;//
        catch_expression_semantic: CATCH (LPAREN id RPAREN)? LCURLY (hooks+ ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? hooks+)  returnStatement? RCURLY;//
        finally_expression_semantic:FINALLY LCURLY (hooks+ ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? hooks+)  returnStatement? RCURLY;//
        throwEx_semantic:THROW(object|hooks) SEMI*;//

        semantic_rule:if_condition_semantic|
                      elseIf_condition_semantic|
                      else_condition_semantic|
                      tenaryExpression_semantic|
                      while_semantic|
                      do_while_semantic|
                      for_loop_semantic|
                      try_expression_semantic|
                      catch_expression_semantic|
                      finally_expression_semantic|
                      throwEx_semantic;
//End_Semantic_rules
//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        comment:SINGLE_LINE_COMMENT|
                COMMENT_BLOCK;

        operator: EQUAL|
                  PLUS_EQUALS|
                  MINUS_EQUALS|
                  TIMES_EQUALS|
                  DIVIDE_EQUALS|
                  MODULO_EQUALS|
                  PLUS|
                  MINUS|
                  STAR|
                  DIVIDE|
                  MODULO|
                  PLUS_ONE|
                  MINUS_ONE;

         operation_condition:EQUAL_TO|//
                               NOT_EQUAL|
                               GREATER_THAN|
                               LESS_THAN|
                               GREATER_THAN_OR_EQUAL|
                               LESS_THAN_OR_EQUAL;

        operation_element:(jsx|literal|objectLiteral|
                           id|pureReactElement|array|
                           functionCall|expression);

        condition:operation_element (operation_condition operation_element)?;

        conditions:condition (and_or condition)*;

        and_or:AND|OR; //NEW
        if_condition:IF LPAREN NOT* conditions RPAREN LCURLY (statement* ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? statement*) returnStatement? RCURLY elseIf_condition* else_condition?;//
        elseIf_condition:ELSEIF LPAREN NOT* conditions RPAREN LCURLY (statement* ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? statement*) returnStatement? RCURLY;//
        else_condition:ELSE  LCURLY (statement* ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? statement*) returnStatement? RCURLY;//
        //condition?statement1:
        tenaryExpression:NOT* conditions  QUESITIONMARK (LPAREN statement RPAREN|statement) COLON ((LPAREN statement|tenaryExpression RPAREN)|(statement|tenaryExpression));//
        while:WHILE LPAREN NOT* conditions RPAREN LCURLY (statement* ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? statement*) returnStatement? RCURLY;//
        do_while:DO LCURLY (statement* ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? statement*) returnStatement? RCURLY WHILE LPAREN NOT? conditions RPAREN;//
        for_loop:FOR  LPAREN (variableDeclaration|variableDeclarator)? SEMI conditions SEMI expression?  RPAREN LCURLY (statement* ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? statement*)  returnStatement? RCURLY;//
        try_expression:TRY LCURLY (statement* ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? statement*) throwEx? returnStatement? RCURLY (catch_expression? finally_expression?) SEMI*;//
        catch_expression: CATCH (LPAREN id RPAREN)? LCURLY (statement* ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? statement*)  returnStatement? RCURLY;//
        finally_expression:FINALLY LCURLY (statement* ((BREAK|CONTINUE)SEMI?)? |((BREAK|CONTINUE)SEMI?)? statement*)  returnStatement? RCURLY;//
        throwEx:(THROW object|statement) SEMI*;//

        //object declaration stuff
        // object syntax:     {key:value,...}
        objectLiteral: LCURLY  comment* (property comment*( COMMA comment* property comment*)*COMMA?)? comment*  RCURLY;
        // property of an     (eg,object key:value)
        property: (id|ONCLICK)  (COLON  objectExpression)?;

        objectExpression:   expression|
                            array|
                            objectLiteral|
                            arrowFunctionDeclaration;
        ///end of object declaration stuff


        literal:Integer|Float|Boolean|Undefined|Null|String;
         
        unaryExpression: literal |
                            id |
                            expression|
                            operator  unaryExpression;
         // valid js expression (eg,5+W)
        expression:memberExpression|literal | id | jsx | LPAREN expression RPAREN|
                     expression  operator  expression|expression  operator;
        
        memberExpression:  ((id|array|functionCall) DOT (memberExpression))|(id LSBRACKET (memberExpression) RSBRACKET)|(functionCall|array|literal|id);

        variable_declaration_keywords:CONST |LET |VAR;

        // varaible declaration with/without initialization
        variableDeclaration:variable_declaration_keywords (variableDeclarator (COMMA variableDeclarator)*) ;

        variableDeclarator:id (EQUAL (literal|objectLiteral|array|object|expression|id|memberExpression|anonymousFunctionDeclaration|arrowFunctionDeclaration))?;
         
        array: LSBRACKET comment* (arrayElement comment* (COMMA comment* arrayElement comment*)*(COMMA)?)? comment* RSBRACKET;

        arrayElement:id | literal|objectLiteral|pureReactElement|jsx|function|array;

        object:NEW functionCall;


        //// FUNCTIONS

        // arguments passed when declaraing/invoking a function function(arg1,arg2)
         
        argument:objectLiteral|function|statement;
        //function body (valid things you can write inside the function body)
        functionBody: (statement)* returnStatement? ;
         
        statement: (semantic_rule|if_condition|variableDeclaration|tenaryExpression | namedFunctionDeclaration|
                    functionCall | useEffectDeclaration |useStateDeclaration
                    |useRefDeclaration|pureReactElement|jsxExpression|
                    while|do_while|for_loop|expression|unaryExpression|try_expression|variableDeclarator|conditions|comment
                    |importStatement|function|exportStatement
                    ) (SEMI)*;




        returnStatement: RETURN (
                                (LPAREN
                                (jsx | expression | literal | objectLiteral |unaryExpression| id | pureReactElement | array)
                                 RPAREN) |
                                (jsx | expression | literal | objectLiteral | id |unaryExpression| pureReactElement | array)
                                )? SEMI*;

        //end of function body

        // regular function declaration (eg,function functionName(arguments){body})
        namedFunctionDeclaration:ASYNC? FUNCTION id LPAREN (argument(COMMA  argument)*)? RPAREN LCURLY functionBody RCURLY;
        //arrow function:   ()=>{}argumentList

        arrowFunctionDeclaration: LPAREN (argument(COMMA  argument)*)? RPAREN
                ARROW ((LCURLY functionBody RCURLY )|(LPAREN functionBody RPAREN)|(functionBody));

        //regular anounymous function:     function(){}
        anonymousFunctionDeclaration:FUNCTION LPAREN (argument(COMMA  argument)*)? RPAREN LCURLY functionBody RCURLY;
        //any function
        function:arrowFunctionDeclaration|namedFunctionDeclaration|anonymousFunctionDeclaration;
        // function call console.log()
         
        functionCall:AWAIT? (id|ONCLICK) ( LPAREN ( argument(COMMA  argument)* )? RPAREN ) ;
        ////END OF FUNCTIONS


        ///EXPORT
         

        exportSpecifier:id (AS (id|String) )?;

        exportStatement:( namedExport|exportAll) SEMI?;
        //export default const s=()=>{}
        exportDefault:EXPORT_DEFAULT (id|literal|objectLiteral|function|variableDeclaration);

        namedExport:  EXPORT variableDeclaration #variableDeclarationExport
                    | EXPORT LCURLY ( exportSpecifier (COMMA exportSpecifier)*  RCURLY  (FROM String)?)#specifiedExport
                    | EXPORT namedFunctionDeclaration #namedFunctionExport;

        exportAll:EXPORT STAR (AS (id|String) )? (FROM String);


        ///END of EXPORT

        // IMPORT
        moduleImport:(IMPORT String);
        normalImport:IMPORT  ((STAR AS id) (FROM String)) #wildcard_import
                    |IMPORT ((LCURLY (importSpecifier (COMMA importSpecifier)* ) RCURLY ) (FROM String))#destructured_import
                    |IMPORT ( importSpecifier (COMMA(LCURLY (importSpecifier ( COMMA importSpecifier )*) RCURLY)) ) (FROM String) #default_and_named_import
                    |IMPORT (importSpecifier (FROM String)) #default_import
                     ;
        importStatement: normalImport | moduleImport ;

        importSpecifier:(id) (AS id)?;
        ///END of IMPORT

        ////REACT STUFF
        jsx:normalJsxElement|selfClosingElement|jsxFragment;
        //<id attribute>
        openTag:LESS_THAN id(DOT id)* (jsxAttribute)* GREATER_THAN;
        //</ id >
        closeTag:LESS_THAN DIVIDE id(DOT id)* GREATER_THAN;
        //</id attribute>                                                                     `
        selfClosingElement:LESS_THAN  id(DOT id)*  jsxAttribute* DIVIDE GREATER_THAN;
        //{((functionCall|expression|unaryExpression|objectLiteral)*|(function)?|jsxExpression*)}
        jsxExpression: LCURLY ( (functionCall|tenaryExpression|expression|unaryExpression|objectLiteral)?|(function)?|spreadOperation|jsxExpression?) RCURLY ;
        //<html a> (jsx|jsxExp|id)* </html>
        normalJsxElement:(openTag) (jsx|jsxExpression|statement)* (closeTag);
        //<>(jsx|jsxExpression|id)*<>
        jsxFragment:(LESS_THAN  GREATER_THAN ) (jsx|jsxExpression|statement)*  (LESS_THAN DIVIDE GREATER_THAN);//<></>

        //{...f()} // id // id=x
        jsxAttribute:(LCURLY  spreadOperation RCURLY) #jsxSpreadAttribute
                   |(EVENT_ATTRIBUTE EQUAL LCURLY ((LPAREN RPAREN ARROW  (memberExpression |LCURLY memberExpression RCURLY))|(memberExpression)) RCURLY) #eventAttribute
                    |(  HTML_ATTRIBUTE_NAME (EQUAL (literal |jsxExpression ))? )#jsxIdentifier;
        //...f(){} //...x//...a+c
        spreadOperation:DOT DOT DOT (id|literal|array|function|functionCall);

        //const [a,b]=useState(id)
        useStateDeclaration:CONST LSBRACKET id COMMA id RSBRACKET EQUAL USESTATE LPAREN (id|literal|objectLiteral|expression) RPAREN ;
        //const a=useRef(q)
        useRefDeclaration:CONST  id  EQUAL USEREF LPAREN (id|literal|objectLiteral|expression) RPAREN ;
        //useEffect(()=>{}),[a,c]
        useEffectDeclaration:USEEFFECT LPAREN (anonymousFunctionDeclaration|arrowFunctionDeclaration)  (COMMA dependencyArray )? RPAREN;
        //[a,b,c]
        dependencyArray:(LSBRACKET id (COMMA id)* RSBRACKET);

        // valid values that can be passed to createReactElement() or a functional component as an argument [null,object,variablename]
        props:objectLiteral |id|Null ;
        //createElement("a",null,a)
        pureReactElement: CREATEELEMENT LPAREN expression COMMA props (COMMA (literal|id|array|pureReactElement|jsx|spreadOperation))* RPAREN ; //TODO

        component_return_statment:  RETURN ( (LPAREN( jsx |Null)RPAREN)| ( jsx |Null)) SEMI* ;
            //PROGRAM

         functionalComponent: ( arrowComponentDeclaration |namedComponentDeclaration)  SEMI*;

         arrowComponentDeclaration:CONST id EQUAL LPAREN (props)? RPAREN ARROW ((LCURLY componentFunctionBody RCURLY )|componentFunctionBody);
         namedComponentDeclaration: FUNCTION id LPAREN (props)? RPAREN LCURLY componentFunctionBody RCURLY ;

         componentFunctionBody: (statement)* component_return_statment;
        ////END OF REACT STUFF
