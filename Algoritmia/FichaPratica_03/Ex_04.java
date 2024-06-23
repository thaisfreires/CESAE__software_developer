package Algoritmia_Programacao.FichaPratica_03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduza um número: ");
        int limite = input.nextInt();
        int count = 0;

        //ler numeros inteiros e imprimir de 0 ate esse numero
        while (count < limite){
            System.out.println(count);
            count++; //count = count + 1
        }
    }
}
