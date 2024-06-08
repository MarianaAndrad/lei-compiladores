import java.util.HashMap;
import java.util.Scanner;

public class Execute extends StrLangBaseVisitor<String> {

   HashMap <String, String> variables = new HashMap<String, String>();
   private Scanner scanner = new Scanner(System.in);
   
   @Override public String visitProgram(StrLangParser.ProgramContext ctx) {
      String res = null;
      for (int i = 0; i < ctx.stat().size(); i++) {
         visit(ctx.stat(i));
      }
      return res;
   }

   @Override public String visitStatPrint(StrLangParser.StatPrintContext ctx) {
      String res = visit(ctx.expr());
      if(res != null){
         System.out.println(res);
      }
      return res;
   }

   @Override public String visitStatAssign(StrLangParser.StatAssignContext ctx) {
      String res = visit(ctx.expr());
      if(res!= null){
         String id = ctx.ID().getText();
         variables.put(id,res);
      }
      return res;
   }

   @Override public String visitExprParen(StrLangParser.ExprParenContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitExprEspaco(StrLangParser.ExprEspacoContext ctx) {
      String res = visit(ctx.expr());
      if(res== null){return null;}
      res = res.replaceFirst("[ ]","");
      return res;
   }


   @Override public String visitExprDigito(StrLangParser.ExprDigitoContext ctx) {
      String res = visit(ctx.expr());
      if(res == null){return null;}
      res=res.replaceFirst("[0-9]","");
      return res;
   }


   @Override public String visitExprLetra(StrLangParser.ExprLetraContext ctx) {
      String res = visit(ctx.expr());
      if(res== null){return null;}
      res = res.replaceFirst("[ [a-zA-Z]a && [^aeiou]]","");
      return res;
   }

   @Override public String visitExprString(StrLangParser.ExprStringContext ctx) {
      String res = null;
      res = ctx.STRING().getText();
      //retirar as aspas
      res = res.substring(1, res.length()-1);
      return res;
   }

   @Override public String visitExprInput(StrLangParser.ExprInputContext ctx) {
      String res = null;
      res = new String();
      String prompt= visit(ctx.expr());
      System.out.print(prompt);
      //Scanner sc = new Scanner(System.in);
      res = scanner.nextLine();
      return res;
   }

   @Override public String visitExprID(StrLangParser.ExprIDContext ctx) {
      String res = null;
      String id = ctx.ID().getText();
      if (!variables.containsKey(id)) {
         System.err.println("ERRO: Variavél " + id + " não declarada!");
      }else{
         res = variables.get(id);
      }
      return res;
   }

   @Override public String visitExprAdd(StrLangParser.ExprAddContext ctx) {
      String res = null;
      res = visit(ctx.expr(0)) + visit(ctx.expr(1));
      return res;
   }

   @Override public String visitExprSub(StrLangParser.ExprSubContext ctx) {
      String res = null;
      res = visit(ctx.expr(0));
      res = res.replaceAll(visit(ctx.expr(1)), "");
      return res;
   }

   @Override public String visitExprTrim(StrLangParser.ExprTrimContext ctx) {
      String res = null;
      res = visit(ctx.expr());
      res = res.trim();
      return res;
   }

   @Override public String visitExprSubstituir(StrLangParser.ExprSubstituirContext ctx) {
      String res = null;
      String original = visit(ctx.expr(0));
      String replaceStr = visit(ctx.expr(1));
      String by = visit(ctx.expr(2));
      res = original.replaceAll(replaceStr, by);
      return res;
   }
}
