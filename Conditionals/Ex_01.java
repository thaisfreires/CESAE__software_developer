package Conditionals;
//Leia dois numeros inteiros e escreva o maior
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Insira um numero: ");
        num1 = input.nextInt();

        System.out.print("Insira um numero: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("Maior: " +num1);
        }else{
            System.out.println("Menor: " +num2);

        }
    }
}
