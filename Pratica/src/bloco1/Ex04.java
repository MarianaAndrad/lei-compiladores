package bloco1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) throws FileNotFoundException {
        Map<String , Integer> numbers  = new HashMap<String, Integer>(); 
        File file = new File("bloco1/numbers.txt");
        Scanner sc = new Scanner(file);

        /*Ler os dados dos ficheiro
        Formato do ficheiro: valor_numero - nome_numero */
        while (sc.hasNextLine()) {
            String[] lineContent = sc.nextLine().split("\\s+");
            numbers.put(lineContent[2], Integer.parseInt(lineContent[0]));
        }
        sc.close();
        
        //ler o que user colocou no terminal
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque a lista de números por extenso: ");
        while (input.hasNextLine()) {
            String[] lineWords = input.nextLine().split("\\s+");
            System.out.printf("A list of numbers: ");
            for (int i = 0; i < lineWords.length; i++) {
                if (numbers.containsKey(lineWords[i])) {
                    System.out.printf(numbers.get(lineWords[i]) + " ");
                } else {    
                    System.out.printf(lineWords[i] + " "); //quando nao existe no ficheiro dado, imprime a propria string dada
                }
            }
            System.out.printf("\n");
        }
        input.close();
        
    }


    
}
