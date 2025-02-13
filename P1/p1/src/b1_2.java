
import java.io.IOException;
import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;


public class b1_2 {
    public static void main(String[] args) throws IOException {

        Dictionary<String, Double> dic = new Hashtable<>();
    
        Scanner scan = new Scanner(System.in);
        //read in the line from stdin, if it's empty, then break out OR process it
        while (scan.hasNextLine()){ 
            String line = scan.nextLine();
            String [] elements = line.split(" ");

        }
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
