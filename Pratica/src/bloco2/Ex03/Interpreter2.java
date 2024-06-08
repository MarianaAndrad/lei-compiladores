public class Interpreter2 extends CalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(CalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(CalculatorParser.StatContext ctx) {
      if (ctx.expr()!=null)
         if(visit(ctx.expr())!= null){
            System.out.println(String.format("Resultado: %.2f", visit(ctx.expr())));
         }else{
            System.out.println("ERRO");
            System.exit(1);
         }
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
      return Double.parseDouble(ctx.Integer().getText());
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
}
