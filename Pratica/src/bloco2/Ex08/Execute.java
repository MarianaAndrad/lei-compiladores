public class Execute extends converterBaseVisitor<String> {

   @Override public String visitProgram(converterParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStat(converterParser.StatContext ctx) {
      System.out.println("Result: ");
      if(ctx.expr()!=null){
         if(visit(ctx.expr())!= null){
            System.out.println(String.format("%.2f", visit(ctx.expr())));
         }else if(ctx.assignment() != null){
            visit(ctx.assignment());
         }
 
      }
      System.out.println();
      return null;
      
   }

   @Override public String visitExprAtribution(converterParser.ExprAtributionContext ctx) {
      System.out.print(String.format("%s = ", ctx.ID().getText()));
      visit(ctx.expr());
      return null;
   }

   @Override public String visitExprAddSub(converterParser.ExprAddSubContext ctx) {
      visit(ctx.expr(0));
      visit(ctx.expr(1));
      System.out.print(ctx.op.getText()+ " ");
      return null;
   }

   @Override public String visitExprParent(converterParser.ExprParentContext ctx) {
      visit(ctx.expr());
      return null;
   }

   @Override public String visitExprInteger(converterParser.ExprIntegerContext ctx) {
      visit(ctx.var());
      return null;
   }

   @Override public String visitExprPosNeg(converterParser.ExprPosNegContext ctx) {
      visit(ctx.expr());
      System.out.print("!" + ctx.op.getText() + " ");
      return null;
   }

   @Override public String visitExprMultDivMod(converterParser.ExprMultDivModContext ctx) {
      visit(ctx.expr(0));
      visit(ctx.expr(1));
      System.out.print(ctx.op.getText()+ " ");
      return null;
   }

   @Override public String visitVar(converterParser.VarContext ctx) {
      String res = null;
      if(ctx.Integer() != null) {
         System.out.print(ctx.Integer().getText()+ " ");
      } else if(ctx.ID() != null) {
         System.out.print(ctx.ID().getText() + " ");
      }
      return res;
   }
}
