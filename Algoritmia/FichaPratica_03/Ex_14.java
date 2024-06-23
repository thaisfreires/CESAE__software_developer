package Algoritmia_Programacao.FichaPratica_03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int limite, count = 0, numAtual, numAnterior;
        boolean crescente = true;

        System.out.print("Quantos números deseja inserir? ");
        limite = input.nextInt();

        System.out.print("Insira um número: ");
        numAnterior = input.nextInt();
        count++;

        while (count < limite) {
            System.out.print("Insira um número: ");
            numAtual = input.nextInt();
            count++;
            numAnterior=numAtual;

            if (numAnterior >= numAtual) {
                crescente = false;
            }

        }
        if (crescente) {
            System.out.println("--Crescente");
        } else {
            System.out.println("--Não Crescente");
        }
    }
}
