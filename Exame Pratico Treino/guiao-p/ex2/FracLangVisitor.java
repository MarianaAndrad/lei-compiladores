// Generated from FracLang.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FracLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FracLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FracLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FracLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statDisplay}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatDisplay(FracLangParser.StatDisplayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statAtribuicao}
	 * labeled alternative in {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAtribuicao(FracLangParser.StatAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMultDiv}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv(FracLangParser.ExprMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPar(FracLangParser.ExprParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStr}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStr(FracLangParser.ExprStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(FracLangParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprReduce}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReduce(FracLangParser.ExprReduceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFranction}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFranction(FracLangParser.ExprFranctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(FracLangParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPosNeg}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPosNeg(FracLangParser.ExprPosNegContext ctx);
	/**
	 * Visit a parse tree produced by {@link FracLangParser#franction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFranction(FracLangParser.FranctionContext ctx);
}