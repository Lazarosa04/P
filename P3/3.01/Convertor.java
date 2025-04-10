import org.stringtemplate.v4.*;



@SuppressWarnings("CheckReturnValue")
public class Convertor extends csvBaseVisitor<ST> {

   
   private STGroup template = STGroupFile("html.stg");
   private ST table = template.getInstanceOf("table");

   @Override public ST visitFile(csvParser.FileContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitHeader(csvParser.HeaderContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitRow(csvParser.RowContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitHvalue(csvParser.HvalueContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ST visitValue(csvParser.ValueContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      //return res;
   }
}
