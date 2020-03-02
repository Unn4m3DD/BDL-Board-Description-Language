// Generated from /mnt/d/lfa/BDL-Board-Description-Language/Board.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, STRING=23, VALUE=24, 
		WS=25;
	public static final int
		RULE_game = 0, RULE_pieces = 1, RULE_initial_status = 2, RULE_pieces_inital = 3, 
		RULE_rules = 4, RULE_invariants = 5, RULE_invariant_replace_this = 6, 
		RULE_finish = 7, RULE_piece = 8, RULE_piece_initial = 9, RULE_positions = 10, 
		RULE_moves = 11, RULE_move = 12, RULE_direction = 13, RULE_coordenates = 14, 
		RULE_pair = 15, RULE_x = 16, RULE_y = 17, RULE_interval = 18, RULE_explicit = 19, 
		RULE_name = 20, RULE_invariant = 21, RULE_property = 22;
	public static final String[] ruleNames = {
		"game", "pieces", "initial_status", "pieces_inital", "rules", "invariants", 
		"invariant_replace_this", "finish", "piece", "piece_initial", "positions", 
		"moves", "move", "direction", "coordenates", "pair", "x", "y", "interval", 
		"explicit", "name", "invariant", "property"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pieces{'", "'}'", "'initial_status{'", "'rules{'", "':'", "'invariants{'", 
		"'('", "','", "')'", "'finish{'", "'{'", "'positions{'", "'moves{'", "'vertical'", 
		"'horizontal'", "'diagonal'", "'x'", "'y'", "'['", "']'", "'explicit\u00AB'", 
		"'\u00BB'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "STRING", 
		"VALUE", "WS"
	};
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
		public PiecesContext pieces() {
			return getRuleContext(PiecesContext.class,0);
		}
		public Initial_statusContext initial_status() {
			return getRuleContext(Initial_statusContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public InvariantsContext invariants() {
			return getRuleContext(InvariantsContext.class,0);
		}
		public FinishContext finish() {
			return getRuleContext(FinishContext.class,0);
		}
		public GameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game; }
	}

	public final GameContext game() throws RecognitionException {
		GameContext _localctx = new GameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_game);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			pieces();
			setState(47);
			initial_status();
			setState(48);
			rules();
			setState(49);
			invariants();
			setState(50);
			finish();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PiecesContext extends ParserRuleContext {
		public List<PieceContext> piece() {
			return getRuleContexts(PieceContext.class);
		}
		public PieceContext piece(int i) {
			return getRuleContext(PieceContext.class,i);
		}
		public PiecesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieces; }
	}

	public final PiecesContext pieces() throws RecognitionException {
		PiecesContext _localctx = new PiecesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pieces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				piece();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(58);
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

	public static class Initial_statusContext extends ParserRuleContext {
		public Pieces_initalContext pieces_inital() {
			return getRuleContext(Pieces_initalContext.class,0);
		}
		public Initial_statusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_status; }
	}

	public final Initial_statusContext initial_status() throws RecognitionException {
		Initial_statusContext _localctx = new Initial_statusContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initial_status);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__2);
			setState(61);
			pieces_inital();
			setState(62);
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

	public static class Pieces_initalContext extends ParserRuleContext {
		public List<Piece_initialContext> piece_initial() {
			return getRuleContexts(Piece_initialContext.class);
		}
		public Piece_initialContext piece_initial(int i) {
			return getRuleContext(Piece_initialContext.class,i);
		}
		public Pieces_initalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieces_inital; }
	}

	public final Pieces_initalContext pieces_inital() throws RecognitionException {
		Pieces_initalContext _localctx = new Pieces_initalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pieces_inital);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				piece_initial();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			}
			setState(70);
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
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public List<TerminalNode> VALUE() { return getTokens(BoardParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(BoardParser.VALUE, i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__3);
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				property();
				setState(74);
				match(T__4);
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VALUE:
					{
					setState(75);
					match(VALUE);
					}
					break;
				case STRING:
					{
					setState(76);
					property();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(83);
				explicit();
				}
			}

			setState(86);
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

	public static class InvariantsContext extends ParserRuleContext {
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public List<Invariant_replace_thisContext> invariant_replace_this() {
			return getRuleContexts(Invariant_replace_thisContext.class);
		}
		public Invariant_replace_thisContext invariant_replace_this(int i) {
			return getRuleContext(Invariant_replace_thisContext.class,i);
		}
		public InvariantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariants; }
	}

	public final InvariantsContext invariants() throws RecognitionException {
		InvariantsContext _localctx = new InvariantsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_invariants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__5);
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					invariant_replace_this();
					}
					}
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__20 || _la==STRING );
				}
				break;
			case 2:
				{
				setState(94);
				explicit();
				}
				break;
			}
			setState(97);
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

	public static class Invariant_replace_thisContext extends ParserRuleContext {
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
		public Invariant_replace_thisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariant_replace_this; }
	}

	public final Invariant_replace_thisContext invariant_replace_this() throws RecognitionException {
		Invariant_replace_thisContext _localctx = new Invariant_replace_thisContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_invariant_replace_this);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(111); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(99);
						invariant();
						setState(100);
						match(T__6);
						setState(101);
						name();
						setState(106);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__7) {
							{
							{
							setState(102);
							match(T__7);
							setState(103);
							name();
							}
							}
							setState(108);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(109);
						match(T__8);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(113); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__20:
				{
				setState(115);
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

	public static class FinishContext extends ParserRuleContext {
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public List<Invariant_replace_thisContext> invariant_replace_this() {
			return getRuleContexts(Invariant_replace_thisContext.class);
		}
		public Invariant_replace_thisContext invariant_replace_this(int i) {
			return getRuleContext(Invariant_replace_thisContext.class,i);
		}
		public FinishContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finish; }
	}

	public final FinishContext finish() throws RecognitionException {
		FinishContext _localctx = new FinishContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_finish);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__9);
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(119);
					invariant_replace_this();
					}
					}
					setState(122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__20 || _la==STRING );
				}
				break;
			case 2:
				{
				setState(124);
				explicit();
				}
				break;
			}
			setState(127);
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

	public static class PieceContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public MovesContext moves() {
			return getRuleContext(MovesContext.class,0);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piece; }
	}

	public final PieceContext piece() throws RecognitionException {
		PieceContext _localctx = new PieceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_piece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			name();
			setState(130);
			match(T__10);
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				{
				setState(131);
				moves();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(132);
					property();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case T__20:
				{
				setState(138);
				explicit();
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

	public static class Piece_initialContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PositionsContext positions() {
			return getRuleContext(PositionsContext.class,0);
		}
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public Piece_initialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piece_initial; }
	}

	public final Piece_initialContext piece_initial() throws RecognitionException {
		Piece_initialContext _localctx = new Piece_initialContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_piece_initial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			name();
			setState(144);
			match(T__10);
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(145);
				positions();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(146);
					property();
					}
				}

				}
				break;
			case T__20:
				{
				setState(149);
				explicit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(152);
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

	public static class PositionsContext extends ParserRuleContext {
		public List<MoveContext> move() {
			return getRuleContexts(MoveContext.class);
		}
		public MoveContext move(int i) {
			return getRuleContext(MoveContext.class,i);
		}
		public PositionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positions; }
	}

	public final PositionsContext positions() throws RecognitionException {
		PositionsContext _localctx = new PositionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_positions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__11);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				move();
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__20))) != 0) );
			setState(160);
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
	}

	public final MovesContext moves() throws RecognitionException {
		MovesContext _localctx = new MovesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_moves);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__12);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				move();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__20))) != 0) );
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

	public static class MoveContext extends ParserRuleContext {
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public CoordenatesContext coordenates() {
			return getRuleContext(CoordenatesContext.class,0);
		}
		public ExplicitContext explicit() {
			return getRuleContext(ExplicitContext.class,0);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_move);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				direction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				coordenates();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				explicit();
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

	public static class DirectionContext extends ParserRuleContext {
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public CoordenatesContext coordenates() {
			return getRuleContext(CoordenatesContext.class,0);
		}
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_direction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(175);
				match(T__13);
				setState(176);
				pair();
				}
				break;
			case T__14:
				{
				setState(177);
				match(T__14);
				setState(178);
				pair();
				}
				break;
			case T__15:
				{
				setState(179);
				match(T__15);
				setState(180);
				pair();
				}
				break;
			case T__16:
				{
				setState(181);
				coordenates();
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

	public static class CoordenatesContext extends ParserRuleContext {
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public CoordenatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordenates; }
	}

	public final CoordenatesContext coordenates() throws RecognitionException {
		CoordenatesContext _localctx = new CoordenatesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_coordenates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__16);
			setState(185);
			match(T__4);
			setState(186);
			x();
			setState(187);
			match(T__7);
			setState(188);
			match(T__17);
			setState(189);
			match(T__4);
			setState(190);
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
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__6);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(193);
				match(VALUE);
				}
			}

			setState(196);
			match(T__7);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(197);
				match(VALUE);
				}
			}

			setState(200);
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
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_x);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(VALUE);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
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
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_y);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(VALUE);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
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
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__18);
			setState(211);
			match(VALUE);
			setState(212);
			match(T__7);
			setState(213);
			match(VALUE);
			setState(214);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
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
		public ExplicitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit; }
	}

	public final ExplicitContext explicit() throws RecognitionException {
		ExplicitContext _localctx = new ExplicitContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_explicit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__20);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << STRING) | (1L << VALUE) | (1L << WS))) != 0) );
			setState(222);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
	}

	public final InvariantContext invariant() throws RecognitionException {
		InvariantContext _localctx = new InvariantContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_invariant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BoardParser.STRING, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00e9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\6\39\n\3\r\3\16\3:\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\6\5E\n\5\r\5\16\5F\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\6\6R\n\6"+
		"\r\6\16\6S\3\6\5\6W\n\6\3\6\3\6\3\7\3\7\6\7]\n\7\r\7\16\7^\3\7\5\7b\n"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\6\br\n"+
		"\b\r\b\16\bs\3\b\5\bw\n\b\3\t\3\t\6\t{\n\t\r\t\16\t|\3\t\5\t\u0080\n\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n\3\n\5\n\u008e"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0096\n\13\3\13\5\13\u0099\n\13"+
		"\3\13\3\13\3\f\3\f\6\f\u009f\n\f\r\f\16\f\u00a0\3\f\3\f\3\r\3\r\6\r\u00a7"+
		"\n\r\r\r\16\r\u00a8\3\r\3\r\3\16\3\16\3\16\5\16\u00b0\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00b9\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\5\21\u00c5\n\21\3\21\3\21\5\21\u00c9\n\21\3\21\3"+
		"\21\3\22\3\22\5\22\u00cf\n\22\3\23\3\23\5\23\u00d3\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\6\25\u00dd\n\25\r\25\16\25\u00de\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\2\3\3\2\30\30\2\u00ed\2\60\3\2\2\2\4\66\3\2\2\2\6>"+
		"\3\2\2\2\bB\3\2\2\2\nJ\3\2\2\2\fZ\3\2\2\2\16v\3\2\2\2\20x\3\2\2\2\22\u0083"+
		"\3\2\2\2\24\u0091\3\2\2\2\26\u009c\3\2\2\2\30\u00a4\3\2\2\2\32\u00af\3"+
		"\2\2\2\34\u00b8\3\2\2\2\36\u00ba\3\2\2\2 \u00c2\3\2\2\2\"\u00ce\3\2\2"+
		"\2$\u00d2\3\2\2\2&\u00d4\3\2\2\2(\u00da\3\2\2\2*\u00e2\3\2\2\2,\u00e4"+
		"\3\2\2\2.\u00e6\3\2\2\2\60\61\5\4\3\2\61\62\5\6\4\2\62\63\5\n\6\2\63\64"+
		"\5\f\7\2\64\65\5\20\t\2\65\3\3\2\2\2\668\7\3\2\2\679\5\22\n\28\67\3\2"+
		"\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\4\2\2=\5\3\2\2\2>?\7"+
		"\5\2\2?@\5\b\5\2@A\7\4\2\2A\7\3\2\2\2BD\7\3\2\2CE\5\24\13\2DC\3\2\2\2"+
		"EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\4\2\2I\t\3\2\2\2JQ\7\6\2"+
		"\2KL\5.\30\2LO\7\7\2\2MP\7\32\2\2NP\5.\30\2OM\3\2\2\2ON\3\2\2\2PR\3\2"+
		"\2\2QK\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\5(\25\2VU\3\2"+
		"\2\2VW\3\2\2\2WX\3\2\2\2XY\7\4\2\2Y\13\3\2\2\2Za\7\b\2\2[]\5\16\b\2\\"+
		"[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`b\5(\25\2a\\\3\2\2"+
		"\2a`\3\2\2\2bc\3\2\2\2cd\7\4\2\2d\r\3\2\2\2ef\5,\27\2fg\7\t\2\2gl\5*\26"+
		"\2hi\7\n\2\2ik\5*\26\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2"+
		"\2nl\3\2\2\2op\7\13\2\2pr\3\2\2\2qe\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2"+
		"\2\2tw\3\2\2\2uw\5(\25\2vq\3\2\2\2vu\3\2\2\2w\17\3\2\2\2x\177\7\f\2\2"+
		"y{\5\16\b\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~\u0080"+
		"\5(\25\2\177z\3\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\4"+
		"\2\2\u0082\21\3\2\2\2\u0083\u0084\5*\26\2\u0084\u008d\7\r\2\2\u0085\u0089"+
		"\5\30\r\2\u0086\u0088\5.\30\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008e\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008e\5(\25\2\u008d\u0085\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\7\4\2\2\u0090\23\3\2\2\2\u0091\u0092\5*\26"+
		"\2\u0092\u0098\7\r\2\2\u0093\u0095\5\26\f\2\u0094\u0096\5.\30\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0099\5("+
		"\25\2\u0098\u0093\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\7\4\2\2\u009b\25\3\2\2\2\u009c\u009e\7\16\2\2\u009d\u009f\5\32"+
		"\16\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\4\2\2\u00a3\27\3\2\2"+
		"\2\u00a4\u00a6\7\17\2\2\u00a5\u00a7\5\32\16\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\7\4\2\2\u00ab\31\3\2\2\2\u00ac\u00b0\5\34\17\2\u00ad"+
		"\u00b0\5\36\20\2\u00ae\u00b0\5(\25\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3"+
		"\2\2\2\u00af\u00ae\3\2\2\2\u00b0\33\3\2\2\2\u00b1\u00b2\7\20\2\2\u00b2"+
		"\u00b9\5 \21\2\u00b3\u00b4\7\21\2\2\u00b4\u00b9\5 \21\2\u00b5\u00b6\7"+
		"\22\2\2\u00b6\u00b9\5 \21\2\u00b7\u00b9\5\36\20\2\u00b8\u00b1\3\2\2\2"+
		"\u00b8\u00b3\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\35"+
		"\3\2\2\2\u00ba\u00bb\7\23\2\2\u00bb\u00bc\7\7\2\2\u00bc\u00bd\5\"\22\2"+
		"\u00bd\u00be\7\n\2\2\u00be\u00bf\7\24\2\2\u00bf\u00c0\7\7\2\2\u00c0\u00c1"+
		"\5$\23\2\u00c1\37\3\2\2\2\u00c2\u00c4\7\t\2\2\u00c3\u00c5\7\32\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\7\n"+
		"\2\2\u00c7\u00c9\7\32\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\7\13\2\2\u00cb!\3\2\2\2\u00cc\u00cf\7\32\2"+
		"\2\u00cd\u00cf\5&\24\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf#"+
		"\3\2\2\2\u00d0\u00d3\7\32\2\2\u00d1\u00d3\5&\24\2\u00d2\u00d0\3\2\2\2"+
		"\u00d2\u00d1\3\2\2\2\u00d3%\3\2\2\2\u00d4\u00d5\7\25\2\2\u00d5\u00d6\7"+
		"\32\2\2\u00d6\u00d7\7\n\2\2\u00d7\u00d8\7\32\2\2\u00d8\u00d9\7\26\2\2"+
		"\u00d9\'\3\2\2\2\u00da\u00dc\7\27\2\2\u00db\u00dd\n\2\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\7\30\2\2\u00e1)\3\2\2\2\u00e2\u00e3\7\31\2"+
		"\2\u00e3+\3\2\2\2\u00e4\u00e5\7\31\2\2\u00e5-\3\2\2\2\u00e6\u00e7\7\31"+
		"\2\2\u00e7/\3\2\2\2\33:FOSV^alsv|\177\u0089\u008d\u0095\u0098\u00a0\u00a8"+
		"\u00af\u00b8\u00c4\u00c8\u00ce\u00d2\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}