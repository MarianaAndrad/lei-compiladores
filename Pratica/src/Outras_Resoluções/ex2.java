package Outras_Resoluções;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class ex2 {

    private static HashMap<String, Double> vars;

    public static void main(String[] args) throws FileNotFoundException {
        
        vars = new HashMap<String, Double>();
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            //System.out.println(input.nextLine());
            Double result = processExpression(input.nextLine());
            System.out.print("Result: " + (result == Float.POSITIVE_INFINITY ? "Erro" : result) + "\n");
        }
        input.close();
    }


    private static Double processExpression(String s) {

        String[] contents = s.split("\\s+");
        //System.out.print("Lenght: " + contents.length + "\n");
        if(contents.length >= 3 && contents[1].compareTo("=") == 0) {
            
            //System.out.print("Lenght: " + contents.length + "\n");
            String tot = "";
            for (int i = 2; i < contents.length; i++) {
                //System.out.printf("TOT: ", tot + "\n");
                tot = tot.concat(contents[i] + " ");
            }

            Double assignValue;
            if(tot.matches("[+-]?([0-9]*[.])?[0-9]+\\s*")) {
                assignValue = Double.parseDouble(contents[2]);
                vars.put(contents[0], assignValue);
            } else if( vars.get(tot.strip()) != null) {
                assignValue = vars.get(tot.strip());
                vars.put(contents[0], assignValue);
            } else {
                assignValue = processExpression(tot);
                vars.put(contents[0], assignValue);
            }
            return assignValue;

        } else {
            Double r = makeCalculation(s);
            //System.out.print("R: " + r + "\n");
            return r;
        }
    }

    private static Double makeCalculation(String s) {
        
        String[] contents = s.split("\\s+");
        Double op1, op2;
        if(contents[0].matches("[+-]?([0-9]*[.])?[0-9]+")) {
            op1 = Double.parseDouble(contents[0]);
        } else {
            if(vars.get(contents[0]) == null) {
                return Double.POSITIVE_INFINITY;
            }
            op1 = vars.get(contents[0]);
        } 
        if(contents[2].matches("[+-]?([0-9]*[.])?[0-9]+")) {
            op2 = Double.parseDouble(contents[2]);
        } else {
            if(vars.get(contents[2]) == null) {
                return Double.POSITIVE_INFINITY;
            }
            op2 = vars.get(contents[2]);
        } 
        char operand = contents[1].charAt(0);
        switch (operand) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                return op1 / op2;
            default:
                System.err.println("Erro!");
                return Double.POSITIVE_INFINITY;
        }
    }
}
