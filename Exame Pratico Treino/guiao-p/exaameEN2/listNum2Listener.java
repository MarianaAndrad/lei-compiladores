// Generated from listNum2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link listNum2Parser}.
 */
public interface listNum2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link listNum2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(listNum2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link listNum2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(listNum2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link listNum2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(listNum2Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link listNum2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(listNum2Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link listNum2Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(listNum2Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link listNum2Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(listNum2Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link listNum2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(listNum2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link listNum2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(listNum2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link listNum2Parser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(listNum2Parser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link listNum2Parser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(listNum2Parser.While_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(listNum2Parser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(listNum2Parser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(listNum2Parser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(listNum2Parser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOpcao}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOpcao(listNum2Parser.ExprOpcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOpcao}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOpcao(listNum2Parser.ExprOpcaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprlist}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(listNum2Parser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprlist}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(listNum2Parser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(listNum2Parser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link listNum2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(listNum2Parser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listList}
	 * labeled alternative in {@link listNum2Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterListList(listNum2Parser.ListListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listList}
	 * labeled alternative in {@link listNum2Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitListList(listNum2Parser.ListListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listNUM}
	 * labeled alternative in {@link listNum2Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterListNUM(listNum2Parser.ListNUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listNUM}
	 * labeled alternative in {@link listNum2Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitListNUM(listNum2Parser.ListNUMContext ctx);
}