// Generated from D:/dev/BDL-Board-Description-Language/Compiler/src\Board.g4 by ANTLR 4.8
package antlr4;
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, STRING=44, VALUE=45, 
		WS=46;
	public static final int
		RULE_game = 0, RULE_piecesDescription = 1, RULE_pieceDescription = 2, 
		RULE_pieceDescriptionProperty = 3, RULE_initialStatus = 4, RULE_piecesInitialStatus = 5, 
		RULE_pieceInitialStatus = 6, RULE_pieceInitialStatusProperty = 7, RULE_owner = 8, 
		RULE_onEndReached = 9, RULE_endReachedFunctions = 10, RULE_endReachedKnownFunctions = 11, 
		RULE_spawnFunction = 12, RULE_stringArray = 13, RULE_canJump = 14, RULE_mirrored = 15, 
		RULE_positions = 16, RULE_rules = 17, RULE_ruleDef = 18, RULE_firstPlayer = 19, 
		RULE_width = 20, RULE_height = 21, RULE_coloring = 22, RULE_knownColorings = 23, 
		RULE_playerChange = 24, RULE_knownPlayerChanges = 25, RULE_invariants = 26, 
		RULE_knownInvariants = 27, RULE_pawnMovement = 28, RULE_cantRisk = 29, 
		RULE_protectPiece = 30, RULE_finish = 31, RULE_knownFinish = 32, RULE_noMovesAvailable = 33, 
		RULE_moves = 34, RULE_move = 35, RULE_moveProperty = 36, RULE_killing = 37, 
		RULE_direction = 38, RULE_coordinates = 39, RULE_bool = 40, RULE_pair = 41, 
		RULE_x = 42, RULE_y = 43, RULE_interval = 44, RULE_explicit = 45, RULE_explicitContent = 46, 
		RULE_languageKeywords = 47, RULE_name = 48, RULE_invariant = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"game", "piecesDescription", "pieceDescription", "pieceDescriptionProperty", 
			"initialStatus", "piecesInitialStatus", "pieceInitialStatus", "pieceInitialStatusProperty", 
			"owner", "onEndReached", "endReachedFunctions", "endReachedKnownFunctions", 
			"spawnFunction", "stringArray", "canJump", "mirrored", "positions", "rules", 
			"ruleDef", "firstPlayer", "width", "height", "coloring", "knownColorings", 
			"playerChange", "knownPlayerChanges", "invariants", "knownInvariants", 
			"pawnMovement", "cantRisk", "protectPiece", "finish", "knownFinish", 
			"noMovesAvailable", "moves", "move", "moveProperty", "killing", "direction", 
			"coordinates", "bool", "pair", "x", "y", "interval", "explicit", "explicitContent", 
			"languageKeywords", "name", "invariant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pieces{'", "'}'", "'{'", "'initial_status{'", "'owner'", "':'", 
			"'on_end_reached'", "'spawn('", "')'", "','", "'can_jump'", "'mirrored'", 
			"'positions{'", "'rules{'", "'first_player'", "'width'", "'height'", 
			"'coloring'", "'alternate'", "'player_change'", "'invariants{'", "'pawn_movement'", 
			"'('", "'cant_risk'", "'protect_piece'", "'finish{'", "'no_moves_available'", 
			"'moves{'", "'kills'", "'x'", "'y'", "'true'", "'false'", "'['", "']'", 
			"'explicit{|'", "'|}'", "'='", "'>'", "'<'", "'vertical'", "'horizontal'", 
			"'diagonal'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "STRING", "VALUE", "WS"
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
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public PiecesDescriptionContext piecesDescription() {
			return getRuleContext(PiecesDescriptionContext.class,0);
		}
		public InitialStatusContext initialStatus() {
			return getRuleContext(InitialStatusContext.class,0);
		}
		public InvariantsContext invariants() {
			return getRuleContext(InvariantsContext.class,0);
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
			setState(100);
			rules();
			setState(101);
			piecesDescription();
			setState(102);
			initialStatus();
			setState(103);
			invariants();
			setState(104);
			finish();
			setState(105);
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

	public static class PiecesDescriptionContext extends ParserRuleContext {
		public List<PieceDescriptionContext> pieceDescription() {
			return getRuleContexts(PieceDescriptionContext.class);
		}
		public PieceDescriptionContext pieceDescription(int i) {
			return getRuleContext(PieceDescriptionContext.class,i);
		}
		public PiecesDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piecesDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPiecesDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPiecesDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPiecesDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PiecesDescriptionContext piecesDescription() throws RecognitionException {
		PiecesDescriptionContext _localctx = new PiecesDescriptionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_piecesDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__0);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				pieceDescription();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(113);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public MovesContext moves() {
			return getRuleContext(MovesContext.class,0);
		}
		public List<ExplicitContext> explicit() {
			return getRuleContexts(ExplicitContext.class);
		}
		public ExplicitContext explicit(int i) {
			return getRuleContext(ExplicitContext.class,i);
		}
		public List<PieceDescriptionPropertyContext> pieceDescriptionProperty() {
			return getRuleContexts(PieceDescriptionPropertyContext.class);
		}
		public PieceDescriptionPropertyContext pieceDescriptionProperty(int i) {
			return getRuleContext(PieceDescriptionPropertyContext.class,i);
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
		enterRule(_localctx, 4, RULE_pieceDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			name();
			setState(116);
			match(T__2);
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				{
				{
				setState(117);
				moves();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << T__11))) != 0)) {
					{
					{
					setState(118);
					pieceDescriptionProperty();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__1:
			case T__35:
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(124);
					explicit();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PieceDescriptionPropertyContext extends ParserRuleContext {
		public CanJumpContext canJump() {
			return getRuleContext(CanJumpContext.class,0);
		}
		public OnEndReachedContext onEndReached() {
			return getRuleContext(OnEndReachedContext.class,0);
		}
		public MirroredContext mirrored() {
			return getRuleContext(MirroredContext.class,0);
		}
		public PieceDescriptionPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieceDescriptionProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPieceDescriptionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPieceDescriptionProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPieceDescriptionProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PieceDescriptionPropertyContext pieceDescriptionProperty() throws RecognitionException {
		PieceDescriptionPropertyContext _localctx = new PieceDescriptionPropertyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pieceDescriptionProperty);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				canJump();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				onEndReached();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				mirrored();
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

	public static class InitialStatusContext extends ParserRuleContext {
		public PiecesInitialStatusContext piecesInitialStatus() {
			return getRuleContext(PiecesInitialStatusContext.class,0);
		}
		public InitialStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialStatus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterInitialStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitInitialStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitInitialStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialStatusContext initialStatus() throws RecognitionException {
		InitialStatusContext _localctx = new InitialStatusContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initialStatus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__3);
			setState(140);
			piecesInitialStatus();
			setState(141);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PiecesInitialStatusContext extends ParserRuleContext {
		public List<PieceInitialStatusContext> pieceInitialStatus() {
			return getRuleContexts(PieceInitialStatusContext.class);
		}
		public PieceInitialStatusContext pieceInitialStatus(int i) {
			return getRuleContext(PieceInitialStatusContext.class,i);
		}
		public PiecesInitialStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piecesInitialStatus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPiecesInitialStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPiecesInitialStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPiecesInitialStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PiecesInitialStatusContext piecesInitialStatus() throws RecognitionException {
		PiecesInitialStatusContext _localctx = new PiecesInitialStatusContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_piecesInitialStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__0);
			{
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				pieceInitialStatus();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			}
			setState(149);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PieceInitialStatusContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PositionsContext positions() {
			return getRuleContext(PositionsContext.class,0);
		}
		public List<PieceInitialStatusPropertyContext> pieceInitialStatusProperty() {
			return getRuleContexts(PieceInitialStatusPropertyContext.class);
		}
		public PieceInitialStatusPropertyContext pieceInitialStatusProperty(int i) {
			return getRuleContext(PieceInitialStatusPropertyContext.class,i);
		}
		public List<ExplicitContext> explicit() {
			return getRuleContexts(ExplicitContext.class);
		}
		public ExplicitContext explicit(int i) {
			return getRuleContext(ExplicitContext.class,i);
		}
		public PieceInitialStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieceInitialStatus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPieceInitialStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPieceInitialStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPieceInitialStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PieceInitialStatusContext pieceInitialStatus() throws RecognitionException {
		PieceInitialStatusContext _localctx = new PieceInitialStatusContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pieceInitialStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			name();
			setState(152);
			match(T__2);
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(153);
				positions();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4 || _la==T__11) {
					{
					{
					setState(154);
					pieceInitialStatusProperty();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
			case T__35:
				{
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(160);
					explicit();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(168);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PieceInitialStatusPropertyContext extends ParserRuleContext {
		public MirroredContext mirrored() {
			return getRuleContext(MirroredContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public PieceInitialStatusPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieceInitialStatusProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPieceInitialStatusProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPieceInitialStatusProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPieceInitialStatusProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PieceInitialStatusPropertyContext pieceInitialStatusProperty() throws RecognitionException {
		PieceInitialStatusPropertyContext _localctx = new PieceInitialStatusPropertyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pieceInitialStatusProperty);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				mirrored();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				owner();
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

	public static class OwnerContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(BoardParser.VALUE, 0); }
		public OwnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_owner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterOwner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitOwner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitOwner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnerContext owner() throws RecognitionException {
		OwnerContext _localctx = new OwnerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__4);
			setState(175);
			match(T__5);
			setState(176);
			match(VALUE);
			}
		}
		catch (RecognitionException re) {
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
		public EndReachedFunctionsContext endReachedFunctions() {
			return getRuleContext(EndReachedFunctionsContext.class,0);
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
		enterRule(_localctx, 18, RULE_onEndReached);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__6);
			setState(179);
			match(T__5);
			setState(180);
			endReachedFunctions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndReachedFunctionsContext extends ParserRuleContext {
		public EndReachedKnownFunctionsContext endReachedKnownFunctions() {
			return getRuleContext(EndReachedKnownFunctionsContext.class,0);
		}
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public EndReachedFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endReachedFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterEndReachedFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitEndReachedFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitEndReachedFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndReachedFunctionsContext endReachedFunctions() throws RecognitionException {
		EndReachedFunctionsContext _localctx = new EndReachedFunctionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_endReachedFunctions);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				endReachedKnownFunctions();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				explicit();
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

	public static class EndReachedKnownFunctionsContext extends ParserRuleContext {
		public SpawnFunctionContext spawnFunction() {
			return getRuleContext(SpawnFunctionContext.class,0);
		}
		public EndReachedKnownFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endReachedKnownFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterEndReachedKnownFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitEndReachedKnownFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitEndReachedKnownFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndReachedKnownFunctionsContext endReachedKnownFunctions() throws RecognitionException {
		EndReachedKnownFunctionsContext _localctx = new EndReachedKnownFunctionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_endReachedKnownFunctions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			spawnFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpawnFunctionContext extends ParserRuleContext {
		public StringArrayContext stringArray() {
			return getRuleContext(StringArrayContext.class,0);
		}
		public SpawnFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spawnFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterSpawnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitSpawnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitSpawnFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpawnFunctionContext spawnFunction() throws RecognitionException {
		SpawnFunctionContext _localctx = new SpawnFunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_spawnFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__7);
			setState(189);
			stringArray();
			setState(190);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringArrayContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(BoardParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BoardParser.STRING, i);
		}
		public StringArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterStringArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitStringArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitStringArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringArrayContext stringArray() throws RecognitionException {
		StringArrayContext _localctx = new StringArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stringArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(STRING);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(193);
				match(T__9);
				setState(194);
				match(STRING);
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

	public static class CanJumpContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public CanJumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canJump; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterCanJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitCanJump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitCanJump(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CanJumpContext canJump() throws RecognitionException {
		CanJumpContext _localctx = new CanJumpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_canJump);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__10);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(201);
				match(T__5);
				setState(202);
				bool();
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

	public static class MirroredContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public MirroredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mirrored; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterMirrored(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitMirrored(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitMirrored(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MirroredContext mirrored() throws RecognitionException {
		MirroredContext _localctx = new MirroredContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mirrored);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__11);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(206);
				match(T__5);
				setState(207);
				bool();
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

	public static class PositionsContext extends ParserRuleContext {
		public List<CoordinatesContext> coordinates() {
			return getRuleContexts(CoordinatesContext.class);
		}
		public CoordinatesContext coordinates(int i) {
			return getRuleContext(CoordinatesContext.class,i);
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
		enterRule(_localctx, 32, RULE_positions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__12);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				coordinates();
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__29 );
			setState(216);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext {
		public List<RuleDefContext> ruleDef() {
			return getRuleContexts(RuleDefContext.class);
		}
		public RuleDefContext ruleDef(int i) {
			return getRuleContext(RuleDefContext.class,i);
		}
		public List<ExplicitContext> explicit() {
			return getRuleContexts(ExplicitContext.class);
		}
		public ExplicitContext explicit(int i) {
			return getRuleContext(ExplicitContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__13);
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__19:
				{
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(219);
					ruleDef();
					}
					}
					setState(222); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19))) != 0) );
				}
				break;
			case T__1:
			case T__35:
				{
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(224);
					explicit();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(232);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
		public FirstPlayerContext firstPlayer() {
			return getRuleContext(FirstPlayerContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public ColoringContext coloring() {
			return getRuleContext(ColoringContext.class,0);
		}
		public PlayerChangeContext playerChange() {
			return getRuleContext(PlayerChangeContext.class,0);
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
		enterRule(_localctx, 36, RULE_ruleDef);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				firstPlayer();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				width();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				height();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				coloring();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				playerChange();
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

	public static class FirstPlayerContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(BoardParser.VALUE, 0); }
		public FirstPlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstPlayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterFirstPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitFirstPlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitFirstPlayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstPlayerContext firstPlayer() throws RecognitionException {
		FirstPlayerContext _localctx = new FirstPlayerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_firstPlayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__14);
			setState(242);
			match(T__5);
			setState(243);
			match(VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidthContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(BoardParser.VALUE, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__15);
			setState(246);
			match(T__5);
			setState(247);
			match(VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeightContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(BoardParser.VALUE, 0); }
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__16);
			setState(250);
			match(T__5);
			setState(251);
			match(VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColoringContext extends ParserRuleContext {
		public KnownColoringsContext knownColorings() {
			return getRuleContext(KnownColoringsContext.class,0);
		}
		public ColoringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coloring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterColoring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitColoring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitColoring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColoringContext coloring() throws RecognitionException {
		ColoringContext _localctx = new ColoringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_coloring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__17);
			setState(254);
			match(T__5);
			setState(255);
			knownColorings();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KnownColoringsContext extends ParserRuleContext {
		public KnownColoringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownColorings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterKnownColorings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitKnownColorings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitKnownColorings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnownColoringsContext knownColorings() throws RecognitionException {
		KnownColoringsContext _localctx = new KnownColoringsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_knownColorings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlayerChangeContext extends ParserRuleContext {
		public KnownPlayerChangesContext knownPlayerChanges() {
			return getRuleContext(KnownPlayerChangesContext.class,0);
		}
		public PlayerChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerChange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPlayerChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPlayerChange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPlayerChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerChangeContext playerChange() throws RecognitionException {
		PlayerChangeContext _localctx = new PlayerChangeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_playerChange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__19);
			setState(260);
			match(T__5);
			setState(261);
			knownPlayerChanges();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KnownPlayerChangesContext extends ParserRuleContext {
		public KnownPlayerChangesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownPlayerChanges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterKnownPlayerChanges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitKnownPlayerChanges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitKnownPlayerChanges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnownPlayerChangesContext knownPlayerChanges() throws RecognitionException {
		KnownPlayerChangesContext _localctx = new KnownPlayerChangesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_knownPlayerChanges);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvariantsContext extends ParserRuleContext {
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public List<KnownInvariantsContext> knownInvariants() {
			return getRuleContexts(KnownInvariantsContext.class);
		}
		public KnownInvariantsContext knownInvariants(int i) {
			return getRuleContext(KnownInvariantsContext.class,i);
		}
		public InvariantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterInvariants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitInvariants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitInvariants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantsContext invariants() throws RecognitionException {
		InvariantsContext _localctx = new InvariantsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_invariants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__20);
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__23:
			case T__24:
				{
				setState(267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(266);
					knownInvariants();
					}
					}
					setState(269); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__23) | (1L << T__24))) != 0) );
				}
				break;
			case T__35:
				{
				setState(271);
				explicit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(274);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KnownInvariantsContext extends ParserRuleContext {
		public CantRiskContext cantRisk() {
			return getRuleContext(CantRiskContext.class,0);
		}
		public ProtectPieceContext protectPiece() {
			return getRuleContext(ProtectPieceContext.class,0);
		}
		public PawnMovementContext pawnMovement() {
			return getRuleContext(PawnMovementContext.class,0);
		}
		public KnownInvariantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownInvariants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterKnownInvariants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitKnownInvariants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitKnownInvariants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnownInvariantsContext knownInvariants() throws RecognitionException {
		KnownInvariantsContext _localctx = new KnownInvariantsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_knownInvariants);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				cantRisk();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				protectPiece();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				pawnMovement();
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

	public static class PawnMovementContext extends ParserRuleContext {
		public StringArrayContext stringArray() {
			return getRuleContext(StringArrayContext.class,0);
		}
		public PawnMovementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pawnMovement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPawnMovement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPawnMovement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPawnMovement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PawnMovementContext pawnMovement() throws RecognitionException {
		PawnMovementContext _localctx = new PawnMovementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pawnMovement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__21);
			setState(282);
			match(T__22);
			setState(283);
			stringArray();
			setState(284);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CantRiskContext extends ParserRuleContext {
		public StringArrayContext stringArray() {
			return getRuleContext(StringArrayContext.class,0);
		}
		public CantRiskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cantRisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterCantRisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitCantRisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitCantRisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CantRiskContext cantRisk() throws RecognitionException {
		CantRiskContext _localctx = new CantRiskContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cantRisk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__23);
			setState(287);
			match(T__22);
			setState(288);
			stringArray();
			setState(289);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtectPieceContext extends ParserRuleContext {
		public StringArrayContext stringArray() {
			return getRuleContext(StringArrayContext.class,0);
		}
		public ProtectPieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protectPiece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterProtectPiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitProtectPiece(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitProtectPiece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtectPieceContext protectPiece() throws RecognitionException {
		ProtectPieceContext _localctx = new ProtectPieceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_protectPiece);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__24);
			setState(292);
			match(T__22);
			setState(293);
			stringArray();
			setState(294);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
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
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public List<KnownFinishContext> knownFinish() {
			return getRuleContexts(KnownFinishContext.class);
		}
		public KnownFinishContext knownFinish(int i) {
			return getRuleContext(KnownFinishContext.class,i);
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
		enterRule(_localctx, 62, RULE_finish);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__25);
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				{
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(297);
					knownFinish();
					}
					}
					setState(300); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__26 );
				}
				break;
			case T__35:
				{
				setState(302);
				explicit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(305);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KnownFinishContext extends ParserRuleContext {
		public NoMovesAvailableContext noMovesAvailable() {
			return getRuleContext(NoMovesAvailableContext.class,0);
		}
		public KnownFinishContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownFinish; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterKnownFinish(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitKnownFinish(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitKnownFinish(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnownFinishContext knownFinish() throws RecognitionException {
		KnownFinishContext _localctx = new KnownFinishContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_knownFinish);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			noMovesAvailable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoMovesAvailableContext extends ParserRuleContext {
		public NoMovesAvailableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noMovesAvailable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterNoMovesAvailable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitNoMovesAvailable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitNoMovesAvailable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoMovesAvailableContext noMovesAvailable() throws RecognitionException {
		NoMovesAvailableContext _localctx = new NoMovesAvailableContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_noMovesAvailable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 68, RULE_moves);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__27);
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312);
				move();
				}
				}
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__35) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0) );
			setState(317);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
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
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public CoordinatesContext coordinates() {
			return getRuleContext(CoordinatesContext.class,0);
		}
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public List<MovePropertyContext> moveProperty() {
			return getRuleContexts(MovePropertyContext.class);
		}
		public MovePropertyContext moveProperty(int i) {
			return getRuleContext(MovePropertyContext.class,i);
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
		enterRule(_localctx, 70, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(319);
				direction();
				}
				break;
			case 2:
				{
				setState(320);
				coordinates();
				}
				break;
			case 3:
				{
				setState(321);
				explicit();
				}
				break;
			}
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(324);
				match(T__9);
				setState(325);
				moveProperty();
				}
				}
				setState(330);
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

	public static class MovePropertyContext extends ParserRuleContext {
		public KillingContext killing() {
			return getRuleContext(KillingContext.class,0);
		}
		public MovePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterMoveProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitMoveProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitMoveProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovePropertyContext moveProperty() throws RecognitionException {
		MovePropertyContext _localctx = new MovePropertyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_moveProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			killing();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KillingContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public KillingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterKilling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitKilling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitKilling(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KillingContext killing() throws RecognitionException {
		KillingContext _localctx = new KillingContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_killing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__28);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(334);
				match(T__5);
				setState(335);
				bool();
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

	public static class DirectionContext extends ParserRuleContext {
		public LanguageKeywordsContext languageKeywords() {
			return getRuleContext(LanguageKeywordsContext.class,0);
		}
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public CoordinatesContext coordinates() {
			return getRuleContext(CoordinatesContext.class,0);
		}
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_direction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
			case T__41:
			case T__42:
				{
				setState(338);
				languageKeywords();
				setState(339);
				pair();
				}
				break;
			case T__29:
				{
				setState(341);
				coordinates();
				}
				break;
			case T__35:
				{
				setState(342);
				explicit();
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

	public static class CoordinatesContext extends ParserRuleContext {
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public CoordinatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterCoordinates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitCoordinates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitCoordinates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordinatesContext coordinates() throws RecognitionException {
		CoordinatesContext _localctx = new CoordinatesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_coordinates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__29);
			setState(346);
			match(T__5);
			setState(347);
			x();
			setState(348);
			match(T__9);
			setState(349);
			match(T__30);
			setState(350);
			match(T__5);
			setState(351);
			y();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
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

	public static class PairContext extends ParserRuleContext {
		public List<TerminalNode> VALUE() { return getTokens(BoardParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(BoardParser.VALUE, i);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__22);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(356);
				match(VALUE);
				}
			}

			setState(359);
			match(T__9);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(360);
				match(VALUE);
				}
			}

			setState(363);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(BoardParser.VALUE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_x);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(VALUE);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				interval();
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

	public static class YContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(BoardParser.VALUE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_y);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(VALUE);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				interval();
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

	public static class IntervalContext extends ParserRuleContext {
		public List<TerminalNode> VALUE() { return getTokens(BoardParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(BoardParser.VALUE, i);
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
		enterRule(_localctx, 88, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(T__33);
			setState(374);
			match(VALUE);
			setState(375);
			match(T__9);
			setState(376);
			match(VALUE);
			setState(377);
			match(T__34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitContext extends ParserRuleContext {
		public ExplicitContentContext explicitContent() {
			return getRuleContext(ExplicitContentContext.class,0);
		}
		public ExplicitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterExplicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitExplicit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitExplicit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitContext explicit() throws RecognitionException {
		ExplicitContext _localctx = new ExplicitContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_explicit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__35);
			setState(380);
			explicitContent();
			setState(381);
			match(T__36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitContentContext extends ParserRuleContext {
		public ExplicitContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterExplicitContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitExplicitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitExplicitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitContentContext explicitContent() throws RecognitionException {
		ExplicitContentContext _localctx = new ExplicitContentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_explicitContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << STRING) | (1L << VALUE) | (1L << WS))) != 0)) {
				{
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(383);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__36) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 2:
					{
					setState(384);
					match(T__37);
					}
					break;
				case 3:
					{
					setState(385);
					match(T__38);
					}
					break;
				case 4:
					{
					setState(386);
					match(T__39);
					}
					break;
				}
				}
				setState(391);
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

	public static class LanguageKeywordsContext extends ParserRuleContext {
		public LanguageKeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageKeywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterLanguageKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitLanguageKeywords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitLanguageKeywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageKeywordsContext languageKeywords() throws RecognitionException {
		LanguageKeywordsContext _localctx = new LanguageKeywordsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_languageKeywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BoardParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode STRING() { return getToken(BoardParser.STRING, 0); }
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
		enterRule(_localctx, 98, RULE_invariant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0191\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\6\3p\n\3\r\3\16\3q\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\7\4z\n\4\f\4\16\4}\13\4\3\4\7\4\u0080\n\4\f\4\16\4\u0083\13\4\5\4\u0085"+
		"\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u008c\n\5\3\6\3\6\3\6\3\6\3\7\3\7\6\7\u0094"+
		"\n\7\r\7\16\7\u0095\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1"+
		"\13\b\3\b\7\b\u00a4\n\b\f\b\16\b\u00a7\13\b\5\b\u00a9\n\b\3\b\3\b\3\t"+
		"\3\t\5\t\u00af\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u00bb"+
		"\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00c6\n\17\f\17\16"+
		"\17\u00c9\13\17\3\20\3\20\3\20\5\20\u00ce\n\20\3\21\3\21\3\21\5\21\u00d3"+
		"\n\21\3\22\3\22\6\22\u00d7\n\22\r\22\16\22\u00d8\3\22\3\22\3\23\3\23\6"+
		"\23\u00df\n\23\r\23\16\23\u00e0\3\23\7\23\u00e4\n\23\f\23\16\23\u00e7"+
		"\13\23\5\23\u00e9\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00f2\n"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\6\34\u010e"+
		"\n\34\r\34\16\34\u010f\3\34\5\34\u0113\n\34\3\34\3\34\3\35\3\35\3\35\5"+
		"\35\u011a\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3!\3!\6!\u012d\n!\r!\16!\u012e\3!\5!\u0132\n!\3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\6$\u013c\n$\r$\16$\u013d\3$\3$\3%\3%\3%\5%\u0145\n%\3%\3"+
		"%\7%\u0149\n%\f%\16%\u014c\13%\3&\3&\3\'\3\'\3\'\5\'\u0153\n\'\3(\3(\3"+
		"(\3(\3(\5(\u015a\n(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\5+\u0168\n+\3"+
		"+\3+\5+\u016c\n+\3+\3+\3,\3,\5,\u0172\n,\3-\3-\5-\u0176\n-\3.\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0186\n\60\f\60\16\60\u0189"+
		"\13\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\2\2\64\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\5\3"+
		"\2\"#\3\2\'\'\3\2+-\2\u018a\2f\3\2\2\2\4m\3\2\2\2\6u\3\2\2\2\b\u008b\3"+
		"\2\2\2\n\u008d\3\2\2\2\f\u0091\3\2\2\2\16\u0099\3\2\2\2\20\u00ae\3\2\2"+
		"\2\22\u00b0\3\2\2\2\24\u00b4\3\2\2\2\26\u00ba\3\2\2\2\30\u00bc\3\2\2\2"+
		"\32\u00be\3\2\2\2\34\u00c2\3\2\2\2\36\u00ca\3\2\2\2 \u00cf\3\2\2\2\"\u00d4"+
		"\3\2\2\2$\u00dc\3\2\2\2&\u00f1\3\2\2\2(\u00f3\3\2\2\2*\u00f7\3\2\2\2,"+
		"\u00fb\3\2\2\2.\u00ff\3\2\2\2\60\u0103\3\2\2\2\62\u0105\3\2\2\2\64\u0109"+
		"\3\2\2\2\66\u010b\3\2\2\28\u0119\3\2\2\2:\u011b\3\2\2\2<\u0120\3\2\2\2"+
		">\u0125\3\2\2\2@\u012a\3\2\2\2B\u0135\3\2\2\2D\u0137\3\2\2\2F\u0139\3"+
		"\2\2\2H\u0144\3\2\2\2J\u014d\3\2\2\2L\u014f\3\2\2\2N\u0159\3\2\2\2P\u015b"+
		"\3\2\2\2R\u0163\3\2\2\2T\u0165\3\2\2\2V\u0171\3\2\2\2X\u0175\3\2\2\2Z"+
		"\u0177\3\2\2\2\\\u017d\3\2\2\2^\u0187\3\2\2\2`\u018a\3\2\2\2b\u018c\3"+
		"\2\2\2d\u018e\3\2\2\2fg\5$\23\2gh\5\4\3\2hi\5\n\6\2ij\5\66\34\2jk\5@!"+
		"\2kl\7\2\2\3l\3\3\2\2\2mo\7\3\2\2np\5\6\4\2on\3\2\2\2pq\3\2\2\2qo\3\2"+
		"\2\2qr\3\2\2\2rs\3\2\2\2st\7\4\2\2t\5\3\2\2\2uv\5b\62\2v\u0084\7\5\2\2"+
		"w{\5F$\2xz\5\b\5\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0085\3\2"+
		"\2\2}{\3\2\2\2~\u0080\5\\/\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"w\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\4\2\2"+
		"\u0087\7\3\2\2\2\u0088\u008c\5\36\20\2\u0089\u008c\5\24\13\2\u008a\u008c"+
		"\5 \21\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\t\3\2\2\2\u008d\u008e\7\6\2\2\u008e\u008f\5\f\7\2\u008f\u0090\7\4\2\2"+
		"\u0090\13\3\2\2\2\u0091\u0093\7\3\2\2\u0092\u0094\5\16\b\2\u0093\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\7\4\2\2\u0098\r\3\2\2\2\u0099\u009a\5b\62\2"+
		"\u009a\u00a8\7\5\2\2\u009b\u009f\5\"\22\2\u009c\u009e\5\20\t\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a9\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\5\\/\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u009b\3\2\2\2\u00a8\u00a5\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\4\2\2\u00ab\17\3\2\2\2\u00ac\u00af"+
		"\5 \21\2\u00ad\u00af\5\22\n\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2"+
		"\u00af\21\3\2\2\2\u00b0\u00b1\7\7\2\2\u00b1\u00b2\7\b\2\2\u00b2\u00b3"+
		"\7/\2\2\u00b3\23\3\2\2\2\u00b4\u00b5\7\t\2\2\u00b5\u00b6\7\b\2\2\u00b6"+
		"\u00b7\5\26\f\2\u00b7\25\3\2\2\2\u00b8\u00bb\5\30\r\2\u00b9\u00bb\5\\"+
		"/\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\27\3\2\2\2\u00bc\u00bd"+
		"\5\32\16\2\u00bd\31\3\2\2\2\u00be\u00bf\7\n\2\2\u00bf\u00c0\5\34\17\2"+
		"\u00c0\u00c1\7\13\2\2\u00c1\33\3\2\2\2\u00c2\u00c7\7.\2\2\u00c3\u00c4"+
		"\7\f\2\2\u00c4\u00c6\7.\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\35\3\2\2\2\u00c9\u00c7\3\2\2"+
		"\2\u00ca\u00cd\7\r\2\2\u00cb\u00cc\7\b\2\2\u00cc\u00ce\5R*\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\37\3\2\2\2\u00cf\u00d2\7\16\2\2\u00d0"+
		"\u00d1\7\b\2\2\u00d1\u00d3\5R*\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2"+
		"\2\u00d3!\3\2\2\2\u00d4\u00d6\7\17\2\2\u00d5\u00d7\5P)\2\u00d6\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\7\4\2\2\u00db#\3\2\2\2\u00dc\u00e8\7\20\2\2"+
		"\u00dd\u00df\5&\24\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e9\3\2\2\2\u00e2\u00e4\5\\/\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8"+
		"\u00e5\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\4\2\2\u00eb%\3\2\2\2"+
		"\u00ec\u00f2\5(\25\2\u00ed\u00f2\5*\26\2\u00ee\u00f2\5,\27\2\u00ef\u00f2"+
		"\5.\30\2\u00f0\u00f2\5\62\32\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2"+
		"\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\'\3"+
		"\2\2\2\u00f3\u00f4\7\21\2\2\u00f4\u00f5\7\b\2\2\u00f5\u00f6\7/\2\2\u00f6"+
		")\3\2\2\2\u00f7\u00f8\7\22\2\2\u00f8\u00f9\7\b\2\2\u00f9\u00fa\7/\2\2"+
		"\u00fa+\3\2\2\2\u00fb\u00fc\7\23\2\2\u00fc\u00fd\7\b\2\2\u00fd\u00fe\7"+
		"/\2\2\u00fe-\3\2\2\2\u00ff\u0100\7\24\2\2\u0100\u0101\7\b\2\2\u0101\u0102"+
		"\5\60\31\2\u0102/\3\2\2\2\u0103\u0104\7\25\2\2\u0104\61\3\2\2\2\u0105"+
		"\u0106\7\26\2\2\u0106\u0107\7\b\2\2\u0107\u0108\5\64\33\2\u0108\63\3\2"+
		"\2\2\u0109\u010a\7\25\2\2\u010a\65\3\2\2\2\u010b\u0112\7\27\2\2\u010c"+
		"\u010e\58\35\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u0113\5\\/\2\u0112"+
		"\u010d\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\4"+
		"\2\2\u0115\67\3\2\2\2\u0116\u011a\5<\37\2\u0117\u011a\5> \2\u0118\u011a"+
		"\5:\36\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a"+
		"9\3\2\2\2\u011b\u011c\7\30\2\2\u011c\u011d\7\31\2\2\u011d\u011e\5\34\17"+
		"\2\u011e\u011f\7\13\2\2\u011f;\3\2\2\2\u0120\u0121\7\32\2\2\u0121\u0122"+
		"\7\31\2\2\u0122\u0123\5\34\17\2\u0123\u0124\7\13\2\2\u0124=\3\2\2\2\u0125"+
		"\u0126\7\33\2\2\u0126\u0127\7\31\2\2\u0127\u0128\5\34\17\2\u0128\u0129"+
		"\7\13\2\2\u0129?\3\2\2\2\u012a\u0131\7\34\2\2\u012b\u012d\5B\"\2\u012c"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0132\3\2\2\2\u0130\u0132\5\\/\2\u0131\u012c\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7\4\2\2\u0134A\3\2\2\2"+
		"\u0135\u0136\5D#\2\u0136C\3\2\2\2\u0137\u0138\7\35\2\2\u0138E\3\2\2\2"+
		"\u0139\u013b\7\36\2\2\u013a\u013c\5H%\2\u013b\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\7\4\2\2\u0140G\3\2\2\2\u0141\u0145\5N(\2\u0142\u0145\5P)\2\u0143"+
		"\u0145\5\\/\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2"+
		"\2\2\u0145\u014a\3\2\2\2\u0146\u0147\7\f\2\2\u0147\u0149\5J&\2\u0148\u0146"+
		"\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"I\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\5L\'\2\u014eK\3\2\2\2\u014f"+
		"\u0152\7\37\2\2\u0150\u0151\7\b\2\2\u0151\u0153\5R*\2\u0152\u0150\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153M\3\2\2\2\u0154\u0155\5`\61\2\u0155\u0156"+
		"\5T+\2\u0156\u015a\3\2\2\2\u0157\u015a\5P)\2\u0158\u015a\5\\/\2\u0159"+
		"\u0154\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015aO\3\2\2\2"+
		"\u015b\u015c\7 \2\2\u015c\u015d\7\b\2\2\u015d\u015e\5V,\2\u015e\u015f"+
		"\7\f\2\2\u015f\u0160\7!\2\2\u0160\u0161\7\b\2\2\u0161\u0162\5X-\2\u0162"+
		"Q\3\2\2\2\u0163\u0164\t\2\2\2\u0164S\3\2\2\2\u0165\u0167\7\31\2\2\u0166"+
		"\u0168\7/\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016b\7\f\2\2\u016a\u016c\7/\2\2\u016b\u016a\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7\13\2\2\u016eU\3\2\2\2"+
		"\u016f\u0172\7/\2\2\u0170\u0172\5Z.\2\u0171\u016f\3\2\2\2\u0171\u0170"+
		"\3\2\2\2\u0172W\3\2\2\2\u0173\u0176\7/\2\2\u0174\u0176\5Z.\2\u0175\u0173"+
		"\3\2\2\2\u0175\u0174\3\2\2\2\u0176Y\3\2\2\2\u0177\u0178\7$\2\2\u0178\u0179"+
		"\7/\2\2\u0179\u017a\7\f\2\2\u017a\u017b\7/\2\2\u017b\u017c\7%\2\2\u017c"+
		"[\3\2\2\2\u017d\u017e\7&\2\2\u017e\u017f\5^\60\2\u017f\u0180\7\'\2\2\u0180"+
		"]\3\2\2\2\u0181\u0186\n\3\2\2\u0182\u0186\7(\2\2\u0183\u0186\7)\2\2\u0184"+
		"\u0186\7*\2\2\u0185\u0181\3\2\2\2\u0185\u0182\3\2\2\2\u0185\u0183\3\2"+
		"\2\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188_\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\t\4\2\2"+
		"\u018ba\3\2\2\2\u018c\u018d\7.\2\2\u018dc\3\2\2\2\u018e\u018f\7.\2\2\u018f"+
		"e\3\2\2\2%q{\u0081\u0084\u008b\u0095\u009f\u00a5\u00a8\u00ae\u00ba\u00c7"+
		"\u00cd\u00d2\u00d8\u00e0\u00e5\u00e8\u00f1\u010f\u0112\u0119\u012e\u0131"+
		"\u013d\u0144\u014a\u0152\u0159\u0167\u016b\u0171\u0175\u0185\u0187";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}