import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, i = 2;
        System.out.print("Insira um número: ");
        num = input.nextInt();
        boolean primo = true;

        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println("Esse número é primo! ");
        } else {
            System.out.println("Esse número não é primo!");
        }
    }
}
