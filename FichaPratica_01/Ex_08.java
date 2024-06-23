package FichaPratica_01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int segundosTotais, horas, minutos, segundos;

        System.out.print("Insira os minutos da música 1: ");
        segundosTotais = input.nextInt()*60;
        System.out.print("Insira os segundos da música 1: ");
        segundosTotais = segundosTotais + input.nextInt();

        System.out.print("Insira os minutos da música 2: ");
        segundosTotais =  segundosTotais + input.nextInt()*60;
        System.out.print("Insira os segundos da música 2: ");
        segundosTotais = segundosTotais + input.nextInt();

        System.out.print("Insira os minutos da música 3: ");
        segundosTotais =  segundosTotais + input.nextInt()*60;
        System.out.print("Insira os segundos da música 3: ");
        segundosTotais = segundosTotais + input.nextInt();

        System.out.println(segundosTotais);

        horas = segundosTotais/3600;
        minutos = (segundosTotais/60) - (horas*60);
        segundos = segundosTotais - (horas*3600) - (minutos*60);

        System.out.println("A duração do álbum é de " + horas + "h " + minutos + "m " + segundos + "s ");



    }
}
