package Outras_Resoluções;

import java.util.Scanner;
import java.util.Stack;

public class ex3 {
    
    private static Stack<Double> stack;

    public static void main(String[] args) {
        
        stack = new Stack<Double>();
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            //System.out.println(input.nextLine());
            Double result = processExpression(input.nextLine());
            System.out.print("Result: " + (result == Double.POSITIVE_INFINITY ? "Erro" : result) + "\n");
        }
        input.close();
    }

    private static Double processExpression(String s) {
        
        String[] contents = s.split("\\s+");
        int index = 0;
        while (index < contents.length) {

            //matches a number
            if (contents[index].matches("[+-]?([0-9]*[.])?[0-9]+")) {
                stack.push(Double.parseDouble(contents[index]));
            // matches an operand
            } else if (contents[index].matches("^([+]|[*]|[-]|[/])$")) {
                if(stack.empty()) {
                    System.err.println("Erro: Expressão inválida");
                    return Double.NEGATIVE_INFINITY;
                }
                Double op2 = stack.pop();
                if(stack.empty()) {
                    System.err.println("Erro: Expressão inválida");
                    return Double.NEGATIVE_INFINITY;
                }
                Double op1 = stack.pop();
                switch (contents[index]) {
                    case "+":
                        stack.push(op1 + op2);
                        break;
                    case "-":
                        stack.push(op1 - op2);
                        break;
                    case "*":
                        stack.push(op1 * op2);
                        break;
                    case "/":
                        stack.push(op1 / op2);
                        break;
                }
            } else {
                System.err.println("Erro: Expressão inválida");
                return Double.NEGATIVE_INFINITY;
            }
            index++;
        }
        return stack.pop();
    }
}
