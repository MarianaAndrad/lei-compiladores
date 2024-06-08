package Outras_Resoluções;

import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;

public class ex1_05 {

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

        Scanner input = new Scanner(System.in);
        String[] words;
        String userInput;
        System.out.println("Insert number: ");
        userInput = input.nextLine();
        words = userInput.split("\\s");

        for (int i=words.length-1; i>=0; i--) {

            if (words[i].split("-").length == 1) {



            }
            else {

            }

        }





        input.close();

    }
    
}
