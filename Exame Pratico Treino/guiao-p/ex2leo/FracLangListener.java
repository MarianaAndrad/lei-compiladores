// Generated from FracLang.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FracLangParser}.
 */
public interface FracLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FracLangParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FracLangParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FracLangParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(FracLangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(FracLangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(FracLangParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(FracLangParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FracLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FracLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(FracLangParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(FracLangParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(FracLangParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(FracLangParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(FracLangParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(FracLangParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(FracLangParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(FracLangParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(FracLangParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(FracLangParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPar}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPar(FracLangParser.ExprParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPar}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPar(FracLangParser.ExprParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(FracLangParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(FracLangParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFraction(FracLangParser.ExprFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFraction(FracLangParser.ExprFractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#fraction}.
	 * @param ctx the parse tree
	 */
	void enterFraction(FracLangParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#fraction}.
	 * @param ctx the parse tree
	 */
	void exitFraction(FracLangParser.FractionContext ctx);
}