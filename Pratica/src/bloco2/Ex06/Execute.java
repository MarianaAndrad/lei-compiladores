import java.util.HashMap;

public class Execute extends CalculatorBaseVisitor<Double> {
   private HashMap<String, Double> vars;

   @Override public Double visitProgram(CalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(CalculatorParser.StatContext ctx) {
      if (ctx.expr()!=null)
         if(visit(ctx.expr())!= null){
            System.out.println(String.format("Resultado: %.2f", visit(ctx.expr())));
         }
         if( ctx.assignment() != null) {
            visit(ctx.assignment());
            System.out.println("Mapa: ");
            for (HashMap.Entry<String, Double> entry : vars.entrySet()) {
               System.out.println("Key: " + entry.getKey() + "\tvalue: " + entry.getValue());
            }
         }
      return null;
   }

   @Override public Double visitExprAtribution(CalculatorParser.ExprAtributionContext ctx) {
      String name = ctx.ID().getText();
      Double value = visit(ctx.expr());
      if(value!=null)
         vars.put(name, value);
      return null;
   }

   @Override public Double visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Double result = null;
      String op = ctx.op.getText();
      Double num1 = visit(ctx.expr(0));
      Double num2 = visit(ctx.expr(1));
      

      switch(op){
         case "+":
            result = num1 + num2;
            break;
         case "-":
            result = num1 - num2;
            break; 
      }
      return result;
   }

   @Override public Double visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Double visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return visit(ctx.var());
   }

   @Override public Double visitExprPosNeg(CalculatorParser.ExprPosNegContext ctx) {
      Double result = null;
      String op = ctx.op.getText();
      Double num1 = visit(ctx.expr());
      

      switch(op){
         case "-":
            result = -1.0 * num1;
            break;
         case "+":
            result = num1;
            break;
      }
      return result;
   }

   @Override public Double visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Double result = null;
      String op = ctx.op.getText();
      Double num1 = visit(ctx.expr(0));
      Double num2 = visit(ctx.expr(1));
      

      switch(op){
         case "*":
            result = num1 * num2;
            break;
         case "/":
            if(num2 == 0){
               result= null;
               break;
            }
            result = num1 / num2;
            break;
         case "%":
            result = num1 % num2;
            break;  
      }
      return result;
   }

   @Override public Double visitVar(CalculatorParser.VarContext ctx) {
      Double res = null;

      if(ctx.Integer() != null) {
         res = Double.parseDouble(ctx.Integer().getText());
      } else if(ctx.ID() != null) {
         res = vars.get(ctx.ID().getText());
      }
      return res;
   }
}
