import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Execute extends CalFracoesBaseVisitor<Fraction> {

   private HashMap<String, Fraction> vars;

   @Override public Fraction visitProgram(CalFracoesParser.ProgramContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitStat(CalFracoesParser.StatContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitExprAtribution(CalFracoesParser.ExprAtributionContext ctx) {
      String nameVar = ctx.ID().getText();
      Fraction value = visit(ctx.expr());
      if(value!=null)
         vars.put(nameVar, value);
      return null;
   }

   @Override public Fraction visitExpressao(CalFracoesParser.ExpressaoContext ctx) {
      Fraction res = visit(ctx.expr());
      if(res!= null){
         System.out.println(res.toString());
      }
      return null;
   }

   @Override public Fraction visitExprReducao(CalFracoesParser.ExprReducaoContext ctx) {
      Fraction f = visit(ctx.expr());
      f.reduce();
      return f;
   }

   @Override public Fraction visitExprAddSub(CalFracoesParser.ExprAddSubContext ctx) {
      String op = ctx.op.getText();
      Fraction num1 = visit(ctx.expr(0));
      Fraction num2 = visit(ctx.expr(1));
      switch(op){
         case "+":
            return num1.add(num2);
         case "-":
            return num1.subtract(num2); 
      }
      return null;
   }

   @Override public Fraction visitExprRead(CalFracoesParser.ExprReadContext ctx) {
      Scanner sc = null;
      //sc = new Scanner(System.in); Dá erro, pois há conflito entre o input de dados no antlr4 e o Scanner
      try {
         sc = new Scanner(new File("/dev/tty"));
      } catch (FileNotFoundException e){
         System.err.println("Error! Can not read from terminal!!");
         System.exit(0);
      }
      System.out.print(String.format("Insert value for variable %s: ", ctx.STRING().getText()));
      String str = sc.nextLine();
      //Does not read until 
      sc.close();
      String [] fr = str.split("/");
      return new Fraction(Integer.parseInt(fr[0]), Integer.parseInt(fr[1]));
   }

   @Override public Fraction visitExprPotencia(CalFracoesParser.ExprPotenciaContext ctx) {
      Fraction f = visit(ctx.expr());
      Fraction powed = new Fraction(f);
      Integer pow = Integer.parseInt(ctx.Integer().getText());
      for(int a=0; a<pow-1; a++)
         powed = powed.multiply(f);
      if (ctx.neg!=null)
         return powed.invert();
      return powed;
   }

   @Override public Fraction visitExprParent(CalFracoesParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Fraction visitExprMultDiv(CalFracoesParser.ExprMultDivContext ctx) {
      String op = ctx.op.getText();
      Fraction num1 = visit(ctx.expr(0));
      Fraction num2 = visit(ctx.expr(1));
      switch(op){
         case "*":
            return num1.multiply(num2);
         case ":":
            return num1.divide(num2); 
      }
      return null;
   }

   @Override public Fraction visitExprVariable(CalFracoesParser.ExprVariableContext ctx) {
      return visit(ctx.var());
   }

   @Override public Fraction visitExprPosNeg(CalFracoesParser.ExprPosNegContext ctx) {
      String op = ctx.op.getText();
      Fraction num1 = visit(ctx.expr());
      switch(op){
         case "-":
            return num1.multiply(new Fraction(-1));
         case "+":
            return num1;
      }
      return null;
   }

   @Override public Fraction visitExprFraction(CalFracoesParser.ExprFractionContext ctx) {
      int numerador = Integer.parseInt(ctx.Integer(0).getText());
      int denominador = Integer.parseInt(ctx.Integer(1).getText());
      return new Fraction(numerador, denominador);
   }

   @Override public Fraction visitVar(CalFracoesParser.VarContext ctx) {
      Fraction res = null;

      if(ctx.Integer() != null) {
         res = new Fraction (Integer.parseInt(ctx.Integer().getText()));
      } else if(ctx.ID() != null) {
         String varname = ctx.ID().getText();
         Fraction value = vars.get(varname);
         if (value==null)
            System.out.println(String.format("ERRO! Variável '%s' a ser utilizada antes de declarada!", varname));
         return value;
         }
      return res;
   }
}
