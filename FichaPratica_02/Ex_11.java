package FichaPratica_02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        //Import Scanner
        Scanner input = new Scanner(System.in);

        //Declarar e ler variaveis
        System.out.println("Insira um saldo: ");
        double saldo = input.nextDouble();
        System.out.println("Insira o movimento: ");
        double movimento = input.nextDouble();

        double saldoAposMovimento;
        saldoAposMovimento = saldo + movimento;

        if (saldoAposMovimento >= 0) {
        saldo = saldoAposMovimento;
        }else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + saldo);
    }


}
