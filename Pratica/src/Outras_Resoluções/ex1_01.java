package Outras_Resoluções;
import java.util.Scanner;

public class ex1_01 {
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

        double result = 0;
        String[] data = new String[3];
        int idx = 0;
        Scanner sc = new Scanner(line);
        
        while (sc.hasNext())
        {
            data[idx] = sc.next();
            idx++;
        }

        switch(data[1]) {
            case "+":
                result = Double.parseDouble(data[0]) + Double.parseDouble(data[2]);
              break;
            case "-":
                result = Double.parseDouble(data[0]) - Double.parseDouble(data[2]);
              break;
            case "*":
                result = Double.parseDouble(data[0]) * Double.parseDouble(data[2]);
                break;
            case "/":
                result = Double.parseDouble(data[0]) / Double.parseDouble(data[2]);
                break;
            default:
                System.out.println("Invalid operator");
          }      
          
          System.out.printf("%.2f\n", result);
          sc.close();
    }

    
}
