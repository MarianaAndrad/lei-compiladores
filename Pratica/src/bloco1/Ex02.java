package bloco1;
import java.util.Map;
import java.util.HashMap;

import java.util.Scanner;

public class Ex02 {
    
    //Global variables
    static HashMap<String, Double> vars;

    public static void main(String[] args) {
        //permite guardar as variaveis com o seu valor
        vars = new HashMap<String,Double>();
        
        Scanner input = new Scanner(System.in);

        //vamos buscar o que o utilizador colocar no input
        while (input.hasNextLine()) {

            Scanner sc2 = new Scanner(input.nextLine());
            processLine(sc2);
            sc2.close();

        }
        input.close();
    }

    //funçao que trata do processamento da linha, ou seja, do input do utilizador
    public static void processLine(Scanner sc){

        Double n1, n2, result;
        char op = '\0';
        String opread, varname;
        n1 = n2 = null;

        //no caso de a primeira palavra for um número
        if(sc.hasNextDouble()){
            result=processExpression(sc, vars);
            System.out.printf("\tresult = %f\n", result);
        }else{// no caso da primeira palavra for uma string
            varname = sc.next();

            //verificação que pode ser uma variavel, ou seja, 
            //começar numa letra ou "_" 
            if (varname.charAt(0) >= 'A' & varname.charAt(0) <= 'Z' || 
                varname.charAt(0) >= 'a' & varname.charAt(0) <= 'z' || 
                varname.charAt(0) == '_'){

                    if (!sc.hasNext()){
                         System.out.printf("\tresult = %f\n", getVarValue(vars, varname));
                    }else{ // caso contrario so pode ser valido os operadores, e o "="
                        opread = sc.next();
                        op=opread.charAt(0);

                        //validação do operadores
                        if (opread.length()!=1 ||  "+ - * / =".indexOf(opread) < 0){
                            System.err.printf("ERROR! %s\n", "After a variable name the only valid inputs are EOF, = or an operator!");
                            System.exit(0);
                        }else{
                            if(op == '='){
                                result = processExpression(sc,vars);
                                vars.put(varname, result);
                            }else{
                                op = getOp(opread);

                                n1 = getVarValue(vars, varname);
                                //no caso de vir um número
                                if(sc.hasNextDouble()){
                                    n2 = sc.nextDouble();
                                }else{ //caso seja outra variavel
                                     varname = sc.next();

                                    //validação da variavel 
                                    if (!(varname.charAt(0) >= 'A' & varname.charAt(0) <= 'Z' ||
                                        varname.charAt(0) >= 'a' & varname.charAt(0) <= 'z' || 
                                        varname.charAt(0) == '_')) {

                                        System.err.printf("ERROR! %s\n", "A varible name must start with a letter or an ubderscore ('_')!");
                                        System.exit(0);
                                    }
                                    n2 = getVarValue(vars, varname);
                                }
                                result = computeResult(n1, op, n2);
                            System.out.printf("\tresult = %f\n", result);
                            }
                        }
                    }
                }else{ //no caso de a variavel nao ser correta
                    System.err.printf("ERROR! %s\n", "A varible name must start with a letter or an ubderscore ('_')!");
                    System.exit(0);
                }
        }
    }


    //funçao de processamento da expressao
     static Double processExpression(Scanner sc, Map<String, Double> vars){
        Double n1, n2, result;
        char op = '\0';
        String opread, varname;
        
        n1 = n2 = result = null;

        //primeiro operador ser um numero 
        if(sc.hasNextDouble()){
            n1 = sc.nextDouble();
        }else{ //primeiro operador ser uma string
            varname = sc.next();

            //validaçao da variavel
            if (!(varname.charAt(0) >= 'A' & varname.charAt(0) <= 'Z' || 
                varname.charAt(0) >= 'a' & varname.charAt(0) <= 'z' || 
                varname.charAt(0) == '_')) {

                System.err.printf("ERROR at '%s'! %s\n", varname,  "A varible name must start with a letter or an underscore ('_')!");
                System.exit(0);
            }
                
            n1 = getVarValue(vars, varname);
        }

        if (!sc.hasNext()) { // Get first number
            result = n1;
        } else {

            // Get operation
            //verificação que nao se trata de um número 
            if (sc.hasNextDouble()) {
                System.err.printf("ERROR! %s\n",
                        "After a number the only valid scenarius are an EOF or an operation! (Not a number)");
                System.exit(0);
            }
            opread = sc.next();
            op = getOp(opread);

            // Get second number
            if(sc.hasNextDouble()){
                n2 = sc.nextDouble();
            }else{
                varname = sc.next();
                //validaçao da variavel
                if (!(varname.charAt(0) >= 'A' & varname.charAt(0) <= 'Z' || varname.charAt(0) >= 'a' & varname.charAt(0) <= 'z' || varname.charAt(0) == '_')) {
                    System.err.printf("ERROR at '%s'! %s\n", varname,  "A varible name must start with a letter or an underscore ('_')!");
                    System.exit(0);
                }else
                    
                n2 = getVarValue(vars, varname);
            }

            result = computeResult(n1, op, n2);
        }

        return result;
    }



    //funçao que vai buscar o valor de uma variavel
     static Double getVarValue(Map<String, Double> vars, String key) {
        //verificação que a variavel esta no dicionario criado
        if (vars.containsKey(key)) {
            System.out.print("ola");
            //caso afirmativo devolvemos o seu valor
            return vars.get(key);
        }

        System.err.printf("ERROR! %s\n", "The variable '" + key + "' hasn't been defined yet!");
        System.exit(0);
        //caso contrario retornamos null
        return null;
    } 

    //funçao que vai buscar o operador
    static char getOp(String opread){
        //validação do operador
        if (opread.length() != 1 || "+ - * /".indexOf(opread) < 0) {
            System.err.printf("ERROR! %s\n",
                    "\"" + opread + "\" is an invalid operator! The supported are: + - * /");
            System.exit(0);
        }

        //caso seja valido retorna o operador 
        return opread.charAt(0);
    }

    //funçao que é responsavel pelo calculo do resultado
    static Double computeResult(Double n1, char op, Double n2){
        switch (op) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '/':
                return n1 / n2;
            case '*':
                return n1 * n2;
        }
        return -1.0;
    }
}

