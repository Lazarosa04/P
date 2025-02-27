@SuppressWarnings("CheckReturnValue")
public class Calculadora extends SuffixCalculatorBaseVisitor<String> {

   @Override public String visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStat(SuffixCalculatorParser.StatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
}
