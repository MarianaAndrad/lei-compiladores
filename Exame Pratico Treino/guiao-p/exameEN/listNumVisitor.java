// Generated from listNum.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link listNumParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface listNumVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link listNumParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(listNumParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link listNumParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(listNumParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link listNumParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(listNumParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link listNumParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(listNumParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link listNumParser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(listNumParser.While_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRead(listNumParser.ExprReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(listNumParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOpcao}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOpcao(listNumParser.ExprOpcaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprlist}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(listNumParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(listNumParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listList}
	 * labeled alternative in {@link listNumParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListList(listNumParser.ListListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listNUM}
	 * labeled alternative in {@link listNumParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListNUM(listNumParser.ListNUMContext ctx);
}