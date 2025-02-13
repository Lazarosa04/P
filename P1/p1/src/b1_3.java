
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class b1_3 {
    public static void main(String[] args) throws IOException {

        Stack<Double> stack = new Stack<>();
        Double op1 = null;
        Double op2 = null;
        Boolean error = false;

        Scanner scan = new Scanner(System.in);
        //read in the line from stdin, if it's empty, then break out OR process it
        while (scan.hasNextLine()){ 
            String line = scan.nextLine();
            if(line.trim().isEmpty()){
                break;
            }
        
            if (isNumeric(line)){
                stack.add(Double.parseDouble(line));
                
            }
            else{
                if(stack.size()>=2){
                    op2 = stack.pop();
                    op1 = stack.pop();
                }
                else{
                    System.err.println("Not enough operands in stack.");
                    break;
                }
                switch (line) {
                    case "+":
                        Double resultPlus = op1+op2;
                        stack.add(resultPlus);
                        break;

                    case "*":
                        Double resultTimes = op1*op2;
                        stack.add(resultTimes);
                        break;
        
                    case "-":
                        Double resultMinus = op1-op2;
                        stack.add(resultMinus);
                        break;
        
                    case "/":
                        Double resultDivision = op1/op2;
                        stack.add(resultDivision);
                        break;
                
                    default:
                        System.err.println("No such operator!");
                        error = true;
                        break;
                }
            }
            if (error){break;}
            System.out.println(stack.toString());
        }
        scan.close();
    }

    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
}
