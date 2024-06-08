// Generated from /home/mariana/C/Pratica/src/bloco2/Ex09/CalFracoes.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculadoraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STRING=14, ID=15, Integer=16, NEWLINE=17, 
		WS=18, COMMENT=19, ONELINECOMMENT=20, MULTILINECOMMENT=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "STRING", "ESCAPE", "ID", "Integer", 
			"NEWLINE", "WS", "COMMENT", "ONELINECOMMENT", "MULTILINECOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'->'", "'print'", "'('", "')'", "'^'", "'-'", "'+'", "'/'", 
			"'*'", "':'", "'reduce'", "'read'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STRING", "ID", "Integer", "NEWLINE", "WS", "COMMENT", "ONELINECOMMENT", 
			"MULTILINECOMMENT"
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


	public CalculadoraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalFracoes.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\7\17Z\n\17\f\17\16\17]\13\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\5\20e\n\20\3\21\6\21h\n\21\r\21\16\21i\3\22\6\22m\n\22"+
		"\r\22\16\22n\3\23\5\23r\n\23\3\23\3\23\3\24\6\24w\n\24\r\24\16\24x\3\24"+
		"\3\24\3\25\3\25\7\25\177\n\25\f\25\16\25\u0082\13\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\7\26\u008c\n\26\f\26\16\26\u008f\13\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\7\27\u0097\n\27\f\27\16\27\u009a\13\27\3\27\3"+
		"\27\3\27\3\27\3\27\6[\u0080\u008d\u0098\2\30\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\21#\22%\23\'\24)\25"+
		"+\26-\27\3\2\5\5\2C\\aac|\3\2\62;\4\2\13\13\"\"\2\u00a8\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\64\3\2\2\2"+
		"\t:\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2"+
		"\25F\3\2\2\2\27H\3\2\2\2\31J\3\2\2\2\33Q\3\2\2\2\35V\3\2\2\2\37d\3\2\2"+
		"\2!g\3\2\2\2#l\3\2\2\2%q\3\2\2\2\'v\3\2\2\2)|\3\2\2\2+\u0087\3\2\2\2-"+
		"\u0092\3\2\2\2/\60\7=\2\2\60\4\3\2\2\2\61\62\7/\2\2\62\63\7@\2\2\63\6"+
		"\3\2\2\2\64\65\7r\2\2\65\66\7t\2\2\66\67\7k\2\2\678\7p\2\289\7v\2\29\b"+
		"\3\2\2\2:;\7*\2\2;\n\3\2\2\2<=\7+\2\2=\f\3\2\2\2>?\7`\2\2?\16\3\2\2\2"+
		"@A\7/\2\2A\20\3\2\2\2BC\7-\2\2C\22\3\2\2\2DE\7\61\2\2E\24\3\2\2\2FG\7"+
		",\2\2G\26\3\2\2\2HI\7<\2\2I\30\3\2\2\2JK\7t\2\2KL\7g\2\2LM\7f\2\2MN\7"+
		"w\2\2NO\7e\2\2OP\7g\2\2P\32\3\2\2\2QR\7t\2\2RS\7g\2\2ST\7c\2\2TU\7f\2"+
		"\2U\34\3\2\2\2V[\7$\2\2WZ\13\2\2\2XZ\5\37\20\2YW\3\2\2\2YX\3\2\2\2Z]\3"+
		"\2\2\2[\\\3\2\2\2[Y\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7$\2\2_\36\3\2\2\2"+
		"`a\7^\2\2ae\7$\2\2bc\7^\2\2ce\7^\2\2d`\3\2\2\2db\3\2\2\2e \3\2\2\2fh\t"+
		"\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\"\3\2\2\2km\t\3\2\2lk"+
		"\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o$\3\2\2\2pr\7\17\2\2qp\3\2\2\2"+
		"qr\3\2\2\2rs\3\2\2\2st\7\f\2\2t&\3\2\2\2uw\t\4\2\2vu\3\2\2\2wx\3\2\2\2"+
		"xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b\24\2\2{(\3\2\2\2|\u0080\7%\2\2}\177"+
		"\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080\u0081\3\2\2\2\u0080~\3\2\2"+
		"\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\f\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0086\b\25\2\2\u0086*\3\2\2\2\u0087\u0088\7\61\2\2\u0088"+
		"\u0089\7\61\2\2\u0089\u008d\3\2\2\2\u008a\u008c\13\2\2\2\u008b\u008a\3"+
		"\2\2\2\u008c\u008f\3\2\2\2\u008d\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\f\2\2\u0091,\3\2\2\2"+
		"\u0092\u0093\7\61\2\2\u0093\u0094\7,\2\2\u0094\u0098\3\2\2\2\u0095\u0097"+
		"\13\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0099\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c"+
		"\7,\2\2\u009c\u009d\7\61\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\27\2\2"+
		"\u009f.\3\2\2\2\r\2Y[dinqx\u0080\u008d\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}