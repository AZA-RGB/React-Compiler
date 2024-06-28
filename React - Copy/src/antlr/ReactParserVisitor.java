// Generated from /home/elyas/Documents/compiler/AfterPropsSemantic/completeParserHefawii/React - Copy/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ReactParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHooks(ReactParser.HooksContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#if_condition_semantic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition_semantic(ReactParser.If_condition_semanticContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#elseIf_condition_semantic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf_condition_semantic(ReactParser.ElseIf_condition_semanticContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#else_condition_semantic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_condition_semantic(ReactParser.Else_condition_semanticContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#tenaryExpression_semantic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTenaryExpression_semantic(ReactParser.TenaryExpression_semanticContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#while_semantic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_semantic(ReactParser.While_semanticContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#do_while_semantic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_semantic(ReactParser.Do_while_semanticContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#for_loop_semantic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_semantic(ReactParser.For_loop_semanticContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#try_expression_semantic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_expression_semantic(ReactParser.Try_expression_semanticContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#catch_expression_semantic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_expression_semantic(ReactParser.Catch_expression_semanticContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#finally_expression_semantic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_expression_semantic(ReactParser.Finally_expression_semanticContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#throwEx_semantic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowEx_semantic(ReactParser.ThrowEx_semanticContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#semantic_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemantic_rule(ReactParser.Semantic_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(ReactParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(ReactParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#operation_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_condition(ReactParser.Operation_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#operation_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_element(ReactParser.Operation_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ReactParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(ReactParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#and_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_or(ReactParser.And_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(ReactParser.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#elseIf_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf_condition(ReactParser.ElseIf_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#else_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_condition(ReactParser.Else_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#tenaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTenaryExpression(ReactParser.TenaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ReactParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(ReactParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(ReactParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#try_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_expression(ReactParser.Try_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#catch_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_expression(ReactParser.Catch_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#finally_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_expression(ReactParser.Finally_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#throwEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowEx(ReactParser.ThrowExContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(ReactParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(ReactParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#objectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpression(ReactParser.ObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ReactParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(ReactParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#memberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpression(ReactParser.MemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variable_declaration_keywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_keywords(ReactParser.Variable_declaration_keywordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(ReactParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ReactParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(ReactParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ReactParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(ReactParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ReactParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ReactParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#namedFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedFunctionDeclaration(ReactParser.NamedFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrowFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionDeclaration(ReactParser.ArrowFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#anonymousFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunctionDeclaration(ReactParser.AnonymousFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ReactParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#exportSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportSpecifier(ReactParser.ExportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(ReactParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#exportDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportDefault(ReactParser.ExportDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclarationExport}
	 * labeled alternative in {@link ReactParser#namedExport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationExport(ReactParser.VariableDeclarationExportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specifiedExport}
	 * labeled alternative in {@link ReactParser#namedExport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifiedExport(ReactParser.SpecifiedExportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedFunctionExport}
	 * labeled alternative in {@link ReactParser#namedExport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedFunctionExport(ReactParser.NamedFunctionExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#exportAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportAll(ReactParser.ExportAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(ReactParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecifier(ReactParser.ImportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsx(ReactParser.JsxContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(ReactParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(ReactParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#selfClosingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingElement(ReactParser.SelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxExpression(ReactParser.JsxExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#normalJsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalJsxElement(ReactParser.NormalJsxElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxFragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxFragment(ReactParser.JsxFragmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsxSpreadAttribute}
	 * labeled alternative in {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxSpreadAttribute(ReactParser.JsxSpreadAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eventAttribute}
	 * labeled alternative in {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAttribute(ReactParser.EventAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jsxIdentifier}
	 * labeled alternative in {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxIdentifier(ReactParser.JsxIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#spreadOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadOperation(ReactParser.SpreadOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useStateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStateDeclaration(ReactParser.UseStateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useRefDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRefDeclaration(ReactParser.UseRefDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useEffectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffectDeclaration(ReactParser.UseEffectDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#dependencyArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependencyArray(ReactParser.DependencyArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#props}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProps(ReactParser.PropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#pureReactElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureReactElement(ReactParser.PureReactElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#component_return_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_return_statment(ReactParser.Component_return_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionalComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalComponent(ReactParser.FunctionalComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrowComponentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowComponentDeclaration(ReactParser.ArrowComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#namedComponentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedComponentDeclaration(ReactParser.NamedComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#componentFunctionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentFunctionBody(ReactParser.ComponentFunctionBodyContext ctx);
}