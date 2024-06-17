package Conditionals;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        //Import Scanner
        Scanner input = new Scanner(System.in);

        //Declarar e ler variaveis
        System.out.println("***Selecione a opção desejada: \n 1. Criar \n 2. Atualizar \n 3. Eliminar \n 4. Sair \n ");
        int option = input.nextInt();

        //Definir opções
        switch (option) {
            case 1:
                System.out.println("***Criar***");
                break;
            case 2:
                System.out.println("***Atualizar***");
                break;
            case 3:
                System.out.println("***Eliminar***");
                break;
            case 4: //Sair
                break;

            default:
                System.out.println("Opção Inválida");
        }
        }
    }

