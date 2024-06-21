package FichaPratica_03;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int inicio, fim;
        System.out.print("Digite um valor: ");
        inicio = input.nextInt();

        System.out.print("Digite um valor: ");
        fim = input.nextInt();

        while (inicio <= fim){
            System.out.println(inicio);
            inicio = inicio + 1;
        }
    }
}
