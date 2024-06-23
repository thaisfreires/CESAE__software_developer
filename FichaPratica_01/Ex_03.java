package FichaPratica_01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double lado1, lado2, area, per;

        System.out.println("Insira o comprimento: ");
        lado1 = input.nextDouble();

        System.out.println("Insira a largura: ");
        lado2 = input.nextDouble();

        area = lado1 * lado2;
        per = 2 * lado1 * lado2;
        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro: " + per);

    }
}
