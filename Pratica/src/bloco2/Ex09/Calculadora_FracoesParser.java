// Generated from Calculadora_Fracoes.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Calculadora_FracoesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, Num=5, ID=6, WS=7, COMMENT=8, MULTILINECOMMENT=9;
	public static final int
		RULE_program = 0, RULE_assignment = 1, RULE_linha = 2, RULE_expr = 3, 
		RULE_var = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "assignment", "linha", "expr", "var"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "';'", "'print'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "Num", "ID", "WS", "COMMENT", "MULTILINECOMMENT"
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
	public String getGrammarFileName() { return "Calculadora_Fracoes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Calculadora_FracoesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Calculadora_FracoesParser.EOF, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<LinhaContext> linha() {
			return getRuleContexts(LinhaContext.class);
		}
		public LinhaContext linha(int i) {
			return getRuleContext(LinhaContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Calculadora_FracoesListener ) ((Calculadora_FracoesListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Calculadora_FracoesListener ) ((Calculadora_FracoesListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Calculadora_FracoesVisitor ) return ((Calculadora_FracoesVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Num) | (1L << ID))) != 0)) {
				{
				setState(12);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Num:
				case ID:
					{
					setState(10);
					assignment();
					}
					break;
				case T__2:
					{
					setState(11);
					linha();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprAtributionContext extends AssignmentContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(Calculadora_FracoesParser.ID, 0); }
		public ExprAtributionContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Calculadora_FracoesListener ) ((Calculadora_FracoesListener)listener).enterExprAtribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Calculadora_FracoesListener ) ((Calculadora_FracoesListener)listener).exitExprAtribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Calculadora_FracoesVisitor ) return ((Calculadora_FracoesVisitor<? extends T>)visitor).visitExprAtribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignment);
		try {
			_localctx = new ExprAtributionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			expr();
			setState(20);
			match(T__0);
			setState(21);
			match(ID);
			setState(22);
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

	public static class LinhaContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Calculadora_FracoesListener ) ((Calculadora_FracoesListener)listener).enterLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Calculadora_FracoesListener ) ((Calculadora_FracoesListener)listener).exitLinha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Calculadora_FracoesVisitor ) return ((Calculadora_FracoesVisitor<? extends T>)visitor).visitLinha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinhaContext linha() throws RecognitionException {
		LinhaContext _localctx = new LinhaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_linha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__2);
			setState(25);
			expr();
			setState(26);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprVariableContext extends ExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprVariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Calculadora_FracoesListener ) ((Calculadora_FracoesListener)listener).enterExprVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Calculadora_FracoesListener ) ((Calculadora_FracoesListener)listener).exitExprVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Calculadora_FracoesVisitor ) return ((Calculadora_FracoesVisitor<? extends T>)visitor).visitExprVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFractionContext extends ExprContext {
		public List<TerminalNode> Num() { return getTokens(Calculadora_FracoesParser.Num); }
		public TerminalNode Num(int i) {
			return getToken(Calculadora_FracoesParser.Num, i);
		}
		public ExprFractionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Calculadora_FracoesListener ) ((Calculadora_FracoesListener)listener).enterExprFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Calculadora_FracoesListener ) ((Calculadora_FracoesListener)listener).exitExprFraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Calculadora_FracoesVisitor ) return ((Calculadora_FracoesVisitor<? extends T>)visitor).visitExprFraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ExprFractionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(Num);
				setState(29);
				match(T__3);
				setState(30);
				match(Num);
				}
				break;
			case 2:
				_localctx = new ExprVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				var();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Calculadora_FracoesParser.ID, 0); }
		public TerminalNode Num() { return getToken(Calculadora_FracoesParser.Num, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Calculadora_FracoesListener ) ((Calculadora_FracoesListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Calculadora_FracoesListener ) ((Calculadora_FracoesListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Calculadora_FracoesVisitor ) return ((Calculadora_FracoesVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==Num || _la==ID) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\'\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5#\n\5\3\6\3"+
		"\6\3\6\2\2\7\2\4\6\b\n\2\3\3\2\7\b\2$\2\20\3\2\2\2\4\25\3\2\2\2\6\32\3"+
		"\2\2\2\b\"\3\2\2\2\n$\3\2\2\2\f\17\5\4\3\2\r\17\5\6\4\2\16\f\3\2\2\2\16"+
		"\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22"+
		"\20\3\2\2\2\23\24\7\2\2\3\24\3\3\2\2\2\25\26\5\b\5\2\26\27\7\3\2\2\27"+
		"\30\7\b\2\2\30\31\7\4\2\2\31\5\3\2\2\2\32\33\7\5\2\2\33\34\5\b\5\2\34"+
		"\35\7\4\2\2\35\7\3\2\2\2\36\37\7\7\2\2\37 \7\6\2\2 #\7\7\2\2!#\5\n\6\2"+
		"\"\36\3\2\2\2\"!\3\2\2\2#\t\3\2\2\2$%\t\2\2\2%\13\3\2\2\2\5\16\20\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}