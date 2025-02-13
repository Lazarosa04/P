import java.util.Scanner;
import java.util.HashMap;

public class b1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        HashMap<String, Double> hashmap = new HashMap<String, Double>();

        while (sc.hasNextLine()){
            String a = sc.nextLine();       // input

            String[] elements = a.split(" ");   // separar elementos num array

            // Caso seja uma atribuição e dps do "=" ter uma expressão
            // Fazer a expressão a direita e igualar o resultado à variavel
            if (elements[1].equals("=")  && elements.length > 3){
                double temp = calculo(elements[2], elements[3], elements[4], hashmap);
                System.out.println(temp);
                hashmap.put(elements[0], temp);
            }
            // Caso seja uma atribuição, igualar o valor à direita à variavel
            else if (elements[1].equals("=")){
                double temp = Double.parseDouble(elements[2]);
                System.out.println(temp);
                hashmap.put(elements[0], temp);
            }
            // Não havendo atribuição, faz-se a expressão
            else if (!elements[1].equals("=")){
                System.out.println(calculo(elements[0], elements[1], elements[2], hashmap));
            }
            else{
                System.err.println("Invalid Operator");
            }
        }
    }

    public static double calculo(String op1, String operador, String op2, HashMap<String, Double> hashmap){
        if (hashmap.containsKey(op1)){
            op1 = hashmap.get(op1).toString();
        }
        if (hashmap.containsKey(op2)){
            op2 = hashmap.get(op2).toString();
        }

        double n = Double.parseDouble(op1);
        double  m = Double.parseDouble(op2);
        
        switch(operador) {
            case "+":
                return n + m;
            case "-":
                return n - m;
            case "*":
                return n * m;
            case "/":
                return n / m;
            default:
                System.err.println("Error: Operation failed");
            }
        return 0;
    
    }
      
}
