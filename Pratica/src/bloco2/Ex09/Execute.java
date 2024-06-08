import java.util.HashMap;

public class Execute extends Calculadora_FracoesBaseVisitor<Fraction> {

   private HashMap<String, Fraction> vars;
   
   @Override public Fraction visitProgram(Calculadora_FracoesParser.ProgramContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitExprAtribution(Calculadora_FracoesParser.ExprAtributionContext ctx) {
      String nameVar = ctx.ID().getText();
      Fraction value = visit(ctx.expr());
      if(value!=null)
         vars.put(nameVar, value);
      return null;
   }

   @Override public Fraction visitLinha(Calculadora_FracoesParser.LinhaContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitExprFraction(Calculadora_FracoesParser.ExprFractionContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitExprVariable(Calculadora_FracoesParser.ExprVariableContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitExprNumber(Calculadora_FracoesParser.VarContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitExprPosNeg(Calculadora_FracoesParser.VarContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }


   @Override public Fraction visitExprOperativo(Calculadora_FracoesParser.VarContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }
}
