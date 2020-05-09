// Generated from D:/dev/BDL-Board-Description-Language/ABDLCompilerSource/src\Abdl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbdlLexer extends Lexer {
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
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "Type", "String", "ID", "Int", "Comment", "WS", "ERRORS"
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


	public AbdlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Abdl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0170\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0129"+
		"\n-\3.\3.\3.\3.\3.\7.\u0130\n.\f.\16.\u0133\13.\3.\3.\3.\3.\3.\3.\7.\u013b"+
		"\n.\f.\16.\u013e\13.\3.\5.\u0141\n.\3/\3/\7/\u0145\n/\f/\16/\u0148\13"+
		"/\3\60\6\60\u014b\n\60\r\60\16\60\u014c\3\61\3\61\3\61\3\61\7\61\u0153"+
		"\n\61\f\61\16\61\u0156\13\61\3\61\5\61\u0159\n\61\3\61\3\61\3\61\3\61"+
		"\3\61\7\61\u0160\n\61\f\61\16\61\u0163\13\61\3\61\3\61\5\61\u0167\n\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\6\u0131\u013c\u0154\u0161\2\64"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\6\5\2C\\aa"+
		"c|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u017e\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\3g\3\2\2\2\5l\3\2\2\2\7n\3\2\2\2\tr\3\2\2\2\13t\3\2\2\2\rv\3"+
		"\2\2\2\17x\3\2\2\2\21|\3\2\2\2\23\u0081\3\2\2\2\25\u0084\3\2\2\2\27\u0087"+
		"\3\2\2\2\31\u008c\3\2\2\2\33\u0092\3\2\2\2\35\u0095\3\2\2\2\37\u009a\3"+
		"\2\2\2!\u009f\3\2\2\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00ae\3\2\2\2)\u00b0"+
		"\3\2\2\2+\u00b5\3\2\2\2-\u00bb\3\2\2\2/\u00c2\3\2\2\2\61\u00c4\3\2\2\2"+
		"\63\u00c6\3\2\2\2\65\u00c8\3\2\2\2\67\u00ca\3\2\2\29\u00cc\3\2\2\2;\u00ce"+
		"\3\2\2\2=\u00d1\3\2\2\2?\u00d3\3\2\2\2A\u00d6\3\2\2\2C\u00d9\3\2\2\2E"+
		"\u00dc\3\2\2\2G\u00e1\3\2\2\2I\u00e7\3\2\2\2K\u00ee\3\2\2\2M\u00fd\3\2"+
		"\2\2O\u00ff\3\2\2\2Q\u0101\3\2\2\2S\u0107\3\2\2\2U\u0109\3\2\2\2W\u0114"+
		"\3\2\2\2Y\u0128\3\2\2\2[\u0140\3\2\2\2]\u0142\3\2\2\2_\u014a\3\2\2\2a"+
		"\u0166\3\2\2\2c\u016a\3\2\2\2e\u016e\3\2\2\2gh\7o\2\2hi\7c\2\2ij\7k\2"+
		"\2jk\7p\2\2k\4\3\2\2\2lm\7<\2\2m\6\3\2\2\2no\7g\2\2op\7p\2\2pq\7f\2\2"+
		"q\b\3\2\2\2rs\7=\2\2s\n\3\2\2\2tu\7*\2\2u\f\3\2\2\2vw\7+\2\2w\16\3\2\2"+
		"\2xy\7h\2\2yz\7q\2\2z{\7t\2\2{\20\3\2\2\2|}\7h\2\2}~\7t\2\2~\177\7q\2"+
		"\2\177\u0080\7o\2\2\u0080\22\3\2\2\2\u0081\u0082\7v\2\2\u0082\u0083\7"+
		"q\2\2\u0083\24\3\2\2\2\u0084\u0085\7f\2\2\u0085\u0086\7q\2\2\u0086\26"+
		"\3\2\2\2\u0087\u0088\7f\2\2\u0088\u0089\7q\2\2\u0089\u008a\7p\2\2\u008a"+
		"\u008b\7g\2\2\u008b\30\3\2\2\2\u008c\u008d\7y\2\2\u008d\u008e\7j\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0090\7n\2\2\u0090\u0091\7g\2\2\u0091\32\3\2\2\2\u0092"+
		"\u0093\7k\2\2\u0093\u0094\7h\2\2\u0094\34\3\2\2\2\u0095\u0096\7v\2\2\u0096"+
		"\u0097\7j\2\2\u0097\u0098\7g\2\2\u0098\u0099\7p\2\2\u0099\36\3\2\2\2\u009a"+
		"\u009b\7g\2\2\u009b\u009c\7n\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2"+
		"\u009e \3\2\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7v\2"+
		"\2\u00a2\"\3\2\2\2\u00a3\u00a4\7?\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7e\2"+
		"\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7a\2\2\u00a9\u00aa"+
		"\7o\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7x\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"&\3\2\2\2\u00ae\u00af\7.\2\2\u00af(\3\2\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2"+
		"\7q\2\2\u00b2\u00b3\7x\2\2\u00b3\u00b4\7g\2\2\u00b4*\3\2\2\2\u00b5\u00b6"+
		"\7r\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7p\2\2\u00b9"+
		"\u00ba\7v\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7p\2\2"+
		"\u00c1.\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\7\61\2"+
		"\2\u00c5\62\3\2\2\2\u00c6\u00c7\7\'\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7"+
		"-\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\7/\2\2\u00cb8\3\2\2\2\u00cc\u00cd\7"+
		">\2\2\u00cd:\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf\u00d0\7?\2\2\u00d0<\3\2"+
		"\2\2\u00d1\u00d2\7@\2\2\u00d2>\3\2\2\2\u00d3\u00d4\7@\2\2\u00d4\u00d5"+
		"\7?\2\2\u00d5@\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7\u00d8\7?\2\2\u00d8B\3"+
		"\2\2\2\u00d9\u00da\7\61\2\2\u00da\u00db\7?\2\2\u00dbD\3\2\2\2\u00dc\u00dd"+
		"\7p\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7n\2\2\u00e0"+
		"F\3\2\2\2\u00e1\u00e2\7y\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7f\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7j\2\2\u00e6H\3\2\2\2\u00e7\u00e8\7j\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7i\2\2\u00eb\u00ec\7j\2\2"+
		"\u00ec\u00ed\7v\2\2\u00edJ\3\2\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7w\2"+
		"\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4"+
		"\7p\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7a\2\2\u00f6\u00f7\7r\2\2\u00f7"+
		"\u00f8\7n\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7{\2\2\u00fa\u00fb\7g\2\2"+
		"\u00fb\u00fc\7t\2\2\u00fcL\3\2\2\2\u00fd\u00fe\7]\2\2\u00feN\3\2\2\2\u00ff"+
		"\u0100\7_\2\2\u0100P\3\2\2\2\u0101\u0102\7d\2\2\u0102\u0103\7q\2\2\u0103"+
		"\u0104\7c\2\2\u0104\u0105\7t\2\2\u0105\u0106\7f\2\2\u0106R\3\2\2\2\u0107"+
		"\u0108\7\60\2\2\u0108T\3\2\2\2\u0109\u010a\7r\2\2\u010a\u010b\7k\2\2\u010b"+
		"\u010c\7g\2\2\u010c\u010d\7e\2\2\u010d\u010e\7g\2\2\u010e\u010f\7a\2\2"+
		"\u010f\u0110\7p\2\2\u0110\u0111\7c\2\2\u0111\u0112\7o\2\2\u0112\u0113"+
		"\7g\2\2\u0113V\3\2\2\2\u0114\u0115\7q\2\2\u0115\u0116\7y\2\2\u0116\u0117"+
		"\7p\2\2\u0117\u0118\7g\2\2\u0118\u0119\7t\2\2\u0119X\3\2\2\2\u011a\u011b"+
		"\7k\2\2\u011b\u011c\7p\2\2\u011c\u0129\7v\2\2\u011d\u011e\7r\2\2\u011e"+
		"\u011f\7q\2\2\u011f\u0120\7k\2\2\u0120\u0121\7p\2\2\u0121\u0129\7v\2\2"+
		"\u0122\u0123\7u\2\2\u0123\u0124\7v\2\2\u0124\u0125\7t\2\2\u0125\u0126"+
		"\7k\2\2\u0126\u0127\7p\2\2\u0127\u0129\7i\2\2\u0128\u011a\3\2\2\2\u0128"+
		"\u011d\3\2\2\2\u0128\u0122\3\2\2\2\u0129Z\3\2\2\2\u012a\u0131\7$\2\2\u012b"+
		"\u012c\7^\2\2\u012c\u0130\7$\2\2\u012d\u0130\7^\2\2\u012e\u0130\13\2\2"+
		"\2\u012f\u012b\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0141\7$\2\2\u0135\u013c\7)\2\2\u0136\u0137\7^\2"+
		"\2\u0137\u013b\7)\2\2\u0138\u013b\7^\2\2\u0139\u013b\13\2\2\2\u013a\u0136"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013f\u0141\7)\2\2\u0140\u012a\3\2\2\2\u0140\u0135\3\2\2\2\u0141"+
		"\\\3\2\2\2\u0142\u0146\t\2\2\2\u0143\u0145\t\3\2\2\u0144\u0143\3\2\2\2"+
		"\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147^\3"+
		"\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\t\4\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d`\3\2\2\2"+
		"\u014e\u014f\7\61\2\2\u014f\u0150\7\61\2\2\u0150\u0154\3\2\2\2\u0151\u0153"+
		"\13\2\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0154\u0152\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159"+
		"\7\17\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2"+
		"\u015a\u0167\7\f\2\2\u015b\u015c\7\61\2\2\u015c\u015d\7,\2\2\u015d\u0161"+
		"\3\2\2\2\u015e\u0160\13\2\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2"+
		"\u0161\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0165\7,\2\2\u0165\u0167\7\61\2\2\u0166\u014e\3\2\2\2\u0166"+
		"\u015b\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b\61\2\2\u0169b\3\2\2\2"+
		"\u016a\u016b\t\5\2\2\u016b\u016c\3\2\2\2\u016c\u016d\b\62\2\2\u016dd\3"+
		"\2\2\2\u016e\u016f\13\2\2\2\u016ff\3\2\2\2\17\2\u0128\u012f\u0131\u013a"+
		"\u013c\u0140\u0146\u014c\u0154\u0158\u0161\u0166\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}