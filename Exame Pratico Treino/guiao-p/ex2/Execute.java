import java.util.HashMap;
import java.util.Scanner;

public class Execute extends FracLangBaseVisitor<Fraction> {
   private HashMap <String, Fraction > variaveis = new HashMap<>();
   private Scanner scanner = new Scanner(System.in);
   
   @Override public Fraction visitProgram(FracLangParser.ProgramContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitStatDisplay(FracLangParser.StatDisplayContext ctx) {
      Fraction res = visit(ctx.expr());
      if(res != null){
         System.out.println(res);
      }
      return res;
   }

   @Override public Fraction visitStatAtribuicao(FracLangParser.StatAtribuicaoContext ctx) {
      Fraction res = visit(ctx.expr());
      if(res != null){
         String id = ctx.ID().getText();
         variaveis.put (id,res);
         //System.out.println("variavel:" + id);
      }
      return res;
   }

   @Override public Fraction visitExprFranction(FracLangParser.ExprFranctionContext ctx) {
      return visit(ctx.franction());
   }

   @Override public Fraction visitExprID(FracLangParser.ExprIDContext ctx) {
      Fraction res = null;
      String id = ctx.ID().getText();
      if(!variaveis.containsKey(id)){
         System.err.println("ERROR: variable " + id + " not defined");
      }else{
         res= variaveis.get(id);
      }
      return res;
   }

   @Override public Fraction visitFranction(FracLangParser.FranctionContext ctx) {
      Fraction res = null;
      return new Fraction(Integer.parseInt(ctx.num.getText()), ctx.den == null ? 1 :Integer.parseInt(ctx.den.getText()));
      //return res;
   }

   @Override public Fraction visitExprMultDiv(FracLangParser.ExprMultDivContext ctx) {
      Fraction res = null;
      Fraction e1 = visit(ctx.expr(0));
      Fraction e2 = visit(ctx.expr(1));
      if(e1 != null && e2 != null){
         switch (ctx.op.getText()) {
            case "*":
               res = e1.Mult(e2);
               break;
         
            case ":":
               res = e1.Div(e2);
               break;
         }
      }
      return res;
   }

   @Override public Fraction visitExprPar(FracLangParser.ExprParContext ctx) {
      Fraction res = visit(ctx.expr());
      return res;
   }

   @Override public Fraction visitExprAddSub(FracLangParser.ExprAddSubContext ctx) {
      Fraction res = null;
      Fraction e1 = visit(ctx.expr(0));
      Fraction e2 = visit(ctx.expr(1));
      if(e1 != null && e2 != null){
         switch (ctx.op.getText()) {
            case "-":
               res = e1.SUB(e2);
               break;
         
            case "+":
               res = e1.SUM(e2);
               break;
         }
      }
      return res;
   }

   @Override public Fraction visitExprPosNeg(FracLangParser.ExprPosNegContext ctx) {
      Fraction res = visit(ctx.expr());
      if(res != null){
         if(ctx.op.getText().equals("-")){
            res = res.simetrico();
         }
      }
      return res;
   }


   @Override public Fraction visitExprStr(FracLangParser.ExprStrContext ctx) {
      Fraction res = null;
      String prompt = ctx.STR().getText();
      prompt = prompt.substring(1,prompt.length()-1) + ": ";
      System.out.println( prompt);
      String input = scanner.nextLine();
      if (!Fraction.valid(input.trim())){
         System.out.println("ERROR: Invalid fraction, line:" + ctx.start.getLine());
      } else {
         res = new Fraction(input.trim());
      }

      return res;
   }

   @Override public Fraction visitExprReduce(FracLangParser.ExprReduceContext ctx) {
      Fraction res = visit(ctx.expr());

      return res.reduce();
   }
}
