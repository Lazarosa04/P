import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class NumbersMain {
   public static HashMap<String, String> readNumbers() {
      try {
         // create a CharStream that reads from the numbers.txt file:
         CharStream input = CharStreams.fromStream(new FileInputStream("numbers.txt"));
         // create a lexer that feeds off of input CharStream:
         NumbersLexer lexer = new NumbersLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         NumbersParser parser = new NumbersParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            ParseTreeWalker walker = new ParseTreeWalker();
            Read listener0 = new Read();
            walker.walk(listener0, tree);
            HashMap<String, String> result = listener0.output();

      //      Print the HashMap
      //      for (Map.Entry<String, String> entry : result.entrySet()) {
      //         System.out.println(entry.getKey() + " -> " + entry.getValue());
      //      }

            return result;
         }
      } catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      } catch (RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
      return null;
   }

   public static void main(String[] args) {
      HashMap<String, String> dictionary = readNumbers();
      Scanner scan = new Scanner(System.in);  // Create a Scanner object
      String text = scan.nextLine();       // input
      String[] elements = text.split("[,\\s\\.\\-\\+\\*\\^\\/\\!]");   // tenta separar tudo para evitar casos como o twenty-four
      for(String s : elements){
         if(dictionary.containsKey(s.trim())){
            System.out.print(dictionary.get(s) + " ");
         }
         else {
            System.out.print(s + " ");
         }
      }
      scan.close();
   }
}
