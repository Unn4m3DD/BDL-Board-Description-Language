// Generated from C:/dev/BDL-Board-Description-Language/CompilerSource/src\Board.g4 by ANTLR 4.8
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INT=37, BOOL=38, EXPLICIT=39, 
		ID=40, WS=41;
	public static final int
		RULE_game = 0, RULE_ruleSet = 1, RULE_ruleDef = 2, RULE_pieceDescriptions = 3, 
		RULE_pieceDescription = 4, RULE_moves = 5, RULE_move = 6, RULE_moveFunction = 7, 
		RULE_kills = 8, RULE_descriptionModifier = 9, RULE_endReachedAlternatives = 10, 
		RULE_initialPiecePositions = 11, RULE_initialPiecePosition = 12, RULE_positions = 13, 
		RULE_positionModifier = 14, RULE_invariantList = 15, RULE_invariant = 16, 
		RULE_finish = 17, RULE_finishingRules = 18, RULE_vector = 19, RULE_interval = 20, 
		RULE_explicitParsed = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"game", "ruleSet", "ruleDef", "pieceDescriptions", "pieceDescription", 
			"moves", "move", "moveFunction", "kills", "descriptionModifier", "endReachedAlternatives", 
			"initialPiecePositions", "initialPiecePosition", "positions", "positionModifier", 
			"invariantList", "invariant", "finish", "finishingRules", "vector", "interval", 
			"explicitParsed"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'rules'", "'{'", "'}'", "'first_player'", "':'", "'width'", "'height'", 
			"'coloring'", "'alternate'", "'player_change'", "'pieces'", "'moves'", 
			"'horizontal'", "'('", "','", "')'", "'vertical'", "'diagonal'", "'kills'", 
			"'can_jump'", "'mirrored'", "'on_end_reached'", "'spawn'", "'initial_piece_position'", 
			"'positions'", "'owner'", "'invariants'", "'cant_risk'", "'protect_piece'", 
			"'pawn_movement'", "'finish'", "'no_moves_available'", "'x'", "'y'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT", "BOOL", "EXPLICIT", "ID", "WS"
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
			setState(44);
			ruleSet();
			setState(45);
			pieceDescriptions();
			setState(46);
			initialPiecePositions();
			setState(47);
			invariantList();
			setState(48);
			finish();
			setState(49);
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
		public List<RuleDefContext> ruleDef() {
			return getRuleContexts(RuleDefContext.class);
		}
		public RuleDefContext ruleDef(int i) {
			return getRuleContext(RuleDefContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(T__1);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9))) != 0)) {
				{
				{
				setState(53);
				ruleDef();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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
		public RuleDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDef; }
	 
		public RuleDefContext() { }
		public void copyFrom(RuleDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RulePropContext extends RuleDefContext {
		public TerminalNode INT() { return getToken(BoardParser.INT, 0); }
		public RulePropContext(RuleDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterRuleProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitRuleProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitRuleProp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RuleColoringContext extends RuleDefContext {
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public RuleColoringContext(RuleDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterRuleColoring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitRuleColoring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitRuleColoring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RulePlayerChangeContext extends RuleDefContext {
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public RulePlayerChangeContext(RuleDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterRulePlayerChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitRulePlayerChange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitRulePlayerChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleDefContext ruleDef() throws RecognitionException {
		RuleDefContext _localctx = new RuleDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ruleDef);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new RulePropContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__3);
				setState(62);
				match(T__4);
				setState(63);
				match(INT);
				}
				break;
			case T__5:
				_localctx = new RulePropContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(T__5);
				setState(65);
				match(T__4);
				setState(66);
				match(INT);
				}
				break;
			case T__6:
				_localctx = new RulePropContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(T__6);
				setState(68);
				match(T__4);
				setState(69);
				match(INT);
				}
				break;
			case T__7:
				_localctx = new RuleColoringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(T__7);
				setState(71);
				match(T__4);
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(72);
					match(T__8);
					}
					break;
				case EXPLICIT:
					{
					setState(73);
					explicitParsed();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__9:
				_localctx = new RulePlayerChangeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(T__9);
				setState(77);
				match(T__4);
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(78);
					match(T__8);
					}
					break;
				case EXPLICIT:
					{
					setState(79);
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
		catch (RecognitionException re) {
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
		public PieceDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieceDescription; }
	 
		public PieceDescriptionContext() { }
		public void copyFrom(PieceDescriptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PieceDescriptionExplicitContext extends PieceDescriptionContext {
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public PieceDescriptionExplicitContext(PieceDescriptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPieceDescriptionExplicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPieceDescriptionExplicit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPieceDescriptionExplicit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PieceIdPlusMovesContext extends PieceDescriptionContext {
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
		public PieceIdPlusMovesContext(PieceDescriptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPieceIdPlusMoves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPieceIdPlusMoves(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPieceIdPlusMoves(this);
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
				_localctx = new PieceIdPlusMovesContext(_localctx);
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
				_localctx = new PieceDescriptionExplicitContext(_localctx);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__32) | (1L << EXPLICIT))) != 0)) {
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
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	 
		public MoveContext() { }
		public void copyFrom(MoveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoveExplicitContext extends MoveContext {
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public MoveExplicitContext(MoveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterMoveExplicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitMoveExplicit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitMoveExplicit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoveVectorContext extends MoveContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public KillsContext kills() {
			return getRuleContext(KillsContext.class,0);
		}
		public MoveVectorContext(MoveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterMoveVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitMoveVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitMoveVector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoveFunctionDescriptionContext extends MoveContext {
		public MoveFunctionContext moveFunction() {
			return getRuleContext(MoveFunctionContext.class,0);
		}
		public KillsContext kills() {
			return getRuleContext(KillsContext.class,0);
		}
		public MoveFunctionDescriptionContext(MoveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterMoveFunctionDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitMoveFunctionDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitMoveFunctionDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_move);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new MoveVectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				vector();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14 || _la==T__18) {
					{
					setState(119);
					kills();
					}
				}

				}
				break;
			case 2:
				_localctx = new MoveFunctionDescriptionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				moveFunction();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14 || _la==T__18) {
					{
					setState(123);
					kills();
					}
				}

				}
				break;
			case 3:
				_localctx = new MoveExplicitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
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
		public Token e1;
		public Token e2;
		public List<TerminalNode> INT() { return getTokens(BoardParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(BoardParser.INT, i);
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
		public Token e1;
		public Token e2;
		public List<TerminalNode> INT() { return getTokens(BoardParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(BoardParser.INT, i);
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
		public Token e1;
		public Token e2;
		public List<TerminalNode> INT() { return getTokens(BoardParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(BoardParser.INT, i);
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new MoveFunctionHorizontalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__12);
				setState(130);
				match(T__13);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(131);
					((MoveFunctionHorizontalContext)_localctx).e1 = match(INT);
					}
				}

				setState(134);
				match(T__14);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(135);
					((MoveFunctionHorizontalContext)_localctx).e2 = match(INT);
					}
				}

				setState(138);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new MoveFunctionVerticalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__16);
				setState(140);
				match(T__13);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(141);
					((MoveFunctionVerticalContext)_localctx).e1 = match(INT);
					}
				}

				setState(144);
				match(T__14);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(145);
					((MoveFunctionVerticalContext)_localctx).e2 = match(INT);
					}
				}

				setState(148);
				match(T__15);
				}
				break;
			case T__17:
				_localctx = new MoveFunctionDiagonalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(T__17);
				setState(150);
				match(T__13);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(151);
					((MoveFunctionDiagonalContext)_localctx).e1 = match(INT);
					}
				}

				setState(154);
				match(T__14);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(155);
					((MoveFunctionDiagonalContext)_localctx).e2 = match(INT);
					}
				}

				setState(158);
				match(T__15);
				}
				break;
			case EXPLICIT:
				_localctx = new MoveFunctionExplicitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
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
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(162);
				match(T__14);
				}
			}

			setState(165);
			match(T__18);
			setState(166);
			match(T__4);
			setState(167);
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
		public DescriptionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionModifier; }
	 
		public DescriptionModifierContext() { }
		public void copyFrom(DescriptionModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DescriptionModifierCanJumpContext extends DescriptionModifierContext {
		public TerminalNode BOOL() { return getToken(BoardParser.BOOL, 0); }
		public DescriptionModifierCanJumpContext(DescriptionModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterDescriptionModifierCanJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitDescriptionModifierCanJump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitDescriptionModifierCanJump(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescriptionModifierExplicitContext extends DescriptionModifierContext {
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public DescriptionModifierExplicitContext(DescriptionModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterDescriptionModifierExplicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitDescriptionModifierExplicit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitDescriptionModifierExplicit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescriptionModifierOnEndReachedContext extends DescriptionModifierContext {
		public EndReachedAlternativesContext endReachedAlternatives() {
			return getRuleContext(EndReachedAlternativesContext.class,0);
		}
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public DescriptionModifierOnEndReachedContext(DescriptionModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterDescriptionModifierOnEndReached(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitDescriptionModifierOnEndReached(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitDescriptionModifierOnEndReached(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescriptionModifierMirroredContext extends DescriptionModifierContext {
		public TerminalNode BOOL() { return getToken(BoardParser.BOOL, 0); }
		public DescriptionModifierMirroredContext(DescriptionModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterDescriptionModifierMirrored(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitDescriptionModifierMirrored(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitDescriptionModifierMirrored(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionModifierContext descriptionModifier() throws RecognitionException {
		DescriptionModifierContext _localctx = new DescriptionModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_descriptionModifier);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				_localctx = new DescriptionModifierCanJumpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__19);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(170);
					match(T__4);
					setState(171);
					match(BOOL);
					}
				}

				}
				break;
			case T__20:
				_localctx = new DescriptionModifierMirroredContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__20);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(175);
					match(T__4);
					setState(176);
					match(BOOL);
					}
				}

				}
				break;
			case T__21:
				_localctx = new DescriptionModifierOnEndReachedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(T__21);
				setState(180);
				match(T__4);
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
					{
					setState(181);
					endReachedAlternatives();
					}
					break;
				case EXPLICIT:
					{
					setState(182);
					explicitParsed();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case EXPLICIT:
				_localctx = new DescriptionModifierExplicitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
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
		enterRule(_localctx, 20, RULE_endReachedAlternatives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__22);
			setState(189);
			match(T__13);
			setState(190);
			match(ID);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(191);
				match(T__14);
				setState(192);
				match(ID);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
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
		enterRule(_localctx, 22, RULE_initialPiecePositions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__23);
			setState(201);
			match(T__1);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPLICIT || _la==ID) {
				{
				{
				setState(202);
				initialPiecePosition();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
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
		enterRule(_localctx, 24, RULE_initialPiecePosition);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(ID);
				setState(211);
				match(T__1);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__24) | (1L << T__25))) != 0)) {
					{
					setState(214);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__24:
						{
						setState(212);
						positions();
						}
						break;
					case T__20:
					case T__25:
						{
						setState(213);
						positionModifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(T__2);
				}
				break;
			case EXPLICIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
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
		enterRule(_localctx, 26, RULE_positions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__24);
			setState(224);
			match(T__1);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(225);
				vector();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
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
	 
		public PositionModifierContext() { }
		public void copyFrom(PositionModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionModifierMirroredContext extends PositionModifierContext {
		public TerminalNode BOOL() { return getToken(BoardParser.BOOL, 0); }
		public PositionModifierMirroredContext(PositionModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPositionModifierMirrored(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPositionModifierMirrored(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPositionModifierMirrored(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionModifierOwnerContext extends PositionModifierContext {
		public TerminalNode INT() { return getToken(BoardParser.INT, 0); }
		public PositionModifierOwnerContext(PositionModifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPositionModifierOwner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPositionModifierOwner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPositionModifierOwner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionModifierContext positionModifier() throws RecognitionException {
		PositionModifierContext _localctx = new PositionModifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_positionModifier);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new PositionModifierMirroredContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T__20);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(234);
					match(T__4);
					setState(235);
					match(BOOL);
					}
				}

				}
				break;
			case T__25:
				_localctx = new PositionModifierOwnerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__25);
				setState(239);
				match(T__4);
				setState(240);
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
		enterRule(_localctx, 30, RULE_invariantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__26);
			setState(244);
			match(T__1);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << EXPLICIT))) != 0)) {
				{
				{
				setState(245);
				invariant();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
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
		public InvariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariant; }
	 
		public InvariantContext() { }
		public void copyFrom(InvariantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InvariantProtectPieceContext extends InvariantContext {
		public List<TerminalNode> ID() { return getTokens(BoardParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BoardParser.ID, i);
		}
		public InvariantProtectPieceContext(InvariantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterInvariantProtectPiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitInvariantProtectPiece(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitInvariantProtectPiece(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvariantPawnMovementContext extends InvariantContext {
		public List<TerminalNode> ID() { return getTokens(BoardParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BoardParser.ID, i);
		}
		public InvariantPawnMovementContext(InvariantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterInvariantPawnMovement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitInvariantPawnMovement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitInvariantPawnMovement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvariantExplicitContext extends InvariantContext {
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public InvariantExplicitContext(InvariantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterInvariantExplicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitInvariantExplicit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitInvariantExplicit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvariantCantRiskContext extends InvariantContext {
		public List<TerminalNode> ID() { return getTokens(BoardParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BoardParser.ID, i);
		}
		public InvariantCantRiskContext(InvariantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterInvariantCantRisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitInvariantCantRisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitInvariantCantRisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantContext invariant() throws RecognitionException {
		InvariantContext _localctx = new InvariantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_invariant);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				_localctx = new InvariantCantRiskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(T__27);
				setState(254);
				match(T__13);
				setState(255);
				match(ID);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(256);
					match(T__14);
					setState(257);
					match(ID);
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(263);
				match(T__15);
				}
				break;
			case T__28:
				_localctx = new InvariantProtectPieceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T__28);
				setState(265);
				match(T__13);
				setState(266);
				match(ID);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(267);
					match(T__14);
					setState(268);
					match(ID);
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
				match(T__15);
				}
				break;
			case T__29:
				_localctx = new InvariantPawnMovementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(T__29);
				setState(276);
				match(T__13);
				setState(277);
				match(ID);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(278);
					match(T__14);
					setState(279);
					match(ID);
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(T__15);
				}
				break;
			case EXPLICIT:
				_localctx = new InvariantExplicitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
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
		public List<FinishingRulesContext> finishingRules() {
			return getRuleContexts(FinishingRulesContext.class);
		}
		public FinishingRulesContext finishingRules(int i) {
			return getRuleContext(FinishingRulesContext.class,i);
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
		enterRule(_localctx, 34, RULE_finish);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__30);
			setState(290);
			match(T__1);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31 || _la==EXPLICIT) {
				{
				{
				setState(291);
				finishingRules();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
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
		public FinishingRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finishingRules; }
	 
		public FinishingRulesContext() { }
		public void copyFrom(FinishingRulesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FinishingNoMovesAvailableContext extends FinishingRulesContext {
		public FinishingNoMovesAvailableContext(FinishingRulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterFinishingNoMovesAvailable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitFinishingNoMovesAvailable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitFinishingNoMovesAvailable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FinishingExplicitContext extends FinishingRulesContext {
		public ExplicitParsedContext explicitParsed() {
			return getRuleContext(ExplicitParsedContext.class,0);
		}
		public FinishingExplicitContext(FinishingRulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterFinishingExplicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitFinishingExplicit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitFinishingExplicit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinishingRulesContext finishingRules() throws RecognitionException {
		FinishingRulesContext _localctx = new FinishingRulesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_finishingRules);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				_localctx = new FinishingNoMovesAvailableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(T__31);
				}
				break;
			case EXPLICIT:
				_localctx = new FinishingExplicitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
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
		enterRule(_localctx, 38, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__32);
			setState(304);
			match(T__4);
			setState(305);
			((VectorContext)_localctx).e1 = interval();
			setState(306);
			match(T__14);
			setState(307);
			match(T__33);
			setState(308);
			match(T__4);
			setState(309);
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
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
	 
		public IntervalContext() { }
		public void copyFrom(IntervalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DegenIntervalContext extends IntervalContext {
		public TerminalNode INT() { return getToken(BoardParser.INT, 0); }
		public DegenIntervalContext(IntervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterDegenInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitDegenInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitDegenInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullIntervalContext extends IntervalContext {
		public List<TerminalNode> INT() { return getTokens(BoardParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(BoardParser.INT, i);
		}
		public FullIntervalContext(IntervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterFullInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitFullInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitFullInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_interval);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				_localctx = new FullIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(311);
				match(T__34);
				setState(312);
				match(INT);
				setState(313);
				match(T__14);
				setState(314);
				match(INT);
				setState(315);
				match(T__35);
				}
				}
				break;
			case INT:
				_localctx = new DegenIntervalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
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
		enterRule(_localctx, 42, RULE_explicitParsed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0144\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\4\3\4\3\4\3\4\5\4S\n\4\5"+
		"\4U\n\4\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6e\n\6\f\6\16\6h\13\6\3\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\7\7r\n\7\f\7\16"+
		"\7u\13\7\3\7\3\7\3\b\3\b\5\b{\n\b\3\b\3\b\5\b\177\n\b\3\b\5\b\u0082\n"+
		"\b\3\t\3\t\3\t\5\t\u0087\n\t\3\t\3\t\5\t\u008b\n\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0091\n\t\3\t\3\t\5\t\u0095\n\t\3\t\3\t\3\t\3\t\5\t\u009b\n\t\3\t\3\t"+
		"\5\t\u009f\n\t\3\t\3\t\5\t\u00a3\n\t\3\n\5\n\u00a6\n\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\5\13\u00af\n\13\3\13\3\13\3\13\5\13\u00b4\n\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00ba\n\13\3\13\5\13\u00bd\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00c4\n\f\f\f\16\f\u00c7\13\f\3\f\3\f\3\r\3\r\3\r\7\r\u00ce\n\r\f"+
		"\r\16\r\u00d1\13\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00d9\n\16\f\16\16"+
		"\16\u00dc\13\16\3\16\3\16\5\16\u00e0\n\16\3\17\3\17\3\17\7\17\u00e5\n"+
		"\17\f\17\16\17\u00e8\13\17\3\17\3\17\3\20\3\20\3\20\5\20\u00ef\n\20\3"+
		"\20\3\20\3\20\5\20\u00f4\n\20\3\21\3\21\3\21\7\21\u00f9\n\21\f\21\16\21"+
		"\u00fc\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u0105\n\22\f\22\16"+
		"\22\u0108\13\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0110\n\22\f\22\16"+
		"\22\u0113\13\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u011b\n\22\f\22\16"+
		"\22\u011e\13\22\3\22\3\22\5\22\u0122\n\22\3\23\3\23\3\23\7\23\u0127\n"+
		"\23\f\23\16\23\u012a\13\23\3\23\3\23\3\24\3\24\5\24\u0130\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0140"+
		"\n\26\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,\2\2\2\u015e\2.\3\2\2\2\4\65\3\2\2\2\6T\3\2\2\2\bV\3\2\2\2\nl\3\2"+
		"\2\2\fn\3\2\2\2\16\u0081\3\2\2\2\20\u00a2\3\2\2\2\22\u00a5\3\2\2\2\24"+
		"\u00bc\3\2\2\2\26\u00be\3\2\2\2\30\u00ca\3\2\2\2\32\u00df\3\2\2\2\34\u00e1"+
		"\3\2\2\2\36\u00f3\3\2\2\2 \u00f5\3\2\2\2\"\u0121\3\2\2\2$\u0123\3\2\2"+
		"\2&\u012f\3\2\2\2(\u0131\3\2\2\2*\u013f\3\2\2\2,\u0141\3\2\2\2./\5\4\3"+
		"\2/\60\5\b\5\2\60\61\5\30\r\2\61\62\5 \21\2\62\63\5$\23\2\63\64\7\2\2"+
		"\3\64\3\3\2\2\2\65\66\7\3\2\2\66:\7\4\2\2\679\5\6\4\28\67\3\2\2\29<\3"+
		"\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\5\2\2>\5\3\2\2\2?@"+
		"\7\6\2\2@A\7\7\2\2AU\7\'\2\2BC\7\b\2\2CD\7\7\2\2DU\7\'\2\2EF\7\t\2\2F"+
		"G\7\7\2\2GU\7\'\2\2HI\7\n\2\2IL\7\7\2\2JM\7\13\2\2KM\5,\27\2LJ\3\2\2\2"+
		"LK\3\2\2\2MU\3\2\2\2NO\7\f\2\2OR\7\7\2\2PS\7\13\2\2QS\5,\27\2RP\3\2\2"+
		"\2RQ\3\2\2\2SU\3\2\2\2T?\3\2\2\2TB\3\2\2\2TE\3\2\2\2TH\3\2\2\2TN\3\2\2"+
		"\2U\7\3\2\2\2VW\7\r\2\2W[\7\4\2\2XZ\5\n\6\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2"+
		"\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\5\2\2_\t\3\2\2\2`a\7*\2\2ab\7"+
		"\4\2\2bf\5\f\7\2ce\5\24\13\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g"+
		"i\3\2\2\2hf\3\2\2\2ij\7\5\2\2jm\3\2\2\2km\5,\27\2l`\3\2\2\2lk\3\2\2\2"+
		"m\13\3\2\2\2no\7\16\2\2os\7\4\2\2pr\5\16\b\2qp\3\2\2\2ru\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\5\2\2w\r\3\2\2\2xz\5(\25\2y{\5"+
		"\22\n\2zy\3\2\2\2z{\3\2\2\2{\u0082\3\2\2\2|~\5\20\t\2}\177\5\22\n\2~}"+
		"\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080\u0082\5,\27\2\u0081x\3\2"+
		"\2\2\u0081|\3\2\2\2\u0081\u0080\3\2\2\2\u0082\17\3\2\2\2\u0083\u0084\7"+
		"\17\2\2\u0084\u0086\7\20\2\2\u0085\u0087\7\'\2\2\u0086\u0085\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7\21\2\2\u0089\u008b\7"+
		"\'\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u00a3\7\22\2\2\u008d\u008e\7\23\2\2\u008e\u0090\7\20\2\2\u008f\u0091"+
		"\7\'\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\7\21\2\2\u0093\u0095\7\'\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u00a3\7\22\2\2\u0097\u0098\7\24\2\2\u0098"+
		"\u009a\7\20\2\2\u0099\u009b\7\'\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\7\21\2\2\u009d\u009f\7\'\2\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\7\22"+
		"\2\2\u00a1\u00a3\5,\27\2\u00a2\u0083\3\2\2\2\u00a2\u008d\3\2\2\2\u00a2"+
		"\u0097\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\21\3\2\2\2\u00a4\u00a6\7\21\2"+
		"\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\7\25\2\2\u00a8\u00a9\7\7\2\2\u00a9\u00aa\7(\2\2\u00aa\23\3\2\2\2\u00ab"+
		"\u00ae\7\26\2\2\u00ac\u00ad\7\7\2\2\u00ad\u00af\7(\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00bd\3\2\2\2\u00b0\u00b3\7\27\2\2\u00b1"+
		"\u00b2\7\7\2\2\u00b2\u00b4\7(\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00bd\3\2\2\2\u00b5\u00b6\7\30\2\2\u00b6\u00b9\7\7\2\2\u00b7"+
		"\u00ba\5\26\f\2\u00b8\u00ba\5,\27\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3"+
		"\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bd\5,\27\2\u00bc\u00ab\3\2\2\2\u00bc"+
		"\u00b0\3\2\2\2\u00bc\u00b5\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\25\3\2\2"+
		"\2\u00be\u00bf\7\31\2\2\u00bf\u00c0\7\20\2\2\u00c0\u00c5\7*\2\2\u00c1"+
		"\u00c2\7\21\2\2\u00c2\u00c4\7*\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\7\22\2\2\u00c9\27\3\2\2\2\u00ca\u00cb\7\32"+
		"\2\2\u00cb\u00cf\7\4\2\2\u00cc\u00ce\5\32\16\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\5\2\2\u00d3\31\3\2\2\2\u00d4\u00d5"+
		"\7*\2\2\u00d5\u00da\7\4\2\2\u00d6\u00d9\5\34\17\2\u00d7\u00d9\5\36\20"+
		"\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00e0\7\5\2\2\u00de\u00e0\5,\27\2\u00df\u00d4\3\2\2\2\u00df\u00de\3\2"+
		"\2\2\u00e0\33\3\2\2\2\u00e1\u00e2\7\33\2\2\u00e2\u00e6\7\4\2\2\u00e3\u00e5"+
		"\5(\25\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\5"+
		"\2\2\u00ea\35\3\2\2\2\u00eb\u00ee\7\27\2\2\u00ec\u00ed\7\7\2\2\u00ed\u00ef"+
		"\7(\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f4\3\2\2\2\u00f0"+
		"\u00f1\7\34\2\2\u00f1\u00f2\7\7\2\2\u00f2\u00f4\7\'\2\2\u00f3\u00eb\3"+
		"\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\37\3\2\2\2\u00f5\u00f6\7\35\2\2\u00f6"+
		"\u00fa\7\4\2\2\u00f7\u00f9\5\"\22\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3"+
		"\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u00fe\7\5\2\2\u00fe!\3\2\2\2\u00ff\u0100\7\36\2\2"+
		"\u0100\u0101\7\20\2\2\u0101\u0106\7*\2\2\u0102\u0103\7\21\2\2\u0103\u0105"+
		"\7*\2\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0122\7\22"+
		"\2\2\u010a\u010b\7\37\2\2\u010b\u010c\7\20\2\2\u010c\u0111\7*\2\2\u010d"+
		"\u010e\7\21\2\2\u010e\u0110\7*\2\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0122\7\22\2\2\u0115\u0116\7 \2\2\u0116\u0117\7\20"+
		"\2\2\u0117\u011c\7*\2\2\u0118\u0119\7\21\2\2\u0119\u011b\7*\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0122\7\22\2\2\u0120"+
		"\u0122\5,\27\2\u0121\u00ff\3\2\2\2\u0121\u010a\3\2\2\2\u0121\u0115\3\2"+
		"\2\2\u0121\u0120\3\2\2\2\u0122#\3\2\2\2\u0123\u0124\7!\2\2\u0124\u0128"+
		"\7\4\2\2\u0125\u0127\5&\24\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012c\7\5\2\2\u012c%\3\2\2\2\u012d\u0130\7\"\2\2\u012e\u0130"+
		"\5,\27\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\'\3\2\2\2\u0131"+
		"\u0132\7#\2\2\u0132\u0133\7\7\2\2\u0133\u0134\5*\26\2\u0134\u0135\7\21"+
		"\2\2\u0135\u0136\7$\2\2\u0136\u0137\7\7\2\2\u0137\u0138\5*\26\2\u0138"+
		")\3\2\2\2\u0139\u013a\7%\2\2\u013a\u013b\7\'\2\2\u013b\u013c\7\21\2\2"+
		"\u013c\u013d\7\'\2\2\u013d\u0140\7&\2\2\u013e\u0140\7\'\2\2\u013f\u0139"+
		"\3\2\2\2\u013f\u013e\3\2\2\2\u0140+\3\2\2\2\u0141\u0142\7)\2\2\u0142-"+
		"\3\2\2\2):LRT[flsz~\u0081\u0086\u008a\u0090\u0094\u009a\u009e\u00a2\u00a5"+
		"\u00ae\u00b3\u00b9\u00bc\u00c5\u00cf\u00d8\u00da\u00df\u00e6\u00ee\u00f3"+
		"\u00fa\u0106\u0111\u011c\u0121\u0128\u012f\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}