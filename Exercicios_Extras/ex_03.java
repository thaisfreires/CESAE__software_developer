package Exercicios_Extras;

import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor, desconto;

        System.out.print("Preço do produto: ");
        valor = input.nextDouble();

        if (valor > 100){
            desconto = valor - (valor * 0.10);
            System.out.println("Preço Final com 10% de desconto: " + desconto);
        }else{
            System.out.println("Preço Final: " + valor + " Sem desconto");
        }

    }
}
