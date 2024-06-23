package FichaPratica_01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        // User input
        Scanner input = new Scanner(System.in);
        //variaveis
        int num1, num2, soma, sub, div, mult;

        System.out.println("Insira um numero: ");
        num1 = input.nextInt();

        System.out.println("Insira um numero: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        System.out.println("soma: " + soma);
        sub = num1 - num2;
        System.out.println("subtração: " + sub);
        mult = num1 * num2;
        System.out.println("multiplicação: " + mult);
        div = num1 / num2;
        System.out.println("divisão: " + div);

    }
}
