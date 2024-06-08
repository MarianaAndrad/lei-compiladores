// Generated from StrLang.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StrLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, STRING=13, ID=14, WS=15, Comment=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "STRING", "ID", "WS", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "':'", "'input'", "'('", "')'", "'+'", "'-'", "'trim'", 
			"'firstespace'", "'firstdigito'", "'firstletra'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STRING", "ID", "WS", "Comment"
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


	public StrLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StrLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\7\16f\n"+
		"\16\f\16\16\16i\13\16\3\16\3\16\3\17\3\17\7\17o\n\17\f\17\16\17r\13\17"+
		"\3\20\6\20u\n\20\r\20\16\20v\3\20\3\20\3\21\3\21\3\21\3\21\7\21\177\n"+
		"\21\f\21\16\21\u0082\13\21\3\21\3\21\3\21\3\21\4g\u0080\2\22\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"\3\2\5\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u008a\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5)\3\2"+
		"\2\2\7+\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2"+
		"\219\3\2\2\2\23>\3\2\2\2\25J\3\2\2\2\27V\3\2\2\2\31a\3\2\2\2\33c\3\2\2"+
		"\2\35l\3\2\2\2\37t\3\2\2\2!z\3\2\2\2#$\7r\2\2$%\7t\2\2%&\7k\2\2&\'\7p"+
		"\2\2\'(\7v\2\2(\4\3\2\2\2)*\7<\2\2*\6\3\2\2\2+,\7k\2\2,-\7p\2\2-.\7r\2"+
		"\2./\7w\2\2/\60\7v\2\2\60\b\3\2\2\2\61\62\7*\2\2\62\n\3\2\2\2\63\64\7"+
		"+\2\2\64\f\3\2\2\2\65\66\7-\2\2\66\16\3\2\2\2\678\7/\2\28\20\3\2\2\29"+
		":\7v\2\2:;\7t\2\2;<\7k\2\2<=\7o\2\2=\22\3\2\2\2>?\7h\2\2?@\7k\2\2@A\7"+
		"t\2\2AB\7u\2\2BC\7v\2\2CD\7g\2\2DE\7u\2\2EF\7r\2\2FG\7c\2\2GH\7e\2\2H"+
		"I\7g\2\2I\24\3\2\2\2JK\7h\2\2KL\7k\2\2LM\7t\2\2MN\7u\2\2NO\7v\2\2OP\7"+
		"f\2\2PQ\7k\2\2QR\7i\2\2RS\7k\2\2ST\7v\2\2TU\7q\2\2U\26\3\2\2\2VW\7h\2"+
		"\2WX\7k\2\2XY\7t\2\2YZ\7u\2\2Z[\7v\2\2[\\\7n\2\2\\]\7g\2\2]^\7v\2\2^_"+
		"\7t\2\2_`\7c\2\2`\30\3\2\2\2ab\7\61\2\2b\32\3\2\2\2cg\7$\2\2df\13\2\2"+
		"\2ed\3\2\2\2fi\3\2\2\2gh\3\2\2\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7$\2"+
		"\2k\34\3\2\2\2lp\t\2\2\2mo\t\3\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2"+
		"\2\2q\36\3\2\2\2rp\3\2\2\2su\t\4\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3"+
		"\2\2\2wx\3\2\2\2xy\b\20\2\2y \3\2\2\2z{\7\61\2\2{|\7\61\2\2|\u0080\3\2"+
		"\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080\u0081\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\f\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0086\b\21\2\2\u0086\"\3\2\2\2\7\2gpv\u0080"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}