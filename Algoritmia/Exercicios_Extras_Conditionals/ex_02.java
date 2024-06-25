package Exercicios_Extras;

import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double num, pesoLua;
        //Ler peso
        System.out.print("Insira seu peso (em Kg): ");
        num = input.nextDouble();

        //calcular peso na lua
            if (num > 0) {
                pesoLua = num * 0.16;
                System.out.println("Peso na lua: " + pesoLua + " Kg");
            } else {
                System.out.println();
            }
    }

}
