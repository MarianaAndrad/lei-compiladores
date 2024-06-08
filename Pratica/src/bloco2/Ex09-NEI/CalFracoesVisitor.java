// Generated from CalFracoes.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalFracoesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalFracoesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalFracoesParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CalFracoesParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalFracoesParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CalFracoesParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAtribution}
	 * labeled alternative in {@link CalFracoesParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtribution(CalFracoesParser.ExprAtributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalFracoesParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(CalFracoesParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprReducao}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReducao(CalFracoesParser.ExprReducaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(CalFracoesParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRead(CalFracoesParser.ExprReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPotencia}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPotencia(CalFracoesParser.ExprPotenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(CalFracoesParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv(CalFracoesParser.ExprMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVariable(CalFracoesParser.ExprVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPosNeg}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPosNeg(CalFracoesParser.ExprPosNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link CalFracoesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFraction(CalFracoesParser.ExprFractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalFracoesParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CalFracoesParser.VarContext ctx);
}