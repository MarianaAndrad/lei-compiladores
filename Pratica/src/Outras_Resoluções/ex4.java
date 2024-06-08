package Outras_Resoluções;
import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;

public class ex4 {

    private static HashMap<String, String> numbers2words;

    public static void main(String[] args) {
        
        try {

            File numbersFile = new File("aula01/bloco1/numbers.txt"); 
            numbers2words = new HashMap<String, String>();
            Scanner filerReader = new Scanner(numbersFile);
            while (filerReader.hasNextLine()) {
                String[] lineContent = filerReader.nextLine().split("\\s+");
                numbers2words.put(lineContent[2], lineContent[0]);
            }
            filerReader.close();

            Scanner input = new Scanner(System.in);
            while (input.hasNextLine()) {
                String[] lineWords = input.nextLine().split("\\s+");
                System.out.printf("# ");
                for (int i = 0; i < lineWords.length; i++) {
                    if (numbers2words.containsKey(lineWords[i])) {
                        System.out.printf(numbers2words.get(lineWords[i]) + " ");
                    } else {    
                        System.out.printf(lineWords[i] + " ");
                    }
                }
                System.out.printf("\n");
            }
            input.close();

        } catch(FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
