package Algoritmia_Programacao.FichaPratica_02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        //Import Scanner
        Scanner input = new Scanner(System.in);

        //Declarar e ler variaveis

        int valor, notas;
        System.out.println("Valor: ");
        valor = input.nextInt();

        if (valor % 5 == 0) {


            //Notas de 200
            notas = valor / 200;
            System.out.println("Notas de 200: " + notas);

            //Atualizar valor
            valor = valor % 200;

            //Notas de 100
            notas = valor / 100;
            System.out.println("Notas de 100: " + notas);

            //Atualizar valor
            valor = notas % 100;

            //Notas de 50
            notas = valor / 50;
            System.out.println("Notas de 50: " + notas);

            //Atualizar valor
            valor = notas % 50;

            //Notas de 20
            notas = valor / 20;
            System.out.println("Notas de 20: " + notas);

            //Atualizar valor
            valor = notas % 20;

            //Notas de 10
            notas = valor / 10;
            System.out.println("Notas de 10: " + notas);

            //Atualizar valor
            valor = notas % 10;

            //Notas de 5
            notas = valor / 5;
            System.out.println("Notas de 5: " + notas);

            //Atualizar valor
            valor = notas % 5;

        } else {
            System.out.println("Valor Inválido!");
        }
    }
}
