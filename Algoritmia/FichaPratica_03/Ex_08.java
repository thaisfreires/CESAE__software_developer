package Algoritmia_Programacao.FichaPratica_03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int count = num - 5;


        while (count < num) {
            System.out.println(count);
            count++;
        }
        count = num + 1;
        num = num + 5;
        while (count <= num){
            System.out.println(count);
            count++;
        }
    }
}
