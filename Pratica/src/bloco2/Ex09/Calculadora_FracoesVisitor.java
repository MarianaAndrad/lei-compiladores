// Generated from Calculadora_Fracoes.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Calculadora_FracoesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Calculadora_FracoesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Calculadora_FracoesParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Calculadora_FracoesParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAtribution}
	 * labeled alternative in {@link Calculadora_FracoesParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtribution(Calculadora_FracoesParser.ExprAtributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Calculadora_FracoesParser#linha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinha(Calculadora_FracoesParser.LinhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link Calculadora_FracoesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFraction(Calculadora_FracoesParser.ExprFractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link Calculadora_FracoesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVariable(Calculadora_FracoesParser.ExprVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Calculadora_FracoesParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(Calculadora_FracoesParser.VarContext ctx);
}