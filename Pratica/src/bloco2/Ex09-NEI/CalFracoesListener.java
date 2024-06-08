// Generated from CalFracoes.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalFracoesParser}.
 */
public interface CalFracoesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalFracoesParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalFracoesParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalFracoesParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalFracoesParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalFracoesParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CalFracoesParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalFracoesParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CalFracoesParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAtribution}
	 * labeled alternative in {@link CalFracoesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterExprAtribution(CalFracoesParser.ExprAtributionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAtribution}
	 * labeled alternative in {@link CalFracoesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitExprAtribution(CalFracoesParser.ExprAtributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalFracoesParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(CalFracoesParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalFracoesParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(CalFracoesParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReducao}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReducao(CalFracoesParser.ExprReducaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReducao}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReducao(CalFracoesParser.ExprReducaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(CalFracoesParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(CalFracoesParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(CalFracoesParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(CalFracoesParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPotencia}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPotencia(CalFracoesParser.ExprPotenciaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPotencia}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPotencia(CalFracoesParser.ExprPotenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(CalFracoesParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(CalFracoesParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(CalFracoesParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(CalFracoesParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVariable(CalFracoesParser.ExprVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVariable(CalFracoesParser.ExprVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPosNeg}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPosNeg(CalFracoesParser.ExprPosNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPosNeg}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPosNeg(CalFracoesParser.ExprPosNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFraction(CalFracoesParser.ExprFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFraction(CalFracoesParser.ExprFractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalFracoesParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CalFracoesParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalFracoesParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CalFracoesParser.VarContext ctx);
}