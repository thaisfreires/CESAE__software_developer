package Algoritmia_Programacao.FichaPratica_01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio, area, pi = 3.14;

        System.out.println("Para calcular o valor da área, insira o raio: ");
        raio = input.nextDouble();
        area = pi * raio * raio;;
        System.out.println("O valor da área é: " + area);



    }
}
