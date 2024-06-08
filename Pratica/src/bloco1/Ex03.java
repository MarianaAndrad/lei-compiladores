package bloco1;

import java.util.Scanner;
import java.util.Stack;

public class Ex03 {
    public static void main(String[] args) {

        System.out.println("Write your opeartions, giving always the operands before the operators!");
        
        String line;
        Scanner input = new Scanner(System.in); //Lê input do utilizador

        //Enquanto houver input's do utilizador
        while (input.hasNextLine())
        {
            line = input.nextLine();
            processLine(line); //funçao para o processamento da inha
        }
        input.close();
    }

    public static void processLine(String line){
        Stack<Double> stack = new Stack<Double>(); //guardar tokens
        Scanner sc = new Scanner(line);
        String currentData;
        double result = 0;
        double n1=0, n2=0;

        //enquanto houver tokens
        while (sc.hasNext()) {
            currentData = sc.next();

            //se for numero colocamos na stack
            if (Character.isDigit(currentData.charAt(0))) {
                stack.push(Double.parseDouble(currentData));
                // Imprime stack
				System.out.println("Stack: " + stack);
            }
            else if(stack.size()< 2) {
                System.err.printf("ERROR! You can only use an operator when already given two operands (you have only given %d).\n", stack.size());
                System.exit(0);
            }else{ //se for um operador

                //retiramos da stack os dois ultimos numeros colocados para efetuar a operaçao
                n2 = stack.pop();
                n1 = stack.pop(); 

                switch (currentData) {
                    //calculo da operaçao e colocamos na stack
                    case "+":
                        result = n1 + n2;
                        stack.push(result);
                        break;

                    case "-":
                        result = n1 - n2;                        
                        stack.push(result);
                        break;
                    
                    case "*":
                        result = n1 * n2;
                        stack.push(result);
                        break;
                    
                    case "/":
                        result = n1 / n2;
                        stack.push(result);
                        break;
                    
                    default:
                        System.out.println("Invalid operator");
                        System.exit(0);
                }
                // Imprime stack
				System.out.println("Stack: " + stack);
            }
        }
        if(stack.size()==1){
            System.out.printf("The result is %f\n", stack.get(0));
        }

        sc.close();
    }
}