
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b1_1 {
    public static void main(String[] args) throws IOException {
    
        // Enter data using BufferReader
        BufferedReader r = new BufferedReader(
            new InputStreamReader(System.in));

        // Reading data using readLine
        String line = r.readLine();

        String[] values = line.split(" ");
        Double d1 = Double.valueOf(values[0]);
        Double d2 = Double.valueOf(values[2]);
        String op = values[1];
        
        switch (op) {
            case "+":
                Double resultPlus = d1 + d2;
                System.out.println(String.valueOf(resultPlus));
                break;

            case "-":
                Double resultMinus = d1 - d2;
                System.out.println(String.valueOf(resultMinus));
                break;

            case "*":
                Double resultTimes = d1 * d2;
                System.out.println(String.valueOf(resultTimes));
                break;

            case "/":
                Double resultDivision = d1/d2;
                System.out.println(String.valueOf(resultDivision));
                break;
        
            default:
                break;
        }
    }
}
