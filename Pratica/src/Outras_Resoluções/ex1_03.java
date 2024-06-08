package Outras_Resoluções;
import java.util.Scanner;
import java.util.Stack;

public class ex1_03 {

    public static void main(String[] args) {
        
        String line;
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine())
        {
            line = input.nextLine();
            processLine(line);
        }
        input.close();


    }

    public static void processLine(String line) {
        Stack<Double> stack = new Stack<Double>();
        Scanner sc = new Scanner(line);
        String currentData;
        double result = 0;
        double n1=0, n2=0;

        while (sc.hasNext()) {
            currentData = sc.next();

            if (Character.isDigit(currentData.charAt(0))) {
                stack.push(Double.parseDouble(currentData));
            }
            else {
                n2 = stack.pop();
                n1 = stack.pop();

                switch (currentData) {
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
            }
        }

        System.out.println(result);
        sc.close();
    }
}
