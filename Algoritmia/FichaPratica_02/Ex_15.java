package Algoritmia_Programacao.FichaPratica_02;

import java.util.Scanner;

public class Ex_15 {
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

        System.out.print("Crescente (C) ou Decrescente (D): ");
        String opcao = input.next();

        //Definir ordem crescente
        switch (opcao) {
            case "C":
                if (a < b && a < c) {
                    if (b < c) {
                        System.out.println(a + " " + b + " " + c);
                    } else {
                        System.out.println(a + " " + c + " " + b);
                    }
                }
                if (b < a && b < c) {
                    if (a < c) {
                        System.out.println(b + " " + a + " " + c);
                    } else {
                        System.out.println(b + " " + c + " " + a);
                    }

                }
                if (c < a && c < b) {
                    if (c < b) {
                        System.out.println(c + " " + a + " " + b);
                    } else {
                        System.out.println(c + " " + b + " " + a);
                    }
                }

                break;

            case "D":
                if (a < b && a < c) {
                    if (b < c) {
                        System.out.println(c + " " + b + " " + a);
                    } else {
                        System.out.println(b + " " + c + " " + a);
                    }
                }
                if (b < a && b < c) {
                    if (a < c) {
                        System.out.println(c + " " + a + " " + b);
                    } else {
                        System.out.println(a + " " + c + " " + b);
                    }

                }
                if (c < a && c < b) {
                    if (c < b) {
                        System.out.println(b + " " + a + " " + c);
                    } else {
                        System.out.println(a + " " + b + " " + c);
                    }

                }
                break;
        }
    }
}