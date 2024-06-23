package Algoritmia_Programacao.FichaPratica_02;
//Escreva um programa que leia 3 números e o imprima de forma crescente.
import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        //Import Scanner
        Scanner input = new Scanner(System.in);

        //Declarar e ler variaveis
        System.out.println("Valor 1: ");
        int a = input.nextInt();
        System.out.println("Valor 2: ");
        int b = input.nextInt();
        System.out.println("Valor 3: ");
        int c = input.nextInt();

        //Definir ordem crescente
        if ( a < b && a < c) {
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        }
        if (b < a && b < c) {
            if (a < c){
                System.out.println(b + " " + a + " " + c);
            }else{
                System.out.println(b + " " + c + " " + a);
            }
        
            }
        if (c < a && c < b) {
            if (c < b){
                System.out.println(c + " " + a + " " + b);
            }else {
                System.out.println(c + " " + b + " " + a);
            }
        }
        }
    }

