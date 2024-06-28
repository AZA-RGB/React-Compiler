// Generated from /home/elyas/Downloads/ReactCompiler1/React - Copy/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactParser}.
 */
public interface ReactParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(ReactParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(ReactParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(ReactParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(ReactParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(ReactParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(ReactParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#operation_condition}.
	 * @param ctx the parse tree
	 */
	void enterOperation_condition(ReactParser.Operation_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#operation_condition}.
	 * @param ctx the parse tree
	 */
	void exitOperation_condition(ReactParser.Operation_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#operation_element}.
	 * @param ctx the parse tree
	 */
	void enterOperation_element(ReactParser.Operation_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#operation_element}.
	 * @param ctx the parse tree
	 */
	void exitOperation_element(ReactParser.Operation_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ReactParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ReactParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(ReactParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(ReactParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(ReactParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(ReactParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#elseIf_condition}.
	 * @param ctx the parse tree
	 */
	void enterElseIf_condition(ReactParser.ElseIf_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#elseIf_condition}.
	 * @param ctx the parse tree
	 */
	void exitElseIf_condition(ReactParser.ElseIf_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#else_condition}.
	 * @param ctx the parse tree
	 */
	void enterElse_condition(ReactParser.Else_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#else_condition}.
	 * @param ctx the parse tree
	 */
	void exitElse_condition(ReactParser.Else_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#tenaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTenaryExpression(ReactParser.TenaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#tenaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTenaryExpression(ReactParser.TenaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ReactParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ReactParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(ReactParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(ReactParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(ReactParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(ReactParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#try_expression}.
	 * @param ctx the parse tree
	 */
	void enterTry_expression(ReactParser.Try_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#try_expression}.
	 * @param ctx the parse tree
	 */
	void exitTry_expression(ReactParser.Try_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#catch_expression}.
	 * @param ctx the parse tree
	 */
	void enterCatch_expression(ReactParser.Catch_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#catch_expression}.
	 * @param ctx the parse tree
	 */
	void exitCatch_expression(ReactParser.Catch_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#finally_expression}.
	 * @param ctx the parse tree
	 */
	void enterFinally_expression(ReactParser.Finally_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#finally_expression}.
	 * @param ctx the parse tree
	 */
	void exitFinally_expression(ReactParser.Finally_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#throwEx}.
	 * @param ctx the parse tree
	 */
	void enterThrowEx(ReactParser.ThrowExContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#throwEx}.
	 * @param ctx the parse tree
	 */
	void exitThrowEx(ReactParser.ThrowExContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(ReactParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(ReactParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ReactParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ReactParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#objectExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpression(ReactParser.ObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#objectExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpression(ReactParser.ObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ReactParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ReactParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ReactParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ReactParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#memberExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpression(ReactParser.MemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#memberExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpression(ReactParser.MemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variable_declaration_keywords}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_keywords(ReactParser.Variable_declaration_keywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variable_declaration_keywords}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_keywords(ReactParser.Variable_declaration_keywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(ReactParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(ReactParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ReactParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ReactParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(ReactParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(ReactParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ReactParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ReactParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(ReactParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(ReactParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ReactParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ReactParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ReactParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ReactParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#namedFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamedFunctionDeclaration(ReactParser.NamedFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#namedFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamedFunctionDeclaration(ReactParser.NamedFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrowFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionDeclaration(ReactParser.ArrowFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrowFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionDeclaration(ReactParser.ArrowFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#anonymousFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunctionDeclaration(ReactParser.AnonymousFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#anonymousFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunctionDeclaration(ReactParser.AnonymousFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ReactParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ReactParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#exportSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterExportSpecifier(ReactParser.ExportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#exportSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitExportSpecifier(ReactParser.ExportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(ReactParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(ReactParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#exportDefault}.
	 * @param ctx the parse tree
	 */
	void enterExportDefault(ReactParser.ExportDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#exportDefault}.
	 * @param ctx the parse tree
	 */
	void exitExportDefault(ReactParser.ExportDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclarationExport}
	 * labeled alternative in {@link ReactParser#namedExport}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationExport(ReactParser.VariableDeclarationExportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclarationExport}
	 * labeled alternative in {@link ReactParser#namedExport}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationExport(ReactParser.VariableDeclarationExportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specifiedExport}
	 * labeled alternative in {@link ReactParser#namedExport}.
	 * @param ctx the parse tree
	 */
	void enterSpecifiedExport(ReactParser.SpecifiedExportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specifiedExport}
	 * labeled alternative in {@link ReactParser#namedExport}.
	 * @param ctx the parse tree
	 */
	void exitSpecifiedExport(ReactParser.SpecifiedExportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedFunctionExport}
	 * labeled alternative in {@link ReactParser#namedExport}.
	 * @param ctx the parse tree
	 */
	void enterNamedFunctionExport(ReactParser.NamedFunctionExportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedFunctionExport}
	 * labeled alternative in {@link ReactParser#namedExport}.
	 * @param ctx the parse tree
	 */
	void exitNamedFunctionExport(ReactParser.NamedFunctionExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#exportAll}.
	 * @param ctx the parse tree
	 */
	void enterExportAll(ReactParser.ExportAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#exportAll}.
	 * @param ctx the parse tree
	 */
	void exitExportAll(ReactParser.ExportAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(ReactParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(ReactParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecifier(ReactParser.ImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecifier(ReactParser.ImportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsx}.
	 * @param ctx the parse tree
	 */
	void enterJsx(ReactParser.JsxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsx}.
	 * @param ctx the parse tree
	 */
	void exitJsx(ReactParser.JsxContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(ReactParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(ReactParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(ReactParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(ReactParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(ReactParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(ReactParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void enterJsxExpression(ReactParser.JsxExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 */
	void exitJsxExpression(ReactParser.JsxExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#normalJsxElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalJsxElement(ReactParser.NormalJsxElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#normalJsxElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalJsxElement(ReactParser.NormalJsxElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxFragment}.
	 * @param ctx the parse tree
	 */
	void enterJsxFragment(ReactParser.JsxFragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxFragment}.
	 * @param ctx the parse tree
	 */
	void exitJsxFragment(ReactParser.JsxFragmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsxSpreadAttribute}
	 * labeled alternative in {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterJsxSpreadAttribute(ReactParser.JsxSpreadAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsxSpreadAttribute}
	 * labeled alternative in {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitJsxSpreadAttribute(ReactParser.JsxSpreadAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsxIdentifier}
	 * labeled alternative in {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterJsxIdentifier(ReactParser.JsxIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsxIdentifier}
	 * labeled alternative in {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitJsxIdentifier(ReactParser.JsxIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#spreadOperation}.
	 * @param ctx the parse tree
	 */
	void enterSpreadOperation(ReactParser.SpreadOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#spreadOperation}.
	 * @param ctx the parse tree
	 */
	void exitSpreadOperation(ReactParser.SpreadOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useStateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUseStateDeclaration(ReactParser.UseStateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useStateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUseStateDeclaration(ReactParser.UseStateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useRefDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUseRefDeclaration(ReactParser.UseRefDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useRefDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUseRefDeclaration(ReactParser.UseRefDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useEffectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUseEffectDeclaration(ReactParser.UseEffectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useEffectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUseEffectDeclaration(ReactParser.UseEffectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#dependencyArray}.
	 * @param ctx the parse tree
	 */
	void enterDependencyArray(ReactParser.DependencyArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#dependencyArray}.
	 * @param ctx the parse tree
	 */
	void exitDependencyArray(ReactParser.DependencyArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#props}.
	 * @param ctx the parse tree
	 */
	void enterProps(ReactParser.PropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#props}.
	 * @param ctx the parse tree
	 */
	void exitProps(ReactParser.PropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#pureReactElement}.
	 * @param ctx the parse tree
	 */
	void enterPureReactElement(ReactParser.PureReactElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#pureReactElement}.
	 * @param ctx the parse tree
	 */
	void exitPureReactElement(ReactParser.PureReactElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#component_return_statment}.
	 * @param ctx the parse tree
	 */
	void enterComponent_return_statment(ReactParser.Component_return_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#component_return_statment}.
	 * @param ctx the parse tree
	 */
	void exitComponent_return_statment(ReactParser.Component_return_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReactParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionalComponent}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalComponent(ReactParser.FunctionalComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionalComponent}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalComponent(ReactParser.FunctionalComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrowComponentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrowComponentDeclaration(ReactParser.ArrowComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrowComponentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrowComponentDeclaration(ReactParser.ArrowComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#namedComponentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamedComponentDeclaration(ReactParser.NamedComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#namedComponentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamedComponentDeclaration(ReactParser.NamedComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#componentFunctionBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentFunctionBody(ReactParser.ComponentFunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#componentFunctionBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentFunctionBody(ReactParser.ComponentFunctionBodyContext ctx);
}