import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Execute extends FracLangBaseVisitor<Fraction> {

   private Map<String, Fraction> variables = new HashMap<>();
   private Scanner scanner = new Scanner(System.in);

   @Override public Fraction visitDisplay(FracLangParser.DisplayContext ctx) {
      Fraction res = visit(ctx.expr());

      if (res != null) {
         System.out.println(res);
      }
      return res;
   }

   @Override public Fraction visitAssignment(FracLangParser.AssignmentContext ctx) {
      Fraction res = visit(ctx.expr());

      if (res != null) {
         String id = ctx.ID().getText();
         variables.put(id, res);
      }
      return res;
   }

   @Override public Fraction visitExprFraction(FracLangParser.ExprFractionContext ctx) {
      return visit(ctx.fraction());
   }

   @Override public Fraction visitExprID(FracLangParser.ExprIDContext ctx) {
      Fraction res = null;
      String id = ctx.ID().getText();
      if (!variables.containsKey(id)) {
         System.out.println("ERROR: Undefined variable: " + id + " , line:" + ctx.start.getLine());
      } else {
         res = variables.get(id);
      }

      return res;
   }

   @Override public Fraction visitFraction(FracLangParser.FractionContext ctx) {
      int num = Integer.parseInt(ctx.num.getText());
      int den = ctx.den == null ? 1 : Integer.parseInt(ctx.den.getText());
      Fraction res = new Fraction(num, den);

      return res;
   }

   @Override public Fraction visitExprUnary(FracLangParser.ExprUnaryContext ctx) {
      Fraction res = visit(ctx.expr());

      if (res != null) {
         if (ctx.op.getText().equals("-")) {
            res = res.symmetric();
         }
      }

      return res;
   }

   @Override public Fraction visitExprMultDiv(FracLangParser.ExprMultDivContext ctx) {
      Fraction res = null;

      Fraction f1 = visit(ctx.expr(0));
      Fraction f2 = visit(ctx.expr(1));

      if (f1 != null && f2 != null) {
         if (ctx.op.getText().equals("*")) {
            res = f1.mult(f2);
         } else {
            res = f1.div(f2);
         }
      }

      return res;
   }

   @Override public Fraction visitExprAddSub(FracLangParser.ExprAddSubContext ctx) {
      Fraction res = null;

      Fraction f1 = visit(ctx.expr(0));
      Fraction f2 = visit(ctx.expr(1));

      if (f1 != null && f2 != null) {
         if (ctx.op.getText().equals("+")) {
            res = f1.add(f2);
         } else {
            res = f1.sub(f2);
         }
      }

      return res;
   }

   @Override public Fraction visitExprPar(FracLangParser.ExprParContext ctx) {
      Fraction res = visit(ctx.expr());

      return res;
   }

   @Override public Fraction visitExprRead(FracLangParser.ExprReadContext ctx) {
      Fraction res = null;

      String prompt = ctx.String().getText();
      prompt = prompt.substring(1, prompt.length() - 1) + ": ";
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
