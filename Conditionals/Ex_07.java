package Conditionals;
//Escreva um programa que leia um número, depois apresente se é par ou ímpar.
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("insira um numero: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Esse número é PAR");
        }else{
            System.out.println("Esse número é IMPAR");
        }
    }
}