package FichaPratica02;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        int valor1, valor2;
        System.out.print("Digite um valor: ");
        valor1 = input.nextInt();
        System.out.print("Digite um valor: ");
        valor2 = input.nextInt();

        if (valor1 < valor2) {
            System.out.println(valor1);
            System.out.println(valor2);
        }else{
            System.out.println(valor2);
            System.out.println(valor1);
        }


    }
}
