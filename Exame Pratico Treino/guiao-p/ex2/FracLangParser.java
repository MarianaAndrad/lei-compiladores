// Generated from FracLang.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FracLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, INT=13, ID=14, STR=15, Comment=16, WS=17, 
		Error=18;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_expr = 2, RULE_franction = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "expr", "franction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'display'", "'<='", "'+'", "'-'", "'*'", "':'", "'reduce'", 
			"'('", "')'", "'read'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT", "ID", "STR", "Comment", "WS", "Error"
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
	public String getGrammarFileName() { return "FracLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FracLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FracLangParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitProgram(this);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << ID))) != 0)) {
				{
				{
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==ID) {
					{
					setState(8);
					stat();
					}
				}

				setState(11);
				match(T__0);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatAtribuicaoContext extends StatContext {
		public TerminalNode ID() { return getToken(FracLangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatAtribuicaoContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterStatAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitStatAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitStatAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatDisplayContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatDisplayContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterStatDisplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitStatDisplay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitStatDisplay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new StatDisplayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(T__1);
				setState(20);
				expr(0);
				}
				break;
			case ID:
				_localctx = new StatAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(ID);
				setState(22);
				match(T__2);
				setState(23);
				expr(0);
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
	public static class ExprMultDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterExprMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitExprMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitExprMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterExprPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitExprPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitExprPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStrContext extends ExprContext {
		public TerminalNode STR() { return getToken(FracLangParser.STR, 0); }
		public ExprStrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterExprStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitExprStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitExprStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprReduceContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprReduceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterExprReduce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitExprReduce(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitExprReduce(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFranctionContext extends ExprContext {
		public FranctionContext franction() {
			return getRuleContext(FranctionContext.class,0);
		}
		public ExprFranctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterExprFranction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitExprFranction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitExprFranction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(FracLangParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitExprID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPosNegContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPosNegContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterExprPosNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitExprPosNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitExprPosNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
				{
				_localctx = new ExprPosNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(27);
				((ExprPosNegContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
					((ExprPosNegContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(28);
				expr(8);
				}
				break;
			case T__7:
				{
				_localctx = new ExprReduceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(T__7);
				setState(30);
				expr(5);
				}
				break;
			case T__8:
				{
				_localctx = new ExprParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(T__8);
				setState(32);
				expr(0);
				setState(33);
				match(T__9);
				}
				break;
			case T__10:
				{
				_localctx = new ExprStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(T__10);
				setState(36);
				match(STR);
				}
				break;
			case INT:
				{
				_localctx = new ExprFranctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				franction();
				}
				break;
			case ID:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(47);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(41);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(42);
						((ExprMultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
							((ExprMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(43);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(44);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(45);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__4) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(46);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FranctionContext extends ParserRuleContext {
		public Token num;
		public Token den;
		public List<TerminalNode> INT() { return getTokens(FracLangParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(FracLangParser.INT, i);
		}
		public FranctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_franction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).enterFranction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FracLangListener ) ((FracLangListener)listener).exitFranction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FracLangVisitor ) return ((FracLangVisitor<? extends T>)visitor).visitFranction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FranctionContext franction() throws RecognitionException {
		FranctionContext _localctx = new FranctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_franction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((FranctionContext)_localctx).num = match(INT);
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(53);
				match(T__11);
				setState(54);
				((FranctionContext)_localctx).den = match(INT);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\5\2\f\n\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4*\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16\4"+
		"\65\13\4\3\5\3\5\3\5\5\5:\n\5\3\5\2\3\6\6\2\4\6\b\2\4\3\2\6\7\3\2\b\t"+
		"\2B\2\20\3\2\2\2\4\32\3\2\2\2\6)\3\2\2\2\b\66\3\2\2\2\n\f\5\4\3\2\13\n"+
		"\3\2\2\2\13\f\3\2\2\2\f\r\3\2\2\2\r\17\7\3\2\2\16\13\3\2\2\2\17\22\3\2"+
		"\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22\20\3\2\2\2\23\24\7\2"+
		"\2\3\24\3\3\2\2\2\25\26\7\4\2\2\26\33\5\6\4\2\27\30\7\20\2\2\30\31\7\5"+
		"\2\2\31\33\5\6\4\2\32\25\3\2\2\2\32\27\3\2\2\2\33\5\3\2\2\2\34\35\b\4"+
		"\1\2\35\36\t\2\2\2\36*\5\6\4\n\37 \7\n\2\2 *\5\6\4\7!\"\7\13\2\2\"#\5"+
		"\6\4\2#$\7\f\2\2$*\3\2\2\2%&\7\r\2\2&*\7\21\2\2\'*\5\b\5\2(*\7\20\2\2"+
		")\34\3\2\2\2)\37\3\2\2\2)!\3\2\2\2)%\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\63"+
		"\3\2\2\2+,\f\t\2\2,-\t\3\2\2-\62\5\6\4\n./\f\b\2\2/\60\t\2\2\2\60\62\5"+
		"\6\4\t\61+\3\2\2\2\61.\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2"+
		"\2\64\7\3\2\2\2\65\63\3\2\2\2\669\7\17\2\2\678\7\16\2\28:\7\17\2\29\67"+
		"\3\2\2\29:\3\2\2\2:\t\3\2\2\2\t\13\20\32)\61\639";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}