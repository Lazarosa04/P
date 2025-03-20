@SuppressWarnings("CheckReturnValue")
public class Execute extends PreffixCalculatorBaseVisitor<Integer> {

   @Override public Integer visitProgram(PreffixCalculatorParser.ProgramContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitStat(PreffixCalculatorParser.StatContext ctx) {
      Integer res = visit(ctx.expr());
      if (res != null) {
         System.out.println("Resultado: " + res);
      }
      return res;
      //return res;
   }

   @Override public Integer visitExprPreffix(PreffixCalculatorParser.ExprPreffixContext ctx) {
      Integer res = null;
      Integer left = visit(ctx.expr(0));
      Integer right = visit(ctx.expr(1));
      String op = ctx.op.getText();
      if (left != null && right != null) {
         switch (op) {
            case "*":
               res = left * right;
               break;
            case "/":
               if (right == 0) {
                  System.out.println("Err: Divisão por 0");
                  res = 0;
               }
               res = left/right;
               break;
            case "+":
               res = left+right;
               break;
            case "-":
               res = left - right;
               break;
            default:
               System.out.println("Err: Operador desconhecido");
               break;
         }
      }
      return res;
      //return res;
   }

   @Override public Integer visitExprNumber(PreffixCalculatorParser.ExprNumberContext ctx) {
      return Integer.parseInt(ctx.Number().getText());
   }
}
