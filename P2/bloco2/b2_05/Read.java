import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
@SuppressWarnings("CheckReturnValue")

public class Read extends NumbersBaseListener {

   static HashMap<String, String> hashmap = new HashMap<String, String>();
   
      @Override public void enterProgram(NumbersParser.ProgramContext ctx) {
      }
   
      @Override public void exitProgram(NumbersParser.ProgramContext ctx) {
      }
   
      @Override public void enterText(NumbersParser.TextContext ctx) {
      }
   
      @Override public void exitText(NumbersParser.TextContext ctx) {
         List<String> data = new ArrayList<>();
         Scanner scan = new Scanner(ctx.getText());
         while(scan.hasNextLine()){
            data.add(scan.nextLine());
         }
         scan.close();
         for(String s : data){
            String[] content = s.split(" ");
            hashmap.put(content[2],content[0]);
         }
      }
   
      @Override public void enterLine(NumbersParser.LineContext ctx) {
      }
   
      @Override public void exitLine(NumbersParser.LineContext ctx) {
      }
   
      @Override public void enterEveryRule(ParserRuleContext ctx) {
      }
   
      @Override public void exitEveryRule(ParserRuleContext ctx) {
      }
   
      @Override public void visitTerminal(TerminalNode node) {
      }
   
      @Override public void visitErrorNode(ErrorNode node) {
      }
   
   
      public static HashMap<String,String> output(){
         return hashmap;
      }
}
