package Conditionals;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        //Import Scanner
        Scanner input = new Scanner(System.in);

        //Declarar e ler variaveis
        System.out.println("Insira um número: ");
        double num1 = input.nextDouble();
        System.out.println("Insira um número: ");
        double num2 = input.nextDouble();

        //Ler operação aritmética
        System.out.println("Operação desejada ( + - * / ): ");
        String operacao = input.next();
        double resultado;

        switch (operacao){

            case "+":
                resultado = num1 + num2;
                System.out.println(num1+ "+" +num2 +"=" +resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println(num1+ "-" +num2+ "=" +resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println(num1+ "*" +num2 +"=" +resultado);
                break;
            case "/":
                resultado = num1 / num2;
                System.out.println(num1+ "/" +num2 +"=" +resultado);
                break;

            default:
                System.out.println("Operação não reconhecida");
                break;

        }




    }
}
