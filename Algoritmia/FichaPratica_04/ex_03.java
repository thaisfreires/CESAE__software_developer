import java.sql.SQLOutput;
import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, secreto, count = 0;

        System.out.println("---jogador 1 - Escolha um número entre 0 - 100- ");
        secreto = input.nextInt();

        for (int i = 1; i <= 20; i++) { //Imprime 20 enters para esconder o numero
            System.out.println();
        }

        System.out.println("----jogador 2 - Adivinhe o número (1 - 100) -----");
        num = input.nextInt();
        count++;

        while (num != secreto) {

            if (num > secreto) {
                System.out.println("Muito alto! ");
            }
            if (num < secreto) {
                System.out.println("Muito baixo!");
            }
            System.out.println("----jogador 2 - Adivinhe o número (1 - 100) -----");
            num = input.nextInt();
            count++;

        }
        System.out.println("****Boa! Ganhaste o jogo!****");
        System.out.println("Número de tentativas: " + count);
    }
}


