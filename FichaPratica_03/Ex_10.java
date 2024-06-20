package FichaPratica_03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Número- ");
        int x = input.nextInt();
        int count = 2;

          while (x < count){
              System.out.println("Números pares: " + count);
              count = count + 2;
          }
    }
}
