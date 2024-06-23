package Algoritmia_Programacao.FichaPratica_03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int inicio = input.nextInt();

        System.out.println("Insira um número: ");
        int limite = input.nextInt();

        while(inicio <= limite){

            if (inicio % 5 == 0) {
                System.out.println("Múltiplos de 5: " + inicio);
            }
            inicio++;
        }
    }
}
