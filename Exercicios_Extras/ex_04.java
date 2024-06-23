package Exercicios_Extras;

import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma letra do alfabeto (somente minúsculo): ");
        String letra = input.next();

        switch (letra){
            case "a":
                System.out.println("-- Vogal --");
                break;
            case "e":
                System.out.println("-- Vogal --");
                break;
            case "i":
                System.out.println("-- Vogal --");
                break;
            case "o":
                System.out.println("-- Vogal --");
                break;
            case "u":
                System.out.println("-- Vogal --");
                break;
            default:
                    System.out.println("-- Consoante --");

        }




    }
}
