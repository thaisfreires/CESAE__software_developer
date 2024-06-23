package Algoritmia_Programacao.FichaPratica_03;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, fatorial, antecessor;

        System.out.print("Digite um numero: ");
        num = input.nextInt();
        antecessor = num - 1;
        fatorial = num * antecessor;

        while (antecessor > 1) {

            antecessor--;
            fatorial = fatorial * antecessor;
        }
        if (antecessor >= 1) {
            System.out.println("Fatorial do número: " + fatorial);
        } else {
            System.out.println();
        }
        //Esse programa não está adaptado para o máximo do numero fatorial ser se 2 147 483 647
    }
}
