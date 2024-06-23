package FichaPratica_02;
//Escreva um programa que leia um número, depois apresente se é par ou ímpar.
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        //Import Scanner
        Scanner input = new Scanner(System.in);

        //Declarar e ler variaveis
        int num;
        System.out.println("insira um numero: ");
        num = input.nextInt();

       //Avaliar se é par
        if (num % 2 == 0) {
            System.out.println("Esse número é PAR");
        }else{
            System.out.println("Esse número é IMPAR");
        }
    }
}