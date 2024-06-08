import java.util.List;

public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitAction(HelloParser.ActionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      String res = null;
      System.out.print("Olá ");
      for (int i= 0; i<ctx.ID().size(); i++ ){
         System.out.printf( ctx.ID(i).getText() + " ");
      }
      System.out.print("!");
      return res;
   }

   @Override public String visitBye(HelloParser.ByeContext ctx) {
      String res = null;
      System.out.print("Bye ");
      for (int i= 0; i<ctx.ID().size(); i++ ){
         System.out.printf( ctx.ID(i).getText() + " ");
      }
      System.out.print("!");
      return res;
   }
}
