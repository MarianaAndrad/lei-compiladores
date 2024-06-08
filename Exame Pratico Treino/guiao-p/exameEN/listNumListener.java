// Generated from listNum.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link listNumParser}.
 */
public interface listNumListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link listNumParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(listNumParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link listNumParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(listNumParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link listNumParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(listNumParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link listNumParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(listNumParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link listNumParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(listNumParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link listNumParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(listNumParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link listNumParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(listNumParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link listNumParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(listNumParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link listNumParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(listNumParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link listNumParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(listNumParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(listNumParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRead}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(listNumParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(listNumParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(listNumParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOpcao}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOpcao(listNumParser.ExprOpcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOpcao}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOpcao(listNumParser.ExprOpcaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprlist}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(listNumParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprlist}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(listNumParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(listNumParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link listNumParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(listNumParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listList}
	 * labeled alternative in {@link listNumParser#list}.
	 * @param ctx the parse tree
	 */
	void enterListList(listNumParser.ListListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listList}
	 * labeled alternative in {@link listNumParser#list}.
	 * @param ctx the parse tree
	 */
	void exitListList(listNumParser.ListListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listNUM}
	 * labeled alternative in {@link listNumParser#list}.
	 * @param ctx the parse tree
	 */
	void enterListNUM(listNumParser.ListNUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listNUM}
	 * labeled alternative in {@link listNumParser#list}.
	 * @param ctx the parse tree
	 */
	void exitListNUM(listNumParser.ListNUMContext ctx);
}