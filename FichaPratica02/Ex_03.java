package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Indroduza um salário: ");
        double salario = input.nextDouble();

        if (salario > 25000) {
            System.out.println("Seu imposto é de: " +salario * 0.4);
        }

        if (salario > 20000 && salario<=25000){
            System.out.println("Seu imposto é de: " +salario * 0.35);
        }

        if (salario > 15000 && salario<=20000){
            System.out.println("Seu imposto é de: " +salario * 0.3);
        }

        if (salario <= 15000) {
           System.out.println("Seu imposto é de: " +salario * 0.20);
        }

    }
}
