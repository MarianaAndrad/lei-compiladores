public class Interpreter extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      //no caso da expressão ser dada, calculamos o resultado (visit), caso contrario retorno nulo
      if (ctx.expr()!=null)
         if(visit(ctx.expr())!= null){
            System.out.println(String.format("Resultado: %.2f", visit(ctx.expr())));
         }else{
            System.out.println("ERRO");
            System.exit(1);
         }
      return null;
   }

   @Override public Double visitExprNUmber(SuffixCalculatorParser.ExprNUmberContext ctx) {
      return Double.parseDouble(ctx.Number().getText());
   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      Double result = null;
      String op = ctx.op.getText();
      Double num1 = visit(ctx.expr(0));
      Double num2 = visit(ctx.expr(1));
      

      switch(op){
         case "+":
            result = num1 + num2;
            break;
         case "*":
            result = num1 * num2;
            break;
         case "-":
            result = num1 - num2;
            break;
         case "/":
            if(num2 == 0){
               result= null;
               break;
            }
            result = num1 / num2;
            break;     
      }
      return result;
   }
}
