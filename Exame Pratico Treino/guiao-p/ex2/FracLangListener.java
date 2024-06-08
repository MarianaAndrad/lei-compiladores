// Generated from FracLang.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FracLangParser}.
 */
public interface FracLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statDisplay}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatDisplay(FracLangParser.StatDisplayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statDisplay}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatDisplay(FracLangParser.StatDisplayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statAtribuicao}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAtribuicao(FracLangParser.StatAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statAtribuicao}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAtribuicao(FracLangParser.StatAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMultDiv}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(FracLangParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMultDiv}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(FracLangParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPar(FracLangParser.ExprParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPar(FracLangParser.ExprParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStr}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStr(FracLangParser.ExprStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStr}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStr(FracLangParser.ExprStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(FracLangParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(FracLangParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprReduce}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(FracLangParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprReduce}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(FracLangParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFranction}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFranction(FracLangParser.ExprFranctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFranction}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFranction(FracLangParser.ExprFranctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(FracLangParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(FracLangParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPosNeg}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPosNeg(FracLangParser.ExprPosNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPosNeg}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPosNeg(FracLangParser.ExprPosNegContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#franction}.
	 * @param ctx the parse tree
	 */
	void enterFranction(FracLangParser.FranctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#franction}.
	 * @param ctx the parse tree
	 */
	void exitFranction(FracLangParser.FranctionContext ctx);
}