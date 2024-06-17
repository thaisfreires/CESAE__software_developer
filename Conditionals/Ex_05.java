package Conditionals;
//Escreva um programa que leia dois valores numéricos e apresente o menor e depois o maior.
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        //Import Scanner
        Scanner input = new Scanner(System.in);

        //Declarar e ler variaveis
        int valor1, valor2;
        System.out.print("Digite um valor: ");
        valor1 = input.nextInt();
        System.out.print("Digite um valor: ");
        valor2 = input.nextInt();

        if (valor1 < valor2) {
            System.out.println(valor1 + "\t" + valor2);
        }else{
            System.out.println(valor2 + "\t" + valor1);
        }


    }
}
