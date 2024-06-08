// Generated from listNum2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class listNum2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ID=18, NUM=19, Comment=20, WS=21, Error=22;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_print = 2, RULE_assignment = 3, 
		RULE_while_ = 4, RULE_expr = 5, RULE_list = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "print", "assignment", "while_", "expr", "list"
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

	@Override
	public String getGrammarFileName() { return "listNum2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public listNum2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(listNum2Parser.EOF, 0); }
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
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listNum2Visitor ) return ((listNum2Visitor<? extends T>)visitor).visitProgram(this);
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
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << ID))) != 0)) {
				{
				{
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ID))) != 0)) {
					{
					setState(14);
					stat();
					}
				}

				setState(17);
				match(T__0);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
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
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listNum2Visitor ) return ((listNum2Visitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				print();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				assignment();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				while_();
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

	public static class PrintContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listNum2Visitor ) return ((listNum2Visitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__1);
			setState(31);
			expr(0);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(32);
				match(T__2);
				setState(33);
				expr(0);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		public TerminalNode ID() { return getToken(listNum2Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listNum2Visitor ) return ((listNum2Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID);
			setState(40);
			match(T__3);
			setState(41);
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

	public static class While_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(listNum2Parser.ID, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).exitWhile_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listNum2Visitor ) return ((listNum2Visitor<? extends T>)visitor).visitWhile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__4);
			setState(44);
			match(ID);
			setState(45);
			match(T__5);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << ID))) != 0)) {
				{
				{
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ID))) != 0)) {
					{
					setState(46);
					stat();
					}
				}

				setState(49);
				match(T__0);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__6);
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
	public static class ExprReadContext extends ExprContext {
		public ExprReadContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).enterExprRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).exitExprRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listNum2Visitor ) return ((listNum2Visitor<? extends T>)visitor).visitExprRead(this);
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
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listNum2Visitor ) return ((listNum2Visitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOpcaoContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprOpcaoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).enterExprOpcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).exitExprOpcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listNum2Visitor ) return ((listNum2Visitor<? extends T>)visitor).visitExprOpcao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprlistContext extends ExprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExprlistContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).exitExprlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listNum2Visitor ) return ((listNum2Visitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(listNum2Parser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).exitExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listNum2Visitor ) return ((listNum2Visitor<? extends T>)visitor).visitExprID(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case NUM:
				{
				_localctx = new ExprlistContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(58);
				list();
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				{
				_localctx = new ExprOpcaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				((ExprOpcaoContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
					((ExprOpcaoContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(60);
				expr(4);
				}
				break;
			case T__13:
				{
				_localctx = new ExprReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(T__13);
				}
				break;
			case ID:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(65);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(66);
					((ExprAddSubContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__11 || _la==T__12) ) {
						((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(67);
					expr(4);
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	 
		public ListContext() { }
		public void copyFrom(ListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListNUMContext extends ListContext {
		public TerminalNode NUM() { return getToken(listNum2Parser.NUM, 0); }
		public ListNUMContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).enterListNUM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).exitListNUM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listNum2Visitor ) return ((listNum2Visitor<? extends T>)visitor).visitListNUM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListListContext extends ListContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListListContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).enterListList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listNum2Listener ) ((listNum2Listener)listener).exitListList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listNum2Visitor ) return ((listNum2Visitor<? extends T>)visitor).visitListList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new ListListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__14);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(74);
					expr(0);
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(75);
						match(T__15);
						setState(76);
						expr(0);
						}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(84);
				match(T__16);
				}
				break;
			case NUM:
				_localctx = new ListNUMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(NUM);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\5\2\22\n\2\3\2\7\2\25\n"+
		"\2\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\7\4"+
		"%\n\4\f\4\16\4(\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\62\n\6\3\6\7"+
		"\6\65\n\6\f\6\16\68\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7B\n\7\3\7"+
		"\3\7\3\7\7\7G\n\7\f\7\16\7J\13\7\3\b\3\b\3\b\3\b\7\bP\n\b\f\b\16\bS\13"+
		"\b\5\bU\n\b\3\b\3\b\5\bY\n\b\3\b\2\3\f\t\2\4\6\b\n\f\16\2\4\3\2\n\r\3"+
		"\2\16\17\2a\2\26\3\2\2\2\4\36\3\2\2\2\6 \3\2\2\2\b)\3\2\2\2\n-\3\2\2\2"+
		"\fA\3\2\2\2\16X\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\21\22\3\2\2\2\22\23"+
		"\3\2\2\2\23\25\7\3\2\2\24\21\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27"+
		"\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\2\2\3\32\3\3\2\2\2\33\37"+
		"\5\6\4\2\34\37\5\b\5\2\35\37\5\n\6\2\36\33\3\2\2\2\36\34\3\2\2\2\36\35"+
		"\3\2\2\2\37\5\3\2\2\2 !\7\4\2\2!&\5\f\7\2\"#\7\5\2\2#%\5\f\7\2$\"\3\2"+
		"\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2(&\3\2\2\2)*\7\24\2\2*"+
		"+\7\6\2\2+,\5\f\7\2,\t\3\2\2\2-.\7\7\2\2./\7\24\2\2/\66\7\b\2\2\60\62"+
		"\5\4\3\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\65\7\3\2\2\64\61"+
		"\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2"+
		"\29:\7\t\2\2:\13\3\2\2\2;<\b\7\1\2<B\5\16\b\2=>\t\2\2\2>B\5\f\7\6?B\7"+
		"\20\2\2@B\7\24\2\2A;\3\2\2\2A=\3\2\2\2A?\3\2\2\2A@\3\2\2\2BH\3\2\2\2C"+
		"D\f\5\2\2DE\t\3\2\2EG\5\f\7\6FC\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2"+
		"I\r\3\2\2\2JH\3\2\2\2KT\7\21\2\2LQ\5\f\7\2MN\7\22\2\2NP\5\f\7\2OM\3\2"+
		"\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TL\3\2\2\2TU\3\2"+
		"\2\2UV\3\2\2\2VY\7\23\2\2WY\7\25\2\2XK\3\2\2\2XW\3\2\2\2Y\17\3\2\2\2\r"+
		"\21\26\36&\61\66AHQTX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}