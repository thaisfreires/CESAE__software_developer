package FichaPratica_03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Leia uma variavel e um salto e um incremento e imprima os numeros inteiros ate o limite inclusive, com incremento de salto.
        int limite, salto, x=0;
        System.out.print("Introduza um limite: ");
        limite = input.nextInt();
        System.out.print("Introduza um salto: ");
        salto = input.nextInt();


        while (x <= limite) {
            System.out.println("Saída do algoritmo com salto: " + x);
            x = x + salto;
        }
    }
}
