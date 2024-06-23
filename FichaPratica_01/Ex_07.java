package FichaPratica_01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double  preco1, preco2, preco3, soma, desconto;
        System.out.println("Insira o valor do produto: ");
        preco1 = input.nextInt();

        System.out.println("Insira o valor do produto: ");
        preco2 = input.nextInt();

        System.out.println("Insira o valor do produto: ");
        preco3 = input.nextInt();

        soma = preco1 + preco2 + preco3;
        desconto = soma - (soma * 0.10);
        System.out.println("Preço dos produtos com desconto: " + desconto);

    }
}
