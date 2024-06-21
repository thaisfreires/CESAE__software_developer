package FichaPratica_03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0, intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;

        while (num >= 0) {
            System.out.print("Insira um número: ");
            num = input.nextInt();


            if (num > 0 && num < 25) {
                intervalo1++;
            }
            if (num > 26 && num < 50) {
                intervalo2++;
            }
            if (num > 51 && num < 75) {
                intervalo3++;
            }
            if (num > 76 && num < 100) {
                intervalo4++;
            }
        }
            System.out.println("[00,25]: " + intervalo1);
            System.out.println("[26,50]: " + intervalo2);
            System.out.println("[51,75]: " + intervalo3);
            System.out.println("[76,100]: " + intervalo4);


    }
}