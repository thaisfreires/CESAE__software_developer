package FichaPratica_03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int limite = input.nextInt();
        int count = 0;
        int numAnterior, numAtual = 0;
        int crescente = 1; // crescente == true

        System.out.print("Insira um número: ");
        numAnterior = input.nextInt();
        count++;


        while (count < limite) {
            System.out.print("Insira um número: ");
            numAtual = input.nextInt();
            count++;
            numAnterior=numAtual;

            if (numAnterior >= numAtual) {
                crescente = 0;
            }
        }

            System.out.println("--Não Crescente");
        }
        if (numAnterior < numAtual) {

            System.out.println("--Crescente");
        } else {
            System.out.println();
        }*/


    }
}
