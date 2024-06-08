import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;


public class Execute extends listNumBaseVisitor<Lista> {

   private HashMap<String, Lista> variaveis;
   
   public Execute (){
      variaveis = new HashMap<>();
   }

   

   @Override public Lista visitProgram(listNumParser.ProgramContext ctx) {
      Lista res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Lista visitStat(listNumParser.StatContext ctx) {
      Lista res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Lista visitPrint(listNumParser.PrintContext ctx) {
      for (listNumParser.ExprContext x:ctx.expr()){
         Lista res = visit(x);

         if(res!= null){
            System.out.println(res);
         }
      }
      return null;
   }

   @Override public Lista visitAssignment(listNumParser.AssignmentContext ctx) {
      Lista res = visit(ctx.expr());
      String var = ctx.ID().getText();
      if(res!=null){
         variaveis.put(var,res);
      }

      return null;
   }

   @Override public Lista visitWhile_(listNumParser.While_Context ctx) {
      Lista res = visit(ctx.expr());
      /*Lista res;
      String id = ctx.ID().getText();
      if(variaveis.containsKey(id)){
         ArrayList<Double> nova = new ArrayList<>();
         Lista x = variaveis.get(id);
         nova.addAll(x.getLista());
         res = new Lista(nova);
      }else{
         System.err.println("Variavel "+ id + " não existe.");
         return null;
      }*/
      if(res == null){
         return null;
      }

      while (res.getLista().size() != 0){
         for (listNumParser.StatContext s : ctx.stat()){
            visit(s);
         }
         res = visit(ctx.expr());
         /*if(variaveis.containsKey(id)){
               ArrayList<Double> nova = new ArrayList<>();
               Lista x = variaveis.get(id);
               nova.addAll(x.getLista());
               res = new Lista(nova);
            }else{
               System.err.println("Variavel "+ id + " não existe.");
            return null;
            }*/
            
      }
      return null;
   }

   @Override public Lista visitExprlist(listNumParser.ExprlistContext ctx) {
      Lista res = visit(ctx.list());
      if (res == null){
         return null;
      }
      ArrayList<Double> nova = res.getLista();
      return new Lista(nova);
   }

   @Override public Lista visitExprID(listNumParser.ExprIDContext ctx) {
      ArrayList<Double> nova = new ArrayList<>();
      String id = ctx.ID().getText();

      if(variaveis.containsKey(id)){
         Lista x = variaveis.get(id);
         nova.addAll(x.getLista());
         return new Lista(nova);
      }
      System.err.println("Variavel "+ id + " não existe.");
      return null;
   }

   @Override public Lista visitExprRead(listNumParser.ExprReadContext ctx) {
      Scanner sc = new Scanner (System.in);
      if(sc.hasNextLine()){
         String line = sc.nextLine();
         if(line.isEmpty()){
            ArrayList<Double> nova = new ArrayList<>();
            return new Lista(nova);
         }
         String [] linesep = line.split(",");
         ArrayList<Double> nova = new ArrayList<>();
         for(int i  = 0; i< linesep.length; i++){
            //verificar se é um numero
            try{
               nova.add(Double.parseDouble(linesep[i]));
            }catch(NumberFormatException e){
               System.err.println("Erro ao ler o valor, "+ linesep[i] + " não é um numero.");
               return null;
            }
         }  
         return new Lista(nova);
      }
      System.err.println("Não tem linha para ler.");
      return null;
   }

   @Override public Lista visitExprOpcao(listNumParser.ExprOpcaoContext ctx) {
      ArrayList<Double> nova = new ArrayList<>();
      String op = ctx.op.getText();
      Lista expr1 = visit(ctx.expr());
      if(expr1 == null){
         return null;
      }
      switch (op){
         case "head":
            return expr1.head();
         case "tail":
            return expr1.tail();
         case "sum":
            return expr1.sum();
         case "avg":
            return expr1.avg();
      }
      return null;
   }

   @Override public Lista visitExprAddSub(listNumParser.ExprAddSubContext ctx) {
      ArrayList<Double> nova = new ArrayList<>();
      String op = ctx.op.getText();
      Lista expr1 = visit(ctx.expr(0));
      Lista expr2 = visit(ctx.expr(1));
      if(expr1 == null || expr2 == null){
         return null;
      }
      switch (op){
         case "+":
            return expr1.add(expr2);
         case "-":
            return expr1.dif(expr2);
      }
      return null;
   }

   @Override public Lista visitListList(listNumParser.ListListContext ctx) {
      ArrayList<Double> nova = new ArrayList<>();
      for (listNumParser.ExprContext x : ctx.expr()){
         Lista res = visit(x);
         if(res == null){return null;}
         nova.addAll(res.getLista());
      }
      return new Lista(nova);
   }

   @Override public Lista visitListNUM(listNumParser.ListNUMContext ctx) {
      ArrayList<Double> nova = new ArrayList<>();
      Double x = Double.parseDouble(ctx.NUM().getText());
      nova.add(x);
      return new Lista(nova);
   }
}
