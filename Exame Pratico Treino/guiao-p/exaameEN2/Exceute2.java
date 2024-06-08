import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Exceute2 extends listNum2BaseVisitor<ArrayList<Double>> {

   private HashMap<String, ArrayList<Double> > variaveis = new HashMap<>();

   @Override public ArrayList<Double> visitProgram(listNum2Parser.ProgramContext ctx) {
      ArrayList<Double> res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ArrayList<Double> visitStat(listNum2Parser.StatContext ctx) {
      ArrayList<Double> res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ArrayList<Double> visitPrint(listNum2Parser.PrintContext ctx) {
      for (listNum2Parser.ExprContext x:ctx.expr()){
         ArrayList<Double> res = visit(x);

         if(res!= null){
            System.out.println(res);
         }
      }
      return null;
   }

   @Override public ArrayList<Double> visitAssignment(listNum2Parser.AssignmentContext ctx) {
      ArrayList<Double> res = visit(ctx.expr());
      String var = ctx.ID().getText();
      if(res!=null){
         variaveis.put(var,res);
      }

      return null;
   }

   @Override public ArrayList<Double> visitWhile_(listNum2Parser.While_Context ctx) {
      //ArrayList<Double> res = visit(ctx.expr());
      ArrayList<Double> res = new ArrayList<>();
      String id = ctx.ID().getText();
      if(variaveis.containsKey(id)){
         ArrayList<Double> nova = new ArrayList<>();
         ArrayList<Double> x = variaveis.get(id);
         nova.addAll(x);
      }else{
         System.err.println("Variavel "+ id + " não existe.");
         return null;
      }
      
      while (res.size() != 0){
         for (listNum2Parser.StatContext s : ctx.stat()){
            visit(s);
         }
         //res = visit(ctx.expr());
         if(variaveis.containsKey(id)){
               ArrayList<Double> nova = new ArrayList<>();
               ArrayList<Double> x = variaveis.get(id);
               nova.addAll(x);
            }else{
               System.err.println("Variavel "+ id + " não existe.");
            return null;
            }
            
      }
      return null;
   }

   @Override public ArrayList<Double> visitExprRead(listNum2Parser.ExprReadContext ctx) {
      Scanner sc = new Scanner (System.in);
      if(sc.hasNextLine()){
         String line = sc.nextLine();
         if(line.isEmpty()){
            ArrayList<Double> nova = new ArrayList<>();
            return nova;
         }
         String [] linesep = line.split(",");
         ArrayList<Double> nova = new ArrayList<>();
         for(int i  = 0; i< linesep.length; i++){
            Double x = Double.parseDouble(linesep[i]); 
            nova.add(x);
         }  
         return nova;
      }
      System.err.println("Não tem linha para ler.");
      return null;
   }

   @Override public ArrayList<Double> visitExprAddSub(listNum2Parser.ExprAddSubContext ctx) {
      String op = ctx.op.getText();
      ArrayList<Double> expr1 = visit(ctx.expr(0));
      ArrayList<Double> expr2 = visit(ctx.expr(1));
      if(expr1 == null || expr2 == null){
         return null;
      }
      switch (op){
         case "+":
            if(expr1.size()>= expr2.size()){
               ArrayList<Double> nova = new ArrayList<>();
               nova.addAll(expr1);
               for (int i = 0; i< expr2.size(); i++){
                  double x = nova.get(i)+ expr2.get(i);
                  nova.remove(i);
                  nova.add(i, x);
               }
               return nova;
            }
            else{
                  ArrayList<Double> nova =  new ArrayList<>();
                  nova.addAll(expr2);
                  for (int i = 0; i< expr1.size(); i++){
                     double x = nova.get(i)+ expr1.get(i);
                     nova.remove(i);
                     nova.add(i, x);
                  }
                  return nova;
            }
         case "-":
            //System.out.println("dif");
            if(expr1.size()>= expr2.size()){
                  ArrayList<Double> nova =  new ArrayList<>();
                  nova.addAll(expr1);
                  for (int i = 0; i< expr2.size(); i++){
                     double x = nova.get(i)-expr2.get(i);
                     nova.remove(i);
                     nova.add(i, x);
                  }
                  return nova;
            }
            else{
                  ArrayList<Double> nova =  new ArrayList<>();
                  nova.addAll(expr2);
                  for (int i = 0; i< expr1.size(); i++){
                     double x = expr1.get(i)-nova.get(i);
                     nova.remove(i);
                     nova.add(i, x);
                  }
                  return nova;
            }
      }
      return null;
   }

   @Override public ArrayList<Double> visitExprOpcao(listNum2Parser.ExprOpcaoContext ctx) {
      String op = ctx.op.getText();
      ArrayList<Double> expr1 = visit(ctx.expr());
      if(expr1 == null){
         return null;
      }
      switch (op){
         case "head":
            if(expr1.size() == 0 ){
               System.err.println("lista vazia não tem head.");
               return null;
            }
            //System.out.println("head");
            double x = expr1.get(0);
            ArrayList<Double> head = new ArrayList<>();
            head.add(x);
            return head;

         case "tail":
            if(expr1.size() == 0 ){
               System.err.println("lista vazia não tem tail.");
               return null;
            }
            //System.out.println("tail");
            ArrayList<Double> tail = new ArrayList<>();
            for (int i = 1;i<expr1.size();i++)
            {
               tail.add(expr1.get(i)); 
            }
            
            return tail;

         case "sum":
            double soma = 0.0;
            for(int i = 0; i < expr1.size();i++ ){
                  soma += expr1.get(i);
            }
            //System.out.println("sum");
            ArrayList<Double> sum = new ArrayList<>();
            sum.add(soma);
            return sum;

         case "avg":
            double media = 0.0;
            if(expr1.size() == 0){
                  System.err.println("Não se calcula media com lista vazia.");
                  return null;
            } 
                       
            for(int i = 0; i < expr1.size();i++ ){
                  media += expr1.get(i);
            }
            //System.out.println("media");
            media = media/ expr1.size();
            ArrayList<Double> avg = new ArrayList<>();
            avg.add(media);
            return avg;
      }
      return null;
   }

   @Override public ArrayList<Double> visitExprlist(listNum2Parser.ExprlistContext ctx) {
      ArrayList<Double> res = visit(ctx.list());
      if (res == null){
         return null;
      }
      return res;
   }

   @Override public ArrayList<Double> visitExprID(listNum2Parser.ExprIDContext ctx) {
      ArrayList<Double> nova = new ArrayList<>();
      String id = ctx.ID().getText();

      if(variaveis.containsKey(id)){
         ArrayList<Double> x = variaveis.get(id);
         nova.addAll(x);
         return nova;
      }
      System.err.println("Variavel "+ id + " não existe.");
      return null;
   }

   @Override public ArrayList<Double> visitListList(listNum2Parser.ListListContext ctx) {
      ArrayList<Double> nova = new ArrayList<>();
      for (listNum2Parser.ExprContext x : ctx.expr()){
         ArrayList<Double> res = visit(x);
         if(res == null){return null;}
         nova.addAll(res);
      }
      return nova;
   }

   @Override public ArrayList<Double> visitListNUM(listNum2Parser.ListNUMContext ctx) {
      ArrayList<Double> nova = new ArrayList<>();
      Double x = Double.parseDouble(ctx.NUM().getText());
      nova.add(x);
      return nova;
   }
}
