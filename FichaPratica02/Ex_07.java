package FichaPratica02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota, media, mediaPonderada;
        System.out.println("Digite a nota 1: ");
        nota = input.nextInt();
        System.out.println("Digite a nota 2: ");
        nota = nota + input.nextInt();
        System.out.println("Digite a nota 3: ");
        nota = nota + input.nextInt();
        
        media = nota / 3;
        mediaPonderada = ((media*0.25) + (media*0.35)+ (media*0.40))


    }
}
