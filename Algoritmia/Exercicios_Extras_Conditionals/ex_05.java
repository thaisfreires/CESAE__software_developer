package Exercicios_Extras;

import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("----Adivinhe o número (1 - 100) -----");
        num = input.nextInt();


        if (num > 8) {
            System.out.println("Muito alto! ");
            System.out.println("-----Adivinhe o número (1 - 100) -----");
            num = input.nextInt();
                if (num > 8) {
                System.out.println("Muito alto! ");
                }
        }
        if (num < 8) {
            System.out.println("Muito baixo!");
            System.out.println("----Adivinhe o número (1 - 100) -----");
            num = input.nextInt();
                if (num < 8) {
                    System.out.print("Muito baixo! ");
                }
        }
            if (num != 8){
                System.out.println("Ficaste sem tentativas...");
            }

        if (num == 8) {
            System.out.println("****Boa! Ganhaste o jogo!****");
        }
    }
}

