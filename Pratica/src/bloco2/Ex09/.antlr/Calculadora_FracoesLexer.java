// Generated from /home/mariana/C/Pratica/src/bloco2/Ex09/Calculadora_Fracoes.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Calculadora_FracoesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Num=6, Var=7, Frac=8, WS=9, COMMENT=10, 
		MULTILINECOMMENT=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "Num", "Var", "Frac", "WS", "COMMENT", 
			"MULTILINECOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "';'", "'print'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "Num", "Var", "Frac", "WS", "COMMENT", 
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


	public Calculadora_FracoesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculadora_Fracoes.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rX\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\6\7*\n\7\r\7\16\7+\3\b\6\b/\n\b\r\b\16\b\60\3\t\3\t\3\t\3\t\3\n"+
		"\6\n8\n\n\r\n\16\n9\3\n\3\n\3\13\3\13\3\13\3\13\7\13B\n\13\f\13\16\13"+
		"E\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fO\n\f\f\f\16\fR\13\f\3"+
		"\f\3\f\3\f\3\f\3\f\4CP\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\3\2\5\3\2\62;\5\2C\\aac|\5\2\13\f\17\17\"\"\2\\\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5"+
		"\34\3\2\2\2\7\36\3\2\2\2\t$\3\2\2\2\13&\3\2\2\2\r)\3\2\2\2\17.\3\2\2\2"+
		"\21\62\3\2\2\2\23\67\3\2\2\2\25=\3\2\2\2\27J\3\2\2\2\31\32\7/\2\2\32\33"+
		"\7@\2\2\33\4\3\2\2\2\34\35\7=\2\2\35\6\3\2\2\2\36\37\7r\2\2\37 \7t\2\2"+
		" !\7k\2\2!\"\7p\2\2\"#\7v\2\2#\b\3\2\2\2$%\7-\2\2%\n\3\2\2\2&\'\7/\2\2"+
		"\'\f\3\2\2\2(*\t\2\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\16\3\2"+
		"\2\2-/\t\3\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\20\3"+
		"\2\2\2\62\63\5\r\7\2\63\64\7\61\2\2\64\65\5\r\7\2\65\22\3\2\2\2\668\t"+
		"\4\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\b\n\2"+
		"\2<\24\3\2\2\2=>\7\61\2\2>?\7\61\2\2?C\3\2\2\2@B\13\2\2\2A@\3\2\2\2BE"+
		"\3\2\2\2CD\3\2\2\2CA\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\f\2\2GH\3\2\2\2H"+
		"I\b\13\2\2I\26\3\2\2\2JK\7\61\2\2KL\7,\2\2LP\3\2\2\2MO\13\2\2\2NM\3\2"+
		"\2\2OR\3\2\2\2PQ\3\2\2\2PN\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7,\2\2TU\7\61"+
		"\2\2UV\3\2\2\2VW\b\f\2\2W\30\3\2\2\2\b\2+\609CP\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}