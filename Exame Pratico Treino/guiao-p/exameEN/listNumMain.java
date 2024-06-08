import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;


public class listNumMain {
   public static void main(String[] args) {
      if(args.length==0){
                  try {
                  // create a CharStream that reads from standard input:
                  CharStream input = CharStreams.fromStream(System.in);
                  // create a lexer that feeds off of input CharStream:
                  listNumLexer lexer = new listNumLexer(input);
                  // create a buffer of tokens pulled from the lexer:
                  CommonTokenStream tokens = new CommonTokenStream(lexer);
                  // create a parser that feeds off the tokens buffer:
                  listNumParser parser = new listNumParser(tokens);
                  // replace error listener:
                  //parser.removeErrorListeners(); // remove ConsoleErrorListener
                  //parser.addErrorListener(new ErrorHandlingListener());
                  // begin parsing at program rule:
                  ParseTree tree = parser.program();
                  if (parser.getNumberOfSyntaxErrors() == 0) {
                     // print LISP-style tree:
                     // System.out.println(tree.toStringTree(parser));
                     Execute visitor0 = new Execute();
                     visitor0.visit(tree);
                  }
               }
               catch(IOException e) {
                  e.printStackTrace();
                  System.exit(1);
               }
               catch(RecognitionException e) {
                  e.printStackTrace();
                  System.exit(1);
               }
      }
      else{
         for (String filename: args){
            System.out.println(filename);
            try {
                     // create a CharStream that reads from standard input:
                     CharStream input = CharStreams.fromFileName(filename);
                     // create a lexer that feeds off of input CharStream:
                     listNumLexer lexer = new listNumLexer(input);
                     // create a buffer of tokens pulled from the lexer:
                     CommonTokenStream tokens = new CommonTokenStream(lexer);
                     // create a parser that feeds off the tokens buffer:
                     listNumParser parser = new listNumParser(tokens);
                     // replace error listener:
                     //parser.removeErrorListeners(); // remove ConsoleErrorListener
                     //parser.addErrorListener(new ErrorHandlingListener());
                     // begin parsing at program rule:
                     ParseTree tree = parser.program();
                     if (parser.getNumberOfSyntaxErrors() == 0) {
                        // print LISP-style tree:
                        // System.out.println(tree.toStringTree(parser));
                        Execute visitor0 = new Execute();
                        visitor0.visit(tree);
                     }
                  }
                  catch(IOException e) {
                     e.printStackTrace();
                     System.exit(1);
                  }
                  catch(RecognitionException e) {
                     e.printStackTrace();
                     System.exit(1);
                  }
               }
      }
   }
}

