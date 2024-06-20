package FichaPratica_03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num = input.nextInt();
        int soma = 0;
        int media = 0;
        int quantidade = 0;

        while (num != -1){
            System.out.print("Insira um número: ");
            soma = soma + num;
            num = input.nextInt();
            quantidade++;
            //System.out.println(soma);
            //System.out.println(num);
            //System.out.println(quantidade);

        }
        media = soma / quantidade;
        System.out.print("Média: " + media);
    }
}
