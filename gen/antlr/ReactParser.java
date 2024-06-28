// Generated from /home/elyas/Downloads/ReactCompiler1/React - Copy/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, IF=2, ELSEIF=3, ELSE=4, FOR=5, WHILE=6, SWITCH=7, CASE=8, BREAK=9, 
		CONTINUE=10, DEFAULT=11, DO=12, TRY=13, CATCH=14, FINALLY=15, THROW=16, 
		FUNCTION=17, RETURN=18, NEW=19, ARROW=20, EQUAL=21, PLUS_EQUALS=22, MINUS_EQUALS=23, 
		TIMES_EQUALS=24, DIVIDE_EQUALS=25, MODULO_EQUALS=26, PLUS_ONE=27, MINUS_ONE=28, 
		PLUS=29, MINUS=30, STAR=31, DIVIDE=32, MODULO=33, AND=34, OR=35, NOT=36, 
		EQUAL_TO=37, NOT_EQUAL=38, GREATER_THAN=39, LESS_THAN=40, GREATER_THAN_OR_EQUAL=41, 
		LESS_THAN_OR_EQUAL=42, SINGLE_LINE_COMMENT=43, COMMENT_BLOCK=44, LPAREN=45, 
		RPAREN=46, LSBRACKET=47, RSBRACKET=48, LCURLY=49, RCURLY=50, COMMA=51, 
		SEMI=52, Integer=53, Float=54, DOT=55, COLON=56, QUESITIONMARK=57, String=58, 
		Boolean=59, Undefined=60, Null=61, CONST=62, LET=63, VAR=64, ASYNC=65, 
		AWAIT=66, EXPORT=67, IMPORT=68, EXPORT_DEFAULT=69, FROM=70, AS=71, USESTATE=72, 
		USEEFFECT=73, CREATEELEMENT=74, USEREF=75, IDENTIFIER=76;
	public static final int
		RULE_id = 0, RULE_comment = 1, RULE_operator = 2, RULE_operation_condition = 3, 
		RULE_operation_element = 4, RULE_condition = 5, RULE_conditions = 6, RULE_if_condition = 7, 
		RULE_elseIf_condition = 8, RULE_else_condition = 9, RULE_tenaryExpression = 10, 
		RULE_while = 11, RULE_do_while = 12, RULE_for_loop = 13, RULE_try_expression = 14, 
		RULE_catch_expression = 15, RULE_finally_expression = 16, RULE_throwEx = 17, 
		RULE_objectLiteral = 18, RULE_property = 19, RULE_objectExpression = 20, 
		RULE_literal = 21, RULE_unaryExpression = 22, RULE_expression = 23, RULE_memberExpression = 24, 
		RULE_variable_declaration_keywords = 25, RULE_variableDeclaration = 26, 
		RULE_variableDeclarator = 27, RULE_array = 28, RULE_arrayElement = 29, 
		RULE_object = 30, RULE_argument = 31, RULE_functionBody = 32, RULE_statement = 33, 
		RULE_returnStatement = 34, RULE_namedFunctionDeclaration = 35, RULE_arrowFunctionDeclaration = 36, 
		RULE_anonymousFunctionDeclaration = 37, RULE_function = 38, RULE_functionCall = 39, 
		RULE_exportSpecifier = 40, RULE_exportStatement = 41, RULE_exportDefault = 42, 
		RULE_namedExport = 43, RULE_exportAll = 44, RULE_importStatement = 45, 
		RULE_importSpecifier = 46, RULE_jsx = 47, RULE_openTag = 48, RULE_closeTag = 49, 
		RULE_selfClosingElement = 50, RULE_jsxExpression = 51, RULE_normalJsxElement = 52, 
		RULE_jsxFragment = 53, RULE_jsxAttribute = 54, RULE_spreadOperation = 55, 
		RULE_useStateDeclaration = 56, RULE_useRefDeclaration = 57, RULE_useEffectDeclaration = 58, 
		RULE_dependencyArray = 59, RULE_props = 60, RULE_pureReactElement = 61, 
		RULE_component_return_statment = 62, RULE_program = 63, RULE_functionalComponent = 64, 
		RULE_arrowComponentDeclaration = 65, RULE_namedComponentDeclaration = 66, 
		RULE_componentFunctionBody = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"id", "comment", "operator", "operation_condition", "operation_element", 
			"condition", "conditions", "if_condition", "elseIf_condition", "else_condition", 
			"tenaryExpression", "while", "do_while", "for_loop", "try_expression", 
			"catch_expression", "finally_expression", "throwEx", "objectLiteral", 
			"property", "objectExpression", "literal", "unaryExpression", "expression", 
			"memberExpression", "variable_declaration_keywords", "variableDeclaration", 
			"variableDeclarator", "array", "arrayElement", "object", "argument", 
			"functionBody", "statement", "returnStatement", "namedFunctionDeclaration", 
			"arrowFunctionDeclaration", "anonymousFunctionDeclaration", "function", 
			"functionCall", "exportSpecifier", "exportStatement", "exportDefault", 
			"namedExport", "exportAll", "importStatement", "importSpecifier", "jsx", 
			"openTag", "closeTag", "selfClosingElement", "jsxExpression", "normalJsxElement", 
			"jsxFragment", "jsxAttribute", "spreadOperation", "useStateDeclaration", 
			"useRefDeclaration", "useEffectDeclaration", "dependencyArray", "props", 
			"pureReactElement", "component_return_statment", "program", "functionalComponent", 
			"arrowComponentDeclaration", "namedComponentDeclaration", "componentFunctionBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'if'", null, "'else'", "'for'", "'while'", "'switch'", "'case'", 
			"'break'", "'continue'", "'default'", "'do'", "'try'", "'catch'", "'finally'", 
			"'throw'", "'function'", "'return'", null, "'=>'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'&&'", "'||'", "'!'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
			null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "';'", null, 
			null, "'.'", "':'", "'?'", null, null, "'undefined'", "'null'", "'const'", 
			"'let'", "'var'", "'async'", "'await'", "'export'", "'import'", null, 
			"'from'", "'as'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "IF", "ELSEIF", "ELSE", "FOR", "WHILE", "SWITCH", "CASE", 
			"BREAK", "CONTINUE", "DEFAULT", "DO", "TRY", "CATCH", "FINALLY", "THROW", 
			"FUNCTION", "RETURN", "NEW", "ARROW", "EQUAL", "PLUS_EQUALS", "MINUS_EQUALS", 
			"TIMES_EQUALS", "DIVIDE_EQUALS", "MODULO_EQUALS", "PLUS_ONE", "MINUS_ONE", 
			"PLUS", "MINUS", "STAR", "DIVIDE", "MODULO", "AND", "OR", "NOT", "EQUAL_TO", 
			"NOT_EQUAL", "GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
			"SINGLE_LINE_COMMENT", "COMMENT_BLOCK", "LPAREN", "RPAREN", "LSBRACKET", 
			"RSBRACKET", "LCURLY", "RCURLY", "COMMA", "SEMI", "Integer", "Float", 
			"DOT", "COLON", "QUESITIONMARK", "String", "Boolean", "Undefined", "Null", 
			"CONST", "LET", "VAR", "ASYNC", "AWAIT", "EXPORT", "IMPORT", "EXPORT_DEFAULT", 
			"FROM", "AS", "USESTATE", "USEEFFECT", "CREATEELEMENT", "USEREF", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ReactParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SINGLE_LINE_COMMENT() { return getToken(ReactParser.SINGLE_LINE_COMMENT, 0); }
		public TerminalNode COMMENT_BLOCK() { return getToken(ReactParser.COMMENT_BLOCK, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_LINE_COMMENT || _la==COMMENT_BLOCK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode PLUS_EQUALS() { return getToken(ReactParser.PLUS_EQUALS, 0); }
		public TerminalNode MINUS_EQUALS() { return getToken(ReactParser.MINUS_EQUALS, 0); }
		public TerminalNode TIMES_EQUALS() { return getToken(ReactParser.TIMES_EQUALS, 0); }
		public TerminalNode DIVIDE_EQUALS() { return getToken(ReactParser.DIVIDE_EQUALS, 0); }
		public TerminalNode MODULO_EQUALS() { return getToken(ReactParser.MODULO_EQUALS, 0); }
		public TerminalNode PLUS() { return getToken(ReactParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ReactParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(ReactParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(ReactParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(ReactParser.MODULO, 0); }
		public TerminalNode PLUS_ONE() { return getToken(ReactParser.PLUS_ONE, 0); }
		public TerminalNode MINUS_ONE() { return getToken(ReactParser.MINUS_ONE, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17177772032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operation_conditionContext extends ParserRuleContext {
		public TerminalNode EQUAL_TO() { return getToken(ReactParser.EQUAL_TO, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(ReactParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(ReactParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(ReactParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(ReactParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(ReactParser.LESS_THAN_OR_EQUAL, 0); }
		public Operation_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOperation_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOperation_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOperation_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operation_conditionContext operation_condition() throws RecognitionException {
		Operation_conditionContext _localctx = new Operation_conditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operation_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8658654068736L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operation_elementContext extends ParserRuleContext {
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PureReactElementContext pureReactElement() {
			return getRuleContext(PureReactElementContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Operation_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOperation_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOperation_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOperation_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operation_elementContext operation_element() throws RecognitionException {
		Operation_elementContext _localctx = new Operation_elementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operation_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(144);
				jsx();
				}
				break;
			case 2:
				{
				setState(145);
				literal();
				}
				break;
			case 3:
				{
				setState(146);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(147);
				id();
				}
				break;
			case 5:
				{
				setState(148);
				pureReactElement();
				}
				break;
			case 6:
				{
				setState(149);
				array();
				}
				break;
			case 7:
				{
				setState(150);
				functionCall();
				}
				break;
			case 8:
				{
				setState(151);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<Operation_elementContext> operation_element() {
			return getRuleContexts(Operation_elementContext.class);
		}
		public Operation_elementContext operation_element(int i) {
			return getRuleContext(Operation_elementContext.class,i);
		}
		public Operation_conditionContext operation_condition() {
			return getRuleContext(Operation_conditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			operation_element();
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(155);
				operation_condition();
				setState(156);
				operation_element();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionsContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ReactParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ReactParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(ReactParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ReactParser.OR, i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			condition();
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AND || _la==OR) {
						{
						setState(161);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(164);
					condition();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_conditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ReactParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public List<TerminalNode> NOT() { return getTokens(ReactParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(ReactParser.NOT, i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<ElseIf_conditionContext> elseIf_condition() {
			return getRuleContexts(ElseIf_conditionContext.class);
		}
		public ElseIf_conditionContext elseIf_condition(int i) {
			return getRuleContext(ElseIf_conditionContext.class,i);
		}
		public Else_conditionContext else_condition() {
			return getRuleContext(Else_conditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIf_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(IF);
			setState(171);
			match(LPAREN);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(172);
				match(NOT);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			conditions();
			setState(179);
			match(RPAREN);
			setState(180);
			match(LCURLY);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(181);
					statement();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(187);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(188);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(193);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(194);
						match(SEMI);
						}
					}

					}
				}

				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(199);
					statement();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(207);
				returnStatement();
				}
			}

			setState(210);
			match(RCURLY);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(211);
				elseIf_condition();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(217);
				else_condition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIf_conditionContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(ReactParser.ELSEIF, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public List<TerminalNode> NOT() { return getTokens(ReactParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(ReactParser.NOT, i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public ElseIf_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElseIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElseIf_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElseIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIf_conditionContext elseIf_condition() throws RecognitionException {
		ElseIf_conditionContext _localctx = new ElseIf_conditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseIf_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(ELSEIF);
			setState(221);
			match(LPAREN);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(222);
				match(NOT);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			conditions();
			setState(229);
			match(RPAREN);
			setState(230);
			match(LCURLY);
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(231);
					statement();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(237);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(238);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(243);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(244);
						match(SEMI);
						}
					}

					}
				}

				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(249);
					statement();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(257);
				returnStatement();
				}
			}

			setState(260);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_conditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ReactParser.ELSE, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public Else_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElse_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElse_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElse_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_conditionContext else_condition() throws RecognitionException {
		Else_conditionContext _localctx = new Else_conditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_else_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ELSE);
			setState(263);
			match(LCURLY);
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(264);
					statement();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(270);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(271);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(276);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(277);
						match(SEMI);
						}
					}

					}
				}

				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(282);
					statement();
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(290);
				returnStatement();
				}
			}

			setState(293);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TenaryExpressionContext extends ParserRuleContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode QUESITIONMARK() { return getToken(ReactParser.QUESITIONMARK, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ReactParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ReactParser.LPAREN, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ReactParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ReactParser.RPAREN, i);
		}
		public List<TerminalNode> NOT() { return getTokens(ReactParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(ReactParser.NOT, i);
		}
		public TenaryExpressionContext tenaryExpression() {
			return getRuleContext(TenaryExpressionContext.class,0);
		}
		public TenaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tenaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTenaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTenaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTenaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TenaryExpressionContext tenaryExpression() throws RecognitionException {
		TenaryExpressionContext _localctx = new TenaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tenaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(295);
				match(NOT);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			conditions();
			setState(302);
			match(QUESITIONMARK);
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(303);
				match(LPAREN);
				setState(304);
				statement();
				setState(305);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(307);
				statement();
				}
				break;
			}
			setState(310);
			match(COLON);
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(311);
					match(LPAREN);
					setState(312);
					statement();
					}
					break;
				case 2:
					{
					setState(313);
					tenaryExpression();
					setState(314);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(318);
					statement();
					}
					break;
				case 2:
					{
					setState(319);
					tenaryExpression();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ReactParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public List<TerminalNode> NOT() { return getTokens(ReactParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(ReactParser.NOT, i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(WHILE);
			setState(325);
			match(LPAREN);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(326);
				match(NOT);
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			conditions();
			setState(333);
			match(RPAREN);
			setState(334);
			match(LCURLY);
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(335);
					statement();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(341);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(342);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(347);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(348);
						match(SEMI);
						}
					}

					}
				}

				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(353);
					statement();
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(361);
				returnStatement();
				}
			}

			setState(364);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ReactParser.DO, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public TerminalNode WHILE() { return getToken(ReactParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ReactParser.NOT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(DO);
			setState(367);
			match(LCURLY);
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(368);
					statement();
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(374);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(375);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(380);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(381);
						match(SEMI);
						}
					}

					}
				}

				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(386);
					statement();
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(394);
				returnStatement();
				}
			}

			setState(397);
			match(RCURLY);
			setState(398);
			match(WHILE);
			setState(399);
			match(LPAREN);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(400);
				match(NOT);
				}
			}

			setState(403);
			conditions();
			setState(404);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ReactParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ReactParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ReactParser.SEMI, i);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(FOR);
			setState(407);
			match(LPAREN);
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
				{
				setState(408);
				variableDeclaration();
				}
				break;
			case IDENTIFIER:
				{
				setState(409);
				variableDeclarator();
				}
				break;
			case SEMI:
				break;
			default:
				break;
			}
			setState(412);
			match(SEMI);
			setState(413);
			conditions();
			setState(414);
			match(SEMI);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 68790542497L) != 0)) {
				{
				setState(415);
				expression(0);
				}
			}

			setState(418);
			match(RPAREN);
			setState(419);
			match(LCURLY);
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(420);
					statement();
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(426);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(427);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(432);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(433);
						match(SEMI);
						}
					}

					}
				}

				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(438);
					statement();
					}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(446);
				returnStatement();
				}
			}

			setState(449);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Try_expressionContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(ReactParser.TRY, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public ThrowExContext throwEx() {
			return getRuleContext(ThrowExContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(ReactParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ReactParser.SEMI, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Catch_expressionContext catch_expression() {
			return getRuleContext(Catch_expressionContext.class,0);
		}
		public Finally_expressionContext finally_expression() {
			return getRuleContext(Finally_expressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public Try_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTry_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTry_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTry_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_expressionContext try_expression() throws RecognitionException {
		Try_expressionContext _localctx = new Try_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_try_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(TRY);
			setState(452);
			match(LCURLY);
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(453);
						statement();
						}
						} 
					}
					setState(458);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(459);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(460);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(465);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(466);
						match(SEMI);
						}
					}

					}
				}

				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(471);
						statement();
						}
						} 
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
				break;
			}
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885471132L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
				{
				setState(479);
				throwEx();
				}
			}

			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(482);
				returnStatement();
				}
			}

			setState(485);
			match(RCURLY);
			{
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(486);
				catch_expression();
				}
			}

			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(489);
				finally_expression();
				}
			}

			}
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(492);
					match(SEMI);
					}
					} 
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Catch_expressionContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ReactParser.CATCH, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public Catch_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCatch_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCatch_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCatch_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_expressionContext catch_expression() throws RecognitionException {
		Catch_expressionContext _localctx = new Catch_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_catch_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(CATCH);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(499);
				match(LPAREN);
				setState(500);
				id();
				setState(501);
				match(RPAREN);
				}
			}

			setState(505);
			match(LCURLY);
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(506);
					statement();
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(512);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(514);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(513);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(518);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(519);
						match(SEMI);
						}
					}

					}
				}

				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(524);
					statement();
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(532);
				returnStatement();
				}
			}

			setState(535);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Finally_expressionContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ReactParser.FINALLY, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public Finally_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFinally_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFinally_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFinally_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_expressionContext finally_expression() throws RecognitionException {
		Finally_expressionContext _localctx = new Finally_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_finally_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(FINALLY);
			setState(538);
			match(LCURLY);
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(539);
					statement();
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(545);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(546);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(551);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(552);
						match(SEMI);
						}
					}

					}
				}

				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(557);
					statement();
					}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(565);
				returnStatement();
				}
			}

			setState(568);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowExContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(ReactParser.THROW, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(ReactParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ReactParser.SEMI, i);
		}
		public ThrowExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterThrowEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitThrowEx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitThrowEx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowExContext throwEx() throws RecognitionException {
		ThrowExContext _localctx = new ThrowExContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_throwEx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THROW:
				{
				setState(570);
				match(THROW);
				setState(571);
				object();
				}
				break;
			case IF:
			case FOR:
			case WHILE:
			case DO:
			case TRY:
			case FUNCTION:
			case EQUAL:
			case PLUS_EQUALS:
			case MINUS_EQUALS:
			case TIMES_EQUALS:
			case DIVIDE_EQUALS:
			case MODULO_EQUALS:
			case PLUS_ONE:
			case MINUS_ONE:
			case PLUS:
			case MINUS:
			case STAR:
			case DIVIDE:
			case MODULO:
			case NOT:
			case LESS_THAN:
			case SINGLE_LINE_COMMENT:
			case COMMENT_BLOCK:
			case LPAREN:
			case LSBRACKET:
			case LCURLY:
			case Integer:
			case Float:
			case String:
			case Boolean:
			case Undefined:
			case Null:
			case CONST:
			case LET:
			case VAR:
			case ASYNC:
			case AWAIT:
			case EXPORT:
			case IMPORT:
			case EXPORT_DEFAULT:
			case USEEFFECT:
			case CREATEELEMENT:
			case IDENTIFIER:
				{
				setState(572);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(575);
				match(SEMI);
				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(LCURLY);
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(582);
					comment();
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(588);
				property();
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(589);
						comment();
						}
						} 
					}
					setState(594);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(595);
						match(COMMA);
						setState(599);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SINGLE_LINE_COMMENT || _la==COMMENT_BLOCK) {
							{
							{
							setState(596);
							comment();
							}
							}
							setState(601);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(602);
						property();
						setState(606);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(603);
								comment();
								}
								} 
							}
							setState(608);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
						}
						}
						} 
					}
					setState(613);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(614);
					match(COMMA);
					}
				}

				}
			}

			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==COMMENT_BLOCK) {
				{
				{
				setState(619);
				comment();
				}
				}
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(625);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public ObjectExpressionContext objectExpression() {
			return getRuleContext(ObjectExpressionContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			id();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(628);
				match(COLON);
				setState(629);
				objectExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ArrowFunctionDeclarationContext arrowFunctionDeclaration() {
			return getRuleContext(ArrowFunctionDeclarationContext.class,0);
		}
		public ObjectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionContext objectExpression() throws RecognitionException {
		ObjectExpressionContext _localctx = new ObjectExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_objectExpression);
		try {
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(634);
				objectLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(635);
				arrowFunctionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(ReactParser.Integer, 0); }
		public TerminalNode Float() { return getToken(ReactParser.Float, 0); }
		public TerminalNode Boolean() { return getToken(ReactParser.Boolean, 0); }
		public TerminalNode Undefined() { return getToken(ReactParser.Undefined, 0); }
		public TerminalNode Null() { return getToken(ReactParser.Null, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4350477240039899136L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unaryExpression);
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(643);
				operator();
				setState(644);
				unaryExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
		}
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(649);
				literal();
				}
				break;
			case 2:
				{
				setState(650);
				id();
				}
				break;
			case 3:
				{
				setState(651);
				jsx();
				}
				break;
			case 4:
				{
				setState(652);
				memberExpression(0);
				}
				break;
			case 5:
				{
				setState(653);
				match(LPAREN);
				setState(654);
				expression(0);
				setState(655);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(667);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(665);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(659);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(660);
						operator();
						setState(661);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(663);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(664);
						operator();
						}
						break;
					}
					} 
				}
				setState(669);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberExpressionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode LSBRACKET() { return getToken(ReactParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(ReactParser.RSBRACKET, 0); }
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public MemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMemberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberExpressionContext memberExpression() throws RecognitionException {
		return memberExpression(0);
	}

	private MemberExpressionContext memberExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberExpressionContext _localctx = new MemberExpressionContext(_ctx, _parentState);
		MemberExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_memberExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(675);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(671);
					id();
					}
					break;
				case 2:
					{
					setState(672);
					array();
					}
					break;
				case 3:
					{
					setState(673);
					literal();
					}
					break;
				case 4:
					{
					setState(674);
					functionCall();
					}
					break;
				}
				}
				break;
			case 2:
				{
				{
				setState(677);
				id();
				setState(678);
				match(LSBRACKET);
				setState(679);
				literal();
				setState(680);
				match(RSBRACKET);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(693);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberExpression);
					setState(684);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(685);
					match(DOT);
					setState(689);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						setState(686);
						id();
						}
						break;
					case 2:
						{
						setState(687);
						literal();
						}
						break;
					case 3:
						{
						setState(688);
						functionCall();
						}
						break;
					}
					}
					} 
				}
				setState(695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declaration_keywordsContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode LET() { return getToken(ReactParser.LET, 0); }
		public TerminalNode VAR() { return getToken(ReactParser.VAR, 0); }
		public Variable_declaration_keywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_keywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariable_declaration_keywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariable_declaration_keywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariable_declaration_keywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_keywordsContext variable_declaration_keywords() throws RecognitionException {
		Variable_declaration_keywordsContext _localctx = new Variable_declaration_keywordsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable_declaration_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public Variable_declaration_keywordsContext variable_declaration_keywords() {
			return getRuleContext(Variable_declaration_keywordsContext.class,0);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			variable_declaration_keywords();
			{
			setState(699);
			variableDeclarator();
			setState(704);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(700);
					match(COMMA);
					setState(701);
					variableDeclarator();
					}
					} 
				}
				setState(706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public AnonymousFunctionDeclarationContext anonymousFunctionDeclaration() {
			return getRuleContext(AnonymousFunctionDeclarationContext.class,0);
		}
		public ArrowFunctionDeclarationContext arrowFunctionDeclaration() {
			return getRuleContext(ArrowFunctionDeclarationContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			id();
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(708);
				match(EQUAL);
				setState(717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(709);
					literal();
					}
					break;
				case 2:
					{
					setState(710);
					objectLiteral();
					}
					break;
				case 3:
					{
					setState(711);
					anonymousFunctionDeclaration();
					}
					break;
				case 4:
					{
					setState(712);
					arrowFunctionDeclaration();
					}
					break;
				case 5:
					{
					setState(713);
					id();
					}
					break;
				case 6:
					{
					setState(714);
					array();
					}
					break;
				case 7:
					{
					setState(715);
					memberExpression(0);
					}
					break;
				case 8:
					{
					setState(716);
					object();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LSBRACKET() { return getToken(ReactParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(ReactParser.RSBRACKET, 0); }
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(LSBRACKET);
			setState(725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(722);
					comment();
					}
					} 
				}
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 720890612508786689L) != 0)) {
				{
				setState(728);
				arrayElement();
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(729);
						comment();
						}
						} 
					}
					setState(734);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				}
				setState(751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(735);
						match(COMMA);
						setState(739);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SINGLE_LINE_COMMENT || _la==COMMENT_BLOCK) {
							{
							{
							setState(736);
							comment();
							}
							}
							setState(741);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(742);
						arrayElement();
						setState(746);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(743);
								comment();
								}
								} 
							}
							setState(748);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
						}
						}
						} 
					}
					setState(753);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				}
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(754);
					match(COMMA);
					}
				}

				}
			}

			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==COMMENT_BLOCK) {
				{
				{
				setState(759);
				comment();
				}
				}
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(765);
			match(RSBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public PureReactElementContext pureReactElement() {
			return getRuleContext(PureReactElementContext.class,0);
		}
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrayElement);
		try {
			setState(774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				id();
				}
				break;
			case Integer:
			case Float:
			case String:
			case Boolean:
			case Undefined:
			case Null:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				literal();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(769);
				objectLiteral();
				}
				break;
			case CREATEELEMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(770);
				pureReactElement();
				}
				break;
			case LESS_THAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(771);
				jsx();
				}
				break;
			case FUNCTION:
			case LPAREN:
			case ASYNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(772);
				function();
				}
				break;
			case LSBRACKET:
				enterOuterAlt(_localctx, 7);
				{
				setState(773);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(ReactParser.NEW, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(NEW);
			setState(777);
			functionCall();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_argument);
		try {
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				objectLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(781);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(784);
					statement();
					}
					} 
				}
				setState(789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(790);
				returnStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TenaryExpressionContext tenaryExpression() {
			return getRuleContext(TenaryExpressionContext.class,0);
		}
		public NamedFunctionDeclarationContext namedFunctionDeclaration() {
			return getRuleContext(NamedFunctionDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public UseEffectDeclarationContext useEffectDeclaration() {
			return getRuleContext(UseEffectDeclarationContext.class,0);
		}
		public UseStateDeclarationContext useStateDeclaration() {
			return getRuleContext(UseStateDeclarationContext.class,0);
		}
		public UseRefDeclarationContext useRefDeclaration() {
			return getRuleContext(UseRefDeclarationContext.class,0);
		}
		public PureReactElementContext pureReactElement() {
			return getRuleContext(PureReactElementContext.class,0);
		}
		public JsxExpressionContext jsxExpression() {
			return getRuleContext(JsxExpressionContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public Try_expressionContext try_expression() {
			return getRuleContext(Try_expressionContext.class,0);
		}
		public VariableDeclaratorContext variableDeclarator() {
			return getRuleContext(VariableDeclaratorContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(ReactParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ReactParser.SEMI, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(793);
				if_condition();
				}
				break;
			case 2:
				{
				setState(794);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(795);
				tenaryExpression();
				}
				break;
			case 4:
				{
				setState(796);
				namedFunctionDeclaration();
				}
				break;
			case 5:
				{
				setState(797);
				functionCall();
				}
				break;
			case 6:
				{
				setState(798);
				useEffectDeclaration();
				}
				break;
			case 7:
				{
				setState(799);
				useStateDeclaration();
				}
				break;
			case 8:
				{
				setState(800);
				useRefDeclaration();
				}
				break;
			case 9:
				{
				setState(801);
				pureReactElement();
				}
				break;
			case 10:
				{
				setState(802);
				jsxExpression();
				}
				break;
			case 11:
				{
				setState(803);
				while_();
				}
				break;
			case 12:
				{
				setState(804);
				do_while();
				}
				break;
			case 13:
				{
				setState(805);
				for_loop();
				}
				break;
			case 14:
				{
				setState(806);
				expression(0);
				}
				break;
			case 15:
				{
				setState(807);
				unaryExpression();
				}
				break;
			case 16:
				{
				setState(808);
				try_expression();
				}
				break;
			case 17:
				{
				setState(809);
				variableDeclarator();
				}
				break;
			case 18:
				{
				setState(810);
				conditions();
				}
				break;
			case 19:
				{
				setState(811);
				comment();
				}
				break;
			case 20:
				{
				setState(812);
				importStatement();
				}
				break;
			case 21:
				{
				setState(813);
				function();
				}
				break;
			case 22:
				{
				setState(814);
				exportStatement();
				}
				break;
			}
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(817);
					match(SEMI);
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ReactParser.RETURN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ReactParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ReactParser.SEMI, i);
		}
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PureReactElementContext pureReactElement() {
			return getRuleContext(PureReactElementContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_returnStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(RETURN);
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				{
				setState(824);
				match(LPAREN);
				setState(833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(825);
					jsx();
					}
					break;
				case 2:
					{
					setState(826);
					expression(0);
					}
					break;
				case 3:
					{
					setState(827);
					literal();
					}
					break;
				case 4:
					{
					setState(828);
					objectLiteral();
					}
					break;
				case 5:
					{
					setState(829);
					unaryExpression();
					}
					break;
				case 6:
					{
					setState(830);
					id();
					}
					break;
				case 7:
					{
					setState(831);
					pureReactElement();
					}
					break;
				case 8:
					{
					setState(832);
					array();
					}
					break;
				}
				setState(835);
				match(RPAREN);
				}
				}
				break;
			case 2:
				{
				setState(845);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(837);
					jsx();
					}
					break;
				case 2:
					{
					setState(838);
					expression(0);
					}
					break;
				case 3:
					{
					setState(839);
					literal();
					}
					break;
				case 4:
					{
					setState(840);
					objectLiteral();
					}
					break;
				case 5:
					{
					setState(841);
					id();
					}
					break;
				case 6:
					{
					setState(842);
					unaryExpression();
					}
					break;
				case 7:
					{
					setState(843);
					pureReactElement();
					}
					break;
				case 8:
					{
					setState(844);
					array();
					}
					break;
				}
				}
				break;
			}
			setState(852);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(849);
					match(SEMI);
					}
					} 
				}
				setState(854);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ReactParser.FUNCTION, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public TerminalNode ASYNC() { return getToken(ReactParser.ASYNC, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public NamedFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterNamedFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitNamedFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitNamedFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedFunctionDeclarationContext namedFunctionDeclaration() throws RecognitionException {
		NamedFunctionDeclarationContext _localctx = new NamedFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_namedFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(855);
				match(ASYNC);
				}
			}

			setState(858);
			match(FUNCTION);
			setState(859);
			id();
			setState(860);
			match(LPAREN);
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
				{
				setState(861);
				argument();
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(862);
					match(COMMA);
					setState(863);
					argument();
					}
					}
					setState(868);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(871);
			match(RPAREN);
			setState(872);
			match(LCURLY);
			setState(873);
			functionBody();
			setState(874);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(ReactParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ReactParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ReactParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ReactParser.RPAREN, i);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ArrowFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrowFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrowFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrowFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionDeclarationContext arrowFunctionDeclaration() throws RecognitionException {
		ArrowFunctionDeclarationContext _localctx = new ArrowFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrowFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(LPAREN);
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
				{
				setState(877);
				argument();
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(878);
					match(COMMA);
					setState(879);
					argument();
					}
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(887);
			match(RPAREN);
			setState(888);
			match(ARROW);
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				{
				setState(889);
				match(LCURLY);
				setState(890);
				functionBody();
				setState(891);
				match(RCURLY);
				}
				}
				break;
			case 2:
				{
				setState(893);
				functionBody();
				}
				break;
			case 3:
				{
				{
				setState(894);
				match(LPAREN);
				setState(895);
				functionBody();
				setState(896);
				match(RPAREN);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnonymousFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ReactParser.FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public AnonymousFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAnonymousFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAnonymousFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAnonymousFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionDeclarationContext anonymousFunctionDeclaration() throws RecognitionException {
		AnonymousFunctionDeclarationContext _localctx = new AnonymousFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_anonymousFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(FUNCTION);
			setState(901);
			match(LPAREN);
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
				{
				setState(902);
				argument();
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(903);
					match(COMMA);
					setState(904);
					argument();
					}
					}
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(912);
			match(RPAREN);
			setState(913);
			match(LCURLY);
			setState(914);
			functionBody();
			setState(915);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public ArrowFunctionDeclarationContext arrowFunctionDeclaration() {
			return getRuleContext(ArrowFunctionDeclarationContext.class,0);
		}
		public NamedFunctionDeclarationContext namedFunctionDeclaration() {
			return getRuleContext(NamedFunctionDeclarationContext.class,0);
		}
		public AnonymousFunctionDeclarationContext anonymousFunctionDeclaration() {
			return getRuleContext(AnonymousFunctionDeclarationContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_function);
		try {
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				arrowFunctionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				namedFunctionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(919);
				anonymousFunctionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode AWAIT() { return getToken(ReactParser.AWAIT, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AWAIT) {
				{
				setState(922);
				match(AWAIT);
				}
			}

			{
			setState(925);
			id();
			}
			{
			setState(926);
			match(LPAREN);
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
				{
				setState(927);
				argument();
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(928);
					match(COMMA);
					setState(929);
					argument();
					}
					}
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(937);
			match(RPAREN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportSpecifierContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode AS() { return getToken(ReactParser.AS, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public ExportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportSpecifierContext exportSpecifier() throws RecognitionException {
		ExportSpecifierContext _localctx = new ExportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exportSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			id();
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(940);
				match(AS);
				setState(943);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(941);
					id();
					}
					break;
				case String:
					{
					setState(942);
					match(String);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public ExportDefaultContext exportDefault() {
			return getRuleContext(ExportDefaultContext.class,0);
		}
		public NamedExportContext namedExport() {
			return getRuleContext(NamedExportContext.class,0);
		}
		public ExportAllContext exportAll() {
			return getRuleContext(ExportAllContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(947);
				exportDefault();
				}
				break;
			case 2:
				{
				setState(948);
				namedExport();
				}
				break;
			case 3:
				{
				setState(949);
				exportAll();
				}
				break;
			}
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(952);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportDefaultContext extends ParserRuleContext {
		public TerminalNode EXPORT_DEFAULT() { return getToken(ReactParser.EXPORT_DEFAULT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExportDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportDefaultContext exportDefault() throws RecognitionException {
		ExportDefaultContext _localctx = new ExportDefaultContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exportDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(EXPORT_DEFAULT);
			setState(961);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(956);
				id();
				}
				break;
			case Integer:
			case Float:
			case String:
			case Boolean:
			case Undefined:
			case Null:
				{
				setState(957);
				literal();
				}
				break;
			case LCURLY:
				{
				setState(958);
				objectLiteral();
				}
				break;
			case FUNCTION:
			case LPAREN:
			case ASYNC:
				{
				setState(959);
				function();
				}
				break;
			case CONST:
			case LET:
			case VAR:
				{
				setState(960);
				variableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExportContext extends ParserRuleContext {
		public NamedExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExport; }
	 
		public NamedExportContext() { }
		public void copyFrom(NamedExportContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedFunctionExportContext extends NamedExportContext {
		public TerminalNode EXPORT() { return getToken(ReactParser.EXPORT, 0); }
		public NamedFunctionDeclarationContext namedFunctionDeclaration() {
			return getRuleContext(NamedFunctionDeclarationContext.class,0);
		}
		public NamedFunctionExportContext(NamedExportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterNamedFunctionExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitNamedFunctionExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitNamedFunctionExport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpecifiedExportContext extends NamedExportContext {
		public TerminalNode EXPORT() { return getToken(ReactParser.EXPORT, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public List<ExportSpecifierContext> exportSpecifier() {
			return getRuleContexts(ExportSpecifierContext.class);
		}
		public ExportSpecifierContext exportSpecifier(int i) {
			return getRuleContext(ExportSpecifierContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public SpecifiedExportContext(NamedExportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSpecifiedExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSpecifiedExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSpecifiedExport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationExportContext extends NamedExportContext {
		public TerminalNode EXPORT() { return getToken(ReactParser.EXPORT, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationExportContext(NamedExportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclarationExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclarationExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclarationExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExportContext namedExport() throws RecognitionException {
		NamedExportContext _localctx = new NamedExportContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_namedExport);
		int _la;
		try {
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationExportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				match(EXPORT);
				setState(964);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new SpecifiedExportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				match(EXPORT);
				setState(966);
				match(LCURLY);
				{
				setState(967);
				exportSpecifier();
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(968);
					match(COMMA);
					setState(969);
					exportSpecifier();
					}
					}
					setState(974);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(975);
				match(RCURLY);
				{
				setState(976);
				match(FROM);
				setState(977);
				match(String);
				}
				}
				}
				break;
			case 3:
				_localctx = new NamedFunctionExportContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(979);
				match(EXPORT);
				setState(980);
				namedFunctionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportAllContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(ReactParser.EXPORT, 0); }
		public TerminalNode STAR() { return getToken(ReactParser.STAR, 0); }
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
		public List<TerminalNode> String() { return getTokens(ReactParser.String); }
		public TerminalNode String(int i) {
			return getToken(ReactParser.String, i);
		}
		public TerminalNode AS() { return getToken(ReactParser.AS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExportAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExportAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExportAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExportAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportAllContext exportAll() throws RecognitionException {
		ExportAllContext _localctx = new ExportAllContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_exportAll);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(EXPORT);
			setState(984);
			match(STAR);
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(985);
				match(AS);
				setState(988);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(986);
					id();
					}
					break;
				case String:
					{
					setState(987);
					match(String);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			{
			setState(992);
			match(FROM);
			setState(993);
			match(String);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public List<ImportSpecifierContext> importSpecifier() {
			return getRuleContexts(ImportSpecifierContext.class);
		}
		public ImportSpecifierContext importSpecifier(int i) {
			return getRuleContext(ImportSpecifierContext.class,i);
		}
		public TerminalNode STAR() { return getToken(ReactParser.STAR, 0); }
		public TerminalNode AS() { return getToken(ReactParser.AS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(IMPORT);
			setState(1024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				{
				setState(996);
				match(STAR);
				setState(997);
				match(AS);
				setState(998);
				id();
				}
				}
				break;
			case 2:
				{
				{
				setState(999);
				match(LCURLY);
				{
				setState(1000);
				importSpecifier();
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1001);
					match(COMMA);
					setState(1002);
					importSpecifier();
					}
					}
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1008);
				match(RCURLY);
				}
				}
				break;
			case 3:
				{
				{
				setState(1010);
				importSpecifier();
				{
				setState(1011);
				match(COMMA);
				{
				setState(1012);
				match(LCURLY);
				{
				setState(1013);
				importSpecifier();
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1014);
					match(COMMA);
					setState(1015);
					importSpecifier();
					}
					}
					setState(1020);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1021);
				match(RCURLY);
				}
				}
				}
				}
				break;
			case 4:
				{
				setState(1023);
				importSpecifier();
				}
				break;
			}
			setState(1026);
			match(FROM);
			setState(1027);
			match(String);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportSpecifierContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode USESTATE() { return getToken(ReactParser.USESTATE, 0); }
		public TerminalNode USEEFFECT() { return getToken(ReactParser.USEEFFECT, 0); }
		public TerminalNode USEREF() { return getToken(ReactParser.USEREF, 0); }
		public TerminalNode AS() { return getToken(ReactParser.AS, 0); }
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_importSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1029);
				id();
				}
				break;
			case USESTATE:
				{
				setState(1030);
				match(USESTATE);
				}
				break;
			case USEEFFECT:
				{
				setState(1031);
				match(USEEFFECT);
				}
				break;
			case USEREF:
				{
				setState(1032);
				match(USEREF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1035);
				match(AS);
				setState(1036);
				id();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxContext extends ParserRuleContext {
		public NormalJsxElementContext normalJsxElement() {
			return getRuleContext(NormalJsxElementContext.class,0);
		}
		public SelfClosingElementContext selfClosingElement() {
			return getRuleContext(SelfClosingElementContext.class,0);
		}
		public JsxFragmentContext jsxFragment() {
			return getRuleContext(JsxFragmentContext.class,0);
		}
		public JsxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxContext jsx() throws RecognitionException {
		JsxContext _localctx = new JsxContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_jsx);
		try {
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1039);
				normalJsxElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1040);
				selfClosingElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1041);
				jsxFragment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(ReactParser.LESS_THAN, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(ReactParser.GREATER_THAN, 0); }
		public List<TerminalNode> DOT() { return getTokens(ReactParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ReactParser.DOT, i);
		}
		public List<JsxAttributeContext> jsxAttribute() {
			return getRuleContexts(JsxAttributeContext.class);
		}
		public JsxAttributeContext jsxAttribute(int i) {
			return getRuleContext(JsxAttributeContext.class,i);
		}
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(LESS_THAN);
			setState(1045);
			id();
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1046);
				match(DOT);
				setState(1047);
				id();
				}
				}
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LCURLY || _la==IDENTIFIER) {
				{
				{
				setState(1053);
				jsxAttribute();
				}
				}
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1059);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(ReactParser.LESS_THAN, 0); }
		public TerminalNode DIVIDE() { return getToken(ReactParser.DIVIDE, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(ReactParser.GREATER_THAN, 0); }
		public List<TerminalNode> DOT() { return getTokens(ReactParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ReactParser.DOT, i);
		}
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_closeTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			match(LESS_THAN);
			setState(1062);
			match(DIVIDE);
			setState(1063);
			id();
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1064);
				match(DOT);
				setState(1065);
				id();
				}
				}
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1071);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingElementContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(ReactParser.LESS_THAN, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactParser.DIVIDE, 0); }
		public TerminalNode GREATER_THAN() { return getToken(ReactParser.GREATER_THAN, 0); }
		public List<TerminalNode> DOT() { return getTokens(ReactParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ReactParser.DOT, i);
		}
		public List<JsxAttributeContext> jsxAttribute() {
			return getRuleContexts(JsxAttributeContext.class);
		}
		public JsxAttributeContext jsxAttribute(int i) {
			return getRuleContext(JsxAttributeContext.class,i);
		}
		public SelfClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingElementContext selfClosingElement() throws RecognitionException {
		SelfClosingElementContext _localctx = new SelfClosingElementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_selfClosingElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(LESS_THAN);
			setState(1074);
			id();
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1075);
				match(DOT);
				setState(1076);
				id();
				}
				}
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LCURLY || _la==IDENTIFIER) {
				{
				{
				setState(1082);
				jsxAttribute();
				}
				}
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1088);
			match(DIVIDE);
			setState(1089);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxExpressionContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<ObjectLiteralContext> objectLiteral() {
			return getRuleContexts(ObjectLiteralContext.class);
		}
		public ObjectLiteralContext objectLiteral(int i) {
			return getRuleContext(ObjectLiteralContext.class,i);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<JsxExpressionContext> jsxExpression() {
			return getRuleContexts(JsxExpressionContext.class);
		}
		public JsxExpressionContext jsxExpression(int i) {
			return getRuleContext(JsxExpressionContext.class,i);
		}
		public JsxExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxExpressionContext jsxExpression() throws RecognitionException {
		JsxExpressionContext _localctx = new JsxExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_jsxExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(LCURLY);
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 36066056213110783L) != 0)) {
					{
					setState(1096);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
					case 1:
						{
						setState(1092);
						functionCall();
						}
						break;
					case 2:
						{
						setState(1093);
						expression(0);
						}
						break;
					case 3:
						{
						setState(1094);
						unaryExpression();
						}
						break;
					case 4:
						{
						setState(1095);
						objectLiteral();
						}
						break;
					}
					}
					setState(1100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 281475245146113L) != 0)) {
					{
					setState(1101);
					function();
					}
				}

				}
				break;
			case 3:
				{
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LCURLY) {
					{
					{
					setState(1104);
					jsxExpression();
					}
					}
					setState(1109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1112);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalJsxElementContext extends ParserRuleContext {
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<JsxContext> jsx() {
			return getRuleContexts(JsxContext.class);
		}
		public JsxContext jsx(int i) {
			return getRuleContext(JsxContext.class,i);
		}
		public List<JsxExpressionContext> jsxExpression() {
			return getRuleContexts(JsxExpressionContext.class);
		}
		public JsxExpressionContext jsxExpression(int i) {
			return getRuleContext(JsxExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public NormalJsxElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalJsxElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterNormalJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitNormalJsxElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitNormalJsxElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalJsxElementContext normalJsxElement() throws RecognitionException {
		NormalJsxElementContext _localctx = new NormalJsxElementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_normalJsxElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1114);
			openTag();
			}
			setState(1120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
					case 1:
						{
						setState(1115);
						jsx();
						}
						break;
					case 2:
						{
						setState(1116);
						jsxExpression();
						}
						break;
					case 3:
						{
						setState(1117);
						statement();
						}
						break;
					}
					} 
				}
				setState(1122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			{
			setState(1123);
			closeTag();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxFragmentContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(ReactParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ReactParser.LESS_THAN, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(ReactParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(ReactParser.GREATER_THAN, i);
		}
		public TerminalNode DIVIDE() { return getToken(ReactParser.DIVIDE, 0); }
		public List<JsxContext> jsx() {
			return getRuleContexts(JsxContext.class);
		}
		public JsxContext jsx(int i) {
			return getRuleContext(JsxContext.class,i);
		}
		public List<JsxExpressionContext> jsxExpression() {
			return getRuleContexts(JsxExpressionContext.class);
		}
		public JsxExpressionContext jsxExpression(int i) {
			return getRuleContext(JsxExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public JsxFragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxFragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxFragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxFragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxFragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxFragmentContext jsxFragment() throws RecognitionException {
		JsxFragmentContext _localctx = new JsxFragmentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_jsxFragment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1125);
			match(LESS_THAN);
			setState(1126);
			match(GREATER_THAN);
			}
			setState(1133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						setState(1128);
						jsx();
						}
						break;
					case 2:
						{
						setState(1129);
						jsxExpression();
						}
						break;
					case 3:
						{
						setState(1130);
						statement();
						}
						break;
					}
					} 
				}
				setState(1135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			{
			setState(1136);
			match(LESS_THAN);
			setState(1137);
			match(DIVIDE);
			setState(1138);
			match(GREATER_THAN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributeContext extends ParserRuleContext {
		public JsxAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttribute; }
	 
		public JsxAttributeContext() { }
		public void copyFrom(JsxAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxIdentifierContext extends JsxAttributeContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public JsxExpressionContext jsxExpression() {
			return getRuleContext(JsxExpressionContext.class,0);
		}
		public JsxIdentifierContext(JsxAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxSpreadAttributeContext extends JsxAttributeContext {
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public SpreadOperationContext spreadOperation() {
			return getRuleContext(SpreadOperationContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public JsxSpreadAttributeContext(JsxAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxSpreadAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxSpreadAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxSpreadAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributeContext jsxAttribute() throws RecognitionException {
		JsxAttributeContext _localctx = new JsxAttributeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_jsxAttribute);
		int _la;
		try {
			setState(1152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				_localctx = new JsxSpreadAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1140);
				match(LCURLY);
				setState(1141);
				spreadOperation();
				setState(1142);
				match(RCURLY);
				}
				}
				break;
			case IDENTIFIER:
				_localctx = new JsxIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1144);
				id();
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1145);
					match(EQUAL);
					setState(1148);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Integer:
					case Float:
					case String:
					case Boolean:
					case Undefined:
					case Null:
						{
						setState(1146);
						literal();
						}
						break;
					case LCURLY:
						{
						setState(1147);
						jsxExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpreadOperationContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(ReactParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ReactParser.DOT, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SpreadOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spreadOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSpreadOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSpreadOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSpreadOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpreadOperationContext spreadOperation() throws RecognitionException {
		SpreadOperationContext _localctx = new SpreadOperationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_spreadOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			match(DOT);
			setState(1155);
			match(DOT);
			setState(1156);
			match(DOT);
			setState(1162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1157);
				id();
				}
				break;
			case 2:
				{
				setState(1158);
				literal();
				}
				break;
			case 3:
				{
				setState(1159);
				array();
				}
				break;
			case 4:
				{
				setState(1160);
				function();
				}
				break;
			case 5:
				{
				setState(1161);
				functionCall();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseStateDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode LSBRACKET() { return getToken(ReactParser.LSBRACKET, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode RSBRACKET() { return getToken(ReactParser.RSBRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode USESTATE() { return getToken(ReactParser.USESTATE, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UseStateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseStateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseStateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseStateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStateDeclarationContext useStateDeclaration() throws RecognitionException {
		UseStateDeclarationContext _localctx = new UseStateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_useStateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			match(CONST);
			setState(1165);
			match(LSBRACKET);
			setState(1166);
			id();
			setState(1167);
			match(COMMA);
			setState(1168);
			id();
			setState(1169);
			match(RSBRACKET);
			setState(1170);
			match(EQUAL);
			setState(1171);
			match(USESTATE);
			setState(1172);
			match(LPAREN);
			setState(1177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1173);
				id();
				}
				break;
			case 2:
				{
				setState(1174);
				literal();
				}
				break;
			case 3:
				{
				setState(1175);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(1176);
				expression(0);
				}
				break;
			}
			setState(1179);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseRefDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode USEREF() { return getToken(ReactParser.USEREF, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UseRefDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useRefDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseRefDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseRefDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseRefDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseRefDeclarationContext useRefDeclaration() throws RecognitionException {
		UseRefDeclarationContext _localctx = new UseRefDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_useRefDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(CONST);
			setState(1182);
			id();
			setState(1183);
			match(EQUAL);
			setState(1184);
			match(USEREF);
			setState(1185);
			match(LPAREN);
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1186);
				id();
				}
				break;
			case 2:
				{
				setState(1187);
				literal();
				}
				break;
			case 3:
				{
				setState(1188);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(1189);
				expression(0);
				}
				break;
			}
			setState(1192);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseEffectDeclarationContext extends ParserRuleContext {
		public TerminalNode USEEFFECT() { return getToken(ReactParser.USEEFFECT, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public AnonymousFunctionDeclarationContext anonymousFunctionDeclaration() {
			return getRuleContext(AnonymousFunctionDeclarationContext.class,0);
		}
		public ArrowFunctionDeclarationContext arrowFunctionDeclaration() {
			return getRuleContext(ArrowFunctionDeclarationContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public DependencyArrayContext dependencyArray() {
			return getRuleContext(DependencyArrayContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public UseEffectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseEffectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseEffectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseEffectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectDeclarationContext useEffectDeclaration() throws RecognitionException {
		UseEffectDeclarationContext _localctx = new UseEffectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_useEffectDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			match(USEEFFECT);
			setState(1195);
			match(LPAREN);
			setState(1198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				setState(1196);
				anonymousFunctionDeclaration();
				}
				break;
			case LPAREN:
				{
				setState(1197);
				arrowFunctionDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1200);
				match(COMMA);
				setState(1201);
				dependencyArray();
				setState(1202);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DependencyArrayContext extends ParserRuleContext {
		public TerminalNode LSBRACKET() { return getToken(ReactParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(ReactParser.RSBRACKET, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public DependencyArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependencyArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDependencyArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDependencyArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDependencyArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependencyArrayContext dependencyArray() throws RecognitionException {
		DependencyArrayContext _localctx = new DependencyArrayContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_dependencyArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1206);
			match(LSBRACKET);
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1207);
				id();
				}
				}
				setState(1212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1213);
				match(COMMA);
				setState(1214);
				id();
				}
				}
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1220);
			match(RSBRACKET);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropsContext extends ParserRuleContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Null() { return getToken(ReactParser.Null, 0); }
		public PropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_props; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsContext props() throws RecognitionException {
		PropsContext _localctx = new PropsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_props);
		try {
			setState(1225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				objectLiteral();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1223);
				id();
				}
				break;
			case Null:
				enterOuterAlt(_localctx, 3);
				{
				setState(1224);
				match(Null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PureReactElementContext extends ParserRuleContext {
		public TerminalNode CREATEELEMENT() { return getToken(ReactParser.CREATEELEMENT, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public PropsContext props() {
			return getRuleContext(PropsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<PureReactElementContext> pureReactElement() {
			return getRuleContexts(PureReactElementContext.class);
		}
		public PureReactElementContext pureReactElement(int i) {
			return getRuleContext(PureReactElementContext.class,i);
		}
		public List<JsxContext> jsx() {
			return getRuleContexts(JsxContext.class);
		}
		public JsxContext jsx(int i) {
			return getRuleContext(JsxContext.class,i);
		}
		public List<SpreadOperationContext> spreadOperation() {
			return getRuleContexts(SpreadOperationContext.class);
		}
		public SpreadOperationContext spreadOperation(int i) {
			return getRuleContext(SpreadOperationContext.class,i);
		}
		public PureReactElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureReactElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPureReactElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPureReactElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPureReactElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureReactElementContext pureReactElement() throws RecognitionException {
		PureReactElementContext _localctx = new PureReactElementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pureReactElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			match(CREATEELEMENT);
			setState(1228);
			match(LPAREN);
			setState(1229);
			expression(0);
			setState(1230);
			match(COMMA);
			setState(1231);
			props();
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1232);
				match(COMMA);
				setState(1239);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Integer:
				case Float:
				case String:
				case Boolean:
				case Undefined:
				case Null:
					{
					setState(1233);
					literal();
					}
					break;
				case IDENTIFIER:
					{
					setState(1234);
					id();
					}
					break;
				case LSBRACKET:
					{
					setState(1235);
					array();
					}
					break;
				case CREATEELEMENT:
					{
					setState(1236);
					pureReactElement();
					}
					break;
				case LESS_THAN:
					{
					setState(1237);
					jsx();
					}
					break;
				case DOT:
					{
					setState(1238);
					spreadOperation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1246);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Component_return_statmentContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ReactParser.RETURN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ReactParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ReactParser.SEMI, i);
		}
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
		}
		public TerminalNode Null() { return getToken(ReactParser.Null, 0); }
		public Component_return_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_return_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComponent_return_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComponent_return_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComponent_return_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_return_statmentContext component_return_statment() throws RecognitionException {
		Component_return_statmentContext _localctx = new Component_return_statmentContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_component_return_statment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			match(RETURN);
			setState(1259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				{
				setState(1249);
				match(LPAREN);
				setState(1252);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS_THAN:
					{
					setState(1250);
					jsx();
					}
					break;
				case Null:
					{
					setState(1251);
					match(Null);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1254);
				match(RPAREN);
				}
				}
				break;
			case LESS_THAN:
			case Null:
				{
				setState(1257);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS_THAN:
					{
					setState(1255);
					jsx();
					}
					break;
				case Null:
					{
					setState(1256);
					match(Null);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1261);
					match(SEMI);
					}
					} 
				}
				setState(1266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionalComponentContext functionalComponent() {
			return getRuleContext(FunctionalComponentContext.class,0);
		}
		public ExportDefaultContext exportDefault() {
			return getRuleContext(ExportDefaultContext.class,0);
		}
		public TerminalNode EXPORT_DEFAULT() { return getToken(ReactParser.EXPORT_DEFAULT, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ReactParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ReactParser.SEMI, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1267);
					statement();
					}
					} 
				}
				setState(1272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			}
			setState(1301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case CONST:
				{
				{
				setState(1273);
				functionalComponent();
				setState(1277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1274);
						statement();
						}
						} 
					}
					setState(1279);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
				}
				setState(1280);
				exportDefault();
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1281);
					match(SEMI);
					}
					}
					setState(1286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case EXPORT_DEFAULT:
				{
				{
				setState(1287);
				match(EXPORT_DEFAULT);
				setState(1288);
				functionalComponent();
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
					{
					{
					setState(1289);
					statement();
					}
					}
					setState(1294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1295);
					match(SEMI);
					}
					}
					setState(1300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionalComponentContext extends ParserRuleContext {
		public ArrowComponentDeclarationContext arrowComponentDeclaration() {
			return getRuleContext(ArrowComponentDeclarationContext.class,0);
		}
		public NamedComponentDeclarationContext namedComponentDeclaration() {
			return getRuleContext(NamedComponentDeclarationContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(ReactParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ReactParser.SEMI, i);
		}
		public FunctionalComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionalComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionalComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionalComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalComponentContext functionalComponent() throws RecognitionException {
		FunctionalComponentContext _localctx = new FunctionalComponentContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_functionalComponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(1303);
				arrowComponentDeclaration();
				}
				break;
			case FUNCTION:
				{
				setState(1304);
				namedComponentDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1307);
					match(SEMI);
					}
					} 
				}
				setState(1312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public ComponentFunctionBodyContext componentFunctionBody() {
			return getRuleContext(ComponentFunctionBodyContext.class,0);
		}
		public PropsContext props() {
			return getRuleContext(PropsContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public ArrowComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowComponentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrowComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrowComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrowComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowComponentDeclarationContext arrowComponentDeclaration() throws RecognitionException {
		ArrowComponentDeclarationContext _localctx = new ArrowComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arrowComponentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			match(CONST);
			setState(1314);
			id();
			setState(1315);
			match(EQUAL);
			setState(1316);
			match(LPAREN);
			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 134221825L) != 0)) {
				{
				setState(1317);
				props();
				}
			}

			setState(1320);
			match(RPAREN);
			setState(1321);
			match(ARROW);
			setState(1327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				{
				setState(1322);
				match(LCURLY);
				setState(1323);
				componentFunctionBody();
				setState(1324);
				match(RCURLY);
				}
				}
				break;
			case 2:
				{
				setState(1326);
				componentFunctionBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ReactParser.FUNCTION, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public ComponentFunctionBodyContext componentFunctionBody() {
			return getRuleContext(ComponentFunctionBodyContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public PropsContext props() {
			return getRuleContext(PropsContext.class,0);
		}
		public NamedComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedComponentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterNamedComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitNamedComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitNamedComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedComponentDeclarationContext namedComponentDeclaration() throws RecognitionException {
		NamedComponentDeclarationContext _localctx = new NamedComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_namedComponentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			match(FUNCTION);
			setState(1330);
			id();
			setState(1331);
			match(LPAREN);
			setState(1333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 134221825L) != 0)) {
				{
				setState(1332);
				props();
				}
			}

			setState(1335);
			match(RPAREN);
			setState(1336);
			match(LCURLY);
			setState(1337);
			componentFunctionBody();
			setState(1338);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentFunctionBodyContext extends ParserRuleContext {
		public Component_return_statmentContext component_return_statment() {
			return getRuleContext(Component_return_statmentContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ComponentFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentFunctionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComponentFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComponentFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComponentFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentFunctionBodyContext componentFunctionBody() throws RecognitionException {
		ComponentFunctionBodyContext _localctx = new ComponentFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_componentFunctionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -260442332885536668L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 5695L) != 0)) {
				{
				{
				setState(1340);
				statement();
				}
				}
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1346);
			component_return_statment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 24:
			return memberExpression_sempred((MemberExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberExpression_sempred(MemberExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001L\u0545\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0099\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u009f\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00a3\b\u0006\u0001\u0006\u0005\u0006\u00a6\b\u0006\n\u0006\f\u0006\u00a9"+
		"\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ae\b\u0007"+
		"\n\u0007\f\u0007\u00b1\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00b7\b\u0007\n\u0007\f\u0007\u00ba\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00be\b\u0007\u0003\u0007\u00c0\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00c4\b\u0007\u0003\u0007\u00c6\b\u0007"+
		"\u0001\u0007\u0005\u0007\u00c9\b\u0007\n\u0007\f\u0007\u00cc\t\u0007\u0003"+
		"\u0007\u00ce\b\u0007\u0001\u0007\u0003\u0007\u00d1\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00d5\b\u0007\n\u0007\f\u0007\u00d8\t\u0007\u0001"+
		"\u0007\u0003\u0007\u00db\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00e0"+
		"\b\b\n\b\f\b\u00e3\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00e9\b"+
		"\b\n\b\f\b\u00ec\t\b\u0001\b\u0001\b\u0003\b\u00f0\b\b\u0003\b\u00f2\b"+
		"\b\u0001\b\u0001\b\u0003\b\u00f6\b\b\u0003\b\u00f8\b\b\u0001\b\u0005\b"+
		"\u00fb\b\b\n\b\f\b\u00fe\t\b\u0003\b\u0100\b\b\u0001\b\u0003\b\u0103\b"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u010a\b\t\n\t\f\t\u010d"+
		"\t\t\u0001\t\u0001\t\u0003\t\u0111\b\t\u0003\t\u0113\b\t\u0001\t\u0001"+
		"\t\u0003\t\u0117\b\t\u0003\t\u0119\b\t\u0001\t\u0005\t\u011c\b\t\n\t\f"+
		"\t\u011f\t\t\u0003\t\u0121\b\t\u0001\t\u0003\t\u0124\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0005\n\u0129\b\n\n\n\f\n\u012c\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0135\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u013d\b\n\u0001\n\u0001\n\u0003\n\u0141"+
		"\b\n\u0003\n\u0143\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0148\b\u000b\n\u000b\f\u000b\u014b\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0151\b\u000b\n\u000b\f\u000b\u0154\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0158\b\u000b\u0003\u000b\u015a\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u015e\b\u000b\u0003\u000b\u0160"+
		"\b\u000b\u0001\u000b\u0005\u000b\u0163\b\u000b\n\u000b\f\u000b\u0166\t"+
		"\u000b\u0003\u000b\u0168\b\u000b\u0001\u000b\u0003\u000b\u016b\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0172\b\f\n\f"+
		"\f\f\u0175\t\f\u0001\f\u0001\f\u0003\f\u0179\b\f\u0003\f\u017b\b\f\u0001"+
		"\f\u0001\f\u0003\f\u017f\b\f\u0003\f\u0181\b\f\u0001\f\u0005\f\u0184\b"+
		"\f\n\f\f\f\u0187\t\f\u0003\f\u0189\b\f\u0001\f\u0003\f\u018c\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0192\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u019b\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u01a1\b\r\u0001\r\u0001\r\u0001\r\u0005\r\u01a6\b\r\n\r\f\r"+
		"\u01a9\t\r\u0001\r\u0001\r\u0003\r\u01ad\b\r\u0003\r\u01af\b\r\u0001\r"+
		"\u0001\r\u0003\r\u01b3\b\r\u0003\r\u01b5\b\r\u0001\r\u0005\r\u01b8\b\r"+
		"\n\r\f\r\u01bb\t\r\u0003\r\u01bd\b\r\u0001\r\u0003\r\u01c0\b\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u01c7\b\u000e"+
		"\n\u000e\f\u000e\u01ca\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01ce"+
		"\b\u000e\u0003\u000e\u01d0\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u01d4\b\u000e\u0003\u000e\u01d6\b\u000e\u0001\u000e\u0005\u000e\u01d9"+
		"\b\u000e\n\u000e\f\u000e\u01dc\t\u000e\u0003\u000e\u01de\b\u000e\u0001"+
		"\u000e\u0003\u000e\u01e1\b\u000e\u0001\u000e\u0003\u000e\u01e4\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u01e8\b\u000e\u0001\u000e\u0003\u000e"+
		"\u01eb\b\u000e\u0001\u000e\u0005\u000e\u01ee\b\u000e\n\u000e\f\u000e\u01f1"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u01f8\b\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u01fc\b\u000f"+
		"\n\u000f\f\u000f\u01ff\t\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0203"+
		"\b\u000f\u0003\u000f\u0205\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0209\b\u000f\u0003\u000f\u020b\b\u000f\u0001\u000f\u0005\u000f\u020e"+
		"\b\u000f\n\u000f\f\u000f\u0211\t\u000f\u0003\u000f\u0213\b\u000f\u0001"+
		"\u000f\u0003\u000f\u0216\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u021d\b\u0010\n\u0010\f\u0010\u0220\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0224\b\u0010\u0003\u0010\u0226\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u022a\b\u0010\u0003\u0010\u022c"+
		"\b\u0010\u0001\u0010\u0005\u0010\u022f\b\u0010\n\u0010\f\u0010\u0232\t"+
		"\u0010\u0003\u0010\u0234\b\u0010\u0001\u0010\u0003\u0010\u0237\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u023e\b\u0011\u0001\u0011\u0005\u0011\u0241\b\u0011\n\u0011\f\u0011\u0244"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u0248\b\u0012\n\u0012\f\u0012"+
		"\u024b\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u024f\b\u0012\n\u0012"+
		"\f\u0012\u0252\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0256\b\u0012"+
		"\n\u0012\f\u0012\u0259\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u025d"+
		"\b\u0012\n\u0012\f\u0012\u0260\t\u0012\u0005\u0012\u0262\b\u0012\n\u0012"+
		"\f\u0012\u0265\t\u0012\u0001\u0012\u0003\u0012\u0268\b\u0012\u0003\u0012"+
		"\u026a\b\u0012\u0001\u0012\u0005\u0012\u026d\b\u0012\n\u0012\f\u0012\u0270"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0277\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u027d\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0287\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0292\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u029a"+
		"\b\u0017\n\u0017\f\u0017\u029d\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u02a4\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u02ab\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u02b2\b\u0018"+
		"\u0005\u0018\u02b4\b\u0018\n\u0018\f\u0018\u02b7\t\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u02bf"+
		"\b\u001a\n\u001a\f\u001a\u02c2\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u02ce\b\u001b\u0003\u001b\u02d0\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u02d4\b\u001c\n\u001c\f\u001c\u02d7\t\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u02db\b\u001c\n\u001c\f\u001c\u02de"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u02e2\b\u001c\n\u001c\f\u001c"+
		"\u02e5\t\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u02e9\b\u001c\n\u001c"+
		"\f\u001c\u02ec\t\u001c\u0005\u001c\u02ee\b\u001c\n\u001c\f\u001c\u02f1"+
		"\t\u001c\u0001\u001c\u0003\u001c\u02f4\b\u001c\u0003\u001c\u02f6\b\u001c"+
		"\u0001\u001c\u0005\u001c\u02f9\b\u001c\n\u001c\f\u001c\u02fc\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0307\b\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u030f"+
		"\b\u001f\u0001 \u0005 \u0312\b \n \f \u0315\t \u0001 \u0003 \u0318\b "+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u0330\b!\u0001!\u0005!\u0333\b!\n!\f!\u0336\t!"+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u0342\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u034e\b\"\u0003\"\u0350\b\""+
		"\u0001\"\u0005\"\u0353\b\"\n\"\f\"\u0356\t\"\u0001#\u0003#\u0359\b#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u0361\b#\n#\f#\u0364\t#\u0003"+
		"#\u0366\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0005$\u0371\b$\n$\f$\u0374\t$\u0003$\u0376\b$\u0001$\u0001$\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0383"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u038a\b%\n%\f%\u038d\t%"+
		"\u0003%\u038f\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0003&\u0399\b&\u0001\'\u0003\'\u039c\b\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u03a3\b\'\n\'\f\'\u03a6\t\'\u0003\'\u03a8\b\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0003(\u03b0\b(\u0003(\u03b2\b"+
		"(\u0001)\u0001)\u0001)\u0003)\u03b7\b)\u0001)\u0003)\u03ba\b)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0003*\u03c2\b*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0005+\u03cb\b+\n+\f+\u03ce\t+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u03d6\b+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u03dd\b,\u0003,\u03df\b,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u03ec\b-\n-\f-\u03ef\t-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u03f9\b-\n-"+
		"\f-\u03fc\t-\u0001-\u0001-\u0001-\u0003-\u0401\b-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0003.\u040a\b.\u0001.\u0001.\u0003.\u040e"+
		"\b.\u0001/\u0001/\u0001/\u0003/\u0413\b/\u00010\u00010\u00010\u00010\u0005"+
		"0\u0419\b0\n0\f0\u041c\t0\u00010\u00050\u041f\b0\n0\f0\u0422\t0\u0001"+
		"0\u00010\u00011\u00011\u00011\u00011\u00011\u00051\u042b\b1\n1\f1\u042e"+
		"\t1\u00011\u00011\u00012\u00012\u00012\u00012\u00052\u0436\b2\n2\f2\u0439"+
		"\t2\u00012\u00052\u043c\b2\n2\f2\u043f\t2\u00012\u00012\u00012\u00013"+
		"\u00013\u00013\u00013\u00013\u00053\u0449\b3\n3\f3\u044c\t3\u00013\u0003"+
		"3\u044f\b3\u00013\u00053\u0452\b3\n3\f3\u0455\t3\u00033\u0457\b3\u0001"+
		"3\u00013\u00014\u00014\u00014\u00014\u00054\u045f\b4\n4\f4\u0462\t4\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00055\u046c\b5\n5"+
		"\f5\u046f\t5\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00036\u047d\b6\u00036\u047f\b6\u00036\u0481\b"+
		"6\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u048b"+
		"\b7\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00038\u049a\b8\u00018\u00018\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u04a7\b9\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0001:\u0003:\u04af\b:\u0001:\u0001:\u0001:\u0001"+
		":\u0003:\u04b5\b:\u0001;\u0001;\u0005;\u04b9\b;\n;\f;\u04bc\t;\u0001;"+
		"\u0001;\u0005;\u04c0\b;\n;\f;\u04c3\t;\u0001;\u0001;\u0001<\u0001<\u0001"+
		"<\u0003<\u04ca\b<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0003=\u04d8\b=\u0005=\u04da\b=\n=\f=\u04dd"+
		"\t=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0003>\u04e5\b>\u0001>\u0001"+
		">\u0001>\u0003>\u04ea\b>\u0003>\u04ec\b>\u0001>\u0005>\u04ef\b>\n>\f>"+
		"\u04f2\t>\u0001?\u0005?\u04f5\b?\n?\f?\u04f8\t?\u0001?\u0001?\u0005?\u04fc"+
		"\b?\n?\f?\u04ff\t?\u0001?\u0001?\u0005?\u0503\b?\n?\f?\u0506\t?\u0001"+
		"?\u0001?\u0001?\u0005?\u050b\b?\n?\f?\u050e\t?\u0001?\u0005?\u0511\b?"+
		"\n?\f?\u0514\t?\u0003?\u0516\b?\u0001@\u0001@\u0003@\u051a\b@\u0001@\u0005"+
		"@\u051d\b@\n@\f@\u0520\t@\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u0527"+
		"\bA\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u0530\bA\u0001"+
		"B\u0001B\u0001B\u0001B\u0003B\u0536\bB\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001C\u0005C\u053e\bC\nC\fC\u0541\tC\u0001C\u0001C\u0001C\u0000\u0002"+
		".0D\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0000\u0007\u0001\u0000+,\u0001\u0000\u0015!\u0001"+
		"\u0000%*\u0001\u0000\"#\u0001\u0000\t\n\u0002\u000056:=\u0001\u0000>@"+
		"\u0627\u0000\u0088\u0001\u0000\u0000\u0000\u0002\u008a\u0001\u0000\u0000"+
		"\u0000\u0004\u008c\u0001\u0000\u0000\u0000\u0006\u008e\u0001\u0000\u0000"+
		"\u0000\b\u0098\u0001\u0000\u0000\u0000\n\u009a\u0001\u0000\u0000\u0000"+
		"\f\u00a0\u0001\u0000\u0000\u0000\u000e\u00aa\u0001\u0000\u0000\u0000\u0010"+
		"\u00dc\u0001\u0000\u0000\u0000\u0012\u0106\u0001\u0000\u0000\u0000\u0014"+
		"\u012a\u0001\u0000\u0000\u0000\u0016\u0144\u0001\u0000\u0000\u0000\u0018"+
		"\u016e\u0001\u0000\u0000\u0000\u001a\u0196\u0001\u0000\u0000\u0000\u001c"+
		"\u01c3\u0001\u0000\u0000\u0000\u001e\u01f2\u0001\u0000\u0000\u0000 \u0219"+
		"\u0001\u0000\u0000\u0000\"\u023d\u0001\u0000\u0000\u0000$\u0245\u0001"+
		"\u0000\u0000\u0000&\u0273\u0001\u0000\u0000\u0000(\u027c\u0001\u0000\u0000"+
		"\u0000*\u027e\u0001\u0000\u0000\u0000,\u0286\u0001\u0000\u0000\u0000."+
		"\u0291\u0001\u0000\u0000\u00000\u02aa\u0001\u0000\u0000\u00002\u02b8\u0001"+
		"\u0000\u0000\u00004\u02ba\u0001\u0000\u0000\u00006\u02c3\u0001\u0000\u0000"+
		"\u00008\u02d1\u0001\u0000\u0000\u0000:\u0306\u0001\u0000\u0000\u0000<"+
		"\u0308\u0001\u0000\u0000\u0000>\u030e\u0001\u0000\u0000\u0000@\u0313\u0001"+
		"\u0000\u0000\u0000B\u032f\u0001\u0000\u0000\u0000D\u0337\u0001\u0000\u0000"+
		"\u0000F\u0358\u0001\u0000\u0000\u0000H\u036c\u0001\u0000\u0000\u0000J"+
		"\u0384\u0001\u0000\u0000\u0000L\u0398\u0001\u0000\u0000\u0000N\u039b\u0001"+
		"\u0000\u0000\u0000P\u03ab\u0001\u0000\u0000\u0000R\u03b6\u0001\u0000\u0000"+
		"\u0000T\u03bb\u0001\u0000\u0000\u0000V\u03d5\u0001\u0000\u0000\u0000X"+
		"\u03d7\u0001\u0000\u0000\u0000Z\u03e3\u0001\u0000\u0000\u0000\\\u0409"+
		"\u0001\u0000\u0000\u0000^\u0412\u0001\u0000\u0000\u0000`\u0414\u0001\u0000"+
		"\u0000\u0000b\u0425\u0001\u0000\u0000\u0000d\u0431\u0001\u0000\u0000\u0000"+
		"f\u0443\u0001\u0000\u0000\u0000h\u045a\u0001\u0000\u0000\u0000j\u0465"+
		"\u0001\u0000\u0000\u0000l\u0480\u0001\u0000\u0000\u0000n\u0482\u0001\u0000"+
		"\u0000\u0000p\u048c\u0001\u0000\u0000\u0000r\u049d\u0001\u0000\u0000\u0000"+
		"t\u04aa\u0001\u0000\u0000\u0000v\u04b6\u0001\u0000\u0000\u0000x\u04c9"+
		"\u0001\u0000\u0000\u0000z\u04cb\u0001\u0000\u0000\u0000|\u04e0\u0001\u0000"+
		"\u0000\u0000~\u04f6\u0001\u0000\u0000\u0000\u0080\u0519\u0001\u0000\u0000"+
		"\u0000\u0082\u0521\u0001\u0000\u0000\u0000\u0084\u0531\u0001\u0000\u0000"+
		"\u0000\u0086\u053f\u0001\u0000\u0000\u0000\u0088\u0089\u0005L\u0000\u0000"+
		"\u0089\u0001\u0001\u0000\u0000\u0000\u008a\u008b\u0007\u0000\u0000\u0000"+
		"\u008b\u0003\u0001\u0000\u0000\u0000\u008c\u008d\u0007\u0001\u0000\u0000"+
		"\u008d\u0005\u0001\u0000\u0000\u0000\u008e\u008f\u0007\u0002\u0000\u0000"+
		"\u008f\u0007\u0001\u0000\u0000\u0000\u0090\u0099\u0003^/\u0000\u0091\u0099"+
		"\u0003*\u0015\u0000\u0092\u0099\u0003$\u0012\u0000\u0093\u0099\u0003\u0000"+
		"\u0000\u0000\u0094\u0099\u0003z=\u0000\u0095\u0099\u00038\u001c\u0000"+
		"\u0096\u0099\u0003N\'\u0000\u0097\u0099\u0003.\u0017\u0000\u0098\u0090"+
		"\u0001\u0000\u0000\u0000\u0098\u0091\u0001\u0000\u0000\u0000\u0098\u0092"+
		"\u0001\u0000\u0000\u0000\u0098\u0093\u0001\u0000\u0000\u0000\u0098\u0094"+
		"\u0001\u0000\u0000\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\t\u0001"+
		"\u0000\u0000\u0000\u009a\u009e\u0003\b\u0004\u0000\u009b\u009c\u0003\u0006"+
		"\u0003\u0000\u009c\u009d\u0003\b\u0004\u0000\u009d\u009f\u0001\u0000\u0000"+
		"\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u000b\u0001\u0000\u0000\u0000\u00a0\u00a7\u0003\n\u0005\u0000"+
		"\u00a1\u00a3\u0007\u0003\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a6\u0003\n\u0005\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\r\u0001\u0000\u0000\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0002\u0000\u0000\u00ab\u00af"+
		"\u0005-\u0000\u0000\u00ac\u00ae\u0005$\u0000\u0000\u00ad\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\f\u0006"+
		"\u0000\u00b3\u00b4\u0005.\u0000\u0000\u00b4\u00cd\u00051\u0000\u0000\u00b5"+
		"\u00b7\u0003B!\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bf\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bd\u0007\u0004\u0000\u0000\u00bc\u00be\u0005"+
		"4\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c3\u0007\u0004\u0000\u0000\u00c2\u00c4\u00054\u0000"+
		"\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c9\u0003B!\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cd\u00b8\u0001\u0000\u0000\u0000\u00cd"+
		"\u00c5\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d1\u0003D\"\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d6"+
		"\u00052\u0000\u0000\u00d3\u00d5\u0003\u0010\b\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00da\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00db\u0003"+
		"\u0012\t\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u000f\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0003"+
		"\u0000\u0000\u00dd\u00e1\u0005-\u0000\u0000\u00de\u00e0\u0005$\u0000\u0000"+
		"\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0003\f\u0006\u0000\u00e5\u00e6\u0005.\u0000\u0000\u00e6"+
		"\u00ff\u00051\u0000\u0000\u00e7\u00e9\u0003B!\u0000\u00e8\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f1\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ef\u0007"+
		"\u0004\u0000\u0000\u00ee\u00f0\u00054\u0000\u0000\u00ef\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u0100\u0001\u0000\u0000\u0000\u00f3\u00f5\u0007\u0004"+
		"\u0000\u0000\u00f4\u00f6\u00054\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f3\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fc\u0001\u0000\u0000\u0000\u00f9\u00fb\u0003B!\u0000\u00fa"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ff\u00f7\u0001\u0000\u0000\u0000\u0100"+
		"\u0102\u0001\u0000\u0000\u0000\u0101\u0103\u0003D\"\u0000\u0102\u0101"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u00052\u0000\u0000\u0105\u0011\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0005\u0004\u0000\u0000\u0107\u0120\u0005"+
		"1\u0000\u0000\u0108\u010a\u0003B!\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0112\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0110\u0007\u0004\u0000"+
		"\u0000\u010f\u0111\u00054\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000"+
		"\u0112\u010e\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000"+
		"\u0113\u0121\u0001\u0000\u0000\u0000\u0114\u0116\u0007\u0004\u0000\u0000"+
		"\u0115\u0117\u00054\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118"+
		"\u0114\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119"+
		"\u011d\u0001\u0000\u0000\u0000\u011a\u011c\u0003B!\u0000\u011b\u011a\u0001"+
		"\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0121\u0001"+
		"\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u010b\u0001"+
		"\u0000\u0000\u0000\u0120\u0118\u0001\u0000\u0000\u0000\u0121\u0123\u0001"+
		"\u0000\u0000\u0000\u0122\u0124\u0003D\"\u0000\u0123\u0122\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u00052\u0000\u0000\u0126\u0013\u0001\u0000\u0000"+
		"\u0000\u0127\u0129\u0005$\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012e\u0003\f\u0006\u0000\u012e"+
		"\u0134\u00059\u0000\u0000\u012f\u0130\u0005-\u0000\u0000\u0130\u0131\u0003"+
		"B!\u0000\u0131\u0132\u0005.\u0000\u0000\u0132\u0135\u0001\u0000\u0000"+
		"\u0000\u0133\u0135\u0003B!\u0000\u0134\u012f\u0001\u0000\u0000\u0000\u0134"+
		"\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"\u0142\u00058\u0000\u0000\u0137\u0138\u0005-\u0000\u0000\u0138\u013d\u0003"+
		"B!\u0000\u0139\u013a\u0003\u0014\n\u0000\u013a\u013b\u0005.\u0000\u0000"+
		"\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u0137\u0001\u0000\u0000\u0000"+
		"\u013c\u0139\u0001\u0000\u0000\u0000\u013d\u0143\u0001\u0000\u0000\u0000"+
		"\u013e\u0141\u0003B!\u0000\u013f\u0141\u0003\u0014\n\u0000\u0140\u013e"+
		"\u0001\u0000\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0143"+
		"\u0001\u0000\u0000\u0000\u0142\u013c\u0001\u0000\u0000\u0000\u0142\u0140"+
		"\u0001\u0000\u0000\u0000\u0143\u0015\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0005\u0006\u0000\u0000\u0145\u0149\u0005-\u0000\u0000\u0146\u0148\u0005"+
		"$\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0003\f\u0006\u0000\u014d\u014e\u0005.\u0000"+
		"\u0000\u014e\u0167\u00051\u0000\u0000\u014f\u0151\u0003B!\u0000\u0150"+
		"\u014f\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152"+
		"\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153"+
		"\u0159\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155"+
		"\u0157\u0007\u0004\u0000\u0000\u0156\u0158\u00054\u0000\u0000\u0157\u0156"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015a"+
		"\u0001\u0000\u0000\u0000\u0159\u0155\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a\u0168\u0001\u0000\u0000\u0000\u015b\u015d"+
		"\u0007\u0004\u0000\u0000\u015c\u015e\u00054\u0000\u0000\u015d\u015c\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0001"+
		"\u0000\u0000\u0000\u015f\u015b\u0001\u0000\u0000\u0000\u015f\u0160\u0001"+
		"\u0000\u0000\u0000\u0160\u0164\u0001\u0000\u0000\u0000\u0161\u0163\u0003"+
		"B!\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000"+
		"\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000"+
		"\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000"+
		"\u0000\u0167\u0152\u0001\u0000\u0000\u0000\u0167\u015f\u0001\u0000\u0000"+
		"\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u016b\u0003D\"\u0000"+
		"\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u00052\u0000\u0000\u016d"+
		"\u0017\u0001\u0000\u0000\u0000\u016e\u016f\u0005\f\u0000\u0000\u016f\u0188"+
		"\u00051\u0000\u0000\u0170\u0172\u0003B!\u0000\u0171\u0170\u0001\u0000"+
		"\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u017a\u0001\u0000"+
		"\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0178\u0007\u0004"+
		"\u0000\u0000\u0177\u0179\u00054\u0000\u0000\u0178\u0177\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017b\u0001\u0000\u0000"+
		"\u0000\u017a\u0176\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b\u0189\u0001\u0000\u0000\u0000\u017c\u017e\u0007\u0004\u0000"+
		"\u0000\u017d\u017f\u00054\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000"+
		"\u0180\u017c\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u0185\u0001\u0000\u0000\u0000\u0182\u0184\u0003B!\u0000\u0183\u0182"+
		"\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0189"+
		"\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0173"+
		"\u0001\u0000\u0000\u0000\u0188\u0180\u0001\u0000\u0000\u0000\u0189\u018b"+
		"\u0001\u0000\u0000\u0000\u018a\u018c\u0003D\"\u0000\u018b\u018a\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u00052\u0000\u0000\u018e\u018f\u0005\u0006"+
		"\u0000\u0000\u018f\u0191\u0005-\u0000\u0000\u0190\u0192\u0005$\u0000\u0000"+
		"\u0191\u0190\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000"+
		"\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0003\f\u0006\u0000\u0194"+
		"\u0195\u0005.\u0000\u0000\u0195\u0019\u0001\u0000\u0000\u0000\u0196\u0197"+
		"\u0005\u0005\u0000\u0000\u0197\u019a\u0005-\u0000\u0000\u0198\u019b\u0003"+
		"4\u001a\u0000\u0199\u019b\u00036\u001b\u0000\u019a\u0198\u0001\u0000\u0000"+
		"\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u00054\u0000\u0000"+
		"\u019d\u019e\u0003\f\u0006\u0000\u019e\u01a0\u00054\u0000\u0000\u019f"+
		"\u01a1\u0003.\u0017\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0005.\u0000\u0000\u01a3\u01bc\u00051\u0000\u0000\u01a4\u01a6\u0003B"+
		"!\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a8\u01ae\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ac\u0007\u0004\u0000\u0000\u01ab\u01ad\u00054\u0000\u0000"+
		"\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000"+
		"\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae\u01aa\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01bd\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b2\u0007\u0004\u0000\u0000\u01b1\u01b3\u00054\u0000\u0000\u01b2"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b4\u01b0\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b9\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b8\u0003B!\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001"+
		"\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bc\u01a7\u0001\u0000\u0000\u0000\u01bc\u01b4\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000\u0000\u01be\u01c0\u0003"+
		"D\"\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u00052\u0000"+
		"\u0000\u01c2\u001b\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005\r\u0000\u0000"+
		"\u01c4\u01dd\u00051\u0000\u0000\u01c5\u01c7\u0003B!\u0000\u01c6\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cf"+
		"\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cd"+
		"\u0007\u0004\u0000\u0000\u01cc\u01ce\u00054\u0000\u0000\u01cd\u01cc\u0001"+
		"\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0\u0001"+
		"\u0000\u0000\u0000\u01cf\u01cb\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d0\u01de\u0001\u0000\u0000\u0000\u01d1\u01d3\u0007"+
		"\u0004\u0000\u0000\u01d2\u01d4\u00054\u0000\u0000\u01d3\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d1\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d6\u01da\u0001\u0000\u0000\u0000\u01d7\u01d9\u0003B!\u0000"+
		"\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000"+
		"\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000"+
		"\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000"+
		"\u01dd\u01c8\u0001\u0000\u0000\u0000\u01dd\u01d5\u0001\u0000\u0000\u0000"+
		"\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u01e1\u0003\"\u0011\u0000\u01e0"+
		"\u01df\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e2\u01e4\u0003D\"\u0000\u01e3\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e7\u00052\u0000\u0000\u01e6\u01e8\u0003"+
		"\u001e\u000f\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001"+
		"\u0000\u0000\u0000\u01e8\u01ea\u0001\u0000\u0000\u0000\u01e9\u01eb\u0003"+
		" \u0010\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ef\u0001\u0000\u0000\u0000\u01ec\u01ee\u00054\u0000"+
		"\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000"+
		"\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f0\u001d\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f7\u0005\u000e\u0000\u0000\u01f3\u01f4\u0005-\u0000\u0000"+
		"\u01f4\u01f5\u0003\u0000\u0000\u0000\u01f5\u01f6\u0005.\u0000\u0000\u01f6"+
		"\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f3\u0001\u0000\u0000\u0000\u01f7"+
		"\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9"+
		"\u0212\u00051\u0000\u0000\u01fa\u01fc\u0003B!\u0000\u01fb\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u0204\u0001"+
		"\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0202\u0007"+
		"\u0004\u0000\u0000\u0201\u0203\u00054\u0000\u0000\u0202\u0201\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0205\u0001\u0000"+
		"\u0000\u0000\u0204\u0200\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000"+
		"\u0000\u0000\u0205\u0213\u0001\u0000\u0000\u0000\u0206\u0208\u0007\u0004"+
		"\u0000\u0000\u0207\u0209\u00054\u0000\u0000\u0208\u0207\u0001\u0000\u0000"+
		"\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020b\u0001\u0000\u0000"+
		"\u0000\u020a\u0206\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000"+
		"\u0000\u020b\u020f\u0001\u0000\u0000\u0000\u020c\u020e\u0003B!\u0000\u020d"+
		"\u020c\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000\u0000\u020f"+
		"\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210"+
		"\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212"+
		"\u01fd\u0001\u0000\u0000\u0000\u0212\u020a\u0001\u0000\u0000\u0000\u0213"+
		"\u0215\u0001\u0000\u0000\u0000\u0214\u0216\u0003D\"\u0000\u0215\u0214"+
		"\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0217"+
		"\u0001\u0000\u0000\u0000\u0217\u0218\u00052\u0000\u0000\u0218\u001f\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0005\u000f\u0000\u0000\u021a\u0233\u0005"+
		"1\u0000\u0000\u021b\u021d\u0003B!\u0000\u021c\u021b\u0001\u0000\u0000"+
		"\u0000\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0225\u0001\u0000\u0000"+
		"\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0223\u0007\u0004\u0000"+
		"\u0000\u0222\u0224\u00054\u0000\u0000\u0223\u0222\u0001\u0000\u0000\u0000"+
		"\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0226\u0001\u0000\u0000\u0000"+
		"\u0225\u0221\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000"+
		"\u0226\u0234\u0001\u0000\u0000\u0000\u0227\u0229\u0007\u0004\u0000\u0000"+
		"\u0228\u022a\u00054\u0000\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u0229"+
		"\u022a\u0001\u0000\u0000\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b"+
		"\u0227\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c"+
		"\u0230\u0001\u0000\u0000\u0000\u022d\u022f\u0003B!\u0000\u022e\u022d\u0001"+
		"\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000\u0230\u022e\u0001"+
		"\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0234\u0001"+
		"\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0233\u021e\u0001"+
		"\u0000\u0000\u0000\u0233\u022b\u0001\u0000\u0000\u0000\u0234\u0236\u0001"+
		"\u0000\u0000\u0000\u0235\u0237\u0003D\"\u0000\u0236\u0235\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000"+
		"\u0000\u0000\u0238\u0239\u00052\u0000\u0000\u0239!\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0005\u0010\u0000\u0000\u023b\u023e\u0003<\u001e\u0000\u023c"+
		"\u023e\u0003B!\u0000\u023d\u023a\u0001\u0000\u0000\u0000\u023d\u023c\u0001"+
		"\u0000\u0000\u0000\u023e\u0242\u0001\u0000\u0000\u0000\u023f\u0241\u0005"+
		"4\u0000\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000"+
		"\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000"+
		"\u0000\u0000\u0243#\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000"+
		"\u0000\u0245\u0249\u00051\u0000\u0000\u0246\u0248\u0003\u0002\u0001\u0000"+
		"\u0247\u0246\u0001\u0000\u0000\u0000\u0248\u024b\u0001\u0000\u0000\u0000"+
		"\u0249\u0247\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000"+
		"\u024a\u0269\u0001\u0000\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000"+
		"\u024c\u0250\u0003&\u0013\u0000\u024d\u024f\u0003\u0002\u0001\u0000\u024e"+
		"\u024d\u0001\u0000\u0000\u0000\u024f\u0252\u0001\u0000\u0000\u0000\u0250"+
		"\u024e\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251"+
		"\u0263\u0001\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0253"+
		"\u0257\u00053\u0000\u0000\u0254\u0256\u0003\u0002\u0001\u0000\u0255\u0254"+
		"\u0001\u0000\u0000\u0000\u0256\u0259\u0001\u0000\u0000\u0000\u0257\u0255"+
		"\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u025a"+
		"\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u025a\u025e"+
		"\u0003&\u0013\u0000\u025b\u025d\u0003\u0002\u0001\u0000\u025c\u025b\u0001"+
		"\u0000\u0000\u0000\u025d\u0260\u0001\u0000\u0000\u0000\u025e\u025c\u0001"+
		"\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0262\u0001"+
		"\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0261\u0253\u0001"+
		"\u0000\u0000\u0000\u0262\u0265\u0001\u0000\u0000\u0000\u0263\u0261\u0001"+
		"\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264\u0267\u0001"+
		"\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0266\u0268\u0005"+
		"3\u0000\u0000\u0267\u0266\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000"+
		"\u0000\u0000\u0268\u026a\u0001\u0000\u0000\u0000\u0269\u024c\u0001\u0000"+
		"\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026e\u0001\u0000"+
		"\u0000\u0000\u026b\u026d\u0003\u0002\u0001\u0000\u026c\u026b\u0001\u0000"+
		"\u0000\u0000\u026d\u0270\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000"+
		"\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0271\u0001\u0000"+
		"\u0000\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0271\u0272\u00052\u0000"+
		"\u0000\u0272%\u0001\u0000\u0000\u0000\u0273\u0276\u0003\u0000\u0000\u0000"+
		"\u0274\u0275\u00058\u0000\u0000\u0275\u0277\u0003(\u0014\u0000\u0276\u0274"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\'\u0001"+
		"\u0000\u0000\u0000\u0278\u027d\u0003.\u0017\u0000\u0279\u027d\u00038\u001c"+
		"\u0000\u027a\u027d\u0003$\u0012\u0000\u027b\u027d\u0003H$\u0000\u027c"+
		"\u0278\u0001\u0000\u0000\u0000\u027c\u0279\u0001\u0000\u0000\u0000\u027c"+
		"\u027a\u0001\u0000\u0000\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027d"+
		")\u0001\u0000\u0000\u0000\u027e\u027f\u0007\u0005\u0000\u0000\u027f+\u0001"+
		"\u0000\u0000\u0000\u0280\u0287\u0003*\u0015\u0000\u0281\u0287\u0003\u0000"+
		"\u0000\u0000\u0282\u0287\u0003.\u0017\u0000\u0283\u0284\u0003\u0004\u0002"+
		"\u0000\u0284\u0285\u0003,\u0016\u0000\u0285\u0287\u0001\u0000\u0000\u0000"+
		"\u0286\u0280\u0001\u0000\u0000\u0000\u0286\u0281\u0001\u0000\u0000\u0000"+
		"\u0286\u0282\u0001\u0000\u0000\u0000\u0286\u0283\u0001\u0000\u0000\u0000"+
		"\u0287-\u0001\u0000\u0000\u0000\u0288\u0289\u0006\u0017\uffff\uffff\u0000"+
		"\u0289\u0292\u0003*\u0015\u0000\u028a\u0292\u0003\u0000\u0000\u0000\u028b"+
		"\u0292\u0003^/\u0000\u028c\u0292\u00030\u0018\u0000\u028d\u028e\u0005"+
		"-\u0000\u0000\u028e\u028f\u0003.\u0017\u0000\u028f\u0290\u0005.\u0000"+
		"\u0000\u0290\u0292\u0001\u0000\u0000\u0000\u0291\u0288\u0001\u0000\u0000"+
		"\u0000\u0291\u028a\u0001\u0000\u0000\u0000\u0291\u028b\u0001\u0000\u0000"+
		"\u0000\u0291\u028c\u0001\u0000\u0000\u0000\u0291\u028d\u0001\u0000\u0000"+
		"\u0000\u0292\u029b\u0001\u0000\u0000\u0000\u0293\u0294\n\u0002\u0000\u0000"+
		"\u0294\u0295\u0003\u0004\u0002\u0000\u0295\u0296\u0003.\u0017\u0003\u0296"+
		"\u029a\u0001\u0000\u0000\u0000\u0297\u0298\n\u0001\u0000\u0000\u0298\u029a"+
		"\u0003\u0004\u0002\u0000\u0299\u0293\u0001\u0000\u0000\u0000\u0299\u0297"+
		"\u0001\u0000\u0000\u0000\u029a\u029d\u0001\u0000\u0000\u0000\u029b\u0299"+
		"\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c/\u0001"+
		"\u0000\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u02a3\u0006"+
		"\u0018\uffff\uffff\u0000\u029f\u02a4\u0003\u0000\u0000\u0000\u02a0\u02a4"+
		"\u00038\u001c\u0000\u02a1\u02a4\u0003*\u0015\u0000\u02a2\u02a4\u0003N"+
		"\'\u0000\u02a3\u029f\u0001\u0000\u0000\u0000\u02a3\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a4\u02ab\u0001\u0000\u0000\u0000\u02a5\u02a6\u0003\u0000\u0000"+
		"\u0000\u02a6\u02a7\u0005/\u0000\u0000\u02a7\u02a8\u0003*\u0015\u0000\u02a8"+
		"\u02a9\u00050\u0000\u0000\u02a9\u02ab\u0001\u0000\u0000\u0000\u02aa\u029e"+
		"\u0001\u0000\u0000\u0000\u02aa\u02a5\u0001\u0000\u0000\u0000\u02ab\u02b5"+
		"\u0001\u0000\u0000\u0000\u02ac\u02ad\n\u0002\u0000\u0000\u02ad\u02b1\u0005"+
		"7\u0000\u0000\u02ae\u02b2\u0003\u0000\u0000\u0000\u02af\u02b2\u0003*\u0015"+
		"\u0000\u02b0\u02b2\u0003N\'\u0000\u02b1\u02ae\u0001\u0000\u0000\u0000"+
		"\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b4\u0001\u0000\u0000\u0000\u02b3\u02ac\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b7\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b61\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b8\u02b9\u0007\u0006\u0000\u0000\u02b9"+
		"3\u0001\u0000\u0000\u0000\u02ba\u02bb\u00032\u0019\u0000\u02bb\u02c0\u0003"+
		"6\u001b\u0000\u02bc\u02bd\u00053\u0000\u0000\u02bd\u02bf\u00036\u001b"+
		"\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf\u02c2\u0001\u0000\u0000"+
		"\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c15\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000"+
		"\u02c3\u02cf\u0003\u0000\u0000\u0000\u02c4\u02cd\u0005\u0015\u0000\u0000"+
		"\u02c5\u02ce\u0003*\u0015\u0000\u02c6\u02ce\u0003$\u0012\u0000\u02c7\u02ce"+
		"\u0003J%\u0000\u02c8\u02ce\u0003H$\u0000\u02c9\u02ce\u0003\u0000\u0000"+
		"\u0000\u02ca\u02ce\u00038\u001c\u0000\u02cb\u02ce\u00030\u0018\u0000\u02cc"+
		"\u02ce\u0003<\u001e\u0000\u02cd\u02c5\u0001\u0000\u0000\u0000\u02cd\u02c6"+
		"\u0001\u0000\u0000\u0000\u02cd\u02c7\u0001\u0000\u0000\u0000\u02cd\u02c8"+
		"\u0001\u0000\u0000\u0000\u02cd\u02c9\u0001\u0000\u0000\u0000\u02cd\u02ca"+
		"\u0001\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02cc"+
		"\u0001\u0000\u0000\u0000\u02ce\u02d0\u0001\u0000\u0000\u0000\u02cf\u02c4"+
		"\u0001\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d07\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d5\u0005/\u0000\u0000\u02d2\u02d4\u0003\u0002"+
		"\u0001\u0000\u02d3\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d7\u0001\u0000"+
		"\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000"+
		"\u0000\u0000\u02d6\u02f5\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000"+
		"\u0000\u0000\u02d8\u02dc\u0003:\u001d\u0000\u02d9\u02db\u0003\u0002\u0001"+
		"\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02db\u02de\u0001\u0000\u0000"+
		"\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000"+
		"\u0000\u02dd\u02ef\u0001\u0000\u0000\u0000\u02de\u02dc\u0001\u0000\u0000"+
		"\u0000\u02df\u02e3\u00053\u0000\u0000\u02e0\u02e2\u0003\u0002\u0001\u0000"+
		"\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e5\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e6\u0001\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000"+
		"\u02e6\u02ea\u0003:\u001d\u0000\u02e7\u02e9\u0003\u0002\u0001\u0000\u02e8"+
		"\u02e7\u0001\u0000\u0000\u0000\u02e9\u02ec\u0001\u0000\u0000\u0000\u02ea"+
		"\u02e8\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ee\u0001\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ed"+
		"\u02df\u0001\u0000\u0000\u0000\u02ee\u02f1\u0001\u0000\u0000\u0000\u02ef"+
		"\u02ed\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0"+
		"\u02f3\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f2"+
		"\u02f4\u00053\u0000\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f3\u02f4"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f6\u0001\u0000\u0000\u0000\u02f5\u02d8"+
		"\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02fa"+
		"\u0001\u0000\u0000\u0000\u02f7\u02f9\u0003\u0002\u0001\u0000\u02f8\u02f7"+
		"\u0001\u0000\u0000\u0000\u02f9\u02fc\u0001\u0000\u0000\u0000\u02fa\u02f8"+
		"\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fd"+
		"\u0001\u0000\u0000\u0000\u02fc\u02fa\u0001\u0000\u0000\u0000\u02fd\u02fe"+
		"\u00050\u0000\u0000\u02fe9\u0001\u0000\u0000\u0000\u02ff\u0307\u0003\u0000"+
		"\u0000\u0000\u0300\u0307\u0003*\u0015\u0000\u0301\u0307\u0003$\u0012\u0000"+
		"\u0302\u0307\u0003z=\u0000\u0303\u0307\u0003^/\u0000\u0304\u0307\u0003"+
		"L&\u0000\u0305\u0307\u00038\u001c\u0000\u0306\u02ff\u0001\u0000\u0000"+
		"\u0000\u0306\u0300\u0001\u0000\u0000\u0000\u0306\u0301\u0001\u0000\u0000"+
		"\u0000\u0306\u0302\u0001\u0000\u0000\u0000\u0306\u0303\u0001\u0000\u0000"+
		"\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0306\u0305\u0001\u0000\u0000"+
		"\u0000\u0307;\u0001\u0000\u0000\u0000\u0308\u0309\u0005\u0013\u0000\u0000"+
		"\u0309\u030a\u0003N\'\u0000\u030a=\u0001\u0000\u0000\u0000\u030b\u030f"+
		"\u0003$\u0012\u0000\u030c\u030f\u0003L&\u0000\u030d\u030f\u0003B!\u0000"+
		"\u030e\u030b\u0001\u0000\u0000\u0000\u030e\u030c\u0001\u0000\u0000\u0000"+
		"\u030e\u030d\u0001\u0000\u0000\u0000\u030f?\u0001\u0000\u0000\u0000\u0310"+
		"\u0312\u0003B!\u0000\u0311\u0310\u0001\u0000\u0000\u0000\u0312\u0315\u0001"+
		"\u0000\u0000\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0313\u0314\u0001"+
		"\u0000\u0000\u0000\u0314\u0317\u0001\u0000\u0000\u0000\u0315\u0313\u0001"+
		"\u0000\u0000\u0000\u0316\u0318\u0003D\"\u0000\u0317\u0316\u0001\u0000"+
		"\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318A\u0001\u0000\u0000"+
		"\u0000\u0319\u0330\u0003\u000e\u0007\u0000\u031a\u0330\u00034\u001a\u0000"+
		"\u031b\u0330\u0003\u0014\n\u0000\u031c\u0330\u0003F#\u0000\u031d\u0330"+
		"\u0003N\'\u0000\u031e\u0330\u0003t:\u0000\u031f\u0330\u0003p8\u0000\u0320"+
		"\u0330\u0003r9\u0000\u0321\u0330\u0003z=\u0000\u0322\u0330\u0003f3\u0000"+
		"\u0323\u0330\u0003\u0016\u000b\u0000\u0324\u0330\u0003\u0018\f\u0000\u0325"+
		"\u0330\u0003\u001a\r\u0000\u0326\u0330\u0003.\u0017\u0000\u0327\u0330"+
		"\u0003,\u0016\u0000\u0328\u0330\u0003\u001c\u000e\u0000\u0329\u0330\u0003"+
		"6\u001b\u0000\u032a\u0330\u0003\f\u0006\u0000\u032b\u0330\u0003\u0002"+
		"\u0001\u0000\u032c\u0330\u0003Z-\u0000\u032d\u0330\u0003L&\u0000\u032e"+
		"\u0330\u0003R)\u0000\u032f\u0319\u0001\u0000\u0000\u0000\u032f\u031a\u0001"+
		"\u0000\u0000\u0000\u032f\u031b\u0001\u0000\u0000\u0000\u032f\u031c\u0001"+
		"\u0000\u0000\u0000\u032f\u031d\u0001\u0000\u0000\u0000\u032f\u031e\u0001"+
		"\u0000\u0000\u0000\u032f\u031f\u0001\u0000\u0000\u0000\u032f\u0320\u0001"+
		"\u0000\u0000\u0000\u032f\u0321\u0001\u0000\u0000\u0000\u032f\u0322\u0001"+
		"\u0000\u0000\u0000\u032f\u0323\u0001\u0000\u0000\u0000\u032f\u0324\u0001"+
		"\u0000\u0000\u0000\u032f\u0325\u0001\u0000\u0000\u0000\u032f\u0326\u0001"+
		"\u0000\u0000\u0000\u032f\u0327\u0001\u0000\u0000\u0000\u032f\u0328\u0001"+
		"\u0000\u0000\u0000\u032f\u0329\u0001\u0000\u0000\u0000\u032f\u032a\u0001"+
		"\u0000\u0000\u0000\u032f\u032b\u0001\u0000\u0000\u0000\u032f\u032c\u0001"+
		"\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u032f\u032e\u0001"+
		"\u0000\u0000\u0000\u0330\u0334\u0001\u0000\u0000\u0000\u0331\u0333\u0005"+
		"4\u0000\u0000\u0332\u0331\u0001\u0000\u0000\u0000\u0333\u0336\u0001\u0000"+
		"\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000"+
		"\u0000\u0000\u0335C\u0001\u0000\u0000\u0000\u0336\u0334\u0001\u0000\u0000"+
		"\u0000\u0337\u034f\u0005\u0012\u0000\u0000\u0338\u0341\u0005-\u0000\u0000"+
		"\u0339\u0342\u0003^/\u0000\u033a\u0342\u0003.\u0017\u0000\u033b\u0342"+
		"\u0003*\u0015\u0000\u033c\u0342\u0003$\u0012\u0000\u033d\u0342\u0003,"+
		"\u0016\u0000\u033e\u0342\u0003\u0000\u0000\u0000\u033f\u0342\u0003z=\u0000"+
		"\u0340\u0342\u00038\u001c\u0000\u0341\u0339\u0001\u0000\u0000\u0000\u0341"+
		"\u033a\u0001\u0000\u0000\u0000\u0341\u033b\u0001\u0000\u0000\u0000\u0341"+
		"\u033c\u0001\u0000\u0000\u0000\u0341\u033d\u0001\u0000\u0000\u0000\u0341"+
		"\u033e\u0001\u0000\u0000\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0341"+
		"\u0340\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343"+
		"\u0344\u0005.\u0000\u0000\u0344\u0350\u0001\u0000\u0000\u0000\u0345\u034e"+
		"\u0003^/\u0000\u0346\u034e\u0003.\u0017\u0000\u0347\u034e\u0003*\u0015"+
		"\u0000\u0348\u034e\u0003$\u0012\u0000\u0349\u034e\u0003\u0000\u0000\u0000"+
		"\u034a\u034e\u0003,\u0016\u0000\u034b\u034e\u0003z=\u0000\u034c\u034e"+
		"\u00038\u001c\u0000\u034d\u0345\u0001\u0000\u0000\u0000\u034d\u0346\u0001"+
		"\u0000\u0000\u0000\u034d\u0347\u0001\u0000\u0000\u0000\u034d\u0348\u0001"+
		"\u0000\u0000\u0000\u034d\u0349\u0001\u0000\u0000\u0000\u034d\u034a\u0001"+
		"\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034d\u034c\u0001"+
		"\u0000\u0000\u0000\u034e\u0350\u0001\u0000\u0000\u0000\u034f\u0338\u0001"+
		"\u0000\u0000\u0000\u034f\u034d\u0001\u0000\u0000\u0000\u0350\u0354\u0001"+
		"\u0000\u0000\u0000\u0351\u0353\u00054\u0000\u0000\u0352\u0351\u0001\u0000"+
		"\u0000\u0000\u0353\u0356\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000"+
		"\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355E\u0001\u0000\u0000"+
		"\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0357\u0359\u0005A\u0000\u0000"+
		"\u0358\u0357\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000\u0000\u0000"+
		"\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u035b\u0005\u0011\u0000\u0000"+
		"\u035b\u035c\u0003\u0000\u0000\u0000\u035c\u0365\u0005-\u0000\u0000\u035d"+
		"\u0362\u0003>\u001f\u0000\u035e\u035f\u00053\u0000\u0000\u035f\u0361\u0003"+
		">\u001f\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0361\u0364\u0001\u0000"+
		"\u0000\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000"+
		"\u0000\u0000\u0363\u0366\u0001\u0000\u0000\u0000\u0364\u0362\u0001\u0000"+
		"\u0000\u0000\u0365\u035d\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000"+
		"\u0000\u0000\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u0368\u0005.\u0000"+
		"\u0000\u0368\u0369\u00051\u0000\u0000\u0369\u036a\u0003@ \u0000\u036a"+
		"\u036b\u00052\u0000\u0000\u036bG\u0001\u0000\u0000\u0000\u036c\u0375\u0005"+
		"-\u0000\u0000\u036d\u0372\u0003>\u001f\u0000\u036e\u036f\u00053\u0000"+
		"\u0000\u036f\u0371\u0003>\u001f\u0000\u0370\u036e\u0001\u0000\u0000\u0000"+
		"\u0371\u0374\u0001\u0000\u0000\u0000\u0372\u0370\u0001\u0000\u0000\u0000"+
		"\u0372\u0373\u0001\u0000\u0000\u0000\u0373\u0376\u0001\u0000\u0000\u0000"+
		"\u0374\u0372\u0001\u0000\u0000\u0000\u0375\u036d\u0001\u0000\u0000\u0000"+
		"\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000"+
		"\u0377\u0378\u0005.\u0000\u0000\u0378\u0382\u0005\u0014\u0000\u0000\u0379"+
		"\u037a\u00051\u0000\u0000\u037a\u037b\u0003@ \u0000\u037b\u037c\u0005"+
		"2\u0000\u0000\u037c\u0383\u0001\u0000\u0000\u0000\u037d\u0383\u0003@ "+
		"\u0000\u037e\u037f\u0005-\u0000\u0000\u037f\u0380\u0003@ \u0000\u0380"+
		"\u0381\u0005.\u0000\u0000\u0381\u0383\u0001\u0000\u0000\u0000\u0382\u0379"+
		"\u0001\u0000\u0000\u0000\u0382\u037d\u0001\u0000\u0000\u0000\u0382\u037e"+
		"\u0001\u0000\u0000\u0000\u0383I\u0001\u0000\u0000\u0000\u0384\u0385\u0005"+
		"\u0011\u0000\u0000\u0385\u038e\u0005-\u0000\u0000\u0386\u038b\u0003>\u001f"+
		"\u0000\u0387\u0388\u00053\u0000\u0000\u0388\u038a\u0003>\u001f\u0000\u0389"+
		"\u0387\u0001\u0000\u0000\u0000\u038a\u038d\u0001\u0000\u0000\u0000\u038b"+
		"\u0389\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c"+
		"\u038f\u0001\u0000\u0000\u0000\u038d\u038b\u0001\u0000\u0000\u0000\u038e"+
		"\u0386\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000\u0000\u038f"+
		"\u0390\u0001\u0000\u0000\u0000\u0390\u0391\u0005.\u0000\u0000\u0391\u0392"+
		"\u00051\u0000\u0000\u0392\u0393\u0003@ \u0000\u0393\u0394\u00052\u0000"+
		"\u0000\u0394K\u0001\u0000\u0000\u0000\u0395\u0399\u0003H$\u0000\u0396"+
		"\u0399\u0003F#\u0000\u0397\u0399\u0003J%\u0000\u0398\u0395\u0001\u0000"+
		"\u0000\u0000\u0398\u0396\u0001\u0000\u0000\u0000\u0398\u0397\u0001\u0000"+
		"\u0000\u0000\u0399M\u0001\u0000\u0000\u0000\u039a\u039c\u0005B\u0000\u0000"+
		"\u039b\u039a\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000\u0000\u0000"+
		"\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u039e\u0003\u0000\u0000\u0000"+
		"\u039e\u03a7\u0005-\u0000\u0000\u039f\u03a4\u0003>\u001f\u0000\u03a0\u03a1"+
		"\u00053\u0000\u0000\u03a1\u03a3\u0003>\u001f\u0000\u03a2\u03a0\u0001\u0000"+
		"\u0000\u0000\u03a3\u03a6\u0001\u0000\u0000\u0000\u03a4\u03a2\u0001\u0000"+
		"\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5\u03a8\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a4\u0001\u0000\u0000\u0000\u03a7\u039f\u0001\u0000"+
		"\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000"+
		"\u0000\u0000\u03a9\u03aa\u0005.\u0000\u0000\u03aaO\u0001\u0000\u0000\u0000"+
		"\u03ab\u03b1\u0003\u0000\u0000\u0000\u03ac\u03af\u0005G\u0000\u0000\u03ad"+
		"\u03b0\u0003\u0000\u0000\u0000\u03ae\u03b0\u0005:\u0000\u0000\u03af\u03ad"+
		"\u0001\u0000\u0000\u0000\u03af\u03ae\u0001\u0000\u0000\u0000\u03b0\u03b2"+
		"\u0001\u0000\u0000\u0000\u03b1\u03ac\u0001\u0000\u0000\u0000\u03b1\u03b2"+
		"\u0001\u0000\u0000\u0000\u03b2Q\u0001\u0000\u0000\u0000\u03b3\u03b7\u0003"+
		"T*\u0000\u03b4\u03b7\u0003V+\u0000\u03b5\u03b7\u0003X,\u0000\u03b6\u03b3"+
		"\u0001\u0000\u0000\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b5"+
		"\u0001\u0000\u0000\u0000\u03b7\u03b9\u0001\u0000\u0000\u0000\u03b8\u03ba"+
		"\u00054\u0000\u0000\u03b9\u03b8\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001"+
		"\u0000\u0000\u0000\u03baS\u0001\u0000\u0000\u0000\u03bb\u03c1\u0005E\u0000"+
		"\u0000\u03bc\u03c2\u0003\u0000\u0000\u0000\u03bd\u03c2\u0003*\u0015\u0000"+
		"\u03be\u03c2\u0003$\u0012\u0000\u03bf\u03c2\u0003L&\u0000\u03c0\u03c2"+
		"\u00034\u001a\u0000\u03c1\u03bc\u0001\u0000\u0000\u0000\u03c1\u03bd\u0001"+
		"\u0000\u0000\u0000\u03c1\u03be\u0001\u0000\u0000\u0000\u03c1\u03bf\u0001"+
		"\u0000\u0000\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c2U\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c4\u0005C\u0000\u0000\u03c4\u03d6\u00034\u001a\u0000"+
		"\u03c5\u03c6\u0005C\u0000\u0000\u03c6\u03c7\u00051\u0000\u0000\u03c7\u03cc"+
		"\u0003P(\u0000\u03c8\u03c9\u00053\u0000\u0000\u03c9\u03cb\u0003P(\u0000"+
		"\u03ca\u03c8\u0001\u0000\u0000\u0000\u03cb\u03ce\u0001\u0000\u0000\u0000"+
		"\u03cc\u03ca\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000"+
		"\u03cd\u03cf\u0001\u0000\u0000\u0000\u03ce\u03cc\u0001\u0000\u0000\u0000"+
		"\u03cf\u03d0\u00052\u0000\u0000\u03d0\u03d1\u0005F\u0000\u0000\u03d1\u03d2"+
		"\u0005:\u0000\u0000\u03d2\u03d6\u0001\u0000\u0000\u0000\u03d3\u03d4\u0005"+
		"C\u0000\u0000\u03d4\u03d6\u0003F#\u0000\u03d5\u03c3\u0001\u0000\u0000"+
		"\u0000\u03d5\u03c5\u0001\u0000\u0000\u0000\u03d5\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d6W\u0001\u0000\u0000\u0000\u03d7\u03d8\u0005C\u0000\u0000\u03d8"+
		"\u03de\u0005\u001f\u0000\u0000\u03d9\u03dc\u0005G\u0000\u0000\u03da\u03dd"+
		"\u0003\u0000\u0000\u0000\u03db\u03dd\u0005:\u0000\u0000\u03dc\u03da\u0001"+
		"\u0000\u0000\u0000\u03dc\u03db\u0001\u0000\u0000\u0000\u03dd\u03df\u0001"+
		"\u0000\u0000\u0000\u03de\u03d9\u0001\u0000\u0000\u0000\u03de\u03df\u0001"+
		"\u0000\u0000\u0000\u03df\u03e0\u0001\u0000\u0000\u0000\u03e0\u03e1\u0005"+
		"F\u0000\u0000\u03e1\u03e2\u0005:\u0000\u0000\u03e2Y\u0001\u0000\u0000"+
		"\u0000\u03e3\u0400\u0005D\u0000\u0000\u03e4\u03e5\u0005\u001f\u0000\u0000"+
		"\u03e5\u03e6\u0005G\u0000\u0000\u03e6\u0401\u0003\u0000\u0000\u0000\u03e7"+
		"\u03e8\u00051\u0000\u0000\u03e8\u03ed\u0003\\.\u0000\u03e9\u03ea\u0005"+
		"3\u0000\u0000\u03ea\u03ec\u0003\\.\u0000\u03eb\u03e9\u0001\u0000\u0000"+
		"\u0000\u03ec\u03ef\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000\u0000"+
		"\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u03f0\u0001\u0000\u0000"+
		"\u0000\u03ef\u03ed\u0001\u0000\u0000\u0000\u03f0\u03f1\u00052\u0000\u0000"+
		"\u03f1\u0401\u0001\u0000\u0000\u0000\u03f2\u03f3\u0003\\.\u0000\u03f3"+
		"\u03f4\u00053\u0000\u0000\u03f4\u03f5\u00051\u0000\u0000\u03f5\u03fa\u0003"+
		"\\.\u0000\u03f6\u03f7\u00053\u0000\u0000\u03f7\u03f9\u0003\\.\u0000\u03f8"+
		"\u03f6\u0001\u0000\u0000\u0000\u03f9\u03fc\u0001\u0000\u0000\u0000\u03fa"+
		"\u03f8\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb"+
		"\u03fd\u0001\u0000\u0000\u0000\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fd"+
		"\u03fe\u00052\u0000\u0000\u03fe\u0401\u0001\u0000\u0000\u0000\u03ff\u0401"+
		"\u0003\\.\u0000\u0400\u03e4\u0001\u0000\u0000\u0000\u0400\u03e7\u0001"+
		"\u0000\u0000\u0000\u0400\u03f2\u0001\u0000\u0000\u0000\u0400\u03ff\u0001"+
		"\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0403\u0005"+
		"F\u0000\u0000\u0403\u0404\u0005:\u0000\u0000\u0404[\u0001\u0000\u0000"+
		"\u0000\u0405\u040a\u0003\u0000\u0000\u0000\u0406\u040a\u0005H\u0000\u0000"+
		"\u0407\u040a\u0005I\u0000\u0000\u0408\u040a\u0005K\u0000\u0000\u0409\u0405"+
		"\u0001\u0000\u0000\u0000\u0409\u0406\u0001\u0000\u0000\u0000\u0409\u0407"+
		"\u0001\u0000\u0000\u0000\u0409\u0408\u0001\u0000\u0000\u0000\u040a\u040d"+
		"\u0001\u0000\u0000\u0000\u040b\u040c\u0005G\u0000\u0000\u040c\u040e\u0003"+
		"\u0000\u0000\u0000\u040d\u040b\u0001\u0000\u0000\u0000\u040d\u040e\u0001"+
		"\u0000\u0000\u0000\u040e]\u0001\u0000\u0000\u0000\u040f\u0413\u0003h4"+
		"\u0000\u0410\u0413\u0003d2\u0000\u0411\u0413\u0003j5\u0000\u0412\u040f"+
		"\u0001\u0000\u0000\u0000\u0412\u0410\u0001\u0000\u0000\u0000\u0412\u0411"+
		"\u0001\u0000\u0000\u0000\u0413_\u0001\u0000\u0000\u0000\u0414\u0415\u0005"+
		"(\u0000\u0000\u0415\u041a\u0003\u0000\u0000\u0000\u0416\u0417\u00057\u0000"+
		"\u0000\u0417\u0419\u0003\u0000\u0000\u0000\u0418\u0416\u0001\u0000\u0000"+
		"\u0000\u0419\u041c\u0001\u0000\u0000\u0000\u041a\u0418\u0001\u0000\u0000"+
		"\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b\u0420\u0001\u0000\u0000"+
		"\u0000\u041c\u041a\u0001\u0000\u0000\u0000\u041d\u041f\u0003l6\u0000\u041e"+
		"\u041d\u0001\u0000\u0000\u0000\u041f\u0422\u0001\u0000\u0000\u0000\u0420"+
		"\u041e\u0001\u0000\u0000\u0000\u0420\u0421\u0001\u0000\u0000\u0000\u0421"+
		"\u0423\u0001\u0000\u0000\u0000\u0422\u0420\u0001\u0000\u0000\u0000\u0423"+
		"\u0424\u0005\'\u0000\u0000\u0424a\u0001\u0000\u0000\u0000\u0425\u0426"+
		"\u0005(\u0000\u0000\u0426\u0427\u0005 \u0000\u0000\u0427\u042c\u0003\u0000"+
		"\u0000\u0000\u0428\u0429\u00057\u0000\u0000\u0429\u042b\u0003\u0000\u0000"+
		"\u0000\u042a\u0428\u0001\u0000\u0000\u0000\u042b\u042e\u0001\u0000\u0000"+
		"\u0000\u042c\u042a\u0001\u0000\u0000\u0000\u042c\u042d\u0001\u0000\u0000"+
		"\u0000\u042d\u042f\u0001\u0000\u0000\u0000\u042e\u042c\u0001\u0000\u0000"+
		"\u0000\u042f\u0430\u0005\'\u0000\u0000\u0430c\u0001\u0000\u0000\u0000"+
		"\u0431\u0432\u0005(\u0000\u0000\u0432\u0437\u0003\u0000\u0000\u0000\u0433"+
		"\u0434\u00057\u0000\u0000\u0434\u0436\u0003\u0000\u0000\u0000\u0435\u0433"+
		"\u0001\u0000\u0000\u0000\u0436\u0439\u0001\u0000\u0000\u0000\u0437\u0435"+
		"\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000\u0000\u0438\u043d"+
		"\u0001\u0000\u0000\u0000\u0439\u0437\u0001\u0000\u0000\u0000\u043a\u043c"+
		"\u0003l6\u0000\u043b\u043a\u0001\u0000\u0000\u0000\u043c\u043f\u0001\u0000"+
		"\u0000\u0000\u043d\u043b\u0001\u0000\u0000\u0000\u043d\u043e\u0001\u0000"+
		"\u0000\u0000\u043e\u0440\u0001\u0000\u0000\u0000\u043f\u043d\u0001\u0000"+
		"\u0000\u0000\u0440\u0441\u0005 \u0000\u0000\u0441\u0442\u0005\'\u0000"+
		"\u0000\u0442e\u0001\u0000\u0000\u0000\u0443\u0456\u00051\u0000\u0000\u0444"+
		"\u0449\u0003N\'\u0000\u0445\u0449\u0003.\u0017\u0000\u0446\u0449\u0003"+
		",\u0016\u0000\u0447\u0449\u0003$\u0012\u0000\u0448\u0444\u0001\u0000\u0000"+
		"\u0000\u0448\u0445\u0001\u0000\u0000\u0000\u0448\u0446\u0001\u0000\u0000"+
		"\u0000\u0448\u0447\u0001\u0000\u0000\u0000\u0449\u044c\u0001\u0000\u0000"+
		"\u0000\u044a\u0448\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000"+
		"\u0000\u044b\u0457\u0001\u0000\u0000\u0000\u044c\u044a\u0001\u0000\u0000"+
		"\u0000\u044d\u044f\u0003L&\u0000\u044e\u044d\u0001\u0000\u0000\u0000\u044e"+
		"\u044f\u0001\u0000\u0000\u0000\u044f\u0457\u0001\u0000\u0000\u0000\u0450"+
		"\u0452\u0003f3\u0000\u0451\u0450\u0001\u0000\u0000\u0000\u0452\u0455\u0001"+
		"\u0000\u0000\u0000\u0453\u0451\u0001\u0000\u0000\u0000\u0453\u0454\u0001"+
		"\u0000\u0000\u0000\u0454\u0457\u0001\u0000\u0000\u0000\u0455\u0453\u0001"+
		"\u0000\u0000\u0000\u0456\u044a\u0001\u0000\u0000\u0000\u0456\u044e\u0001"+
		"\u0000\u0000\u0000\u0456\u0453\u0001\u0000\u0000\u0000\u0457\u0458\u0001"+
		"\u0000\u0000\u0000\u0458\u0459\u00052\u0000\u0000\u0459g\u0001\u0000\u0000"+
		"\u0000\u045a\u0460\u0003`0\u0000\u045b\u045f\u0003^/\u0000\u045c\u045f"+
		"\u0003f3\u0000\u045d\u045f\u0003B!\u0000\u045e\u045b\u0001\u0000\u0000"+
		"\u0000\u045e\u045c\u0001\u0000\u0000\u0000\u045e\u045d\u0001\u0000\u0000"+
		"\u0000\u045f\u0462\u0001\u0000\u0000\u0000\u0460\u045e\u0001\u0000\u0000"+
		"\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u0463\u0001\u0000\u0000"+
		"\u0000\u0462\u0460\u0001\u0000\u0000\u0000\u0463\u0464\u0003b1\u0000\u0464"+
		"i\u0001\u0000\u0000\u0000\u0465\u0466\u0005(\u0000\u0000\u0466\u0467\u0005"+
		"\'\u0000\u0000\u0467\u046d\u0001\u0000\u0000\u0000\u0468\u046c\u0003^"+
		"/\u0000\u0469\u046c\u0003f3\u0000\u046a\u046c\u0003B!\u0000\u046b\u0468"+
		"\u0001\u0000\u0000\u0000\u046b\u0469\u0001\u0000\u0000\u0000\u046b\u046a"+
		"\u0001\u0000\u0000\u0000\u046c\u046f\u0001\u0000\u0000\u0000\u046d\u046b"+
		"\u0001\u0000\u0000\u0000\u046d\u046e\u0001\u0000\u0000\u0000\u046e\u0470"+
		"\u0001\u0000\u0000\u0000\u046f\u046d\u0001\u0000\u0000\u0000\u0470\u0471"+
		"\u0005(\u0000\u0000\u0471\u0472\u0005 \u0000\u0000\u0472\u0473\u0005\'"+
		"\u0000\u0000\u0473k\u0001\u0000\u0000\u0000\u0474\u0475\u00051\u0000\u0000"+
		"\u0475\u0476\u0003n7\u0000\u0476\u0477\u00052\u0000\u0000\u0477\u0481"+
		"\u0001\u0000\u0000\u0000\u0478\u047e\u0003\u0000\u0000\u0000\u0479\u047c"+
		"\u0005\u0015\u0000\u0000\u047a\u047d\u0003*\u0015\u0000\u047b\u047d\u0003"+
		"f3\u0000\u047c\u047a\u0001\u0000\u0000\u0000\u047c\u047b\u0001\u0000\u0000"+
		"\u0000\u047d\u047f\u0001\u0000\u0000\u0000\u047e\u0479\u0001\u0000\u0000"+
		"\u0000\u047e\u047f\u0001\u0000\u0000\u0000\u047f\u0481\u0001\u0000\u0000"+
		"\u0000\u0480\u0474\u0001\u0000\u0000\u0000\u0480\u0478\u0001\u0000\u0000"+
		"\u0000\u0481m\u0001\u0000\u0000\u0000\u0482\u0483\u00057\u0000\u0000\u0483"+
		"\u0484\u00057\u0000\u0000\u0484\u048a\u00057\u0000\u0000\u0485\u048b\u0003"+
		"\u0000\u0000\u0000\u0486\u048b\u0003*\u0015\u0000\u0487\u048b\u00038\u001c"+
		"\u0000\u0488\u048b\u0003L&\u0000\u0489\u048b\u0003N\'\u0000\u048a\u0485"+
		"\u0001\u0000\u0000\u0000\u048a\u0486\u0001\u0000\u0000\u0000\u048a\u0487"+
		"\u0001\u0000\u0000\u0000\u048a\u0488\u0001\u0000\u0000\u0000\u048a\u0489"+
		"\u0001\u0000\u0000\u0000\u048bo\u0001\u0000\u0000\u0000\u048c\u048d\u0005"+
		">\u0000\u0000\u048d\u048e\u0005/\u0000\u0000\u048e\u048f\u0003\u0000\u0000"+
		"\u0000\u048f\u0490\u00053\u0000\u0000\u0490\u0491\u0003\u0000\u0000\u0000"+
		"\u0491\u0492\u00050\u0000\u0000\u0492\u0493\u0005\u0015\u0000\u0000\u0493"+
		"\u0494\u0005H\u0000\u0000\u0494\u0499\u0005-\u0000\u0000\u0495\u049a\u0003"+
		"\u0000\u0000\u0000\u0496\u049a\u0003*\u0015\u0000\u0497\u049a\u0003$\u0012"+
		"\u0000\u0498\u049a\u0003.\u0017\u0000\u0499\u0495\u0001\u0000\u0000\u0000"+
		"\u0499\u0496\u0001\u0000\u0000\u0000\u0499\u0497\u0001\u0000\u0000\u0000"+
		"\u0499\u0498\u0001\u0000\u0000\u0000\u049a\u049b\u0001\u0000\u0000\u0000"+
		"\u049b\u049c\u0005.\u0000\u0000\u049cq\u0001\u0000\u0000\u0000\u049d\u049e"+
		"\u0005>\u0000\u0000\u049e\u049f\u0003\u0000\u0000\u0000\u049f\u04a0\u0005"+
		"\u0015\u0000\u0000\u04a0\u04a1\u0005K\u0000\u0000\u04a1\u04a6\u0005-\u0000"+
		"\u0000\u04a2\u04a7\u0003\u0000\u0000\u0000\u04a3\u04a7\u0003*\u0015\u0000"+
		"\u04a4\u04a7\u0003$\u0012\u0000\u04a5\u04a7\u0003.\u0017\u0000\u04a6\u04a2"+
		"\u0001\u0000\u0000\u0000\u04a6\u04a3\u0001\u0000\u0000\u0000\u04a6\u04a4"+
		"\u0001\u0000\u0000\u0000\u04a6\u04a5\u0001\u0000\u0000\u0000\u04a7\u04a8"+
		"\u0001\u0000\u0000\u0000\u04a8\u04a9\u0005.\u0000\u0000\u04a9s\u0001\u0000"+
		"\u0000\u0000\u04aa\u04ab\u0005I\u0000\u0000\u04ab\u04ae\u0005-\u0000\u0000"+
		"\u04ac\u04af\u0003J%\u0000\u04ad\u04af\u0003H$\u0000\u04ae\u04ac\u0001"+
		"\u0000\u0000\u0000\u04ae\u04ad\u0001\u0000\u0000\u0000\u04af\u04b4\u0001"+
		"\u0000\u0000\u0000\u04b0\u04b1\u00053\u0000\u0000\u04b1\u04b2\u0003v;"+
		"\u0000\u04b2\u04b3\u0005.\u0000\u0000\u04b3\u04b5\u0001\u0000\u0000\u0000"+
		"\u04b4\u04b0\u0001\u0000\u0000\u0000\u04b4\u04b5\u0001\u0000\u0000\u0000"+
		"\u04b5u\u0001\u0000\u0000\u0000\u04b6\u04ba\u0005/\u0000\u0000\u04b7\u04b9"+
		"\u0003\u0000\u0000\u0000\u04b8\u04b7\u0001\u0000\u0000\u0000\u04b9\u04bc"+
		"\u0001\u0000\u0000\u0000\u04ba\u04b8\u0001\u0000\u0000\u0000\u04ba\u04bb"+
		"\u0001\u0000\u0000\u0000\u04bb\u04c1\u0001\u0000\u0000\u0000\u04bc\u04ba"+
		"\u0001\u0000\u0000\u0000\u04bd\u04be\u00053\u0000\u0000\u04be\u04c0\u0003"+
		"\u0000\u0000\u0000\u04bf\u04bd\u0001\u0000\u0000\u0000\u04c0\u04c3\u0001"+
		"\u0000\u0000\u0000\u04c1\u04bf\u0001\u0000\u0000\u0000\u04c1\u04c2\u0001"+
		"\u0000\u0000\u0000\u04c2\u04c4\u0001\u0000\u0000\u0000\u04c3\u04c1\u0001"+
		"\u0000\u0000\u0000\u04c4\u04c5\u00050\u0000\u0000\u04c5w\u0001\u0000\u0000"+
		"\u0000\u04c6\u04ca\u0003$\u0012\u0000\u04c7\u04ca\u0003\u0000\u0000\u0000"+
		"\u04c8\u04ca\u0005=\u0000\u0000\u04c9\u04c6\u0001\u0000\u0000\u0000\u04c9"+
		"\u04c7\u0001\u0000\u0000\u0000\u04c9\u04c8\u0001\u0000\u0000\u0000\u04ca"+
		"y\u0001\u0000\u0000\u0000\u04cb\u04cc\u0005J\u0000\u0000\u04cc\u04cd\u0005"+
		"-\u0000\u0000\u04cd\u04ce\u0003.\u0017\u0000\u04ce\u04cf\u00053\u0000"+
		"\u0000\u04cf\u04db\u0003x<\u0000\u04d0\u04d7\u00053\u0000\u0000\u04d1"+
		"\u04d8\u0003*\u0015\u0000\u04d2\u04d8\u0003\u0000\u0000\u0000\u04d3\u04d8"+
		"\u00038\u001c\u0000\u04d4\u04d8\u0003z=\u0000\u04d5\u04d8\u0003^/\u0000"+
		"\u04d6\u04d8\u0003n7\u0000\u04d7\u04d1\u0001\u0000\u0000\u0000\u04d7\u04d2"+
		"\u0001\u0000\u0000\u0000\u04d7\u04d3\u0001\u0000\u0000\u0000\u04d7\u04d4"+
		"\u0001\u0000\u0000\u0000\u04d7\u04d5\u0001\u0000\u0000\u0000\u04d7\u04d6"+
		"\u0001\u0000\u0000\u0000\u04d8\u04da\u0001\u0000\u0000\u0000\u04d9\u04d0"+
		"\u0001\u0000\u0000\u0000\u04da\u04dd\u0001\u0000\u0000\u0000\u04db\u04d9"+
		"\u0001\u0000\u0000\u0000\u04db\u04dc\u0001\u0000\u0000\u0000\u04dc\u04de"+
		"\u0001\u0000\u0000\u0000\u04dd\u04db\u0001\u0000\u0000\u0000\u04de\u04df"+
		"\u0005.\u0000\u0000\u04df{\u0001\u0000\u0000\u0000\u04e0\u04eb\u0005\u0012"+
		"\u0000\u0000\u04e1\u04e4\u0005-\u0000\u0000\u04e2\u04e5\u0003^/\u0000"+
		"\u04e3\u04e5\u0005=\u0000\u0000\u04e4\u04e2\u0001\u0000\u0000\u0000\u04e4"+
		"\u04e3\u0001\u0000\u0000\u0000\u04e5\u04e6\u0001\u0000\u0000\u0000\u04e6"+
		"\u04ec\u0005.\u0000\u0000\u04e7\u04ea\u0003^/\u0000\u04e8\u04ea\u0005"+
		"=\u0000\u0000\u04e9\u04e7\u0001\u0000\u0000\u0000\u04e9\u04e8\u0001\u0000"+
		"\u0000\u0000\u04ea\u04ec\u0001\u0000\u0000\u0000\u04eb\u04e1\u0001\u0000"+
		"\u0000\u0000\u04eb\u04e9\u0001\u0000\u0000\u0000\u04ec\u04f0\u0001\u0000"+
		"\u0000\u0000\u04ed\u04ef\u00054\u0000\u0000\u04ee\u04ed\u0001\u0000\u0000"+
		"\u0000\u04ef\u04f2\u0001\u0000\u0000\u0000\u04f0\u04ee\u0001\u0000\u0000"+
		"\u0000\u04f0\u04f1\u0001\u0000\u0000\u0000\u04f1}\u0001\u0000\u0000\u0000"+
		"\u04f2\u04f0\u0001\u0000\u0000\u0000\u04f3\u04f5\u0003B!\u0000\u04f4\u04f3"+
		"\u0001\u0000\u0000\u0000\u04f5\u04f8\u0001\u0000\u0000\u0000\u04f6\u04f4"+
		"\u0001\u0000\u0000\u0000\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7\u0515"+
		"\u0001\u0000\u0000\u0000\u04f8\u04f6\u0001\u0000\u0000\u0000\u04f9\u04fd"+
		"\u0003\u0080@\u0000\u04fa\u04fc\u0003B!\u0000\u04fb\u04fa\u0001\u0000"+
		"\u0000\u0000\u04fc\u04ff\u0001\u0000\u0000\u0000\u04fd\u04fb\u0001\u0000"+
		"\u0000\u0000\u04fd\u04fe\u0001\u0000\u0000\u0000\u04fe\u0500\u0001\u0000"+
		"\u0000\u0000\u04ff\u04fd\u0001\u0000\u0000\u0000\u0500\u0504\u0003T*\u0000"+
		"\u0501\u0503\u00054\u0000\u0000\u0502\u0501\u0001\u0000\u0000\u0000\u0503"+
		"\u0506\u0001\u0000\u0000\u0000\u0504\u0502\u0001\u0000\u0000\u0000\u0504"+
		"\u0505\u0001\u0000\u0000\u0000\u0505\u0516\u0001\u0000\u0000\u0000\u0506"+
		"\u0504\u0001\u0000\u0000\u0000\u0507\u0508\u0005E\u0000\u0000\u0508\u050c"+
		"\u0003\u0080@\u0000\u0509\u050b\u0003B!\u0000\u050a\u0509\u0001\u0000"+
		"\u0000\u0000\u050b\u050e\u0001\u0000\u0000\u0000\u050c\u050a\u0001\u0000"+
		"\u0000\u0000\u050c\u050d\u0001\u0000\u0000\u0000\u050d\u0512\u0001\u0000"+
		"\u0000\u0000\u050e\u050c\u0001\u0000\u0000\u0000\u050f\u0511\u00054\u0000"+
		"\u0000\u0510\u050f\u0001\u0000\u0000\u0000\u0511\u0514\u0001\u0000\u0000"+
		"\u0000\u0512\u0510\u0001\u0000\u0000\u0000\u0512\u0513\u0001\u0000\u0000"+
		"\u0000\u0513\u0516\u0001\u0000\u0000\u0000\u0514\u0512\u0001\u0000\u0000"+
		"\u0000\u0515\u04f9\u0001\u0000\u0000\u0000\u0515\u0507\u0001\u0000\u0000"+
		"\u0000\u0516\u007f\u0001\u0000\u0000\u0000\u0517\u051a\u0003\u0082A\u0000"+
		"\u0518\u051a\u0003\u0084B\u0000\u0519\u0517\u0001\u0000\u0000\u0000\u0519"+
		"\u0518\u0001\u0000\u0000\u0000\u051a\u051e\u0001\u0000\u0000\u0000\u051b"+
		"\u051d\u00054\u0000\u0000\u051c\u051b\u0001\u0000\u0000\u0000\u051d\u0520"+
		"\u0001\u0000\u0000\u0000\u051e\u051c\u0001\u0000\u0000\u0000\u051e\u051f"+
		"\u0001\u0000\u0000\u0000\u051f\u0081\u0001\u0000\u0000\u0000\u0520\u051e"+
		"\u0001\u0000\u0000\u0000\u0521\u0522\u0005>\u0000\u0000\u0522\u0523\u0003"+
		"\u0000\u0000\u0000\u0523\u0524\u0005\u0015\u0000\u0000\u0524\u0526\u0005"+
		"-\u0000\u0000\u0525\u0527\u0003x<\u0000\u0526\u0525\u0001\u0000\u0000"+
		"\u0000\u0526\u0527\u0001\u0000\u0000\u0000\u0527\u0528\u0001\u0000\u0000"+
		"\u0000\u0528\u0529\u0005.\u0000\u0000\u0529\u052f\u0005\u0014\u0000\u0000"+
		"\u052a\u052b\u00051\u0000\u0000\u052b\u052c\u0003\u0086C\u0000\u052c\u052d"+
		"\u00052\u0000\u0000\u052d\u0530\u0001\u0000\u0000\u0000\u052e\u0530\u0003"+
		"\u0086C\u0000\u052f\u052a\u0001\u0000\u0000\u0000\u052f\u052e\u0001\u0000"+
		"\u0000\u0000\u0530\u0083\u0001\u0000\u0000\u0000\u0531\u0532\u0005\u0011"+
		"\u0000\u0000\u0532\u0533\u0003\u0000\u0000\u0000\u0533\u0535\u0005-\u0000"+
		"\u0000\u0534\u0536\u0003x<\u0000\u0535\u0534\u0001\u0000\u0000\u0000\u0535"+
		"\u0536\u0001\u0000\u0000\u0000\u0536\u0537\u0001\u0000\u0000\u0000\u0537"+
		"\u0538\u0005.\u0000\u0000\u0538\u0539\u00051\u0000\u0000\u0539\u053a\u0003"+
		"\u0086C\u0000\u053a\u053b\u00052\u0000\u0000\u053b\u0085\u0001\u0000\u0000"+
		"\u0000\u053c\u053e\u0003B!\u0000\u053d\u053c\u0001\u0000\u0000\u0000\u053e"+
		"\u0541\u0001\u0000\u0000\u0000\u053f\u053d\u0001\u0000\u0000\u0000\u053f"+
		"\u0540\u0001\u0000\u0000\u0000\u0540\u0542\u0001\u0000\u0000\u0000\u0541"+
		"\u053f\u0001\u0000\u0000\u0000\u0542\u0543\u0003|>\u0000\u0543\u0087\u0001"+
		"\u0000\u0000\u0000\u00cd\u0098\u009e\u00a2\u00a7\u00af\u00b8\u00bd\u00bf"+
		"\u00c3\u00c5\u00ca\u00cd\u00d0\u00d6\u00da\u00e1\u00ea\u00ef\u00f1\u00f5"+
		"\u00f7\u00fc\u00ff\u0102\u010b\u0110\u0112\u0116\u0118\u011d\u0120\u0123"+
		"\u012a\u0134\u013c\u0140\u0142\u0149\u0152\u0157\u0159\u015d\u015f\u0164"+
		"\u0167\u016a\u0173\u0178\u017a\u017e\u0180\u0185\u0188\u018b\u0191\u019a"+
		"\u01a0\u01a7\u01ac\u01ae\u01b2\u01b4\u01b9\u01bc\u01bf\u01c8\u01cd\u01cf"+
		"\u01d3\u01d5\u01da\u01dd\u01e0\u01e3\u01e7\u01ea\u01ef\u01f7\u01fd\u0202"+
		"\u0204\u0208\u020a\u020f\u0212\u0215\u021e\u0223\u0225\u0229\u022b\u0230"+
		"\u0233\u0236\u023d\u0242\u0249\u0250\u0257\u025e\u0263\u0267\u0269\u026e"+
		"\u0276\u027c\u0286\u0291\u0299\u029b\u02a3\u02aa\u02b1\u02b5\u02c0\u02cd"+
		"\u02cf\u02d5\u02dc\u02e3\u02ea\u02ef\u02f3\u02f5\u02fa\u0306\u030e\u0313"+
		"\u0317\u032f\u0334\u0341\u034d\u034f\u0354\u0358\u0362\u0365\u0372\u0375"+
		"\u0382\u038b\u038e\u0398\u039b\u03a4\u03a7\u03af\u03b1\u03b6\u03b9\u03c1"+
		"\u03cc\u03d5\u03dc\u03de\u03ed\u03fa\u0400\u0409\u040d\u0412\u041a\u0420"+
		"\u042c\u0437\u043d\u0448\u044a\u044e\u0453\u0456\u045e\u0460\u046b\u046d"+
		"\u047c\u047e\u0480\u048a\u0499\u04a6\u04ae\u04b4\u04ba\u04c1\u04c9\u04d7"+
		"\u04db\u04e4\u04e9\u04eb\u04f0\u04f6\u04fd\u0504\u050c\u0512\u0515\u0519"+
		"\u051e\u0526\u052f\u0535\u053f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}