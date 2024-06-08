package Outras_Resoluções;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class ex1_04 {

    public static void main(String[] args) throws IOException {
        
        HashMap<String, Integer> numbers = new HashMap<String, Integer>();
        File file = new File("bloco1/numbers.txt");
        Scanner sc = new Scanner(file);
        String line;
        String[] data;

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            data = line.split("\\s");
            numbers.put(data[2], Integer.parseInt(data[0]));
        }
        sc.close();


        String userInput;
        Scanner input = new Scanner(System.in);
        
        userInput = input.nextLine();
        for (String s : userInput.split("\\s")) {
            if (numbers.containsKey(s))
                System.out.printf("%s ", numbers.get(s));
            else
                System.out.printf("%s ", s);
        }
        

        input.close();



    }
    
}
