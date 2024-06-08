// Generated from StrLang.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StrLangParser}.
 */
public interface StrLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatPrint(StrLangParser.StatPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatPrint(StrLangParser.StatPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssign(StrLangParser.StatAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssign(StrLangParser.StatAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEspaco}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEspaco(StrLangParser.ExprEspacoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEspaco}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEspaco(StrLangParser.ExprEspacoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParen(StrLangParser.ExprParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParen(StrLangParser.ExprParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(StrLangParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(StrLangParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSubstituir}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSubstituir(StrLangParser.ExprSubstituirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSubstituir}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSubstituir(StrLangParser.ExprSubstituirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSub}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSub(StrLangParser.ExprSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSub}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSub(StrLangParser.ExprSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLetra}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLetra(StrLangParser.ExprLetraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLetra}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLetra(StrLangParser.ExprLetraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInput(StrLangParser.ExprInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInput(StrLangParser.ExprInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDigito}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDigito(StrLangParser.ExprDigitoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDigito}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDigito(StrLangParser.ExprDigitoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprTrim}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTrim(StrLangParser.ExprTrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprTrim}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTrim(StrLangParser.ExprTrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(StrLangParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(StrLangParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(StrLangParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(StrLangParser.ExprAddContext ctx);
}