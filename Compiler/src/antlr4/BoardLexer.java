// Generated from D:/dev/BDL-Board-Description-Language/Compiler/src\Board.g4 by ANTLR 4.8
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BoardLexer extends Lexer {
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
		T__38=39, STRING=40, VALUE=41, WS=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "STRING", "VALUE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pieces{'", "'}'", "'{'", "'initial_status{'", "'owner'", "':'", 
			"'on_end_reached'", "'spawn('", "')'", "','", "'can_jump'", "'mirrored'", 
			"'positions{'", "'rules{'", "'first_player'", "'width'", "'height'", 
			"'coloring'", "'alternate'", "'player_change'", "'invariants{'", "'finish{'", 
			"'('", "'moves{'", "'kills'", "'x'", "'y'", "'true'", "'false'", "'['", 
			"']'", "'explicit{|'", "'|}'", "'='", "'>'", "'<'", "'vertical'", "'horizontal'", 
			"'diagonal'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "STRING", "VALUE", "WS"
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


	public BoardLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Board.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3)\6)\u015d\n)\r)\16)\u015e\3*\5*\u0162\n*\3*\6*\u0165"+
		"\n*\r*\16*\u0166\3*\6*\u016a\n*\r*\16*\u016b\3*\5*\u016f\n*\3+\6+\u0172"+
		"\n+\r+\16+\u0173\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\5\5\2C\\aa"+
		"c|\3\2\62;\5\2\13\f\17\17\"\"\2\u017c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5_\3\2\2\2\7"+
		"a\3\2\2\2\tc\3\2\2\2\13s\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21\u008a\3\2\2"+
		"\2\23\u0091\3\2\2\2\25\u0093\3\2\2\2\27\u0095\3\2\2\2\31\u009e\3\2\2\2"+
		"\33\u00a7\3\2\2\2\35\u00b2\3\2\2\2\37\u00b9\3\2\2\2!\u00c6\3\2\2\2#\u00cc"+
		"\3\2\2\2%\u00d3\3\2\2\2\'\u00dc\3\2\2\2)\u00e6\3\2\2\2+\u00f4\3\2\2\2"+
		"-\u0100\3\2\2\2/\u0108\3\2\2\2\61\u010a\3\2\2\2\63\u0111\3\2\2\2\65\u0117"+
		"\3\2\2\2\67\u0119\3\2\2\29\u011b\3\2\2\2;\u0120\3\2\2\2=\u0126\3\2\2\2"+
		"?\u0128\3\2\2\2A\u012a\3\2\2\2C\u0135\3\2\2\2E\u0138\3\2\2\2G\u013a\3"+
		"\2\2\2I\u013c\3\2\2\2K\u013e\3\2\2\2M\u0147\3\2\2\2O\u0152\3\2\2\2Q\u015c"+
		"\3\2\2\2S\u0161\3\2\2\2U\u0171\3\2\2\2WX\7r\2\2XY\7k\2\2YZ\7g\2\2Z[\7"+
		"e\2\2[\\\7g\2\2\\]\7u\2\2]^\7}\2\2^\4\3\2\2\2_`\7\177\2\2`\6\3\2\2\2a"+
		"b\7}\2\2b\b\3\2\2\2cd\7k\2\2de\7p\2\2ef\7k\2\2fg\7v\2\2gh\7k\2\2hi\7c"+
		"\2\2ij\7n\2\2jk\7a\2\2kl\7u\2\2lm\7v\2\2mn\7c\2\2no\7v\2\2op\7w\2\2pq"+
		"\7u\2\2qr\7}\2\2r\n\3\2\2\2st\7q\2\2tu\7y\2\2uv\7p\2\2vw\7g\2\2wx\7t\2"+
		"\2x\f\3\2\2\2yz\7<\2\2z\16\3\2\2\2{|\7q\2\2|}\7p\2\2}~\7a\2\2~\177\7g"+
		"\2\2\177\u0080\7p\2\2\u0080\u0081\7f\2\2\u0081\u0082\7a\2\2\u0082\u0083"+
		"\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7c\2\2\u0085\u0086\7e\2\2\u0086"+
		"\u0087\7j\2\2\u0087\u0088\7g\2\2\u0088\u0089\7f\2\2\u0089\20\3\2\2\2\u008a"+
		"\u008b\7u\2\2\u008b\u008c\7r\2\2\u008c\u008d\7c\2\2\u008d\u008e\7y\2\2"+
		"\u008e\u008f\7p\2\2\u008f\u0090\7*\2\2\u0090\22\3\2\2\2\u0091\u0092\7"+
		"+\2\2\u0092\24\3\2\2\2\u0093\u0094\7.\2\2\u0094\26\3\2\2\2\u0095\u0096"+
		"\7e\2\2\u0096\u0097\7c\2\2\u0097\u0098\7p\2\2\u0098\u0099\7a\2\2\u0099"+
		"\u009a\7l\2\2\u009a\u009b\7w\2\2\u009b\u009c\7o\2\2\u009c\u009d\7r\2\2"+
		"\u009d\30\3\2\2\2\u009e\u009f\7o\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7"+
		"t\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7f\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7r\2\2\u00a8\u00a9"+
		"\7q\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\u00ad\7k\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7u\2\2"+
		"\u00b0\u00b1\7}\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7"+
		"w\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8"+
		"\7}\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc"+
		"\7t\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7a\2\2\u00bf"+
		"\u00c0\7r\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7{\2\2"+
		"\u00c3\u00c4\7g\2\2\u00c4\u00c5\7t\2\2\u00c5 \3\2\2\2\u00c6\u00c7\7y\2"+
		"\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb"+
		"\7j\2\2\u00cb\"\3\2\2\2\u00cc\u00cd\7j\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf"+
		"\7k\2\2\u00cf\u00d0\7i\2\2\u00d0\u00d1\7j\2\2\u00d1\u00d2\7v\2\2\u00d2"+
		"$\3\2\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7n\2\2\u00d6"+
		"\u00d7\7q\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2"+
		"\u00da\u00db\7i\2\2\u00db&\3\2\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7n\2"+
		"\2\u00de\u00df\7v\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2"+
		"\7p\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7g\2\2\u00e5"+
		"(\3\2\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7c\2\2\u00e9"+
		"\u00ea\7{\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7a\2\2"+
		"\u00ed\u00ee\7e\2\2\u00ee\u00ef\7j\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1"+
		"\7p\2\2\u00f1\u00f2\7i\2\2\u00f2\u00f3\7g\2\2\u00f3*\3\2\2\2\u00f4\u00f5"+
		"\7k\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7x\2\2\u00f7\u00f8\7c\2\2\u00f8"+
		"\u00f9\7t\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7p\2\2"+
		"\u00fc\u00fd\7v\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7}\2\2\u00ff,\3\2\2"+
		"\2\u0100\u0101\7h\2\2\u0101\u0102\7k\2\2\u0102\u0103\7p\2\2\u0103\u0104"+
		"\7k\2\2\u0104\u0105\7u\2\2\u0105\u0106\7j\2\2\u0106\u0107\7}\2\2\u0107"+
		".\3\2\2\2\u0108\u0109\7*\2\2\u0109\60\3\2\2\2\u010a\u010b\7o\2\2\u010b"+
		"\u010c\7q\2\2\u010c\u010d\7x\2\2\u010d\u010e\7g\2\2\u010e\u010f\7u\2\2"+
		"\u010f\u0110\7}\2\2\u0110\62\3\2\2\2\u0111\u0112\7m\2\2\u0112\u0113\7"+
		"k\2\2\u0113\u0114\7n\2\2\u0114\u0115\7n\2\2\u0115\u0116\7u\2\2\u0116\64"+
		"\3\2\2\2\u0117\u0118\7z\2\2\u0118\66\3\2\2\2\u0119\u011a\7{\2\2\u011a"+
		"8\3\2\2\2\u011b\u011c\7v\2\2\u011c\u011d\7t\2\2\u011d\u011e\7w\2\2\u011e"+
		"\u011f\7g\2\2\u011f:\3\2\2\2\u0120\u0121\7h\2\2\u0121\u0122\7c\2\2\u0122"+
		"\u0123\7n\2\2\u0123\u0124\7u\2\2\u0124\u0125\7g\2\2\u0125<\3\2\2\2\u0126"+
		"\u0127\7]\2\2\u0127>\3\2\2\2\u0128\u0129\7_\2\2\u0129@\3\2\2\2\u012a\u012b"+
		"\7g\2\2\u012b\u012c\7z\2\2\u012c\u012d\7r\2\2\u012d\u012e\7n\2\2\u012e"+
		"\u012f\7k\2\2\u012f\u0130\7e\2\2\u0130\u0131\7k\2\2\u0131\u0132\7v\2\2"+
		"\u0132\u0133\7}\2\2\u0133\u0134\7~\2\2\u0134B\3\2\2\2\u0135\u0136\7~\2"+
		"\2\u0136\u0137\7\177\2\2\u0137D\3\2\2\2\u0138\u0139\7?\2\2\u0139F\3\2"+
		"\2\2\u013a\u013b\7@\2\2\u013bH\3\2\2\2\u013c\u013d\7>\2\2\u013dJ\3\2\2"+
		"\2\u013e\u013f\7x\2\2\u013f\u0140\7g\2\2\u0140\u0141\7t\2\2\u0141\u0142"+
		"\7v\2\2\u0142\u0143\7k\2\2\u0143\u0144\7e\2\2\u0144\u0145\7c\2\2\u0145"+
		"\u0146\7n\2\2\u0146L\3\2\2\2\u0147\u0148\7j\2\2\u0148\u0149\7q\2\2\u0149"+
		"\u014a\7t\2\2\u014a\u014b\7k\2\2\u014b\u014c\7|\2\2\u014c\u014d\7q\2\2"+
		"\u014d\u014e\7p\2\2\u014e\u014f\7v\2\2\u014f\u0150\7c\2\2\u0150\u0151"+
		"\7n\2\2\u0151N\3\2\2\2\u0152\u0153\7f\2\2\u0153\u0154\7k\2\2\u0154\u0155"+
		"\7c\2\2\u0155\u0156\7i\2\2\u0156\u0157\7q\2\2\u0157\u0158\7p\2\2\u0158"+
		"\u0159\7c\2\2\u0159\u015a\7n\2\2\u015aP\3\2\2\2\u015b\u015d\t\2\2\2\u015c"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015fR\3\2\2\2\u0160\u0162\7/\2\2\u0161\u0160\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0165\t\3\2\2\u0164\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016e\3\2"+
		"\2\2\u0168\u016a\t\3\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\7\60"+
		"\2\2\u016e\u0169\3\2\2\2\u016e\u016f\3\2\2\2\u016fT\3\2\2\2\u0170\u0172"+
		"\t\4\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\b+\2\2\u0176V\3\2\2\2\t"+
		"\2\u015e\u0161\u0166\u016b\u016e\u0173\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}