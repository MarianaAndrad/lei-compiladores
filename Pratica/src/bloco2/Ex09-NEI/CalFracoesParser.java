// Generated from CalFracoes.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalFracoesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STRING=14, ID=15, Integer=16, NEWLINE=17, 
		WS=18, COMMENT=19, ONELINECOMMENT=20, MULTILINECOMMENT=21;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_assignment = 2, RULE_expressao = 3, 
		RULE_expr = 4, RULE_var = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "assignment", "expressao", "expr", "var"
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

	@Override
	public String getGrammarFileName() { return "CalFracoes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalFracoesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CalFracoesParser.EOF, 0); }
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
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << ID) | (1L << Integer) | (1L << NEWLINE) | (1L << ONELINECOMMENT))) != 0)) {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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
		public TerminalNode ONELINECOMMENT() { return getToken(CalFracoesParser.ONELINECOMMENT, 0); }
		public TerminalNode NEWLINE() { return getToken(CalFracoesParser.NEWLINE, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << ID) | (1L << Integer))) != 0)) {
				{
				setState(22);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__6:
				case T__7:
				case T__11:
				case T__12:
				case ID:
				case Integer:
					{
					setState(20);
					assignment();
					}
					break;
				case T__2:
					{
					setState(21);
					expressao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(24);
				match(T__0);
				}
			}

			setState(28);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==ONELINECOMMENT) ) {
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
		public TerminalNode ID() { return getToken(CalFracoesParser.ID, 0); }
		public ExprAtributionContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterExprAtribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitExprAtribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitExprAtribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			_localctx = new ExprAtributionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			expr(0);
			setState(31);
			match(T__1);
			setState(32);
			match(ID);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__2);
			setState(35);
			expr(0);
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
	public static class ExprReducaoContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprReducaoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterExprReducao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitExprReducao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitExprReducao(this);
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
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprReadContext extends ExprContext {
		public TerminalNode STRING() { return getToken(CalFracoesParser.STRING, 0); }
		public ExprReadContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterExprRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitExprRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitExprRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPotenciaContext extends ExprContext {
		public Token neg;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Integer() { return getToken(CalFracoesParser.Integer, 0); }
		public ExprPotenciaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterExprPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitExprPotencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitExprPotencia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParentContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterExprParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitExprParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitExprParent(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterExprMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitExprMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitExprMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprVariableContext extends ExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprVariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterExprVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitExprVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitExprVariable(this);
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
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterExprPosNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitExprPosNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitExprPosNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFractionContext extends ExprContext {
		public List<TerminalNode> Integer() { return getTokens(CalFracoesParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(CalFracoesParser.Integer, i);
		}
		public ExprFractionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterExprFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitExprFraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitExprFraction(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPotenciaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(38);
				match(T__3);
				setState(39);
				expr(0);
				setState(40);
				match(T__4);
				setState(41);
				match(T__5);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(42);
					((ExprPotenciaContext)_localctx).neg = match(T__6);
					}
				}

				setState(45);
				match(Integer);
				}
				break;
			case 2:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(T__3);
				setState(48);
				expr(0);
				setState(49);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new ExprPosNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				((ExprPosNegContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
					((ExprPosNegContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(52);
				expr(7);
				}
				break;
			case 4:
				{
				_localctx = new ExprFractionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(Integer);
				setState(54);
				match(T__8);
				setState(55);
				match(Integer);
				}
				break;
			case 5:
				{
				_localctx = new ExprReducaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(T__11);
				setState(57);
				expr(3);
				}
				break;
			case 6:
				{
				_localctx = new ExprReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(T__12);
				setState(59);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new ExprVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				var();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(64);
						((ExprMultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
							((ExprMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(65);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(67);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(68);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalFracoesParser.ID, 0); }
		public TerminalNode Integer() { return getToken(CalFracoesParser.Integer, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalFracoesListener ) ((CalFracoesListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalFracoesVisitor ) return ((CalFracoesVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==Integer) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27O\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\3\3\3\5\3\31\n\3\3\3\3\3\5\3\35\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6.\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6H\n\6\f\6\16\6K\13\6\3\7\3\7\3\7\2\3\n\b\2\4\6\b\n\f\2\6\4\2\23\23"+
		"\26\26\3\2\t\n\3\2\f\r\3\2\21\22\2T\2\21\3\2\2\2\4\34\3\2\2\2\6 \3\2\2"+
		"\2\b$\3\2\2\2\n?\3\2\2\2\fL\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23"+
		"\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\25"+
		"\7\2\2\3\25\3\3\2\2\2\26\31\5\6\4\2\27\31\5\b\5\2\30\26\3\2\2\2\30\27"+
		"\3\2\2\2\31\32\3\2\2\2\32\33\7\3\2\2\33\35\3\2\2\2\34\30\3\2\2\2\34\35"+
		"\3\2\2\2\35\36\3\2\2\2\36\37\t\2\2\2\37\5\3\2\2\2 !\5\n\6\2!\"\7\4\2\2"+
		"\"#\7\21\2\2#\7\3\2\2\2$%\7\5\2\2%&\5\n\6\2&\t\3\2\2\2\'(\b\6\1\2()\7"+
		"\6\2\2)*\5\n\6\2*+\7\7\2\2+-\7\b\2\2,.\7\t\2\2-,\3\2\2\2-.\3\2\2\2./\3"+
		"\2\2\2/\60\7\22\2\2\60@\3\2\2\2\61\62\7\6\2\2\62\63\5\n\6\2\63\64\7\7"+
		"\2\2\64@\3\2\2\2\65\66\t\3\2\2\66@\5\n\6\t\678\7\22\2\289\7\13\2\29@\7"+
		"\22\2\2:;\7\16\2\2;@\5\n\6\5<=\7\17\2\2=@\7\20\2\2>@\5\f\7\2?\'\3\2\2"+
		"\2?\61\3\2\2\2?\65\3\2\2\2?\67\3\2\2\2?:\3\2\2\2?<\3\2\2\2?>\3\2\2\2@"+
		"I\3\2\2\2AB\f\7\2\2BC\t\4\2\2CH\5\n\6\bDE\f\6\2\2EF\t\3\2\2FH\5\n\6\7"+
		"GA\3\2\2\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KI\3\2\2"+
		"\2LM\t\5\2\2M\r\3\2\2\2\t\21\30\34-?GI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}