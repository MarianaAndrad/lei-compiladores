package bloco1;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
            System.out.println("Calculadora:");
            double n1,n2;
            char op;
            String opread;
            
            Scanner  sc = new Scanner(System.in);
            //Get first number
            if(!sc.hasNextDouble()){
                System.err.println("ERROR: First input must be a number! (decimals must be writen with commas, not points)");
                System.exit(0);
                
            }
            n1 = sc.nextDouble();

            //Get operation
            opread = sc.next().trim();
            if(opread.length()!=1 || "+ - * /".indexOf(opread)<0){
                System.err.println("ERROR: \""+opread+"\" is an invalid operator! The supported are: + - * /");
                System.exit(0);
               
            }
            op = opread.charAt(0);

            //Get second number
            if(!sc.hasNextDouble()){
                System.err.println("ERROR: Second input must be a number! (decimals must be writen with commas, not points)");
                System.exit(0);
                
            }
            n2 = sc.nextDouble();

            double result=0;
            switch(op){
                case '+':
                    result = n1+n2;
                    break;
                case '-':
                    result = n1-n2;
                    break;
                case '/':
                    result = n1/n2;
                    break;
                case '*':
                    result = n1*n2;
                    break;
                default:
                    System.err.println("ERROR: Selected Operation not valid");
                    System.exit(0);
                    
            }

            System.out.println(n1+" "+op+" "+n2+" = "+result);  
            sc.close();
        
    }
}