package FichaPratica_02;
//Determine e escreva o montante de impostos a pagar sobre um sálário anual liquido, tendo em conta que o sálário até 15000 paga taxa de 20% e superior a 15000, 30%.
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        //Import Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double salario, imposto;

        System.out.print("Indroduza um salário: ");
        salario = input.nextDouble();

        if (salario < 15000){
            imposto = salario * 0.2;
            System.out.println("Imposto de 20%: " + imposto);
        }else{
            imposto = salario * 0.3;
            System.out.println("Imposto de 30%: " + imposto);
        }
    }
}
