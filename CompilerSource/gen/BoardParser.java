// Generated from D:/dev/BDL-Board-Description-Language/CompilerSource/src\Board.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BoardParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, INT=36, BOOL=37, EXPLICIT=38, 
		ID=39, WS=40;
	public static final int
		RULE_game = 0, RULE_ruleSet = 1, RULE_ruleDef = 2, RULE_pieceDescriptions = 3, 
		RULE_pieceDescription = 4, RULE_moves = 5, RULE_move = 6, RULE_moveFunction = 7, 
		RULE_kills = 8, RULE_descriptionModifier = 9, RULE_onEndReached = 10, 
		RULE_endReachedAlternatives = 11, RULE_initialPiecePositions = 12, RULE_initialPiecePosition = 13, 
		RULE_positions = 14, RULE_positionModifier = 15, RULE_invariantList = 16, 
		RULE_invariant = 17, RULE_finish = 18, RULE_finishingRules = 19, RULE_vector = 20, 
		RULE_interval = 21, RULE_explicitParsed = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"game", "ruleSet", "ruleDef", "pieceDescriptions", "pieceDescription", 
			"moves", "move", "moveFunction", "kills", "descriptionModifier", "onEndReached", 
			"endReachedAlternatives", "initialPiecePositions", "initialPiecePosition", 
			"positions", "positionModifier", "invariantList", "invariant", "finish", 
			"finishingRules", "vector", "interval", "explicitParsed"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'rules'", "'{'", "'}'", "'first_player'", "':'", "'width'", "'height'", 
			"'coloring'", "'alternate'", "'player_change'", "'pieces'", "'moves'", 
			"'horizontal'", "'('", "','", "')'", "'vertical'", "'diagonal'", "'kills'", 
			"'can_jump'", "'mirrored'", "'on_end_reached'", "'spawn'", "'initial_piece_position'", 
			"'positions'", "'invariants'", "'cant_risk'", "'protect_piece'", "'pawn_movement'", 
			"'finish'", "'no_moves_available'", "'x'", "'y'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INT", "BOOL", "EXPLICIT", "ID", "WS"
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
	public String getGrammarFileName() { return "Board.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BoardParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GameContext extends ParserRuleContext {
		public RuleSetContext ruleSet() {
			return getRuleContext(RuleSetContext.class,0);
		}
		public PieceDescriptionsContext pieceDescriptions() {
			return getRuleContext(PieceDescriptionsContext.class,0);
		}
		public InitialPiecePositionsContext initialPiecePositions() {
			return getRuleContext(InitialPiecePositionsContext.class,0);
		}
		public InvariantListContext invariantList() {
			return getRuleContext(InvariantListContext.class,0);
		}
		public FinishContext finish() {
			return getRuleContext(FinishContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BoardParser.EOF, 0); }
		public GameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitGame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitGame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameContext game() throws RecognitionException {
		GameContext _localctx = new GameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_game);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			ruleSet();
			setState(47);
			pieceDescriptions();
			setState(48);
			initialPiecePositions();
			setState(49);
			invariantList();
			setState(50);
			finish();
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

	public static class RuleSetContext extends ParserRuleContext {
		public RuleDefContext ruleDef() {
			return getRuleContext(RuleDefContext.class,0);
		}
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitRuleSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitRuleSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruleSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__0);
			setState(54);
			match(T__1);
			setState(55);
			ruleDef();
			setState(56);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleDefContext extends ParserRuleContext {
		public List<IntervalContext> interval() {
			return getRuleContexts(IntervalContext.class);
		}
		public IntervalContext interval(int i) {
			return getRuleContext(IntervalContext.class,i);
		}
		public List<ExplicitParsedContext> explicitParsed() {
			return getRuleContexts(ExplicitParsedContext.class);
		}
		public ExplicitParsedContext explicitParsed(int i) {
			return getRuleContext(ExplicitParsedContext.class,i);
		}
		public RuleDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterRuleDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitRuleDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitRuleDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleDefContext ruleDef() throws RecognitionException {
		RuleDefContext _localctx = new RuleDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ruleDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9))) != 0)) {
				{
				setState(79);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(58);
					match(T__3);
					setState(59);
					match(T__4);
					setState(60);
					interval();
					}
					break;
				case T__5:
					{
					setState(61);
					match(T__5);
					setState(62);
					match(T__4);
					setState(63);
					interval();
					}
					break;
				case T__6:
					{
					setState(64);
					match(T__6);
					setState(65);
					match(T__4);
					setState(66);
					interval();
					}
					break;
				case T__7:
					{
					setState(67);
					match(T__7);
					setState(68);
					match(T__4);
					setState(71);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(69);
						match(T__8);
						}
						break;
					case EXPLICIT:
						{
						setState(70);
						explicitParsed();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case T__9:
					{
					setState(73);
					match(T__9);
					setState(74);
					match(T__4);
					setState(77);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(75);
						match(T__8);
						}
						break;
					case EXPLICIT:
						{
						setState(76);
						explicitParsed();
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
				}
				setState(83);
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

	public static class PieceDescriptionsContext extends ParserRuleContext {
		public List<PieceDescriptionContext> pieceDescription() {
			return getRuleContexts(PieceDescriptionContext.class);
		}
		public PieceDescriptionContext pieceDescription(int i) {
			return getRuleContext(PieceDescriptionContext.class,i);
		}
		public PieceDescriptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieceDescriptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPieceDescriptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPieceDescriptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPieceDescriptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PieceDescriptionsContext pieceDescriptions() throws RecognitionException {
		PieceDescriptionsContext _localctx = new PieceDescriptionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pieceDescriptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__10);
			setState(85);
			match(T__1);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPLICIT || _la==ID) {
				{
				{
				setState(86);
				pieceDescription();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PieceDescriptionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BoardParser.ID, 0); }
		public MovesContext moves() {
			return getRuleContext(MovesContext.class,0);
		}
		public List<DescriptionModifierContext> descriptionModifier() {
			return getRuleContexts(DescriptionModifierContext.class);
		}
		public DescriptionModifierContext descriptionModifier(int i) {
			return getRuleContext(DescriptionModifierContext.class,i);
		}
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public PieceDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieceDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPieceDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPieceDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPieceDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PieceDescriptionContext pieceDescription() throws RecognitionException {
		PieceDescriptionContext _localctx = new PieceDescriptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pieceDescription);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(ID);
				setState(95);
				match(T__1);
				setState(96);
				moves();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << EXPLICIT))) != 0)) {
					{
					{
					setState(97);
					descriptionModifier();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(T__2);
				}
				break;
			case EXPLICIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				explicitParsed();
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

	public static class MovesContext extends ParserRuleContext {
		public List<MoveContext> move() {
			return getRuleContexts(MoveContext.class);
		}
		public MoveContext move(int i) {
			return getRuleContext(MoveContext.class,i);
		}
		public MovesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterMoves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitMoves(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitMoves(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovesContext moves() throws RecognitionException {
		MovesContext _localctx = new MovesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_moves);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__11);
			setState(109);
			match(T__1);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__31) | (1L << EXPLICIT))) != 0)) {
				{
				{
				setState(110);
				move();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoveContext extends ParserRuleContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public MoveFunctionContext moveFunction() {
			return getRuleContext(MoveFunctionContext.class,0);
		}
		public KillsContext kills() {
			return getRuleContext(KillsContext.class,0);
		}
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_move);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__31:
					{
					setState(118);
					vector();
					}
					break;
				case T__12:
				case T__16:
				case T__17:
				case EXPLICIT:
					{
					setState(119);
					moveFunction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14 || _la==T__18) {
					{
					setState(122);
					kills();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				explicitParsed();
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

	public static class MoveFunctionContext extends ParserRuleContext {
		public MoveFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveFunction; }
	 
		public MoveFunctionContext() { }
		public void copyFrom(MoveFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoveFunctionDiagonalContext extends MoveFunctionContext {
		public IntervalContext e1;
		public IntervalContext e2;
		public List<IntervalContext> interval() {
			return getRuleContexts(IntervalContext.class);
		}
		public IntervalContext interval(int i) {
			return getRuleContext(IntervalContext.class,i);
		}
		public MoveFunctionDiagonalContext(MoveFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterMoveFunctionDiagonal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitMoveFunctionDiagonal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitMoveFunctionDiagonal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoveFunctionExplicitContext extends MoveFunctionContext {
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public MoveFunctionExplicitContext(MoveFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterMoveFunctionExplicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitMoveFunctionExplicit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitMoveFunctionExplicit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoveFunctionHorizontalContext extends MoveFunctionContext {
		public IntervalContext e1;
		public IntervalContext e2;
		public List<IntervalContext> interval() {
			return getRuleContexts(IntervalContext.class);
		}
		public IntervalContext interval(int i) {
			return getRuleContext(IntervalContext.class,i);
		}
		public MoveFunctionHorizontalContext(MoveFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterMoveFunctionHorizontal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitMoveFunctionHorizontal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitMoveFunctionHorizontal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoveFunctionVerticalContext extends MoveFunctionContext {
		public IntervalContext e1;
		public IntervalContext e2;
		public List<IntervalContext> interval() {
			return getRuleContexts(IntervalContext.class);
		}
		public IntervalContext interval(int i) {
			return getRuleContext(IntervalContext.class,i);
		}
		public MoveFunctionVerticalContext(MoveFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterMoveFunctionVertical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitMoveFunctionVertical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitMoveFunctionVertical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveFunctionContext moveFunction() throws RecognitionException {
		MoveFunctionContext _localctx = new MoveFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moveFunction);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new MoveFunctionHorizontalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__12);
				setState(129);
				match(T__13);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__33 || _la==INT) {
					{
					setState(130);
					((MoveFunctionHorizontalContext)_localctx).e1 = interval();
					}
				}

				setState(133);
				match(T__14);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__33 || _la==INT) {
					{
					setState(134);
					((MoveFunctionHorizontalContext)_localctx).e2 = interval();
					}
				}

				setState(137);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new MoveFunctionVerticalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__16);
				setState(139);
				match(T__13);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__33 || _la==INT) {
					{
					setState(140);
					((MoveFunctionVerticalContext)_localctx).e1 = interval();
					}
				}

				setState(143);
				match(T__14);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__33 || _la==INT) {
					{
					setState(144);
					((MoveFunctionVerticalContext)_localctx).e2 = interval();
					}
				}

				setState(147);
				match(T__15);
				}
				break;
			case T__17:
				_localctx = new MoveFunctionDiagonalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(T__17);
				setState(149);
				match(T__13);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__33 || _la==INT) {
					{
					setState(150);
					((MoveFunctionDiagonalContext)_localctx).e1 = interval();
					}
				}

				setState(153);
				match(T__14);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__33 || _la==INT) {
					{
					setState(154);
					((MoveFunctionDiagonalContext)_localctx).e2 = interval();
					}
				}

				setState(157);
				match(T__15);
				}
				break;
			case EXPLICIT:
				_localctx = new MoveFunctionExplicitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				explicitParsed();
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

	public static class KillsContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(BoardParser.BOOL, 0); }
		public KillsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kills; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterKills(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitKills(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitKills(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KillsContext kills() throws RecognitionException {
		KillsContext _localctx = new KillsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_kills);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(161);
				match(T__14);
				}
			}

			setState(164);
			match(T__18);
			setState(165);
			match(T__4);
			setState(166);
			match(BOOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptionModifierContext extends ParserRuleContext {
		public OnEndReachedContext onEndReached() {
			return getRuleContext(OnEndReachedContext.class,0);
		}
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public DescriptionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterDescriptionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitDescriptionModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitDescriptionModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionModifierContext descriptionModifier() throws RecognitionException {
		DescriptionModifierContext _localctx = new DescriptionModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_descriptionModifier);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__19);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				onEndReached();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(T__20);
				}
				break;
			case EXPLICIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				explicitParsed();
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

	public static class OnEndReachedContext extends ParserRuleContext {
		public EndReachedAlternativesContext endReachedAlternatives() {
			return getRuleContext(EndReachedAlternativesContext.class,0);
		}
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public OnEndReachedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onEndReached; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterOnEndReached(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitOnEndReached(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitOnEndReached(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnEndReachedContext onEndReached() throws RecognitionException {
		OnEndReachedContext _localctx = new OnEndReachedContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_onEndReached);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__21);
			setState(175);
			match(T__4);
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				{
				setState(176);
				endReachedAlternatives();
				}
				break;
			case EXPLICIT:
				{
				setState(177);
				explicitParsed();
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

	public static class EndReachedAlternativesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BoardParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BoardParser.ID, i);
		}
		public EndReachedAlternativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endReachedAlternatives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterEndReachedAlternatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitEndReachedAlternatives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitEndReachedAlternatives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndReachedAlternativesContext endReachedAlternatives() throws RecognitionException {
		EndReachedAlternativesContext _localctx = new EndReachedAlternativesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_endReachedAlternatives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__22);
			setState(181);
			match(T__13);
			setState(182);
			match(ID);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(183);
				match(T__14);
				setState(184);
				match(ID);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
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

	public static class InitialPiecePositionsContext extends ParserRuleContext {
		public List<InitialPiecePositionContext> initialPiecePosition() {
			return getRuleContexts(InitialPiecePositionContext.class);
		}
		public InitialPiecePositionContext initialPiecePosition(int i) {
			return getRuleContext(InitialPiecePositionContext.class,i);
		}
		public InitialPiecePositionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialPiecePositions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterInitialPiecePositions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitInitialPiecePositions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitInitialPiecePositions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialPiecePositionsContext initialPiecePositions() throws RecognitionException {
		InitialPiecePositionsContext _localctx = new InitialPiecePositionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_initialPiecePositions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__23);
			setState(193);
			match(T__1);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPLICIT || _la==ID) {
				{
				{
				setState(194);
				initialPiecePosition();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialPiecePositionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BoardParser.ID, 0); }
		public List<PositionsContext> positions() {
			return getRuleContexts(PositionsContext.class);
		}
		public PositionsContext positions(int i) {
			return getRuleContext(PositionsContext.class,i);
		}
		public List<PositionModifierContext> positionModifier() {
			return getRuleContexts(PositionModifierContext.class);
		}
		public PositionModifierContext positionModifier(int i) {
			return getRuleContext(PositionModifierContext.class,i);
		}
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public InitialPiecePositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialPiecePosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterInitialPiecePosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitInitialPiecePosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitInitialPiecePosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialPiecePositionContext initialPiecePosition() throws RecognitionException {
		InitialPiecePositionContext _localctx = new InitialPiecePositionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initialPiecePosition);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(ID);
				setState(203);
				match(T__1);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20 || _la==T__24) {
					{
					setState(206);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__24:
						{
						setState(204);
						positions();
						}
						break;
					case T__20:
						{
						setState(205);
						positionModifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(T__2);
				}
				break;
			case EXPLICIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				explicitParsed();
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

	public static class PositionsContext extends ParserRuleContext {
		public List<VectorContext> vector() {
			return getRuleContexts(VectorContext.class);
		}
		public VectorContext vector(int i) {
			return getRuleContext(VectorContext.class,i);
		}
		public PositionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPositions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPositions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPositions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionsContext positions() throws RecognitionException {
		PositionsContext _localctx = new PositionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_positions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__24);
			setState(216);
			match(T__1);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(217);
				vector();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionModifierContext extends ParserRuleContext {
		public PositionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPositionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPositionModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPositionModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionModifierContext positionModifier() throws RecognitionException {
		PositionModifierContext _localctx = new PositionModifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_positionModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvariantListContext extends ParserRuleContext {
		public List<InvariantContext> invariant() {
			return getRuleContexts(InvariantContext.class);
		}
		public InvariantContext invariant(int i) {
			return getRuleContext(InvariantContext.class,i);
		}
		public InvariantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterInvariantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitInvariantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitInvariantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantListContext invariantList() throws RecognitionException {
		InvariantListContext _localctx = new InvariantListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_invariantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__25);
			setState(228);
			match(T__1);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << EXPLICIT))) != 0)) {
				{
				{
				setState(229);
				invariant();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvariantContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BoardParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BoardParser.ID, i);
		}
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public InvariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterInvariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitInvariant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitInvariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantContext invariant() throws RecognitionException {
		InvariantContext _localctx = new InvariantContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_invariant);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(T__26);
				setState(238);
				match(T__13);
				setState(239);
				match(ID);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(240);
					match(T__14);
					setState(241);
					match(ID);
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(T__15);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__27);
				setState(249);
				match(T__13);
				setState(250);
				match(ID);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(251);
					match(T__14);
					setState(252);
					match(ID);
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				match(T__15);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(T__28);
				setState(260);
				match(T__13);
				setState(261);
				match(ID);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(262);
					match(T__14);
					setState(263);
					match(ID);
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				match(T__15);
				}
				break;
			case EXPLICIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				explicitParsed();
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

	public static class FinishContext extends ParserRuleContext {
		public FinishingRulesContext finishingRules() {
			return getRuleContext(FinishingRulesContext.class,0);
		}
		public FinishContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finish; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterFinish(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitFinish(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitFinish(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinishContext finish() throws RecognitionException {
		FinishContext _localctx = new FinishContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_finish);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__29);
			setState(274);
			match(T__1);
			setState(275);
			finishingRules();
			setState(276);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinishingRulesContext extends ParserRuleContext {
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public FinishingRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finishingRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterFinishingRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitFinishingRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitFinishingRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinishingRulesContext finishingRules() throws RecognitionException {
		FinishingRulesContext _localctx = new FinishingRulesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_finishingRules);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(T__30);
				}
				break;
			case EXPLICIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				explicitParsed();
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

	public static class VectorContext extends ParserRuleContext {
		public IntervalContext e1;
		public IntervalContext e2;
		public List<IntervalContext> interval() {
			return getRuleContexts(IntervalContext.class);
		}
		public IntervalContext interval(int i) {
			return getRuleContext(IntervalContext.class,i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__31);
			setState(283);
			match(T__4);
			setState(284);
			((VectorContext)_localctx).e1 = interval();
			setState(285);
			match(T__14);
			setState(286);
			match(T__32);
			setState(287);
			match(T__4);
			setState(288);
			((VectorContext)_localctx).e2 = interval();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(BoardParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(BoardParser.INT, i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_interval);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(290);
				match(T__33);
				setState(291);
				match(INT);
				setState(292);
				match(T__14);
				setState(293);
				match(INT);
				setState(294);
				match(T__34);
				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(INT);
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

	public static class ExplicitParsedContext extends ParserRuleContext {
		public TerminalNode EXPLICIT() { return getToken(BoardParser.EXPLICIT, 0); }
		public ExplicitParsedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitParsed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterExplicitParsed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitExplicitParsed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitExplicitParsed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitParsedContext explicitParsed() throws RecognitionException {
		ExplicitParsedContext _localctx = new ExplicitParsedContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_explicitParsed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(EXPLICIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u012f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\5\4P\n\4\7\4R\n\4\f\4\16"+
		"\4U\13\4\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6e\n\6\f\6\16\6h\13\6\3\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\7\7r\n\7\f\7\16"+
		"\7u\13\7\3\7\3\7\3\b\3\b\5\b{\n\b\3\b\5\b~\n\b\3\b\5\b\u0081\n\b\3\t\3"+
		"\t\3\t\5\t\u0086\n\t\3\t\3\t\5\t\u008a\n\t\3\t\3\t\3\t\3\t\5\t\u0090\n"+
		"\t\3\t\3\t\5\t\u0094\n\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\t\3\t\5\t\u009e"+
		"\n\t\3\t\3\t\5\t\u00a2\n\t\3\n\5\n\u00a5\n\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\5\13\u00af\n\13\3\f\3\f\3\f\3\f\5\f\u00b5\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u00bc\n\r\f\r\16\r\u00bf\13\r\3\r\3\r\3\16\3\16\3\16\7\16\u00c6"+
		"\n\16\f\16\16\16\u00c9\13\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00d1"+
		"\n\17\f\17\16\17\u00d4\13\17\3\17\3\17\5\17\u00d8\n\17\3\20\3\20\3\20"+
		"\7\20\u00dd\n\20\f\20\16\20\u00e0\13\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\7\22\u00e9\n\22\f\22\16\22\u00ec\13\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00f5\n\23\f\23\16\23\u00f8\13\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u0100\n\23\f\23\16\23\u0103\13\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u010b\n\23\f\23\16\23\u010e\13\23\3\23\3\23\5\23\u0112"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u011b\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u012b\n\27"+
		"\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\2\2\2\u0142\2\60\3\2\2\2\4\67\3\2\2\2\6S\3\2\2\2\bV\3\2\2\2\nl\3\2\2"+
		"\2\fn\3\2\2\2\16\u0080\3\2\2\2\20\u00a1\3\2\2\2\22\u00a4\3\2\2\2\24\u00ae"+
		"\3\2\2\2\26\u00b0\3\2\2\2\30\u00b6\3\2\2\2\32\u00c2\3\2\2\2\34\u00d7\3"+
		"\2\2\2\36\u00d9\3\2\2\2 \u00e3\3\2\2\2\"\u00e5\3\2\2\2$\u0111\3\2\2\2"+
		"&\u0113\3\2\2\2(\u011a\3\2\2\2*\u011c\3\2\2\2,\u012a\3\2\2\2.\u012c\3"+
		"\2\2\2\60\61\5\4\3\2\61\62\5\b\5\2\62\63\5\32\16\2\63\64\5\"\22\2\64\65"+
		"\5&\24\2\65\66\7\2\2\3\66\3\3\2\2\2\678\7\3\2\289\7\4\2\29:\5\6\4\2:;"+
		"\7\5\2\2;\5\3\2\2\2<=\7\6\2\2=>\7\7\2\2>R\5,\27\2?@\7\b\2\2@A\7\7\2\2"+
		"AR\5,\27\2BC\7\t\2\2CD\7\7\2\2DR\5,\27\2EF\7\n\2\2FI\7\7\2\2GJ\7\13\2"+
		"\2HJ\5.\30\2IG\3\2\2\2IH\3\2\2\2JR\3\2\2\2KL\7\f\2\2LO\7\7\2\2MP\7\13"+
		"\2\2NP\5.\30\2OM\3\2\2\2ON\3\2\2\2PR\3\2\2\2Q<\3\2\2\2Q?\3\2\2\2QB\3\2"+
		"\2\2QE\3\2\2\2QK\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\7\3\2\2\2US\3"+
		"\2\2\2VW\7\r\2\2W[\7\4\2\2XZ\5\n\6\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\5\2\2_\t\3\2\2\2`a\7)\2\2ab\7\4\2\2"+
		"bf\5\f\7\2ce\5\24\13\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2"+
		"\2hf\3\2\2\2ij\7\5\2\2jm\3\2\2\2km\5.\30\2l`\3\2\2\2lk\3\2\2\2m\13\3\2"+
		"\2\2no\7\16\2\2os\7\4\2\2pr\5\16\b\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3"+
		"\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\5\2\2w\r\3\2\2\2x{\5*\26\2y{\5\20\t\2z"+
		"x\3\2\2\2zy\3\2\2\2{}\3\2\2\2|~\5\22\n\2}|\3\2\2\2}~\3\2\2\2~\u0081\3"+
		"\2\2\2\177\u0081\5.\30\2\u0080z\3\2\2\2\u0080\177\3\2\2\2\u0081\17\3\2"+
		"\2\2\u0082\u0083\7\17\2\2\u0083\u0085\7\20\2\2\u0084\u0086\5,\27\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\7\21"+
		"\2\2\u0088\u008a\5,\27\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u00a2\7\22\2\2\u008c\u008d\7\23\2\2\u008d\u008f\7"+
		"\20\2\2\u008e\u0090\5,\27\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\7\21\2\2\u0092\u0094\5,\27\2\u0093\u0092\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u00a2\7\22\2\2\u0096"+
		"\u0097\7\24\2\2\u0097\u0099\7\20\2\2\u0098\u009a\5,\27\2\u0099\u0098\3"+
		"\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7\21\2\2\u009c"+
		"\u009e\5,\27\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a2\7\22\2\2\u00a0\u00a2\5.\30\2\u00a1\u0082\3\2\2\2\u00a1"+
		"\u008c\3\2\2\2\u00a1\u0096\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\21\3\2\2"+
		"\2\u00a3\u00a5\7\21\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\7\25\2\2\u00a7\u00a8\7\7\2\2\u00a8\u00a9\7"+
		"\'\2\2\u00a9\23\3\2\2\2\u00aa\u00af\7\26\2\2\u00ab\u00af\5\26\f\2\u00ac"+
		"\u00af\7\27\2\2\u00ad\u00af\5.\30\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3"+
		"\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\25\3\2\2\2\u00b0"+
		"\u00b1\7\30\2\2\u00b1\u00b4\7\7\2\2\u00b2\u00b5\5\30\r\2\u00b3\u00b5\5"+
		".\30\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\27\3\2\2\2\u00b6"+
		"\u00b7\7\31\2\2\u00b7\u00b8\7\20\2\2\u00b8\u00bd\7)\2\2\u00b9\u00ba\7"+
		"\21\2\2\u00ba\u00bc\7)\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c1\7\22\2\2\u00c1\31\3\2\2\2\u00c2\u00c3\7\32\2\2\u00c3"+
		"\u00c7\7\4\2\2\u00c4\u00c6\5\34\17\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\7\5\2\2\u00cb\33\3\2\2\2\u00cc\u00cd\7)\2\2"+
		"\u00cd\u00d2\7\4\2\2\u00ce\u00d1\5\36\20\2\u00cf\u00d1\5 \21\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\7\5"+
		"\2\2\u00d6\u00d8\5.\30\2\u00d7\u00cc\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\35\3\2\2\2\u00d9\u00da\7\33\2\2\u00da\u00de\7\4\2\2\u00db\u00dd\5*\26"+
		"\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\5\2\2\u00e2"+
		"\37\3\2\2\2\u00e3\u00e4\7\27\2\2\u00e4!\3\2\2\2\u00e5\u00e6\7\34\2\2\u00e6"+
		"\u00ea\7\4\2\2\u00e7\u00e9\5$\23\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\7\5\2\2\u00ee#\3\2\2\2\u00ef\u00f0\7\35\2\2"+
		"\u00f0\u00f1\7\20\2\2\u00f1\u00f6\7)\2\2\u00f2\u00f3\7\21\2\2\u00f3\u00f5"+
		"\7)\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u0112\7\22"+
		"\2\2\u00fa\u00fb\7\36\2\2\u00fb\u00fc\7\20\2\2\u00fc\u0101\7)\2\2\u00fd"+
		"\u00fe\7\21\2\2\u00fe\u0100\7)\2\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0112\7\22\2\2\u0105\u0106\7\37\2\2\u0106\u0107\7"+
		"\20\2\2\u0107\u010c\7)\2\2\u0108\u0109\7\21\2\2\u0109\u010b\7)\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0112\7\22\2\2\u0110"+
		"\u0112\5.\30\2\u0111\u00ef\3\2\2\2\u0111\u00fa\3\2\2\2\u0111\u0105\3\2"+
		"\2\2\u0111\u0110\3\2\2\2\u0112%\3\2\2\2\u0113\u0114\7 \2\2\u0114\u0115"+
		"\7\4\2\2\u0115\u0116\5(\25\2\u0116\u0117\7\5\2\2\u0117\'\3\2\2\2\u0118"+
		"\u011b\7!\2\2\u0119\u011b\5.\30\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2"+
		"\2\2\u011b)\3\2\2\2\u011c\u011d\7\"\2\2\u011d\u011e\7\7\2\2\u011e\u011f"+
		"\5,\27\2\u011f\u0120\7\21\2\2\u0120\u0121\7#\2\2\u0121\u0122\7\7\2\2\u0122"+
		"\u0123\5,\27\2\u0123+\3\2\2\2\u0124\u0125\7$\2\2\u0125\u0126\7&\2\2\u0126"+
		"\u0127\7\21\2\2\u0127\u0128\7&\2\2\u0128\u012b\7%\2\2\u0129\u012b\7&\2"+
		"\2\u012a\u0124\3\2\2\2\u012a\u0129\3\2\2\2\u012b-\3\2\2\2\u012c\u012d"+
		"\7(\2\2\u012d/\3\2\2\2$IOQS[flsz}\u0080\u0085\u0089\u008f\u0093\u0099"+
		"\u009d\u00a1\u00a4\u00ae\u00b4\u00bd\u00c7\u00d0\u00d2\u00d7\u00de\u00ea"+
		"\u00f6\u0101\u010c\u0111\u011a\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}