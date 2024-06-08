public class Interpreter extends CalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(CalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(CalculatorParser.StatContext ctx) {
      //no caso da expressão ser dada, calculamos o resultado (visit), caso contrario retorno nulo
      if (ctx.expr()!=null)
         System.out.println(String.format("Resultado: %.2f", visit(ctx.expr())));
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
            result = num1 / num2;
            break;
         case "%":
            result = num1 % num2;
            break;  
      }
      return result;
   }
}
