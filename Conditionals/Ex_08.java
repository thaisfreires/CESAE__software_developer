package Conditionals;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaPonderada = 0;

        System.out.println("Digite a nota 1: ");
        nota1 = input.nextDouble();

        System.out.println("Digite a nota 2: ");
        nota2 = input.nextDouble();

        System.out.println("Digite a nota 3: ");
        nota3 = input.nextDouble();

        if (nota1 < 0 || nota1 > 20 || nota2 < 0 || nota2 > 20 || nota3 < 0 || nota3 > 20) {
            System.out.println("Digite uma nota de 0-20");
        } else {
            mediaPonderada = ((nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.40));
            System.out.println("A média ponderada é de " + mediaPonderada);
        }

        if (mediaPonderada >= 9.5) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
