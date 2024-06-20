package FichaPratica_03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num = input.nextInt();
        int quantidade = 1;

        while (quantidade > 0) {
            System.out.print("Insira um número: ");
            num = input.nextInt();
            quantidade++;

            if (num > 0 && num < 25) {
                System.out.println("[00,25]: " + quantidade);
            }
            if (num > 26 && num < 50) {
                System.out.println("[26,50]: " + quantidade);
            }
            if (num > 51 && num < 75) {
                System.out.println("[51,75]: " + quantidade);
            }
            if (num > 76 && num < 100) {
                System.out.println("[76,100]: " + quantidade);
            }





        }
    }

}