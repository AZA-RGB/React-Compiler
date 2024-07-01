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
		HTML_ATTRIBUTE_NAME=77, IDENTIFIER=78, ONCLICK=79;
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
		RULE_exportAll = 59, RULE_moduleImport = 60, RULE_normalImport = 61, RULE_importStatement = 62, 
		RULE_importSpecifier = 63, RULE_jsx = 64, RULE_openTag = 65, RULE_closeTag = 66, 
		RULE_selfClosingElement = 67, RULE_jsxExpression = 68, RULE_normalJsxElement = 69, 
		RULE_jsxFragment = 70, RULE_jsxAttribute = 71, RULE_spreadOperation = 72, 
		RULE_useStateDeclaration = 73, RULE_useRefDeclaration = 74, RULE_useEffectDeclaration = 75, 
		RULE_dependencyArray = 76, RULE_props = 77, RULE_pureReactElement = 78, 
		RULE_component_return_statment = 79, RULE_functionalComponent = 80, RULE_arrowComponentDeclaration = 81, 
		RULE_namedComponentDeclaration = 82, RULE_componentFunctionBody = 83;
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
			"namedExport", "exportAll", "moduleImport", "normalImport", "importStatement", 
			"importSpecifier", "jsx", "openTag", "closeTag", "selfClosingElement", 
			"jsxExpression", "normalJsxElement", "jsxFragment", "jsxAttribute", "spreadOperation", 
			"useStateDeclaration", "useRefDeclaration", "useEffectDeclaration", "dependencyArray", 
			"props", "pureReactElement", "component_return_statment", "functionalComponent", 
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
			"USEREF", "HTML_ATTRIBUTE_NAME", "IDENTIFIER", "ONCLICK"
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
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					statement();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case CONST:
				{
				{
				setState(174);
				functionalComponent();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(175);
					statement();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				exportDefault();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(182);
					match(SEMI);
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case EXPORT_DEFAULT:
				{
				{
				setState(188);
				match(EXPORT_DEFAULT);
				setState(189);
				functionalComponent();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(190);
					statement();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(196);
					match(SEMI);
					}
					}
					setState(201);
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
		public TerminalNode HTML_ATTRIBUTE_NAME() { return getToken(ReactParser.HTML_ATTRIBUTE_NAME, 0); }
		public TerminalNode USESTATE() { return getToken(ReactParser.USESTATE, 0); }
		public TerminalNode USEEFFECT() { return getToken(ReactParser.USEEFFECT, 0); }
		public TerminalNode USEREF() { return getToken(ReactParser.USEREF, 0); }
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
			setState(204);
			_la = _input.LA(1);
			if ( !(((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 1062849512059437057L) != 0)) ) {
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(206);
				useStateDeclaration();
				}
				break;
			case 2:
				{
				setState(207);
				useEffectDeclaration();
				}
				break;
			case 3:
				{
				setState(208);
				useRefDeclaration();
				}
				break;
			}
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(211);
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
			setState(214);
			match(IF);
			setState(215);
			match(LPAREN);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(216);
				match(NOT);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			conditions();
			setState(223);
			match(RPAREN);
			setState(224);
			match(LCURLY);
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(225);
					hooks();
					}
					}
					setState(228); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(230);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(231);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(236);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(237);
						match(SEMI);
						}
					}

					}
				}

				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242);
					hooks();
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(249);
				returnStatement();
				}
			}

			setState(252);
			match(RCURLY);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					elseIf_condition();
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(259);
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
			setState(262);
			match(ELSEIF);
			setState(263);
			match(LPAREN);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(264);
				match(NOT);
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			conditions();
			setState(271);
			match(RPAREN);
			setState(272);
			match(LCURLY);
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(273);
					hooks();
					}
					}
					setState(276); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(278);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(279);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(284);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(285);
						match(SEMI);
						}
					}

					}
				}

				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(290);
					hooks();
					}
					}
					setState(293); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(297);
				returnStatement();
				}
			}

			setState(300);
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
			setState(302);
			match(ELSE);
			setState(303);
			match(LCURLY);
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(304);
					hooks();
					}
					}
					setState(307); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(309);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(310);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(315);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(316);
						match(SEMI);
						}
					}

					}
				}

				setState(322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(321);
					hooks();
					}
					}
					setState(324); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(328);
				returnStatement();
				}
			}

			setState(331);
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
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(333);
				match(NOT);
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			conditions();
			setState(340);
			match(QUESITIONMARK);
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(341);
				match(LPAREN);
				setState(342);
				hooks();
				setState(343);
				match(RPAREN);
				}
				break;
			case CONST:
			case USEEFFECT:
				{
				setState(345);
				hooks();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(348);
			match(COLON);
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(349);
					match(LPAREN);
					setState(350);
					hooks();
					}
					break;
				case 2:
					{
					setState(351);
					tenaryExpression();
					setState(352);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(356);
					hooks();
					}
					break;
				case 2:
					{
					setState(357);
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
			setState(362);
			match(WHILE);
			setState(363);
			match(LPAREN);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(364);
				match(NOT);
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			conditions();
			setState(371);
			match(RPAREN);
			setState(372);
			match(LCURLY);
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(374); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(373);
					hooks();
					}
					}
					setState(376); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(378);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(379);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(384);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(385);
						match(SEMI);
						}
					}

					}
				}

				setState(391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(390);
					hooks();
					}
					}
					setState(393); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(397);
				returnStatement();
				}
			}

			setState(400);
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
			setState(402);
			match(DO);
			setState(403);
			match(LCURLY);
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(405); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(404);
					hooks();
					}
					}
					setState(407); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(409);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(410);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(415);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(416);
						match(SEMI);
						}
					}

					}
				}

				setState(422); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(421);
					hooks();
					}
					}
					setState(424); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(428);
				returnStatement();
				}
			}

			setState(431);
			match(RCURLY);
			setState(432);
			match(WHILE);
			setState(433);
			match(LPAREN);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(434);
				match(NOT);
				}
			}

			setState(437);
			conditions();
			setState(438);
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
			setState(440);
			match(FOR);
			setState(441);
			match(LPAREN);
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
				{
				setState(442);
				variableDeclaration();
				}
				break;
			case EVENT_ATTRIBUTE:
			case USESTATE:
			case USEEFFECT:
			case USEREF:
			case HTML_ATTRIBUTE_NAME:
			case IDENTIFIER:
				{
				setState(443);
				variableDeclarator();
				}
				break;
			case SEMI:
				break;
			default:
				break;
			}
			setState(446);
			match(SEMI);
			setState(447);
			conditions();
			setState(448);
			match(SEMI);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 2216069088071909377L) != 0)) {
				{
				setState(449);
				expression(0);
				}
			}

			setState(452);
			match(RPAREN);
			setState(453);
			match(LCURLY);
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(455); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(454);
					hooks();
					}
					}
					setState(457); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
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

				setState(472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(471);
					hooks();
					}
					}
					setState(474); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(478);
				returnStatement();
				}
			}

			setState(481);
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
			setState(483);
			match(TRY);
			setState(484);
			match(LCURLY);
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(486); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(485);
						hooks();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(488); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(490);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(491);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(496);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(497);
						match(SEMI);
						}
					}

					}
				}

				setState(503); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(502);
						hooks();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(505); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
				{
				setState(509);
				throwEx();
				}
			}

			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(512);
				returnStatement();
				}
			}

			setState(515);
			match(RCURLY);
			{
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(516);
				catch_expression();
				}
				break;
			}
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(519);
				finally_expression();
				}
				break;
			}
			}
			setState(525);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(522);
					match(SEMI);
					}
					} 
				}
				setState(527);
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
			setState(528);
			match(CATCH);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(529);
				match(LPAREN);
				setState(530);
				id();
				setState(531);
				match(RPAREN);
				}
			}

			setState(535);
			match(LCURLY);
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(537); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(536);
					hooks();
					}
					}
					setState(539); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(541);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(542);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(547);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(548);
						match(SEMI);
						}
					}

					}
				}

				setState(554); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(553);
					hooks();
					}
					}
					setState(556); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(560);
				returnStatement();
				}
			}

			setState(563);
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
			setState(565);
			match(FINALLY);
			setState(566);
			match(LCURLY);
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(568); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(567);
					hooks();
					}
					}
					setState(570); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(572);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(573);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(578);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(579);
						match(SEMI);
						}
					}

					}
				}

				setState(585); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(584);
					hooks();
					}
					}
					setState(587); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONST || _la==USEEFFECT );
				}
				break;
			}
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(591);
				returnStatement();
				}
			}

			setState(594);
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
			setState(596);
			match(THROW);
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				{
				setState(597);
				object();
				}
				break;
			case CONST:
			case USEEFFECT:
				{
				setState(598);
				hooks();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(601);
					match(SEMI);
					}
					} 
				}
				setState(606);
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
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				if_condition_semantic();
				}
				break;
			case ELSEIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				elseIf_condition_semantic();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
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
			case USESTATE:
			case USEEFFECT:
			case CREATEELEMENT:
			case USEREF:
			case HTML_ATTRIBUTE_NAME:
			case IDENTIFIER:
			case ONCLICK:
				enterOuterAlt(_localctx, 4);
				{
				setState(610);
				tenaryExpression_semantic();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(611);
				while_semantic();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(612);
				do_while_semantic();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(613);
				for_loop_semantic();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 8);
				{
				setState(614);
				try_expression_semantic();
				}
				break;
			case CATCH:
				enterOuterAlt(_localctx, 9);
				{
				setState(615);
				catch_expression_semantic();
				}
				break;
			case FINALLY:
				enterOuterAlt(_localctx, 10);
				{
				setState(616);
				finally_expression_semantic();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(617);
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
			setState(620);
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
			setState(622);
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
			setState(624);
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
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(626);
				jsx();
				}
				break;
			case 2:
				{
				setState(627);
				literal();
				}
				break;
			case 3:
				{
				setState(628);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(629);
				id();
				}
				break;
			case 5:
				{
				setState(630);
				pureReactElement();
				}
				break;
			case 6:
				{
				setState(631);
				array();
				}
				break;
			case 7:
				{
				setState(632);
				functionCall();
				}
				break;
			case 8:
				{
				setState(633);
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
			setState(636);
			operation_element();
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(637);
				operation_condition();
				setState(638);
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
			setState(642);
			condition();
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(643);
				and_or();
				setState(644);
				condition();
				}
				}
				setState(650);
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
			setState(651);
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
			setState(653);
			match(IF);
			setState(654);
			match(LPAREN);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(655);
				match(NOT);
				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(661);
			conditions();
			setState(662);
			match(RPAREN);
			setState(663);
			match(LCURLY);
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(664);
					statement();
					}
					}
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(670);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(671);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(676);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(678);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(677);
						match(SEMI);
						}
					}

					}
				}

				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(682);
					statement();
					}
					}
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(690);
				returnStatement();
				}
			}

			setState(693);
			match(RCURLY);
			setState(697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(694);
					elseIf_condition();
					}
					} 
				}
				setState(699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(700);
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
			setState(703);
			match(ELSEIF);
			setState(704);
			match(LPAREN);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(705);
				match(NOT);
				}
				}
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(711);
			conditions();
			setState(712);
			match(RPAREN);
			setState(713);
			match(LCURLY);
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(714);
					statement();
					}
					}
					setState(719);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(720);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(722);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(721);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(726);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(728);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(727);
						match(SEMI);
						}
					}

					}
				}

				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(732);
					statement();
					}
					}
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(740);
				returnStatement();
				}
			}

			setState(743);
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
			setState(745);
			match(ELSE);
			setState(746);
			match(LCURLY);
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(747);
					statement();
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(753);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(754);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(759);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(760);
						match(SEMI);
						}
					}

					}
				}

				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(765);
					statement();
					}
					}
					setState(770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(773);
				returnStatement();
				}
			}

			setState(776);
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
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(778);
				match(NOT);
				}
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(784);
			conditions();
			setState(785);
			match(QUESITIONMARK);
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(786);
				match(LPAREN);
				setState(787);
				statement();
				setState(788);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(790);
				statement();
				}
				break;
			}
			setState(793);
			match(COLON);
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(799);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(794);
					match(LPAREN);
					setState(795);
					statement();
					}
					break;
				case 2:
					{
					setState(796);
					tenaryExpression();
					setState(797);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(801);
					statement();
					}
					break;
				case 2:
					{
					setState(802);
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
			setState(807);
			match(WHILE);
			setState(808);
			match(LPAREN);
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(809);
				match(NOT);
				}
				}
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(815);
			conditions();
			setState(816);
			match(RPAREN);
			setState(817);
			match(LCURLY);
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(818);
					statement();
					}
					}
					setState(823);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(824);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(825);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(830);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(832);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(831);
						match(SEMI);
						}
					}

					}
				}

				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(836);
					statement();
					}
					}
					setState(841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(844);
				returnStatement();
				}
			}

			setState(847);
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
			setState(849);
			match(DO);
			setState(850);
			match(LCURLY);
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(851);
					statement();
					}
					}
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(857);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(859);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(858);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(863);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(865);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(864);
						match(SEMI);
						}
					}

					}
				}

				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(869);
					statement();
					}
					}
					setState(874);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(877);
				returnStatement();
				}
			}

			setState(880);
			match(RCURLY);
			setState(881);
			match(WHILE);
			setState(882);
			match(LPAREN);
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(883);
				match(NOT);
				}
			}

			setState(886);
			conditions();
			setState(887);
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
			setState(889);
			match(FOR);
			setState(890);
			match(LPAREN);
			setState(893);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case LET:
			case VAR:
				{
				setState(891);
				variableDeclaration();
				}
				break;
			case EVENT_ATTRIBUTE:
			case USESTATE:
			case USEEFFECT:
			case USEREF:
			case HTML_ATTRIBUTE_NAME:
			case IDENTIFIER:
				{
				setState(892);
				variableDeclarator();
				}
				break;
			case SEMI:
				break;
			default:
				break;
			}
			setState(895);
			match(SEMI);
			setState(896);
			conditions();
			setState(897);
			match(SEMI);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 2216069088071909377L) != 0)) {
				{
				setState(898);
				expression(0);
				}
			}

			setState(901);
			match(RPAREN);
			setState(902);
			match(LCURLY);
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(903);
					statement();
					}
					}
					setState(908);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(909);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(911);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(910);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(915);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(917);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(916);
						match(SEMI);
						}
					}

					}
				}

				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(921);
					statement();
					}
					}
					setState(926);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(929);
				returnStatement();
				}
			}

			setState(932);
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
			setState(934);
			match(TRY);
			setState(935);
			match(LCURLY);
			setState(960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(936);
						statement();
						}
						} 
					}
					setState(941);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(942);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(944);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(943);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(948);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(950);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(949);
						match(SEMI);
						}
					}

					}
				}

				setState(957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(954);
						statement();
						}
						} 
					}
					setState(959);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				}
				break;
			}
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
				{
				setState(962);
				throwEx();
				}
			}

			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(965);
				returnStatement();
				}
			}

			setState(968);
			match(RCURLY);
			{
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(969);
				catch_expression();
				}
				break;
			}
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(972);
				finally_expression();
				}
				break;
			}
			}
			setState(978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(975);
					match(SEMI);
					}
					} 
				}
				setState(980);
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
			setState(981);
			match(CATCH);
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(982);
				match(LPAREN);
				setState(983);
				id();
				setState(984);
				match(RPAREN);
				}
			}

			setState(988);
			match(LCURLY);
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(989);
					statement();
					}
					}
					setState(994);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(995);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(997);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(996);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(1001);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1003);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1002);
						match(SEMI);
						}
					}

					}
				}

				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(1007);
					statement();
					}
					}
					setState(1012);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(1015);
				returnStatement();
				}
			}

			setState(1018);
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
			setState(1020);
			match(FINALLY);
			setState(1021);
			match(LCURLY);
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(1022);
					statement();
					}
					}
					setState(1027);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(1028);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1030);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1029);
						match(SEMI);
						}
					}

					}
				}

				}
				break;
			case 2:
				{
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BREAK || _la==CONTINUE) {
					{
					setState(1034);
					_la = _input.LA(1);
					if ( !(_la==BREAK || _la==CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1035);
						match(SEMI);
						}
					}

					}
				}

				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
					{
					{
					setState(1040);
					statement();
					}
					}
					setState(1045);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(1048);
				returnStatement();
				}
			}

			setState(1051);
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
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1053);
				match(THROW);
				setState(1054);
				object();
				}
				break;
			case 2:
				{
				setState(1055);
				statement();
				}
				break;
			}
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1058);
				match(SEMI);
				}
				}
				setState(1063);
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
			setState(1064);
			match(LCURLY);
			setState(1068);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1065);
					comment();
					}
					} 
				}
				setState(1070);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			}
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 2215771016666284033L) != 0)) {
				{
				setState(1071);
				property();
				setState(1075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1072);
						comment();
						}
						} 
					}
					setState(1077);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				}
				setState(1094);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1078);
						match(COMMA);
						setState(1082);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SINGLE_LINE_COMMENT || _la==COMMENT_BLOCK) {
							{
							{
							setState(1079);
							comment();
							}
							}
							setState(1084);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1085);
						property();
						setState(1089);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1086);
								comment();
								}
								} 
							}
							setState(1091);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
						}
						}
						} 
					}
					setState(1096);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				}
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1097);
					match(COMMA);
					}
				}

				}
			}

			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==COMMENT_BLOCK) {
				{
				{
				setState(1102);
				comment();
				}
				}
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1108);
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
			setState(1112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVENT_ATTRIBUTE:
			case USESTATE:
			case USEEFFECT:
			case USEREF:
			case HTML_ATTRIBUTE_NAME:
			case IDENTIFIER:
				{
				setState(1110);
				id();
				}
				break;
			case ONCLICK:
				{
				setState(1111);
				match(ONCLICK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1114);
				match(COLON);
				setState(1115);
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
			setState(1122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1118);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1119);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1120);
				objectLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1121);
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
			setState(1124);
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
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1128);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1129);
				operator();
				setState(1130);
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
			setState(1143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1135);
				memberExpression();
				}
				break;
			case 2:
				{
				setState(1136);
				literal();
				}
				break;
			case 3:
				{
				setState(1137);
				id();
				}
				break;
			case 4:
				{
				setState(1138);
				jsx();
				}
				break;
			case 5:
				{
				setState(1139);
				match(LPAREN);
				setState(1140);
				expression(0);
				setState(1141);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1145);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1146);
						operator();
						setState(1147);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1149);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1150);
						operator();
						}
						break;
					}
					} 
				}
				setState(1155);
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
			setState(1175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1156);
					id();
					}
					break;
				case 2:
					{
					setState(1157);
					array();
					}
					break;
				case 3:
					{
					setState(1158);
					functionCall();
					}
					break;
				}
				setState(1161);
				match(DOT);
				{
				setState(1162);
				memberExpression();
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1164);
				id();
				setState(1165);
				match(LSBRACKET);
				{
				setState(1166);
				memberExpression();
				}
				setState(1167);
				match(RSBRACKET);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1169);
					functionCall();
					}
					break;
				case 2:
					{
					setState(1170);
					array();
					}
					break;
				case 3:
					{
					setState(1171);
					literal();
					}
					break;
				case 4:
					{
					setState(1172);
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
			setState(1177);
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
			setState(1179);
			variable_declaration_keywords();
			{
			setState(1180);
			variableDeclarator();
			setState(1185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1181);
					match(COMMA);
					setState(1182);
					variableDeclarator();
					}
					} 
				}
				setState(1187);
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
			setState(1188);
			id();
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1189);
				match(EQUAL);
				setState(1199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1190);
					literal();
					}
					break;
				case 2:
					{
					setState(1191);
					objectLiteral();
					}
					break;
				case 3:
					{
					setState(1192);
					array();
					}
					break;
				case 4:
					{
					setState(1193);
					object();
					}
					break;
				case 5:
					{
					setState(1194);
					expression(0);
					}
					break;
				case 6:
					{
					setState(1195);
					id();
					}
					break;
				case 7:
					{
					setState(1196);
					memberExpression();
					}
					break;
				case 8:
					{
					setState(1197);
					anonymousFunctionDeclaration();
					}
					break;
				case 9:
					{
					setState(1198);
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
			setState(1203);
			match(LSBRACKET);
			setState(1207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1204);
					comment();
					}
					} 
				}
				setState(1209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 4540257768648474629L) != 0)) {
				{
				setState(1210);
				arrayElement();
				setState(1214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1211);
						comment();
						}
						} 
					}
					setState(1216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				}
				setState(1233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1217);
						match(COMMA);
						setState(1221);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SINGLE_LINE_COMMENT || _la==COMMENT_BLOCK) {
							{
							{
							setState(1218);
							comment();
							}
							}
							setState(1223);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1224);
						arrayElement();
						setState(1228);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1225);
								comment();
								}
								} 
							}
							setState(1230);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
						}
						}
						} 
					}
					setState(1235);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
				}
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1236);
					match(COMMA);
					}
				}

				}
			}

			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==COMMENT_BLOCK) {
				{
				{
				setState(1241);
				comment();
				}
				}
				setState(1246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1247);
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
			setState(1256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVENT_ATTRIBUTE:
			case USESTATE:
			case USEEFFECT:
			case USEREF:
			case HTML_ATTRIBUTE_NAME:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1249);
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
				setState(1250);
				literal();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1251);
				objectLiteral();
				}
				break;
			case CREATEELEMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1252);
				pureReactElement();
				}
				break;
			case LESS_THAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1253);
				jsx();
				}
				break;
			case FUNCTION:
			case LPAREN:
			case ASYNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1254);
				function();
				}
				break;
			case LSBRACKET:
				enterOuterAlt(_localctx, 7);
				{
				setState(1255);
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
			setState(1258);
			match(NEW);
			setState(1259);
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
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				objectLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1263);
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
			setState(1269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1266);
					statement();
					}
					} 
				}
				setState(1271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1272);
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
			setState(1298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1275);
				semantic_rule();
				}
				break;
			case 2:
				{
				setState(1276);
				if_condition();
				}
				break;
			case 3:
				{
				setState(1277);
				variableDeclaration();
				}
				break;
			case 4:
				{
				setState(1278);
				tenaryExpression();
				}
				break;
			case 5:
				{
				setState(1279);
				namedFunctionDeclaration();
				}
				break;
			case 6:
				{
				setState(1280);
				functionCall();
				}
				break;
			case 7:
				{
				setState(1281);
				useEffectDeclaration();
				}
				break;
			case 8:
				{
				setState(1282);
				useStateDeclaration();
				}
				break;
			case 9:
				{
				setState(1283);
				useRefDeclaration();
				}
				break;
			case 10:
				{
				setState(1284);
				pureReactElement();
				}
				break;
			case 11:
				{
				setState(1285);
				jsxExpression();
				}
				break;
			case 12:
				{
				setState(1286);
				while_();
				}
				break;
			case 13:
				{
				setState(1287);
				do_while();
				}
				break;
			case 14:
				{
				setState(1288);
				for_loop();
				}
				break;
			case 15:
				{
				setState(1289);
				expression(0);
				}
				break;
			case 16:
				{
				setState(1290);
				unaryExpression();
				}
				break;
			case 17:
				{
				setState(1291);
				try_expression();
				}
				break;
			case 18:
				{
				setState(1292);
				variableDeclarator();
				}
				break;
			case 19:
				{
				setState(1293);
				conditions();
				}
				break;
			case 20:
				{
				setState(1294);
				comment();
				}
				break;
			case 21:
				{
				setState(1295);
				importStatement();
				}
				break;
			case 22:
				{
				setState(1296);
				function();
				}
				break;
			case 23:
				{
				setState(1297);
				exportStatement();
				}
				break;
			}
			setState(1303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1300);
					match(SEMI);
					}
					} 
				}
				setState(1305);
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
			setState(1306);
			match(RETURN);
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				{
				setState(1307);
				match(LPAREN);
				setState(1316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1308);
					jsx();
					}
					break;
				case 2:
					{
					setState(1309);
					expression(0);
					}
					break;
				case 3:
					{
					setState(1310);
					literal();
					}
					break;
				case 4:
					{
					setState(1311);
					objectLiteral();
					}
					break;
				case 5:
					{
					setState(1312);
					unaryExpression();
					}
					break;
				case 6:
					{
					setState(1313);
					id();
					}
					break;
				case 7:
					{
					setState(1314);
					pureReactElement();
					}
					break;
				case 8:
					{
					setState(1315);
					array();
					}
					break;
				}
				setState(1318);
				match(RPAREN);
				}
				}
				break;
			case 2:
				{
				setState(1328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1320);
					jsx();
					}
					break;
				case 2:
					{
					setState(1321);
					expression(0);
					}
					break;
				case 3:
					{
					setState(1322);
					literal();
					}
					break;
				case 4:
					{
					setState(1323);
					objectLiteral();
					}
					break;
				case 5:
					{
					setState(1324);
					id();
					}
					break;
				case 6:
					{
					setState(1325);
					unaryExpression();
					}
					break;
				case 7:
					{
					setState(1326);
					pureReactElement();
					}
					break;
				case 8:
					{
					setState(1327);
					array();
					}
					break;
				}
				}
				break;
			}
			setState(1335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1332);
					match(SEMI);
					}
					} 
				}
				setState(1337);
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
			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(1338);
				match(ASYNC);
				}
			}

			setState(1341);
			match(FUNCTION);
			setState(1342);
			id();
			setState(1343);
			match(LPAREN);
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
				{
				setState(1344);
				argument();
				setState(1349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1345);
					match(COMMA);
					setState(1346);
					argument();
					}
					}
					setState(1351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1354);
			match(RPAREN);
			setState(1355);
			match(LCURLY);
			setState(1356);
			functionBody();
			setState(1357);
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
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
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
			setState(1359);
			match(LPAREN);
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
				{
				setState(1360);
				argument();
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1361);
					match(COMMA);
					setState(1362);
					argument();
					}
					}
					setState(1367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1370);
			match(RPAREN);
			setState(1371);
			match(ARROW);
			setState(1381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				{
				setState(1372);
				match(LCURLY);
				setState(1373);
				functionBody();
				setState(1374);
				match(RCURLY);
				}
				}
				break;
			case 2:
				{
				{
				setState(1376);
				match(LPAREN);
				setState(1377);
				functionBody();
				setState(1378);
				match(RPAREN);
				}
				}
				break;
			case 3:
				{
				{
				setState(1380);
				functionBody();
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
			setState(1383);
			match(FUNCTION);
			setState(1384);
			match(LPAREN);
			setState(1393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
				{
				setState(1385);
				argument();
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1386);
					match(COMMA);
					setState(1387);
					argument();
					}
					}
					setState(1392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1395);
			match(RPAREN);
			setState(1396);
			match(LCURLY);
			setState(1397);
			functionBody();
			setState(1398);
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
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1400);
				arrowFunctionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1401);
				namedFunctionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1402);
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
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AWAIT) {
				{
				setState(1405);
				match(AWAIT);
				}
			}

			setState(1410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVENT_ATTRIBUTE:
			case USESTATE:
			case USEEFFECT:
			case USEREF:
			case HTML_ATTRIBUTE_NAME:
			case IDENTIFIER:
				{
				setState(1408);
				id();
				}
				break;
			case ONCLICK:
				{
				setState(1409);
				match(ONCLICK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(1412);
			match(LPAREN);
			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
				{
				setState(1413);
				argument();
				setState(1418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1414);
					match(COMMA);
					setState(1415);
					argument();
					}
					}
					setState(1420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1423);
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
			setState(1425);
			id();
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1426);
				match(AS);
				setState(1429);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EVENT_ATTRIBUTE:
				case USESTATE:
				case USEEFFECT:
				case USEREF:
				case HTML_ATTRIBUTE_NAME:
				case IDENTIFIER:
					{
					setState(1427);
					id();
					}
					break;
				case String:
					{
					setState(1428);
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
			setState(1435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(1433);
				namedExport();
				}
				break;
			case 2:
				{
				setState(1434);
				exportAll();
				}
				break;
			}
			setState(1438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1437);
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
			setState(1440);
			match(EXPORT_DEFAULT);
			setState(1446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVENT_ATTRIBUTE:
			case USESTATE:
			case USEEFFECT:
			case USEREF:
			case HTML_ATTRIBUTE_NAME:
			case IDENTIFIER:
				{
				setState(1441);
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
				setState(1442);
				literal();
				}
				break;
			case LCURLY:
				{
				setState(1443);
				objectLiteral();
				}
				break;
			case FUNCTION:
			case LPAREN:
			case ASYNC:
				{
				setState(1444);
				function();
				}
				break;
			case CONST:
			case LET:
			case VAR:
				{
				setState(1445);
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
			setState(1467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationExportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1448);
				match(EXPORT);
				setState(1449);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new SpecifiedExportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1450);
				match(EXPORT);
				setState(1451);
				match(LCURLY);
				{
				setState(1452);
				exportSpecifier();
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1453);
					match(COMMA);
					setState(1454);
					exportSpecifier();
					}
					}
					setState(1459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1460);
				match(RCURLY);
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(1461);
					match(FROM);
					setState(1462);
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
				setState(1465);
				match(EXPORT);
				setState(1466);
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
			setState(1469);
			match(EXPORT);
			setState(1470);
			match(STAR);
			setState(1476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1471);
				match(AS);
				setState(1474);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EVENT_ATTRIBUTE:
				case USESTATE:
				case USEEFFECT:
				case USEREF:
				case HTML_ATTRIBUTE_NAME:
				case IDENTIFIER:
					{
					setState(1472);
					id();
					}
					break;
				case String:
					{
					setState(1473);
					match(String);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			{
			setState(1478);
			match(FROM);
			setState(1479);
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
	public static class ModuleImportContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public ModuleImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterModuleImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitModuleImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitModuleImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleImportContext moduleImport() throws RecognitionException {
		ModuleImportContext _localctx = new ModuleImportContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_moduleImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1481);
			match(IMPORT);
			setState(1482);
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
	public static class NormalImportContext extends ParserRuleContext {
		public NormalImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalImport; }
	 
		public NormalImportContext() { }
		public void copyFrom(NormalImportContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Destructured_importContext extends NormalImportContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public List<ImportSpecifierContext> importSpecifier() {
			return getRuleContexts(ImportSpecifierContext.class);
		}
		public ImportSpecifierContext importSpecifier(int i) {
			return getRuleContext(ImportSpecifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public Destructured_importContext(NormalImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDestructured_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDestructured_import(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDestructured_import(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Wildcard_importContext extends NormalImportContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public TerminalNode STAR() { return getToken(ReactParser.STAR, 0); }
		public TerminalNode AS() { return getToken(ReactParser.AS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public Wildcard_importContext(NormalImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWildcard_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWildcard_import(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWildcard_import(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Default_importContext extends NormalImportContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public ImportSpecifierContext importSpecifier() {
			return getRuleContext(ImportSpecifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public Default_importContext(NormalImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDefault_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDefault_import(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDefault_import(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Default_and_named_importContext extends NormalImportContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public List<ImportSpecifierContext> importSpecifier() {
			return getRuleContexts(ImportSpecifierContext.class);
		}
		public ImportSpecifierContext importSpecifier(int i) {
			return getRuleContext(ImportSpecifierContext.class,i);
		}
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public TerminalNode LCURLY() { return getToken(ReactParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ReactParser.RCURLY, 0); }
		public Default_and_named_importContext(NormalImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDefault_and_named_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDefault_and_named_import(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDefault_and_named_import(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalImportContext normalImport() throws RecognitionException {
		NormalImportContext _localctx = new NormalImportContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_normalImport);
		int _la;
		try {
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				_localctx = new Wildcard_importContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1484);
				match(IMPORT);
				{
				{
				setState(1485);
				match(STAR);
				setState(1486);
				match(AS);
				setState(1487);
				id();
				}
				{
				setState(1489);
				match(FROM);
				setState(1490);
				match(String);
				}
				}
				}
				break;
			case 2:
				_localctx = new Destructured_importContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1492);
				match(IMPORT);
				{
				{
				setState(1493);
				match(LCURLY);
				{
				setState(1494);
				importSpecifier();
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1495);
					match(COMMA);
					setState(1496);
					importSpecifier();
					}
					}
					setState(1501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1502);
				match(RCURLY);
				}
				{
				setState(1504);
				match(FROM);
				setState(1505);
				match(String);
				}
				}
				}
				break;
			case 3:
				_localctx = new Default_and_named_importContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1507);
				match(IMPORT);
				{
				setState(1508);
				importSpecifier();
				{
				setState(1509);
				match(COMMA);
				{
				setState(1510);
				match(LCURLY);
				{
				setState(1511);
				importSpecifier();
				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1512);
					match(COMMA);
					setState(1513);
					importSpecifier();
					}
					}
					setState(1518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1519);
				match(RCURLY);
				}
				}
				}
				{
				setState(1521);
				match(FROM);
				setState(1522);
				match(String);
				}
				}
				break;
			case 4:
				_localctx = new Default_importContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1524);
				match(IMPORT);
				{
				setState(1525);
				importSpecifier();
				{
				setState(1526);
				match(FROM);
				setState(1527);
				match(String);
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
	public static class ImportStatementContext extends ParserRuleContext {
		public NormalImportContext normalImport() {
			return getRuleContext(NormalImportContext.class,0);
		}
		public ModuleImportContext moduleImport() {
			return getRuleContext(ModuleImportContext.class,0);
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
		enterRule(_localctx, 124, RULE_importStatement);
		try {
			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1531);
				normalImport();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1532);
				moduleImport();
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
	public static class ImportSpecifierContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
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
		enterRule(_localctx, 126, RULE_importSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1535);
			id();
			}
			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1536);
				match(AS);
				setState(1537);
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
		enterRule(_localctx, 128, RULE_jsx);
		try {
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1540);
				normalJsxElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1541);
				selfClosingElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1542);
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
		enterRule(_localctx, 130, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			match(LESS_THAN);
			setState(1546);
			id();
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1547);
				match(DOT);
				setState(1548);
				id();
				}
				}
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 288230378299195393L) != 0)) {
				{
				{
				setState(1554);
				jsxAttribute();
				}
				}
				setState(1559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1560);
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
		enterRule(_localctx, 132, RULE_closeTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			match(LESS_THAN);
			setState(1563);
			match(DIVIDE);
			setState(1564);
			id();
			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1565);
				match(DOT);
				setState(1566);
				id();
				}
				}
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1572);
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
		enterRule(_localctx, 134, RULE_selfClosingElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			match(LESS_THAN);
			setState(1575);
			id();
			setState(1580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1576);
				match(DOT);
				setState(1577);
				id();
				}
				}
				setState(1582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 288230378299195393L) != 0)) {
				{
				{
				setState(1583);
				jsxAttribute();
				}
				}
				setState(1588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1589);
			match(DIVIDE);
			setState(1590);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TenaryExpressionContext tenaryExpression() {
			return getRuleContext(TenaryExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public JsxExpressionContext jsxExpression() {
			return getRuleContext(JsxExpressionContext.class,0);
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
		enterRule(_localctx, 136, RULE_jsxExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			match(LCURLY);
			setState(1607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(1598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(1593);
					functionCall();
					}
					break;
				case 2:
					{
					setState(1594);
					tenaryExpression();
					}
					break;
				case 3:
					{
					setState(1595);
					expression(0);
					}
					break;
				case 4:
					{
					setState(1596);
					unaryExpression();
					}
					break;
				case 5:
					{
					setState(1597);
					objectLiteral();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 562950490292225L) != 0)) {
					{
					setState(1600);
					function();
					}
				}

				}
				break;
			case 3:
				{
				setState(1603);
				spreadOperation();
				}
				break;
			case 4:
				{
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCURLY) {
					{
					setState(1604);
					jsxExpression();
					}
				}

				}
				break;
			}
			setState(1609);
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
		enterRule(_localctx, 138, RULE_normalJsxElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1611);
			openTag();
			}
			setState(1617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1615);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
					case 1:
						{
						setState(1612);
						jsx();
						}
						break;
					case 2:
						{
						setState(1613);
						jsxExpression();
						}
						break;
					case 3:
						{
						setState(1614);
						statement();
						}
						break;
					}
					} 
				}
				setState(1619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			}
			{
			setState(1620);
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
		enterRule(_localctx, 140, RULE_jsxFragment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1622);
			match(LESS_THAN);
			setState(1623);
			match(GREATER_THAN);
			}
			setState(1630);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1628);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
					case 1:
						{
						setState(1625);
						jsx();
						}
						break;
					case 2:
						{
						setState(1626);
						jsxExpression();
						}
						break;
					case 3:
						{
						setState(1627);
						statement();
						}
						break;
					}
					} 
				}
				setState(1632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
			}
			{
			setState(1633);
			match(LESS_THAN);
			setState(1634);
			match(DIVIDE);
			setState(1635);
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
		public TerminalNode HTML_ATTRIBUTE_NAME() { return getToken(ReactParser.HTML_ATTRIBUTE_NAME, 0); }
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
		enterRule(_localctx, 142, RULE_jsxAttribute);
		int _la;
		try {
			setState(1667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				_localctx = new JsxSpreadAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1637);
				match(LCURLY);
				setState(1638);
				spreadOperation();
				setState(1639);
				match(RCURLY);
				}
				}
				break;
			case EVENT_ATTRIBUTE:
				_localctx = new EventAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1641);
				match(EVENT_ATTRIBUTE);
				setState(1642);
				match(EQUAL);
				setState(1643);
				match(LCURLY);
				setState(1655);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					{
					setState(1644);
					match(LPAREN);
					setState(1645);
					match(RPAREN);
					setState(1646);
					match(ARROW);
					setState(1652);
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
					case USESTATE:
					case USEEFFECT:
					case USEREF:
					case HTML_ATTRIBUTE_NAME:
					case IDENTIFIER:
					case ONCLICK:
						{
						setState(1647);
						memberExpression();
						}
						break;
					case LCURLY:
						{
						setState(1648);
						match(LCURLY);
						setState(1649);
						memberExpression();
						setState(1650);
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
				case USESTATE:
				case USEEFFECT:
				case USEREF:
				case HTML_ATTRIBUTE_NAME:
				case IDENTIFIER:
				case ONCLICK:
					{
					{
					setState(1654);
					memberExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1657);
				match(RCURLY);
				}
				}
				break;
			case HTML_ATTRIBUTE_NAME:
				_localctx = new JsxIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1659);
				match(HTML_ATTRIBUTE_NAME);
				setState(1665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1660);
					match(EQUAL);
					setState(1663);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Integer:
					case Float:
					case String:
					case Boolean:
					case Undefined:
					case Null:
						{
						setState(1661);
						literal();
						}
						break;
					case LCURLY:
						{
						setState(1662);
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
		enterRule(_localctx, 144, RULE_spreadOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			match(DOT);
			setState(1670);
			match(DOT);
			setState(1671);
			match(DOT);
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(1672);
				id();
				}
				break;
			case 2:
				{
				setState(1673);
				literal();
				}
				break;
			case 3:
				{
				setState(1674);
				array();
				}
				break;
			case 4:
				{
				setState(1675);
				function();
				}
				break;
			case 5:
				{
				setState(1676);
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
		enterRule(_localctx, 146, RULE_useStateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			match(CONST);
			setState(1680);
			match(LSBRACKET);
			setState(1681);
			id();
			setState(1682);
			match(COMMA);
			setState(1683);
			id();
			setState(1684);
			match(RSBRACKET);
			setState(1685);
			match(EQUAL);
			setState(1686);
			match(USESTATE);
			setState(1687);
			match(LPAREN);
			setState(1692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(1688);
				id();
				}
				break;
			case 2:
				{
				setState(1689);
				literal();
				}
				break;
			case 3:
				{
				setState(1690);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(1691);
				expression(0);
				}
				break;
			}
			setState(1694);
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
		enterRule(_localctx, 148, RULE_useRefDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			match(CONST);
			setState(1697);
			id();
			setState(1698);
			match(EQUAL);
			setState(1699);
			match(USEREF);
			setState(1700);
			match(LPAREN);
			setState(1705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(1701);
				id();
				}
				break;
			case 2:
				{
				setState(1702);
				literal();
				}
				break;
			case 3:
				{
				setState(1703);
				objectLiteral();
				}
				break;
			case 4:
				{
				setState(1704);
				expression(0);
				}
				break;
			}
			setState(1707);
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
		enterRule(_localctx, 150, RULE_useEffectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			match(USEEFFECT);
			setState(1710);
			match(LPAREN);
			setState(1713);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				{
				setState(1711);
				anonymousFunctionDeclaration();
				}
				break;
			case LPAREN:
				{
				setState(1712);
				arrowFunctionDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1715);
				match(COMMA);
				setState(1716);
				dependencyArray();
				}
			}

			setState(1719);
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
		enterRule(_localctx, 152, RULE_dependencyArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1721);
			match(LSBRACKET);
			setState(1722);
			id();
			setState(1727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1723);
				match(COMMA);
				setState(1724);
				id();
				}
				}
				setState(1729);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1730);
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
		enterRule(_localctx, 154, RULE_props);
		try {
			setState(1735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1732);
				objectLiteral();
				}
				break;
			case EVENT_ATTRIBUTE:
			case USESTATE:
			case USEEFFECT:
			case USEREF:
			case HTML_ATTRIBUTE_NAME:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1733);
				id();
				}
				break;
			case Null:
				enterOuterAlt(_localctx, 3);
				{
				setState(1734);
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
		enterRule(_localctx, 156, RULE_pureReactElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			match(CREATEELEMENT);
			setState(1738);
			match(LPAREN);
			setState(1739);
			expression(0);
			setState(1740);
			match(COMMA);
			setState(1741);
			props();
			setState(1753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1742);
				match(COMMA);
				setState(1749);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Integer:
				case Float:
				case String:
				case Boolean:
				case Undefined:
				case Null:
					{
					setState(1743);
					literal();
					}
					break;
				case EVENT_ATTRIBUTE:
				case USESTATE:
				case USEEFFECT:
				case USEREF:
				case HTML_ATTRIBUTE_NAME:
				case IDENTIFIER:
					{
					setState(1744);
					id();
					}
					break;
				case LSBRACKET:
					{
					setState(1745);
					array();
					}
					break;
				case CREATEELEMENT:
					{
					setState(1746);
					pureReactElement();
					}
					break;
				case LESS_THAN:
					{
					setState(1747);
					jsx();
					}
					break;
				case DOT:
					{
					setState(1748);
					spreadOperation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1756);
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
		enterRule(_localctx, 158, RULE_component_return_statment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			match(RETURN);
			setState(1769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				{
				setState(1759);
				match(LPAREN);
				setState(1762);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS_THAN:
					{
					setState(1760);
					jsx();
					}
					break;
				case Null:
					{
					setState(1761);
					match(Null);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1764);
				match(RPAREN);
				}
				}
				break;
			case LESS_THAN:
			case Null:
				{
				setState(1767);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS_THAN:
					{
					setState(1765);
					jsx();
					}
					break;
				case Null:
					{
					setState(1766);
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
			setState(1774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1771);
					match(SEMI);
					}
					} 
				}
				setState(1776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
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
		enterRule(_localctx, 160, RULE_functionalComponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(1777);
				arrowComponentDeclaration();
				}
				break;
			case FUNCTION:
				{
				setState(1778);
				namedComponentDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1784);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1781);
					match(SEMI);
					}
					} 
				}
				setState(1786);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
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
		enterRule(_localctx, 162, RULE_arrowComponentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			match(CONST);
			setState(1788);
			id();
			setState(1789);
			match(EQUAL);
			setState(1790);
			match(LPAREN);
			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 1062858310299942913L) != 0)) {
				{
				setState(1791);
				props();
				}
			}

			setState(1794);
			match(RPAREN);
			setState(1795);
			match(ARROW);
			setState(1801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				{
				setState(1796);
				match(LCURLY);
				setState(1797);
				componentFunctionBody();
				setState(1798);
				match(RCURLY);
				}
				}
				break;
			case 2:
				{
				setState(1800);
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
		enterRule(_localctx, 164, RULE_namedComponentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			match(FUNCTION);
			setState(1804);
			id();
			setState(1805);
			match(LPAREN);
			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 1062858310299942913L) != 0)) {
				{
				setState(1806);
				props();
				}
			}

			setState(1809);
			match(RPAREN);
			setState(1810);
			match(LCURLY);
			setState(1811);
			componentFunctionBody();
			setState(1812);
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
		enterRule(_localctx, 166, RULE_componentFunctionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -520884665770577796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 65087L) != 0)) {
				{
				{
				setState(1814);
				statement();
				}
				}
				setState(1819);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1820);
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
		"\u0004\u0001O\u071f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0001\u0000\u0005\u0000"+
		"\u00aa\b\u0000\n\u0000\f\u0000\u00ad\t\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u00b1\b\u0000\n\u0000\f\u0000\u00b4\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u00b8\b\u0000\n\u0000\f\u0000\u00bb\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u00c0\b\u0000\n\u0000\f\u0000\u00c3\t\u0000"+
		"\u0001\u0000\u0005\u0000\u00c6\b\u0000\n\u0000\f\u0000\u00c9\t\u0000\u0003"+
		"\u0000\u00cb\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u00d2\b\u0002\u0001\u0002\u0003\u0002\u00d5\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00da\b\u0003\n\u0003"+
		"\f\u0003\u00dd\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0004\u0003\u00e3\b\u0003\u000b\u0003\f\u0003\u00e4\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00e9\b\u0003\u0003\u0003\u00eb\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00ef\b\u0003\u0003\u0003\u00f1\b\u0003\u0001"+
		"\u0003\u0004\u0003\u00f4\b\u0003\u000b\u0003\f\u0003\u00f5\u0003\u0003"+
		"\u00f8\b\u0003\u0001\u0003\u0003\u0003\u00fb\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u00ff\b\u0003\n\u0003\f\u0003\u0102\t\u0003\u0001\u0003"+
		"\u0003\u0003\u0105\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u010a\b\u0004\n\u0004\f\u0004\u010d\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u0113\b\u0004\u000b\u0004\f\u0004\u0114"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0119\b\u0004\u0003\u0004\u011b\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u011f\b\u0004\u0003\u0004\u0121"+
		"\b\u0004\u0001\u0004\u0004\u0004\u0124\b\u0004\u000b\u0004\f\u0004\u0125"+
		"\u0003\u0004\u0128\b\u0004\u0001\u0004\u0003\u0004\u012b\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0132"+
		"\b\u0005\u000b\u0005\f\u0005\u0133\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0138\b\u0005\u0003\u0005\u013a\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u013e\b\u0005\u0003\u0005\u0140\b\u0005\u0001\u0005\u0004\u0005"+
		"\u0143\b\u0005\u000b\u0005\f\u0005\u0144\u0003\u0005\u0147\b\u0005\u0001"+
		"\u0005\u0003\u0005\u014a\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0005"+
		"\u0006\u014f\b\u0006\n\u0006\f\u0006\u0152\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u015b\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0163\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0167\b\u0006\u0003\u0006\u0169\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u016e\b\u0007\n\u0007\f\u0007\u0171\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0177\b\u0007\u000b\u0007"+
		"\f\u0007\u0178\u0001\u0007\u0001\u0007\u0003\u0007\u017d\b\u0007\u0003"+
		"\u0007\u017f\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0183\b\u0007"+
		"\u0003\u0007\u0185\b\u0007\u0001\u0007\u0004\u0007\u0188\b\u0007\u000b"+
		"\u0007\f\u0007\u0189\u0003\u0007\u018c\b\u0007\u0001\u0007\u0003\u0007"+
		"\u018f\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0004\b"+
		"\u0196\b\b\u000b\b\f\b\u0197\u0001\b\u0001\b\u0003\b\u019c\b\b\u0003\b"+
		"\u019e\b\b\u0001\b\u0001\b\u0003\b\u01a2\b\b\u0003\b\u01a4\b\b\u0001\b"+
		"\u0004\b\u01a7\b\b\u000b\b\f\b\u01a8\u0003\b\u01ab\b\b\u0001\b\u0003\b"+
		"\u01ae\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u01b4\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u01bd\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u01c3\b\t\u0001\t\u0001\t\u0001\t\u0004\t\u01c8"+
		"\b\t\u000b\t\f\t\u01c9\u0001\t\u0001\t\u0003\t\u01ce\b\t\u0003\t\u01d0"+
		"\b\t\u0001\t\u0001\t\u0003\t\u01d4\b\t\u0003\t\u01d6\b\t\u0001\t\u0004"+
		"\t\u01d9\b\t\u000b\t\f\t\u01da\u0003\t\u01dd\b\t\u0001\t\u0003\t\u01e0"+
		"\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0004\n\u01e7\b\n\u000b\n"+
		"\f\n\u01e8\u0001\n\u0001\n\u0003\n\u01ed\b\n\u0003\n\u01ef\b\n\u0001\n"+
		"\u0001\n\u0003\n\u01f3\b\n\u0003\n\u01f5\b\n\u0001\n\u0004\n\u01f8\b\n"+
		"\u000b\n\f\n\u01f9\u0003\n\u01fc\b\n\u0001\n\u0003\n\u01ff\b\n\u0001\n"+
		"\u0003\n\u0202\b\n\u0001\n\u0001\n\u0003\n\u0206\b\n\u0001\n\u0003\n\u0209"+
		"\b\n\u0001\n\u0005\n\u020c\b\n\n\n\f\n\u020f\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0216\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u021a\b\u000b\u000b\u000b\f\u000b\u021b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0220\b\u000b\u0003\u000b\u0222\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0226\b\u000b\u0003\u000b\u0228\b"+
		"\u000b\u0001\u000b\u0004\u000b\u022b\b\u000b\u000b\u000b\f\u000b\u022c"+
		"\u0003\u000b\u022f\b\u000b\u0001\u000b\u0003\u000b\u0232\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u0239\b\f\u000b\f\f"+
		"\f\u023a\u0001\f\u0001\f\u0003\f\u023f\b\f\u0003\f\u0241\b\f\u0001\f\u0001"+
		"\f\u0003\f\u0245\b\f\u0003\f\u0247\b\f\u0001\f\u0004\f\u024a\b\f\u000b"+
		"\f\f\f\u024b\u0003\f\u024e\b\f\u0001\f\u0003\f\u0251\b\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0003\r\u0258\b\r\u0001\r\u0005\r\u025b\b\r"+
		"\n\r\f\r\u025e\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u026b\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u027b"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0281"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0287"+
		"\b\u0014\n\u0014\f\u0014\u028a\t\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0291\b\u0016\n\u0016\f\u0016\u0294"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u029a"+
		"\b\u0016\n\u0016\f\u0016\u029d\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u02a1\b\u0016\u0003\u0016\u02a3\b\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u02a7\b\u0016\u0003\u0016\u02a9\b\u0016\u0001\u0016\u0005\u0016"+
		"\u02ac\b\u0016\n\u0016\f\u0016\u02af\t\u0016\u0003\u0016\u02b1\b\u0016"+
		"\u0001\u0016\u0003\u0016\u02b4\b\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u02b8\b\u0016\n\u0016\f\u0016\u02bb\t\u0016\u0001\u0016\u0003\u0016\u02be"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u02c3\b\u0017"+
		"\n\u0017\f\u0017\u02c6\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u02cc\b\u0017\n\u0017\f\u0017\u02cf\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u02d3\b\u0017\u0003\u0017\u02d5\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u02d9\b\u0017\u0003\u0017\u02db\b\u0017"+
		"\u0001\u0017\u0005\u0017\u02de\b\u0017\n\u0017\f\u0017\u02e1\t\u0017\u0003"+
		"\u0017\u02e3\b\u0017\u0001\u0017\u0003\u0017\u02e6\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u02ed\b\u0018"+
		"\n\u0018\f\u0018\u02f0\t\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u02f4"+
		"\b\u0018\u0003\u0018\u02f6\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u02fa\b\u0018\u0003\u0018\u02fc\b\u0018\u0001\u0018\u0005\u0018\u02ff"+
		"\b\u0018\n\u0018\f\u0018\u0302\t\u0018\u0003\u0018\u0304\b\u0018\u0001"+
		"\u0018\u0003\u0018\u0307\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0005"+
		"\u0019\u030c\b\u0019\n\u0019\f\u0019\u030f\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0318\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0320\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0324\b\u0019\u0003\u0019\u0326\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u032b\b\u001a\n\u001a\f\u001a\u032e\t\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0334\b\u001a\n\u001a"+
		"\f\u001a\u0337\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u033b\b\u001a"+
		"\u0003\u001a\u033d\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0341\b"+
		"\u001a\u0003\u001a\u0343\b\u001a\u0001\u001a\u0005\u001a\u0346\b\u001a"+
		"\n\u001a\f\u001a\u0349\t\u001a\u0003\u001a\u034b\b\u001a\u0001\u001a\u0003"+
		"\u001a\u034e\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u0355\b\u001b\n\u001b\f\u001b\u0358\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u035c\b\u001b\u0003\u001b\u035e\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0362\b\u001b\u0003\u001b\u0364\b\u001b"+
		"\u0001\u001b\u0005\u001b\u0367\b\u001b\n\u001b\f\u001b\u036a\t\u001b\u0003"+
		"\u001b\u036c\b\u001b\u0001\u001b\u0003\u001b\u036f\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0375\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u037e\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0384\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u0389\b\u001c\n\u001c\f\u001c\u038c\t\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0390\b\u001c\u0003\u001c\u0392\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0396\b\u001c\u0003\u001c\u0398\b\u001c\u0001\u001c\u0005"+
		"\u001c\u039b\b\u001c\n\u001c\f\u001c\u039e\t\u001c\u0003\u001c\u03a0\b"+
		"\u001c\u0001\u001c\u0003\u001c\u03a3\b\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u03aa\b\u001d\n\u001d\f\u001d"+
		"\u03ad\t\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u03b1\b\u001d\u0003"+
		"\u001d\u03b3\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u03b7\b\u001d"+
		"\u0003\u001d\u03b9\b\u001d\u0001\u001d\u0005\u001d\u03bc\b\u001d\n\u001d"+
		"\f\u001d\u03bf\t\u001d\u0003\u001d\u03c1\b\u001d\u0001\u001d\u0003\u001d"+
		"\u03c4\b\u001d\u0001\u001d\u0003\u001d\u03c7\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u03cb\b\u001d\u0001\u001d\u0003\u001d\u03ce\b\u001d"+
		"\u0001\u001d\u0005\u001d\u03d1\b\u001d\n\u001d\f\u001d\u03d4\t\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u03db"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u03df\b\u001e\n\u001e\f\u001e"+
		"\u03e2\t\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u03e6\b\u001e\u0003"+
		"\u001e\u03e8\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u03ec\b\u001e"+
		"\u0003\u001e\u03ee\b\u001e\u0001\u001e\u0005\u001e\u03f1\b\u001e\n\u001e"+
		"\f\u001e\u03f4\t\u001e\u0003\u001e\u03f6\b\u001e\u0001\u001e\u0003\u001e"+
		"\u03f9\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0400\b\u001f\n\u001f\f\u001f\u0403\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0407\b\u001f\u0003\u001f\u0409\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u040d\b\u001f\u0003\u001f\u040f\b\u001f\u0001"+
		"\u001f\u0005\u001f\u0412\b\u001f\n\u001f\f\u001f\u0415\t\u001f\u0003\u001f"+
		"\u0417\b\u001f\u0001\u001f\u0003\u001f\u041a\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0003 \u0421\b \u0001 \u0005 \u0424\b \n "+
		"\f \u0427\t \u0001!\u0001!\u0005!\u042b\b!\n!\f!\u042e\t!\u0001!\u0001"+
		"!\u0005!\u0432\b!\n!\f!\u0435\t!\u0001!\u0001!\u0005!\u0439\b!\n!\f!\u043c"+
		"\t!\u0001!\u0001!\u0005!\u0440\b!\n!\f!\u0443\t!\u0005!\u0445\b!\n!\f"+
		"!\u0448\t!\u0001!\u0003!\u044b\b!\u0003!\u044d\b!\u0001!\u0005!\u0450"+
		"\b!\n!\f!\u0453\t!\u0001!\u0001!\u0001\"\u0001\"\u0003\"\u0459\b\"\u0001"+
		"\"\u0001\"\u0003\"\u045d\b\"\u0001#\u0001#\u0001#\u0001#\u0003#\u0463"+
		"\b#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u046d"+
		"\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u0478\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u0480\b&\n"+
		"&\f&\u0483\t&\u0001\'\u0001\'\u0001\'\u0003\'\u0488\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0496\b\'\u0003\'\u0498\b\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0005)\u04a0\b)\n)\f)\u04a3\t)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u04b0\b*\u0003"+
		"*\u04b2\b*\u0001+\u0001+\u0005+\u04b6\b+\n+\f+\u04b9\t+\u0001+\u0001+"+
		"\u0005+\u04bd\b+\n+\f+\u04c0\t+\u0001+\u0001+\u0005+\u04c4\b+\n+\f+\u04c7"+
		"\t+\u0001+\u0001+\u0005+\u04cb\b+\n+\f+\u04ce\t+\u0005+\u04d0\b+\n+\f"+
		"+\u04d3\t+\u0001+\u0003+\u04d6\b+\u0003+\u04d8\b+\u0001+\u0005+\u04db"+
		"\b+\n+\f+\u04de\t+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u04e9\b,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0003"+
		".\u04f1\b.\u0001/\u0005/\u04f4\b/\n/\f/\u04f7\t/\u0001/\u0003/\u04fa\b"+
		"/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00030\u0513\b0\u00010\u00050\u0516\b0\n0\f0\u0519"+
		"\t0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00031\u0525\b1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u0531\b1\u00031\u0533\b1\u00011\u00051\u0536\b"+
		"1\n1\f1\u0539\t1\u00012\u00032\u053c\b2\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00052\u0544\b2\n2\f2\u0547\t2\u00032\u0549\b2\u00012\u00012"+
		"\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00053\u0554\b3\n3\f"+
		"3\u0557\t3\u00033\u0559\b3\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u0566\b3\u00014\u00014\u00014\u0001"+
		"4\u00014\u00054\u056d\b4\n4\f4\u0570\t4\u00034\u0572\b4\u00014\u00014"+
		"\u00014\u00014\u00014\u00015\u00015\u00015\u00035\u057c\b5\u00016\u0003"+
		"6\u057f\b6\u00016\u00016\u00036\u0583\b6\u00016\u00016\u00016\u00016\u0005"+
		"6\u0589\b6\n6\f6\u058c\t6\u00036\u058e\b6\u00016\u00016\u00017\u00017"+
		"\u00017\u00017\u00037\u0596\b7\u00037\u0598\b7\u00018\u00018\u00038\u059c"+
		"\b8\u00018\u00038\u059f\b8\u00019\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u05a7\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u05b0"+
		"\b:\n:\f:\u05b3\t:\u0001:\u0001:\u0001:\u0003:\u05b8\b:\u0001:\u0001:"+
		"\u0003:\u05bc\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u05c3\b;\u0003"+
		";\u05c5\b;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0005=\u05da\b=\n=\f=\u05dd\t=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0005=\u05eb\b=\n=\f=\u05ee"+
		"\t=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0003=\u05fa\b=\u0001>\u0001>\u0003>\u05fe\b>\u0001?\u0001?\u0001?\u0003"+
		"?\u0603\b?\u0001@\u0001@\u0001@\u0003@\u0608\b@\u0001A\u0001A\u0001A\u0001"+
		"A\u0005A\u060e\bA\nA\fA\u0611\tA\u0001A\u0005A\u0614\bA\nA\fA\u0617\t"+
		"A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0005B\u0620\bB\nB"+
		"\fB\u0623\tB\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0005C\u062b\b"+
		"C\nC\fC\u062e\tC\u0001C\u0005C\u0631\bC\nC\fC\u0634\tC\u0001C\u0001C\u0001"+
		"C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u063f\bD\u0001D\u0003"+
		"D\u0642\bD\u0001D\u0001D\u0003D\u0646\bD\u0003D\u0648\bD\u0001D\u0001"+
		"D\u0001E\u0001E\u0001E\u0001E\u0005E\u0650\bE\nE\fE\u0653\tE\u0001E\u0001"+
		"E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0005F\u065d\bF\nF\fF\u0660"+
		"\tF\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003"+
		"G\u0675\bG\u0001G\u0003G\u0678\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0003G\u0680\bG\u0003G\u0682\bG\u0003G\u0684\bG\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u068e\bH\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0003I\u069d\bI\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0003J\u06aa\bJ\u0001J\u0001J\u0001K\u0001K\u0001"+
		"K\u0001K\u0003K\u06b2\bK\u0001K\u0001K\u0003K\u06b6\bK\u0001K\u0001K\u0001"+
		"L\u0001L\u0001L\u0001L\u0005L\u06be\bL\nL\fL\u06c1\tL\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0003M\u06c8\bM\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u06d6\bN\u0005N\u06d8"+
		"\bN\nN\fN\u06db\tN\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0003O\u06e3"+
		"\bO\u0001O\u0001O\u0001O\u0003O\u06e8\bO\u0003O\u06ea\bO\u0001O\u0005"+
		"O\u06ed\bO\nO\fO\u06f0\tO\u0001P\u0001P\u0003P\u06f4\bP\u0001P\u0005P"+
		"\u06f7\bP\nP\fP\u06fa\tP\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u0701"+
		"\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u070a\bQ\u0001"+
		"R\u0001R\u0001R\u0001R\u0003R\u0710\bR\u0001R\u0001R\u0001R\u0001R\u0001"+
		"R\u0001S\u0005S\u0718\bS\nS\fS\u071b\tS\u0001S\u0001S\u0001S\u0000\u0001"+
		"LT\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u0000\b\u0003\u0000\u0013\u0013I"+
		"JLN\u0001\u0000\t\n\u0001\u0000,-\u0001\u0000\u0016\"\u0001\u0000&+\u0001"+
		"\u0000#$\u0002\u000067;>\u0001\u0000?A\u0861\u0000\u00ab\u0001\u0000\u0000"+
		"\u0000\u0002\u00cc\u0001\u0000\u0000\u0000\u0004\u00d1\u0001\u0000\u0000"+
		"\u0000\u0006\u00d6\u0001\u0000\u0000\u0000\b\u0106\u0001\u0000\u0000\u0000"+
		"\n\u012e\u0001\u0000\u0000\u0000\f\u0150\u0001\u0000\u0000\u0000\u000e"+
		"\u016a\u0001\u0000\u0000\u0000\u0010\u0192\u0001\u0000\u0000\u0000\u0012"+
		"\u01b8\u0001\u0000\u0000\u0000\u0014\u01e3\u0001\u0000\u0000\u0000\u0016"+
		"\u0210\u0001\u0000\u0000\u0000\u0018\u0235\u0001\u0000\u0000\u0000\u001a"+
		"\u0254\u0001\u0000\u0000\u0000\u001c\u026a\u0001\u0000\u0000\u0000\u001e"+
		"\u026c\u0001\u0000\u0000\u0000 \u026e\u0001\u0000\u0000\u0000\"\u0270"+
		"\u0001\u0000\u0000\u0000$\u027a\u0001\u0000\u0000\u0000&\u027c\u0001\u0000"+
		"\u0000\u0000(\u0282\u0001\u0000\u0000\u0000*\u028b\u0001\u0000\u0000\u0000"+
		",\u028d\u0001\u0000\u0000\u0000.\u02bf\u0001\u0000\u0000\u00000\u02e9"+
		"\u0001\u0000\u0000\u00002\u030d\u0001\u0000\u0000\u00004\u0327\u0001\u0000"+
		"\u0000\u00006\u0351\u0001\u0000\u0000\u00008\u0379\u0001\u0000\u0000\u0000"+
		":\u03a6\u0001\u0000\u0000\u0000<\u03d5\u0001\u0000\u0000\u0000>\u03fc"+
		"\u0001\u0000\u0000\u0000@\u0420\u0001\u0000\u0000\u0000B\u0428\u0001\u0000"+
		"\u0000\u0000D\u0458\u0001\u0000\u0000\u0000F\u0462\u0001\u0000\u0000\u0000"+
		"H\u0464\u0001\u0000\u0000\u0000J\u046c\u0001\u0000\u0000\u0000L\u0477"+
		"\u0001\u0000\u0000\u0000N\u0497\u0001\u0000\u0000\u0000P\u0499\u0001\u0000"+
		"\u0000\u0000R\u049b\u0001\u0000\u0000\u0000T\u04a4\u0001\u0000\u0000\u0000"+
		"V\u04b3\u0001\u0000\u0000\u0000X\u04e8\u0001\u0000\u0000\u0000Z\u04ea"+
		"\u0001\u0000\u0000\u0000\\\u04f0\u0001\u0000\u0000\u0000^\u04f5\u0001"+
		"\u0000\u0000\u0000`\u0512\u0001\u0000\u0000\u0000b\u051a\u0001\u0000\u0000"+
		"\u0000d\u053b\u0001\u0000\u0000\u0000f\u054f\u0001\u0000\u0000\u0000h"+
		"\u0567\u0001\u0000\u0000\u0000j\u057b\u0001\u0000\u0000\u0000l\u057e\u0001"+
		"\u0000\u0000\u0000n\u0591\u0001\u0000\u0000\u0000p\u059b\u0001\u0000\u0000"+
		"\u0000r\u05a0\u0001\u0000\u0000\u0000t\u05bb\u0001\u0000\u0000\u0000v"+
		"\u05bd\u0001\u0000\u0000\u0000x\u05c9\u0001\u0000\u0000\u0000z\u05f9\u0001"+
		"\u0000\u0000\u0000|\u05fd\u0001\u0000\u0000\u0000~\u05ff\u0001\u0000\u0000"+
		"\u0000\u0080\u0607\u0001\u0000\u0000\u0000\u0082\u0609\u0001\u0000\u0000"+
		"\u0000\u0084\u061a\u0001\u0000\u0000\u0000\u0086\u0626\u0001\u0000\u0000"+
		"\u0000\u0088\u0638\u0001\u0000\u0000\u0000\u008a\u064b\u0001\u0000\u0000"+
		"\u0000\u008c\u0656\u0001\u0000\u0000\u0000\u008e\u0683\u0001\u0000\u0000"+
		"\u0000\u0090\u0685\u0001\u0000\u0000\u0000\u0092\u068f\u0001\u0000\u0000"+
		"\u0000\u0094\u06a0\u0001\u0000\u0000\u0000\u0096\u06ad\u0001\u0000\u0000"+
		"\u0000\u0098\u06b9\u0001\u0000\u0000\u0000\u009a\u06c7\u0001\u0000\u0000"+
		"\u0000\u009c\u06c9\u0001\u0000\u0000\u0000\u009e\u06de\u0001\u0000\u0000"+
		"\u0000\u00a0\u06f3\u0001\u0000\u0000\u0000\u00a2\u06fb\u0001\u0000\u0000"+
		"\u0000\u00a4\u070b\u0001\u0000\u0000\u0000\u00a6\u0719\u0001\u0000\u0000"+
		"\u0000\u00a8\u00aa\u0003`0\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ca\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b2\u0003\u00a0P\u0000\u00af\u00b1"+
		"\u0003`0\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b9\u0003r9\u0000\u00b6\u00b8\u00055\u0000\u0000"+
		"\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u00cb\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005F\u0000\u0000\u00bd\u00c1\u0003\u00a0P\u0000\u00be\u00c0"+
		"\u0003`0\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c7\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c6\u00055\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ca\u00bc\u0001\u0000\u0000\u0000\u00cb\u0001\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0007\u0000\u0000\u0000\u00cd\u0003\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d2\u0003\u0092I\u0000\u00cf\u00d2\u0003\u0096K\u0000\u00d0"+
		"\u00d2\u0003\u0094J\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d1\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d5\u00055\u0000\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u0005\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005\u0002\u0000\u0000\u00d7\u00db\u0005"+
		".\u0000\u0000\u00d8\u00da\u0005%\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0003(\u0014\u0000"+
		"\u00df\u00e0\u0005/\u0000\u0000\u00e0\u00f7\u00052\u0000\u0000\u00e1\u00e3"+
		"\u0003\u0004\u0002\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e5\u00ea\u0001\u0000\u0000\u0000\u00e6\u00e8"+
		"\u0007\u0001\u0000\u0000\u00e7\u00e9\u00055\u0000\u0000\u00e8\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e6\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00f8\u0001\u0000\u0000\u0000\u00ec\u00ee\u0007"+
		"\u0001\u0000\u0000\u00ed\u00ef\u00055\u0000\u0000\u00ee\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ec\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f4\u0003\u0004"+
		"\u0002\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00e2\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f0\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fb\u0003b1\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fc\u0100\u00053\u0000\u0000\u00fd\u00ff\u0003.\u0017\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0104"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0105"+
		"\u00030\u0018\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\u0007\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		"\u0003\u0000\u0000\u0107\u010b\u0005.\u0000\u0000\u0108\u010a\u0005%\u0000"+
		"\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000"+
		"\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0003(\u0014\u0000\u010f\u0110\u0005/\u0000\u0000\u0110"+
		"\u0127\u00052\u0000\u0000\u0111\u0113\u0003\u0004\u0002\u0000\u0112\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0112"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u011a"+
		"\u0001\u0000\u0000\u0000\u0116\u0118\u0007\u0001\u0000\u0000\u0117\u0119"+
		"\u00055\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0116\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0128\u0001"+
		"\u0000\u0000\u0000\u011c\u011e\u0007\u0001\u0000\u0000\u011d\u011f\u0005"+
		"5\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000"+
		"\u0000\u0000\u0122\u0124\u0003\u0004\u0002\u0000\u0123\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000"+
		"\u0000\u0000\u0127\u0112\u0001\u0000\u0000\u0000\u0127\u0120\u0001\u0000"+
		"\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u012b\u0003b1\u0000"+
		"\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u00053\u0000\u0000\u012d"+
		"\t\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u0004\u0000\u0000\u012f\u0146"+
		"\u00052\u0000\u0000\u0130\u0132\u0003\u0004\u0002\u0000\u0131\u0130\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0131\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0139\u0001"+
		"\u0000\u0000\u0000\u0135\u0137\u0007\u0001\u0000\u0000\u0136\u0138\u0005"+
		"5\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0135\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u0147\u0001\u0000"+
		"\u0000\u0000\u013b\u013d\u0007\u0001\u0000\u0000\u013c\u013e\u00055\u0000"+
		"\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"+
		"\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u013b\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0142\u0001\u0000\u0000"+
		"\u0000\u0141\u0143\u0003\u0004\u0002\u0000\u0142\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000"+
		"\u0000\u0146\u0131\u0001\u0000\u0000\u0000\u0146\u013f\u0001\u0000\u0000"+
		"\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u014a\u0003b1\u0000\u0149"+
		"\u0148\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u00053\u0000\u0000\u014c\u000b"+
		"\u0001\u0000\u0000\u0000\u014d\u014f\u0005%\u0000\u0000\u014e\u014d\u0001"+
		"\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0153\u0001"+
		"\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0154\u0003"+
		"(\u0014\u0000\u0154\u015a\u0005:\u0000\u0000\u0155\u0156\u0005.\u0000"+
		"\u0000\u0156\u0157\u0003\u0004\u0002\u0000\u0157\u0158\u0005/\u0000\u0000"+
		"\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u015b\u0003\u0004\u0002\u0000"+
		"\u015a\u0155\u0001\u0000\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u0168\u00059\u0000\u0000\u015d"+
		"\u015e\u0005.\u0000\u0000\u015e\u0163\u0003\u0004\u0002\u0000\u015f\u0160"+
		"\u00032\u0019\u0000\u0160\u0161\u0005/\u0000\u0000\u0161\u0163\u0001\u0000"+
		"\u0000\u0000\u0162\u015d\u0001\u0000\u0000\u0000\u0162\u015f\u0001\u0000"+
		"\u0000\u0000\u0163\u0169\u0001\u0000\u0000\u0000\u0164\u0167\u0003\u0004"+
		"\u0002\u0000\u0165\u0167\u00032\u0019\u0000\u0166\u0164\u0001\u0000\u0000"+
		"\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000"+
		"\u0000\u0168\u0162\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000"+
		"\u0000\u0169\r\u0001\u0000\u0000\u0000\u016a\u016b\u0005\u0006\u0000\u0000"+
		"\u016b\u016f\u0005.\u0000\u0000\u016c\u016e\u0005%\u0000\u0000\u016d\u016c"+
		"\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0172"+
		"\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0003(\u0014\u0000\u0173\u0174\u0005/\u0000\u0000\u0174\u018b\u00052"+
		"\u0000\u0000\u0175\u0177\u0003\u0004\u0002\u0000\u0176\u0175\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017e\u0001\u0000"+
		"\u0000\u0000\u017a\u017c\u0007\u0001\u0000\u0000\u017b\u017d\u00055\u0000"+
		"\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000"+
		"\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u017a\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u018c\u0001\u0000\u0000"+
		"\u0000\u0180\u0182\u0007\u0001\u0000\u0000\u0181\u0183\u00055\u0000\u0000"+
		"\u0182\u0181\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000"+
		"\u0183\u0185\u0001\u0000\u0000\u0000\u0184\u0180\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0001\u0000\u0000\u0000"+
		"\u0186\u0188\u0003\u0004\u0002\u0000\u0187\u0186\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c\u0001\u0000\u0000\u0000"+
		"\u018b\u0176\u0001\u0000\u0000\u0000\u018b\u0184\u0001\u0000\u0000\u0000"+
		"\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u018f\u0003b1\u0000\u018e\u018d"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0001\u0000\u0000\u0000\u0190\u0191\u00053\u0000\u0000\u0191\u000f\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0005\f\u0000\u0000\u0193\u01aa\u00052"+
		"\u0000\u0000\u0194\u0196\u0003\u0004\u0002\u0000\u0195\u0194\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000"+
		"\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019d\u0001\u0000"+
		"\u0000\u0000\u0199\u019b\u0007\u0001\u0000\u0000\u019a\u019c\u00055\u0000"+
		"\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000"+
		"\u0000\u019c\u019e\u0001\u0000\u0000\u0000\u019d\u0199\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01ab\u0001\u0000\u0000"+
		"\u0000\u019f\u01a1\u0007\u0001\u0000\u0000\u01a0\u01a2\u00055\u0000\u0000"+
		"\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u019f\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a7\u0003\u0004\u0002\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000"+
		"\u01aa\u0195\u0001\u0000\u0000\u0000\u01aa\u01a3\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u01ae\u0003b1\u0000\u01ad\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u00053\u0000\u0000\u01b0\u01b1\u0005"+
		"\u0006\u0000\u0000\u01b1\u01b3\u0005.\u0000\u0000\u01b2\u01b4\u0005%\u0000"+
		"\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u0003(\u0014\u0000"+
		"\u01b6\u01b7\u0005/\u0000\u0000\u01b7\u0011\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0005\u0005\u0000\u0000\u01b9\u01bc\u0005.\u0000\u0000\u01ba\u01bd"+
		"\u0003R)\u0000\u01bb\u01bd\u0003T*\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u00055\u0000\u0000"+
		"\u01bf\u01c0\u0003(\u0014\u0000\u01c0\u01c2\u00055\u0000\u0000\u01c1\u01c3"+
		"\u0003L&\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005/\u0000"+
		"\u0000\u01c5\u01dc\u00052\u0000\u0000\u01c6\u01c8\u0003\u0004\u0002\u0000"+
		"\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cf\u0001\u0000\u0000\u0000\u01cb\u01cd\u0007\u0001\u0000\u0000"+
		"\u01cc\u01ce\u00055\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cd"+
		"\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0"+
		"\u01dd\u0001\u0000\u0000\u0000\u01d1\u01d3\u0007\u0001\u0000\u0000\u01d2"+
		"\u01d4\u00055\u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d9\u0003\u0004\u0002\u0000\u01d8\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01d8"+
		"\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dd"+
		"\u0001\u0000\u0000\u0000\u01dc\u01c7\u0001\u0000\u0000\u0000\u01dc\u01d5"+
		"\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000\u0000\u01de\u01e0"+
		"\u0003b1\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u00053\u0000"+
		"\u0000\u01e2\u0013\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\r\u0000\u0000"+
		"\u01e4\u01fb\u00052\u0000\u0000\u01e5\u01e7\u0003\u0004\u0002\u0000\u01e6"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ea\u01ec\u0007\u0001\u0000\u0000\u01eb"+
		"\u01ed\u00055\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ec\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ef\u0001\u0000\u0000\u0000\u01ee\u01ea"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01fc"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f2\u0007\u0001\u0000\u0000\u01f1\u01f3"+
		"\u00055\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f5\u0001\u0000\u0000\u0000\u01f4\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f8\u0003\u0004\u0002\u0000\u01f7\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fb\u01e6\u0001\u0000\u0000\u0000\u01fb\u01f4\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fe\u0001\u0000\u0000\u0000\u01fd\u01ff\u0003"+
		"@ \u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000"+
		"\u0000\u01ff\u0201\u0001\u0000\u0000\u0000\u0200\u0202\u0003b1\u0000\u0201"+
		"\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0001\u0000\u0000\u0000\u0203\u0205\u00053\u0000\u0000\u0204\u0206"+
		"\u0003<\u001e\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001"+
		"\u0000\u0000\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u0209\u0003"+
		">\u001f\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000"+
		"\u0000\u0000\u0209\u020d\u0001\u0000\u0000\u0000\u020a\u020c\u00055\u0000"+
		"\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020c\u020f\u0001\u0000\u0000"+
		"\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000"+
		"\u0000\u020e\u0015\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000"+
		"\u0000\u0210\u0215\u0005\u000e\u0000\u0000\u0211\u0212\u0005.\u0000\u0000"+
		"\u0212\u0213\u0003\u0002\u0001\u0000\u0213\u0214\u0005/\u0000\u0000\u0214"+
		"\u0216\u0001\u0000\u0000\u0000\u0215\u0211\u0001\u0000\u0000\u0000\u0215"+
		"\u0216\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217"+
		"\u022e\u00052\u0000\u0000\u0218\u021a\u0003\u0004\u0002\u0000\u0219\u0218"+
		"\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u0219"+
		"\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u0221"+
		"\u0001\u0000\u0000\u0000\u021d\u021f\u0007\u0001\u0000\u0000\u021e\u0220"+
		"\u00055\u0000\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u021f\u0220\u0001"+
		"\u0000\u0000\u0000\u0220\u0222\u0001\u0000\u0000\u0000\u0221\u021d\u0001"+
		"\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u022f\u0001"+
		"\u0000\u0000\u0000\u0223\u0225\u0007\u0001\u0000\u0000\u0224\u0226\u0005"+
		"5\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000"+
		"\u0000\u0000\u0226\u0228\u0001\u0000\u0000\u0000\u0227\u0223\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u022a\u0001\u0000"+
		"\u0000\u0000\u0229\u022b\u0003\u0004\u0002\u0000\u022a\u0229\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000"+
		"\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022f\u0001\u0000"+
		"\u0000\u0000\u022e\u0219\u0001\u0000\u0000\u0000\u022e\u0227\u0001\u0000"+
		"\u0000\u0000\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u0232\u0003b1\u0000"+
		"\u0231\u0230\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u00053\u0000\u0000\u0234"+
		"\u0017\u0001\u0000\u0000\u0000\u0235\u0236\u0005\u000f\u0000\u0000\u0236"+
		"\u024d\u00052\u0000\u0000\u0237\u0239\u0003\u0004\u0002\u0000\u0238\u0237"+
		"\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u0238"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u0240"+
		"\u0001\u0000\u0000\u0000\u023c\u023e\u0007\u0001\u0000\u0000\u023d\u023f"+
		"\u00055\u0000\u0000\u023e\u023d\u0001\u0000\u0000\u0000\u023e\u023f\u0001"+
		"\u0000\u0000\u0000\u023f\u0241\u0001\u0000\u0000\u0000\u0240\u023c\u0001"+
		"\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u024e\u0001"+
		"\u0000\u0000\u0000\u0242\u0244\u0007\u0001\u0000\u0000\u0243\u0245\u0005"+
		"5\u0000\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000"+
		"\u0000\u0000\u0245\u0247\u0001\u0000\u0000\u0000\u0246\u0242\u0001\u0000"+
		"\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0249\u0001\u0000"+
		"\u0000\u0000\u0248\u024a\u0003\u0004\u0002\u0000\u0249\u0248\u0001\u0000"+
		"\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u0249\u0001\u0000"+
		"\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024e\u0001\u0000"+
		"\u0000\u0000\u024d\u0238\u0001\u0000\u0000\u0000\u024d\u0246\u0001\u0000"+
		"\u0000\u0000\u024e\u0250\u0001\u0000\u0000\u0000\u024f\u0251\u0003b1\u0000"+
		"\u0250\u024f\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000"+
		"\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0253\u00053\u0000\u0000\u0253"+
		"\u0019\u0001\u0000\u0000\u0000\u0254\u0257\u0005\u0010\u0000\u0000\u0255"+
		"\u0258\u0003Z-\u0000\u0256\u0258\u0003\u0004\u0002\u0000\u0257\u0255\u0001"+
		"\u0000\u0000\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0258\u025c\u0001"+
		"\u0000\u0000\u0000\u0259\u025b\u00055\u0000\u0000\u025a\u0259\u0001\u0000"+
		"\u0000\u0000\u025b\u025e\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000"+
		"\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u001b\u0001\u0000"+
		"\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025f\u026b\u0003\u0006"+
		"\u0003\u0000\u0260\u026b\u0003\b\u0004\u0000\u0261\u026b\u0003\n\u0005"+
		"\u0000\u0262\u026b\u0003\f\u0006\u0000\u0263\u026b\u0003\u000e\u0007\u0000"+
		"\u0264\u026b\u0003\u0010\b\u0000\u0265\u026b\u0003\u0012\t\u0000\u0266"+
		"\u026b\u0003\u0014\n\u0000\u0267\u026b\u0003\u0016\u000b\u0000\u0268\u026b"+
		"\u0003\u0018\f\u0000\u0269\u026b\u0003\u001a\r\u0000\u026a\u025f\u0001"+
		"\u0000\u0000\u0000\u026a\u0260\u0001\u0000\u0000\u0000\u026a\u0261\u0001"+
		"\u0000\u0000\u0000\u026a\u0262\u0001\u0000\u0000\u0000\u026a\u0263\u0001"+
		"\u0000\u0000\u0000\u026a\u0264\u0001\u0000\u0000\u0000\u026a\u0265\u0001"+
		"\u0000\u0000\u0000\u026a\u0266\u0001\u0000\u0000\u0000\u026a\u0267\u0001"+
		"\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026a\u0269\u0001"+
		"\u0000\u0000\u0000\u026b\u001d\u0001\u0000\u0000\u0000\u026c\u026d\u0007"+
		"\u0002\u0000\u0000\u026d\u001f\u0001\u0000\u0000\u0000\u026e\u026f\u0007"+
		"\u0003\u0000\u0000\u026f!\u0001\u0000\u0000\u0000\u0270\u0271\u0007\u0004"+
		"\u0000\u0000\u0271#\u0001\u0000\u0000\u0000\u0272\u027b\u0003\u0080@\u0000"+
		"\u0273\u027b\u0003H$\u0000\u0274\u027b\u0003B!\u0000\u0275\u027b\u0003"+
		"\u0002\u0001\u0000\u0276\u027b\u0003\u009cN\u0000\u0277\u027b\u0003V+"+
		"\u0000\u0278\u027b\u0003l6\u0000\u0279\u027b\u0003L&\u0000\u027a\u0272"+
		"\u0001\u0000\u0000\u0000\u027a\u0273\u0001\u0000\u0000\u0000\u027a\u0274"+
		"\u0001\u0000\u0000\u0000\u027a\u0275\u0001\u0000\u0000\u0000\u027a\u0276"+
		"\u0001\u0000\u0000\u0000\u027a\u0277\u0001\u0000\u0000\u0000\u027a\u0278"+
		"\u0001\u0000\u0000\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027b%\u0001"+
		"\u0000\u0000\u0000\u027c\u0280\u0003$\u0012\u0000\u027d\u027e\u0003\""+
		"\u0011\u0000\u027e\u027f\u0003$\u0012\u0000\u027f\u0281\u0001\u0000\u0000"+
		"\u0000\u0280\u027d\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000"+
		"\u0000\u0281\'\u0001\u0000\u0000\u0000\u0282\u0288\u0003&\u0013\u0000"+
		"\u0283\u0284\u0003*\u0015\u0000\u0284\u0285\u0003&\u0013\u0000\u0285\u0287"+
		"\u0001\u0000\u0000\u0000\u0286\u0283\u0001\u0000\u0000\u0000\u0287\u028a"+
		"\u0001\u0000\u0000\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0288\u0289"+
		"\u0001\u0000\u0000\u0000\u0289)\u0001\u0000\u0000\u0000\u028a\u0288\u0001"+
		"\u0000\u0000\u0000\u028b\u028c\u0007\u0005\u0000\u0000\u028c+\u0001\u0000"+
		"\u0000\u0000\u028d\u028e\u0005\u0002\u0000\u0000\u028e\u0292\u0005.\u0000"+
		"\u0000\u028f\u0291\u0005%\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000"+
		"\u0291\u0294\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000"+
		"\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0295\u0001\u0000\u0000\u0000"+
		"\u0294\u0292\u0001\u0000\u0000\u0000\u0295\u0296\u0003(\u0014\u0000\u0296"+
		"\u0297\u0005/\u0000\u0000\u0297\u02b0\u00052\u0000\u0000\u0298\u029a\u0003"+
		"`0\u0000\u0299\u0298\u0001\u0000\u0000\u0000\u029a\u029d\u0001\u0000\u0000"+
		"\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000"+
		"\u0000\u029c\u02a2\u0001\u0000\u0000\u0000\u029d\u029b\u0001\u0000\u0000"+
		"\u0000\u029e\u02a0\u0007\u0001\u0000\u0000\u029f\u02a1\u00055\u0000\u0000"+
		"\u02a0\u029f\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a3\u0001\u0000\u0000\u0000\u02a2\u029e\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02b1\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a6\u0007\u0001\u0000\u0000\u02a5\u02a7\u00055\u0000\u0000\u02a6"+
		"\u02a5\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a9\u0001\u0000\u0000\u0000\u02a8\u02a4\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a9\u0001\u0000\u0000\u0000\u02a9\u02ad\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ac\u0003`0\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ac\u02af\u0001"+
		"\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001"+
		"\u0000\u0000\u0000\u02ae\u02b1\u0001\u0000\u0000\u0000\u02af\u02ad\u0001"+
		"\u0000\u0000\u0000\u02b0\u029b\u0001\u0000\u0000\u0000\u02b0\u02a8\u0001"+
		"\u0000\u0000\u0000\u02b1\u02b3\u0001\u0000\u0000\u0000\u02b2\u02b4\u0003"+
		"b1\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b9\u00053\u0000\u0000"+
		"\u02b6\u02b8\u0003.\u0017\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b8"+
		"\u02bb\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02b9"+
		"\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bd\u0001\u0000\u0000\u0000\u02bb"+
		"\u02b9\u0001\u0000\u0000\u0000\u02bc\u02be\u00030\u0018\u0000\u02bd\u02bc"+
		"\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be-\u0001"+
		"\u0000\u0000\u0000\u02bf\u02c0\u0005\u0003\u0000\u0000\u02c0\u02c4\u0005"+
		".\u0000\u0000\u02c1\u02c3\u0005%\u0000\u0000\u02c2\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c6\u0001\u0000\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c7\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c7\u02c8\u0003(\u0014\u0000"+
		"\u02c8\u02c9\u0005/\u0000\u0000\u02c9\u02e2\u00052\u0000\u0000\u02ca\u02cc"+
		"\u0003`0\u0000\u02cb\u02ca\u0001\u0000\u0000\u0000\u02cc\u02cf\u0001\u0000"+
		"\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000"+
		"\u0000\u0000\u02ce\u02d4\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001\u0000"+
		"\u0000\u0000\u02d0\u02d2\u0007\u0001\u0000\u0000\u02d1\u02d3\u00055\u0000"+
		"\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000\u02d4\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02e3\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d8\u0007\u0001\u0000\u0000\u02d7\u02d9\u00055\u0000\u0000"+
		"\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000"+
		"\u02d9\u02db\u0001\u0000\u0000\u0000\u02da\u02d6\u0001\u0000\u0000\u0000"+
		"\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02df\u0001\u0000\u0000\u0000"+
		"\u02dc\u02de\u0003`0\u0000\u02dd\u02dc\u0001\u0000\u0000\u0000\u02de\u02e1"+
		"\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000\u0000\u0000\u02df\u02e0"+
		"\u0001\u0000\u0000\u0000\u02e0\u02e3\u0001\u0000\u0000\u0000\u02e1\u02df"+
		"\u0001\u0000\u0000\u0000\u02e2\u02cd\u0001\u0000\u0000\u0000\u02e2\u02da"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e5\u0001\u0000\u0000\u0000\u02e4\u02e6"+
		"\u0003b1\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000"+
		"\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e8\u00053\u0000"+
		"\u0000\u02e8/\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005\u0004\u0000\u0000"+
		"\u02ea\u0303\u00052\u0000\u0000\u02eb\u02ed\u0003`0\u0000\u02ec\u02eb"+
		"\u0001\u0000\u0000\u0000\u02ed\u02f0\u0001\u0000\u0000\u0000\u02ee\u02ec"+
		"\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f5"+
		"\u0001\u0000\u0000\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f1\u02f3"+
		"\u0007\u0001\u0000\u0000\u02f2\u02f4\u00055\u0000\u0000\u02f3\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f1\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f6\u0304\u0001\u0000\u0000\u0000\u02f7\u02f9\u0007"+
		"\u0001\u0000\u0000\u02f8\u02fa\u00055\u0000\u0000\u02f9\u02f8\u0001\u0000"+
		"\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fb\u02f7\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fc\u0300\u0001\u0000\u0000\u0000\u02fd\u02ff\u0003`0\u0000"+
		"\u02fe\u02fd\u0001\u0000\u0000\u0000\u02ff\u0302\u0001\u0000\u0000\u0000"+
		"\u0300\u02fe\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000"+
		"\u0301\u0304\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000"+
		"\u0303\u02ee\u0001\u0000\u0000\u0000\u0303\u02fb\u0001\u0000\u0000\u0000"+
		"\u0304\u0306\u0001\u0000\u0000\u0000\u0305\u0307\u0003b1\u0000\u0306\u0305"+
		"\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0308"+
		"\u0001\u0000\u0000\u0000\u0308\u0309\u00053\u0000\u0000\u03091\u0001\u0000"+
		"\u0000\u0000\u030a\u030c\u0005%\u0000\u0000\u030b\u030a\u0001\u0000\u0000"+
		"\u0000\u030c\u030f\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000\u0000"+
		"\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u0310\u0001\u0000\u0000"+
		"\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u0310\u0311\u0003(\u0014\u0000"+
		"\u0311\u0317\u0005:\u0000\u0000\u0312\u0313\u0005.\u0000\u0000\u0313\u0314"+
		"\u0003`0\u0000\u0314\u0315\u0005/\u0000\u0000\u0315\u0318\u0001\u0000"+
		"\u0000\u0000\u0316\u0318\u0003`0\u0000\u0317\u0312\u0001\u0000\u0000\u0000"+
		"\u0317\u0316\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000"+
		"\u0319\u0325\u00059\u0000\u0000\u031a\u031b\u0005.\u0000\u0000\u031b\u0320"+
		"\u0003`0\u0000\u031c\u031d\u00032\u0019\u0000\u031d\u031e\u0005/\u0000"+
		"\u0000\u031e\u0320\u0001\u0000\u0000\u0000\u031f\u031a\u0001\u0000\u0000"+
		"\u0000\u031f\u031c\u0001\u0000\u0000\u0000\u0320\u0326\u0001\u0000\u0000"+
		"\u0000\u0321\u0324\u0003`0\u0000\u0322\u0324\u00032\u0019\u0000\u0323"+
		"\u0321\u0001\u0000\u0000\u0000\u0323\u0322\u0001\u0000\u0000\u0000\u0324"+
		"\u0326\u0001\u0000\u0000\u0000\u0325\u031f\u0001\u0000\u0000\u0000\u0325"+
		"\u0323\u0001\u0000\u0000\u0000\u03263\u0001\u0000\u0000\u0000\u0327\u0328"+
		"\u0005\u0006\u0000\u0000\u0328\u032c\u0005.\u0000\u0000\u0329\u032b\u0005"+
		"%\u0000\u0000\u032a\u0329\u0001\u0000\u0000\u0000\u032b\u032e\u0001\u0000"+
		"\u0000\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000"+
		"\u0000\u0000\u032d\u032f\u0001\u0000\u0000\u0000\u032e\u032c\u0001\u0000"+
		"\u0000\u0000\u032f\u0330\u0003(\u0014\u0000\u0330\u0331\u0005/\u0000\u0000"+
		"\u0331\u034a\u00052\u0000\u0000\u0332\u0334\u0003`0\u0000\u0333\u0332"+
		"\u0001\u0000\u0000\u0000\u0334\u0337\u0001\u0000\u0000\u0000\u0335\u0333"+
		"\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u033c"+
		"\u0001\u0000\u0000\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0338\u033a"+
		"\u0007\u0001\u0000\u0000\u0339\u033b\u00055\u0000\u0000\u033a\u0339\u0001"+
		"\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u033d\u0001"+
		"\u0000\u0000\u0000\u033c\u0338\u0001\u0000\u0000\u0000\u033c\u033d\u0001"+
		"\u0000\u0000\u0000\u033d\u034b\u0001\u0000\u0000\u0000\u033e\u0340\u0007"+
		"\u0001\u0000\u0000\u033f\u0341\u00055\u0000\u0000\u0340\u033f\u0001\u0000"+
		"\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0343\u0001\u0000"+
		"\u0000\u0000\u0342\u033e\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000"+
		"\u0000\u0000\u0343\u0347\u0001\u0000\u0000\u0000\u0344\u0346\u0003`0\u0000"+
		"\u0345\u0344\u0001\u0000\u0000\u0000\u0346\u0349\u0001\u0000\u0000\u0000"+
		"\u0347\u0345\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000\u0000"+
		"\u0348\u034b\u0001\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000"+
		"\u034a\u0335\u0001\u0000\u0000\u0000\u034a\u0342\u0001\u0000\u0000\u0000"+
		"\u034b\u034d\u0001\u0000\u0000\u0000\u034c\u034e\u0003b1\u0000\u034d\u034c"+
		"\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u034f"+
		"\u0001\u0000\u0000\u0000\u034f\u0350\u00053\u0000\u0000\u03505\u0001\u0000"+
		"\u0000\u0000\u0351\u0352\u0005\f\u0000\u0000\u0352\u036b\u00052\u0000"+
		"\u0000\u0353\u0355\u0003`0\u0000\u0354\u0353\u0001\u0000\u0000\u0000\u0355"+
		"\u0358\u0001\u0000\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0356"+
		"\u0357\u0001\u0000\u0000\u0000\u0357\u035d\u0001\u0000\u0000\u0000\u0358"+
		"\u0356\u0001\u0000\u0000\u0000\u0359\u035b\u0007\u0001\u0000\u0000\u035a"+
		"\u035c\u00055\u0000\u0000\u035b\u035a\u0001\u0000\u0000\u0000\u035b\u035c"+
		"\u0001\u0000\u0000\u0000\u035c\u035e\u0001\u0000\u0000\u0000\u035d\u0359"+
		"\u0001\u0000\u0000\u0000\u035d\u035e\u0001\u0000\u0000\u0000\u035e\u036c"+
		"\u0001\u0000\u0000\u0000\u035f\u0361\u0007\u0001\u0000\u0000\u0360\u0362"+
		"\u00055\u0000\u0000\u0361\u0360\u0001\u0000\u0000\u0000\u0361\u0362\u0001"+
		"\u0000\u0000\u0000\u0362\u0364\u0001\u0000\u0000\u0000\u0363\u035f\u0001"+
		"\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000\u0000\u0364\u0368\u0001"+
		"\u0000\u0000\u0000\u0365\u0367\u0003`0\u0000\u0366\u0365\u0001\u0000\u0000"+
		"\u0000\u0367\u036a\u0001\u0000\u0000\u0000\u0368\u0366\u0001\u0000\u0000"+
		"\u0000\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u036c\u0001\u0000\u0000"+
		"\u0000\u036a\u0368\u0001\u0000\u0000\u0000\u036b\u0356\u0001\u0000\u0000"+
		"\u0000\u036b\u0363\u0001\u0000\u0000\u0000\u036c\u036e\u0001\u0000\u0000"+
		"\u0000\u036d\u036f\u0003b1\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036e"+
		"\u036f\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000\u0370"+
		"\u0371\u00053\u0000\u0000\u0371\u0372\u0005\u0006\u0000\u0000\u0372\u0374"+
		"\u0005.\u0000\u0000\u0373\u0375\u0005%\u0000\u0000\u0374\u0373\u0001\u0000"+
		"\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000"+
		"\u0000\u0000\u0376\u0377\u0003(\u0014\u0000\u0377\u0378\u0005/\u0000\u0000"+
		"\u03787\u0001\u0000\u0000\u0000\u0379\u037a\u0005\u0005\u0000\u0000\u037a"+
		"\u037d\u0005.\u0000\u0000\u037b\u037e\u0003R)\u0000\u037c\u037e\u0003"+
		"T*\u0000\u037d\u037b\u0001\u0000\u0000\u0000\u037d\u037c\u0001\u0000\u0000"+
		"\u0000\u037d\u037e\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000"+
		"\u0000\u037f\u0380\u00055\u0000\u0000\u0380\u0381\u0003(\u0014\u0000\u0381"+
		"\u0383\u00055\u0000\u0000\u0382\u0384\u0003L&\u0000\u0383\u0382\u0001"+
		"\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0385\u0001"+
		"\u0000\u0000\u0000\u0385\u0386\u0005/\u0000\u0000\u0386\u039f\u00052\u0000"+
		"\u0000\u0387\u0389\u0003`0\u0000\u0388\u0387\u0001\u0000\u0000\u0000\u0389"+
		"\u038c\u0001\u0000\u0000\u0000\u038a\u0388\u0001\u0000\u0000\u0000\u038a"+
		"\u038b\u0001\u0000\u0000\u0000\u038b\u0391\u0001\u0000\u0000\u0000\u038c"+
		"\u038a\u0001\u0000\u0000\u0000\u038d\u038f\u0007\u0001\u0000\u0000\u038e"+
		"\u0390\u00055\u0000\u0000\u038f\u038e\u0001\u0000\u0000\u0000\u038f\u0390"+
		"\u0001\u0000\u0000\u0000\u0390\u0392\u0001\u0000\u0000\u0000\u0391\u038d"+
		"\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392\u03a0"+
		"\u0001\u0000\u0000\u0000\u0393\u0395\u0007\u0001\u0000\u0000\u0394\u0396"+
		"\u00055\u0000\u0000\u0395\u0394\u0001\u0000\u0000\u0000\u0395\u0396\u0001"+
		"\u0000\u0000\u0000\u0396\u0398\u0001\u0000\u0000\u0000\u0397\u0393\u0001"+
		"\u0000\u0000\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398\u039c\u0001"+
		"\u0000\u0000\u0000\u0399\u039b\u0003`0\u0000\u039a\u0399\u0001\u0000\u0000"+
		"\u0000\u039b\u039e\u0001\u0000\u0000\u0000\u039c\u039a\u0001\u0000\u0000"+
		"\u0000\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u03a0\u0001\u0000\u0000"+
		"\u0000\u039e\u039c\u0001\u0000\u0000\u0000\u039f\u038a\u0001\u0000\u0000"+
		"\u0000\u039f\u0397\u0001\u0000\u0000\u0000\u03a0\u03a2\u0001\u0000\u0000"+
		"\u0000\u03a1\u03a3\u0003b1\u0000\u03a2\u03a1\u0001\u0000\u0000\u0000\u03a2"+
		"\u03a3\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a5\u00053\u0000\u0000\u03a59\u0001\u0000\u0000\u0000\u03a6\u03a7\u0005"+
		"\r\u0000\u0000\u03a7\u03c0\u00052\u0000\u0000\u03a8\u03aa\u0003`0\u0000"+
		"\u03a9\u03a8\u0001\u0000\u0000\u0000\u03aa\u03ad\u0001\u0000\u0000\u0000"+
		"\u03ab\u03a9\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000"+
		"\u03ac\u03b2\u0001\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000"+
		"\u03ae\u03b0\u0007\u0001\u0000\u0000\u03af\u03b1\u00055\u0000\u0000\u03b0"+
		"\u03af\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1"+
		"\u03b3\u0001\u0000\u0000\u0000\u03b2\u03ae\u0001\u0000\u0000\u0000\u03b2"+
		"\u03b3\u0001\u0000\u0000\u0000\u03b3\u03c1\u0001\u0000\u0000\u0000\u03b4"+
		"\u03b6\u0007\u0001\u0000\u0000\u03b5\u03b7\u00055\u0000\u0000\u03b6\u03b5"+
		"\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b9"+
		"\u0001\u0000\u0000\u0000\u03b8\u03b4\u0001\u0000\u0000\u0000\u03b8\u03b9"+
		"\u0001\u0000\u0000\u0000\u03b9\u03bd\u0001\u0000\u0000\u0000\u03ba\u03bc"+
		"\u0003`0\u0000\u03bb\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bf\u0001\u0000"+
		"\u0000\u0000\u03bd\u03bb\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000"+
		"\u0000\u0000\u03be\u03c1\u0001\u0000\u0000\u0000\u03bf\u03bd\u0001\u0000"+
		"\u0000\u0000\u03c0\u03ab\u0001\u0000\u0000\u0000\u03c0\u03b8\u0001\u0000"+
		"\u0000\u0000\u03c1\u03c3\u0001\u0000\u0000\u0000\u03c2\u03c4\u0003@ \u0000"+
		"\u03c3\u03c2\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000\u0000"+
		"\u03c4\u03c6\u0001\u0000\u0000\u0000\u03c5\u03c7\u0003b1\u0000\u03c6\u03c5"+
		"\u0001\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c8"+
		"\u0001\u0000\u0000\u0000\u03c8\u03ca\u00053\u0000\u0000\u03c9\u03cb\u0003"+
		"<\u001e\u0000\u03ca\u03c9\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000"+
		"\u0000\u0000\u03cb\u03cd\u0001\u0000\u0000\u0000\u03cc\u03ce\u0003>\u001f"+
		"\u0000\u03cd\u03cc\u0001\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000"+
		"\u0000\u03ce\u03d2\u0001\u0000\u0000\u0000\u03cf\u03d1\u00055\u0000\u0000"+
		"\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d4\u0001\u0000\u0000\u0000"+
		"\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000"+
		"\u03d3;\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d5"+
		"\u03da\u0005\u000e\u0000\u0000\u03d6\u03d7\u0005.\u0000\u0000\u03d7\u03d8"+
		"\u0003\u0002\u0001\u0000\u03d8\u03d9\u0005/\u0000\u0000\u03d9\u03db\u0001"+
		"\u0000\u0000\u0000\u03da\u03d6\u0001\u0000\u0000\u0000\u03da\u03db\u0001"+
		"\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03f5\u0005"+
		"2\u0000\u0000\u03dd\u03df\u0003`0\u0000\u03de\u03dd\u0001\u0000\u0000"+
		"\u0000\u03df\u03e2\u0001\u0000\u0000\u0000\u03e0\u03de\u0001\u0000\u0000"+
		"\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u03e7\u0001\u0000\u0000"+
		"\u0000\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e3\u03e5\u0007\u0001\u0000"+
		"\u0000\u03e4\u03e6\u00055\u0000\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6\u03e8\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e3\u0001\u0000\u0000\u0000\u03e7\u03e8\u0001\u0000\u0000\u0000"+
		"\u03e8\u03f6\u0001\u0000\u0000\u0000\u03e9\u03eb\u0007\u0001\u0000\u0000"+
		"\u03ea\u03ec\u00055\u0000\u0000\u03eb\u03ea\u0001\u0000\u0000\u0000\u03eb"+
		"\u03ec\u0001\u0000\u0000\u0000\u03ec\u03ee\u0001\u0000\u0000\u0000\u03ed"+
		"\u03e9\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee"+
		"\u03f2\u0001\u0000\u0000\u0000\u03ef\u03f1\u0003`0\u0000\u03f0\u03ef\u0001"+
		"\u0000\u0000\u0000\u03f1\u03f4\u0001\u0000\u0000\u0000\u03f2\u03f0\u0001"+
		"\u0000\u0000\u0000\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f6\u0001"+
		"\u0000\u0000\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f5\u03e0\u0001"+
		"\u0000\u0000\u0000\u03f5\u03ed\u0001\u0000\u0000\u0000\u03f6\u03f8\u0001"+
		"\u0000\u0000\u0000\u03f7\u03f9\u0003b1\u0000\u03f8\u03f7\u0001\u0000\u0000"+
		"\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000"+
		"\u0000\u03fa\u03fb\u00053\u0000\u0000\u03fb=\u0001\u0000\u0000\u0000\u03fc"+
		"\u03fd\u0005\u000f\u0000\u0000\u03fd\u0416\u00052\u0000\u0000\u03fe\u0400"+
		"\u0003`0\u0000\u03ff\u03fe\u0001\u0000\u0000\u0000\u0400\u0403\u0001\u0000"+
		"\u0000\u0000\u0401\u03ff\u0001\u0000\u0000\u0000\u0401\u0402\u0001\u0000"+
		"\u0000\u0000\u0402\u0408\u0001\u0000\u0000\u0000\u0403\u0401\u0001\u0000"+
		"\u0000\u0000\u0404\u0406\u0007\u0001\u0000\u0000\u0405\u0407\u00055\u0000"+
		"\u0000\u0406\u0405\u0001\u0000\u0000\u0000\u0406\u0407\u0001\u0000\u0000"+
		"\u0000\u0407\u0409\u0001\u0000\u0000\u0000\u0408\u0404\u0001\u0000\u0000"+
		"\u0000\u0408\u0409\u0001\u0000\u0000\u0000\u0409\u0417\u0001\u0000\u0000"+
		"\u0000\u040a\u040c\u0007\u0001\u0000\u0000\u040b\u040d\u00055\u0000\u0000"+
		"\u040c\u040b\u0001\u0000\u0000\u0000\u040c\u040d\u0001\u0000\u0000\u0000"+
		"\u040d\u040f\u0001\u0000\u0000\u0000\u040e\u040a\u0001\u0000\u0000\u0000"+
		"\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u0413\u0001\u0000\u0000\u0000"+
		"\u0410\u0412\u0003`0\u0000\u0411\u0410\u0001\u0000\u0000\u0000\u0412\u0415"+
		"\u0001\u0000\u0000\u0000\u0413\u0411\u0001\u0000\u0000\u0000\u0413\u0414"+
		"\u0001\u0000\u0000\u0000\u0414\u0417\u0001\u0000\u0000\u0000\u0415\u0413"+
		"\u0001\u0000\u0000\u0000\u0416\u0401\u0001\u0000\u0000\u0000\u0416\u040e"+
		"\u0001\u0000\u0000\u0000\u0417\u0419\u0001\u0000\u0000\u0000\u0418\u041a"+
		"\u0003b1\u0000\u0419\u0418\u0001\u0000\u0000\u0000\u0419\u041a\u0001\u0000"+
		"\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b\u041c\u00053\u0000"+
		"\u0000\u041c?\u0001\u0000\u0000\u0000\u041d\u041e\u0005\u0010\u0000\u0000"+
		"\u041e\u0421\u0003Z-\u0000\u041f\u0421\u0003`0\u0000\u0420\u041d\u0001"+
		"\u0000\u0000\u0000\u0420\u041f\u0001\u0000\u0000\u0000\u0421\u0425\u0001"+
		"\u0000\u0000\u0000\u0422\u0424\u00055\u0000\u0000\u0423\u0422\u0001\u0000"+
		"\u0000\u0000\u0424\u0427\u0001\u0000\u0000\u0000\u0425\u0423\u0001\u0000"+
		"\u0000\u0000\u0425\u0426\u0001\u0000\u0000\u0000\u0426A\u0001\u0000\u0000"+
		"\u0000\u0427\u0425\u0001\u0000\u0000\u0000\u0428\u042c\u00052\u0000\u0000"+
		"\u0429\u042b\u0003\u001e\u000f\u0000\u042a\u0429\u0001\u0000\u0000\u0000"+
		"\u042b\u042e\u0001\u0000\u0000\u0000\u042c\u042a\u0001\u0000\u0000\u0000"+
		"\u042c\u042d\u0001\u0000\u0000\u0000\u042d\u044c\u0001\u0000\u0000\u0000"+
		"\u042e\u042c\u0001\u0000\u0000\u0000\u042f\u0433\u0003D\"\u0000\u0430"+
		"\u0432\u0003\u001e\u000f\u0000\u0431\u0430\u0001\u0000\u0000\u0000\u0432"+
		"\u0435\u0001\u0000\u0000\u0000\u0433\u0431\u0001\u0000\u0000\u0000\u0433"+
		"\u0434\u0001\u0000\u0000\u0000\u0434\u0446\u0001\u0000\u0000\u0000\u0435"+
		"\u0433\u0001\u0000\u0000\u0000\u0436\u043a\u00054\u0000\u0000\u0437\u0439"+
		"\u0003\u001e\u000f\u0000\u0438\u0437\u0001\u0000\u0000\u0000\u0439\u043c"+
		"\u0001\u0000\u0000\u0000\u043a\u0438\u0001\u0000\u0000\u0000\u043a\u043b"+
		"\u0001\u0000\u0000\u0000\u043b\u043d\u0001\u0000\u0000\u0000\u043c\u043a"+
		"\u0001\u0000\u0000\u0000\u043d\u0441\u0003D\"\u0000\u043e\u0440\u0003"+
		"\u001e\u000f\u0000\u043f\u043e\u0001\u0000\u0000\u0000\u0440\u0443\u0001"+
		"\u0000\u0000\u0000\u0441\u043f\u0001\u0000\u0000\u0000\u0441\u0442\u0001"+
		"\u0000\u0000\u0000\u0442\u0445\u0001\u0000\u0000\u0000\u0443\u0441\u0001"+
		"\u0000\u0000\u0000\u0444\u0436\u0001\u0000\u0000\u0000\u0445\u0448\u0001"+
		"\u0000\u0000\u0000\u0446\u0444\u0001\u0000\u0000\u0000\u0446\u0447\u0001"+
		"\u0000\u0000\u0000\u0447\u044a\u0001\u0000\u0000\u0000\u0448\u0446\u0001"+
		"\u0000\u0000\u0000\u0449\u044b\u00054\u0000\u0000\u044a\u0449\u0001\u0000"+
		"\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u044d\u0001\u0000"+
		"\u0000\u0000\u044c\u042f\u0001\u0000\u0000\u0000\u044c\u044d\u0001\u0000"+
		"\u0000\u0000\u044d\u0451\u0001\u0000\u0000\u0000\u044e\u0450\u0003\u001e"+
		"\u000f\u0000\u044f\u044e\u0001\u0000\u0000\u0000\u0450\u0453\u0001\u0000"+
		"\u0000\u0000\u0451\u044f\u0001\u0000\u0000\u0000\u0451\u0452\u0001\u0000"+
		"\u0000\u0000\u0452\u0454\u0001\u0000\u0000\u0000\u0453\u0451\u0001\u0000"+
		"\u0000\u0000\u0454\u0455\u00053\u0000\u0000\u0455C\u0001\u0000\u0000\u0000"+
		"\u0456\u0459\u0003\u0002\u0001\u0000\u0457\u0459\u0005O\u0000\u0000\u0458"+
		"\u0456\u0001\u0000\u0000\u0000\u0458\u0457\u0001\u0000\u0000\u0000\u0459"+
		"\u045c\u0001\u0000\u0000\u0000\u045a\u045b\u00059\u0000\u0000\u045b\u045d"+
		"\u0003F#\u0000\u045c\u045a\u0001\u0000\u0000\u0000\u045c\u045d\u0001\u0000"+
		"\u0000\u0000\u045dE\u0001\u0000\u0000\u0000\u045e\u0463\u0003L&\u0000"+
		"\u045f\u0463\u0003V+\u0000\u0460\u0463\u0003B!\u0000\u0461\u0463\u0003"+
		"f3\u0000\u0462\u045e\u0001\u0000\u0000\u0000\u0462\u045f\u0001\u0000\u0000"+
		"\u0000\u0462\u0460\u0001\u0000\u0000\u0000\u0462\u0461\u0001\u0000\u0000"+
		"\u0000\u0463G\u0001\u0000\u0000\u0000\u0464\u0465\u0007\u0006\u0000\u0000"+
		"\u0465I\u0001\u0000\u0000\u0000\u0466\u046d\u0003H$\u0000\u0467\u046d"+
		"\u0003\u0002\u0001\u0000\u0468\u046d\u0003L&\u0000\u0469\u046a\u0003 "+
		"\u0010\u0000\u046a\u046b\u0003J%\u0000\u046b\u046d\u0001\u0000\u0000\u0000"+
		"\u046c\u0466\u0001\u0000\u0000\u0000\u046c\u0467\u0001\u0000\u0000\u0000"+
		"\u046c\u0468\u0001\u0000\u0000\u0000\u046c\u0469\u0001\u0000\u0000\u0000"+
		"\u046dK\u0001\u0000\u0000\u0000\u046e\u046f\u0006&\uffff\uffff\u0000\u046f"+
		"\u0478\u0003N\'\u0000\u0470\u0478\u0003H$\u0000\u0471\u0478\u0003\u0002"+
		"\u0001\u0000\u0472\u0478\u0003\u0080@\u0000\u0473\u0474\u0005.\u0000\u0000"+
		"\u0474\u0475\u0003L&\u0000\u0475\u0476\u0005/\u0000\u0000\u0476\u0478"+
		"\u0001\u0000\u0000\u0000\u0477\u046e\u0001\u0000\u0000\u0000\u0477\u0470"+
		"\u0001\u0000\u0000\u0000\u0477\u0471\u0001\u0000\u0000\u0000\u0477\u0472"+
		"\u0001\u0000\u0000\u0000\u0477\u0473\u0001\u0000\u0000\u0000\u0478\u0481"+
		"\u0001\u0000\u0000\u0000\u0479\u047a\n\u0002\u0000\u0000\u047a\u047b\u0003"+
		" \u0010\u0000\u047b\u047c\u0003L&\u0003\u047c\u0480\u0001\u0000\u0000"+
		"\u0000\u047d\u047e\n\u0001\u0000\u0000\u047e\u0480\u0003 \u0010\u0000"+
		"\u047f\u0479\u0001\u0000\u0000\u0000\u047f\u047d\u0001\u0000\u0000\u0000"+
		"\u0480\u0483\u0001\u0000\u0000\u0000\u0481\u047f\u0001\u0000\u0000\u0000"+
		"\u0481\u0482\u0001\u0000\u0000\u0000\u0482M\u0001\u0000\u0000\u0000\u0483"+
		"\u0481\u0001\u0000\u0000\u0000\u0484\u0488\u0003\u0002\u0001\u0000\u0485"+
		"\u0488\u0003V+\u0000\u0486\u0488\u0003l6\u0000\u0487\u0484\u0001\u0000"+
		"\u0000\u0000\u0487\u0485\u0001\u0000\u0000\u0000\u0487\u0486\u0001\u0000"+
		"\u0000\u0000\u0488\u0489\u0001\u0000\u0000\u0000\u0489\u048a\u00058\u0000"+
		"\u0000\u048a\u048b\u0003N\'\u0000\u048b\u0498\u0001\u0000\u0000\u0000"+
		"\u048c\u048d\u0003\u0002\u0001\u0000\u048d\u048e\u00050\u0000\u0000\u048e"+
		"\u048f\u0003N\'\u0000\u048f\u0490\u00051\u0000\u0000\u0490\u0498\u0001"+
		"\u0000\u0000\u0000\u0491\u0496\u0003l6\u0000\u0492\u0496\u0003V+\u0000"+
		"\u0493\u0496\u0003H$\u0000\u0494\u0496\u0003\u0002\u0001\u0000\u0495\u0491"+
		"\u0001\u0000\u0000\u0000\u0495\u0492\u0001\u0000\u0000\u0000\u0495\u0493"+
		"\u0001\u0000\u0000\u0000\u0495\u0494\u0001\u0000\u0000\u0000\u0496\u0498"+
		"\u0001\u0000\u0000\u0000\u0497\u0487\u0001\u0000\u0000\u0000\u0497\u048c"+
		"\u0001\u0000\u0000\u0000\u0497\u0495\u0001\u0000\u0000\u0000\u0498O\u0001"+
		"\u0000\u0000\u0000\u0499\u049a\u0007\u0007\u0000\u0000\u049aQ\u0001\u0000"+
		"\u0000\u0000\u049b\u049c\u0003P(\u0000\u049c\u04a1\u0003T*\u0000\u049d"+
		"\u049e\u00054\u0000\u0000\u049e\u04a0\u0003T*\u0000\u049f\u049d\u0001"+
		"\u0000\u0000\u0000\u04a0\u04a3\u0001\u0000\u0000\u0000\u04a1\u049f\u0001"+
		"\u0000\u0000\u0000\u04a1\u04a2\u0001\u0000\u0000\u0000\u04a2S\u0001\u0000"+
		"\u0000\u0000\u04a3\u04a1\u0001\u0000\u0000\u0000\u04a4\u04b1\u0003\u0002"+
		"\u0001\u0000\u04a5\u04af\u0005\u0016\u0000\u0000\u04a6\u04b0\u0003H$\u0000"+
		"\u04a7\u04b0\u0003B!\u0000\u04a8\u04b0\u0003V+\u0000\u04a9\u04b0\u0003"+
		"Z-\u0000\u04aa\u04b0\u0003L&\u0000\u04ab\u04b0\u0003\u0002\u0001\u0000"+
		"\u04ac\u04b0\u0003N\'\u0000\u04ad\u04b0\u0003h4\u0000\u04ae\u04b0\u0003"+
		"f3\u0000\u04af\u04a6\u0001\u0000\u0000\u0000\u04af\u04a7\u0001\u0000\u0000"+
		"\u0000\u04af\u04a8\u0001\u0000\u0000\u0000\u04af\u04a9\u0001\u0000\u0000"+
		"\u0000\u04af\u04aa\u0001\u0000\u0000\u0000\u04af\u04ab\u0001\u0000\u0000"+
		"\u0000\u04af\u04ac\u0001\u0000\u0000\u0000\u04af\u04ad\u0001\u0000\u0000"+
		"\u0000\u04af\u04ae\u0001\u0000\u0000\u0000\u04b0\u04b2\u0001\u0000\u0000"+
		"\u0000\u04b1\u04a5\u0001\u0000\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000"+
		"\u0000\u04b2U\u0001\u0000\u0000\u0000\u04b3\u04b7\u00050\u0000\u0000\u04b4"+
		"\u04b6\u0003\u001e\u000f\u0000\u04b5\u04b4\u0001\u0000\u0000\u0000\u04b6"+
		"\u04b9\u0001\u0000\u0000\u0000\u04b7\u04b5\u0001\u0000\u0000\u0000\u04b7"+
		"\u04b8\u0001\u0000\u0000\u0000\u04b8\u04d7\u0001\u0000\u0000\u0000\u04b9"+
		"\u04b7\u0001\u0000\u0000\u0000\u04ba\u04be\u0003X,\u0000\u04bb\u04bd\u0003"+
		"\u001e\u000f\u0000\u04bc\u04bb\u0001\u0000\u0000\u0000\u04bd\u04c0\u0001"+
		"\u0000\u0000\u0000\u04be\u04bc\u0001\u0000\u0000\u0000\u04be\u04bf\u0001"+
		"\u0000\u0000\u0000\u04bf\u04d1\u0001\u0000\u0000\u0000\u04c0\u04be\u0001"+
		"\u0000\u0000\u0000\u04c1\u04c5\u00054\u0000\u0000\u04c2\u04c4\u0003\u001e"+
		"\u000f\u0000\u04c3\u04c2\u0001\u0000\u0000\u0000\u04c4\u04c7\u0001\u0000"+
		"\u0000\u0000\u04c5\u04c3\u0001\u0000\u0000\u0000\u04c5\u04c6\u0001\u0000"+
		"\u0000\u0000\u04c6\u04c8\u0001\u0000\u0000\u0000\u04c7\u04c5\u0001\u0000"+
		"\u0000\u0000\u04c8\u04cc\u0003X,\u0000\u04c9\u04cb\u0003\u001e\u000f\u0000"+
		"\u04ca\u04c9\u0001\u0000\u0000\u0000\u04cb\u04ce\u0001\u0000\u0000\u0000"+
		"\u04cc\u04ca\u0001\u0000\u0000\u0000\u04cc\u04cd\u0001\u0000\u0000\u0000"+
		"\u04cd\u04d0\u0001\u0000\u0000\u0000\u04ce\u04cc\u0001\u0000\u0000\u0000"+
		"\u04cf\u04c1\u0001\u0000\u0000\u0000\u04d0\u04d3\u0001\u0000\u0000\u0000"+
		"\u04d1\u04cf\u0001\u0000\u0000\u0000\u04d1\u04d2\u0001\u0000\u0000\u0000"+
		"\u04d2\u04d5\u0001\u0000\u0000\u0000\u04d3\u04d1\u0001\u0000\u0000\u0000"+
		"\u04d4\u04d6\u00054\u0000\u0000\u04d5\u04d4\u0001\u0000\u0000\u0000\u04d5"+
		"\u04d6\u0001\u0000\u0000\u0000\u04d6\u04d8\u0001\u0000\u0000\u0000\u04d7"+
		"\u04ba\u0001\u0000\u0000\u0000\u04d7\u04d8\u0001\u0000\u0000\u0000\u04d8"+
		"\u04dc\u0001\u0000\u0000\u0000\u04d9\u04db\u0003\u001e\u000f\u0000\u04da"+
		"\u04d9\u0001\u0000\u0000\u0000\u04db\u04de\u0001\u0000\u0000\u0000\u04dc"+
		"\u04da\u0001\u0000\u0000\u0000\u04dc\u04dd\u0001\u0000\u0000\u0000\u04dd"+
		"\u04df\u0001\u0000\u0000\u0000\u04de\u04dc\u0001\u0000\u0000\u0000\u04df"+
		"\u04e0\u00051\u0000\u0000\u04e0W\u0001\u0000\u0000\u0000\u04e1\u04e9\u0003"+
		"\u0002\u0001\u0000\u04e2\u04e9\u0003H$\u0000\u04e3\u04e9\u0003B!\u0000"+
		"\u04e4\u04e9\u0003\u009cN\u0000\u04e5\u04e9\u0003\u0080@\u0000\u04e6\u04e9"+
		"\u0003j5\u0000\u04e7\u04e9\u0003V+\u0000\u04e8\u04e1\u0001\u0000\u0000"+
		"\u0000\u04e8\u04e2\u0001\u0000\u0000\u0000\u04e8\u04e3\u0001\u0000\u0000"+
		"\u0000\u04e8\u04e4\u0001\u0000\u0000\u0000\u04e8\u04e5\u0001\u0000\u0000"+
		"\u0000\u04e8\u04e6\u0001\u0000\u0000\u0000\u04e8\u04e7\u0001\u0000\u0000"+
		"\u0000\u04e9Y\u0001\u0000\u0000\u0000\u04ea\u04eb\u0005\u0014\u0000\u0000"+
		"\u04eb\u04ec\u0003l6\u0000\u04ec[\u0001\u0000\u0000\u0000\u04ed\u04f1"+
		"\u0003B!\u0000\u04ee\u04f1\u0003j5\u0000\u04ef\u04f1\u0003`0\u0000\u04f0"+
		"\u04ed\u0001\u0000\u0000\u0000\u04f0\u04ee\u0001\u0000\u0000\u0000\u04f0"+
		"\u04ef\u0001\u0000\u0000\u0000\u04f1]\u0001\u0000\u0000\u0000\u04f2\u04f4"+
		"\u0003`0\u0000\u04f3\u04f2\u0001\u0000\u0000\u0000\u04f4\u04f7\u0001\u0000"+
		"\u0000\u0000\u04f5\u04f3\u0001\u0000\u0000\u0000\u04f5\u04f6\u0001\u0000"+
		"\u0000\u0000\u04f6\u04f9\u0001\u0000\u0000\u0000\u04f7\u04f5\u0001\u0000"+
		"\u0000\u0000\u04f8\u04fa\u0003b1\u0000\u04f9\u04f8\u0001\u0000\u0000\u0000"+
		"\u04f9\u04fa\u0001\u0000\u0000\u0000\u04fa_\u0001\u0000\u0000\u0000\u04fb"+
		"\u0513\u0003\u001c\u000e\u0000\u04fc\u0513\u0003,\u0016\u0000\u04fd\u0513"+
		"\u0003R)\u0000\u04fe\u0513\u00032\u0019\u0000\u04ff\u0513\u0003d2\u0000"+
		"\u0500\u0513\u0003l6\u0000\u0501\u0513\u0003\u0096K\u0000\u0502\u0513"+
		"\u0003\u0092I\u0000\u0503\u0513\u0003\u0094J\u0000\u0504\u0513\u0003\u009c"+
		"N\u0000\u0505\u0513\u0003\u0088D\u0000\u0506\u0513\u00034\u001a\u0000"+
		"\u0507\u0513\u00036\u001b\u0000\u0508\u0513\u00038\u001c\u0000\u0509\u0513"+
		"\u0003L&\u0000\u050a\u0513\u0003J%\u0000\u050b\u0513\u0003:\u001d\u0000"+
		"\u050c\u0513\u0003T*\u0000\u050d\u0513\u0003(\u0014\u0000\u050e\u0513"+
		"\u0003\u001e\u000f\u0000\u050f\u0513\u0003|>\u0000\u0510\u0513\u0003j"+
		"5\u0000\u0511\u0513\u0003p8\u0000\u0512\u04fb\u0001\u0000\u0000\u0000"+
		"\u0512\u04fc\u0001\u0000\u0000\u0000\u0512\u04fd\u0001\u0000\u0000\u0000"+
		"\u0512\u04fe\u0001\u0000\u0000\u0000\u0512\u04ff\u0001\u0000\u0000\u0000"+
		"\u0512\u0500\u0001\u0000\u0000\u0000\u0512\u0501\u0001\u0000\u0000\u0000"+
		"\u0512\u0502\u0001\u0000\u0000\u0000\u0512\u0503\u0001\u0000\u0000\u0000"+
		"\u0512\u0504\u0001\u0000\u0000\u0000\u0512\u0505\u0001\u0000\u0000\u0000"+
		"\u0512\u0506\u0001\u0000\u0000\u0000\u0512\u0507\u0001\u0000\u0000\u0000"+
		"\u0512\u0508\u0001\u0000\u0000\u0000\u0512\u0509\u0001\u0000\u0000\u0000"+
		"\u0512\u050a\u0001\u0000\u0000\u0000\u0512\u050b\u0001\u0000\u0000\u0000"+
		"\u0512\u050c\u0001\u0000\u0000\u0000\u0512\u050d\u0001\u0000\u0000\u0000"+
		"\u0512\u050e\u0001\u0000\u0000\u0000\u0512\u050f\u0001\u0000\u0000\u0000"+
		"\u0512\u0510\u0001\u0000\u0000\u0000\u0512\u0511\u0001\u0000\u0000\u0000"+
		"\u0513\u0517\u0001\u0000\u0000\u0000\u0514\u0516\u00055\u0000\u0000\u0515"+
		"\u0514\u0001\u0000\u0000\u0000\u0516\u0519\u0001\u0000\u0000\u0000\u0517"+
		"\u0515\u0001\u0000\u0000\u0000\u0517\u0518\u0001\u0000\u0000\u0000\u0518"+
		"a\u0001\u0000\u0000\u0000\u0519\u0517\u0001\u0000\u0000\u0000\u051a\u0532"+
		"\u0005\u0012\u0000\u0000\u051b\u0524\u0005.\u0000\u0000\u051c\u0525\u0003"+
		"\u0080@\u0000\u051d\u0525\u0003L&\u0000\u051e\u0525\u0003H$\u0000\u051f"+
		"\u0525\u0003B!\u0000\u0520\u0525\u0003J%\u0000\u0521\u0525\u0003\u0002"+
		"\u0001\u0000\u0522\u0525\u0003\u009cN\u0000\u0523\u0525\u0003V+\u0000"+
		"\u0524\u051c\u0001\u0000\u0000\u0000\u0524\u051d\u0001\u0000\u0000\u0000"+
		"\u0524\u051e\u0001\u0000\u0000\u0000\u0524\u051f\u0001\u0000\u0000\u0000"+
		"\u0524\u0520\u0001\u0000\u0000\u0000\u0524\u0521\u0001\u0000\u0000\u0000"+
		"\u0524\u0522\u0001\u0000\u0000\u0000\u0524\u0523\u0001\u0000\u0000\u0000"+
		"\u0525\u0526\u0001\u0000\u0000\u0000\u0526\u0527\u0005/\u0000\u0000\u0527"+
		"\u0533\u0001\u0000\u0000\u0000\u0528\u0531\u0003\u0080@\u0000\u0529\u0531"+
		"\u0003L&\u0000\u052a\u0531\u0003H$\u0000\u052b\u0531\u0003B!\u0000\u052c"+
		"\u0531\u0003\u0002\u0001\u0000\u052d\u0531\u0003J%\u0000\u052e\u0531\u0003"+
		"\u009cN\u0000\u052f\u0531\u0003V+\u0000\u0530\u0528\u0001\u0000\u0000"+
		"\u0000\u0530\u0529\u0001\u0000\u0000\u0000\u0530\u052a\u0001\u0000\u0000"+
		"\u0000\u0530\u052b\u0001\u0000\u0000\u0000\u0530\u052c\u0001\u0000\u0000"+
		"\u0000\u0530\u052d\u0001\u0000\u0000\u0000\u0530\u052e\u0001\u0000\u0000"+
		"\u0000\u0530\u052f\u0001\u0000\u0000\u0000\u0531\u0533\u0001\u0000\u0000"+
		"\u0000\u0532\u051b\u0001\u0000\u0000\u0000\u0532\u0530\u0001\u0000\u0000"+
		"\u0000\u0532\u0533\u0001\u0000\u0000\u0000\u0533\u0537\u0001\u0000\u0000"+
		"\u0000\u0534\u0536\u00055\u0000\u0000\u0535\u0534\u0001\u0000\u0000\u0000"+
		"\u0536\u0539\u0001\u0000\u0000\u0000\u0537\u0535\u0001\u0000\u0000\u0000"+
		"\u0537\u0538\u0001\u0000\u0000\u0000\u0538c\u0001\u0000\u0000\u0000\u0539"+
		"\u0537\u0001\u0000\u0000\u0000\u053a\u053c\u0005B\u0000\u0000\u053b\u053a"+
		"\u0001\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000\u0000\u053c\u053d"+
		"\u0001\u0000\u0000\u0000\u053d\u053e\u0005\u0011\u0000\u0000\u053e\u053f"+
		"\u0003\u0002\u0001\u0000\u053f\u0548\u0005.\u0000\u0000\u0540\u0545\u0003"+
		"\\.\u0000\u0541\u0542\u00054\u0000\u0000\u0542\u0544\u0003\\.\u0000\u0543"+
		"\u0541\u0001\u0000\u0000\u0000\u0544\u0547\u0001\u0000\u0000\u0000\u0545"+
		"\u0543\u0001\u0000\u0000\u0000\u0545\u0546\u0001\u0000\u0000\u0000\u0546"+
		"\u0549\u0001\u0000\u0000\u0000\u0547\u0545\u0001\u0000\u0000\u0000\u0548"+
		"\u0540\u0001\u0000\u0000\u0000\u0548\u0549\u0001\u0000\u0000\u0000\u0549"+
		"\u054a\u0001\u0000\u0000\u0000\u054a\u054b\u0005/\u0000\u0000\u054b\u054c"+
		"\u00052\u0000\u0000\u054c\u054d\u0003^/\u0000\u054d\u054e\u00053\u0000"+
		"\u0000\u054ee\u0001\u0000\u0000\u0000\u054f\u0558\u0005.\u0000\u0000\u0550"+
		"\u0555\u0003\\.\u0000\u0551\u0552\u00054\u0000\u0000\u0552\u0554\u0003"+
		"\\.\u0000\u0553\u0551\u0001\u0000\u0000\u0000\u0554\u0557\u0001\u0000"+
		"\u0000\u0000\u0555\u0553\u0001\u0000\u0000\u0000\u0555\u0556\u0001\u0000"+
		"\u0000\u0000\u0556\u0559\u0001\u0000\u0000\u0000\u0557\u0555\u0001\u0000"+
		"\u0000\u0000\u0558\u0550\u0001\u0000\u0000\u0000\u0558\u0559\u0001\u0000"+
		"\u0000\u0000\u0559\u055a\u0001\u0000\u0000\u0000\u055a\u055b\u0005/\u0000"+
		"\u0000\u055b\u0565\u0005\u0015\u0000\u0000\u055c\u055d\u00052\u0000\u0000"+
		"\u055d\u055e\u0003^/\u0000\u055e\u055f\u00053\u0000\u0000\u055f\u0566"+
		"\u0001\u0000\u0000\u0000\u0560\u0561\u0005.\u0000\u0000\u0561\u0562\u0003"+
		"^/\u0000\u0562\u0563\u0005/\u0000\u0000\u0563\u0566\u0001\u0000\u0000"+
		"\u0000\u0564\u0566\u0003^/\u0000\u0565\u055c\u0001\u0000\u0000\u0000\u0565"+
		"\u0560\u0001\u0000\u0000\u0000\u0565\u0564\u0001\u0000\u0000\u0000\u0566"+
		"g\u0001\u0000\u0000\u0000\u0567\u0568\u0005\u0011\u0000\u0000\u0568\u0571"+
		"\u0005.\u0000\u0000\u0569\u056e\u0003\\.\u0000\u056a\u056b\u00054\u0000"+
		"\u0000\u056b\u056d\u0003\\.\u0000\u056c\u056a\u0001\u0000\u0000\u0000"+
		"\u056d\u0570\u0001\u0000\u0000\u0000\u056e\u056c\u0001\u0000\u0000\u0000"+
		"\u056e\u056f\u0001\u0000\u0000\u0000\u056f\u0572\u0001\u0000\u0000\u0000"+
		"\u0570\u056e\u0001\u0000\u0000\u0000\u0571\u0569\u0001\u0000\u0000\u0000"+
		"\u0571\u0572\u0001\u0000\u0000\u0000\u0572\u0573\u0001\u0000\u0000\u0000"+
		"\u0573\u0574\u0005/\u0000\u0000\u0574\u0575\u00052\u0000\u0000\u0575\u0576"+
		"\u0003^/\u0000\u0576\u0577\u00053\u0000\u0000\u0577i\u0001\u0000\u0000"+
		"\u0000\u0578\u057c\u0003f3\u0000\u0579\u057c\u0003d2\u0000\u057a\u057c"+
		"\u0003h4\u0000\u057b\u0578\u0001\u0000\u0000\u0000\u057b\u0579\u0001\u0000"+
		"\u0000\u0000\u057b\u057a\u0001\u0000\u0000\u0000\u057ck\u0001\u0000\u0000"+
		"\u0000\u057d\u057f\u0005C\u0000\u0000\u057e\u057d\u0001\u0000\u0000\u0000"+
		"\u057e\u057f\u0001\u0000\u0000\u0000\u057f\u0582\u0001\u0000\u0000\u0000"+
		"\u0580\u0583\u0003\u0002\u0001\u0000\u0581\u0583\u0005O\u0000\u0000\u0582"+
		"\u0580\u0001\u0000\u0000\u0000\u0582\u0581\u0001\u0000\u0000\u0000\u0583"+
		"\u0584\u0001\u0000\u0000\u0000\u0584\u058d\u0005.\u0000\u0000\u0585\u058a"+
		"\u0003\\.\u0000\u0586\u0587\u00054\u0000\u0000\u0587\u0589\u0003\\.\u0000"+
		"\u0588\u0586\u0001\u0000\u0000\u0000\u0589\u058c\u0001\u0000\u0000\u0000"+
		"\u058a\u0588\u0001\u0000\u0000\u0000\u058a\u058b\u0001\u0000\u0000\u0000"+
		"\u058b\u058e\u0001\u0000\u0000\u0000\u058c\u058a\u0001\u0000\u0000\u0000"+
		"\u058d\u0585\u0001\u0000\u0000\u0000\u058d\u058e\u0001\u0000\u0000\u0000"+
		"\u058e\u058f\u0001\u0000\u0000\u0000\u058f\u0590\u0005/\u0000\u0000\u0590"+
		"m\u0001\u0000\u0000\u0000\u0591\u0597\u0003\u0002\u0001\u0000\u0592\u0595"+
		"\u0005H\u0000\u0000\u0593\u0596\u0003\u0002\u0001\u0000\u0594\u0596\u0005"+
		";\u0000\u0000\u0595\u0593\u0001\u0000\u0000\u0000\u0595\u0594\u0001\u0000"+
		"\u0000\u0000\u0596\u0598\u0001\u0000\u0000\u0000\u0597\u0592\u0001\u0000"+
		"\u0000\u0000\u0597\u0598\u0001\u0000\u0000\u0000\u0598o\u0001\u0000\u0000"+
		"\u0000\u0599\u059c\u0003t:\u0000\u059a\u059c\u0003v;\u0000\u059b\u0599"+
		"\u0001\u0000\u0000\u0000\u059b\u059a\u0001\u0000\u0000\u0000\u059c\u059e"+
		"\u0001\u0000\u0000\u0000\u059d\u059f\u00055\u0000\u0000\u059e\u059d\u0001"+
		"\u0000\u0000\u0000\u059e\u059f\u0001\u0000\u0000\u0000\u059fq\u0001\u0000"+
		"\u0000\u0000\u05a0\u05a6\u0005F\u0000\u0000\u05a1\u05a7\u0003\u0002\u0001"+
		"\u0000\u05a2\u05a7\u0003H$\u0000\u05a3\u05a7\u0003B!\u0000\u05a4\u05a7"+
		"\u0003j5\u0000\u05a5\u05a7\u0003R)\u0000\u05a6\u05a1\u0001\u0000\u0000"+
		"\u0000\u05a6\u05a2\u0001\u0000\u0000\u0000\u05a6\u05a3\u0001\u0000\u0000"+
		"\u0000\u05a6\u05a4\u0001\u0000\u0000\u0000\u05a6\u05a5\u0001\u0000\u0000"+
		"\u0000\u05a7s\u0001\u0000\u0000\u0000\u05a8\u05a9\u0005D\u0000\u0000\u05a9"+
		"\u05bc\u0003R)\u0000\u05aa\u05ab\u0005D\u0000\u0000\u05ab\u05ac\u0005"+
		"2\u0000\u0000\u05ac\u05b1\u0003n7\u0000\u05ad\u05ae\u00054\u0000\u0000"+
		"\u05ae\u05b0\u0003n7\u0000\u05af\u05ad\u0001\u0000\u0000\u0000\u05b0\u05b3"+
		"\u0001\u0000\u0000\u0000\u05b1\u05af\u0001\u0000\u0000\u0000\u05b1\u05b2"+
		"\u0001\u0000\u0000\u0000\u05b2\u05b4\u0001\u0000\u0000\u0000\u05b3\u05b1"+
		"\u0001\u0000\u0000\u0000\u05b4\u05b7\u00053\u0000\u0000\u05b5\u05b6\u0005"+
		"G\u0000\u0000\u05b6\u05b8\u0005;\u0000\u0000\u05b7\u05b5\u0001\u0000\u0000"+
		"\u0000\u05b7\u05b8\u0001\u0000\u0000\u0000\u05b8\u05bc\u0001\u0000\u0000"+
		"\u0000\u05b9\u05ba\u0005D\u0000\u0000\u05ba\u05bc\u0003d2\u0000\u05bb"+
		"\u05a8\u0001\u0000\u0000\u0000\u05bb\u05aa\u0001\u0000\u0000\u0000\u05bb"+
		"\u05b9\u0001\u0000\u0000\u0000\u05bcu\u0001\u0000\u0000\u0000\u05bd\u05be"+
		"\u0005D\u0000\u0000\u05be\u05c4\u0005 \u0000\u0000\u05bf\u05c2\u0005H"+
		"\u0000\u0000\u05c0\u05c3\u0003\u0002\u0001\u0000\u05c1\u05c3\u0005;\u0000"+
		"\u0000\u05c2\u05c0\u0001\u0000\u0000\u0000\u05c2\u05c1\u0001\u0000\u0000"+
		"\u0000\u05c3\u05c5\u0001\u0000\u0000\u0000\u05c4\u05bf\u0001\u0000\u0000"+
		"\u0000\u05c4\u05c5\u0001\u0000\u0000\u0000\u05c5\u05c6\u0001\u0000\u0000"+
		"\u0000\u05c6\u05c7\u0005G\u0000\u0000\u05c7\u05c8\u0005;\u0000\u0000\u05c8"+
		"w\u0001\u0000\u0000\u0000\u05c9\u05ca\u0005E\u0000\u0000\u05ca\u05cb\u0005"+
		";\u0000\u0000\u05cby\u0001\u0000\u0000\u0000\u05cc\u05cd\u0005E\u0000"+
		"\u0000\u05cd\u05ce\u0005 \u0000\u0000\u05ce\u05cf\u0005H\u0000\u0000\u05cf"+
		"\u05d0\u0003\u0002\u0001\u0000\u05d0\u05d1\u0001\u0000\u0000\u0000\u05d1"+
		"\u05d2\u0005G\u0000\u0000\u05d2\u05d3\u0005;\u0000\u0000\u05d3\u05fa\u0001"+
		"\u0000\u0000\u0000\u05d4\u05d5\u0005E\u0000\u0000\u05d5\u05d6\u00052\u0000"+
		"\u0000\u05d6\u05db\u0003~?\u0000\u05d7\u05d8\u00054\u0000\u0000\u05d8"+
		"\u05da\u0003~?\u0000\u05d9\u05d7\u0001\u0000\u0000\u0000\u05da\u05dd\u0001"+
		"\u0000\u0000\u0000\u05db\u05d9\u0001\u0000\u0000\u0000\u05db\u05dc\u0001"+
		"\u0000\u0000\u0000\u05dc\u05de\u0001\u0000\u0000\u0000\u05dd\u05db\u0001"+
		"\u0000\u0000\u0000\u05de\u05df\u00053\u0000\u0000\u05df\u05e0\u0001\u0000"+
		"\u0000\u0000\u05e0\u05e1\u0005G\u0000\u0000\u05e1\u05e2\u0005;\u0000\u0000"+
		"\u05e2\u05fa\u0001\u0000\u0000\u0000\u05e3\u05e4\u0005E\u0000\u0000\u05e4"+
		"\u05e5\u0003~?\u0000\u05e5\u05e6\u00054\u0000\u0000\u05e6\u05e7\u0005"+
		"2\u0000\u0000\u05e7\u05ec\u0003~?\u0000\u05e8\u05e9\u00054\u0000\u0000"+
		"\u05e9\u05eb\u0003~?\u0000\u05ea\u05e8\u0001\u0000\u0000\u0000\u05eb\u05ee"+
		"\u0001\u0000\u0000\u0000\u05ec\u05ea\u0001\u0000\u0000\u0000\u05ec\u05ed"+
		"\u0001\u0000\u0000\u0000\u05ed\u05ef\u0001\u0000\u0000\u0000\u05ee\u05ec"+
		"\u0001\u0000\u0000\u0000\u05ef\u05f0\u00053\u0000\u0000\u05f0\u05f1\u0001"+
		"\u0000\u0000\u0000\u05f1\u05f2\u0005G\u0000\u0000\u05f2\u05f3\u0005;\u0000"+
		"\u0000\u05f3\u05fa\u0001\u0000\u0000\u0000\u05f4\u05f5\u0005E\u0000\u0000"+
		"\u05f5\u05f6\u0003~?\u0000\u05f6\u05f7\u0005G\u0000\u0000\u05f7\u05f8"+
		"\u0005;\u0000\u0000\u05f8\u05fa\u0001\u0000\u0000\u0000\u05f9\u05cc\u0001"+
		"\u0000\u0000\u0000\u05f9\u05d4\u0001\u0000\u0000\u0000\u05f9\u05e3\u0001"+
		"\u0000\u0000\u0000\u05f9\u05f4\u0001\u0000\u0000\u0000\u05fa{\u0001\u0000"+
		"\u0000\u0000\u05fb\u05fe\u0003z=\u0000\u05fc\u05fe\u0003x<\u0000\u05fd"+
		"\u05fb\u0001\u0000\u0000\u0000\u05fd\u05fc\u0001\u0000\u0000\u0000\u05fe"+
		"}\u0001\u0000\u0000\u0000\u05ff\u0602\u0003\u0002\u0001\u0000\u0600\u0601"+
		"\u0005H\u0000\u0000\u0601\u0603\u0003\u0002\u0001\u0000\u0602\u0600\u0001"+
		"\u0000\u0000\u0000\u0602\u0603\u0001\u0000\u0000\u0000\u0603\u007f\u0001"+
		"\u0000\u0000\u0000\u0604\u0608\u0003\u008aE\u0000\u0605\u0608\u0003\u0086"+
		"C\u0000\u0606\u0608\u0003\u008cF\u0000\u0607\u0604\u0001\u0000\u0000\u0000"+
		"\u0607\u0605\u0001\u0000\u0000\u0000\u0607\u0606\u0001\u0000\u0000\u0000"+
		"\u0608\u0081\u0001\u0000\u0000\u0000\u0609\u060a\u0005)\u0000\u0000\u060a"+
		"\u060f\u0003\u0002\u0001\u0000\u060b\u060c\u00058\u0000\u0000\u060c\u060e"+
		"\u0003\u0002\u0001\u0000\u060d\u060b\u0001\u0000\u0000\u0000\u060e\u0611"+
		"\u0001\u0000\u0000\u0000\u060f\u060d\u0001\u0000\u0000\u0000\u060f\u0610"+
		"\u0001\u0000\u0000\u0000\u0610\u0615\u0001\u0000\u0000\u0000\u0611\u060f"+
		"\u0001\u0000\u0000\u0000\u0612\u0614\u0003\u008eG\u0000\u0613\u0612\u0001"+
		"\u0000\u0000\u0000\u0614\u0617\u0001\u0000\u0000\u0000\u0615\u0613\u0001"+
		"\u0000\u0000\u0000\u0615\u0616\u0001\u0000\u0000\u0000\u0616\u0618\u0001"+
		"\u0000\u0000\u0000\u0617\u0615\u0001\u0000\u0000\u0000\u0618\u0619\u0005"+
		"(\u0000\u0000\u0619\u0083\u0001\u0000\u0000\u0000\u061a\u061b\u0005)\u0000"+
		"\u0000\u061b\u061c\u0005!\u0000\u0000\u061c\u0621\u0003\u0002\u0001\u0000"+
		"\u061d\u061e\u00058\u0000\u0000\u061e\u0620\u0003\u0002\u0001\u0000\u061f"+
		"\u061d\u0001\u0000\u0000\u0000\u0620\u0623\u0001\u0000\u0000\u0000\u0621"+
		"\u061f\u0001\u0000\u0000\u0000\u0621\u0622\u0001\u0000\u0000\u0000\u0622"+
		"\u0624\u0001\u0000\u0000\u0000\u0623\u0621\u0001\u0000\u0000\u0000\u0624"+
		"\u0625\u0005(\u0000\u0000\u0625\u0085\u0001\u0000\u0000\u0000\u0626\u0627"+
		"\u0005)\u0000\u0000\u0627\u062c\u0003\u0002\u0001\u0000\u0628\u0629\u0005"+
		"8\u0000\u0000\u0629\u062b\u0003\u0002\u0001\u0000\u062a\u0628\u0001\u0000"+
		"\u0000\u0000\u062b\u062e\u0001\u0000\u0000\u0000\u062c\u062a\u0001\u0000"+
		"\u0000\u0000\u062c\u062d\u0001\u0000\u0000\u0000\u062d\u0632\u0001\u0000"+
		"\u0000\u0000\u062e\u062c\u0001\u0000\u0000\u0000\u062f\u0631\u0003\u008e"+
		"G\u0000\u0630\u062f\u0001\u0000\u0000\u0000\u0631\u0634\u0001\u0000\u0000"+
		"\u0000\u0632\u0630\u0001\u0000\u0000\u0000\u0632\u0633\u0001\u0000\u0000"+
		"\u0000\u0633\u0635\u0001\u0000\u0000\u0000\u0634\u0632\u0001\u0000\u0000"+
		"\u0000\u0635\u0636\u0005!\u0000\u0000\u0636\u0637\u0005(\u0000\u0000\u0637"+
		"\u0087\u0001\u0000\u0000\u0000\u0638\u0647\u00052\u0000\u0000\u0639\u063f"+
		"\u0003l6\u0000\u063a\u063f\u00032\u0019\u0000\u063b\u063f\u0003L&\u0000"+
		"\u063c\u063f\u0003J%\u0000\u063d\u063f\u0003B!\u0000\u063e\u0639\u0001"+
		"\u0000\u0000\u0000\u063e\u063a\u0001\u0000\u0000\u0000\u063e\u063b\u0001"+
		"\u0000\u0000\u0000\u063e\u063c\u0001\u0000\u0000\u0000\u063e\u063d\u0001"+
		"\u0000\u0000\u0000\u063e\u063f\u0001\u0000\u0000\u0000\u063f\u0648\u0001"+
		"\u0000\u0000\u0000\u0640\u0642\u0003j5\u0000\u0641\u0640\u0001\u0000\u0000"+
		"\u0000\u0641\u0642\u0001\u0000\u0000\u0000\u0642\u0648\u0001\u0000\u0000"+
		"\u0000\u0643\u0648\u0003\u0090H\u0000\u0644\u0646\u0003\u0088D\u0000\u0645"+
		"\u0644\u0001\u0000\u0000\u0000\u0645\u0646\u0001\u0000\u0000\u0000\u0646"+
		"\u0648\u0001\u0000\u0000\u0000\u0647\u063e\u0001\u0000\u0000\u0000\u0647"+
		"\u0641\u0001\u0000\u0000\u0000\u0647\u0643\u0001\u0000\u0000\u0000\u0647"+
		"\u0645\u0001\u0000\u0000\u0000\u0648\u0649\u0001\u0000\u0000\u0000\u0649"+
		"\u064a\u00053\u0000\u0000\u064a\u0089\u0001\u0000\u0000\u0000\u064b\u0651"+
		"\u0003\u0082A\u0000\u064c\u0650\u0003\u0080@\u0000\u064d\u0650\u0003\u0088"+
		"D\u0000\u064e\u0650\u0003`0\u0000\u064f\u064c\u0001\u0000\u0000\u0000"+
		"\u064f\u064d\u0001\u0000\u0000\u0000\u064f\u064e\u0001\u0000\u0000\u0000"+
		"\u0650\u0653\u0001\u0000\u0000\u0000\u0651\u064f\u0001\u0000\u0000\u0000"+
		"\u0651\u0652\u0001\u0000\u0000\u0000\u0652\u0654\u0001\u0000\u0000\u0000"+
		"\u0653\u0651\u0001\u0000\u0000\u0000\u0654\u0655\u0003\u0084B\u0000\u0655"+
		"\u008b\u0001\u0000\u0000\u0000\u0656\u0657\u0005)\u0000\u0000\u0657\u0658"+
		"\u0005(\u0000\u0000\u0658\u065e\u0001\u0000\u0000\u0000\u0659\u065d\u0003"+
		"\u0080@\u0000\u065a\u065d\u0003\u0088D\u0000\u065b\u065d\u0003`0\u0000"+
		"\u065c\u0659\u0001\u0000\u0000\u0000\u065c\u065a\u0001\u0000\u0000\u0000"+
		"\u065c\u065b\u0001\u0000\u0000\u0000\u065d\u0660\u0001\u0000\u0000\u0000"+
		"\u065e\u065c\u0001\u0000\u0000\u0000\u065e\u065f\u0001\u0000\u0000\u0000"+
		"\u065f\u0661\u0001\u0000\u0000\u0000\u0660\u065e\u0001\u0000\u0000\u0000"+
		"\u0661\u0662\u0005)\u0000\u0000\u0662\u0663\u0005!\u0000\u0000\u0663\u0664"+
		"\u0005(\u0000\u0000\u0664\u008d\u0001\u0000\u0000\u0000\u0665\u0666\u0005"+
		"2\u0000\u0000\u0666\u0667\u0003\u0090H\u0000\u0667\u0668\u00053\u0000"+
		"\u0000\u0668\u0684\u0001\u0000\u0000\u0000\u0669\u066a\u0005\u0013\u0000"+
		"\u0000\u066a\u066b\u0005\u0016\u0000\u0000\u066b\u0677\u00052\u0000\u0000"+
		"\u066c\u066d\u0005.\u0000\u0000\u066d\u066e\u0005/\u0000\u0000\u066e\u0674"+
		"\u0005\u0015\u0000\u0000\u066f\u0675\u0003N\'\u0000\u0670\u0671\u0005"+
		"2\u0000\u0000\u0671\u0672\u0003N\'\u0000\u0672\u0673\u00053\u0000\u0000"+
		"\u0673\u0675\u0001\u0000\u0000\u0000\u0674\u066f\u0001\u0000\u0000\u0000"+
		"\u0674\u0670\u0001\u0000\u0000\u0000\u0675\u0678\u0001\u0000\u0000\u0000"+
		"\u0676\u0678\u0003N\'\u0000\u0677\u066c\u0001\u0000\u0000\u0000\u0677"+
		"\u0676\u0001\u0000\u0000\u0000\u0678\u0679\u0001\u0000\u0000\u0000\u0679"+
		"\u067a\u00053\u0000\u0000\u067a\u0684\u0001\u0000\u0000\u0000\u067b\u0681"+
		"\u0005M\u0000\u0000\u067c\u067f\u0005\u0016\u0000\u0000\u067d\u0680\u0003"+
		"H$\u0000\u067e\u0680\u0003\u0088D\u0000\u067f\u067d\u0001\u0000\u0000"+
		"\u0000\u067f\u067e\u0001\u0000\u0000\u0000\u0680\u0682\u0001\u0000\u0000"+
		"\u0000\u0681\u067c\u0001\u0000\u0000\u0000\u0681\u0682\u0001\u0000\u0000"+
		"\u0000\u0682\u0684\u0001\u0000\u0000\u0000\u0683\u0665\u0001\u0000\u0000"+
		"\u0000\u0683\u0669\u0001\u0000\u0000\u0000\u0683\u067b\u0001\u0000\u0000"+
		"\u0000\u0684\u008f\u0001\u0000\u0000\u0000\u0685\u0686\u00058\u0000\u0000"+
		"\u0686\u0687\u00058\u0000\u0000\u0687\u068d\u00058\u0000\u0000\u0688\u068e"+
		"\u0003\u0002\u0001\u0000\u0689\u068e\u0003H$\u0000\u068a\u068e\u0003V"+
		"+\u0000\u068b\u068e\u0003j5\u0000\u068c\u068e\u0003l6\u0000\u068d\u0688"+
		"\u0001\u0000\u0000\u0000\u068d\u0689\u0001\u0000\u0000\u0000\u068d\u068a"+
		"\u0001\u0000\u0000\u0000\u068d\u068b\u0001\u0000\u0000\u0000\u068d\u068c"+
		"\u0001\u0000\u0000\u0000\u068e\u0091\u0001\u0000\u0000\u0000\u068f\u0690"+
		"\u0005?\u0000\u0000\u0690\u0691\u00050\u0000\u0000\u0691\u0692\u0003\u0002"+
		"\u0001\u0000\u0692\u0693\u00054\u0000\u0000\u0693\u0694\u0003\u0002\u0001"+
		"\u0000\u0694\u0695\u00051\u0000\u0000\u0695\u0696\u0005\u0016\u0000\u0000"+
		"\u0696\u0697\u0005I\u0000\u0000\u0697\u069c\u0005.\u0000\u0000\u0698\u069d"+
		"\u0003\u0002\u0001\u0000\u0699\u069d\u0003H$\u0000\u069a\u069d\u0003B"+
		"!\u0000\u069b\u069d\u0003L&\u0000\u069c\u0698\u0001\u0000\u0000\u0000"+
		"\u069c\u0699\u0001\u0000\u0000\u0000\u069c\u069a\u0001\u0000\u0000\u0000"+
		"\u069c\u069b\u0001\u0000\u0000\u0000\u069d\u069e\u0001\u0000\u0000\u0000"+
		"\u069e\u069f\u0005/\u0000\u0000\u069f\u0093\u0001\u0000\u0000\u0000\u06a0"+
		"\u06a1\u0005?\u0000\u0000\u06a1\u06a2\u0003\u0002\u0001\u0000\u06a2\u06a3"+
		"\u0005\u0016\u0000\u0000\u06a3\u06a4\u0005L\u0000\u0000\u06a4\u06a9\u0005"+
		".\u0000\u0000\u06a5\u06aa\u0003\u0002\u0001\u0000\u06a6\u06aa\u0003H$"+
		"\u0000\u06a7\u06aa\u0003B!\u0000\u06a8\u06aa\u0003L&\u0000\u06a9\u06a5"+
		"\u0001\u0000\u0000\u0000\u06a9\u06a6\u0001\u0000\u0000\u0000\u06a9\u06a7"+
		"\u0001\u0000\u0000\u0000\u06a9\u06a8\u0001\u0000\u0000\u0000\u06aa\u06ab"+
		"\u0001\u0000\u0000\u0000\u06ab\u06ac\u0005/\u0000\u0000\u06ac\u0095\u0001"+
		"\u0000\u0000\u0000\u06ad\u06ae\u0005J\u0000\u0000\u06ae\u06b1\u0005.\u0000"+
		"\u0000\u06af\u06b2\u0003h4\u0000\u06b0\u06b2\u0003f3\u0000\u06b1\u06af"+
		"\u0001\u0000\u0000\u0000\u06b1\u06b0\u0001\u0000\u0000\u0000\u06b2\u06b5"+
		"\u0001\u0000\u0000\u0000\u06b3\u06b4\u00054\u0000\u0000\u06b4\u06b6\u0003"+
		"\u0098L\u0000\u06b5\u06b3\u0001\u0000\u0000\u0000\u06b5\u06b6\u0001\u0000"+
		"\u0000\u0000\u06b6\u06b7\u0001\u0000\u0000\u0000\u06b7\u06b8\u0005/\u0000"+
		"\u0000\u06b8\u0097\u0001\u0000\u0000\u0000\u06b9\u06ba\u00050\u0000\u0000"+
		"\u06ba\u06bf\u0003\u0002\u0001\u0000\u06bb\u06bc\u00054\u0000\u0000\u06bc"+
		"\u06be\u0003\u0002\u0001\u0000\u06bd\u06bb\u0001\u0000\u0000\u0000\u06be"+
		"\u06c1\u0001\u0000\u0000\u0000\u06bf\u06bd\u0001\u0000\u0000\u0000\u06bf"+
		"\u06c0\u0001\u0000\u0000\u0000\u06c0\u06c2\u0001\u0000\u0000\u0000\u06c1"+
		"\u06bf\u0001\u0000\u0000\u0000\u06c2\u06c3\u00051\u0000\u0000\u06c3\u0099"+
		"\u0001\u0000\u0000\u0000\u06c4\u06c8\u0003B!\u0000\u06c5\u06c8\u0003\u0002"+
		"\u0001\u0000\u06c6\u06c8\u0005>\u0000\u0000\u06c7\u06c4\u0001\u0000\u0000"+
		"\u0000\u06c7\u06c5\u0001\u0000\u0000\u0000\u06c7\u06c6\u0001\u0000\u0000"+
		"\u0000\u06c8\u009b\u0001\u0000\u0000\u0000\u06c9\u06ca\u0005K\u0000\u0000"+
		"\u06ca\u06cb\u0005.\u0000\u0000\u06cb\u06cc\u0003L&\u0000\u06cc\u06cd"+
		"\u00054\u0000\u0000\u06cd\u06d9\u0003\u009aM\u0000\u06ce\u06d5\u00054"+
		"\u0000\u0000\u06cf\u06d6\u0003H$\u0000\u06d0\u06d6\u0003\u0002\u0001\u0000"+
		"\u06d1\u06d6\u0003V+\u0000\u06d2\u06d6\u0003\u009cN\u0000\u06d3\u06d6"+
		"\u0003\u0080@\u0000\u06d4\u06d6\u0003\u0090H\u0000\u06d5\u06cf\u0001\u0000"+
		"\u0000\u0000\u06d5\u06d0\u0001\u0000\u0000\u0000\u06d5\u06d1\u0001\u0000"+
		"\u0000\u0000\u06d5\u06d2\u0001\u0000\u0000\u0000\u06d5\u06d3\u0001\u0000"+
		"\u0000\u0000\u06d5\u06d4\u0001\u0000\u0000\u0000\u06d6\u06d8\u0001\u0000"+
		"\u0000\u0000\u06d7\u06ce\u0001\u0000\u0000\u0000\u06d8\u06db\u0001\u0000"+
		"\u0000\u0000\u06d9\u06d7\u0001\u0000\u0000\u0000\u06d9\u06da\u0001\u0000"+
		"\u0000\u0000\u06da\u06dc\u0001\u0000\u0000\u0000\u06db\u06d9\u0001\u0000"+
		"\u0000\u0000\u06dc\u06dd\u0005/\u0000\u0000\u06dd\u009d\u0001\u0000\u0000"+
		"\u0000\u06de\u06e9\u0005\u0012\u0000\u0000\u06df\u06e2\u0005.\u0000\u0000"+
		"\u06e0\u06e3\u0003\u0080@\u0000\u06e1\u06e3\u0005>\u0000\u0000\u06e2\u06e0"+
		"\u0001\u0000\u0000\u0000\u06e2\u06e1\u0001\u0000\u0000\u0000\u06e3\u06e4"+
		"\u0001\u0000\u0000\u0000\u06e4\u06ea\u0005/\u0000\u0000\u06e5\u06e8\u0003"+
		"\u0080@\u0000\u06e6\u06e8\u0005>\u0000\u0000\u06e7\u06e5\u0001\u0000\u0000"+
		"\u0000\u06e7\u06e6\u0001\u0000\u0000\u0000\u06e8\u06ea\u0001\u0000\u0000"+
		"\u0000\u06e9\u06df\u0001\u0000\u0000\u0000\u06e9\u06e7\u0001\u0000\u0000"+
		"\u0000\u06ea\u06ee\u0001\u0000\u0000\u0000\u06eb\u06ed\u00055\u0000\u0000"+
		"\u06ec\u06eb\u0001\u0000\u0000\u0000\u06ed\u06f0\u0001\u0000\u0000\u0000"+
		"\u06ee\u06ec\u0001\u0000\u0000\u0000\u06ee\u06ef\u0001\u0000\u0000\u0000"+
		"\u06ef\u009f\u0001\u0000\u0000\u0000\u06f0\u06ee\u0001\u0000\u0000\u0000"+
		"\u06f1\u06f4\u0003\u00a2Q\u0000\u06f2\u06f4\u0003\u00a4R\u0000\u06f3\u06f1"+
		"\u0001\u0000\u0000\u0000\u06f3\u06f2\u0001\u0000\u0000\u0000\u06f4\u06f8"+
		"\u0001\u0000\u0000\u0000\u06f5\u06f7\u00055\u0000\u0000\u06f6\u06f5\u0001"+
		"\u0000\u0000\u0000\u06f7\u06fa\u0001\u0000\u0000\u0000\u06f8\u06f6\u0001"+
		"\u0000\u0000\u0000\u06f8\u06f9\u0001\u0000\u0000\u0000\u06f9\u00a1\u0001"+
		"\u0000\u0000\u0000\u06fa\u06f8\u0001\u0000\u0000\u0000\u06fb\u06fc\u0005"+
		"?\u0000\u0000\u06fc\u06fd\u0003\u0002\u0001\u0000\u06fd\u06fe\u0005\u0016"+
		"\u0000\u0000\u06fe\u0700\u0005.\u0000\u0000\u06ff\u0701\u0003\u009aM\u0000"+
		"\u0700\u06ff\u0001\u0000\u0000\u0000\u0700\u0701\u0001\u0000\u0000\u0000"+
		"\u0701\u0702\u0001\u0000\u0000\u0000\u0702\u0703\u0005/\u0000\u0000\u0703"+
		"\u0709\u0005\u0015\u0000\u0000\u0704\u0705\u00052\u0000\u0000\u0705\u0706"+
		"\u0003\u00a6S\u0000\u0706\u0707\u00053\u0000\u0000\u0707\u070a\u0001\u0000"+
		"\u0000\u0000\u0708\u070a\u0003\u00a6S\u0000\u0709\u0704\u0001\u0000\u0000"+
		"\u0000\u0709\u0708\u0001\u0000\u0000\u0000\u070a\u00a3\u0001\u0000\u0000"+
		"\u0000\u070b\u070c\u0005\u0011\u0000\u0000\u070c\u070d\u0003\u0002\u0001"+
		"\u0000\u070d\u070f\u0005.\u0000\u0000\u070e\u0710\u0003\u009aM\u0000\u070f"+
		"\u070e\u0001\u0000\u0000\u0000\u070f\u0710\u0001\u0000\u0000\u0000\u0710"+
		"\u0711\u0001\u0000\u0000\u0000\u0711\u0712\u0005/\u0000\u0000\u0712\u0713"+
		"\u00052\u0000\u0000\u0713\u0714\u0003\u00a6S\u0000\u0714\u0715\u00053"+
		"\u0000\u0000\u0715\u00a5\u0001\u0000\u0000\u0000\u0716\u0718\u0003`0\u0000"+
		"\u0717\u0716\u0001\u0000\u0000\u0000\u0718\u071b\u0001\u0000\u0000\u0000"+
		"\u0719\u0717\u0001\u0000\u0000\u0000\u0719\u071a\u0001\u0000\u0000\u0000"+
		"\u071a\u071c\u0001\u0000\u0000\u0000\u071b\u0719\u0001\u0000\u0000\u0000"+
		"\u071c\u071d\u0003\u009eO\u0000\u071d\u00a7\u0001\u0000\u0000\u0000\u012d"+
		"\u00ab\u00b2\u00b9\u00c1\u00c7\u00ca\u00d1\u00d4\u00db\u00e4\u00e8\u00ea"+
		"\u00ee\u00f0\u00f5\u00f7\u00fa\u0100\u0104\u010b\u0114\u0118\u011a\u011e"+
		"\u0120\u0125\u0127\u012a\u0133\u0137\u0139\u013d\u013f\u0144\u0146\u0149"+
		"\u0150\u015a\u0162\u0166\u0168\u016f\u0178\u017c\u017e\u0182\u0184\u0189"+
		"\u018b\u018e\u0197\u019b\u019d\u01a1\u01a3\u01a8\u01aa\u01ad\u01b3\u01bc"+
		"\u01c2\u01c9\u01cd\u01cf\u01d3\u01d5\u01da\u01dc\u01df\u01e8\u01ec\u01ee"+
		"\u01f2\u01f4\u01f9\u01fb\u01fe\u0201\u0205\u0208\u020d\u0215\u021b\u021f"+
		"\u0221\u0225\u0227\u022c\u022e\u0231\u023a\u023e\u0240\u0244\u0246\u024b"+
		"\u024d\u0250\u0257\u025c\u026a\u027a\u0280\u0288\u0292\u029b\u02a0\u02a2"+
		"\u02a6\u02a8\u02ad\u02b0\u02b3\u02b9\u02bd\u02c4\u02cd\u02d2\u02d4\u02d8"+
		"\u02da\u02df\u02e2\u02e5\u02ee\u02f3\u02f5\u02f9\u02fb\u0300\u0303\u0306"+
		"\u030d\u0317\u031f\u0323\u0325\u032c\u0335\u033a\u033c\u0340\u0342\u0347"+
		"\u034a\u034d\u0356\u035b\u035d\u0361\u0363\u0368\u036b\u036e\u0374\u037d"+
		"\u0383\u038a\u038f\u0391\u0395\u0397\u039c\u039f\u03a2\u03ab\u03b0\u03b2"+
		"\u03b6\u03b8\u03bd\u03c0\u03c3\u03c6\u03ca\u03cd\u03d2\u03da\u03e0\u03e5"+
		"\u03e7\u03eb\u03ed\u03f2\u03f5\u03f8\u0401\u0406\u0408\u040c\u040e\u0413"+
		"\u0416\u0419\u0420\u0425\u042c\u0433\u043a\u0441\u0446\u044a\u044c\u0451"+
		"\u0458\u045c\u0462\u046c\u0477\u047f\u0481\u0487\u0495\u0497\u04a1\u04af"+
		"\u04b1\u04b7\u04be\u04c5\u04cc\u04d1\u04d5\u04d7\u04dc\u04e8\u04f0\u04f5"+
		"\u04f9\u0512\u0517\u0524\u0530\u0532\u0537\u053b\u0545\u0548\u0555\u0558"+
		"\u0565\u056e\u0571\u057b\u057e\u0582\u058a\u058d\u0595\u0597\u059b\u059e"+
		"\u05a6\u05b1\u05b7\u05bb\u05c2\u05c4\u05db\u05ec\u05f9\u05fd\u0602\u0607"+
		"\u060f\u0615\u0621\u062c\u0632\u063e\u0641\u0645\u0647\u064f\u0651\u065c"+
		"\u065e\u0674\u0677\u067f\u0681\u0683\u068d\u069c\u06a9\u06b1\u06b5\u06bf"+
		"\u06c7\u06d5\u06d9\u06e2\u06e7\u06e9\u06ee\u06f3\u06f8\u0700\u0709\u070f"+
		"\u0719";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}