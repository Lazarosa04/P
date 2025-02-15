
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class b1_3 {
    public static void main(String[] args) throws IOException {

        Stack<Double> stack = new Stack<>();
        Double op1;
        Double op2;
        Boolean error = false;

        try (Scanner scan = new Scanner(System.in)) {
            //read in the line from stdin, if it's empty, then break out OR process it
            while (scan.hasNextLine()){ 
                String line = scan.nextLine();
                if(line.trim().isEmpty()){
                    break;
                }
            
                if (isNumeric(line)){
                    stack.add(Double.valueOf(line));
                    
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
                        case "+" -> {
                            Double resultPlus = op1+op2;
                            stack.add(resultPlus);
                        }
    
                        case "*" -> {
                            Double resultTimes = op1*op2;
                            stack.add(resultTimes);
                        }
            
                        case "-" -> {
                            Double resultMinus = op1-op2;
                            stack.add(resultMinus);
                        }
            
                        case "/" -> {
                            Double resultDivision = op1/op2;
                            stack.add(resultDivision);
                        }
                    
                        default -> {
                            System.err.println("No such operator!");
                            error = true;
                        }
                    }
                }
                if (error){break;}
                System.out.println(stack.toString());
            }
        }
    }

    public static boolean isNumeric(String str) { 
        try {  
          Double.valueOf(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
}
