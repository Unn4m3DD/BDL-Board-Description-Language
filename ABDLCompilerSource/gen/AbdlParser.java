// Generated from D:/lfa/BDL-Board-Description-Language/ABDLCompilerSource/src\Abdl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbdlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, Type=29, Compare=30, String=31, 
		ID=32, Int=33, Comment=34, WS=35, ERRORS=36;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_functDef = 2, RULE_block = 3, RULE_statements = 4, 
		RULE_forStatement = 5, RULE_whileStatement = 6, RULE_ifStatement = 7, 
		RULE_varDeclaration = 8, RULE_varAttrib = 9, RULE_functionCall = 10, RULE_returnStat = 11, 
		RULE_expr = 12, RULE_args = 13, RULE_typedArgs = 14, RULE_point = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "functDef", "block", "statements", "forStatement", 
			"whileStatement", "ifStatement", "varDeclaration", "varAttrib", "functionCall", 
			"returnStat", "expr", "args", "typedArgs", "point"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main:'", "'end'", "'main'", "';'", "'('", "')'", "':'", "'for'", 
			"'from'", "'to'", "'do'", "'done;'", "'while'", "'if'", "'then'", "'endif;'", 
			"'let'", "'='", "'return'", "'+'", "'-'", "'*'", "'/'", "'%'", "'null'", 
			"','", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "Type", "Compare", "String", "ID", "Int", 
			"Comment", "WS", "ERRORS"
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
	public String getGrammarFileName() { return "Abdl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AbdlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AbdlParser.EOF, 0); }
		public List<FunctDefContext> functDef() {
			return getRuleContexts(FunctDefContext.class);
		}
		public FunctDefContext functDef(int i) {
			return getRuleContext(FunctDefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Type || _la==ID) {
				{
				{
				setState(32);
				functDef();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			main();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Type || _la==ID) {
				{
				{
				setState(39);
				functDef();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(EOF);
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

	public static class MainContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__18) | (1L << ID))) != 0)) {
				{
				{
				setState(48);
				statements();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(T__1);
			setState(55);
			match(T__2);
			setState(56);
			match(T__3);
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

	public static class FunctDefContext extends ParserRuleContext {
		public Token func_name;
		public TypedArgsContext typedArgs() {
			return getRuleContext(TypedArgsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AbdlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbdlParser.ID, i);
		}
		public TerminalNode Type() { return getToken(AbdlParser.Type, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public FunctDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterFunctDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitFunctDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitFunctDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctDefContext functDef() throws RecognitionException {
		FunctDefContext _localctx = new FunctDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(58);
				match(Type);
				}
			}

			setState(61);
			((FunctDefContext)_localctx).func_name = match(ID);
			setState(62);
			match(T__4);
			setState(63);
			typedArgs();
			setState(64);
			match(T__5);
			setState(65);
			match(T__6);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__18) | (1L << ID))) != 0)) {
				{
				{
				setState(66);
				statements();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(T__1);
			setState(73);
			match(ID);
			setState(74);
			match(T__3);
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

	public static class BlockContext extends ParserRuleContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				forStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				whileStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				ifStatement();
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

	public static class StatementsContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarAttribContext varAttrib() {
			return getRuleContext(VarAttribContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				varAttrib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				functionCall();
				setState(84);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				returnStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				block();
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

	public static class ForStatementContext extends ParserRuleContext {
		public Token var;
		public Token bottom;
		public Token up;
		public List<TerminalNode> ID() { return getTokens(AbdlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbdlParser.ID, i);
		}
		public List<TerminalNode> Int() { return getTokens(AbdlParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(AbdlParser.Int, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__7);
			setState(91);
			((ForStatementContext)_localctx).var = match(ID);
			setState(92);
			match(T__8);
			setState(93);
			((ForStatementContext)_localctx).bottom = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==Int) ) {
				((ForStatementContext)_localctx).bottom = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(94);
			match(T__9);
			setState(95);
			((ForStatementContext)_localctx).up = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==Int) ) {
				((ForStatementContext)_localctx).up = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(96);
			match(T__10);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__18) | (1L << ID))) != 0)) {
				{
				{
				setState(97);
				statements();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(T__11);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__12);
			setState(106);
			expr(0);
			setState(107);
			match(T__10);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__18) | (1L << ID))) != 0)) {
				{
				{
				setState(108);
				statements();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(T__11);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__13);
			setState(117);
			expr(0);
			setState(118);
			match(T__14);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__18) | (1L << ID))) != 0)) {
				{
				{
				setState(119);
				statements();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__15);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public TerminalNode Type() { return getToken(AbdlParser.Type, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__16);
			setState(128);
			match(ID);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(129);
				match(T__6);
				setState(130);
				match(Type);
				}
			}

			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(133);
				match(T__17);
				setState(134);
				expr(0);
				}
			}

			setState(137);
			match(T__3);
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

	public static class VarAttribContext extends ParserRuleContext {
		public Token var;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public VarAttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAttrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterVarAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitVarAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitVarAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAttribContext varAttrib() throws RecognitionException {
		VarAttribContext _localctx = new VarAttribContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varAttrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((VarAttribContext)_localctx).var = match(ID);
			setState(140);
			match(T__17);
			setState(141);
			expr(0);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ID);
			setState(144);
			match(T__4);
			setState(145);
			args();
			setState(146);
			match(T__5);
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

	public static class ReturnStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__18);
			setState(149);
			expr(0);
			setState(150);
			match(T__3);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EpxrFunctionCallContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EpxrFunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterEpxrFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitEpxrFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitEpxrFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprConditionContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public TerminalNode Compare() { return getToken(AbdlParser.Compare, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprConditionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringContext extends ExprContext {
		public TerminalNode String() { return getToken(AbdlParser.String, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPointContext extends ExprContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ExprPointContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprPoint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIntContext extends ExprContext {
		public TerminalNode Int() { return getToken(AbdlParser.Int, 0); }
		public ExprIntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNullContext extends ExprContext {
		public ExprNullContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(153);
				match(T__4);
				setState(154);
				expr(0);
				setState(155);
				match(T__5);
				}
				break;
			case 2:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(Int);
				}
				break;
			case 3:
				{
				_localctx = new ExprNullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(T__24);
				}
				break;
			case 4:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(String);
				}
				break;
			case 5:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new ExprPointContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				point();
				}
				break;
			case 7:
				{
				_localctx = new EpxrFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(166);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprConditionContext(new ExprContext(_parentctx, _parentState));
						((ExprConditionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(169);
						match(Compare);
						setState(170);
						((ExprConditionContext)_localctx).e2 = expr(2);
						}
						break;
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__24) | (1L << T__26) | (1L << String) | (1L << ID) | (1L << Int))) != 0)) {
				{
				setState(176);
				expr(0);
				}
			}

			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(179);
				match(T__25);
				setState(180);
				expr(0);
				}
				}
				setState(185);
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

	public static class TypedArgsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AbdlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AbdlParser.ID, i);
		}
		public List<TerminalNode> Type() { return getTokens(AbdlParser.Type); }
		public TerminalNode Type(int i) {
			return getToken(AbdlParser.Type, i);
		}
		public TypedArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterTypedArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitTypedArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitTypedArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedArgsContext typedArgs() throws RecognitionException {
		TypedArgsContext _localctx = new TypedArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typedArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(186);
				match(ID);
				setState(187);
				match(T__6);
				setState(188);
				match(Type);
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(191);
				match(T__25);
				{
				setState(192);
				match(ID);
				setState(193);
				match(T__6);
				setState(194);
				match(Type);
				}
				}
				}
				setState(199);
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

	public static class PointContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__26);
			setState(201);
			expr(0);
			setState(202);
			match(T__25);
			setState(203);
			expr(0);
			setState(204);
			match(T__27);
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
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00d1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\3\3\3\7\3"+
		"\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\3\3\3\3\4\5\4>\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5R\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7e\n\7\f\7\16\7h\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\n\u0086\n\n\3\n\3\n\5\n\u008a\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00a6\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u00ae\n\16\f\16\16\16\u00b1\13\16\3\17\5\17\u00b4\n\17\3\17\3\17\7\17"+
		"\u00b8\n\17\f\17\16\17\u00bb\13\17\3\20\3\20\3\20\5\20\u00c0\n\20\3\20"+
		"\3\20\3\20\3\20\7\20\u00c6\n\20\f\20\16\20\u00c9\13\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\2\3\32\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \2\4\3\2\"#\3\2\26\32\2\u00dc\2%\3\2\2\2\4\61\3\2\2\2\6=\3\2\2\2\bQ\3"+
		"\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16k\3\2\2\2\20v\3\2\2\2\22\u0081\3\2\2\2"+
		"\24\u008d\3\2\2\2\26\u0091\3\2\2\2\30\u0096\3\2\2\2\32\u00a5\3\2\2\2\34"+
		"\u00b3\3\2\2\2\36\u00bf\3\2\2\2 \u00ca\3\2\2\2\"$\5\6\4\2#\"\3\2\2\2$"+
		"\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2(,\5\4\3\2)+\5\6\4"+
		"\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\2"+
		"\2\3\60\3\3\2\2\2\61\65\7\3\2\2\62\64\5\n\6\2\63\62\3\2\2\2\64\67\3\2"+
		"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\4\2\29"+
		":\7\5\2\2:;\7\6\2\2;\5\3\2\2\2<>\7\37\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2"+
		"\2?@\7\"\2\2@A\7\7\2\2AB\5\36\20\2BC\7\b\2\2CG\7\t\2\2DF\5\n\6\2ED\3\2"+
		"\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\4\2\2KL\7\""+
		"\2\2LM\7\6\2\2M\7\3\2\2\2NR\5\f\7\2OR\5\16\b\2PR\5\20\t\2QN\3\2\2\2QO"+
		"\3\2\2\2QP\3\2\2\2R\t\3\2\2\2S[\5\22\n\2T[\5\24\13\2UV\5\26\f\2VW\7\6"+
		"\2\2W[\3\2\2\2X[\5\30\r\2Y[\5\b\5\2ZS\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2ZX\3"+
		"\2\2\2ZY\3\2\2\2[\13\3\2\2\2\\]\7\n\2\2]^\7\"\2\2^_\7\13\2\2_`\t\2\2\2"+
		"`a\7\f\2\2ab\t\2\2\2bf\7\r\2\2ce\5\n\6\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2"+
		"fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\16\2\2j\r\3\2\2\2kl\7\17\2\2lm\5\32"+
		"\16\2mq\7\r\2\2np\5\n\6\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3"+
		"\2\2\2sq\3\2\2\2tu\7\16\2\2u\17\3\2\2\2vw\7\20\2\2wx\5\32\16\2x|\7\21"+
		"\2\2y{\5\n\6\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|"+
		"\3\2\2\2\177\u0080\7\22\2\2\u0080\21\3\2\2\2\u0081\u0082\7\23\2\2\u0082"+
		"\u0085\7\"\2\2\u0083\u0084\7\t\2\2\u0084\u0086\7\37\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0088\7\24\2\2\u0088"+
		"\u008a\5\32\16\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u008c\7\6\2\2\u008c\23\3\2\2\2\u008d\u008e\7\"\2\2\u008e"+
		"\u008f\7\24\2\2\u008f\u0090\5\32\16\2\u0090\25\3\2\2\2\u0091\u0092\7\""+
		"\2\2\u0092\u0093\7\7\2\2\u0093\u0094\5\34\17\2\u0094\u0095\7\b\2\2\u0095"+
		"\27\3\2\2\2\u0096\u0097\7\25\2\2\u0097\u0098\5\32\16\2\u0098\u0099\7\6"+
		"\2\2\u0099\31\3\2\2\2\u009a\u009b\b\16\1\2\u009b\u009c\7\7\2\2\u009c\u009d"+
		"\5\32\16\2\u009d\u009e\7\b\2\2\u009e\u00a6\3\2\2\2\u009f\u00a6\7#\2\2"+
		"\u00a0\u00a6\7\33\2\2\u00a1\u00a6\7!\2\2\u00a2\u00a6\7\"\2\2\u00a3\u00a6"+
		"\5 \21\2\u00a4\u00a6\5\26\f\2\u00a5\u009a\3\2\2\2\u00a5\u009f\3\2\2\2"+
		"\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00af\3\2\2\2\u00a7\u00a8\f\13\2\2"+
		"\u00a8\u00a9\t\3\2\2\u00a9\u00ae\5\32\16\f\u00aa\u00ab\f\3\2\2\u00ab\u00ac"+
		"\7 \2\2\u00ac\u00ae\5\32\16\4\u00ad\u00a7\3\2\2\2\u00ad\u00aa\3\2\2\2"+
		"\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\33"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\5\32\16\2\u00b3\u00b2\3\2\2\2"+
		"\u00b3\u00b4\3\2\2\2\u00b4\u00b9\3\2\2\2\u00b5\u00b6\7\34\2\2\u00b6\u00b8"+
		"\5\32\16\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2"+
		"\u00b9\u00ba\3\2\2\2\u00ba\35\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\7\"\2\2\u00bd\u00be\7\t\2\2\u00be\u00c0\7\37\2\2\u00bf\u00bc\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00c7\3\2\2\2\u00c1\u00c2\7\34\2\2\u00c2\u00c3"+
		"\7\"\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00c6\7\37\2\2\u00c5\u00c1\3\2\2\2"+
		"\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\37"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\35\2\2\u00cb\u00cc\5\32\16"+
		"\2\u00cc\u00cd\7\34\2\2\u00cd\u00ce\5\32\16\2\u00ce\u00cf\7\36\2\2\u00cf"+
		"!\3\2\2\2\25%,\65=GQZfq|\u0085\u0089\u00a5\u00ad\u00af\u00b3\u00b9\u00bf"+
		"\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}