import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class b1_6{
    public static void main(String[] args) {
        HashMap<String, String> tradutorPT_EN = new HashMap<String, String>();
        tradutorPT_EN = fileReader("P1\\\\p1\\\\lib\\\\dic1.txt");
        HashMap<String, String> complicometro = new HashMap<String, String>();
        complicometro = fileReader("P1\\\\p1\\\\lib\\\\dic2.txt");
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        String text = scan.nextLine();       // input
        String[] elements = text.split(" ");   // Considera-se “palavra” qualquer sequˆencia de caracteres delimitada por espaços.

        //tradução para inglês
        for(String s : elements){
            if(tradutorPT_EN.containsKey(s.trim())){
                System.out.print(tradutorPT_EN.get(s) + " ");
            }else{
                System.out.print(s + " ");
            }
        }

        System.out.println();//

        //tradução para complicometro      
        boolean hasChanges;
        do {
            hasChanges = false;
            StringBuilder newElements = new StringBuilder();
            for (String s : elements) {
                if (complicometro.containsKey(s.trim())) {
                    newElements.append(complicometro.get(s)).append(" ");
                    hasChanges = true;
                } else {
                    newElements.append(s).append(" ");
                }
            }
            elements = newElements.toString().trim().split(" ");
        } while (hasChanges);

        for (String s : elements) {
            System.out.print(s + " ");
        }
        System.out.println();

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
                String[] content = s.split(" ", 2);
                hashmap.put(content[0], content[1]);
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
