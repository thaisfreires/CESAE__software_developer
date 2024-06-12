package FichaPratica02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, imposto;

        System.out.print("Indroduza um salário: ");
        salario = input.nextDouble();

        if (salario < 15000){
            imposto = salario * 0.2;
            System.out.println("Imposto de 20%: " + imposto);
        }else{
            imposto = salario * 0.3;
            System.out.println("Imposto de 30%: " + imposto);
        }
    }
}
