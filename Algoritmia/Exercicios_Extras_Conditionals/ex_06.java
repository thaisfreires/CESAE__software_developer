package Exercicios_Extras;

import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o ano -");

        int ano = input.nextInt();

        if (ano % 4 ==0){
            System.out.println(" -> É bissexto ");
        }else{
            System.out.println(" -> Não é bissexto ");
        }
    }
}
