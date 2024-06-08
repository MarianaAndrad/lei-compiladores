// Generated from listNum2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link listNum2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface listNum2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link listNum2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(listNum2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link listNum2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(listNum2Parser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link listNum2Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(listNum2Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link listNum2Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(listNum2Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link listNum2Parser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(listNum2Parser.While_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRead(listNum2Parser.ExprReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(listNum2Parser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOpcao}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOpcao(listNum2Parser.ExprOpcaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprlist}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(listNum2Parser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(listNum2Parser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listList}
	 * labeled alternative in {@link listNum2Parser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListList(listNum2Parser.ListListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listNUM}
	 * labeled alternative in {@link listNum2Parser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListNUM(listNum2Parser.ListNUMContext ctx);
}