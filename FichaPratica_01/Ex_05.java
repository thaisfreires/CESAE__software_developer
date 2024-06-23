package FichaPratica_01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3, media, media_pond;
        System.out.println("Insira um valor: ");
        num1 = input.nextInt();

        System.out.println("Insira outro valor: ");
        num2 = input.nextInt();

        System.out.println("Insira mais um valor: ");
        num3 = input.nextInt();

        media = (num1 + num2 + num3)/3;
        System.out.println(" A média aritmédica desses valores é de " + media);
        media_pond = ((num1 * 0.2)+(num2 * 0.3)+(num3 * 0.5));
        System.out.println(" A média ponderada desses valores em 20%, 30% e 50% é de " + media_pond);




    }
}
