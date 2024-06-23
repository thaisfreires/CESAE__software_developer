package Algoritmia_Programacao.FichaPratica_02;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        //Import Scanner
        Scanner input = new Scanner(System.in);

        //Declarar e ler variaveis
        int num1, num2, num3;
        System.out.print("Enter First Number: ");
        num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = input.nextInt();
        System.out.print("Enter Third Number: ");
        num3 = input.nextInt();

        //Definir maior número

        if (num1 < num2 && num1 < num3) {
            System.out.println("The smallest number is " + num1);
        }
        if (num2 < num1 && num2 < num3) {
            System.out.println("The smallest number is " + num2);
        }
        if (num3 < num1 && num3 < num2) {
            System.out.println("The smallest number is " + num3);
        }


    }
}
