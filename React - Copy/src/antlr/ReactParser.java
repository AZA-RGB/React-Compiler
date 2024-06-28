// Generated from /home/elyas/Documents/compiler/AfterPropsSemantic/completeParserHefawii/React - Copy/src/antlr/ReactParser.g4 by ANTLR 4.13.1
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
		FUNCTION=17, RETURN=18, EVENT_ATTRIBUTE=19, NEW=20, ARROW=21, EQUAL=22, 
		PLUS_EQUALS=23, MINUS_EQUALS=24, TIMES_EQUALS=25, DIVIDE_EQUALS=26, MODULO_EQUALS=27, 
		PLUS_ONE=28, MINUS_ONE=29, PLUS=30, MINUS=31, STAR=32, DIVIDE=33, MODULO=34, 
		AND=35, OR=36, NOT=37, EQUAL_TO=38, NOT_EQUAL=39, GREATER_THAN=40, LESS_THAN=41, 
		GREATER_THAN_OR_EQUAL=42, LESS_THAN_OR_EQUAL=43, SINGLE_LINE_COMMENT=44, 
		COMMENT_BLOCK=45, LPAREN=46, RPAREN=47, LSBRACKET=48, RSBRACKET=49, LCURLY=50, 
		RCURLY=51, COMMA=52, SEMI=53, Integer=54, Float=55, DOT=56, COLON=57, 
		QUESITIONMARK=58, String=59, Boolean=60, Undefined=61, Null=62, CONST=63, 
		LET=64, VAR=65, ASYNC=66, AWAIT=67, EXPORT=68, IMPORT=69, EXPORT_DEFAULT=70, 
		FROM=71, AS=72, USESTATE=73, USEEFFECT=74, CREATEELEMENT=75, USEREF=76, 
		IDENTIFIER=77, ONCLICK=78;
	public static final int
		RULE_program = 0, RULE_id = 1, RULE_hooks = 2, RULE_if_condition_semantic = 3, 
		RULE_elseIf_condition_semantic = 4, RULE_else_condition_semantic = 5, 
		RULE_tenaryExpression_semantic = 6, RULE_while_semantic = 7, RULE_do_while_semantic = 8, 
		RULE_for_loop_semantic = 9, RULE_try_expression_semantic = 10, RULE_catch_expression_semantic = 11, 
		RULE_finally_expression_semantic = 12, RULE_throwEx_semantic = 13, RULE_semantic_rule = 14, 
		RULE_comment = 15, RULE_operator = 16, RULE_operation_condition = 17, 
		RULE_operation_element = 18, RULE_condition = 19, RULE_conditions = 20, 
		RULE_and_or = 21, RULE_if_condition = 22, RULE_elseIf_condition = 23, 
		RULE_else_condition = 24, RULE_tenaryExpression = 25, RULE_while = 26, 
		RULE_do_while = 27, RULE_for_loop = 28, RULE_try_expression = 29, RULE_catch_expression = 30, 
		RULE_finally_expression = 31, RULE_throwEx = 32, RULE_objectLiteral = 33, 
		RULE_property = 34, RULE_objectExpression = 35, RULE_literal = 36, RULE_unaryExpression = 37, 
		RULE_expression = 38, RULE_memberExpression = 39, RULE_variable_declaration_keywords = 40, 
		RULE_variableDeclaration = 41, RULE_variableDeclarator = 42, RULE_array = 43, 
		RULE_arrayElement = 44, RULE_object = 45, RULE_argument = 46, RULE_functionBody = 47, 
		RULE_statement = 48, RULE_returnStatement = 49, RULE_namedFunctionDeclaration = 50, 
		RULE_arrowFunctionDeclaration = 51, RULE_anonymousFunctionDeclaration = 52, 
		RULE_function = 53, RULE_functionCall = 54, RULE_exportSpecifier = 55, 
		RULE_exportStatement = 56, RULE_exportDefault = 57, RULE_namedExport = 58, 
		RULE_exportAll = 59, RULE_importStatement = 60, RULE_importSpecifier = 61, 
		RULE_jsx = 62, RULE_openTag = 63, RULE_closeTag = 64, RULE_selfClosingElement = 65, 
		RULE_jsxExpression = 66, RULE_normalJsxElement = 67, RULE_jsxFragment = 68, 
		RULE_jsxAttribute = 69, RULE_spreadOperation = 70, RULE_useStateDeclaration = 71, 
		RULE_useRefDeclaration = 72, RULE_useEffectDeclaration = 73, RULE_dependencyArray = 74, 
		RULE_props = 75, RULE_pureReactElement = 76, RULE_component_return_statment = 77, 
		RULE_functionalComponent = 78, RULE_arrowComponentDeclaration = 79, RULE_namedComponentDeclaration = 80, 
		RULE_componentFunctionBody = 81;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "id", "hooks", "if_condition_semantic", "elseIf_condition_semantic", 
			"else_condition_semantic", "tenaryExpression_semantic", "while_semantic", 
			"do_while_semantic", "for_loop_semantic", "try_expression_semantic", 
			"catch_expression_semantic", "finally_expression_semantic", "throwEx_semantic", 
			"semantic_rule", "comment", "operator", "operation_condition", "operation_element", 
			"condition", "conditions", "and_or", "if_condition", "elseIf_condition", 
			"else_condition", "tenaryExpression", "while", "do_while", "for_loop", 
			"try_expression", "catch_expression", "finally_expression", "throwEx", 
			"objectLiteral", "property", "objectExpression", "literal", "unaryExpression", 
			"expression", "memberExpression", "variable_declaration_keywords", "variableDeclaration", 
			"variableDeclarator", "array", "arrayElement", "object", "argument", 
			"functionBody", "statement", "returnStatement", "namedFunctionDeclaration", 
			"arrowFunctionDeclaration", "anonymousFunctionDeclaration", "function", 
			"functionCall", "exportSpecifier", "exportStatement", "exportDefault", 
			"namedExport", "exportAll", "importStatement", "importSpecifier", "jsx", 
			"openTag", "closeTag", "selfClosingElement", "jsxExpression", "normalJsxElement", 
			"jsxFragment", "jsxAttribute", "spreadOperation", "useStateDeclaration", 
			"useRefDeclaration", "useEffectDeclaration", "dependencyArray", "props", 
			"pureReactElement", "component_return_statment", "functionalComponent", 
			"arrowComponentDeclaration", "namedComponentDeclaration", "componentFunctionBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'if'", null, "'else'", "'for'", "'while'", "'switch'", "'case'", 
			"'break'", "'continue'", "'default'", "'do'", "'try'", "'catch'", "'finally'", 
			"'throw'", "'function'", "'return'", null, null, "'=>'", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'++'", "'--'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'&&'", "'||'", "'!'", null, "'!='", "'>'", "'<'", "'>='", 
			"'<='", null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", "','", 
			"';'", null, null, "'.'", "':'", "'?'", null, null, "'undefined'", "'null'", 
			"'const'", "'let'", "'var'", "'async'", "'await'", "'export'", "'import'", 
			null, "'from'", "'as'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "IF", "ELSEIF", "ELSE", "FOR", "WHILE", "SWITCH", "CASE", 
			"BREAK", "CONTINUE", "DEFAULT", "DO", "TRY", "CATCH", "FINALLY", "THROW", 
			"FUNCTION", "RETURN", "EVENT_ATTRIBUTE", "NEW", "ARROW", "EQUAL", "PLUS_EQUALS", 
			"MINUS_EQUALS", "TIMES_EQUALS", "DIVIDE_EQUALS", "MODULO_EQUALS", "PLUS_ONE", 
			"MINUS_ONE", "PLUS", "MINUS", "STAR", "DIVIDE", "MODULO", "AND", "OR", 
			"NOT", "EQUAL_TO", "NOT_EQUAL", "GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQUAL", 
			"LESS_THAN_OR_EQUAL", "SINGLE_LINE_COMMENT", "COMMENT_BLOCK", "LPAREN", 
			"RPAREN", "LSBRACKET", "RSBRACKET", "LCURLY", "RCURLY", "COMMA", "SEMI", 
			"Integer", "Float", "DOT", "COLON", "QUESITIONMARK", "String", "Boolean", 
			"Undefined", "Null", "CONST", "LET", "VAR", "ASYNC", "AWAIT", "EXPORT", 
			"IMPORT", "EXPORT_DEFAULT", "FROM", "AS", "USESTATE", "USEEFFECT", "CREATEELEMENT", 
			"USEREF", "IDENTIFIER", "ONCLICK"
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
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					statement();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case CONST:
				{
				{
				setState(170);
				functionalComponent();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(171);
					statement();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				exportDefault();
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(178);
					match(SEMI);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case EXPORT_DEFAULT:
				{
				{
				setState(184);
				match(EXPORT_DEFAULT);
				setState(185);
				functionalComponent();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(186);
					statement();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(192);
					match(SEMI);
					}
					}
					setState(197);
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode EVENT_ATTRIBUTE() { return getToken(ReactParser.EVENT_ATTRIBUTE, 0); }
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
		enterRule(_localctx, 2, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(_la==EVENT_ATTRIBUTE || _la==IDENTIFIER) ) {
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
	public static class HooksContext extends ParserRuleContext {
		public UseStateDeclarationContext useStateDeclaration() {
			return getRuleContext(UseStateDeclarationContext.class,0);
		}
		public UseEffectDeclarationContext useEffectDeclaration() {
			return getRuleContext(UseEffectDeclarationContext.class,0);
		}
		public UseRefDeclarationContext useRefDeclaration() {
			return getRuleContext(UseRefDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public HooksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hooks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHooks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHooks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHooks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HooksContext hooks() throws RecognitionException {
		HooksContext _localctx = new HooksContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_hooks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(202);
				useStateDeclaration();
				}
				break;
			case 2:
				{
				setState(203);
				useEffectDeclaration();
				}
				break;
			case 3:
				{
				setState(204);
				useRefDeclaration();
				}
				break;
			}
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(207);
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
	public static class If_condition_semanticContext extends ParserRuleContext {
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
		public List<HooksContext> hooks() {
			return getRuleContexts(HooksContext.class);
		}
		public HooksContext hooks(int i) {
			return getRuleContext(HooksContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public If_condition_semanticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition_semantic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIf_condition_semantic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIf_condition_semantic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIf_condition_semantic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_condition_semanticContext if_condition_semantic() throws RecognitionException {
		If_condition_semanticContext _localctx = new If_condition_semanticContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_condition_semantic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IF);
			setState(211);
			match(LPAREN);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(212);
				match(NOT);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			conditions();
			setState(219);
			match(RPAREN);
			setState(220);
			match(LCURLY);
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(221);
					hooks();
					}
					}
					setState(224); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(226);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(227);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(232);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(233);
						match(SEMI);
						}
					}

					}
				}

				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(238);
					hooks();
					}
					}
					setState(241); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(245);
				returnStatement();
				}
			}

			setState(248);
			match(RCURLY);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					elseIf_condition();
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(255);
				else_condition();
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
	public static class ElseIf_condition_semanticContext extends ParserRuleContext {
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
		public List<HooksContext> hooks() {
			return getRuleContexts(HooksContext.class);
		}
		public HooksContext hooks(int i) {
			return getRuleContext(HooksContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public ElseIf_condition_semanticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf_condition_semantic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElseIf_condition_semantic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElseIf_condition_semantic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElseIf_condition_semantic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIf_condition_semanticContext elseIf_condition_semantic() throws RecognitionException {
		ElseIf_condition_semanticContext _localctx = new ElseIf_condition_semanticContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseIf_condition_semantic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ELSEIF);
			setState(259);
			match(LPAREN);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(260);
				match(NOT);
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			conditions();
			setState(267);
			match(RPAREN);
			setState(268);
			match(LCURLY);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(269);
					hooks();
					}
					}
					setState(272); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(274);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(275);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(280);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(281);
						match(SEMI);
						}
					}

					}
				}

				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(286);
					hooks();
					}
					}
					setState(289); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(293);
				returnStatement();
				}
			}

			setState(296);
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
	public static class Else_condition_semanticContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ReactParser.ELSE, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<HooksContext> hooks() {
			return getRuleContexts(HooksContext.class);
		}
		public HooksContext hooks(int i) {
			return getRuleContext(HooksContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public Else_condition_semanticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_condition_semantic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElse_condition_semantic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElse_condition_semantic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElse_condition_semantic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_condition_semanticContext else_condition_semantic() throws RecognitionException {
		Else_condition_semanticContext _localctx = new Else_condition_semanticContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else_condition_semantic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(ELSE);
			setState(299);
			match(LCURLY);
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(300);
					hooks();
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(305);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(306);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(311);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(312);
						match(SEMI);
						}
					}

					}
				}

				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(317);
					hooks();
					}
					}
					setState(320); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(324);
				returnStatement();
				}
			}

			setState(327);
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
	public static class TenaryExpression_semanticContext extends ParserRuleContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode QUESITIONMARK() { return getToken(ReactParser.QUESITIONMARK, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ReactParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ReactParser.LPAREN, i);
		}
		public List<HooksContext> hooks() {
			return getRuleContexts(HooksContext.class);
		}
		public HooksContext hooks(int i) {
			return getRuleContext(HooksContext.class,i);
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
		public TenaryExpression_semanticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tenaryExpression_semantic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTenaryExpression_semantic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTenaryExpression_semantic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTenaryExpression_semantic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TenaryExpression_semanticContext tenaryExpression_semantic() throws RecognitionException {
		TenaryExpression_semanticContext _localctx = new TenaryExpression_semanticContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tenaryExpression_semantic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(329);
				match(NOT);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			conditions();
			setState(336);
			match(QUESITIONMARK);
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(337);
				match(LPAREN);
				setState(338);
				hooks();
				setState(339);
				match(RPAREN);
				}
				break;
			case CONST:
			case USEEFFECT:
				{
				setState(341);
				hooks();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(344);
			match(COLON);
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(345);
					match(LPAREN);
					setState(346);
					hooks();
					}
					break;
				case 2:
					{
					setState(347);
					tenaryExpression();
					setState(348);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(354);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
				case USEEFFECT:
					{
					setState(352);
					hooks();
					}
					break;
				case EVENT_ATTRIBUTE:
				case NOT:
				case LESS_THAN:
				case LPAREN:
				case LSBRACKET:
				case LCURLY:
				case Integer:
				case Float:
				case String:
				case Boolean:
				case Undefined:
				case Null:
				case AWAIT:
				case CREATEELEMENT:
				case IDENTIFIER:
				case ONCLICK:
					{
					setState(353);
					tenaryExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class While_semanticContext extends ParserRuleContext {
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
		public List<HooksContext> hooks() {
			return getRuleContexts(HooksContext.class);
		}
		public HooksContext hooks(int i) {
			return getRuleContext(HooksContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public While_semanticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_semantic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWhile_semantic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWhile_semantic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWhile_semantic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_semanticContext while_semantic() throws RecognitionException {
		While_semanticContext _localctx = new While_semanticContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_semantic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(WHILE);
			setState(359);
			match(LPAREN);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(360);
				match(NOT);
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			conditions();
			setState(367);
			match(RPAREN);
			setState(368);
			match(LCURLY);
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(369);
					hooks();
					}
					}
					setState(372); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
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

				setState(387); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(386);
					hooks();
					}
					}
					setState(389); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(393);
				returnStatement();
				}
			}

			setState(396);
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
	public static class Do_while_semanticContext extends ParserRuleContext {
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
		public List<HooksContext> hooks() {
			return getRuleContexts(HooksContext.class);
		}
		public HooksContext hooks(int i) {
			return getRuleContext(HooksContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public Do_while_semanticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_semantic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDo_while_semantic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDo_while_semantic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDo_while_semantic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_semanticContext do_while_semantic() throws RecognitionException {
		Do_while_semanticContext _localctx = new Do_while_semanticContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_do_while_semantic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(DO);
			setState(399);
			match(LCURLY);
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(400);
					hooks();
					}
					}
					setState(403); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(405);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(406);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(411);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(412);
						match(SEMI);
						}
					}

					}
				}

				setState(418); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(417);
					hooks();
					}
					}
					setState(420); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(424);
				returnStatement();
				}
			}

			setState(427);
			match(RCURLY);
			setState(428);
			match(WHILE);
			setState(429);
			match(LPAREN);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(430);
				match(NOT);
				}
			}

			setState(433);
			conditions();
			setState(434);
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
	public static class For_loop_semanticContext extends ParserRuleContext {
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
		public List<HooksContext> hooks() {
			return getRuleContexts(HooksContext.class);
		}
		public HooksContext hooks(int i) {
			return getRuleContext(HooksContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public For_loop_semanticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_semantic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFor_loop_semantic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFor_loop_semantic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFor_loop_semantic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loop_semanticContext for_loop_semantic() throws RecognitionException {
		For_loop_semanticContext _localctx = new For_loop_semanticContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_loop_semantic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(FOR);
			setState(437);
			match(LPAREN);
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
				{
				setState(438);
				variableDeclaration();
				}
				break;
			case EVENT_ATTRIBUTE:
			case IDENTIFIER:
				{
				setState(439);
				variableDeclarator();
				}
				break;
			case SEMI:
				break;
			default:
				break;
			}
			setState(442);
			match(SEMI);
			setState(443);
			conditions();
			setState(444);
			match(SEMI);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 864989199860760577L) != 0)) {
				{
				setState(445);
				expression(0);
				}
			}

			setState(448);
			match(RPAREN);
			setState(449);
			match(LCURLY);
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(451); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(450);
					hooks();
					}
					}
					setState(453); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(455);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(456);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(461);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(462);
						match(SEMI);
						}
					}

					}
				}

				setState(468); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(467);
					hooks();
					}
					}
					setState(470); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(474);
				returnStatement();
				}
			}

			setState(477);
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
	public static class Try_expression_semanticContext extends ParserRuleContext {
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
		public List<HooksContext> hooks() {
			return getRuleContexts(HooksContext.class);
		}
		public HooksContext hooks(int i) {
			return getRuleContext(HooksContext.class,i);
		}
		public Catch_expressionContext catch_expression() {
			return getRuleContext(Catch_expressionContext.class,0);
		}
		public Finally_expressionContext finally_expression() {
			return getRuleContext(Finally_expressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public Try_expression_semanticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_expression_semantic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTry_expression_semantic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTry_expression_semantic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTry_expression_semantic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_expression_semanticContext try_expression_semantic() throws RecognitionException {
		Try_expression_semanticContext _localctx = new Try_expression_semanticContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_try_expression_semantic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(TRY);
			setState(480);
			match(LCURLY);
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(482); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(481);
						hooks();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(484); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(486);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(487);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(492);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(493);
						match(SEMI);
						}
					}

					}
				}

				setState(499); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(498);
						hooks();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(501); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
				{
				setState(505);
				throwEx();
				}
			}

			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(508);
				returnStatement();
				}
			}

			setState(511);
			match(RCURLY);
			{
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(512);
				catch_expression();
				}
				break;
			}
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(515);
				finally_expression();
				}
				break;
			}
			}
			setState(521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(518);
					match(SEMI);
					}
					} 
				}
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
	public static class Catch_expression_semanticContext extends ParserRuleContext {
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
		public List<HooksContext> hooks() {
			return getRuleContexts(HooksContext.class);
		}
		public HooksContext hooks(int i) {
			return getRuleContext(HooksContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public Catch_expression_semanticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_expression_semantic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCatch_expression_semantic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCatch_expression_semantic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCatch_expression_semantic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_expression_semanticContext catch_expression_semantic() throws RecognitionException {
		Catch_expression_semanticContext _localctx = new Catch_expression_semanticContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_catch_expression_semantic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(CATCH);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(525);
				match(LPAREN);
				setState(526);
				id();
				setState(527);
				match(RPAREN);
				}
			}

			setState(531);
			match(LCURLY);
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(533); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(532);
					hooks();
					}
					}
					setState(535); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(537);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(538);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(543);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(544);
						match(SEMI);
						}
					}

					}
				}

				setState(550); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(549);
					hooks();
					}
					}
					setState(552); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(556);
				returnStatement();
				}
			}

			setState(559);
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
	public static class Finally_expression_semanticContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ReactParser.FINALLY, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<HooksContext> hooks() {
			return getRuleContexts(HooksContext.class);
		}
		public HooksContext hooks(int i) {
			return getRuleContext(HooksContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(ReactParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ReactParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(ReactParser.SEMI, 0); }
		public Finally_expression_semanticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_expression_semantic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFinally_expression_semantic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFinally_expression_semantic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFinally_expression_semantic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_expression_semanticContext finally_expression_semantic() throws RecognitionException {
		Finally_expression_semanticContext _localctx = new Finally_expression_semanticContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_finally_expression_semantic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(FINALLY);
			setState(562);
			match(LCURLY);
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(564); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(563);
					hooks();
					}
					}
					setState(566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(568);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(569);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(574);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(575);
						match(SEMI);
						}
					}

					}
				}

				setState(581); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(580);
					hooks();
					}
					}
					setState(583); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(587);
				returnStatement();
				}
			}

			setState(590);
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
	public static class ThrowEx_semanticContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(ReactParser.THROW, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public HooksContext hooks() {
			return getRuleContext(HooksContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(ReactParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ReactParser.SEMI, i);
		}
		public ThrowEx_semanticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwEx_semantic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterThrowEx_semantic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitThrowEx_semantic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitThrowEx_semantic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowEx_semanticContext throwEx_semantic() throws RecognitionException {
		ThrowEx_semanticContext _localctx = new ThrowEx_semanticContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_throwEx_semantic);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(THROW);
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				{
				setState(593);
				object();
				}
				break;
			case CONST:
			case USEEFFECT:
				{
				setState(594);
				hooks();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(597);
					match(SEMI);
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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
	public static class Semantic_ruleContext extends ParserRuleContext {
		public If_condition_semanticContext if_condition_semantic() {
			return getRuleContext(If_condition_semanticContext.class,0);
		}
		public ElseIf_condition_semanticContext elseIf_condition_semantic() {
			return getRuleContext(ElseIf_condition_semanticContext.class,0);
		}
		public Else_condition_semanticContext else_condition_semantic() {
			return getRuleContext(Else_condition_semanticContext.class,0);
		}
		public TenaryExpression_semanticContext tenaryExpression_semantic() {
			return getRuleContext(TenaryExpression_semanticContext.class,0);
		}
		public While_semanticContext while_semantic() {
			return getRuleContext(While_semanticContext.class,0);
		}
		public Do_while_semanticContext do_while_semantic() {
			return getRuleContext(Do_while_semanticContext.class,0);
		}
		public For_loop_semanticContext for_loop_semantic() {
			return getRuleContext(For_loop_semanticContext.class,0);
		}
		public Try_expression_semanticContext try_expression_semantic() {
			return getRuleContext(Try_expression_semanticContext.class,0);
		}
		public Catch_expression_semanticContext catch_expression_semantic() {
			return getRuleContext(Catch_expression_semanticContext.class,0);
		}
		public Finally_expression_semanticContext finally_expression_semantic() {
			return getRuleContext(Finally_expression_semanticContext.class,0);
		}
		public ThrowEx_semanticContext throwEx_semantic() {
			return getRuleContext(ThrowEx_semanticContext.class,0);
		}
		public Semantic_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semantic_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSemantic_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSemantic_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSemantic_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semantic_ruleContext semantic_rule() throws RecognitionException {
		Semantic_ruleContext _localctx = new Semantic_ruleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_semantic_rule);
		try {
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				if_condition_semantic();
				}
				break;
			case ELSEIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				elseIf_condition_semantic();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				else_condition_semantic();
				}
				break;
			case EVENT_ATTRIBUTE:
			case NOT:
			case LESS_THAN:
			case LPAREN:
			case LSBRACKET:
			case LCURLY:
			case Integer:
			case Float:
			case String:
			case Boolean:
			case Undefined:
			case Null:
			case AWAIT:
			case CREATEELEMENT:
			case IDENTIFIER:
			case ONCLICK:
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				tenaryExpression_semantic();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(607);
				while_semantic();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(608);
				do_while_semantic();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(609);
				for_loop_semantic();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 8);
				{
				setState(610);
				try_expression_semantic();
				}
				break;
			case CATCH:
				enterOuterAlt(_localctx, 9);
				{
				setState(611);
				catch_expression_semantic();
				}
				break;
			case FINALLY:
				enterOuterAlt(_localctx, 10);
				{
				setState(612);
				finally_expression_semantic();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(613);
				throwEx_semantic();
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
		enterRule(_localctx, 30, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
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
		enterRule(_localctx, 32, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34355544064L) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_operation_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17317308137472L) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_operation_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(622);
				jsx();
				}
				break;
			case 2:
				{
				setState(623);
				literal();
				}
				break;
			case 3:
				{
				setState(624);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(625);
				id();
				}
				break;
			case 5:
				{
				setState(626);
				pureReactElement();
				}
				break;
			case 6:
				{
				setState(627);
				array();
				}
				break;
			case 7:
				{
				setState(628);
				functionCall();
				}
				break;
			case 8:
				{
				setState(629);
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
		enterRule(_localctx, 38, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			operation_element();
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(633);
				operation_condition();
				setState(634);
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
		public List<And_orContext> and_or() {
			return getRuleContexts(And_orContext.class);
		}
		public And_orContext and_or(int i) {
			return getRuleContext(And_orContext.class,i);
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
		enterRule(_localctx, 40, RULE_conditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			condition();
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(639);
				and_or();
				setState(640);
				condition();
				}
				}
				setState(646);
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
	public static class And_orContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ReactParser.AND, 0); }
		public TerminalNode OR() { return getToken(ReactParser.OR, 0); }
		public And_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAnd_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAnd_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAnd_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_orContext and_or() throws RecognitionException {
		And_orContext _localctx = new And_orContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_and_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
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
		enterRule(_localctx, 44, RULE_if_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(IF);
			setState(650);
			match(LPAREN);
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(651);
				match(NOT);
				}
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(657);
			conditions();
			setState(658);
			match(RPAREN);
			setState(659);
			match(LCURLY);
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(660);
					statement();
					}
					}
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(666);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(668);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(667);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(672);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(674);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(673);
						match(SEMI);
						}
					}

					}
				}

				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(678);
					statement();
					}
					}
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(686);
				returnStatement();
				}
			}

			setState(689);
			match(RCURLY);
			setState(693);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(690);
					elseIf_condition();
					}
					} 
				}
				setState(695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(696);
				else_condition();
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
		enterRule(_localctx, 46, RULE_elseIf_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(ELSEIF);
			setState(700);
			match(LPAREN);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(701);
				match(NOT);
				}
				}
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(707);
			conditions();
			setState(708);
			match(RPAREN);
			setState(709);
			match(LCURLY);
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(710);
					statement();
					}
					}
					setState(715);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(716);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(718);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(717);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(722);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(724);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(723);
						match(SEMI);
						}
					}

					}
				}

				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(728);
					statement();
					}
					}
					setState(733);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(736);
				returnStatement();
				}
			}

			setState(739);
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
		enterRule(_localctx, 48, RULE_else_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(ELSE);
			setState(742);
			match(LCURLY);
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(743);
					statement();
					}
					}
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(749);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(751);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(750);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(755);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(756);
						match(SEMI);
						}
					}

					}
				}

				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(761);
					statement();
					}
					}
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(769);
				returnStatement();
				}
			}

			setState(772);
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
		enterRule(_localctx, 50, RULE_tenaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(774);
				match(NOT);
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780);
			conditions();
			setState(781);
			match(QUESITIONMARK);
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(782);
				match(LPAREN);
				setState(783);
				statement();
				setState(784);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(786);
				statement();
				}
				break;
			}
			setState(789);
			match(COLON);
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(795);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(790);
					match(LPAREN);
					setState(791);
					statement();
					}
					break;
				case 2:
					{
					setState(792);
					tenaryExpression();
					setState(793);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(799);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(797);
					statement();
					}
					break;
				case 2:
					{
					setState(798);
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
		enterRule(_localctx, 52, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(WHILE);
			setState(804);
			match(LPAREN);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(805);
				match(NOT);
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
			conditions();
			setState(812);
			match(RPAREN);
			setState(813);
			match(LCURLY);
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(814);
					statement();
					}
					}
					setState(819);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(820);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(822);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(821);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(826);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(828);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(827);
						match(SEMI);
						}
					}

					}
				}

				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(832);
					statement();
					}
					}
					setState(837);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(840);
				returnStatement();
				}
			}

			setState(843);
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
		enterRule(_localctx, 54, RULE_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(DO);
			setState(846);
			match(LCURLY);
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(847);
					statement();
					}
					}
					setState(852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(853);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(855);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(854);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(859);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(861);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(860);
						match(SEMI);
						}
					}

					}
				}

				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(865);
					statement();
					}
					}
					setState(870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(873);
				returnStatement();
				}
			}

			setState(876);
			match(RCURLY);
			setState(877);
			match(WHILE);
			setState(878);
			match(LPAREN);
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(879);
				match(NOT);
				}
			}

			setState(882);
			conditions();
			setState(883);
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
		enterRule(_localctx, 56, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			match(FOR);
			setState(886);
			match(LPAREN);
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
				{
				setState(887);
				variableDeclaration();
				}
				break;
			case EVENT_ATTRIBUTE:
			case IDENTIFIER:
				{
				setState(888);
				variableDeclarator();
				}
				break;
			case SEMI:
				break;
			default:
				break;
			}
			setState(891);
			match(SEMI);
			setState(892);
			conditions();
			setState(893);
			match(SEMI);
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 864989199860760577L) != 0)) {
				{
				setState(894);
				expression(0);
				}
			}

			setState(897);
			match(RPAREN);
			setState(898);
			match(LCURLY);
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(899);
					statement();
					}
					}
					setState(904);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(905);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(907);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(906);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(911);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(913);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(912);
						match(SEMI);
						}
					}

					}
				}

				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(917);
					statement();
					}
					}
					setState(922);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(925);
				returnStatement();
				}
			}

			setState(928);
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
		enterRule(_localctx, 58, RULE_try_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(TRY);
			setState(931);
			match(LCURLY);
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(935);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(932);
						statement();
						}
						} 
					}
					setState(937);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(938);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(940);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(939);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(944);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(946);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(945);
						match(SEMI);
						}
					}

					}
				}

				setState(953);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(950);
						statement();
						}
						} 
					}
					setState(955);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				}
				break;
			}
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
				{
				setState(958);
				throwEx();
				}
			}

			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(961);
				returnStatement();
				}
			}

			setState(964);
			match(RCURLY);
			{
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(965);
				catch_expression();
				}
				break;
			}
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(968);
				finally_expression();
				}
				break;
			}
			}
			setState(974);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(971);
					match(SEMI);
					}
					} 
				}
				setState(976);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
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
		enterRule(_localctx, 60, RULE_catch_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(CATCH);
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(978);
				match(LPAREN);
				setState(979);
				id();
				setState(980);
				match(RPAREN);
				}
			}

			setState(984);
			match(LCURLY);
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(985);
					statement();
					}
					}
					setState(990);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(991);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(993);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(992);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(997);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(999);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(998);
						match(SEMI);
						}
					}

					}
				}

				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(1003);
					statement();
					}
					}
					setState(1008);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(1011);
				returnStatement();
				}
			}

			setState(1014);
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
		enterRule(_localctx, 62, RULE_finally_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			match(FINALLY);
			setState(1017);
			match(LCURLY);
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(1018);
					statement();
					}
					}
					setState(1023);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(1024);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1026);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1025);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(1030);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1032);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1031);
						match(SEMI);
						}
					}

					}
				}

				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
					{
					{
					setState(1036);
					statement();
					}
					}
					setState(1041);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(1044);
				returnStatement();
				}
			}

			setState(1047);
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
		enterRule(_localctx, 64, RULE_throwEx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1049);
				match(THROW);
				setState(1050);
				object();
				}
				break;
			case 2:
				{
				setState(1051);
				statement();
				}
				break;
			}
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1054);
				match(SEMI);
				}
				}
				setState(1059);
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
		enterRule(_localctx, 66, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(LCURLY);
			setState(1064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1061);
					comment();
					}
					} 
				}
				setState(1066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			}
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 864691128455135233L) != 0)) {
				{
				setState(1067);
				property();
				setState(1071);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1068);
						comment();
						}
						} 
					}
					setState(1073);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				}
				setState(1090);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1074);
						match(COMMA);
						setState(1078);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SINGLE_LINE_COMMENT || _la==COMMENT_BLOCK) {
							{
							{
							setState(1075);
							comment();
							}
							}
							setState(1080);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1081);
						property();
						setState(1085);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1082);
								comment();
								}
								} 
							}
							setState(1087);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
						}
						}
						} 
					}
					setState(1092);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				}
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1093);
					match(COMMA);
					}
				}

				}
			}

			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==COMMENT_BLOCK) {
				{
				{
				setState(1098);
				comment();
				}
				}
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1104);
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
		public TerminalNode ONCLICK() { return getToken(ReactParser.ONCLICK, 0); }
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
		enterRule(_localctx, 68, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVENT_ATTRIBUTE:
			case IDENTIFIER:
				{
				setState(1106);
				id();
				}
				break;
			case ONCLICK:
				{
				setState(1107);
				match(ONCLICK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1110);
				match(COLON);
				setState(1111);
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
		enterRule(_localctx, 70, RULE_objectExpression);
		try {
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1116);
				objectLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1117);
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
		enterRule(_localctx, 72, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8700954480079798272L) != 0)) ) {
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
		enterRule(_localctx, 74, RULE_unaryExpression);
		try {
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1122);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1124);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1125);
				operator();
				setState(1126);
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
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public JsxContext jsx() {
			return getRuleContext(JsxContext.class,0);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1131);
				memberExpression();
				}
				break;
			case 2:
				{
				setState(1132);
				literal();
				}
				break;
			case 3:
				{
				setState(1133);
				id();
				}
				break;
			case 4:
				{
				setState(1134);
				jsx();
				}
				break;
			case 5:
				{
				setState(1135);
				match(LPAREN);
				setState(1136);
				expression(0);
				setState(1137);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1141);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1142);
						operator();
						setState(1143);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1145);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1146);
						operator();
						}
						break;
					}
					} 
				}
				setState(1151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
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
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public TerminalNode LSBRACKET() { return getToken(ReactParser.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(ReactParser.RSBRACKET, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
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
		MemberExpressionContext _localctx = new MemberExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_memberExpression);
		try {
			setState(1171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1152);
					id();
					}
					break;
				case 2:
					{
					setState(1153);
					array();
					}
					break;
				case 3:
					{
					setState(1154);
					functionCall();
					}
					break;
				}
				setState(1157);
				match(DOT);
				{
				setState(1158);
				memberExpression();
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1160);
				id();
				setState(1161);
				match(LSBRACKET);
				{
				setState(1162);
				memberExpression();
				}
				setState(1163);
				match(RSBRACKET);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1165);
					functionCall();
					}
					break;
				case 2:
					{
					setState(1166);
					array();
					}
					break;
				case 3:
					{
					setState(1167);
					literal();
					}
					break;
				case 4:
					{
					setState(1168);
					id();
					}
					break;
				}
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
		enterRule(_localctx, 80, RULE_variable_declaration_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 7L) != 0)) ) {
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
		enterRule(_localctx, 82, RULE_variableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			variable_declaration_keywords();
			{
			setState(1176);
			variableDeclarator();
			setState(1181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1177);
					match(COMMA);
					setState(1178);
					variableDeclarator();
					}
					} 
				}
				setState(1183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
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
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public AnonymousFunctionDeclarationContext anonymousFunctionDeclaration() {
			return getRuleContext(AnonymousFunctionDeclarationContext.class,0);
		}
		public ArrowFunctionDeclarationContext arrowFunctionDeclaration() {
			return getRuleContext(ArrowFunctionDeclarationContext.class,0);
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
		enterRule(_localctx, 84, RULE_variableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			id();
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1185);
				match(EQUAL);
				setState(1195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1186);
					literal();
					}
					break;
				case 2:
					{
					setState(1187);
					objectLiteral();
					}
					break;
				case 3:
					{
					setState(1188);
					array();
					}
					break;
				case 4:
					{
					setState(1189);
					object();
					}
					break;
				case 5:
					{
					setState(1190);
					expression(0);
					}
					break;
				case 6:
					{
					setState(1191);
					id();
					}
					break;
				case 7:
					{
					setState(1192);
					memberExpression();
					}
					break;
				case 8:
					{
					setState(1193);
					anonymousFunctionDeclaration();
					}
					break;
				case 9:
					{
					setState(1194);
					arrowFunctionDeclaration();
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
		enterRule(_localctx, 86, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(LSBRACKET);
			setState(1203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1200);
					comment();
					}
					} 
				}
				setState(1205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 1441781225017573381L) != 0)) {
				{
				setState(1206);
				arrayElement();
				setState(1210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1207);
						comment();
						}
						} 
					}
					setState(1212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				}
				setState(1229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1213);
						match(COMMA);
						setState(1217);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SINGLE_LINE_COMMENT || _la==COMMENT_BLOCK) {
							{
							{
							setState(1214);
							comment();
							}
							}
							setState(1219);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1220);
						arrayElement();
						setState(1224);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1221);
								comment();
								}
								} 
							}
							setState(1226);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
						}
						}
						} 
					}
					setState(1231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
				}
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1232);
					match(COMMA);
					}
				}

				}
			}

			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==COMMENT_BLOCK) {
				{
				{
				setState(1237);
				comment();
				}
				}
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1243);
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
		enterRule(_localctx, 88, RULE_arrayElement);
		try {
			setState(1252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVENT_ATTRIBUTE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
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
				setState(1246);
				literal();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1247);
				objectLiteral();
				}
				break;
			case CREATEELEMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1248);
				pureReactElement();
				}
				break;
			case LESS_THAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1249);
				jsx();
				}
				break;
			case FUNCTION:
			case LPAREN:
			case ASYNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1250);
				function();
				}
				break;
			case LSBRACKET:
				enterOuterAlt(_localctx, 7);
				{
				setState(1251);
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
		enterRule(_localctx, 90, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(NEW);
			setState(1255);
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
		enterRule(_localctx, 92, RULE_argument);
		try {
			setState(1260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				objectLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1258);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1259);
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
		enterRule(_localctx, 94, RULE_functionBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1262);
					statement();
					}
					} 
				}
				setState(1267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1268);
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
		public Semantic_ruleContext semantic_rule() {
			return getRuleContext(Semantic_ruleContext.class,0);
		}
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
		enterRule(_localctx, 96, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1271);
				semantic_rule();
				}
				break;
			case 2:
				{
				setState(1272);
				if_condition();
				}
				break;
			case 3:
				{
				setState(1273);
				variableDeclaration();
				}
				break;
			case 4:
				{
				setState(1274);
				tenaryExpression();
				}
				break;
			case 5:
				{
				setState(1275);
				namedFunctionDeclaration();
				}
				break;
			case 6:
				{
				setState(1276);
				functionCall();
				}
				break;
			case 7:
				{
				setState(1277);
				useEffectDeclaration();
				}
				break;
			case 8:
				{
				setState(1278);
				useStateDeclaration();
				}
				break;
			case 9:
				{
				setState(1279);
				useRefDeclaration();
				}
				break;
			case 10:
				{
				setState(1280);
				pureReactElement();
				}
				break;
			case 11:
				{
				setState(1281);
				jsxExpression();
				}
				break;
			case 12:
				{
				setState(1282);
				while_();
				}
				break;
			case 13:
				{
				setState(1283);
				do_while();
				}
				break;
			case 14:
				{
				setState(1284);
				for_loop();
				}
				break;
			case 15:
				{
				setState(1285);
				expression(0);
				}
				break;
			case 16:
				{
				setState(1286);
				unaryExpression();
				}
				break;
			case 17:
				{
				setState(1287);
				try_expression();
				}
				break;
			case 18:
				{
				setState(1288);
				variableDeclarator();
				}
				break;
			case 19:
				{
				setState(1289);
				conditions();
				}
				break;
			case 20:
				{
				setState(1290);
				comment();
				}
				break;
			case 21:
				{
				setState(1291);
				importStatement();
				}
				break;
			case 22:
				{
				setState(1292);
				function();
				}
				break;
			case 23:
				{
				setState(1293);
				exportStatement();
				}
				break;
			}
			setState(1299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1296);
					match(SEMI);
					}
					} 
				}
				setState(1301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
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
		enterRule(_localctx, 98, RULE_returnStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			match(RETURN);
			setState(1326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				{
				setState(1303);
				match(LPAREN);
				setState(1312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1304);
					jsx();
					}
					break;
				case 2:
					{
					setState(1305);
					expression(0);
					}
					break;
				case 3:
					{
					setState(1306);
					literal();
					}
					break;
				case 4:
					{
					setState(1307);
					objectLiteral();
					}
					break;
				case 5:
					{
					setState(1308);
					unaryExpression();
					}
					break;
				case 6:
					{
					setState(1309);
					id();
					}
					break;
				case 7:
					{
					setState(1310);
					pureReactElement();
					}
					break;
				case 8:
					{
					setState(1311);
					array();
					}
					break;
				}
				setState(1314);
				match(RPAREN);
				}
				}
				break;
			case 2:
				{
				setState(1324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1316);
					jsx();
					}
					break;
				case 2:
					{
					setState(1317);
					expression(0);
					}
					break;
				case 3:
					{
					setState(1318);
					literal();
					}
					break;
				case 4:
					{
					setState(1319);
					objectLiteral();
					}
					break;
				case 5:
					{
					setState(1320);
					id();
					}
					break;
				case 6:
					{
					setState(1321);
					unaryExpression();
					}
					break;
				case 7:
					{
					setState(1322);
					pureReactElement();
					}
					break;
				case 8:
					{
					setState(1323);
					array();
					}
					break;
				}
				}
				break;
			}
			setState(1331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1328);
					match(SEMI);
					}
					} 
				}
				setState(1333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
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
		enterRule(_localctx, 100, RULE_namedFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(1334);
				match(ASYNC);
				}
			}

			setState(1337);
			match(FUNCTION);
			setState(1338);
			id();
			setState(1339);
			match(LPAREN);
			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
				{
				setState(1340);
				argument();
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1341);
					match(COMMA);
					setState(1342);
					argument();
					}
					}
					setState(1347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1350);
			match(RPAREN);
			setState(1351);
			match(LCURLY);
			setState(1352);
			functionBody();
			setState(1353);
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
		enterRule(_localctx, 102, RULE_arrowFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			match(LPAREN);
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
				{
				setState(1356);
				argument();
				setState(1361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1357);
					match(COMMA);
					setState(1358);
					argument();
					}
					}
					setState(1363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1366);
			match(RPAREN);
			setState(1367);
			match(ARROW);
			setState(1377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				{
				setState(1368);
				match(LCURLY);
				setState(1369);
				functionBody();
				setState(1370);
				match(RCURLY);
				}
				}
				break;
			case 2:
				{
				setState(1372);
				functionBody();
				}
				break;
			case 3:
				{
				{
				setState(1373);
				match(LPAREN);
				setState(1374);
				functionBody();
				setState(1375);
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
		enterRule(_localctx, 104, RULE_anonymousFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			match(FUNCTION);
			setState(1380);
			match(LPAREN);
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
				{
				setState(1381);
				argument();
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1382);
					match(COMMA);
					setState(1383);
					argument();
					}
					}
					setState(1388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1391);
			match(RPAREN);
			setState(1392);
			match(LCURLY);
			setState(1393);
			functionBody();
			setState(1394);
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
		enterRule(_localctx, 106, RULE_function);
		try {
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1396);
				arrowFunctionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1397);
				namedFunctionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1398);
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
		public TerminalNode ONCLICK() { return getToken(ReactParser.ONCLICK, 0); }
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
		enterRule(_localctx, 108, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AWAIT) {
				{
				setState(1401);
				match(AWAIT);
				}
			}

			setState(1406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVENT_ATTRIBUTE:
			case IDENTIFIER:
				{
				setState(1404);
				id();
				}
				break;
			case ONCLICK:
				{
				setState(1405);
				match(ONCLICK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(1408);
			match(LPAREN);
			setState(1417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
				{
				setState(1409);
				argument();
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1410);
					match(COMMA);
					setState(1411);
					argument();
					}
					}
					setState(1416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1419);
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
		enterRule(_localctx, 110, RULE_exportSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			id();
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1422);
				match(AS);
				setState(1425);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EVENT_ATTRIBUTE:
				case IDENTIFIER:
					{
					setState(1423);
					id();
					}
					break;
				case String:
					{
					setState(1424);
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
		enterRule(_localctx, 112, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(1429);
				namedExport();
				}
				break;
			case 2:
				{
				setState(1430);
				exportAll();
				}
				break;
			}
			setState(1434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1433);
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
		enterRule(_localctx, 114, RULE_exportDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			match(EXPORT_DEFAULT);
			setState(1442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVENT_ATTRIBUTE:
			case IDENTIFIER:
				{
				setState(1437);
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
				setState(1438);
				literal();
				}
				break;
			case LCURLY:
				{
				setState(1439);
				objectLiteral();
				}
				break;
			case FUNCTION:
			case LPAREN:
			case ASYNC:
				{
				setState(1440);
				function();
				}
				break;
			case CONST:
			case LET:
			case VAR:
				{
				setState(1441);
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
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
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
		enterRule(_localctx, 116, RULE_namedExport);
		int _la;
		try {
			setState(1463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationExportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1444);
				match(EXPORT);
				setState(1445);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new SpecifiedExportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1446);
				match(EXPORT);
				setState(1447);
				match(LCURLY);
				{
				setState(1448);
				exportSpecifier();
				setState(1453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1449);
					match(COMMA);
					setState(1450);
					exportSpecifier();
					}
					}
					setState(1455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1456);
				match(RCURLY);
				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(1457);
					match(FROM);
					setState(1458);
					match(String);
					}
				}

				}
				}
				break;
			case 3:
				_localctx = new NamedFunctionExportContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1461);
				match(EXPORT);
				setState(1462);
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
		enterRule(_localctx, 118, RULE_exportAll);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			match(EXPORT);
			setState(1466);
			match(STAR);
			setState(1472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1467);
				match(AS);
				setState(1470);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EVENT_ATTRIBUTE:
				case IDENTIFIER:
					{
					setState(1468);
					id();
					}
					break;
				case String:
					{
					setState(1469);
					match(String);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			{
			setState(1474);
			match(FROM);
			setState(1475);
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
		enterRule(_localctx, 120, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(IMPORT);
			setState(1506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				{
				setState(1478);
				match(STAR);
				setState(1479);
				match(AS);
				setState(1480);
				id();
				}
				}
				break;
			case 2:
				{
				{
				setState(1481);
				match(LCURLY);
				{
				setState(1482);
				importSpecifier();
				setState(1487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1483);
					match(COMMA);
					setState(1484);
					importSpecifier();
					}
					}
					setState(1489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1490);
				match(RCURLY);
				}
				}
				break;
			case 3:
				{
				{
				setState(1492);
				importSpecifier();
				{
				setState(1493);
				match(COMMA);
				{
				setState(1494);
				match(LCURLY);
				{
				setState(1495);
				importSpecifier();
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1496);
					match(COMMA);
					setState(1497);
					importSpecifier();
					}
					}
					setState(1502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1503);
				match(RCURLY);
				}
				}
				}
				}
				break;
			case 4:
				{
				setState(1505);
				importSpecifier();
				}
				break;
			}
			setState(1508);
			match(FROM);
			setState(1509);
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
		enterRule(_localctx, 122, RULE_importSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVENT_ATTRIBUTE:
			case IDENTIFIER:
				{
				setState(1511);
				id();
				}
				break;
			case USESTATE:
				{
				setState(1512);
				match(USESTATE);
				}
				break;
			case USEEFFECT:
				{
				setState(1513);
				match(USEEFFECT);
				}
				break;
			case USEREF:
				{
				setState(1514);
				match(USEREF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1517);
				match(AS);
				setState(1518);
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
		enterRule(_localctx, 124, RULE_jsx);
		try {
			setState(1524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				normalJsxElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522);
				selfClosingElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1523);
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
		enterRule(_localctx, 126, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			match(LESS_THAN);
			setState(1527);
			id();
			setState(1532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1528);
				match(DOT);
				setState(1529);
				id();
				}
				}
				setState(1534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 288230378299195393L) != 0)) {
				{
				{
				setState(1535);
				jsxAttribute();
				}
				}
				setState(1540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1541);
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
		enterRule(_localctx, 128, RULE_closeTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(LESS_THAN);
			setState(1544);
			match(DIVIDE);
			setState(1545);
			id();
			setState(1550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1546);
				match(DOT);
				setState(1547);
				id();
				}
				}
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1553);
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
		enterRule(_localctx, 130, RULE_selfClosingElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(LESS_THAN);
			setState(1556);
			id();
			setState(1561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1557);
				match(DOT);
				setState(1558);
				id();
				}
				}
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 288230378299195393L) != 0)) {
				{
				{
				setState(1564);
				jsxAttribute();
				}
				}
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1570);
			match(DIVIDE);
			setState(1571);
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
		public SpreadOperationContext spreadOperation() {
			return getRuleContext(SpreadOperationContext.class,0);
		}
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
		enterRule(_localctx, 132, RULE_jsxExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(LCURLY);
			setState(1593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 864989202008309753L) != 0)) {
					{
					setState(1578);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
					case 1:
						{
						setState(1574);
						functionCall();
						}
						break;
					case 2:
						{
						setState(1575);
						expression(0);
						}
						break;
					case 3:
						{
						setState(1576);
						unaryExpression();
						}
						break;
					case 4:
						{
						setState(1577);
						objectLiteral();
						}
						break;
					}
					}
					setState(1582);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 562950490292225L) != 0)) {
					{
					setState(1583);
					function();
					}
				}

				}
				break;
			case 3:
				{
				setState(1586);
				spreadOperation();
				}
				break;
			case 4:
				{
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LCURLY) {
					{
					{
					setState(1587);
					jsxExpression();
					}
					}
					setState(1592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1595);
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
		enterRule(_localctx, 134, RULE_normalJsxElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1597);
			openTag();
			}
			setState(1603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1601);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
					case 1:
						{
						setState(1598);
						jsx();
						}
						break;
					case 2:
						{
						setState(1599);
						jsxExpression();
						}
						break;
					case 3:
						{
						setState(1600);
						statement();
						}
						break;
					}
					} 
				}
				setState(1605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
			}
			{
			setState(1606);
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
		enterRule(_localctx, 136, RULE_jsxFragment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1608);
			match(LESS_THAN);
			setState(1609);
			match(GREATER_THAN);
			}
			setState(1616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1614);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
					case 1:
						{
						setState(1611);
						jsx();
						}
						break;
					case 2:
						{
						setState(1612);
						jsxExpression();
						}
						break;
					case 3:
						{
						setState(1613);
						statement();
						}
						break;
					}
					} 
				}
				setState(1618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			{
			setState(1619);
			match(LESS_THAN);
			setState(1620);
			match(DIVIDE);
			setState(1621);
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
	public static class EventAttributeContext extends JsxAttributeContext {
		public TerminalNode EVENT_ATTRIBUTE() { return getToken(ReactParser.EVENT_ATTRIBUTE, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(ReactParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(ReactParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(ReactParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(ReactParser.RCURLY, i);
		}
		public TerminalNode LPAREN() { return getToken(ReactParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public MemberExpressionContext memberExpression() {
			return getRuleContext(MemberExpressionContext.class,0);
		}
		public EventAttributeContext(JsxAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEventAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEventAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEventAttribute(this);
			else return visitor.visitChildren(this);
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
		enterRule(_localctx, 138, RULE_jsxAttribute);
		int _la;
		try {
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				_localctx = new JsxSpreadAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1623);
				match(LCURLY);
				setState(1624);
				spreadOperation();
				setState(1625);
				match(RCURLY);
				}
				}
				break;
			case 2:
				_localctx = new EventAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1627);
				match(EVENT_ATTRIBUTE);
				setState(1628);
				match(EQUAL);
				setState(1629);
				match(LCURLY);
				setState(1641);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					{
					setState(1630);
					match(LPAREN);
					setState(1631);
					match(RPAREN);
					setState(1632);
					match(ARROW);
					setState(1638);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EVENT_ATTRIBUTE:
					case LSBRACKET:
					case Integer:
					case Float:
					case String:
					case Boolean:
					case Undefined:
					case Null:
					case AWAIT:
					case IDENTIFIER:
					case ONCLICK:
						{
						setState(1633);
						memberExpression();
						}
						break;
					case LCURLY:
						{
						setState(1634);
						match(LCURLY);
						setState(1635);
						memberExpression();
						setState(1636);
						match(RCURLY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				case EVENT_ATTRIBUTE:
				case LSBRACKET:
				case Integer:
				case Float:
				case String:
				case Boolean:
				case Undefined:
				case Null:
				case AWAIT:
				case IDENTIFIER:
				case ONCLICK:
					{
					{
					setState(1640);
					memberExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1643);
				match(RCURLY);
				}
				}
				break;
			case 3:
				_localctx = new JsxIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1645);
				id();
				setState(1651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1646);
					match(EQUAL);
					setState(1649);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Integer:
					case Float:
					case String:
					case Boolean:
					case Undefined:
					case Null:
						{
						setState(1647);
						literal();
						}
						break;
					case LCURLY:
						{
						setState(1648);
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
		enterRule(_localctx, 140, RULE_spreadOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(DOT);
			setState(1656);
			match(DOT);
			setState(1657);
			match(DOT);
			setState(1663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(1658);
				id();
				}
				break;
			case 2:
				{
				setState(1659);
				literal();
				}
				break;
			case 3:
				{
				setState(1660);
				array();
				}
				break;
			case 4:
				{
				setState(1661);
				function();
				}
				break;
			case 5:
				{
				setState(1662);
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
		enterRule(_localctx, 142, RULE_useStateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			match(CONST);
			setState(1666);
			match(LSBRACKET);
			setState(1667);
			id();
			setState(1668);
			match(COMMA);
			setState(1669);
			id();
			setState(1670);
			match(RSBRACKET);
			setState(1671);
			match(EQUAL);
			setState(1672);
			match(USESTATE);
			setState(1673);
			match(LPAREN);
			setState(1678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(1674);
				id();
				}
				break;
			case 2:
				{
				setState(1675);
				literal();
				}
				break;
			case 3:
				{
				setState(1676);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(1677);
				expression(0);
				}
				break;
			}
			setState(1680);
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
		enterRule(_localctx, 144, RULE_useRefDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			match(CONST);
			setState(1683);
			id();
			setState(1684);
			match(EQUAL);
			setState(1685);
			match(USEREF);
			setState(1686);
			match(LPAREN);
			setState(1691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(1687);
				id();
				}
				break;
			case 2:
				{
				setState(1688);
				literal();
				}
				break;
			case 3:
				{
				setState(1689);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(1690);
				expression(0);
				}
				break;
			}
			setState(1693);
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
		public TerminalNode RPAREN() { return getToken(ReactParser.RPAREN, 0); }
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
		enterRule(_localctx, 146, RULE_useEffectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(USEEFFECT);
			setState(1696);
			match(LPAREN);
			setState(1699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				setState(1697);
				anonymousFunctionDeclaration();
				}
				break;
			case LPAREN:
				{
				setState(1698);
				arrowFunctionDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1701);
				match(COMMA);
				setState(1702);
				dependencyArray();
				}
			}

			setState(1705);
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
	public static class DependencyArrayContext extends ParserRuleContext {
		public TerminalNode LSBRACKET() { return getToken(ReactParser.LSBRACKET, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode RSBRACKET() { return getToken(ReactParser.RSBRACKET, 0); }
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
		enterRule(_localctx, 148, RULE_dependencyArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1707);
			match(LSBRACKET);
			setState(1708);
			id();
			setState(1713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1709);
				match(COMMA);
				setState(1710);
				id();
				}
				}
				setState(1715);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1716);
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
		enterRule(_localctx, 150, RULE_props);
		try {
			setState(1721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1718);
				objectLiteral();
				}
				break;
			case EVENT_ATTRIBUTE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1719);
				id();
				}
				break;
			case Null:
				enterOuterAlt(_localctx, 3);
				{
				setState(1720);
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
		enterRule(_localctx, 152, RULE_pureReactElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			match(CREATEELEMENT);
			setState(1724);
			match(LPAREN);
			setState(1725);
			expression(0);
			setState(1726);
			match(COMMA);
			setState(1727);
			props();
			setState(1739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1728);
				match(COMMA);
				setState(1735);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Integer:
				case Float:
				case String:
				case Boolean:
				case Undefined:
				case Null:
					{
					setState(1729);
					literal();
					}
					break;
				case EVENT_ATTRIBUTE:
				case IDENTIFIER:
					{
					setState(1730);
					id();
					}
					break;
				case LSBRACKET:
					{
					setState(1731);
					array();
					}
					break;
				case CREATEELEMENT:
					{
					setState(1732);
					pureReactElement();
					}
					break;
				case LESS_THAN:
					{
					setState(1733);
					jsx();
					}
					break;
				case DOT:
					{
					setState(1734);
					spreadOperation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1742);
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
		enterRule(_localctx, 154, RULE_component_return_statment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			match(RETURN);
			setState(1755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				{
				setState(1745);
				match(LPAREN);
				setState(1748);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS_THAN:
					{
					setState(1746);
					jsx();
					}
					break;
				case Null:
					{
					setState(1747);
					match(Null);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1750);
				match(RPAREN);
				}
				}
				break;
			case LESS_THAN:
			case Null:
				{
				setState(1753);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS_THAN:
					{
					setState(1751);
					jsx();
					}
					break;
				case Null:
					{
					setState(1752);
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
			setState(1760);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1757);
					match(SEMI);
					}
					} 
				}
				setState(1762);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
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
		enterRule(_localctx, 156, RULE_functionalComponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(1763);
				arrowComponentDeclaration();
				}
				break;
			case FUNCTION:
				{
				setState(1764);
				namedComponentDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1767);
					match(SEMI);
					}
					} 
				}
				setState(1772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
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
		enterRule(_localctx, 158, RULE_arrowComponentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			match(CONST);
			setState(1774);
			id();
			setState(1775);
			match(EQUAL);
			setState(1776);
			match(LPAREN);
			setState(1778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 288239174392217601L) != 0)) {
				{
				setState(1777);
				props();
				}
			}

			setState(1780);
			match(RPAREN);
			setState(1781);
			match(ARROW);
			setState(1787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				{
				{
				setState(1782);
				match(LCURLY);
				setState(1783);
				componentFunctionBody();
				setState(1784);
				match(RCURLY);
				}
				}
				break;
			case 2:
				{
				setState(1786);
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
		enterRule(_localctx, 160, RULE_namedComponentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			match(FUNCTION);
			setState(1790);
			id();
			setState(1791);
			match(LPAREN);
			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 288239174392217601L) != 0)) {
				{
				setState(1792);
				props();
				}
			}

			setState(1795);
			match(RPAREN);
			setState(1796);
			match(LCURLY);
			setState(1797);
			componentFunctionBody();
			setState(1798);
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
		enterRule(_localctx, 162, RULE_componentFunctionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27711L) != 0)) {
				{
				{
				setState(1800);
				statement();
				}
				}
				setState(1805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1806);
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
		case 38:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\u0004\u0001N\u0711\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0001\u0000\u0005\u0000\u00a6\b\u0000\n\u0000\f"+
		"\u0000\u00a9\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00ad\b\u0000"+
		"\n\u0000\f\u0000\u00b0\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00b4"+
		"\b\u0000\n\u0000\f\u0000\u00b7\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u00bc\b\u0000\n\u0000\f\u0000\u00bf\t\u0000\u0001\u0000\u0005"+
		"\u0000\u00c2\b\u0000\n\u0000\f\u0000\u00c5\t\u0000\u0003\u0000\u00c7\b"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u00ce\b\u0002\u0001\u0002\u0003\u0002\u00d1\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u00d6\b\u0003\n\u0003\f\u0003\u00d9"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u00df"+
		"\b\u0003\u000b\u0003\f\u0003\u00e0\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00e5\b\u0003\u0003\u0003\u00e7\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00eb\b\u0003\u0003\u0003\u00ed\b\u0003\u0001\u0003\u0004\u0003"+
		"\u00f0\b\u0003\u000b\u0003\f\u0003\u00f1\u0003\u0003\u00f4\b\u0003\u0001"+
		"\u0003\u0003\u0003\u00f7\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00fb"+
		"\b\u0003\n\u0003\f\u0003\u00fe\t\u0003\u0001\u0003\u0003\u0003\u0101\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0106\b\u0004\n"+
		"\u0004\f\u0004\u0109\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0004\u0004\u010f\b\u0004\u000b\u0004\f\u0004\u0110\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0115\b\u0004\u0003\u0004\u0117\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u011b\b\u0004\u0003\u0004\u011d\b\u0004"+
		"\u0001\u0004\u0004\u0004\u0120\b\u0004\u000b\u0004\f\u0004\u0121\u0003"+
		"\u0004\u0124\b\u0004\u0001\u0004\u0003\u0004\u0127\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u012e\b\u0005"+
		"\u000b\u0005\f\u0005\u012f\u0001\u0005\u0001\u0005\u0003\u0005\u0134\b"+
		"\u0005\u0003\u0005\u0136\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u013a"+
		"\b\u0005\u0003\u0005\u013c\b\u0005\u0001\u0005\u0004\u0005\u013f\b\u0005"+
		"\u000b\u0005\f\u0005\u0140\u0003\u0005\u0143\b\u0005\u0001\u0005\u0003"+
		"\u0005\u0146\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0005\u0006\u014b"+
		"\b\u0006\n\u0006\f\u0006\u014e\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0157\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u015f\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0163\b"+
		"\u0006\u0003\u0006\u0165\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u016a\b\u0007\n\u0007\f\u0007\u016d\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u0173\b\u0007\u000b\u0007\f\u0007"+
		"\u0174\u0001\u0007\u0001\u0007\u0003\u0007\u0179\b\u0007\u0003\u0007\u017b"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u017f\b\u0007\u0003\u0007"+
		"\u0181\b\u0007\u0001\u0007\u0004\u0007\u0184\b\u0007\u000b\u0007\f\u0007"+
		"\u0185\u0003\u0007\u0188\b\u0007\u0001\u0007\u0003\u0007\u018b\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0004\b\u0192\b\b\u000b"+
		"\b\f\b\u0193\u0001\b\u0001\b\u0003\b\u0198\b\b\u0003\b\u019a\b\b\u0001"+
		"\b\u0001\b\u0003\b\u019e\b\b\u0003\b\u01a0\b\b\u0001\b\u0004\b\u01a3\b"+
		"\b\u000b\b\f\b\u01a4\u0003\b\u01a7\b\b\u0001\b\u0003\b\u01aa\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u01b0\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u01b9\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u01bf\b\t\u0001\t\u0001\t\u0001\t\u0004\t\u01c4\b\t\u000b\t"+
		"\f\t\u01c5\u0001\t\u0001\t\u0003\t\u01ca\b\t\u0003\t\u01cc\b\t\u0001\t"+
		"\u0001\t\u0003\t\u01d0\b\t\u0003\t\u01d2\b\t\u0001\t\u0004\t\u01d5\b\t"+
		"\u000b\t\f\t\u01d6\u0003\t\u01d9\b\t\u0001\t\u0003\t\u01dc\b\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0004\n\u01e3\b\n\u000b\n\f\n\u01e4\u0001"+
		"\n\u0001\n\u0003\n\u01e9\b\n\u0003\n\u01eb\b\n\u0001\n\u0001\n\u0003\n"+
		"\u01ef\b\n\u0003\n\u01f1\b\n\u0001\n\u0004\n\u01f4\b\n\u000b\n\f\n\u01f5"+
		"\u0003\n\u01f8\b\n\u0001\n\u0003\n\u01fb\b\n\u0001\n\u0003\n\u01fe\b\n"+
		"\u0001\n\u0001\n\u0003\n\u0202\b\n\u0001\n\u0003\n\u0205\b\n\u0001\n\u0005"+
		"\n\u0208\b\n\n\n\f\n\u020b\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0212\b\u000b\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u0216\b\u000b\u000b\u000b\f\u000b\u0217\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u021c\b\u000b\u0003\u000b\u021e\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0222\b\u000b\u0003\u000b\u0224\b\u000b\u0001\u000b"+
		"\u0004\u000b\u0227\b\u000b\u000b\u000b\f\u000b\u0228\u0003\u000b\u022b"+
		"\b\u000b\u0001\u000b\u0003\u000b\u022e\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0004\f\u0235\b\f\u000b\f\f\f\u0236\u0001\f\u0001"+
		"\f\u0003\f\u023b\b\f\u0003\f\u023d\b\f\u0001\f\u0001\f\u0003\f\u0241\b"+
		"\f\u0003\f\u0243\b\f\u0001\f\u0004\f\u0246\b\f\u000b\f\f\f\u0247\u0003"+
		"\f\u024a\b\f\u0001\f\u0003\f\u024d\b\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u0254\b\r\u0001\r\u0005\r\u0257\b\r\n\r\f\r\u025a\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0267\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0277\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u027d\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0283\b\u0014\n\u0014"+
		"\f\u0014\u0286\t\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u028d\b\u0016\n\u0016\f\u0016\u0290\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0296\b\u0016\n"+
		"\u0016\f\u0016\u0299\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u029d"+
		"\b\u0016\u0003\u0016\u029f\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u02a3\b\u0016\u0003\u0016\u02a5\b\u0016\u0001\u0016\u0005\u0016\u02a8"+
		"\b\u0016\n\u0016\f\u0016\u02ab\t\u0016\u0003\u0016\u02ad\b\u0016\u0001"+
		"\u0016\u0003\u0016\u02b0\b\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u02b4"+
		"\b\u0016\n\u0016\f\u0016\u02b7\t\u0016\u0001\u0016\u0003\u0016\u02ba\b"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u02bf\b\u0017\n"+
		"\u0017\f\u0017\u02c2\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u02c8\b\u0017\n\u0017\f\u0017\u02cb\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u02cf\b\u0017\u0003\u0017\u02d1\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u02d5\b\u0017\u0003\u0017\u02d7\b\u0017"+
		"\u0001\u0017\u0005\u0017\u02da\b\u0017\n\u0017\f\u0017\u02dd\t\u0017\u0003"+
		"\u0017\u02df\b\u0017\u0001\u0017\u0003\u0017\u02e2\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u02e9\b\u0018"+
		"\n\u0018\f\u0018\u02ec\t\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u02f0"+
		"\b\u0018\u0003\u0018\u02f2\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u02f6\b\u0018\u0003\u0018\u02f8\b\u0018\u0001\u0018\u0005\u0018\u02fb"+
		"\b\u0018\n\u0018\f\u0018\u02fe\t\u0018\u0003\u0018\u0300\b\u0018\u0001"+
		"\u0018\u0003\u0018\u0303\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0005"+
		"\u0019\u0308\b\u0019\n\u0019\f\u0019\u030b\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0314\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u031c\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0320\b\u0019\u0003\u0019\u0322\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u0327\b\u001a\n\u001a\f\u001a\u032a\t\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0330\b\u001a\n\u001a"+
		"\f\u001a\u0333\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0337\b\u001a"+
		"\u0003\u001a\u0339\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u033d\b"+
		"\u001a\u0003\u001a\u033f\b\u001a\u0001\u001a\u0005\u001a\u0342\b\u001a"+
		"\n\u001a\f\u001a\u0345\t\u001a\u0003\u001a\u0347\b\u001a\u0001\u001a\u0003"+
		"\u001a\u034a\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u0351\b\u001b\n\u001b\f\u001b\u0354\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0358\b\u001b\u0003\u001b\u035a\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u035e\b\u001b\u0003\u001b\u0360\b\u001b"+
		"\u0001\u001b\u0005\u001b\u0363\b\u001b\n\u001b\f\u001b\u0366\t\u001b\u0003"+
		"\u001b\u0368\b\u001b\u0001\u001b\u0003\u001b\u036b\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0371\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u037a\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0380\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u0385\b\u001c\n\u001c\f\u001c\u0388\t\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u038c\b\u001c\u0003\u001c\u038e\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0392\b\u001c\u0003\u001c\u0394\b\u001c\u0001\u001c\u0005"+
		"\u001c\u0397\b\u001c\n\u001c\f\u001c\u039a\t\u001c\u0003\u001c\u039c\b"+
		"\u001c\u0001\u001c\u0003\u001c\u039f\b\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u03a6\b\u001d\n\u001d\f\u001d"+
		"\u03a9\t\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u03ad\b\u001d\u0003"+
		"\u001d\u03af\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u03b3\b\u001d"+
		"\u0003\u001d\u03b5\b\u001d\u0001\u001d\u0005\u001d\u03b8\b\u001d\n\u001d"+
		"\f\u001d\u03bb\t\u001d\u0003\u001d\u03bd\b\u001d\u0001\u001d\u0003\u001d"+
		"\u03c0\b\u001d\u0001\u001d\u0003\u001d\u03c3\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u03c7\b\u001d\u0001\u001d\u0003\u001d\u03ca\b\u001d"+
		"\u0001\u001d\u0005\u001d\u03cd\b\u001d\n\u001d\f\u001d\u03d0\t\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u03d7"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u03db\b\u001e\n\u001e\f\u001e"+
		"\u03de\t\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u03e2\b\u001e\u0003"+
		"\u001e\u03e4\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u03e8\b\u001e"+
		"\u0003\u001e\u03ea\b\u001e\u0001\u001e\u0005\u001e\u03ed\b\u001e\n\u001e"+
		"\f\u001e\u03f0\t\u001e\u0003\u001e\u03f2\b\u001e\u0001\u001e\u0003\u001e"+
		"\u03f5\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u03fc\b\u001f\n\u001f\f\u001f\u03ff\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0403\b\u001f\u0003\u001f\u0405\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0409\b\u001f\u0003\u001f\u040b\b\u001f\u0001"+
		"\u001f\u0005\u001f\u040e\b\u001f\n\u001f\f\u001f\u0411\t\u001f\u0003\u001f"+
		"\u0413\b\u001f\u0001\u001f\u0003\u001f\u0416\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0003 \u041d\b \u0001 \u0005 \u0420\b \n "+
		"\f \u0423\t \u0001!\u0001!\u0005!\u0427\b!\n!\f!\u042a\t!\u0001!\u0001"+
		"!\u0005!\u042e\b!\n!\f!\u0431\t!\u0001!\u0001!\u0005!\u0435\b!\n!\f!\u0438"+
		"\t!\u0001!\u0001!\u0005!\u043c\b!\n!\f!\u043f\t!\u0005!\u0441\b!\n!\f"+
		"!\u0444\t!\u0001!\u0003!\u0447\b!\u0003!\u0449\b!\u0001!\u0005!\u044c"+
		"\b!\n!\f!\u044f\t!\u0001!\u0001!\u0001\"\u0001\"\u0003\"\u0455\b\"\u0001"+
		"\"\u0001\"\u0003\"\u0459\b\"\u0001#\u0001#\u0001#\u0001#\u0003#\u045f"+
		"\b#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0469"+
		"\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u0474\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u047c\b&\n"+
		"&\f&\u047f\t&\u0001\'\u0001\'\u0001\'\u0003\'\u0484\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0492\b\'\u0003\'\u0494\b\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0005)\u049c\b)\n)\f)\u049f\t)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u04ac\b*\u0003"+
		"*\u04ae\b*\u0001+\u0001+\u0005+\u04b2\b+\n+\f+\u04b5\t+\u0001+\u0001+"+
		"\u0005+\u04b9\b+\n+\f+\u04bc\t+\u0001+\u0001+\u0005+\u04c0\b+\n+\f+\u04c3"+
		"\t+\u0001+\u0001+\u0005+\u04c7\b+\n+\f+\u04ca\t+\u0005+\u04cc\b+\n+\f"+
		"+\u04cf\t+\u0001+\u0003+\u04d2\b+\u0003+\u04d4\b+\u0001+\u0005+\u04d7"+
		"\b+\n+\f+\u04da\t+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u04e5\b,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0003"+
		".\u04ed\b.\u0001/\u0005/\u04f0\b/\n/\f/\u04f3\t/\u0001/\u0003/\u04f6\b"+
		"/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00030\u050f\b0\u00010\u00050\u0512\b0\n0\f0\u0515"+
		"\t0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00031\u0521\b1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u052d\b1\u00031\u052f\b1\u00011\u00051\u0532\b"+
		"1\n1\f1\u0535\t1\u00012\u00032\u0538\b2\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00052\u0540\b2\n2\f2\u0543\t2\u00032\u0545\b2\u00012\u00012"+
		"\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00053\u0550\b3\n3\f"+
		"3\u0553\t3\u00033\u0555\b3\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u0562\b3\u00014\u00014\u00014\u0001"+
		"4\u00014\u00054\u0569\b4\n4\f4\u056c\t4\u00034\u056e\b4\u00014\u00014"+
		"\u00014\u00014\u00014\u00015\u00015\u00015\u00035\u0578\b5\u00016\u0003"+
		"6\u057b\b6\u00016\u00016\u00036\u057f\b6\u00016\u00016\u00016\u00016\u0005"+
		"6\u0585\b6\n6\f6\u0588\t6\u00036\u058a\b6\u00016\u00016\u00017\u00017"+
		"\u00017\u00017\u00037\u0592\b7\u00037\u0594\b7\u00018\u00018\u00038\u0598"+
		"\b8\u00018\u00038\u059b\b8\u00019\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u05a3\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u05ac"+
		"\b:\n:\f:\u05af\t:\u0001:\u0001:\u0001:\u0003:\u05b4\b:\u0001:\u0001:"+
		"\u0003:\u05b8\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u05bf\b;\u0003"+
		";\u05c1\b;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0005<\u05ce\b<\n<\f<\u05d1\t<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0005<\u05db\b<\n<\f<\u05de\t<\u0001<\u0001"+
		"<\u0001<\u0003<\u05e3\b<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		"=\u0003=\u05ec\b=\u0001=\u0001=\u0003=\u05f0\b=\u0001>\u0001>\u0001>\u0003"+
		">\u05f5\b>\u0001?\u0001?\u0001?\u0001?\u0005?\u05fb\b?\n?\f?\u05fe\t?"+
		"\u0001?\u0005?\u0601\b?\n?\f?\u0604\t?\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0005@\u060d\b@\n@\f@\u0610\t@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0001A\u0005A\u0618\bA\nA\fA\u061b\tA\u0001A\u0005A\u061e\bA"+
		"\nA\fA\u0621\tA\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0005B\u062b\bB\nB\fB\u062e\tB\u0001B\u0003B\u0631\bB\u0001B\u0001B"+
		"\u0005B\u0635\bB\nB\fB\u0638\tB\u0003B\u063a\bB\u0001B\u0001B\u0001C\u0001"+
		"C\u0001C\u0001C\u0005C\u0642\bC\nC\fC\u0645\tC\u0001C\u0001C\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0005D\u064f\bD\nD\fD\u0652\tD\u0001D\u0001"+
		"D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u0667\bE\u0001"+
		"E\u0003E\u066a\bE\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u0672"+
		"\bE\u0003E\u0674\bE\u0003E\u0676\bE\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0003F\u0680\bF\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u068f"+
		"\bG\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0003H\u069c\bH\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0003"+
		"I\u06a4\bI\u0001I\u0001I\u0003I\u06a8\bI\u0001I\u0001I\u0001J\u0001J\u0001"+
		"J\u0001J\u0005J\u06b0\bJ\nJ\fJ\u06b3\tJ\u0001J\u0001J\u0001K\u0001K\u0001"+
		"K\u0003K\u06ba\bK\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0003L\u06c8\bL\u0005L\u06ca\bL\nL\fL\u06cd"+
		"\tL\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0003M\u06d5\bM\u0001M\u0001"+
		"M\u0001M\u0003M\u06da\bM\u0003M\u06dc\bM\u0001M\u0005M\u06df\bM\nM\fM"+
		"\u06e2\tM\u0001N\u0001N\u0003N\u06e6\bN\u0001N\u0005N\u06e9\bN\nN\fN\u06ec"+
		"\tN\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u06f3\bO\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0003O\u06fc\bO\u0001P\u0001P\u0001P\u0001"+
		"P\u0003P\u0702\bP\u0001P\u0001P\u0001P\u0001P\u0001P\u0001Q\u0005Q\u070a"+
		"\bQ\nQ\fQ\u070d\tQ\u0001Q\u0001Q\u0001Q\u0000\u0001LR\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u0000\b\u0002\u0000\u0013\u0013MM\u0001\u0000\t\n\u0001\u0000"+
		",-\u0001\u0000\u0016\"\u0001\u0000&+\u0001\u0000#$\u0002\u000067;>\u0001"+
		"\u0000?A\u0856\u0000\u00a7\u0001\u0000\u0000\u0000\u0002\u00c8\u0001\u0000"+
		"\u0000\u0000\u0004\u00cd\u0001\u0000\u0000\u0000\u0006\u00d2\u0001\u0000"+
		"\u0000\u0000\b\u0102\u0001\u0000\u0000\u0000\n\u012a\u0001\u0000\u0000"+
		"\u0000\f\u014c\u0001\u0000\u0000\u0000\u000e\u0166\u0001\u0000\u0000\u0000"+
		"\u0010\u018e\u0001\u0000\u0000\u0000\u0012\u01b4\u0001\u0000\u0000\u0000"+
		"\u0014\u01df\u0001\u0000\u0000\u0000\u0016\u020c\u0001\u0000\u0000\u0000"+
		"\u0018\u0231\u0001\u0000\u0000\u0000\u001a\u0250\u0001\u0000\u0000\u0000"+
		"\u001c\u0266\u0001\u0000\u0000\u0000\u001e\u0268\u0001\u0000\u0000\u0000"+
		" \u026a\u0001\u0000\u0000\u0000\"\u026c\u0001\u0000\u0000\u0000$\u0276"+
		"\u0001\u0000\u0000\u0000&\u0278\u0001\u0000\u0000\u0000(\u027e\u0001\u0000"+
		"\u0000\u0000*\u0287\u0001\u0000\u0000\u0000,\u0289\u0001\u0000\u0000\u0000"+
		".\u02bb\u0001\u0000\u0000\u00000\u02e5\u0001\u0000\u0000\u00002\u0309"+
		"\u0001\u0000\u0000\u00004\u0323\u0001\u0000\u0000\u00006\u034d\u0001\u0000"+
		"\u0000\u00008\u0375\u0001\u0000\u0000\u0000:\u03a2\u0001\u0000\u0000\u0000"+
		"<\u03d1\u0001\u0000\u0000\u0000>\u03f8\u0001\u0000\u0000\u0000@\u041c"+
		"\u0001\u0000\u0000\u0000B\u0424\u0001\u0000\u0000\u0000D\u0454\u0001\u0000"+
		"\u0000\u0000F\u045e\u0001\u0000\u0000\u0000H\u0460\u0001\u0000\u0000\u0000"+
		"J\u0468\u0001\u0000\u0000\u0000L\u0473\u0001\u0000\u0000\u0000N\u0493"+
		"\u0001\u0000\u0000\u0000P\u0495\u0001\u0000\u0000\u0000R\u0497\u0001\u0000"+
		"\u0000\u0000T\u04a0\u0001\u0000\u0000\u0000V\u04af\u0001\u0000\u0000\u0000"+
		"X\u04e4\u0001\u0000\u0000\u0000Z\u04e6\u0001\u0000\u0000\u0000\\\u04ec"+
		"\u0001\u0000\u0000\u0000^\u04f1\u0001\u0000\u0000\u0000`\u050e\u0001\u0000"+
		"\u0000\u0000b\u0516\u0001\u0000\u0000\u0000d\u0537\u0001\u0000\u0000\u0000"+
		"f\u054b\u0001\u0000\u0000\u0000h\u0563\u0001\u0000\u0000\u0000j\u0577"+
		"\u0001\u0000\u0000\u0000l\u057a\u0001\u0000\u0000\u0000n\u058d\u0001\u0000"+
		"\u0000\u0000p\u0597\u0001\u0000\u0000\u0000r\u059c\u0001\u0000\u0000\u0000"+
		"t\u05b7\u0001\u0000\u0000\u0000v\u05b9\u0001\u0000\u0000\u0000x\u05c5"+
		"\u0001\u0000\u0000\u0000z\u05eb\u0001\u0000\u0000\u0000|\u05f4\u0001\u0000"+
		"\u0000\u0000~\u05f6\u0001\u0000\u0000\u0000\u0080\u0607\u0001\u0000\u0000"+
		"\u0000\u0082\u0613\u0001\u0000\u0000\u0000\u0084\u0625\u0001\u0000\u0000"+
		"\u0000\u0086\u063d\u0001\u0000\u0000\u0000\u0088\u0648\u0001\u0000\u0000"+
		"\u0000\u008a\u0675\u0001\u0000\u0000\u0000\u008c\u0677\u0001\u0000\u0000"+
		"\u0000\u008e\u0681\u0001\u0000\u0000\u0000\u0090\u0692\u0001\u0000\u0000"+
		"\u0000\u0092\u069f\u0001\u0000\u0000\u0000\u0094\u06ab\u0001\u0000\u0000"+
		"\u0000\u0096\u06b9\u0001\u0000\u0000\u0000\u0098\u06bb\u0001\u0000\u0000"+
		"\u0000\u009a\u06d0\u0001\u0000\u0000\u0000\u009c\u06e5\u0001\u0000\u0000"+
		"\u0000\u009e\u06ed\u0001\u0000\u0000\u0000\u00a0\u06fd\u0001\u0000\u0000"+
		"\u0000\u00a2\u070b\u0001\u0000\u0000\u0000\u00a4\u00a6\u0003`0\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ae\u0003\u009cN\u0000\u00ab\u00ad\u0003`0\u0000\u00ac\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b5\u0003"+
		"r9\u0000\u00b2\u00b4\u00055\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005F\u0000\u0000"+
		"\u00b9\u00bd\u0003\u009cN\u0000\u00ba\u00bc\u0003`0\u0000\u00bb\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c3"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c2"+
		"\u00055\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c6\u00aa\u0001\u0000\u0000\u0000\u00c6\u00b8\u0001"+
		"\u0000\u0000\u0000\u00c7\u0001\u0001\u0000\u0000\u0000\u00c8\u00c9\u0007"+
		"\u0000\u0000\u0000\u00c9\u0003\u0001\u0000\u0000\u0000\u00ca\u00ce\u0003"+
		"\u008eG\u0000\u00cb\u00ce\u0003\u0092I\u0000\u00cc\u00ce\u0003\u0090H"+
		"\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d1\u00055\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u0005\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005\u0002\u0000\u0000\u00d3\u00d7\u0005.\u0000\u0000\u00d4"+
		"\u00d6\u0005%\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0003(\u0014\u0000\u00db\u00dc\u0005"+
		"/\u0000\u0000\u00dc\u00f3\u00052\u0000\u0000\u00dd\u00df\u0003\u0004\u0002"+
		"\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e6\u0001\u0000\u0000\u0000\u00e2\u00e4\u0007\u0001\u0000"+
		"\u0000\u00e3\u00e5\u00055\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e2\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e7\u00f4\u0001\u0000\u0000\u0000\u00e8\u00ea\u0007\u0001\u0000\u0000"+
		"\u00e9\u00eb\u00055\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ee\u00f0\u0003\u0004\u0002\u0000\u00ef"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f3\u00de\u0001\u0000\u0000\u0000\u00f3"+
		"\u00ec\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f7\u0003b1\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fc\u0005"+
		"3\u0000\u0000\u00f9\u00fb\u0003.\u0017\u0000\u00fa\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0101\u00030\u0018\u0000"+
		"\u0100\u00ff\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101\u0007\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0003\u0000\u0000"+
		"\u0103\u0107\u0005.\u0000\u0000\u0104\u0106\u0005%\u0000\u0000\u0105\u0104"+
		"\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010a"+
		"\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0003(\u0014\u0000\u010b\u010c\u0005/\u0000\u0000\u010c\u0123\u00052"+
		"\u0000\u0000\u010d\u010f\u0003\u0004\u0002\u0000\u010e\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0116\u0001\u0000"+
		"\u0000\u0000\u0112\u0114\u0007\u0001\u0000\u0000\u0113\u0115\u00055\u0000"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0112\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0124\u0001\u0000\u0000"+
		"\u0000\u0118\u011a\u0007\u0001\u0000\u0000\u0119\u011b\u00055\u0000\u0000"+
		"\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u0118\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000"+
		"\u011e\u0120\u0003\u0004\u0002\u0000\u011f\u011e\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000"+
		"\u0123\u010e\u0001\u0000\u0000\u0000\u0123\u011c\u0001\u0000\u0000\u0000"+
		"\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0127\u0003b1\u0000\u0126\u0125"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u00053\u0000\u0000\u0129\t\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0005\u0004\u0000\u0000\u012b\u0142\u0005"+
		"2\u0000\u0000\u012c\u012e\u0003\u0004\u0002\u0000\u012d\u012c\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0135\u0001\u0000"+
		"\u0000\u0000\u0131\u0133\u0007\u0001\u0000\u0000\u0132\u0134\u00055\u0000"+
		"\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000"+
		"\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u0131\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0143\u0001\u0000\u0000"+
		"\u0000\u0137\u0139\u0007\u0001\u0000\u0000\u0138\u013a\u00055\u0000\u0000"+
		"\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0137\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000"+
		"\u013d\u013f\u0003\u0004\u0002\u0000\u013e\u013d\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000\u0000\u0000"+
		"\u0142\u012d\u0001\u0000\u0000\u0000\u0142\u013b\u0001\u0000\u0000\u0000"+
		"\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0146\u0003b1\u0000\u0145\u0144"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u00053\u0000\u0000\u0148\u000b\u0001"+
		"\u0000\u0000\u0000\u0149\u014b\u0005%\u0000\u0000\u014a\u0149\u0001\u0000"+
		"\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000"+
		"\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0150\u0003(\u0014"+
		"\u0000\u0150\u0156\u0005:\u0000\u0000\u0151\u0152\u0005.\u0000\u0000\u0152"+
		"\u0153\u0003\u0004\u0002\u0000\u0153\u0154\u0005/\u0000\u0000\u0154\u0157"+
		"\u0001\u0000\u0000\u0000\u0155\u0157\u0003\u0004\u0002\u0000\u0156\u0151"+
		"\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0001\u0000\u0000\u0000\u0158\u0164\u00059\u0000\u0000\u0159\u015a\u0005"+
		".\u0000\u0000\u015a\u015f\u0003\u0004\u0002\u0000\u015b\u015c\u00032\u0019"+
		"\u0000\u015c\u015d\u0005/\u0000\u0000\u015d\u015f\u0001\u0000\u0000\u0000"+
		"\u015e\u0159\u0001\u0000\u0000\u0000\u015e\u015b\u0001\u0000\u0000\u0000"+
		"\u015f\u0165\u0001\u0000\u0000\u0000\u0160\u0163\u0003\u0004\u0002\u0000"+
		"\u0161\u0163\u00032\u0019\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0165\u0001\u0000\u0000\u0000\u0164"+
		"\u015e\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165"+
		"\r\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u0006\u0000\u0000\u0167\u016b"+
		"\u0005.\u0000\u0000\u0168\u016a\u0005%\u0000\u0000\u0169\u0168\u0001\u0000"+
		"\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000"+
		"\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u016f\u0003(\u0014"+
		"\u0000\u016f\u0170\u0005/\u0000\u0000\u0170\u0187\u00052\u0000\u0000\u0171"+
		"\u0173\u0003\u0004\u0002\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0001\u0000\u0000\u0000\u0175\u017a\u0001\u0000\u0000\u0000\u0176"+
		"\u0178\u0007\u0001\u0000\u0000\u0177\u0179\u00055\u0000\u0000\u0178\u0177"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017b"+
		"\u0001\u0000\u0000\u0000\u017a\u0176\u0001\u0000\u0000\u0000\u017a\u017b"+
		"\u0001\u0000\u0000\u0000\u017b\u0188\u0001\u0000\u0000\u0000\u017c\u017e"+
		"\u0007\u0001\u0000\u0000\u017d\u017f\u00055\u0000\u0000\u017e\u017d\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0181\u0001"+
		"\u0000\u0000\u0000\u0180\u017c\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u0184\u0003"+
		"\u0004\u0002\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001"+
		"\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001"+
		"\u0000\u0000\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0172\u0001"+
		"\u0000\u0000\u0000\u0187\u0180\u0001\u0000\u0000\u0000\u0188\u018a\u0001"+
		"\u0000\u0000\u0000\u0189\u018b\u0003b1\u0000\u018a\u0189\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u00053\u0000\u0000\u018d\u000f\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\u0005\f\u0000\u0000\u018f\u01a6\u00052\u0000\u0000\u0190"+
		"\u0192\u0003\u0004\u0002\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0001\u0000\u0000\u0000\u0194\u0199\u0001\u0000\u0000\u0000\u0195"+
		"\u0197\u0007\u0001\u0000\u0000\u0196\u0198\u00055\u0000\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019a"+
		"\u0001\u0000\u0000\u0000\u0199\u0195\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0001\u0000\u0000\u0000\u019a\u01a7\u0001\u0000\u0000\u0000\u019b\u019d"+
		"\u0007\u0001\u0000\u0000\u019c\u019e\u00055\u0000\u0000\u019d\u019c\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a0\u0001"+
		"\u0000\u0000\u0000\u019f\u019b\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u01a3\u0003"+
		"\u0004\u0002\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u0191\u0001"+
		"\u0000\u0000\u0000\u01a6\u019f\u0001\u0000\u0000\u0000\u01a7\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a8\u01aa\u0003b1\u0000\u01a9\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u00053\u0000\u0000\u01ac\u01ad\u0005\u0006\u0000\u0000"+
		"\u01ad\u01af\u0005.\u0000\u0000\u01ae\u01b0\u0005%\u0000\u0000\u01af\u01ae"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b2\u0003(\u0014\u0000\u01b2\u01b3\u0005"+
		"/\u0000\u0000\u01b3\u0011\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005\u0005"+
		"\u0000\u0000\u01b5\u01b8\u0005.\u0000\u0000\u01b6\u01b9\u0003R)\u0000"+
		"\u01b7\u01b9\u0003T*\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01ba"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bb\u00055\u0000\u0000\u01bb\u01bc\u0003"+
		"(\u0014\u0000\u01bc\u01be\u00055\u0000\u0000\u01bd\u01bf\u0003L&\u0000"+
		"\u01be\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005/\u0000\u0000\u01c1"+
		"\u01d8\u00052\u0000\u0000\u01c2\u01c4\u0003\u0004\u0002\u0000\u01c3\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01cb"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c9\u0007\u0001\u0000\u0000\u01c8\u01ca"+
		"\u00055\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000\u01cb\u01c7\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01d9\u0001"+
		"\u0000\u0000\u0000\u01cd\u01cf\u0007\u0001\u0000\u0000\u01ce\u01d0\u0005"+
		"5\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01cd\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d5\u0003\u0004\u0002\u0000\u01d4\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d8\u01c3\u0001\u0000\u0000\u0000\u01d8\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u01dc\u0003b1\u0000"+
		"\u01db\u01da\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de\u00053\u0000\u0000\u01de"+
		"\u0013\u0001\u0000\u0000\u0000\u01df\u01e0\u0005\r\u0000\u0000\u01e0\u01f7"+
		"\u00052\u0000\u0000\u01e1\u01e3\u0003\u0004\u0002\u0000\u01e2\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01ea\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e8\u0007\u0001\u0000\u0000\u01e7\u01e9\u0005"+
		"5\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea\u01e6\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01f8\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ee\u0007\u0001\u0000\u0000\u01ed\u01ef\u00055\u0000"+
		"\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000\u01f0\u01ec\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f4\u0003\u0004\u0002\u0000\u01f3\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f7\u01e2\u0001\u0000\u0000\u0000\u01f7\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f8\u01fa\u0001\u0000\u0000\u0000\u01f9\u01fb\u0003@ \u0000\u01fa"+
		"\u01f9\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fc\u01fe\u0003b1\u0000\u01fd\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001"+
		"\u0000\u0000\u0000\u01ff\u0201\u00053\u0000\u0000\u0200\u0202\u0003<\u001e"+
		"\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000"+
		"\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u0205\u0003>\u001f\u0000"+
		"\u0204\u0203\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000"+
		"\u0205\u0209\u0001\u0000\u0000\u0000\u0206\u0208\u00055\u0000\u0000\u0207"+
		"\u0206\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209"+
		"\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a"+
		"\u0015\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020c"+
		"\u0211\u0005\u000e\u0000\u0000\u020d\u020e\u0005.\u0000\u0000\u020e\u020f"+
		"\u0003\u0002\u0001\u0000\u020f\u0210\u0005/\u0000\u0000\u0210\u0212\u0001"+
		"\u0000\u0000\u0000\u0211\u020d\u0001\u0000\u0000\u0000\u0211\u0212\u0001"+
		"\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u022a\u0005"+
		"2\u0000\u0000\u0214\u0216\u0003\u0004\u0002\u0000\u0215\u0214\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u021d\u0001\u0000"+
		"\u0000\u0000\u0219\u021b\u0007\u0001\u0000\u0000\u021a\u021c\u00055\u0000"+
		"\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000"+
		"\u0000\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u0219\u0001\u0000\u0000"+
		"\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u022b\u0001\u0000\u0000"+
		"\u0000\u021f\u0221\u0007\u0001\u0000\u0000\u0220\u0222\u00055\u0000\u0000"+
		"\u0221\u0220\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000"+
		"\u0222\u0224\u0001\u0000\u0000\u0000\u0223\u021f\u0001\u0000\u0000\u0000"+
		"\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0226\u0001\u0000\u0000\u0000"+
		"\u0225\u0227\u0003\u0004\u0002\u0000\u0226\u0225\u0001\u0000\u0000\u0000"+
		"\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022b\u0001\u0000\u0000\u0000"+
		"\u022a\u0215\u0001\u0000\u0000\u0000\u022a\u0223\u0001\u0000\u0000\u0000"+
		"\u022b\u022d\u0001\u0000\u0000\u0000\u022c\u022e\u0003b1\u0000\u022d\u022c"+
		"\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f"+
		"\u0001\u0000\u0000\u0000\u022f\u0230\u00053\u0000\u0000\u0230\u0017\u0001"+
		"\u0000\u0000\u0000\u0231\u0232\u0005\u000f\u0000\u0000\u0232\u0249\u0005"+
		"2\u0000\u0000\u0233\u0235\u0003\u0004\u0002\u0000\u0234\u0233\u0001\u0000"+
		"\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u023c\u0001\u0000"+
		"\u0000\u0000\u0238\u023a\u0007\u0001\u0000\u0000\u0239\u023b\u00055\u0000"+
		"\u0000\u023a\u0239\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000"+
		"\u0000\u023b\u023d\u0001\u0000\u0000\u0000\u023c\u0238\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u024a\u0001\u0000\u0000"+
		"\u0000\u023e\u0240\u0007\u0001\u0000\u0000\u023f\u0241\u00055\u0000\u0000"+
		"\u0240\u023f\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000"+
		"\u0241\u0243\u0001\u0000\u0000\u0000\u0242\u023e\u0001\u0000\u0000\u0000"+
		"\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0245\u0001\u0000\u0000\u0000"+
		"\u0244\u0246\u0003\u0004\u0002\u0000\u0245\u0244\u0001\u0000\u0000\u0000"+
		"\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u024a\u0001\u0000\u0000\u0000"+
		"\u0249\u0234\u0001\u0000\u0000\u0000\u0249\u0242\u0001\u0000\u0000\u0000"+
		"\u024a\u024c\u0001\u0000\u0000\u0000\u024b\u024d\u0003b1\u0000\u024c\u024b"+
		"\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024e"+
		"\u0001\u0000\u0000\u0000\u024e\u024f\u00053\u0000\u0000\u024f\u0019\u0001"+
		"\u0000\u0000\u0000\u0250\u0253\u0005\u0010\u0000\u0000\u0251\u0254\u0003"+
		"Z-\u0000\u0252\u0254\u0003\u0004\u0002\u0000\u0253\u0251\u0001\u0000\u0000"+
		"\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0254\u0258\u0001\u0000\u0000"+
		"\u0000\u0255\u0257\u00055\u0000\u0000\u0256\u0255\u0001\u0000\u0000\u0000"+
		"\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000"+
		"\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u001b\u0001\u0000\u0000\u0000"+
		"\u025a\u0258\u0001\u0000\u0000\u0000\u025b\u0267\u0003\u0006\u0003\u0000"+
		"\u025c\u0267\u0003\b\u0004\u0000\u025d\u0267\u0003\n\u0005\u0000\u025e"+
		"\u0267\u0003\f\u0006\u0000\u025f\u0267\u0003\u000e\u0007\u0000\u0260\u0267"+
		"\u0003\u0010\b\u0000\u0261\u0267\u0003\u0012\t\u0000\u0262\u0267\u0003"+
		"\u0014\n\u0000\u0263\u0267\u0003\u0016\u000b\u0000\u0264\u0267\u0003\u0018"+
		"\f\u0000\u0265\u0267\u0003\u001a\r\u0000\u0266\u025b\u0001\u0000\u0000"+
		"\u0000\u0266\u025c\u0001\u0000\u0000\u0000\u0266\u025d\u0001\u0000\u0000"+
		"\u0000\u0266\u025e\u0001\u0000\u0000\u0000\u0266\u025f\u0001\u0000\u0000"+
		"\u0000\u0266\u0260\u0001\u0000\u0000\u0000\u0266\u0261\u0001\u0000\u0000"+
		"\u0000\u0266\u0262\u0001\u0000\u0000\u0000\u0266\u0263\u0001\u0000\u0000"+
		"\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0265\u0001\u0000\u0000"+
		"\u0000\u0267\u001d\u0001\u0000\u0000\u0000\u0268\u0269\u0007\u0002\u0000"+
		"\u0000\u0269\u001f\u0001\u0000\u0000\u0000\u026a\u026b\u0007\u0003\u0000"+
		"\u0000\u026b!\u0001\u0000\u0000\u0000\u026c\u026d\u0007\u0004\u0000\u0000"+
		"\u026d#\u0001\u0000\u0000\u0000\u026e\u0277\u0003|>\u0000\u026f\u0277"+
		"\u0003H$\u0000\u0270\u0277\u0003B!\u0000\u0271\u0277\u0003\u0002\u0001"+
		"\u0000\u0272\u0277\u0003\u0098L\u0000\u0273\u0277\u0003V+\u0000\u0274"+
		"\u0277\u0003l6\u0000\u0275\u0277\u0003L&\u0000\u0276\u026e\u0001\u0000"+
		"\u0000\u0000\u0276\u026f\u0001\u0000\u0000\u0000\u0276\u0270\u0001\u0000"+
		"\u0000\u0000\u0276\u0271\u0001\u0000\u0000\u0000\u0276\u0272\u0001\u0000"+
		"\u0000\u0000\u0276\u0273\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000"+
		"\u0000\u0000\u0276\u0275\u0001\u0000\u0000\u0000\u0277%\u0001\u0000\u0000"+
		"\u0000\u0278\u027c\u0003$\u0012\u0000\u0279\u027a\u0003\"\u0011\u0000"+
		"\u027a\u027b\u0003$\u0012\u0000\u027b\u027d\u0001\u0000\u0000\u0000\u027c"+
		"\u0279\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d"+
		"\'\u0001\u0000\u0000\u0000\u027e\u0284\u0003&\u0013\u0000\u027f\u0280"+
		"\u0003*\u0015\u0000\u0280\u0281\u0003&\u0013\u0000\u0281\u0283\u0001\u0000"+
		"\u0000\u0000\u0282\u027f\u0001\u0000\u0000\u0000\u0283\u0286\u0001\u0000"+
		"\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000"+
		"\u0000\u0000\u0285)\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000"+
		"\u0000\u0287\u0288\u0007\u0005\u0000\u0000\u0288+\u0001\u0000\u0000\u0000"+
		"\u0289\u028a\u0005\u0002\u0000\u0000\u028a\u028e\u0005.\u0000\u0000\u028b"+
		"\u028d\u0005%\u0000\u0000\u028c\u028b\u0001\u0000\u0000\u0000\u028d\u0290"+
		"\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028e\u028f"+
		"\u0001\u0000\u0000\u0000\u028f\u0291\u0001\u0000\u0000\u0000\u0290\u028e"+
		"\u0001\u0000\u0000\u0000\u0291\u0292\u0003(\u0014\u0000\u0292\u0293\u0005"+
		"/\u0000\u0000\u0293\u02ac\u00052\u0000\u0000\u0294\u0296\u0003`0\u0000"+
		"\u0295\u0294\u0001\u0000\u0000\u0000\u0296\u0299\u0001\u0000\u0000\u0000"+
		"\u0297\u0295\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000"+
		"\u0298\u029e\u0001\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000"+
		"\u029a\u029c\u0007\u0001\u0000\u0000\u029b\u029d\u00055\u0000\u0000\u029c"+
		"\u029b\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d"+
		"\u029f\u0001\u0000\u0000\u0000\u029e\u029a\u0001\u0000\u0000\u0000\u029e"+
		"\u029f\u0001\u0000\u0000\u0000\u029f\u02ad\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a2\u0007\u0001\u0000\u0000\u02a1\u02a3\u00055\u0000\u0000\u02a2\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a0\u0001\u0000\u0000\u0000\u02a4\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a5\u02a9\u0001\u0000\u0000\u0000\u02a6\u02a8"+
		"\u0003`0\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a8\u02ab\u0001\u0000"+
		"\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000"+
		"\u0000\u0000\u02aa\u02ad\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000"+
		"\u0000\u0000\u02ac\u0297\u0001\u0000\u0000\u0000\u02ac\u02a4\u0001\u0000"+
		"\u0000\u0000\u02ad\u02af\u0001\u0000\u0000\u0000\u02ae\u02b0\u0003b1\u0000"+
		"\u02af\u02ae\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b5\u00053\u0000\u0000\u02b2"+
		"\u02b4\u0003.\u0017\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b7"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b5\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b9\u0001\u0000\u0000\u0000\u02b7\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b8\u02ba\u00030\u0018\u0000\u02b9\u02b8\u0001"+
		"\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba-\u0001\u0000"+
		"\u0000\u0000\u02bb\u02bc\u0005\u0003\u0000\u0000\u02bc\u02c0\u0005.\u0000"+
		"\u0000\u02bd\u02bf\u0005%\u0000\u0000\u02be\u02bd\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c2\u0001\u0000\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c3\u0001\u0000\u0000\u0000"+
		"\u02c2\u02c0\u0001\u0000\u0000\u0000\u02c3\u02c4\u0003(\u0014\u0000\u02c4"+
		"\u02c5\u0005/\u0000\u0000\u02c5\u02de\u00052\u0000\u0000\u02c6\u02c8\u0003"+
		"`0\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8\u02cb\u0001\u0000\u0000"+
		"\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000"+
		"\u0000\u02ca\u02d0\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000"+
		"\u0000\u02cc\u02ce\u0007\u0001\u0000\u0000\u02cd\u02cf\u00055\u0000\u0000"+
		"\u02ce\u02cd\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000"+
		"\u02cf\u02d1\u0001\u0000\u0000\u0000\u02d0\u02cc\u0001\u0000\u0000\u0000"+
		"\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02df\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d4\u0007\u0001\u0000\u0000\u02d3\u02d5\u00055\u0000\u0000\u02d4"+
		"\u02d3\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d6\u02d2\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d7\u02db\u0001\u0000\u0000\u0000\u02d8"+
		"\u02da\u0003`0\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02da\u02dd\u0001"+
		"\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02dc\u0001"+
		"\u0000\u0000\u0000\u02dc\u02df\u0001\u0000\u0000\u0000\u02dd\u02db\u0001"+
		"\u0000\u0000\u0000\u02de\u02c9\u0001\u0000\u0000\u0000\u02de\u02d6\u0001"+
		"\u0000\u0000\u0000\u02df\u02e1\u0001\u0000\u0000\u0000\u02e0\u02e2\u0003"+
		"b1\u0000\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e4\u00053\u0000\u0000"+
		"\u02e4/\u0001\u0000\u0000\u0000\u02e5\u02e6\u0005\u0004\u0000\u0000\u02e6"+
		"\u02ff\u00052\u0000\u0000\u02e7\u02e9\u0003`0\u0000\u02e8\u02e7\u0001"+
		"\u0000\u0000\u0000\u02e9\u02ec\u0001\u0000\u0000\u0000\u02ea\u02e8\u0001"+
		"\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02f1\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ed\u02ef\u0007"+
		"\u0001\u0000\u0000\u02ee\u02f0\u00055\u0000\u0000\u02ef\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f2\u0001\u0000"+
		"\u0000\u0000\u02f1\u02ed\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000"+
		"\u0000\u0000\u02f2\u0300\u0001\u0000\u0000\u0000\u02f3\u02f5\u0007\u0001"+
		"\u0000\u0000\u02f4\u02f6\u00055\u0000\u0000\u02f5\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f8\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f3\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000"+
		"\u0000\u02f8\u02fc\u0001\u0000\u0000\u0000\u02f9\u02fb\u0003`0\u0000\u02fa"+
		"\u02f9\u0001\u0000\u0000\u0000\u02fb\u02fe\u0001\u0000\u0000\u0000\u02fc"+
		"\u02fa\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd"+
		"\u0300\u0001\u0000\u0000\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02ff"+
		"\u02ea\u0001\u0000\u0000\u0000\u02ff\u02f7\u0001\u0000\u0000\u0000\u0300"+
		"\u0302\u0001\u0000\u0000\u0000\u0301\u0303\u0003b1\u0000\u0302\u0301\u0001"+
		"\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303\u0304\u0001"+
		"\u0000\u0000\u0000\u0304\u0305\u00053\u0000\u0000\u03051\u0001\u0000\u0000"+
		"\u0000\u0306\u0308\u0005%\u0000\u0000\u0307\u0306\u0001\u0000\u0000\u0000"+
		"\u0308\u030b\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000"+
		"\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u030c\u0001\u0000\u0000\u0000"+
		"\u030b\u0309\u0001\u0000\u0000\u0000\u030c\u030d\u0003(\u0014\u0000\u030d"+
		"\u0313\u0005:\u0000\u0000\u030e\u030f\u0005.\u0000\u0000\u030f\u0310\u0003"+
		"`0\u0000\u0310\u0311\u0005/\u0000\u0000\u0311\u0314\u0001\u0000\u0000"+
		"\u0000\u0312\u0314\u0003`0\u0000\u0313\u030e\u0001\u0000\u0000\u0000\u0313"+
		"\u0312\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315"+
		"\u0321\u00059\u0000\u0000\u0316\u0317\u0005.\u0000\u0000\u0317\u031c\u0003"+
		"`0\u0000\u0318\u0319\u00032\u0019\u0000\u0319\u031a\u0005/\u0000\u0000"+
		"\u031a\u031c\u0001\u0000\u0000\u0000\u031b\u0316\u0001\u0000\u0000\u0000"+
		"\u031b\u0318\u0001\u0000\u0000\u0000\u031c\u0322\u0001\u0000\u0000\u0000"+
		"\u031d\u0320\u0003`0\u0000\u031e\u0320\u00032\u0019\u0000\u031f\u031d"+
		"\u0001\u0000\u0000\u0000\u031f\u031e\u0001\u0000\u0000\u0000\u0320\u0322"+
		"\u0001\u0000\u0000\u0000\u0321\u031b\u0001\u0000\u0000\u0000\u0321\u031f"+
		"\u0001\u0000\u0000\u0000\u03223\u0001\u0000\u0000\u0000\u0323\u0324\u0005"+
		"\u0006\u0000\u0000\u0324\u0328\u0005.\u0000\u0000\u0325\u0327\u0005%\u0000"+
		"\u0000\u0326\u0325\u0001\u0000\u0000\u0000\u0327\u032a\u0001\u0000\u0000"+
		"\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000"+
		"\u0000\u0329\u032b\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000"+
		"\u0000\u032b\u032c\u0003(\u0014\u0000\u032c\u032d\u0005/\u0000\u0000\u032d"+
		"\u0346\u00052\u0000\u0000\u032e\u0330\u0003`0\u0000\u032f\u032e\u0001"+
		"\u0000\u0000\u0000\u0330\u0333\u0001\u0000\u0000\u0000\u0331\u032f\u0001"+
		"\u0000\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0338\u0001"+
		"\u0000\u0000\u0000\u0333\u0331\u0001\u0000\u0000\u0000\u0334\u0336\u0007"+
		"\u0001\u0000\u0000\u0335\u0337\u00055\u0000\u0000\u0336\u0335\u0001\u0000"+
		"\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0339\u0001\u0000"+
		"\u0000\u0000\u0338\u0334\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000"+
		"\u0000\u0000\u0339\u0347\u0001\u0000\u0000\u0000\u033a\u033c\u0007\u0001"+
		"\u0000\u0000\u033b\u033d\u00055\u0000\u0000\u033c\u033b\u0001\u0000\u0000"+
		"\u0000\u033c\u033d\u0001\u0000\u0000\u0000\u033d\u033f\u0001\u0000\u0000"+
		"\u0000\u033e\u033a\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000"+
		"\u0000\u033f\u0343\u0001\u0000\u0000\u0000\u0340\u0342\u0003`0\u0000\u0341"+
		"\u0340\u0001\u0000\u0000\u0000\u0342\u0345\u0001\u0000\u0000\u0000\u0343"+
		"\u0341\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344"+
		"\u0347\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0346"+
		"\u0331\u0001\u0000\u0000\u0000\u0346\u033e\u0001\u0000\u0000\u0000\u0347"+
		"\u0349\u0001\u0000\u0000\u0000\u0348\u034a\u0003b1\u0000\u0349\u0348\u0001"+
		"\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034b\u0001"+
		"\u0000\u0000\u0000\u034b\u034c\u00053\u0000\u0000\u034c5\u0001\u0000\u0000"+
		"\u0000\u034d\u034e\u0005\f\u0000\u0000\u034e\u0367\u00052\u0000\u0000"+
		"\u034f\u0351\u0003`0\u0000\u0350\u034f\u0001\u0000\u0000\u0000\u0351\u0354"+
		"\u0001\u0000\u0000\u0000\u0352\u0350\u0001\u0000\u0000\u0000\u0352\u0353"+
		"\u0001\u0000\u0000\u0000\u0353\u0359\u0001\u0000\u0000\u0000\u0354\u0352"+
		"\u0001\u0000\u0000\u0000\u0355\u0357\u0007\u0001\u0000\u0000\u0356\u0358"+
		"\u00055\u0000\u0000\u0357\u0356\u0001\u0000\u0000\u0000\u0357\u0358\u0001"+
		"\u0000\u0000\u0000\u0358\u035a\u0001\u0000\u0000\u0000\u0359\u0355\u0001"+
		"\u0000\u0000\u0000\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u0368\u0001"+
		"\u0000\u0000\u0000\u035b\u035d\u0007\u0001\u0000\u0000\u035c\u035e\u0005"+
		"5\u0000\u0000\u035d\u035c\u0001\u0000\u0000\u0000\u035d\u035e\u0001\u0000"+
		"\u0000\u0000\u035e\u0360\u0001\u0000\u0000\u0000\u035f\u035b\u0001\u0000"+
		"\u0000\u0000\u035f\u0360\u0001\u0000\u0000\u0000\u0360\u0364\u0001\u0000"+
		"\u0000\u0000\u0361\u0363\u0003`0\u0000\u0362\u0361\u0001\u0000\u0000\u0000"+
		"\u0363\u0366\u0001\u0000\u0000\u0000\u0364\u0362\u0001\u0000\u0000\u0000"+
		"\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u0368\u0001\u0000\u0000\u0000"+
		"\u0366\u0364\u0001\u0000\u0000\u0000\u0367\u0352\u0001\u0000\u0000\u0000"+
		"\u0367\u035f\u0001\u0000\u0000\u0000\u0368\u036a\u0001\u0000\u0000\u0000"+
		"\u0369\u036b\u0003b1\u0000\u036a\u0369\u0001\u0000\u0000\u0000\u036a\u036b"+
		"\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036d"+
		"\u00053\u0000\u0000\u036d\u036e\u0005\u0006\u0000\u0000\u036e\u0370\u0005"+
		".\u0000\u0000\u036f\u0371\u0005%\u0000\u0000\u0370\u036f\u0001\u0000\u0000"+
		"\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0372\u0001\u0000\u0000"+
		"\u0000\u0372\u0373\u0003(\u0014\u0000\u0373\u0374\u0005/\u0000\u0000\u0374"+
		"7\u0001\u0000\u0000\u0000\u0375\u0376\u0005\u0005\u0000\u0000\u0376\u0379"+
		"\u0005.\u0000\u0000\u0377\u037a\u0003R)\u0000\u0378\u037a\u0003T*\u0000"+
		"\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u0378\u0001\u0000\u0000\u0000"+
		"\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000"+
		"\u037b\u037c\u00055\u0000\u0000\u037c\u037d\u0003(\u0014\u0000\u037d\u037f"+
		"\u00055\u0000\u0000\u037e\u0380\u0003L&\u0000\u037f\u037e\u0001\u0000"+
		"\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000"+
		"\u0000\u0000\u0381\u0382\u0005/\u0000\u0000\u0382\u039b\u00052\u0000\u0000"+
		"\u0383\u0385\u0003`0\u0000\u0384\u0383\u0001\u0000\u0000\u0000\u0385\u0388"+
		"\u0001\u0000\u0000\u0000\u0386\u0384\u0001\u0000\u0000\u0000\u0386\u0387"+
		"\u0001\u0000\u0000\u0000\u0387\u038d\u0001\u0000\u0000\u0000\u0388\u0386"+
		"\u0001\u0000\u0000\u0000\u0389\u038b\u0007\u0001\u0000\u0000\u038a\u038c"+
		"\u00055\u0000\u0000\u038b\u038a\u0001\u0000\u0000\u0000\u038b\u038c\u0001"+
		"\u0000\u0000\u0000\u038c\u038e\u0001\u0000\u0000\u0000\u038d\u0389\u0001"+
		"\u0000\u0000\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e\u039c\u0001"+
		"\u0000\u0000\u0000\u038f\u0391\u0007\u0001\u0000\u0000\u0390\u0392\u0005"+
		"5\u0000\u0000\u0391\u0390\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000"+
		"\u0000\u0000\u0392\u0394\u0001\u0000\u0000\u0000\u0393\u038f\u0001\u0000"+
		"\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u0398\u0001\u0000"+
		"\u0000\u0000\u0395\u0397\u0003`0\u0000\u0396\u0395\u0001\u0000\u0000\u0000"+
		"\u0397\u039a\u0001\u0000\u0000\u0000\u0398\u0396\u0001\u0000\u0000\u0000"+
		"\u0398\u0399\u0001\u0000\u0000\u0000\u0399\u039c\u0001\u0000\u0000\u0000"+
		"\u039a\u0398\u0001\u0000\u0000\u0000\u039b\u0386\u0001\u0000\u0000\u0000"+
		"\u039b\u0393\u0001\u0000\u0000\u0000\u039c\u039e\u0001\u0000\u0000\u0000"+
		"\u039d\u039f\u0003b1\u0000\u039e\u039d\u0001\u0000\u0000\u0000\u039e\u039f"+
		"\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000\u0000\u0000\u03a0\u03a1"+
		"\u00053\u0000\u0000\u03a19\u0001\u0000\u0000\u0000\u03a2\u03a3\u0005\r"+
		"\u0000\u0000\u03a3\u03bc\u00052\u0000\u0000\u03a4\u03a6\u0003`0\u0000"+
		"\u03a5\u03a4\u0001\u0000\u0000\u0000\u03a6\u03a9\u0001\u0000\u0000\u0000"+
		"\u03a7\u03a5\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000"+
		"\u03a8\u03ae\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000"+
		"\u03aa\u03ac\u0007\u0001\u0000\u0000\u03ab\u03ad\u00055\u0000\u0000\u03ac"+
		"\u03ab\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000\u03ad"+
		"\u03af\u0001\u0000\u0000\u0000\u03ae\u03aa\u0001\u0000\u0000\u0000\u03ae"+
		"\u03af\u0001\u0000\u0000\u0000\u03af\u03bd\u0001\u0000\u0000\u0000\u03b0"+
		"\u03b2\u0007\u0001\u0000\u0000\u03b1\u03b3\u00055\u0000\u0000\u03b2\u03b1"+
		"\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000\u0000\u0000\u03b3\u03b5"+
		"\u0001\u0000\u0000\u0000\u03b4\u03b0\u0001\u0000\u0000\u0000\u03b4\u03b5"+
		"\u0001\u0000\u0000\u0000\u03b5\u03b9\u0001\u0000\u0000\u0000\u03b6\u03b8"+
		"\u0003`0\u0000\u03b7\u03b6\u0001\u0000\u0000\u0000\u03b8\u03bb\u0001\u0000"+
		"\u0000\u0000\u03b9\u03b7\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000"+
		"\u0000\u0000\u03ba\u03bd\u0001\u0000\u0000\u0000\u03bb\u03b9\u0001\u0000"+
		"\u0000\u0000\u03bc\u03a7\u0001\u0000\u0000\u0000\u03bc\u03b4\u0001\u0000"+
		"\u0000\u0000\u03bd\u03bf\u0001\u0000\u0000\u0000\u03be\u03c0\u0003@ \u0000"+
		"\u03bf\u03be\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000"+
		"\u03c0\u03c2\u0001\u0000\u0000\u0000\u03c1\u03c3\u0003b1\u0000\u03c2\u03c1"+
		"\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000\u0000\u03c3\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c6\u00053\u0000\u0000\u03c5\u03c7\u0003"+
		"<\u001e\u0000\u03c6\u03c5\u0001\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000"+
		"\u0000\u0000\u03c7\u03c9\u0001\u0000\u0000\u0000\u03c8\u03ca\u0003>\u001f"+
		"\u0000\u03c9\u03c8\u0001\u0000\u0000\u0000\u03c9\u03ca\u0001\u0000\u0000"+
		"\u0000\u03ca\u03ce\u0001\u0000\u0000\u0000\u03cb\u03cd\u00055\u0000\u0000"+
		"\u03cc\u03cb\u0001\u0000\u0000\u0000\u03cd\u03d0\u0001\u0000\u0000\u0000"+
		"\u03ce\u03cc\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000"+
		"\u03cf;\u0001\u0000\u0000\u0000\u03d0\u03ce\u0001\u0000\u0000\u0000\u03d1"+
		"\u03d6\u0005\u000e\u0000\u0000\u03d2\u03d3\u0005.\u0000\u0000\u03d3\u03d4"+
		"\u0003\u0002\u0001\u0000\u03d4\u03d5\u0005/\u0000\u0000\u03d5\u03d7\u0001"+
		"\u0000\u0000\u0000\u03d6\u03d2\u0001\u0000\u0000\u0000\u03d6\u03d7\u0001"+
		"\u0000\u0000\u0000\u03d7\u03d8\u0001\u0000\u0000\u0000\u03d8\u03f1\u0005"+
		"2\u0000\u0000\u03d9\u03db\u0003`0\u0000\u03da\u03d9\u0001\u0000\u0000"+
		"\u0000\u03db\u03de\u0001\u0000\u0000\u0000\u03dc\u03da\u0001\u0000\u0000"+
		"\u0000\u03dc\u03dd\u0001\u0000\u0000\u0000\u03dd\u03e3\u0001\u0000\u0000"+
		"\u0000\u03de\u03dc\u0001\u0000\u0000\u0000\u03df\u03e1\u0007\u0001\u0000"+
		"\u0000\u03e0\u03e2\u00055\u0000\u0000\u03e1\u03e0\u0001\u0000\u0000\u0000"+
		"\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e3\u03df\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e4\u03f2\u0001\u0000\u0000\u0000\u03e5\u03e7\u0007\u0001\u0000\u0000"+
		"\u03e6\u03e8\u00055\u0000\u0000\u03e7\u03e6\u0001\u0000\u0000\u0000\u03e7"+
		"\u03e8\u0001\u0000\u0000\u0000\u03e8\u03ea\u0001\u0000\u0000\u0000\u03e9"+
		"\u03e5\u0001\u0000\u0000\u0000\u03e9\u03ea\u0001\u0000\u0000\u0000\u03ea"+
		"\u03ee\u0001\u0000\u0000\u0000\u03eb\u03ed\u0003`0\u0000\u03ec\u03eb\u0001"+
		"\u0000\u0000\u0000\u03ed\u03f0\u0001\u0000\u0000\u0000\u03ee\u03ec\u0001"+
		"\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000\u0000\u0000\u03ef\u03f2\u0001"+
		"\u0000\u0000\u0000\u03f0\u03ee\u0001\u0000\u0000\u0000\u03f1\u03dc\u0001"+
		"\u0000\u0000\u0000\u03f1\u03e9\u0001\u0000\u0000\u0000\u03f2\u03f4\u0001"+
		"\u0000\u0000\u0000\u03f3\u03f5\u0003b1\u0000\u03f4\u03f3\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000"+
		"\u0000\u03f6\u03f7\u00053\u0000\u0000\u03f7=\u0001\u0000\u0000\u0000\u03f8"+
		"\u03f9\u0005\u000f\u0000\u0000\u03f9\u0412\u00052\u0000\u0000\u03fa\u03fc"+
		"\u0003`0\u0000\u03fb\u03fa\u0001\u0000\u0000\u0000\u03fc\u03ff\u0001\u0000"+
		"\u0000\u0000\u03fd\u03fb\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000"+
		"\u0000\u0000\u03fe\u0404\u0001\u0000\u0000\u0000\u03ff\u03fd\u0001\u0000"+
		"\u0000\u0000\u0400\u0402\u0007\u0001\u0000\u0000\u0401\u0403\u00055\u0000"+
		"\u0000\u0402\u0401\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000"+
		"\u0000\u0403\u0405\u0001\u0000\u0000\u0000\u0404\u0400\u0001\u0000\u0000"+
		"\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u0413\u0001\u0000\u0000"+
		"\u0000\u0406\u0408\u0007\u0001\u0000\u0000\u0407\u0409\u00055\u0000\u0000"+
		"\u0408\u0407\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000"+
		"\u0409\u040b\u0001\u0000\u0000\u0000\u040a\u0406\u0001\u0000\u0000\u0000"+
		"\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u040f\u0001\u0000\u0000\u0000"+
		"\u040c\u040e\u0003`0\u0000\u040d\u040c\u0001\u0000\u0000\u0000\u040e\u0411"+
		"\u0001\u0000\u0000\u0000\u040f\u040d\u0001\u0000\u0000\u0000\u040f\u0410"+
		"\u0001\u0000\u0000\u0000\u0410\u0413\u0001\u0000\u0000\u0000\u0411\u040f"+
		"\u0001\u0000\u0000\u0000\u0412\u03fd\u0001\u0000\u0000\u0000\u0412\u040a"+
		"\u0001\u0000\u0000\u0000\u0413\u0415\u0001\u0000\u0000\u0000\u0414\u0416"+
		"\u0003b1\u0000\u0415\u0414\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000"+
		"\u0000\u0000\u0416\u0417\u0001\u0000\u0000\u0000\u0417\u0418\u00053\u0000"+
		"\u0000\u0418?\u0001\u0000\u0000\u0000\u0419\u041a\u0005\u0010\u0000\u0000"+
		"\u041a\u041d\u0003Z-\u0000\u041b\u041d\u0003`0\u0000\u041c\u0419\u0001"+
		"\u0000\u0000\u0000\u041c\u041b\u0001\u0000\u0000\u0000\u041d\u0421\u0001"+
		"\u0000\u0000\u0000\u041e\u0420\u00055\u0000\u0000\u041f\u041e\u0001\u0000"+
		"\u0000\u0000\u0420\u0423\u0001\u0000\u0000\u0000\u0421\u041f\u0001\u0000"+
		"\u0000\u0000\u0421\u0422\u0001\u0000\u0000\u0000\u0422A\u0001\u0000\u0000"+
		"\u0000\u0423\u0421\u0001\u0000\u0000\u0000\u0424\u0428\u00052\u0000\u0000"+
		"\u0425\u0427\u0003\u001e\u000f\u0000\u0426\u0425\u0001\u0000\u0000\u0000"+
		"\u0427\u042a\u0001\u0000\u0000\u0000\u0428\u0426\u0001\u0000\u0000\u0000"+
		"\u0428\u0429\u0001\u0000\u0000\u0000\u0429\u0448\u0001\u0000\u0000\u0000"+
		"\u042a\u0428\u0001\u0000\u0000\u0000\u042b\u042f\u0003D\"\u0000\u042c"+
		"\u042e\u0003\u001e\u000f\u0000\u042d\u042c\u0001\u0000\u0000\u0000\u042e"+
		"\u0431\u0001\u0000\u0000\u0000\u042f\u042d\u0001\u0000\u0000\u0000\u042f"+
		"\u0430\u0001\u0000\u0000\u0000\u0430\u0442\u0001\u0000\u0000\u0000\u0431"+
		"\u042f\u0001\u0000\u0000\u0000\u0432\u0436\u00054\u0000\u0000\u0433\u0435"+
		"\u0003\u001e\u000f\u0000\u0434\u0433\u0001\u0000\u0000\u0000\u0435\u0438"+
		"\u0001\u0000\u0000\u0000\u0436\u0434\u0001\u0000\u0000\u0000\u0436\u0437"+
		"\u0001\u0000\u0000\u0000\u0437\u0439\u0001\u0000\u0000\u0000\u0438\u0436"+
		"\u0001\u0000\u0000\u0000\u0439\u043d\u0003D\"\u0000\u043a\u043c\u0003"+
		"\u001e\u000f\u0000\u043b\u043a\u0001\u0000\u0000\u0000\u043c\u043f\u0001"+
		"\u0000\u0000\u0000\u043d\u043b\u0001\u0000\u0000\u0000\u043d\u043e\u0001"+
		"\u0000\u0000\u0000\u043e\u0441\u0001\u0000\u0000\u0000\u043f\u043d\u0001"+
		"\u0000\u0000\u0000\u0440\u0432\u0001\u0000\u0000\u0000\u0441\u0444\u0001"+
		"\u0000\u0000\u0000\u0442\u0440\u0001\u0000\u0000\u0000\u0442\u0443\u0001"+
		"\u0000\u0000\u0000\u0443\u0446\u0001\u0000\u0000\u0000\u0444\u0442\u0001"+
		"\u0000\u0000\u0000\u0445\u0447\u00054\u0000\u0000\u0446\u0445\u0001\u0000"+
		"\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447\u0449\u0001\u0000"+
		"\u0000\u0000\u0448\u042b\u0001\u0000\u0000\u0000\u0448\u0449\u0001\u0000"+
		"\u0000\u0000\u0449\u044d\u0001\u0000\u0000\u0000\u044a\u044c\u0003\u001e"+
		"\u000f\u0000\u044b\u044a\u0001\u0000\u0000\u0000\u044c\u044f\u0001\u0000"+
		"\u0000\u0000\u044d\u044b\u0001\u0000\u0000\u0000\u044d\u044e\u0001\u0000"+
		"\u0000\u0000\u044e\u0450\u0001\u0000\u0000\u0000\u044f\u044d\u0001\u0000"+
		"\u0000\u0000\u0450\u0451\u00053\u0000\u0000\u0451C\u0001\u0000\u0000\u0000"+
		"\u0452\u0455\u0003\u0002\u0001\u0000\u0453\u0455\u0005N\u0000\u0000\u0454"+
		"\u0452\u0001\u0000\u0000\u0000\u0454\u0453\u0001\u0000\u0000\u0000\u0455"+
		"\u0458\u0001\u0000\u0000\u0000\u0456\u0457\u00059\u0000\u0000\u0457\u0459"+
		"\u0003F#\u0000\u0458\u0456\u0001\u0000\u0000\u0000\u0458\u0459\u0001\u0000"+
		"\u0000\u0000\u0459E\u0001\u0000\u0000\u0000\u045a\u045f\u0003L&\u0000"+
		"\u045b\u045f\u0003V+\u0000\u045c\u045f\u0003B!\u0000\u045d\u045f\u0003"+
		"f3\u0000\u045e\u045a\u0001\u0000\u0000\u0000\u045e\u045b\u0001\u0000\u0000"+
		"\u0000\u045e\u045c\u0001\u0000\u0000\u0000\u045e\u045d\u0001\u0000\u0000"+
		"\u0000\u045fG\u0001\u0000\u0000\u0000\u0460\u0461\u0007\u0006\u0000\u0000"+
		"\u0461I\u0001\u0000\u0000\u0000\u0462\u0469\u0003H$\u0000\u0463\u0469"+
		"\u0003\u0002\u0001\u0000\u0464\u0469\u0003L&\u0000\u0465\u0466\u0003 "+
		"\u0010\u0000\u0466\u0467\u0003J%\u0000\u0467\u0469\u0001\u0000\u0000\u0000"+
		"\u0468\u0462\u0001\u0000\u0000\u0000\u0468\u0463\u0001\u0000\u0000\u0000"+
		"\u0468\u0464\u0001\u0000\u0000\u0000\u0468\u0465\u0001\u0000\u0000\u0000"+
		"\u0469K\u0001\u0000\u0000\u0000\u046a\u046b\u0006&\uffff\uffff\u0000\u046b"+
		"\u0474\u0003N\'\u0000\u046c\u0474\u0003H$\u0000\u046d\u0474\u0003\u0002"+
		"\u0001\u0000\u046e\u0474\u0003|>\u0000\u046f\u0470\u0005.\u0000\u0000"+
		"\u0470\u0471\u0003L&\u0000\u0471\u0472\u0005/\u0000\u0000\u0472\u0474"+
		"\u0001\u0000\u0000\u0000\u0473\u046a\u0001\u0000\u0000\u0000\u0473\u046c"+
		"\u0001\u0000\u0000\u0000\u0473\u046d\u0001\u0000\u0000\u0000\u0473\u046e"+
		"\u0001\u0000\u0000\u0000\u0473\u046f\u0001\u0000\u0000\u0000\u0474\u047d"+
		"\u0001\u0000\u0000\u0000\u0475\u0476\n\u0002\u0000\u0000\u0476\u0477\u0003"+
		" \u0010\u0000\u0477\u0478\u0003L&\u0003\u0478\u047c\u0001\u0000\u0000"+
		"\u0000\u0479\u047a\n\u0001\u0000\u0000\u047a\u047c\u0003 \u0010\u0000"+
		"\u047b\u0475\u0001\u0000\u0000\u0000\u047b\u0479\u0001\u0000\u0000\u0000"+
		"\u047c\u047f\u0001\u0000\u0000\u0000\u047d\u047b\u0001\u0000\u0000\u0000"+
		"\u047d\u047e\u0001\u0000\u0000\u0000\u047eM\u0001\u0000\u0000\u0000\u047f"+
		"\u047d\u0001\u0000\u0000\u0000\u0480\u0484\u0003\u0002\u0001\u0000\u0481"+
		"\u0484\u0003V+\u0000\u0482\u0484\u0003l6\u0000\u0483\u0480\u0001\u0000"+
		"\u0000\u0000\u0483\u0481\u0001\u0000\u0000\u0000\u0483\u0482\u0001\u0000"+
		"\u0000\u0000\u0484\u0485\u0001\u0000\u0000\u0000\u0485\u0486\u00058\u0000"+
		"\u0000\u0486\u0487\u0003N\'\u0000\u0487\u0494\u0001\u0000\u0000\u0000"+
		"\u0488\u0489\u0003\u0002\u0001\u0000\u0489\u048a\u00050\u0000\u0000\u048a"+
		"\u048b\u0003N\'\u0000\u048b\u048c\u00051\u0000\u0000\u048c\u0494\u0001"+
		"\u0000\u0000\u0000\u048d\u0492\u0003l6\u0000\u048e\u0492\u0003V+\u0000"+
		"\u048f\u0492\u0003H$\u0000\u0490\u0492\u0003\u0002\u0001\u0000\u0491\u048d"+
		"\u0001\u0000\u0000\u0000\u0491\u048e\u0001\u0000\u0000\u0000\u0491\u048f"+
		"\u0001\u0000\u0000\u0000\u0491\u0490\u0001\u0000\u0000\u0000\u0492\u0494"+
		"\u0001\u0000\u0000\u0000\u0493\u0483\u0001\u0000\u0000\u0000\u0493\u0488"+
		"\u0001\u0000\u0000\u0000\u0493\u0491\u0001\u0000\u0000\u0000\u0494O\u0001"+
		"\u0000\u0000\u0000\u0495\u0496\u0007\u0007\u0000\u0000\u0496Q\u0001\u0000"+
		"\u0000\u0000\u0497\u0498\u0003P(\u0000\u0498\u049d\u0003T*\u0000\u0499"+
		"\u049a\u00054\u0000\u0000\u049a\u049c\u0003T*\u0000\u049b\u0499\u0001"+
		"\u0000\u0000\u0000\u049c\u049f\u0001\u0000\u0000\u0000\u049d\u049b\u0001"+
		"\u0000\u0000\u0000\u049d\u049e\u0001\u0000\u0000\u0000\u049eS\u0001\u0000"+
		"\u0000\u0000\u049f\u049d\u0001\u0000\u0000\u0000\u04a0\u04ad\u0003\u0002"+
		"\u0001\u0000\u04a1\u04ab\u0005\u0016\u0000\u0000\u04a2\u04ac\u0003H$\u0000"+
		"\u04a3\u04ac\u0003B!\u0000\u04a4\u04ac\u0003V+\u0000\u04a5\u04ac\u0003"+
		"Z-\u0000\u04a6\u04ac\u0003L&\u0000\u04a7\u04ac\u0003\u0002\u0001\u0000"+
		"\u04a8\u04ac\u0003N\'\u0000\u04a9\u04ac\u0003h4\u0000\u04aa\u04ac\u0003"+
		"f3\u0000\u04ab\u04a2\u0001\u0000\u0000\u0000\u04ab\u04a3\u0001\u0000\u0000"+
		"\u0000\u04ab\u04a4\u0001\u0000\u0000\u0000\u04ab\u04a5\u0001\u0000\u0000"+
		"\u0000\u04ab\u04a6\u0001\u0000\u0000\u0000\u04ab\u04a7\u0001\u0000\u0000"+
		"\u0000\u04ab\u04a8\u0001\u0000\u0000\u0000\u04ab\u04a9\u0001\u0000\u0000"+
		"\u0000\u04ab\u04aa\u0001\u0000\u0000\u0000\u04ac\u04ae\u0001\u0000\u0000"+
		"\u0000\u04ad\u04a1\u0001\u0000\u0000\u0000\u04ad\u04ae\u0001\u0000\u0000"+
		"\u0000\u04aeU\u0001\u0000\u0000\u0000\u04af\u04b3\u00050\u0000\u0000\u04b0"+
		"\u04b2\u0003\u001e\u000f\u0000\u04b1\u04b0\u0001\u0000\u0000\u0000\u04b2"+
		"\u04b5\u0001\u0000\u0000\u0000\u04b3\u04b1\u0001\u0000\u0000\u0000\u04b3"+
		"\u04b4\u0001\u0000\u0000\u0000\u04b4\u04d3\u0001\u0000\u0000\u0000\u04b5"+
		"\u04b3\u0001\u0000\u0000\u0000\u04b6\u04ba\u0003X,\u0000\u04b7\u04b9\u0003"+
		"\u001e\u000f\u0000\u04b8\u04b7\u0001\u0000\u0000\u0000\u04b9\u04bc\u0001"+
		"\u0000\u0000\u0000\u04ba\u04b8\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001"+
		"\u0000\u0000\u0000\u04bb\u04cd\u0001\u0000\u0000\u0000\u04bc\u04ba\u0001"+
		"\u0000\u0000\u0000\u04bd\u04c1\u00054\u0000\u0000\u04be\u04c0\u0003\u001e"+
		"\u000f\u0000\u04bf\u04be\u0001\u0000\u0000\u0000\u04c0\u04c3\u0001\u0000"+
		"\u0000\u0000\u04c1\u04bf\u0001\u0000\u0000\u0000\u04c1\u04c2\u0001\u0000"+
		"\u0000\u0000\u04c2\u04c4\u0001\u0000\u0000\u0000\u04c3\u04c1\u0001\u0000"+
		"\u0000\u0000\u04c4\u04c8\u0003X,\u0000\u04c5\u04c7\u0003\u001e\u000f\u0000"+
		"\u04c6\u04c5\u0001\u0000\u0000\u0000\u04c7\u04ca\u0001\u0000\u0000\u0000"+
		"\u04c8\u04c6\u0001\u0000\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000\u0000"+
		"\u04c9\u04cc\u0001\u0000\u0000\u0000\u04ca\u04c8\u0001\u0000\u0000\u0000"+
		"\u04cb\u04bd\u0001\u0000\u0000\u0000\u04cc\u04cf\u0001\u0000\u0000\u0000"+
		"\u04cd\u04cb\u0001\u0000\u0000\u0000\u04cd\u04ce\u0001\u0000\u0000\u0000"+
		"\u04ce\u04d1\u0001\u0000\u0000\u0000\u04cf\u04cd\u0001\u0000\u0000\u0000"+
		"\u04d0\u04d2\u00054\u0000\u0000\u04d1\u04d0\u0001\u0000\u0000\u0000\u04d1"+
		"\u04d2\u0001\u0000\u0000\u0000\u04d2\u04d4\u0001\u0000\u0000\u0000\u04d3"+
		"\u04b6\u0001\u0000\u0000\u0000\u04d3\u04d4\u0001\u0000\u0000\u0000\u04d4"+
		"\u04d8\u0001\u0000\u0000\u0000\u04d5\u04d7\u0003\u001e\u000f\u0000\u04d6"+
		"\u04d5\u0001\u0000\u0000\u0000\u04d7\u04da\u0001\u0000\u0000\u0000\u04d8"+
		"\u04d6\u0001\u0000\u0000\u0000\u04d8\u04d9\u0001\u0000\u0000\u0000\u04d9"+
		"\u04db\u0001\u0000\u0000\u0000\u04da\u04d8\u0001\u0000\u0000\u0000\u04db"+
		"\u04dc\u00051\u0000\u0000\u04dcW\u0001\u0000\u0000\u0000\u04dd\u04e5\u0003"+
		"\u0002\u0001\u0000\u04de\u04e5\u0003H$\u0000\u04df\u04e5\u0003B!\u0000"+
		"\u04e0\u04e5\u0003\u0098L\u0000\u04e1\u04e5\u0003|>\u0000\u04e2\u04e5"+
		"\u0003j5\u0000\u04e3\u04e5\u0003V+\u0000\u04e4\u04dd\u0001\u0000\u0000"+
		"\u0000\u04e4\u04de\u0001\u0000\u0000\u0000\u04e4\u04df\u0001\u0000\u0000"+
		"\u0000\u04e4\u04e0\u0001\u0000\u0000\u0000\u04e4\u04e1\u0001\u0000\u0000"+
		"\u0000\u04e4\u04e2\u0001\u0000\u0000\u0000\u04e4\u04e3\u0001\u0000\u0000"+
		"\u0000\u04e5Y\u0001\u0000\u0000\u0000\u04e6\u04e7\u0005\u0014\u0000\u0000"+
		"\u04e7\u04e8\u0003l6\u0000\u04e8[\u0001\u0000\u0000\u0000\u04e9\u04ed"+
		"\u0003B!\u0000\u04ea\u04ed\u0003j5\u0000\u04eb\u04ed\u0003`0\u0000\u04ec"+
		"\u04e9\u0001\u0000\u0000\u0000\u04ec\u04ea\u0001\u0000\u0000\u0000\u04ec"+
		"\u04eb\u0001\u0000\u0000\u0000\u04ed]\u0001\u0000\u0000\u0000\u04ee\u04f0"+
		"\u0003`0\u0000\u04ef\u04ee\u0001\u0000\u0000\u0000\u04f0\u04f3\u0001\u0000"+
		"\u0000\u0000\u04f1\u04ef\u0001\u0000\u0000\u0000\u04f1\u04f2\u0001\u0000"+
		"\u0000\u0000\u04f2\u04f5\u0001\u0000\u0000\u0000\u04f3\u04f1\u0001\u0000"+
		"\u0000\u0000\u04f4\u04f6\u0003b1\u0000\u04f5\u04f4\u0001\u0000\u0000\u0000"+
		"\u04f5\u04f6\u0001\u0000\u0000\u0000\u04f6_\u0001\u0000\u0000\u0000\u04f7"+
		"\u050f\u0003\u001c\u000e\u0000\u04f8\u050f\u0003,\u0016\u0000\u04f9\u050f"+
		"\u0003R)\u0000\u04fa\u050f\u00032\u0019\u0000\u04fb\u050f\u0003d2\u0000"+
		"\u04fc\u050f\u0003l6\u0000\u04fd\u050f\u0003\u0092I\u0000\u04fe\u050f"+
		"\u0003\u008eG\u0000\u04ff\u050f\u0003\u0090H\u0000\u0500\u050f\u0003\u0098"+
		"L\u0000\u0501\u050f\u0003\u0084B\u0000\u0502\u050f\u00034\u001a\u0000"+
		"\u0503\u050f\u00036\u001b\u0000\u0504\u050f\u00038\u001c\u0000\u0505\u050f"+
		"\u0003L&\u0000\u0506\u050f\u0003J%\u0000\u0507\u050f\u0003:\u001d\u0000"+
		"\u0508\u050f\u0003T*\u0000\u0509\u050f\u0003(\u0014\u0000\u050a\u050f"+
		"\u0003\u001e\u000f\u0000\u050b\u050f\u0003x<\u0000\u050c\u050f\u0003j"+
		"5\u0000\u050d\u050f\u0003p8\u0000\u050e\u04f7\u0001\u0000\u0000\u0000"+
		"\u050e\u04f8\u0001\u0000\u0000\u0000\u050e\u04f9\u0001\u0000\u0000\u0000"+
		"\u050e\u04fa\u0001\u0000\u0000\u0000\u050e\u04fb\u0001\u0000\u0000\u0000"+
		"\u050e\u04fc\u0001\u0000\u0000\u0000\u050e\u04fd\u0001\u0000\u0000\u0000"+
		"\u050e\u04fe\u0001\u0000\u0000\u0000\u050e\u04ff\u0001\u0000\u0000\u0000"+
		"\u050e\u0500\u0001\u0000\u0000\u0000\u050e\u0501\u0001\u0000\u0000\u0000"+
		"\u050e\u0502\u0001\u0000\u0000\u0000\u050e\u0503\u0001\u0000\u0000\u0000"+
		"\u050e\u0504\u0001\u0000\u0000\u0000\u050e\u0505\u0001\u0000\u0000\u0000"+
		"\u050e\u0506\u0001\u0000\u0000\u0000\u050e\u0507\u0001\u0000\u0000\u0000"+
		"\u050e\u0508\u0001\u0000\u0000\u0000\u050e\u0509\u0001\u0000\u0000\u0000"+
		"\u050e\u050a\u0001\u0000\u0000\u0000\u050e\u050b\u0001\u0000\u0000\u0000"+
		"\u050e\u050c\u0001\u0000\u0000\u0000\u050e\u050d\u0001\u0000\u0000\u0000"+
		"\u050f\u0513\u0001\u0000\u0000\u0000\u0510\u0512\u00055\u0000\u0000\u0511"+
		"\u0510\u0001\u0000\u0000\u0000\u0512\u0515\u0001\u0000\u0000\u0000\u0513"+
		"\u0511\u0001\u0000\u0000\u0000\u0513\u0514\u0001\u0000\u0000\u0000\u0514"+
		"a\u0001\u0000\u0000\u0000\u0515\u0513\u0001\u0000\u0000\u0000\u0516\u052e"+
		"\u0005\u0012\u0000\u0000\u0517\u0520\u0005.\u0000\u0000\u0518\u0521\u0003"+
		"|>\u0000\u0519\u0521\u0003L&\u0000\u051a\u0521\u0003H$\u0000\u051b\u0521"+
		"\u0003B!\u0000\u051c\u0521\u0003J%\u0000\u051d\u0521\u0003\u0002\u0001"+
		"\u0000\u051e\u0521\u0003\u0098L\u0000\u051f\u0521\u0003V+\u0000\u0520"+
		"\u0518\u0001\u0000\u0000\u0000\u0520\u0519\u0001\u0000\u0000\u0000\u0520"+
		"\u051a\u0001\u0000\u0000\u0000\u0520\u051b\u0001\u0000\u0000\u0000\u0520"+
		"\u051c\u0001\u0000\u0000\u0000\u0520\u051d\u0001\u0000\u0000\u0000\u0520"+
		"\u051e\u0001\u0000\u0000\u0000\u0520\u051f\u0001\u0000\u0000\u0000\u0521"+
		"\u0522\u0001\u0000\u0000\u0000\u0522\u0523\u0005/\u0000\u0000\u0523\u052f"+
		"\u0001\u0000\u0000\u0000\u0524\u052d\u0003|>\u0000\u0525\u052d\u0003L"+
		"&\u0000\u0526\u052d\u0003H$\u0000\u0527\u052d\u0003B!\u0000\u0528\u052d"+
		"\u0003\u0002\u0001\u0000\u0529\u052d\u0003J%\u0000\u052a\u052d\u0003\u0098"+
		"L\u0000\u052b\u052d\u0003V+\u0000\u052c\u0524\u0001\u0000\u0000\u0000"+
		"\u052c\u0525\u0001\u0000\u0000\u0000\u052c\u0526\u0001\u0000\u0000\u0000"+
		"\u052c\u0527\u0001\u0000\u0000\u0000\u052c\u0528\u0001\u0000\u0000\u0000"+
		"\u052c\u0529\u0001\u0000\u0000\u0000\u052c\u052a\u0001\u0000\u0000\u0000"+
		"\u052c\u052b\u0001\u0000\u0000\u0000\u052d\u052f\u0001\u0000\u0000\u0000"+
		"\u052e\u0517\u0001\u0000\u0000\u0000\u052e\u052c\u0001\u0000\u0000\u0000"+
		"\u052e\u052f\u0001\u0000\u0000\u0000\u052f\u0533\u0001\u0000\u0000\u0000"+
		"\u0530\u0532\u00055\u0000\u0000\u0531\u0530\u0001\u0000\u0000\u0000\u0532"+
		"\u0535\u0001\u0000\u0000\u0000\u0533\u0531\u0001\u0000\u0000\u0000\u0533"+
		"\u0534\u0001\u0000\u0000\u0000\u0534c\u0001\u0000\u0000\u0000\u0535\u0533"+
		"\u0001\u0000\u0000\u0000\u0536\u0538\u0005B\u0000\u0000\u0537\u0536\u0001"+
		"\u0000\u0000\u0000\u0537\u0538\u0001\u0000\u0000\u0000\u0538\u0539\u0001"+
		"\u0000\u0000\u0000\u0539\u053a\u0005\u0011\u0000\u0000\u053a\u053b\u0003"+
		"\u0002\u0001\u0000\u053b\u0544\u0005.\u0000\u0000\u053c\u0541\u0003\\"+
		".\u0000\u053d\u053e\u00054\u0000\u0000\u053e\u0540\u0003\\.\u0000\u053f"+
		"\u053d\u0001\u0000\u0000\u0000\u0540\u0543\u0001\u0000\u0000\u0000\u0541"+
		"\u053f\u0001\u0000\u0000\u0000\u0541\u0542\u0001\u0000\u0000\u0000\u0542"+
		"\u0545\u0001\u0000\u0000\u0000\u0543\u0541\u0001\u0000\u0000\u0000\u0544"+
		"\u053c\u0001\u0000\u0000\u0000\u0544\u0545\u0001\u0000\u0000\u0000\u0545"+
		"\u0546\u0001\u0000\u0000\u0000\u0546\u0547\u0005/\u0000\u0000\u0547\u0548"+
		"\u00052\u0000\u0000\u0548\u0549\u0003^/\u0000\u0549\u054a\u00053\u0000"+
		"\u0000\u054ae\u0001\u0000\u0000\u0000\u054b\u0554\u0005.\u0000\u0000\u054c"+
		"\u0551\u0003\\.\u0000\u054d\u054e\u00054\u0000\u0000\u054e\u0550\u0003"+
		"\\.\u0000\u054f\u054d\u0001\u0000\u0000\u0000\u0550\u0553\u0001\u0000"+
		"\u0000\u0000\u0551\u054f\u0001\u0000\u0000\u0000\u0551\u0552\u0001\u0000"+
		"\u0000\u0000\u0552\u0555\u0001\u0000\u0000\u0000\u0553\u0551\u0001\u0000"+
		"\u0000\u0000\u0554\u054c\u0001\u0000\u0000\u0000\u0554\u0555\u0001\u0000"+
		"\u0000\u0000\u0555\u0556\u0001\u0000\u0000\u0000\u0556\u0557\u0005/\u0000"+
		"\u0000\u0557\u0561\u0005\u0015\u0000\u0000\u0558\u0559\u00052\u0000\u0000"+
		"\u0559\u055a\u0003^/\u0000\u055a\u055b\u00053\u0000\u0000\u055b\u0562"+
		"\u0001\u0000\u0000\u0000\u055c\u0562\u0003^/\u0000\u055d\u055e\u0005."+
		"\u0000\u0000\u055e\u055f\u0003^/\u0000\u055f\u0560\u0005/\u0000\u0000"+
		"\u0560\u0562\u0001\u0000\u0000\u0000\u0561\u0558\u0001\u0000\u0000\u0000"+
		"\u0561\u055c\u0001\u0000\u0000\u0000\u0561\u055d\u0001\u0000\u0000\u0000"+
		"\u0562g\u0001\u0000\u0000\u0000\u0563\u0564\u0005\u0011\u0000\u0000\u0564"+
		"\u056d\u0005.\u0000\u0000\u0565\u056a\u0003\\.\u0000\u0566\u0567\u0005"+
		"4\u0000\u0000\u0567\u0569\u0003\\.\u0000\u0568\u0566\u0001\u0000\u0000"+
		"\u0000\u0569\u056c\u0001\u0000\u0000\u0000\u056a\u0568\u0001\u0000\u0000"+
		"\u0000\u056a\u056b\u0001\u0000\u0000\u0000\u056b\u056e\u0001\u0000\u0000"+
		"\u0000\u056c\u056a\u0001\u0000\u0000\u0000\u056d\u0565\u0001\u0000\u0000"+
		"\u0000\u056d\u056e\u0001\u0000\u0000\u0000\u056e\u056f\u0001\u0000\u0000"+
		"\u0000\u056f\u0570\u0005/\u0000\u0000\u0570\u0571\u00052\u0000\u0000\u0571"+
		"\u0572\u0003^/\u0000\u0572\u0573\u00053\u0000\u0000\u0573i\u0001\u0000"+
		"\u0000\u0000\u0574\u0578\u0003f3\u0000\u0575\u0578\u0003d2\u0000\u0576"+
		"\u0578\u0003h4\u0000\u0577\u0574\u0001\u0000\u0000\u0000\u0577\u0575\u0001"+
		"\u0000\u0000\u0000\u0577\u0576\u0001\u0000\u0000\u0000\u0578k\u0001\u0000"+
		"\u0000\u0000\u0579\u057b\u0005C\u0000\u0000\u057a\u0579\u0001\u0000\u0000"+
		"\u0000\u057a\u057b\u0001\u0000\u0000\u0000\u057b\u057e\u0001\u0000\u0000"+
		"\u0000\u057c\u057f\u0003\u0002\u0001\u0000\u057d\u057f\u0005N\u0000\u0000"+
		"\u057e\u057c\u0001\u0000\u0000\u0000\u057e\u057d\u0001\u0000\u0000\u0000"+
		"\u057f\u0580\u0001\u0000\u0000\u0000\u0580\u0589\u0005.\u0000\u0000\u0581"+
		"\u0586\u0003\\.\u0000\u0582\u0583\u00054\u0000\u0000\u0583\u0585\u0003"+
		"\\.\u0000\u0584\u0582\u0001\u0000\u0000\u0000\u0585\u0588\u0001\u0000"+
		"\u0000\u0000\u0586\u0584\u0001\u0000\u0000\u0000\u0586\u0587\u0001\u0000"+
		"\u0000\u0000\u0587\u058a\u0001\u0000\u0000\u0000\u0588\u0586\u0001\u0000"+
		"\u0000\u0000\u0589\u0581\u0001\u0000\u0000\u0000\u0589\u058a\u0001\u0000"+
		"\u0000\u0000\u058a\u058b\u0001\u0000\u0000\u0000\u058b\u058c\u0005/\u0000"+
		"\u0000\u058cm\u0001\u0000\u0000\u0000\u058d\u0593\u0003\u0002\u0001\u0000"+
		"\u058e\u0591\u0005H\u0000\u0000\u058f\u0592\u0003\u0002\u0001\u0000\u0590"+
		"\u0592\u0005;\u0000\u0000\u0591\u058f\u0001\u0000\u0000\u0000\u0591\u0590"+
		"\u0001\u0000\u0000\u0000\u0592\u0594\u0001\u0000\u0000\u0000\u0593\u058e"+
		"\u0001\u0000\u0000\u0000\u0593\u0594\u0001\u0000\u0000\u0000\u0594o\u0001"+
		"\u0000\u0000\u0000\u0595\u0598\u0003t:\u0000\u0596\u0598\u0003v;\u0000"+
		"\u0597\u0595\u0001\u0000\u0000\u0000\u0597\u0596\u0001\u0000\u0000\u0000"+
		"\u0598\u059a\u0001\u0000\u0000\u0000\u0599\u059b\u00055\u0000\u0000\u059a"+
		"\u0599\u0001\u0000\u0000\u0000\u059a\u059b\u0001\u0000\u0000\u0000\u059b"+
		"q\u0001\u0000\u0000\u0000\u059c\u05a2\u0005F\u0000\u0000\u059d\u05a3\u0003"+
		"\u0002\u0001\u0000\u059e\u05a3\u0003H$\u0000\u059f\u05a3\u0003B!\u0000"+
		"\u05a0\u05a3\u0003j5\u0000\u05a1\u05a3\u0003R)\u0000\u05a2\u059d\u0001"+
		"\u0000\u0000\u0000\u05a2\u059e\u0001\u0000\u0000\u0000\u05a2\u059f\u0001"+
		"\u0000\u0000\u0000\u05a2\u05a0\u0001\u0000\u0000\u0000\u05a2\u05a1\u0001"+
		"\u0000\u0000\u0000\u05a3s\u0001\u0000\u0000\u0000\u05a4\u05a5\u0005D\u0000"+
		"\u0000\u05a5\u05b8\u0003R)\u0000\u05a6\u05a7\u0005D\u0000\u0000\u05a7"+
		"\u05a8\u00052\u0000\u0000\u05a8\u05ad\u0003n7\u0000\u05a9\u05aa\u0005"+
		"4\u0000\u0000\u05aa\u05ac\u0003n7\u0000\u05ab\u05a9\u0001\u0000\u0000"+
		"\u0000\u05ac\u05af\u0001\u0000\u0000\u0000\u05ad\u05ab\u0001\u0000\u0000"+
		"\u0000\u05ad\u05ae\u0001\u0000\u0000\u0000\u05ae\u05b0\u0001\u0000\u0000"+
		"\u0000\u05af\u05ad\u0001\u0000\u0000\u0000\u05b0\u05b3\u00053\u0000\u0000"+
		"\u05b1\u05b2\u0005G\u0000\u0000\u05b2\u05b4\u0005;\u0000\u0000\u05b3\u05b1"+
		"\u0001\u0000\u0000\u0000\u05b3\u05b4\u0001\u0000\u0000\u0000\u05b4\u05b8"+
		"\u0001\u0000\u0000\u0000\u05b5\u05b6\u0005D\u0000\u0000\u05b6\u05b8\u0003"+
		"d2\u0000\u05b7\u05a4\u0001\u0000\u0000\u0000\u05b7\u05a6\u0001\u0000\u0000"+
		"\u0000\u05b7\u05b5\u0001\u0000\u0000\u0000\u05b8u\u0001\u0000\u0000\u0000"+
		"\u05b9\u05ba\u0005D\u0000\u0000\u05ba\u05c0\u0005 \u0000\u0000\u05bb\u05be"+
		"\u0005H\u0000\u0000\u05bc\u05bf\u0003\u0002\u0001\u0000\u05bd\u05bf\u0005"+
		";\u0000\u0000\u05be\u05bc\u0001\u0000\u0000\u0000\u05be\u05bd\u0001\u0000"+
		"\u0000\u0000\u05bf\u05c1\u0001\u0000\u0000\u0000\u05c0\u05bb\u0001\u0000"+
		"\u0000\u0000\u05c0\u05c1\u0001\u0000\u0000\u0000\u05c1\u05c2\u0001\u0000"+
		"\u0000\u0000\u05c2\u05c3\u0005G\u0000\u0000\u05c3\u05c4\u0005;\u0000\u0000"+
		"\u05c4w\u0001\u0000\u0000\u0000\u05c5\u05e2\u0005E\u0000\u0000\u05c6\u05c7"+
		"\u0005 \u0000\u0000\u05c7\u05c8\u0005H\u0000\u0000\u05c8\u05e3\u0003\u0002"+
		"\u0001\u0000\u05c9\u05ca\u00052\u0000\u0000\u05ca\u05cf\u0003z=\u0000"+
		"\u05cb\u05cc\u00054\u0000\u0000\u05cc\u05ce\u0003z=\u0000\u05cd\u05cb"+
		"\u0001\u0000\u0000\u0000\u05ce\u05d1\u0001\u0000\u0000\u0000\u05cf\u05cd"+
		"\u0001\u0000\u0000\u0000\u05cf\u05d0\u0001\u0000\u0000\u0000\u05d0\u05d2"+
		"\u0001\u0000\u0000\u0000\u05d1\u05cf\u0001\u0000\u0000\u0000\u05d2\u05d3"+
		"\u00053\u0000\u0000\u05d3\u05e3\u0001\u0000\u0000\u0000\u05d4\u05d5\u0003"+
		"z=\u0000\u05d5\u05d6\u00054\u0000\u0000\u05d6\u05d7\u00052\u0000\u0000"+
		"\u05d7\u05dc\u0003z=\u0000\u05d8\u05d9\u00054\u0000\u0000\u05d9\u05db"+
		"\u0003z=\u0000\u05da\u05d8\u0001\u0000\u0000\u0000\u05db\u05de\u0001\u0000"+
		"\u0000\u0000\u05dc\u05da\u0001\u0000\u0000\u0000\u05dc\u05dd\u0001\u0000"+
		"\u0000\u0000\u05dd\u05df\u0001\u0000\u0000\u0000\u05de\u05dc\u0001\u0000"+
		"\u0000\u0000\u05df\u05e0\u00053\u0000\u0000\u05e0\u05e3\u0001\u0000\u0000"+
		"\u0000\u05e1\u05e3\u0003z=\u0000\u05e2\u05c6\u0001\u0000\u0000\u0000\u05e2"+
		"\u05c9\u0001\u0000\u0000\u0000\u05e2\u05d4\u0001\u0000\u0000\u0000\u05e2"+
		"\u05e1\u0001\u0000\u0000\u0000\u05e3\u05e4\u0001\u0000\u0000\u0000\u05e4"+
		"\u05e5\u0005G\u0000\u0000\u05e5\u05e6\u0005;\u0000\u0000\u05e6y\u0001"+
		"\u0000\u0000\u0000\u05e7\u05ec\u0003\u0002\u0001\u0000\u05e8\u05ec\u0005"+
		"I\u0000\u0000\u05e9\u05ec\u0005J\u0000\u0000\u05ea\u05ec\u0005L\u0000"+
		"\u0000\u05eb\u05e7\u0001\u0000\u0000\u0000\u05eb\u05e8\u0001\u0000\u0000"+
		"\u0000\u05eb\u05e9\u0001\u0000\u0000\u0000\u05eb\u05ea\u0001\u0000\u0000"+
		"\u0000\u05ec\u05ef\u0001\u0000\u0000\u0000\u05ed\u05ee\u0005H\u0000\u0000"+
		"\u05ee\u05f0\u0003\u0002\u0001\u0000\u05ef\u05ed\u0001\u0000\u0000\u0000"+
		"\u05ef\u05f0\u0001\u0000\u0000\u0000\u05f0{\u0001\u0000\u0000\u0000\u05f1"+
		"\u05f5\u0003\u0086C\u0000\u05f2\u05f5\u0003\u0082A\u0000\u05f3\u05f5\u0003"+
		"\u0088D\u0000\u05f4\u05f1\u0001\u0000\u0000\u0000\u05f4\u05f2\u0001\u0000"+
		"\u0000\u0000\u05f4\u05f3\u0001\u0000\u0000\u0000\u05f5}\u0001\u0000\u0000"+
		"\u0000\u05f6\u05f7\u0005)\u0000\u0000\u05f7\u05fc\u0003\u0002\u0001\u0000"+
		"\u05f8\u05f9\u00058\u0000\u0000\u05f9\u05fb\u0003\u0002\u0001\u0000\u05fa"+
		"\u05f8\u0001\u0000\u0000\u0000\u05fb\u05fe\u0001\u0000\u0000\u0000\u05fc"+
		"\u05fa\u0001\u0000\u0000\u0000\u05fc\u05fd\u0001\u0000\u0000\u0000\u05fd"+
		"\u0602\u0001\u0000\u0000\u0000\u05fe\u05fc\u0001\u0000\u0000\u0000\u05ff"+
		"\u0601\u0003\u008aE\u0000\u0600\u05ff\u0001\u0000\u0000\u0000\u0601\u0604"+
		"\u0001\u0000\u0000\u0000\u0602\u0600\u0001\u0000\u0000\u0000\u0602\u0603"+
		"\u0001\u0000\u0000\u0000\u0603\u0605\u0001\u0000\u0000\u0000\u0604\u0602"+
		"\u0001\u0000\u0000\u0000\u0605\u0606\u0005(\u0000\u0000\u0606\u007f\u0001"+
		"\u0000\u0000\u0000\u0607\u0608\u0005)\u0000\u0000\u0608\u0609\u0005!\u0000"+
		"\u0000\u0609\u060e\u0003\u0002\u0001\u0000\u060a\u060b\u00058\u0000\u0000"+
		"\u060b\u060d\u0003\u0002\u0001\u0000\u060c\u060a\u0001\u0000\u0000\u0000"+
		"\u060d\u0610\u0001\u0000\u0000\u0000\u060e\u060c\u0001\u0000\u0000\u0000"+
		"\u060e\u060f\u0001\u0000\u0000\u0000\u060f\u0611\u0001\u0000\u0000\u0000"+
		"\u0610\u060e\u0001\u0000\u0000\u0000\u0611\u0612\u0005(\u0000\u0000\u0612"+
		"\u0081\u0001\u0000\u0000\u0000\u0613\u0614\u0005)\u0000\u0000\u0614\u0619"+
		"\u0003\u0002\u0001\u0000\u0615\u0616\u00058\u0000\u0000\u0616\u0618\u0003"+
		"\u0002\u0001\u0000\u0617\u0615\u0001\u0000\u0000\u0000\u0618\u061b\u0001"+
		"\u0000\u0000\u0000\u0619\u0617\u0001\u0000\u0000\u0000\u0619\u061a\u0001"+
		"\u0000\u0000\u0000\u061a\u061f\u0001\u0000\u0000\u0000\u061b\u0619\u0001"+
		"\u0000\u0000\u0000\u061c\u061e\u0003\u008aE\u0000\u061d\u061c\u0001\u0000"+
		"\u0000\u0000\u061e\u0621\u0001\u0000\u0000\u0000\u061f\u061d\u0001\u0000"+
		"\u0000\u0000\u061f\u0620\u0001\u0000\u0000\u0000\u0620\u0622\u0001\u0000"+
		"\u0000\u0000\u0621\u061f\u0001\u0000\u0000\u0000\u0622\u0623\u0005!\u0000"+
		"\u0000\u0623\u0624\u0005(\u0000\u0000\u0624\u0083\u0001\u0000\u0000\u0000"+
		"\u0625\u0639\u00052\u0000\u0000\u0626\u062b\u0003l6\u0000\u0627\u062b"+
		"\u0003L&\u0000\u0628\u062b\u0003J%\u0000\u0629\u062b\u0003B!\u0000\u062a"+
		"\u0626\u0001\u0000\u0000\u0000\u062a\u0627\u0001\u0000\u0000\u0000\u062a"+
		"\u0628\u0001\u0000\u0000\u0000\u062a\u0629\u0001\u0000\u0000\u0000\u062b"+
		"\u062e\u0001\u0000\u0000\u0000\u062c\u062a\u0001\u0000\u0000\u0000\u062c"+
		"\u062d\u0001\u0000\u0000\u0000\u062d\u063a\u0001\u0000\u0000\u0000\u062e"+
		"\u062c\u0001\u0000\u0000\u0000\u062f\u0631\u0003j5\u0000\u0630\u062f\u0001"+
		"\u0000\u0000\u0000\u0630\u0631\u0001\u0000\u0000\u0000\u0631\u063a\u0001"+
		"\u0000\u0000\u0000\u0632\u063a\u0003\u008cF\u0000\u0633\u0635\u0003\u0084"+
		"B\u0000\u0634\u0633\u0001\u0000\u0000\u0000\u0635\u0638\u0001\u0000\u0000"+
		"\u0000\u0636\u0634\u0001\u0000\u0000\u0000\u0636\u0637\u0001\u0000\u0000"+
		"\u0000\u0637\u063a\u0001\u0000\u0000\u0000\u0638\u0636\u0001\u0000\u0000"+
		"\u0000\u0639\u062c\u0001\u0000\u0000\u0000\u0639\u0630\u0001\u0000\u0000"+
		"\u0000\u0639\u0632\u0001\u0000\u0000\u0000\u0639\u0636\u0001\u0000\u0000"+
		"\u0000\u063a\u063b\u0001\u0000\u0000\u0000\u063b\u063c\u00053\u0000\u0000"+
		"\u063c\u0085\u0001\u0000\u0000\u0000\u063d\u0643\u0003~?\u0000\u063e\u0642"+
		"\u0003|>\u0000\u063f\u0642\u0003\u0084B\u0000\u0640\u0642\u0003`0\u0000"+
		"\u0641\u063e\u0001\u0000\u0000\u0000\u0641\u063f\u0001\u0000\u0000\u0000"+
		"\u0641\u0640\u0001\u0000\u0000\u0000\u0642\u0645\u0001\u0000\u0000\u0000"+
		"\u0643\u0641\u0001\u0000\u0000\u0000\u0643\u0644\u0001\u0000\u0000\u0000"+
		"\u0644\u0646\u0001\u0000\u0000\u0000\u0645\u0643\u0001\u0000\u0000\u0000"+
		"\u0646\u0647\u0003\u0080@\u0000\u0647\u0087\u0001\u0000\u0000\u0000\u0648"+
		"\u0649\u0005)\u0000\u0000\u0649\u064a\u0005(\u0000\u0000\u064a\u0650\u0001"+
		"\u0000\u0000\u0000\u064b\u064f\u0003|>\u0000\u064c\u064f\u0003\u0084B"+
		"\u0000\u064d\u064f\u0003`0\u0000\u064e\u064b\u0001\u0000\u0000\u0000\u064e"+
		"\u064c\u0001\u0000\u0000\u0000\u064e\u064d\u0001\u0000\u0000\u0000\u064f"+
		"\u0652\u0001\u0000\u0000\u0000\u0650\u064e\u0001\u0000\u0000\u0000\u0650"+
		"\u0651\u0001\u0000\u0000\u0000\u0651\u0653\u0001\u0000\u0000\u0000\u0652"+
		"\u0650\u0001\u0000\u0000\u0000\u0653\u0654\u0005)\u0000\u0000\u0654\u0655"+
		"\u0005!\u0000\u0000\u0655\u0656\u0005(\u0000\u0000\u0656\u0089\u0001\u0000"+
		"\u0000\u0000\u0657\u0658\u00052\u0000\u0000\u0658\u0659\u0003\u008cF\u0000"+
		"\u0659\u065a\u00053\u0000\u0000\u065a\u0676\u0001\u0000\u0000\u0000\u065b"+
		"\u065c\u0005\u0013\u0000\u0000\u065c\u065d\u0005\u0016\u0000\u0000\u065d"+
		"\u0669\u00052\u0000\u0000\u065e\u065f\u0005.\u0000\u0000\u065f\u0660\u0005"+
		"/\u0000\u0000\u0660\u0666\u0005\u0015\u0000\u0000\u0661\u0667\u0003N\'"+
		"\u0000\u0662\u0663\u00052\u0000\u0000\u0663\u0664\u0003N\'\u0000\u0664"+
		"\u0665\u00053\u0000\u0000\u0665\u0667\u0001\u0000\u0000\u0000\u0666\u0661"+
		"\u0001\u0000\u0000\u0000\u0666\u0662\u0001\u0000\u0000\u0000\u0667\u066a"+
		"\u0001\u0000\u0000\u0000\u0668\u066a\u0003N\'\u0000\u0669\u065e\u0001"+
		"\u0000\u0000\u0000\u0669\u0668\u0001\u0000\u0000\u0000\u066a\u066b\u0001"+
		"\u0000\u0000\u0000\u066b\u066c\u00053\u0000\u0000\u066c\u0676\u0001\u0000"+
		"\u0000\u0000\u066d\u0673\u0003\u0002\u0001\u0000\u066e\u0671\u0005\u0016"+
		"\u0000\u0000\u066f\u0672\u0003H$\u0000\u0670\u0672\u0003\u0084B\u0000"+
		"\u0671\u066f\u0001\u0000\u0000\u0000\u0671\u0670\u0001\u0000\u0000\u0000"+
		"\u0672\u0674\u0001\u0000\u0000\u0000\u0673\u066e\u0001\u0000\u0000\u0000"+
		"\u0673\u0674\u0001\u0000\u0000\u0000\u0674\u0676\u0001\u0000\u0000\u0000"+
		"\u0675\u0657\u0001\u0000\u0000\u0000\u0675\u065b\u0001\u0000\u0000\u0000"+
		"\u0675\u066d\u0001\u0000\u0000\u0000\u0676\u008b\u0001\u0000\u0000\u0000"+
		"\u0677\u0678\u00058\u0000\u0000\u0678\u0679\u00058\u0000\u0000\u0679\u067f"+
		"\u00058\u0000\u0000\u067a\u0680\u0003\u0002\u0001\u0000\u067b\u0680\u0003"+
		"H$\u0000\u067c\u0680\u0003V+\u0000\u067d\u0680\u0003j5\u0000\u067e\u0680"+
		"\u0003l6\u0000\u067f\u067a\u0001\u0000\u0000\u0000\u067f\u067b\u0001\u0000"+
		"\u0000\u0000\u067f\u067c\u0001\u0000\u0000\u0000\u067f\u067d\u0001\u0000"+
		"\u0000\u0000\u067f\u067e\u0001\u0000\u0000\u0000\u0680\u008d\u0001\u0000"+
		"\u0000\u0000\u0681\u0682\u0005?\u0000\u0000\u0682\u0683\u00050\u0000\u0000"+
		"\u0683\u0684\u0003\u0002\u0001\u0000\u0684\u0685\u00054\u0000\u0000\u0685"+
		"\u0686\u0003\u0002\u0001\u0000\u0686\u0687\u00051\u0000\u0000\u0687\u0688"+
		"\u0005\u0016\u0000\u0000\u0688\u0689\u0005I\u0000\u0000\u0689\u068e\u0005"+
		".\u0000\u0000\u068a\u068f\u0003\u0002\u0001\u0000\u068b\u068f\u0003H$"+
		"\u0000\u068c\u068f\u0003B!\u0000\u068d\u068f\u0003L&\u0000\u068e\u068a"+
		"\u0001\u0000\u0000\u0000\u068e\u068b\u0001\u0000\u0000\u0000\u068e\u068c"+
		"\u0001\u0000\u0000\u0000\u068e\u068d\u0001\u0000\u0000\u0000\u068f\u0690"+
		"\u0001\u0000\u0000\u0000\u0690\u0691\u0005/\u0000\u0000\u0691\u008f\u0001"+
		"\u0000\u0000\u0000\u0692\u0693\u0005?\u0000\u0000\u0693\u0694\u0003\u0002"+
		"\u0001\u0000\u0694\u0695\u0005\u0016\u0000\u0000\u0695\u0696\u0005L\u0000"+
		"\u0000\u0696\u069b\u0005.\u0000\u0000\u0697\u069c\u0003\u0002\u0001\u0000"+
		"\u0698\u069c\u0003H$\u0000\u0699\u069c\u0003B!\u0000\u069a\u069c\u0003"+
		"L&\u0000\u069b\u0697\u0001\u0000\u0000\u0000\u069b\u0698\u0001\u0000\u0000"+
		"\u0000\u069b\u0699\u0001\u0000\u0000\u0000\u069b\u069a\u0001\u0000\u0000"+
		"\u0000\u069c\u069d\u0001\u0000\u0000\u0000\u069d\u069e\u0005/\u0000\u0000"+
		"\u069e\u0091\u0001\u0000\u0000\u0000\u069f\u06a0\u0005J\u0000\u0000\u06a0"+
		"\u06a3\u0005.\u0000\u0000\u06a1\u06a4\u0003h4\u0000\u06a2\u06a4\u0003"+
		"f3\u0000\u06a3\u06a1\u0001\u0000\u0000\u0000\u06a3\u06a2\u0001\u0000\u0000"+
		"\u0000\u06a4\u06a7\u0001\u0000\u0000\u0000\u06a5\u06a6\u00054\u0000\u0000"+
		"\u06a6\u06a8\u0003\u0094J\u0000\u06a7\u06a5\u0001\u0000\u0000\u0000\u06a7"+
		"\u06a8\u0001\u0000\u0000\u0000\u06a8\u06a9\u0001\u0000\u0000\u0000\u06a9"+
		"\u06aa\u0005/\u0000\u0000\u06aa\u0093\u0001\u0000\u0000\u0000\u06ab\u06ac"+
		"\u00050\u0000\u0000\u06ac\u06b1\u0003\u0002\u0001\u0000\u06ad\u06ae\u0005"+
		"4\u0000\u0000\u06ae\u06b0\u0003\u0002\u0001\u0000\u06af\u06ad\u0001\u0000"+
		"\u0000\u0000\u06b0\u06b3\u0001\u0000\u0000\u0000\u06b1\u06af\u0001\u0000"+
		"\u0000\u0000\u06b1\u06b2\u0001\u0000\u0000\u0000\u06b2\u06b4\u0001\u0000"+
		"\u0000\u0000\u06b3\u06b1\u0001\u0000\u0000\u0000\u06b4\u06b5\u00051\u0000"+
		"\u0000\u06b5\u0095\u0001\u0000\u0000\u0000\u06b6\u06ba\u0003B!\u0000\u06b7"+
		"\u06ba\u0003\u0002\u0001\u0000\u06b8\u06ba\u0005>\u0000\u0000\u06b9\u06b6"+
		"\u0001\u0000\u0000\u0000\u06b9\u06b7\u0001\u0000\u0000\u0000\u06b9\u06b8"+
		"\u0001\u0000\u0000\u0000\u06ba\u0097\u0001\u0000\u0000\u0000\u06bb\u06bc"+
		"\u0005K\u0000\u0000\u06bc\u06bd\u0005.\u0000\u0000\u06bd\u06be\u0003L"+
		"&\u0000\u06be\u06bf\u00054\u0000\u0000\u06bf\u06cb\u0003\u0096K\u0000"+
		"\u06c0\u06c7\u00054\u0000\u0000\u06c1\u06c8\u0003H$\u0000\u06c2\u06c8"+
		"\u0003\u0002\u0001\u0000\u06c3\u06c8\u0003V+\u0000\u06c4\u06c8\u0003\u0098"+
		"L\u0000\u06c5\u06c8\u0003|>\u0000\u06c6\u06c8\u0003\u008cF\u0000\u06c7"+
		"\u06c1\u0001\u0000\u0000\u0000\u06c7\u06c2\u0001\u0000\u0000\u0000\u06c7"+
		"\u06c3\u0001\u0000\u0000\u0000\u06c7\u06c4\u0001\u0000\u0000\u0000\u06c7"+
		"\u06c5\u0001\u0000\u0000\u0000\u06c7\u06c6\u0001\u0000\u0000\u0000\u06c8"+
		"\u06ca\u0001\u0000\u0000\u0000\u06c9\u06c0\u0001\u0000\u0000\u0000\u06ca"+
		"\u06cd\u0001\u0000\u0000\u0000\u06cb\u06c9\u0001\u0000\u0000\u0000\u06cb"+
		"\u06cc\u0001\u0000\u0000\u0000\u06cc\u06ce\u0001\u0000\u0000\u0000\u06cd"+
		"\u06cb\u0001\u0000\u0000\u0000\u06ce\u06cf\u0005/\u0000\u0000\u06cf\u0099"+
		"\u0001\u0000\u0000\u0000\u06d0\u06db\u0005\u0012\u0000\u0000\u06d1\u06d4"+
		"\u0005.\u0000\u0000\u06d2\u06d5\u0003|>\u0000\u06d3\u06d5\u0005>\u0000"+
		"\u0000\u06d4\u06d2\u0001\u0000\u0000\u0000\u06d4\u06d3\u0001\u0000\u0000"+
		"\u0000\u06d5\u06d6\u0001\u0000\u0000\u0000\u06d6\u06dc\u0005/\u0000\u0000"+
		"\u06d7\u06da\u0003|>\u0000\u06d8\u06da\u0005>\u0000\u0000\u06d9\u06d7"+
		"\u0001\u0000\u0000\u0000\u06d9\u06d8\u0001\u0000\u0000\u0000\u06da\u06dc"+
		"\u0001\u0000\u0000\u0000\u06db\u06d1\u0001\u0000\u0000\u0000\u06db\u06d9"+
		"\u0001\u0000\u0000\u0000\u06dc\u06e0\u0001\u0000\u0000\u0000\u06dd\u06df"+
		"\u00055\u0000\u0000\u06de\u06dd\u0001\u0000\u0000\u0000\u06df\u06e2\u0001"+
		"\u0000\u0000\u0000\u06e0\u06de\u0001\u0000\u0000\u0000\u06e0\u06e1\u0001"+
		"\u0000\u0000\u0000\u06e1\u009b\u0001\u0000\u0000\u0000\u06e2\u06e0\u0001"+
		"\u0000\u0000\u0000\u06e3\u06e6\u0003\u009eO\u0000\u06e4\u06e6\u0003\u00a0"+
		"P\u0000\u06e5\u06e3\u0001\u0000\u0000\u0000\u06e5\u06e4\u0001\u0000\u0000"+
		"\u0000\u06e6\u06ea\u0001\u0000\u0000\u0000\u06e7\u06e9\u00055\u0000\u0000"+
		"\u06e8\u06e7\u0001\u0000\u0000\u0000\u06e9\u06ec\u0001\u0000\u0000\u0000"+
		"\u06ea\u06e8\u0001\u0000\u0000\u0000\u06ea\u06eb\u0001\u0000\u0000\u0000"+
		"\u06eb\u009d\u0001\u0000\u0000\u0000\u06ec\u06ea\u0001\u0000\u0000\u0000"+
		"\u06ed\u06ee\u0005?\u0000\u0000\u06ee\u06ef\u0003\u0002\u0001\u0000\u06ef"+
		"\u06f0\u0005\u0016\u0000\u0000\u06f0\u06f2\u0005.\u0000\u0000\u06f1\u06f3"+
		"\u0003\u0096K\u0000\u06f2\u06f1\u0001\u0000\u0000\u0000\u06f2\u06f3\u0001"+
		"\u0000\u0000\u0000\u06f3\u06f4\u0001\u0000\u0000\u0000\u06f4\u06f5\u0005"+
		"/\u0000\u0000\u06f5\u06fb\u0005\u0015\u0000\u0000\u06f6\u06f7\u00052\u0000"+
		"\u0000\u06f7\u06f8\u0003\u00a2Q\u0000\u06f8\u06f9\u00053\u0000\u0000\u06f9"+
		"\u06fc\u0001\u0000\u0000\u0000\u06fa\u06fc\u0003\u00a2Q\u0000\u06fb\u06f6"+
		"\u0001\u0000\u0000\u0000\u06fb\u06fa\u0001\u0000\u0000\u0000\u06fc\u009f"+
		"\u0001\u0000\u0000\u0000\u06fd\u06fe\u0005\u0011\u0000\u0000\u06fe\u06ff"+
		"\u0003\u0002\u0001\u0000\u06ff\u0701\u0005.\u0000\u0000\u0700\u0702\u0003"+
		"\u0096K\u0000\u0701\u0700\u0001\u0000\u0000\u0000\u0701\u0702\u0001\u0000"+
		"\u0000\u0000\u0702\u0703\u0001\u0000\u0000\u0000\u0703\u0704\u0005/\u0000"+
		"\u0000\u0704\u0705\u00052\u0000\u0000\u0705\u0706\u0003\u00a2Q\u0000\u0706"+
		"\u0707\u00053\u0000\u0000\u0707\u00a1\u0001\u0000\u0000\u0000\u0708\u070a"+
		"\u0003`0\u0000\u0709\u0708\u0001\u0000\u0000\u0000\u070a\u070d\u0001\u0000"+
		"\u0000\u0000\u070b\u0709\u0001\u0000\u0000\u0000\u070b\u070c\u0001\u0000"+
		"\u0000\u0000\u070c\u070e\u0001\u0000\u0000\u0000\u070d\u070b\u0001\u0000"+
		"\u0000\u0000\u070e\u070f\u0003\u009aM\u0000\u070f\u00a3\u0001\u0000\u0000"+
		"\u0000\u012e\u00a7\u00ae\u00b5\u00bd\u00c3\u00c6\u00cd\u00d0\u00d7\u00e0"+
		"\u00e4\u00e6\u00ea\u00ec\u00f1\u00f3\u00f6\u00fc\u0100\u0107\u0110\u0114"+
		"\u0116\u011a\u011c\u0121\u0123\u0126\u012f\u0133\u0135\u0139\u013b\u0140"+
		"\u0142\u0145\u014c\u0156\u015e\u0162\u0164\u016b\u0174\u0178\u017a\u017e"+
		"\u0180\u0185\u0187\u018a\u0193\u0197\u0199\u019d\u019f\u01a4\u01a6\u01a9"+
		"\u01af\u01b8\u01be\u01c5\u01c9\u01cb\u01cf\u01d1\u01d6\u01d8\u01db\u01e4"+
		"\u01e8\u01ea\u01ee\u01f0\u01f5\u01f7\u01fa\u01fd\u0201\u0204\u0209\u0211"+
		"\u0217\u021b\u021d\u0221\u0223\u0228\u022a\u022d\u0236\u023a\u023c\u0240"+
		"\u0242\u0247\u0249\u024c\u0253\u0258\u0266\u0276\u027c\u0284\u028e\u0297"+
		"\u029c\u029e\u02a2\u02a4\u02a9\u02ac\u02af\u02b5\u02b9\u02c0\u02c9\u02ce"+
		"\u02d0\u02d4\u02d6\u02db\u02de\u02e1\u02ea\u02ef\u02f1\u02f5\u02f7\u02fc"+
		"\u02ff\u0302\u0309\u0313\u031b\u031f\u0321\u0328\u0331\u0336\u0338\u033c"+
		"\u033e\u0343\u0346\u0349\u0352\u0357\u0359\u035d\u035f\u0364\u0367\u036a"+
		"\u0370\u0379\u037f\u0386\u038b\u038d\u0391\u0393\u0398\u039b\u039e\u03a7"+
		"\u03ac\u03ae\u03b2\u03b4\u03b9\u03bc\u03bf\u03c2\u03c6\u03c9\u03ce\u03d6"+
		"\u03dc\u03e1\u03e3\u03e7\u03e9\u03ee\u03f1\u03f4\u03fd\u0402\u0404\u0408"+
		"\u040a\u040f\u0412\u0415\u041c\u0421\u0428\u042f\u0436\u043d\u0442\u0446"+
		"\u0448\u044d\u0454\u0458\u045e\u0468\u0473\u047b\u047d\u0483\u0491\u0493"+
		"\u049d\u04ab\u04ad\u04b3\u04ba\u04c1\u04c8\u04cd\u04d1\u04d3\u04d8\u04e4"+
		"\u04ec\u04f1\u04f5\u050e\u0513\u0520\u052c\u052e\u0533\u0537\u0541\u0544"+
		"\u0551\u0554\u0561\u056a\u056d\u0577\u057a\u057e\u0586\u0589\u0591\u0593"+
		"\u0597\u059a\u05a2\u05ad\u05b3\u05b7\u05be\u05c0\u05cf\u05dc\u05e2\u05eb"+
		"\u05ef\u05f4\u05fc\u0602\u060e\u0619\u061f\u062a\u062c\u0630\u0636\u0639"+
		"\u0641\u0643\u064e\u0650\u0666\u0669\u0671\u0673\u0675\u067f\u068e\u069b"+
		"\u06a3\u06a7\u06b1\u06b9\u06c7\u06cb\u06d4\u06d9\u06db\u06e0\u06e5\u06ea"+
		"\u06f2\u06fb\u0701\u070b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}