// Generated from listNum2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class listNum2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ID=18, NUM=19, Comment=20, WS=21, Error=22;
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
			"ID", "NUM", "Comment", "WS", "Error"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'print'", "'|'", "':='", "'while'", "':'", "'endWhile'", 
			"'head'", "'tail'", "'sum'", "'avg'", "'+'", "'-'", "'read'", "'['", 
			"','", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "NUM", "Comment", "WS", "Error"
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


	public listNum2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "listNum2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\7\23q\n\23\f\23"+
		"\16\23t\13\23\3\24\6\24w\n\24\r\24\16\24x\3\25\3\25\7\25}\n\25\f\25\16"+
		"\25\u0080\13\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3~\2"+
		"\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2"+
		"\62;\5\2\13\f\17\17\"\"\2\u008d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2"+
		"\13<\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21M\3\2\2\2\23R\3\2\2\2\25W\3\2\2"+
		"\2\27[\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37h\3\2\2\2!j\3\2\2"+
		"\2#l\3\2\2\2%n\3\2\2\2\'v\3\2\2\2)z\3\2\2\2+\u0085\3\2\2\2-\u0089\3\2"+
		"\2\2/\60\7=\2\2\60\4\3\2\2\2\61\62\7r\2\2\62\63\7t\2\2\63\64\7k\2\2\64"+
		"\65\7p\2\2\65\66\7v\2\2\66\6\3\2\2\2\678\7~\2\28\b\3\2\2\29:\7<\2\2:;"+
		"\7?\2\2;\n\3\2\2\2<=\7y\2\2=>\7j\2\2>?\7k\2\2?@\7n\2\2@A\7g\2\2A\f\3\2"+
		"\2\2BC\7<\2\2C\16\3\2\2\2DE\7g\2\2EF\7p\2\2FG\7f\2\2GH\7Y\2\2HI\7j\2\2"+
		"IJ\7k\2\2JK\7n\2\2KL\7g\2\2L\20\3\2\2\2MN\7j\2\2NO\7g\2\2OP\7c\2\2PQ\7"+
		"f\2\2Q\22\3\2\2\2RS\7v\2\2ST\7c\2\2TU\7k\2\2UV\7n\2\2V\24\3\2\2\2WX\7"+
		"u\2\2XY\7w\2\2YZ\7o\2\2Z\26\3\2\2\2[\\\7c\2\2\\]\7x\2\2]^\7i\2\2^\30\3"+
		"\2\2\2_`\7-\2\2`\32\3\2\2\2ab\7/\2\2b\34\3\2\2\2cd\7t\2\2de\7g\2\2ef\7"+
		"c\2\2fg\7f\2\2g\36\3\2\2\2hi\7]\2\2i \3\2\2\2jk\7.\2\2k\"\3\2\2\2lm\7"+
		"_\2\2m$\3\2\2\2nr\t\2\2\2oq\t\3\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3"+
		"\2\2\2s&\3\2\2\2tr\3\2\2\2uw\t\4\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3"+
		"\2\2\2y(\3\2\2\2z~\7%\2\2{}\13\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~\177\3\2"+
		"\2\2~|\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\f\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\b\25\2\2\u0084*\3\2\2\2\u0085\u0086\t\5\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0088\b\26\2\2\u0088,\3\2\2\2\u0089\u008a\13"+
		"\2\2\2\u008a.\3\2\2\2\6\2rx~\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}