// Generated from /home/abhi/test_antlr/TLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, And=2, Not=3, Or=4, To=5, By=6, Int=7, Bool=8, Char=9, Return=10, 
		Break=11, If=12, Else=13, For=14, While=15, True=16, False=17, Static=18, 
		ID=19, NUMCONST=20, CHARCONST=21, STRINGCONST=22, LetDig=23, Letter=24, 
		Digit=25, Comma=26, SemiColon=27, LessorEqual=28, GreatorEqual=29, LessThan=30, 
		GreaterThan=31, DoubleEqual=32, NotEqual=33, Increment=34, Decrement=35, 
		PlusEqual=36, MinusEqual=37, StarEqual=38, ForEqual=39, Equal=40, Colon=41, 
		Plus=42, Minus=43, Star=44, ForSlash=45, Percent=46, OpenPar=47, ClosePar=48, 
		OpenCurly=49, CloseCurly=50, OpenSqu=51, CloseSqu=52, QuestionMark=53, 
		WhiteSpace=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "And", "Not", "Or", "To", "By", "Int", "Bool", "Char", "Return", 
			"Break", "If", "Else", "For", "While", "True", "False", "Static", "ID", 
			"NUMCONST", "CHARCONST", "STRINGCONST", "LetDig", "Letter", "Digit", 
			"Comma", "SemiColon", "LessorEqual", "GreatorEqual", "LessThan", "GreaterThan", 
			"DoubleEqual", "NotEqual", "Increment", "Decrement", "PlusEqual", "MinusEqual", 
			"StarEqual", "ForEqual", "Equal", "Colon", "Plus", "Minus", "Star", "ForSlash", 
			"Percent", "OpenPar", "ClosePar", "OpenCurly", "CloseCurly", "OpenSqu", 
			"CloseSqu", "QuestionMark", "WhiteSpace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'&&'", "'!'", "'||'", "'to'", "'by'", "'int'", "'bool'", 
			"'char'", "'return'", "'break'", "'if'", "'else'", "'for'", "'while'", 
			"'true'", "'false'", "'static'", null, null, null, null, null, null, 
			null, "','", "';'", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'++'", 
			"'--'", "'+='", "'-='", "'*='", "'/='", "'='", "':'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "And", "Not", "Or", "To", "By", "Int", "Bool", "Char", 
			"Return", "Break", "If", "Else", "For", "While", "True", "False", "Static", 
			"ID", "NUMCONST", "CHARCONST", "STRINGCONST", "LetDig", "Letter", "Digit", 
			"Comma", "SemiColon", "LessorEqual", "GreatorEqual", "LessThan", "GreaterThan", 
			"DoubleEqual", "NotEqual", "Increment", "Decrement", "PlusEqual", "MinusEqual", 
			"StarEqual", "ForEqual", "Equal", "Colon", "Plus", "Minus", "Star", "ForSlash", 
			"Percent", "OpenPar", "ClosePar", "OpenCurly", "CloseCurly", "OpenSqu", 
			"CloseSqu", "QuestionMark", "WhiteSpace"
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


	public TLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0140\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\7\2t\n\2\f\2\16\2w\13"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\177\n\2\f\2\16\2\u0082\13\2\5\2\u0084\n"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\7\24\u00d7\n\24\f\24\16\24\u00da\13\24\3\25\6\25"+
		"\u00dd\n\25\r\25\16\25\u00de\3\26\3\26\5\26\u00e3\n\26\3\26\3\26\3\27"+
		"\3\27\7\27\u00e9\n\27\f\27\16\27\u00ec\13\27\3\27\3\27\3\30\3\30\5\30"+
		"\u00f2\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3"+
		"%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\6\67\u013b\n\67\r\67\16\67\u013c\3\67\3\67\3u\28\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8\3\2\b\4\2"+
		"\f\f\17\17\3\2))\3\2$$\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0148\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3"+
		"\u0083\3\2\2\2\5\u0087\3\2\2\2\7\u008a\3\2\2\2\t\u008c\3\2\2\2\13\u008f"+
		"\3\2\2\2\r\u0092\3\2\2\2\17\u0095\3\2\2\2\21\u0099\3\2\2\2\23\u009e\3"+
		"\2\2\2\25\u00a3\3\2\2\2\27\u00aa\3\2\2\2\31\u00b0\3\2\2\2\33\u00b3\3\2"+
		"\2\2\35\u00b8\3\2\2\2\37\u00bc\3\2\2\2!\u00c2\3\2\2\2#\u00c7\3\2\2\2%"+
		"\u00cd\3\2\2\2\'\u00d4\3\2\2\2)\u00dc\3\2\2\2+\u00e0\3\2\2\2-\u00e6\3"+
		"\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2\63\u00f5\3\2\2\2\65\u00f7\3\2\2"+
		"\2\67\u00f9\3\2\2\29\u00fb\3\2\2\2;\u00fe\3\2\2\2=\u0101\3\2\2\2?\u0103"+
		"\3\2\2\2A\u0105\3\2\2\2C\u0108\3\2\2\2E\u010b\3\2\2\2G\u010e\3\2\2\2I"+
		"\u0111\3\2\2\2K\u0114\3\2\2\2M\u0117\3\2\2\2O\u011a\3\2\2\2Q\u011d\3\2"+
		"\2\2S\u011f\3\2\2\2U\u0121\3\2\2\2W\u0123\3\2\2\2Y\u0125\3\2\2\2[\u0127"+
		"\3\2\2\2]\u0129\3\2\2\2_\u012b\3\2\2\2a\u012d\3\2\2\2c\u012f\3\2\2\2e"+
		"\u0131\3\2\2\2g\u0133\3\2\2\2i\u0135\3\2\2\2k\u0137\3\2\2\2m\u013a\3\2"+
		"\2\2op\7\61\2\2pq\7,\2\2qu\3\2\2\2rt\13\2\2\2sr\3\2\2\2tw\3\2\2\2uv\3"+
		"\2\2\2us\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7,\2\2y\u0084\7\61\2\2z{\7\61\2"+
		"\2{|\7\61\2\2|\u0080\3\2\2\2}\177\n\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0083o\3\2\2\2\u0083z\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b"+
		"\2\2\2\u0086\4\3\2\2\2\u0087\u0088\7(\2\2\u0088\u0089\7(\2\2\u0089\6\3"+
		"\2\2\2\u008a\u008b\7#\2\2\u008b\b\3\2\2\2\u008c\u008d\7~\2\2\u008d\u008e"+
		"\7~\2\2\u008e\n\3\2\2\2\u008f\u0090\7v\2\2\u0090\u0091\7q\2\2\u0091\f"+
		"\3\2\2\2\u0092\u0093\7d\2\2\u0093\u0094\7{\2\2\u0094\16\3\2\2\2\u0095"+
		"\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2\u0098\20\3\2\2\2\u0099"+
		"\u009a\7d\2\2\u009a\u009b\7q\2\2\u009b\u009c\7q\2\2\u009c\u009d\7n\2\2"+
		"\u009d\22\3\2\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7j\2\2\u00a0\u00a1\7"+
		"c\2\2\u00a1\u00a2\7t\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7t\2\2\u00a8"+
		"\u00a9\7p\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7d\2\2\u00ab\u00ac\7t\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7m\2\2\u00af\30\3\2\2\2\u00b0"+
		"\u00b1\7k\2\2\u00b1\u00b2\7h\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\34\3\2\2\2\u00b8"+
		"\u00b9\7h\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7t\2\2\u00bb\36\3\2\2\2\u00bc"+
		"\u00bd\7y\2\2\u00bd\u00be\7j\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7n\2\2"+
		"\u00c0\u00c1\7g\2\2\u00c1 \3\2\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7t\2"+
		"\2\u00c4\u00c5\7w\2\2\u00c5\u00c6\7g\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7"+
		"h\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc$\3\2\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7e\2\2\u00d3"+
		"&\3\2\2\2\u00d4\u00d8\5\61\31\2\u00d5\u00d7\5/\30\2\u00d6\u00d5\3\2\2"+
		"\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9("+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\5\63\32\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df*\3"+
		"\2\2\2\u00e0\u00e2\7)\2\2\u00e1\u00e3\n\3\2\2\u00e2\u00e1\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7)\2\2\u00e5,\3\2\2\2\u00e6"+
		"\u00ea\7$\2\2\u00e7\u00e9\n\4\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\7$\2\2\u00ee.\3\2\2\2\u00ef\u00f2\5\63\32\2"+
		"\u00f0\u00f2\5\61\31\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\60"+
		"\3\2\2\2\u00f3\u00f4\t\5\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\t\6\2\2\u00f6"+
		"\64\3\2\2\2\u00f7\u00f8\7.\2\2\u00f8\66\3\2\2\2\u00f9\u00fa\7=\2\2\u00fa"+
		"8\3\2\2\2\u00fb\u00fc\7>\2\2\u00fc\u00fd\7?\2\2\u00fd:\3\2\2\2\u00fe\u00ff"+
		"\7@\2\2\u00ff\u0100\7?\2\2\u0100<\3\2\2\2\u0101\u0102\7>\2\2\u0102>\3"+
		"\2\2\2\u0103\u0104\7@\2\2\u0104@\3\2\2\2\u0105\u0106\7?\2\2\u0106\u0107"+
		"\7?\2\2\u0107B\3\2\2\2\u0108\u0109\7#\2\2\u0109\u010a\7?\2\2\u010aD\3"+
		"\2\2\2\u010b\u010c\7-\2\2\u010c\u010d\7-\2\2\u010dF\3\2\2\2\u010e\u010f"+
		"\7/\2\2\u010f\u0110\7/\2\2\u0110H\3\2\2\2\u0111\u0112\7-\2\2\u0112\u0113"+
		"\7?\2\2\u0113J\3\2\2\2\u0114\u0115\7/\2\2\u0115\u0116\7?\2\2\u0116L\3"+
		"\2\2\2\u0117\u0118\7,\2\2\u0118\u0119\7?\2\2\u0119N\3\2\2\2\u011a\u011b"+
		"\7\61\2\2\u011b\u011c\7?\2\2\u011cP\3\2\2\2\u011d\u011e\7?\2\2\u011eR"+
		"\3\2\2\2\u011f\u0120\7<\2\2\u0120T\3\2\2\2\u0121\u0122\7-\2\2\u0122V\3"+
		"\2\2\2\u0123\u0124\7/\2\2\u0124X\3\2\2\2\u0125\u0126\7,\2\2\u0126Z\3\2"+
		"\2\2\u0127\u0128\7\61\2\2\u0128\\\3\2\2\2\u0129\u012a\7\'\2\2\u012a^\3"+
		"\2\2\2\u012b\u012c\7*\2\2\u012c`\3\2\2\2\u012d\u012e\7+\2\2\u012eb\3\2"+
		"\2\2\u012f\u0130\7}\2\2\u0130d\3\2\2\2\u0131\u0132\7\177\2\2\u0132f\3"+
		"\2\2\2\u0133\u0134\7]\2\2\u0134h\3\2\2\2\u0135\u0136\7_\2\2\u0136j\3\2"+
		"\2\2\u0137\u0138\7A\2\2\u0138l\3\2\2\2\u0139\u013b\t\7\2\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\b\67\2\2\u013fn\3\2\2\2\f\2u\u0080\u0083\u00d8"+
		"\u00de\u00e2\u00ea\u00f1\u013c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}