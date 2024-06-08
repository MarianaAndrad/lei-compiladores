package Outras_Resoluções;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class ex1_02 {

    //Global variables
    static HashMap<String, Double> variables = new HashMap<String, Double>();

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
    

    public static void processLine(String line)
    {
        ArrayList<String> data = new ArrayList<String>();
        Scanner sc = new Scanner(line);
        double n1 = 0, n2 = 0;
        String operator = "";
        String current_data;
        String var = "";
        String aux;

        while (sc.hasNext()) {
            current_data = sc.next();
            if (!current_data.equals("="))
                data.add(current_data);
        }

        switch (data.size()) {

            // it means it is an assignment
            case 2:
                if (Character.isLetter(data.get(1).charAt(0))) {
                    if (variables.containsKey(data.get(1)))
                        variables.put(data.get(0), variables.get(data.get(1)));
                    else {
                        System.out.printf("Variable %s does not exit\n", data.get(1));
                        System.exit(0);
                    }
                }
                else
                    variables.put(data.get(0), Double.parseDouble(data.get(1)));

                sc.close();
                return;

            
            // it means it is an expression of type n1/var op n2/var
            case 3:
                
                for (int i=0; i<data.size(); i++) {
                    if (Character.isLetter(data.get(i).charAt(0))) {
                        if (variables.containsKey(data.get(i))) {
                            data.set(i, Double.toString(variables.get(data.get(i))));
                        }
                        else {
                            System.out.printf("Variable '%s' does not exit\n", data.get(i));
                            System.exit(0);
                        }
                    }
                }


                n1 = Double.parseDouble(data.get(0));
                n2 = Double.parseDouble(data.get(2));
                operator = data.get(1);
                break;

            case 4:
                var = data.get(0);
                for (int i=1; i<data.size(); i++) {

                    if (Character.isLetter(data.get(i).charAt(0))) {
                        if (variables.containsKey(data.get(i))) {
                            aux = Double.toString(variables.get(data.get(i)));
                            data.set(i, aux);
                        }
                        else {
                            System.out.printf("Variable '%s' does not exit\n", data.get(i));
                            System.exit(0);
                        }
                    }
                }
                n1 = Double.parseDouble(data.get(1));
                n2 = Double.parseDouble(data.get(3));
                operator = data.get(2);
                break;
            
            default:
                System.err.println("Invalid expression");
                System.exit(0);
        }


        //calculate the simple expression or new variables value
        double result = 0;

        switch(operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
            default:
                System.out.println("Invalid operator");
        }     

        if (var.length() == 0)
            System.out.printf("%.2f \n", result);
        else
            variables.put(var, result);
        
        sc.close();
    }

    
}
