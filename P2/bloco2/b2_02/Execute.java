@SuppressWarnings("CheckReturnValue")
public class Execute extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      Double result = visit(ctx.expr());
      if (result != null) {
         System.out.println("Resultado: " + result);
      }
      return result;
   }

   @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.Number().getText());
   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      // obter os valores
      Double resutl = null;
      Double left = visit(ctx.expr(0));
      Double right = visit(ctx.expr(1));
      String op = ctx.op.getText();

      // o que fazer com eles
      if (left != null && right != null) {
         switch (op) {
            case "*":
               resutl = left * right;
               break;
            case "/":
               if (right == 0) {
                  System.out.println("Err: Divisão por 0");
                  resutl = 0.0;
               }
               resutl = left/right;
               break;
            case "+":
               resutl = left+right;
               break;
            case "-":
               resutl = left - right;
               break;
            default:
               System.out.println("Err: Operador desconhecido");
               break;
         }
      }
      return resutl;
   }
}
