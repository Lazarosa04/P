import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class b1_5 extends b1_4 {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap = fileReader("P1\\\\p1\\\\lib\\\\numbers.txt");
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        String text = scan.nextLine();       // input
        String[] elements = text.split("[,\\s\\.\\-\\+\\*\\^\\/\\!]");   // tenta separar tudo para evitar casos como o twenty-four

        int result = 0;
        int currentNumber = 0;
        boolean hasValidNumber = false;
        ArrayList<Integer> results = new ArrayList<>();

        for (String element : elements) {
            if (hashmap.containsKey(element)) {
                hasValidNumber = true;
                int value = Integer.parseInt(hashmap.get(element));
                if (value == 100 || value == 1000 || value == 1000000) {
                    currentNumber *= value;
                } else {
                    currentNumber += value;
                }

                if (value == 1000 || value == 1000000) {
                    result += currentNumber;
                    currentNumber = 0;
                }
            } else if (hasValidNumber) {
                result += currentNumber;
                results.add(result);
                result = 0;
                currentNumber = 0;
                hasValidNumber = false;
            }
        }

        if (hasValidNumber) {
            result += currentNumber;
            results.add(result);
        }

        scan.close();
        System.out.println(results);
    }
}