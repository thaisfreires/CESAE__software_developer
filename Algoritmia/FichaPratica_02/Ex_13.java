package Algoritmia_Programacao.FichaPratica_02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        //Import Scanner
        Scanner input = new Scanner(System.in);

        //Declarar e ler variaveis
        System.out.println("Insira a hora no formato 24 horas: ");
        int hora = input.nextInt();
        System.out.println("Insira os minutos: ");
        int minuto = input.nextInt();

        //Trocar formato para 12 horas e acrescentar AM/PM
        if (hora >= 12) {
            if (hora != 12){
                hora = hora - 12;
            System.out.println(hora + ":" + minuto + " PM");

            }
        }else{
            System.out.println(hora + ":" + minuto + " AM");
        }

    }
}
