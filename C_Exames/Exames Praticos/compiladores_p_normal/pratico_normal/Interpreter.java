import java.util.*;
import org.antlr.v4.runtime.tree.*;
public class Interpreter extends VectorBaseVisitor<String> {

   @Override public String visitDec(VectorParser.DecContext ctx) {
      String res = visit(ctx.expr());

      if (res != null) {
         String id = ctx.Identifier().getText();
         simbolTable.put(id, res);
      }

      return res;
   }

   @Override public String visitShow(VectorParser.ShowContext ctx) {
      String res = visit(ctx.expr());
      if (res != null) {
         System.out.println(res);
      }
      return res;
   }

   @Override public String visitIntProd(VectorParser.IntProdContext ctx) {
      String res = null;
      String e1 = visit(ctx.expr(0));
      String e2 = visit(ctx.expr(1));

      if (e1 != null && e2 != null) {
         if (!e1.contains("[") && !e2.contains("[")) 
            System.err.println("Invalid format: internal product");
         else {
            String [] v1 = e1.replace("[", "").replace("]", "").split(",");
            String [] v2 = e2.replace("[", "").replace("]", "").split(",");
            if (v1.length != v2.length) 
               System.err.println("Invalid args: internal product");
                
            else {
               Float result [] = new Float [v1.length];
               for (int i = 0; i < v1.length; i++) {
                  Float aux1 = Float.parseFloat(v1[i]);
                  Float aux2 = Float.parseFloat(v2[i]);
                  result[i] = aux1*aux2;                  
               }
               Float r = Float.parseFloat("0");
               for (int i = 0; i < result.length; i++) {
                  r += result[i];
               }
               res = String.valueOf(r);
            }
         }
      }
      return res;
   }

   @Override public String visitIdentifier(VectorParser.IdentifierContext ctx) {
      String res = null;
      String id = ctx.Identifier().getText();

      if (!simbolTable.containsKey(id)) 
         System.err.println("Var \"" + id + "\" not declared");
      else 
         res = simbolTable.get(id);
      
      return res;
   }

   @Override public String visitNumber(VectorParser.NumberContext ctx) {
      Float f = Float.parseFloat(ctx.Number().getText());
      return String.valueOf(f);
   }

   @Override public String visitMult(VectorParser.MultContext ctx) {
      String res = null;
      String e1 = visit(ctx.expr(0));
      String e2 = visit(ctx.expr(1));

      if (e1 != null && e2 != null) {
         if ((!e1.contains("[") && e2.contains("[")) || (e1.contains("[") && !e2.contains("["))) {
            res = "[";
            if (e1.contains("[")) {
               String [] v1 = e1.replace("[", "").replace("]", "").split(",");
               for (int i = 0; i < v1.length; i++) {
                  Float aux = Float.parseFloat(v1[i])*Float.parseFloat(e2);
                  res += String.valueOf(aux) + ",";
               }
            }
            else {
               String [] v2 = e2.replace("[", "").replace("]", "").split(",");
               for (int i = 0; i < v2.length; i++) {
                  Float aux = Float.parseFloat(v2[i])*Float.parseFloat(e1);
                  res += String.valueOf(aux) + ",";
               }
            }
            res = res.substring(0, res.length()-1) + "]";
         }
         else if (!e1.contains("[") && !e2.contains("[")) {
            Float aux1 = Float.parseFloat(e1);
            Float aux2 = Float.parseFloat(e2);
            res = String.valueOf(aux1*aux2);
         }
         else 
            System.err.println("Invalid format: multiplication");
      }
      return res;
   }

   @Override public String visitAddSub(VectorParser.AddSubContext ctx) {
      String res = null;
      String e1 = visit(ctx.expr(0));
      String e2 = visit(ctx.expr(1));

      if (e1 != null && e2 != null) {
         String op = ctx.op.getText();
         if (e1.contains("[") && e2.contains("[")) {
            String [] v1 = e1.replace("[", "").replace("]", "").split(",");
            String [] v2 = e2.replace("[", "").replace("]", "").split(",");
            if (v1.length != v2.length) 
               System.err.println("Invalid args: add/sub");
                
            else {
               res = "[";
               for (int i = 0; i < v1.length; i++) {
                  Float aux1 = Float.parseFloat(v1[i]);
                  Float aux2 = Float.parseFloat(v2[i]);
                  Float result = null;
                  if (op.equals("+")) 
                     result = aux1 + aux2;
                  else
                     result = aux1 - aux2;
                  res += result + ",";
               }
               res = res.substring(0, res.length()-1) + "]";
            }

         }
         else if (!e1.contains("[") && !e2.contains("[")) {
            Float aux1 = Float.parseFloat(e1);
            Float aux2 = Float.parseFloat(e2);
            Float result = null;
            if (op.equals("+"))
               result = aux1 + aux2;
            else
               result = aux1 - aux2;               
            res = String.valueOf(result);
         }
         else 
            System.err.println("Invalid format: add/sub");       
      }
      return res;
   }

   @Override public String visitVector(VectorParser.VectorContext ctx) {
      String res = "["; 
      Iterator<TerminalNode> iter = ctx.Number().iterator();
      while (iter.hasNext()) 
         res += iter.next().getText() + ",";
      
      return res.substring(0, res.length()-1) + "]";
      
   }

   @Override public String visitUnary(VectorParser.UnaryContext ctx) {
      String res = visit(ctx.expr());

      if (res != null) {
         String op = ctx.signal.getText();
         if (res.contains("[")) {
            String [] num = res.replace("[", "").replace("]", "").split(",");
            res = "[";
            for (int i=0; i < num.length; i++){
               Float aux = Float.parseFloat(num[i]);
               Float result = null;
               if (op.equals("+")) 
                  result = +aux;
               else
                  result = -aux;
               res += String.valueOf(result) + ",";
            }
            res = res.substring(0, res.length()-1) + "]";
         }
         else {
            Float aux = Float.parseFloat(res);
            Float result = null;
            if (op.equals("+"))
               result = +aux;
            else 
               result = -aux;
               
            res = String.valueOf(result);
         }     
      }
      return res;
   }

   @Override public String visitParen(VectorParser.ParenContext ctx) {
      return visit(ctx.expr());
   }

   private HashMap <String, String> simbolTable = new HashMap<>();
}
