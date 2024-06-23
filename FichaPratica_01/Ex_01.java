package FichaPratica_01;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        //Import Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int num1, num2, soma;

        //Ler num1
        System.out.println("Insira um numero: ");
        num1 = input.nextInt();

        //Ler num2
        System.out.println("Insira um numero: ");
        num2 = input.nextInt();

        //Somar
        soma = num1 + num2;

        //Apresentar resultado
        System.out.println("Soma: " + soma);


    }


}

