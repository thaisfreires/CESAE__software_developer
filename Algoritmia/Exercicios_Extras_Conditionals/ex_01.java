package Exercicios_Extras;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual a sua idade? ");
        int idade = input.nextInt();

        if (idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
