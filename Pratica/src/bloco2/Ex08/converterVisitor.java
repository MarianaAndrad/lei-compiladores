// Generated from converter.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link converterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface converterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link converterParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(converterParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link converterParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(converterParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAtribution}
	 * labeled alternative in {@link converterParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtribution(converterParser.ExprAtributionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(converterParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(converterParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(converterParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPosNeg}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPosNeg(converterParser.ExprPosNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link converterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDivMod(converterParser.ExprMultDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link converterParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(converterParser.VarContext ctx);
}