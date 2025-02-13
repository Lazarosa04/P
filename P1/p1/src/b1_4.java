
import java.io.File;        // file class
import java.io.FileNotFoundException;   // error handling
import java.util.Scanner;   // scanner class
import java.util.List;      // list class
import java.util.ArrayList; // array list class

public class b1_4 {
    public static void readFile(String[] args){
        try{
            List<String> componentes = new ArrayList<>();
            File ficheiro = new File("bloco1/numbers.txt"); // input file
            Scanner myScanner = new Scanner(ficheiro, "UTF-8"); // scan input file
            while(myScanner.hasNextLine()){
                String data = myScanner.nextLine();
            }
            myScanner.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
