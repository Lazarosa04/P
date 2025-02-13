
import java.io.File;        // file class
import java.io.FileNotFoundException;   // error handling
import java.util.Scanner;   // scanner class
import java.util.List;      // list class
import java.util.ArrayList; // array list class
import java.util.HashMap;

public class b1_4 {
    public static void main(String[] args){
        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap = fileReader("P1\\\\p1\\\\lib\\\\numbers.txt");
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        String text = scan.nextLine();       // input
        String[] elements = text.split("[,\\s\\.\\-\\+\\*\\^\\/\\!]");   // tenta separar tudo para evitar casos como o twenty-four
        for(String s : elements){
            if(hashmap.containsKey(s.trim())){
                System.out.print(hashmap.get(s) + " ");
            }
        }
        scan.close();
    }


    public static HashMap<String,String>  fileReader(String args){
        try{
            List<String> data = new ArrayList<>();
            HashMap<String, String> hashmap = new HashMap<String, String>();
            File ficheiro = new File(args); // input file
            Scanner scan = new Scanner(ficheiro, "UTF-8"); // scan input file
            while(scan.hasNextLine()){
                data.add(scan.nextLine());
            }
            scan.close();
            for(String s : data){
                String[] content = s.split(" ");
                hashmap.put(content[2],content[0]);
            }
            return hashmap;
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
            e.printStackTrace();
            return null;
        }
    }
}
