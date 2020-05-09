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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, Type=44, String=45, 
		ID=46, Int=47, Comment=48, WS=49, ERRORS=50;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_functDef = 2, RULE_block = 3, RULE_statements = 4, 
		RULE_forStatement = 5, RULE_whileStatement = 6, RULE_ifStatement = 7, 
		RULE_elseIf = 8, RULE_elseStatement = 9, RULE_varDeclaration = 10, RULE_varAttrib = 11, 
		RULE_functionCall = 12, RULE_returnStat = 13, RULE_expr = 14, RULE_args = 15, 
		RULE_typedArgs = 16, RULE_point = 17, RULE_board = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "functDef", "block", "statements", "forStatement", 
			"whileStatement", "ifStatement", "elseIf", "elseStatement", "varDeclaration", 
			"varAttrib", "functionCall", "returnStat", "expr", "args", "typedArgs", 
			"point", "board"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "':'", "'end'", "';'", "'('", "')'", "'for'", "'from'", 
			"'to'", "'do'", "'done'", "'while'", "'if'", "'then'", "'else'", "'let'", 
			"'='", "'can_move'", "','", "'move'", "'print'", "'return'", "'*'", "'/'", 
			"'%'", "'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'=='", "'/='", "'null'", 
			"'width'", "'height'", "'current_player'", "'['", "']'", "'board'", "'.'", 
			"'piece_name'", "'owner'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Type", "String", "ID", 
			"Int", "Comment", "WS", "ERRORS"
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Type || _la==ID) {
				{
				{
				setState(38);
				functDef();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			main();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Type || _la==ID) {
				{
				{
				setState(45);
				functDef();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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
			setState(53);
			match(T__0);
			setState(54);
			match(T__1);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(55);
				statements();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(T__2);
			setState(62);
			match(T__0);
			setState(63);
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
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(65);
				match(Type);
				}
			}

			setState(68);
			((FunctDefContext)_localctx).func_name = match(ID);
			setState(69);
			match(T__4);
			setState(70);
			typedArgs();
			setState(71);
			match(T__5);
			setState(72);
			match(T__1);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(73);
				statements();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(T__2);
			setState(80);
			match(ID);
			setState(81);
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				forStatement();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				whileStatement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				varAttrib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				functionCall();
				setState(91);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				returnStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
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
		public ExprContext bottom;
		public ExprContext up;
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			setState(97);
			match(T__6);
			setState(98);
			((ForStatementContext)_localctx).var = match(ID);
			setState(99);
			match(T__7);
			setState(100);
			((ForStatementContext)_localctx).bottom = expr(0);
			setState(101);
			match(T__8);
			setState(102);
			((ForStatementContext)_localctx).up = expr(0);
			setState(103);
			match(T__9);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(104);
				statements();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(T__10);
			setState(111);
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
			setState(113);
			match(T__11);
			setState(114);
			expr(0);
			setState(115);
			match(T__9);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(116);
				statements();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(T__10);
			setState(123);
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
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__12);
			setState(126);
			expr(0);
			setState(127);
			match(T__13);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(128);
				statements();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					elseIf();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(140);
				elseStatement();
				}
			}

			setState(143);
			match(T__2);
			setState(144);
			match(T__12);
			setState(145);
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

	public static class ElseIfContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__14);
			setState(148);
			match(T__12);
			setState(149);
			expr(0);
			setState(150);
			match(T__13);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(151);
				statements();
				}
				}
				setState(156);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__14);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0)) {
				{
				{
				setState(158);
				statements();
				}
				}
				setState(163);
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
		enterRule(_localctx, 20, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__15);
			setState(165);
			match(ID);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(166);
				match(T__1);
				setState(167);
				match(Type);
				}
			}

			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(170);
				match(T__16);
				setState(171);
				expr(0);
				}
			}

			setState(174);
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
		enterRule(_localctx, 22, RULE_varAttrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((VarAttribContext)_localctx).var = match(ID);
			setState(177);
			match(T__16);
			setState(178);
			expr(0);
			setState(179);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CanMoveCallContext extends FunctionCallContext {
		public Token funcName;
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public CanMoveCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterCanMoveCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitCanMoveCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitCanMoveCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends FunctionCallContext {
		public Token funcName;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode ID() { return getToken(AbdlParser.ID, 0); }
		public FuncCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintCallContext extends FunctionCallContext {
		public Token funcName;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public PrintCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterPrintCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitPrintCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitPrintCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoveCallContext extends FunctionCallContext {
		public Token funcName;
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public MoveCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterMoveCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitMoveCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitMoveCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				_localctx = new CanMoveCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				((CanMoveCallContext)_localctx).funcName = match(T__17);
				setState(182);
				match(T__4);
				setState(183);
				point();
				setState(184);
				match(T__18);
				setState(185);
				point();
				setState(186);
				match(T__5);
				}
				break;
			case T__19:
				_localctx = new MoveCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				((MoveCallContext)_localctx).funcName = match(T__19);
				setState(189);
				match(T__4);
				setState(190);
				point();
				setState(191);
				match(T__18);
				setState(192);
				point();
				setState(193);
				match(T__5);
				}
				break;
			case T__20:
				_localctx = new PrintCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				((PrintCallContext)_localctx).funcName = match(T__20);
				setState(196);
				match(T__4);
				setState(197);
				args();
				setState(198);
				match(T__5);
				}
				break;
			case ID:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				((FuncCallContext)_localctx).funcName = match(ID);
				setState(201);
				match(T__4);
				setState(202);
				args();
				setState(203);
				match(T__5);
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
		enterRule(_localctx, 26, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__21);
			setState(208);
			expr(0);
			setState(209);
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
	public static class ExprBoardContext extends ExprContext {
		public BoardContext board() {
			return getRuleContext(BoardContext.class,0);
		}
		public ExprBoardContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprBoard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprBoard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprBoard(this);
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
		public Token op;
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
	public static class ExprCurrPlayerContext extends ExprContext {
		public ExprCurrPlayerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprCurrPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprCurrPlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprCurrPlayer(this);
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
	public static class ExprHeightContext extends ExprContext {
		public ExprHeightContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprHeight(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprWidthContext extends ExprContext {
		public ExprWidthContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterExprWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitExprWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitExprWidth(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new EpxrFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(212);
				functionCall();
				}
				break;
			case 2:
				{
				_localctx = new ExprBoardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				board();
				}
				break;
			case 3:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(T__4);
				setState(215);
				expr(0);
				setState(216);
				match(T__5);
				}
				break;
			case 4:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(Int);
				}
				break;
			case 5:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(String);
				}
				break;
			case 6:
				{
				_localctx = new ExprPointContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				point();
				}
				break;
			case 7:
				{
				_localctx = new ExprNullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(T__33);
				}
				break;
			case 8:
				{
				_localctx = new ExprWidthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(T__34);
				}
				break;
			case 9:
				{
				_localctx = new ExprHeightContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(T__35);
				}
				break;
			case 10:
				{
				_localctx = new ExprCurrPlayerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(T__36);
				}
				break;
			case 11:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(229);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(232);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(235);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(236);
						expr(13);
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << String) | (1L << ID) | (1L << Int))) != 0)) {
				{
				setState(242);
				expr(0);
				}
			}

			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(245);
				match(T__18);
				setState(246);
				expr(0);
				}
				}
				setState(251);
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
		enterRule(_localctx, 32, RULE_typedArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(252);
				match(ID);
				setState(253);
				match(T__1);
				setState(254);
				match(Type);
				}
			}

			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(257);
				match(T__18);
				{
				setState(258);
				match(ID);
				setState(259);
				match(T__1);
				setState(260);
				match(Type);
				}
				}
				}
				setState(265);
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
		enterRule(_localctx, 34, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__37);
			setState(267);
			expr(0);
			setState(268);
			match(T__18);
			setState(269);
			expr(0);
			setState(270);
			match(T__38);
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

	public static class BoardContext extends ParserRuleContext {
		public Token prop;
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public BoardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_board; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).enterBoard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbdlListener ) ((AbdlListener)listener).exitBoard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AbdlVisitor ) return ((AbdlVisitor<? extends T>)visitor).visitBoard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoardContext board() throws RecognitionException {
		BoardContext _localctx = new BoardContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_board);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__39);
			setState(273);
			point();
			setState(274);
			match(T__40);
			setState(275);
			((BoardContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
				((BoardContext)_localctx).prop = (Token)_errHandler.recoverInline(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0118\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\2\3\2\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3\3"+
		"\3\3\3\3\4\5\4E\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7"+
		"\t\u0084\n\t\f\t\16\t\u0087\13\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t"+
		"\3\t\5\t\u0090\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u009b\n\n\f"+
		"\n\16\n\u009e\13\n\3\13\3\13\7\13\u00a2\n\13\f\13\16\13\u00a5\13\13\3"+
		"\f\3\f\3\f\3\f\5\f\u00ab\n\f\3\f\3\f\5\f\u00af\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d0"+
		"\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e5\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00f0\n\20\f\20\16\20\u00f3\13\20\3\21\5\21"+
		"\u00f6\n\21\3\21\3\21\7\21\u00fa\n\21\f\21\16\21\u00fd\13\21\3\22\3\22"+
		"\3\22\5\22\u0102\n\22\3\22\3\22\3\22\3\22\7\22\u0108\n\22\f\22\16\22\u010b"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\2\3"+
		"\36\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\6\3\2\31\33\3\2\34"+
		"\35\3\2\36#\3\2,-\2\u012c\2+\3\2\2\2\4\67\3\2\2\2\6D\3\2\2\2\bX\3\2\2"+
		"\2\na\3\2\2\2\fc\3\2\2\2\16s\3\2\2\2\20\177\3\2\2\2\22\u0095\3\2\2\2\24"+
		"\u009f\3\2\2\2\26\u00a6\3\2\2\2\30\u00b2\3\2\2\2\32\u00cf\3\2\2\2\34\u00d1"+
		"\3\2\2\2\36\u00e4\3\2\2\2 \u00f5\3\2\2\2\"\u0101\3\2\2\2$\u010c\3\2\2"+
		"\2&\u0112\3\2\2\2(*\5\6\4\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,."+
		"\3\2\2\2-+\3\2\2\2.\62\5\4\3\2/\61\5\6\4\2\60/\3\2\2\2\61\64\3\2\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\2\2\3\66"+
		"\3\3\2\2\2\678\7\3\2\28<\7\4\2\29;\5\n\6\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2"+
		"\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\5\2\2@A\7\3\2\2AB\7\6\2\2B\5\3\2"+
		"\2\2CE\7.\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\60\2\2GH\7\7\2\2HI\5\""+
		"\22\2IJ\7\b\2\2JN\7\4\2\2KM\5\n\6\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3"+
		"\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\5\2\2RS\7\60\2\2ST\7\6\2\2T\7\3\2\2\2U"+
		"Y\5\f\7\2VY\5\16\b\2WY\5\20\t\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\t\3\2\2"+
		"\2Zb\5\26\f\2[b\5\30\r\2\\]\5\32\16\2]^\7\6\2\2^b\3\2\2\2_b\5\34\17\2"+
		"`b\5\b\5\2aZ\3\2\2\2a[\3\2\2\2a\\\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\13\3\2"+
		"\2\2cd\7\t\2\2de\7\60\2\2ef\7\n\2\2fg\5\36\20\2gh\7\13\2\2hi\5\36\20\2"+
		"im\7\f\2\2jl\5\n\6\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2"+
		"om\3\2\2\2pq\7\r\2\2qr\7\6\2\2r\r\3\2\2\2st\7\16\2\2tu\5\36\20\2uy\7\f"+
		"\2\2vx\5\n\6\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2"+
		"\2\2|}\7\r\2\2}~\7\6\2\2~\17\3\2\2\2\177\u0080\7\17\2\2\u0080\u0081\5"+
		"\36\20\2\u0081\u0085\7\20\2\2\u0082\u0084\5\n\6\2\u0083\u0082\3\2\2\2"+
		"\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008b"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\5\22\n\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\5\24\13\2\u008f\u008e\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\5\2\2\u0092\u0093"+
		"\7\17\2\2\u0093\u0094\7\6\2\2\u0094\21\3\2\2\2\u0095\u0096\7\21\2\2\u0096"+
		"\u0097\7\17\2\2\u0097\u0098\5\36\20\2\u0098\u009c\7\20\2\2\u0099\u009b"+
		"\5\n\6\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\23\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a3\7\21\2"+
		"\2\u00a0\u00a2\5\n\6\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\7\22\2\2\u00a7\u00aa\7\60\2\2\u00a8\u00a9\7\4\2\2\u00a9\u00ab\7"+
		".\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00ad\7\23\2\2\u00ad\u00af\5\36\20\2\u00ae\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\6\2\2\u00b1\27\3\2\2\2\u00b2"+
		"\u00b3\7\60\2\2\u00b3\u00b4\7\23\2\2\u00b4\u00b5\5\36\20\2\u00b5\u00b6"+
		"\7\6\2\2\u00b6\31\3\2\2\2\u00b7\u00b8\7\24\2\2\u00b8\u00b9\7\7\2\2\u00b9"+
		"\u00ba\5$\23\2\u00ba\u00bb\7\25\2\2\u00bb\u00bc\5$\23\2\u00bc\u00bd\7"+
		"\b\2\2\u00bd\u00d0\3\2\2\2\u00be\u00bf\7\26\2\2\u00bf\u00c0\7\7\2\2\u00c0"+
		"\u00c1\5$\23\2\u00c1\u00c2\7\25\2\2\u00c2\u00c3\5$\23\2\u00c3\u00c4\7"+
		"\b\2\2\u00c4\u00d0\3\2\2\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7\7\7\2\2\u00c7"+
		"\u00c8\5 \21\2\u00c8\u00c9\7\b\2\2\u00c9\u00d0\3\2\2\2\u00ca\u00cb\7\60"+
		"\2\2\u00cb\u00cc\7\7\2\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\7\b\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00b7\3\2\2\2\u00cf\u00be\3\2\2\2\u00cf\u00c5\3\2"+
		"\2\2\u00cf\u00ca\3\2\2\2\u00d0\33\3\2\2\2\u00d1\u00d2\7\30\2\2\u00d2\u00d3"+
		"\5\36\20\2\u00d3\u00d4\7\6\2\2\u00d4\35\3\2\2\2\u00d5\u00d6\b\20\1\2\u00d6"+
		"\u00e5\5\32\16\2\u00d7\u00e5\5&\24\2\u00d8\u00d9\7\7\2\2\u00d9\u00da\5"+
		"\36\20\2\u00da\u00db\7\b\2\2\u00db\u00e5\3\2\2\2\u00dc\u00e5\7\61\2\2"+
		"\u00dd\u00e5\7/\2\2\u00de\u00e5\5$\23\2\u00df\u00e5\7$\2\2\u00e0\u00e5"+
		"\7%\2\2\u00e1\u00e5\7&\2\2\u00e2\u00e5\7\'\2\2\u00e3\u00e5\7\60\2\2\u00e4"+
		"\u00d5\3\2\2\2\u00e4\u00d7\3\2\2\2\u00e4\u00d8\3\2\2\2\u00e4\u00dc\3\2"+
		"\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4"+
		"\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5\u00f1\3\2\2\2\u00e6\u00e7\f\20\2\2\u00e7\u00e8\t\2\2\2\u00e8"+
		"\u00f0\5\36\20\21\u00e9\u00ea\f\17\2\2\u00ea\u00eb\t\3\2\2\u00eb\u00f0"+
		"\5\36\20\20\u00ec\u00ed\f\16\2\2\u00ed\u00ee\t\4\2\2\u00ee\u00f0\5\36"+
		"\20\17\u00ef\u00e6\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\37\3\2\2"+
		"\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6\5\36\20\2\u00f5\u00f4\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00fb\3\2\2\2\u00f7\u00f8\7\25\2\2\u00f8\u00fa\5"+
		"\36\20\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc!\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7\60\2\2"+
		"\u00ff\u0100\7\4\2\2\u0100\u0102\7.\2\2\u0101\u00fe\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0109\3\2\2\2\u0103\u0104\7\25\2\2\u0104\u0105\7\60\2\2"+
		"\u0105\u0106\7\4\2\2\u0106\u0108\7.\2\2\u0107\u0103\3\2\2\2\u0108\u010b"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a#\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010d\7(\2\2\u010d\u010e\5\36\20\2\u010e\u010f\7"+
		"\25\2\2\u010f\u0110\5\36\20\2\u0110\u0111\7)\2\2\u0111%\3\2\2\2\u0112"+
		"\u0113\7*\2\2\u0113\u0114\5$\23\2\u0114\u0115\7+\2\2\u0115\u0116\t\5\2"+
		"\2\u0116\'\3\2\2\2\32+\62<DNXamy\u0085\u008b\u008f\u009c\u00a3\u00aa\u00ae"+
		"\u00cf\u00e4\u00ef\u00f1\u00f5\u00fb\u0101\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}