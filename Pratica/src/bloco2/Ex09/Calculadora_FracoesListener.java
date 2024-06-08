// Generated from Calculadora_Fracoes.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Calculadora_FracoesParser}.
 */
public interface Calculadora_FracoesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Calculadora_FracoesParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Calculadora_FracoesParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculadora_FracoesParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Calculadora_FracoesParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAtribution}
	 * labeled alternative in {@link Calculadora_FracoesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterExprAtribution(Calculadora_FracoesParser.ExprAtributionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAtribution}
	 * labeled alternative in {@link Calculadora_FracoesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitExprAtribution(Calculadora_FracoesParser.ExprAtributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calculadora_FracoesParser#linha}.
	 * @param ctx the parse tree
	 */
	void enterLinha(Calculadora_FracoesParser.LinhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculadora_FracoesParser#linha}.
	 * @param ctx the parse tree
	 */
	void exitLinha(Calculadora_FracoesParser.LinhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link Calculadora_FracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFraction(Calculadora_FracoesParser.ExprFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link Calculadora_FracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFraction(Calculadora_FracoesParser.ExprFractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link Calculadora_FracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVariable(Calculadora_FracoesParser.ExprVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVariable}
	 * labeled alternative in {@link Calculadora_FracoesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVariable(Calculadora_FracoesParser.ExprVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calculadora_FracoesParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(Calculadora_FracoesParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calculadora_FracoesParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(Calculadora_FracoesParser.VarContext ctx);
}