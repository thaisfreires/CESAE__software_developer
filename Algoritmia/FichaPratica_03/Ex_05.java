package Algoritmia_Programacao.FichaPratica_03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x=0;

        //ler quantidade
        System.out.print("Quantidade: ");
        int quantidade = input.nextInt();

        //ler mensagem
        System.out.print("Mensagem: ");
        input.nextLine(); // Limpeza de buffer pra ler mais palavras
        String mensagem = input.nextLine();


        //imprimir mensagem e quantidade seguindo a sequencia de x
        while(x < quantidade){
            System.out.println(mensagem);
            x=x+1; // ou x++;
        }

    }
}
