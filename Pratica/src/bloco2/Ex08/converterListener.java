// Generated from converter.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link converterParser}.
 */
public interface converterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link converterParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(converterParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link converterParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(converterParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link converterParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(converterParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link converterParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(converterParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAtribution}
	 * labeled alternative in {@link converterParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterExprAtribution(converterParser.ExprAtributionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAtribution}
	 * labeled alternative in {@link converterParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitExprAtribution(converterParser.ExprAtributionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(converterParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(converterParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(converterParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(converterParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(converterParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(converterParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPosNeg}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPosNeg(converterParser.ExprPosNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPosNeg}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPosNeg(converterParser.ExprPosNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(converterParser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(converterParser.ExprMultDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link converterParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(converterParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link converterParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(converterParser.VarContext ctx);
}