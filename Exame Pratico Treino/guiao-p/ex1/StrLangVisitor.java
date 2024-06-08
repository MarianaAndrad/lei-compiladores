// Generated from StrLang.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StrLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StrLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatPrint}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatPrint(StrLangParser.StatPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatAssign}
	 * labeled alternative in {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAssign(StrLangParser.StatAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEspaco}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEspaco(StrLangParser.ExprEspacoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(StrLangParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(StrLangParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSubstituir}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubstituir(StrLangParser.ExprSubstituirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSub}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSub(StrLangParser.ExprSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLetra}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLetra(StrLangParser.ExprLetraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInput}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInput(StrLangParser.ExprInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDigito}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDigito(StrLangParser.ExprDigitoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprTrim}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTrim(StrLangParser.ExprTrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(StrLangParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(StrLangParser.ExprAddContext ctx);
}