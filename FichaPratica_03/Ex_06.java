package FichaPratica_03;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int valor1, valor2, x = 0;
        System.out.print("Digite um valor: ");
        valor1 = input.nextInt();
        x = valor1;

        System.out.print("Digite um valor: ");
        valor2 = input.nextInt();

        while (x <= valor2){
            System.out.println(x);
            x = x + 1;
        }
    }
}
