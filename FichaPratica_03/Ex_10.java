package FichaPratica_03;

import java.util.Scanner;
//Leia um numero inteiro e imprima numeros pares entre 2 e esse numero
public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Número- ");
        int num = input.nextInt() ;
        int count = 2;

          while (count <= num){
              System.out.println("Números pares: " + count);
              count = count + 2;
          }
    }
}
