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
		T__31=32, STRING=33, VALUE=34, WS=35;
	public static final int
		RULE_game = 0, RULE_piecesDescription = 1, RULE_pieceDescription = 2, 
		RULE_pieceDescriptionProperty = 3, RULE_initialStatus = 4, RULE_piecesInitialStatus = 5, 
		RULE_pieceInitialStatus = 6, RULE_pieceInitialStatusProperty = 7, RULE_onEndReached = 8, 
		RULE_endReachedFunctions = 9, RULE_endReachedKnownFunctions = 10, RULE_spawnFunction = 11, 
		RULE_stringArray = 12, RULE_canJump = 13, RULE_mirrored = 14, RULE_bool = 15, 
		RULE_positions = 16, RULE_rules = 17, RULE_ruleDef = 18, RULE_invariants = 19, 
		RULE_finish = 20, RULE_function = 21, RULE_moves = 22, RULE_move = 23, 
		RULE_moveProperty = 24, RULE_killing = 25, RULE_direction = 26, RULE_coordinates = 27, 
		RULE_pair = 28, RULE_x = 29, RULE_y = 30, RULE_interval = 31, RULE_explicit = 32, 
		RULE_explicitContent = 33, RULE_languageKeywords = 34, RULE_name = 35, 
		RULE_invariant = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"game", "piecesDescription", "pieceDescription", "pieceDescriptionProperty", 
			"initialStatus", "piecesInitialStatus", "pieceInitialStatus", "pieceInitialStatusProperty", 
			"onEndReached", "endReachedFunctions", "endReachedKnownFunctions", "spawnFunction", 
			"stringArray", "canJump", "mirrored", "bool", "positions", "rules", "ruleDef", 
			"invariants", "finish", "function", "moves", "move", "moveProperty", 
			"killing", "direction", "coordinates", "pair", "x", "y", "interval", 
			"explicit", "explicitContent", "languageKeywords", "name", "invariant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pieces{'", "'}'", "'{'", "'initial_status{'", "'on_end_reached'", 
			"':'", "'spawn('", "')'", "','", "'can_jump'", "'mirrored'", "'true'", 
			"'false'", "'positions{'", "'rules{'", "'invariants{'", "'finish{'", 
			"'('", "'moves{'", "'kills'", "'x'", "'y'", "'['", "']'", "'explicit{|'", 
			"'|}'", "'='", "'>'", "'<'", "'vertical'", "'horizontal'", "'diagonal'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "STRING", "VALUE", 
			"WS"
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
			setState(74);
			rules();
			setState(75);
			piecesDescription();
			setState(76);
			initialStatus();
			setState(77);
			invariants();
			setState(78);
			finish();
			setState(79);
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
			setState(81);
			match(T__0);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				pieceDescription();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(87);
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
			setState(89);
			name();
			setState(90);
			match(T__2);
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				{
				{
				setState(91);
				moves();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4 || _la==T__9) {
					{
					{
					setState(92);
					pieceDescriptionProperty();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__1:
			case T__24:
				{
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(98);
					explicit();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(106);
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				canJump();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				onEndReached();
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
			setState(112);
			match(T__3);
			setState(113);
			piecesInitialStatus();
			setState(114);
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
			setState(116);
			match(T__0);
			{
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				pieceInitialStatus();
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			}
			setState(122);
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
			setState(124);
			name();
			setState(125);
			match(T__2);
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(126);
				positions();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(127);
					pieceInitialStatusProperty();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
			case T__24:
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(133);
					explicit();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class PieceInitialStatusPropertyContext extends ParserRuleContext {
		public MirroredContext mirrored() {
			return getRuleContext(MirroredContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			mirrored();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 16, RULE_onEndReached);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__4);
			setState(146);
			match(T__5);
			setState(147);
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
		enterRule(_localctx, 18, RULE_endReachedFunctions);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				endReachedKnownFunctions();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
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
		enterRule(_localctx, 20, RULE_endReachedKnownFunctions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		enterRule(_localctx, 22, RULE_spawnFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__6);
			setState(156);
			stringArray();
			setState(157);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 24, RULE_stringArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(STRING);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(160);
				match(T__8);
				setState(161);
				match(STRING);
				}
				}
				setState(166);
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
		enterRule(_localctx, 26, RULE_canJump);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__9);
			setState(168);
			match(T__5);
			setState(169);
			bool();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 28, RULE_mirrored);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__10);
			setState(172);
			match(T__5);
			setState(173);
			bool();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
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
			setState(177);
			match(T__13);
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178);
				coordinates();
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__20 );
			setState(183);
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
			setState(185);
			match(T__14);
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(186);
					ruleDef();
					}
					}
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
			case T__1:
			case T__24:
				{
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(191);
					explicit();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(199);
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
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode VALUE() { return getToken(BoardParser.VALUE, 0); }
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			name();
			setState(202);
			match(T__5);
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				{
				setState(203);
				match(VALUE);
				}
				break;
			case STRING:
				{
				setState(204);
				name();
				}
				break;
			case T__24:
				{
				setState(205);
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

	public static class InvariantsContext extends ParserRuleContext {
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
		enterRule(_localctx, 38, RULE_invariants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__15);
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(209);
					function();
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__24 || _la==STRING );
				}
				break;
			case 2:
				{
				setState(214);
				explicit();
				}
				break;
			}
			setState(217);
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

	public static class FinishContext extends ParserRuleContext {
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
		enterRule(_localctx, 40, RULE_finish);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__16);
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(220);
					function();
					}
					}
					setState(223); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__24 || _la==STRING );
				}
				break;
			case 2:
				{
				setState(225);
				explicit();
				}
				break;
			}
			setState(228);
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

	public static class FunctionContext extends ParserRuleContext {
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public List<InvariantContext> invariant() {
			return getRuleContexts(InvariantContext.class);
		}
		public InvariantContext invariant(int i) {
			return getRuleContext(InvariantContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(242); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(230);
						invariant();
						setState(231);
						match(T__17);
						setState(232);
						name();
						setState(237);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__8) {
							{
							{
							setState(233);
							match(T__8);
							setState(234);
							name();
							}
							}
							setState(239);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(240);
						match(T__7);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(244); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__24:
				{
				setState(246);
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
		enterRule(_localctx, 44, RULE_moves);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__18);
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				move();
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__24) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0) );
			setState(255);
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
		enterRule(_localctx, 46, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(257);
				direction();
				}
				break;
			case 2:
				{
				setState(258);
				coordinates();
				}
				break;
			case 3:
				{
				setState(259);
				explicit();
				}
				break;
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(262);
				match(T__8);
				setState(263);
				moveProperty();
				}
				}
				setState(268);
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
		enterRule(_localctx, 48, RULE_moveProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 50, RULE_killing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__19);
			setState(272);
			match(T__5);
			setState(273);
			bool();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_direction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__31:
				{
				setState(275);
				languageKeywords();
				setState(276);
				pair();
				}
				break;
			case T__20:
				{
				setState(278);
				coordinates();
				}
				break;
			case T__24:
				{
				setState(279);
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
		enterRule(_localctx, 54, RULE_coordinates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__20);
			setState(283);
			match(T__5);
			setState(284);
			x();
			setState(285);
			match(T__8);
			setState(286);
			match(T__21);
			setState(287);
			match(T__5);
			setState(288);
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
		enterRule(_localctx, 56, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__17);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(291);
				match(VALUE);
				}
			}

			setState(294);
			match(T__8);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(295);
				match(VALUE);
				}
			}

			setState(298);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_x);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(VALUE);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
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
		enterRule(_localctx, 60, RULE_y);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(VALUE);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
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
		enterRule(_localctx, 62, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__22);
			setState(309);
			match(VALUE);
			setState(310);
			match(T__8);
			setState(311);
			match(VALUE);
			setState(312);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_explicit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__24);
			setState(315);
			explicitContent();
			setState(316);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 66, RULE_explicitContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << STRING) | (1L << VALUE) | (1L << WS))) != 0)) {
				{
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(318);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__25) ) {
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
					setState(319);
					match(T__26);
					}
					break;
				case 3:
					{
					setState(320);
					match(T__27);
					}
					break;
				case 4:
					{
					setState(321);
					match(T__28);
					}
					break;
				}
				}
				setState(326);
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
		enterRule(_localctx, 68, RULE_languageKeywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		enterRule(_localctx, 72, RULE_invariant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0150\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\6\3V\n\3\r\3\16\3W\3\3\3\3\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4"+
		"\3\4\7\4f\n\4\f\4\16\4i\13\4\5\4k\n\4\3\4\3\4\3\5\3\5\5\5q\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\6\7y\n\7\r\7\16\7z\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0083"+
		"\n\b\f\b\16\b\u0086\13\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b\5\b\u008e"+
		"\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u009a\n\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00a5\n\16\f\16\16\16\u00a8\13\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\6\22\u00b6"+
		"\n\22\r\22\16\22\u00b7\3\22\3\22\3\23\3\23\6\23\u00be\n\23\r\23\16\23"+
		"\u00bf\3\23\7\23\u00c3\n\23\f\23\16\23\u00c6\13\23\5\23\u00c8\n\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00d1\n\24\3\25\3\25\6\25\u00d5\n"+
		"\25\r\25\16\25\u00d6\3\25\5\25\u00da\n\25\3\25\3\25\3\26\3\26\6\26\u00e0"+
		"\n\26\r\26\16\26\u00e1\3\26\5\26\u00e5\n\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\7\27\u00ee\n\27\f\27\16\27\u00f1\13\27\3\27\3\27\6\27\u00f5\n"+
		"\27\r\27\16\27\u00f6\3\27\5\27\u00fa\n\27\3\30\3\30\6\30\u00fe\n\30\r"+
		"\30\16\30\u00ff\3\30\3\30\3\31\3\31\3\31\5\31\u0107\n\31\3\31\3\31\7\31"+
		"\u010b\n\31\f\31\16\31\u010e\13\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u011b\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\5\36\u0127\n\36\3\36\3\36\5\36\u012b\n\36\3\36\3\36\3"+
		"\37\3\37\5\37\u0131\n\37\3 \3 \5 \u0135\n \3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\7#\u0145\n#\f#\16#\u0148\13#\3$\3$\3%\3%\3&\3&\3&\2"+
		"\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJ\2\5\3\2\16\17\3\2\34\34\3\2 \"\2\u0150\2L\3\2\2\2\4S\3\2\2\2\6["+
		"\3\2\2\2\bp\3\2\2\2\nr\3\2\2\2\fv\3\2\2\2\16~\3\2\2\2\20\u0091\3\2\2\2"+
		"\22\u0093\3\2\2\2\24\u0099\3\2\2\2\26\u009b\3\2\2\2\30\u009d\3\2\2\2\32"+
		"\u00a1\3\2\2\2\34\u00a9\3\2\2\2\36\u00ad\3\2\2\2 \u00b1\3\2\2\2\"\u00b3"+
		"\3\2\2\2$\u00bb\3\2\2\2&\u00cb\3\2\2\2(\u00d2\3\2\2\2*\u00dd\3\2\2\2,"+
		"\u00f9\3\2\2\2.\u00fb\3\2\2\2\60\u0106\3\2\2\2\62\u010f\3\2\2\2\64\u0111"+
		"\3\2\2\2\66\u011a\3\2\2\28\u011c\3\2\2\2:\u0124\3\2\2\2<\u0130\3\2\2\2"+
		">\u0134\3\2\2\2@\u0136\3\2\2\2B\u013c\3\2\2\2D\u0146\3\2\2\2F\u0149\3"+
		"\2\2\2H\u014b\3\2\2\2J\u014d\3\2\2\2LM\5$\23\2MN\5\4\3\2NO\5\n\6\2OP\5"+
		"(\25\2PQ\5*\26\2QR\7\2\2\3R\3\3\2\2\2SU\7\3\2\2TV\5\6\4\2UT\3\2\2\2VW"+
		"\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\4\2\2Z\5\3\2\2\2[\\\5H%\2\\"+
		"j\7\5\2\2]a\5.\30\2^`\5\b\5\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2"+
		"bk\3\2\2\2ca\3\2\2\2df\5B\"\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2j]\3\2\2\2jg\3\2\2\2kl\3\2\2\2lm\7\4\2\2m\7\3\2\2"+
		"\2nq\5\34\17\2oq\5\22\n\2pn\3\2\2\2po\3\2\2\2q\t\3\2\2\2rs\7\6\2\2st\5"+
		"\f\7\2tu\7\4\2\2u\13\3\2\2\2vx\7\3\2\2wy\5\16\b\2xw\3\2\2\2yz\3\2\2\2"+
		"zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\4\2\2}\r\3\2\2\2~\177\5H%\2\177\u008d"+
		"\7\5\2\2\u0080\u0084\5\"\22\2\u0081\u0083\5\20\t\2\u0082\u0081\3\2\2\2"+
		"\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008e"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\5B\"\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u0080\3\2\2\2\u008d\u008a\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\7\4\2\2\u0090\17\3\2\2\2\u0091\u0092\5\36\20"+
		"\2\u0092\21\3\2\2\2\u0093\u0094\7\7\2\2\u0094\u0095\7\b\2\2\u0095\u0096"+
		"\5\24\13\2\u0096\23\3\2\2\2\u0097\u009a\5\26\f\2\u0098\u009a\5B\"\2\u0099"+
		"\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\25\3\2\2\2\u009b\u009c\5\30\r"+
		"\2\u009c\27\3\2\2\2\u009d\u009e\7\t\2\2\u009e\u009f\5\32\16\2\u009f\u00a0"+
		"\7\n\2\2\u00a0\31\3\2\2\2\u00a1\u00a6\7#\2\2\u00a2\u00a3\7\13\2\2\u00a3"+
		"\u00a5\7#\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa"+
		"\7\f\2\2\u00aa\u00ab\7\b\2\2\u00ab\u00ac\5 \21\2\u00ac\35\3\2\2\2\u00ad"+
		"\u00ae\7\r\2\2\u00ae\u00af\7\b\2\2\u00af\u00b0\5 \21\2\u00b0\37\3\2\2"+
		"\2\u00b1\u00b2\t\2\2\2\u00b2!\3\2\2\2\u00b3\u00b5\7\20\2\2\u00b4\u00b6"+
		"\58\35\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\4\2\2\u00ba#\3\2\2\2"+
		"\u00bb\u00c7\7\21\2\2\u00bc\u00be\5&\24\2\u00bd\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c8\3\2\2\2\u00c1"+
		"\u00c3\5B\"\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00bd\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\4"+
		"\2\2\u00ca%\3\2\2\2\u00cb\u00cc\5H%\2\u00cc\u00d0\7\b\2\2\u00cd\u00d1"+
		"\7$\2\2\u00ce\u00d1\5H%\2\u00cf\u00d1\5B\"\2\u00d0\u00cd\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\'\3\2\2\2\u00d2\u00d9\7\22\2"+
		"\2\u00d3\u00d5\5,\27\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00da\5B\"\2\u00d9"+
		"\u00d4\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\4"+
		"\2\2\u00dc)\3\2\2\2\u00dd\u00e4\7\23\2\2\u00de\u00e0\5,\27\2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e5\5B\"\2\u00e4\u00df\3\2\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\4\2\2\u00e7+\3\2\2\2\u00e8\u00e9"+
		"\5J&\2\u00e9\u00ea\7\24\2\2\u00ea\u00ef\5H%\2\u00eb\u00ec\7\13\2\2\u00ec"+
		"\u00ee\5H%\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2"+
		"\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3"+
		"\7\n\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00e8\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00fa\5B"+
		"\"\2\u00f9\u00f4\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa-\3\2\2\2\u00fb\u00fd"+
		"\7\25\2\2\u00fc\u00fe\5\60\31\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2"+
		"\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\7\4\2\2\u0102/\3\2\2\2\u0103\u0107\5\66\34\2\u0104\u0107\58\35\2\u0105"+
		"\u0107\5B\"\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2"+
		"\2\2\u0107\u010c\3\2\2\2\u0108\u0109\7\13\2\2\u0109\u010b\5\62\32\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\61\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\5\64\33\2\u0110"+
		"\63\3\2\2\2\u0111\u0112\7\26\2\2\u0112\u0113\7\b\2\2\u0113\u0114\5 \21"+
		"\2\u0114\65\3\2\2\2\u0115\u0116\5F$\2\u0116\u0117\5:\36\2\u0117\u011b"+
		"\3\2\2\2\u0118\u011b\58\35\2\u0119\u011b\5B\"\2\u011a\u0115\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\67\3\2\2\2\u011c\u011d\7\27\2"+
		"\2\u011d\u011e\7\b\2\2\u011e\u011f\5<\37\2\u011f\u0120\7\13\2\2\u0120"+
		"\u0121\7\30\2\2\u0121\u0122\7\b\2\2\u0122\u0123\5> \2\u01239\3\2\2\2\u0124"+
		"\u0126\7\24\2\2\u0125\u0127\7$\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u012a\7\13\2\2\u0129\u012b\7$\2\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\n"+
		"\2\2\u012d;\3\2\2\2\u012e\u0131\7$\2\2\u012f\u0131\5@!\2\u0130\u012e\3"+
		"\2\2\2\u0130\u012f\3\2\2\2\u0131=\3\2\2\2\u0132\u0135\7$\2\2\u0133\u0135"+
		"\5@!\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135?\3\2\2\2\u0136\u0137"+
		"\7\31\2\2\u0137\u0138\7$\2\2\u0138\u0139\7\13\2\2\u0139\u013a\7$\2\2\u013a"+
		"\u013b\7\32\2\2\u013bA\3\2\2\2\u013c\u013d\7\33\2\2\u013d\u013e\5D#\2"+
		"\u013e\u013f\7\34\2\2\u013fC\3\2\2\2\u0140\u0145\n\3\2\2\u0141\u0145\7"+
		"\35\2\2\u0142\u0145\7\36\2\2\u0143\u0145\7\37\2\2\u0144\u0140\3\2\2\2"+
		"\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147E\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014a\t\4\2\2\u014aG\3\2\2\2\u014b\u014c\7#\2\2\u014c"+
		"I\3\2\2\2\u014d\u014e\7#\2\2\u014eK\3\2\2\2#Wagjpz\u0084\u008a\u008d\u0099"+
		"\u00a6\u00b7\u00bf\u00c4\u00c7\u00d0\u00d6\u00d9\u00e1\u00e4\u00ef\u00f6"+
		"\u00f9\u00ff\u0106\u010c\u011a\u0126\u012a\u0130\u0134\u0144\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}