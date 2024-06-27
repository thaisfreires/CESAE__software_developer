import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, resultado;
        String operacao, continuar;

        do {
            System.out.println("Valor 1 : ");
            num1 = input.nextInt();
            System.out.println("Valor 2 : ");
            num2 = input.nextInt();

            System.out.print("Operação desejada (+ - * /): ");
            operacao = input.next();

            switch (operacao) {
                case "+": // Soma
                    resultado = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + resultado);
                    break;

                case "-": // Subtracao
                    resultado = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + resultado);
                    break;

                case "*": // Multiplicacao
                    resultado = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + resultado);
                    break;

                case "/": // Divisao
                    resultado = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + resultado);
                    break;

                default:
                    System.out.println("Operação Inválida");
            }


            // Validação do continuar

            System.out.println("Deseja continuar? introduza s/n ");
            continuar = input.next();

            while (!continuar.equals("s") && !continuar.equals("n")){
                System.out.println("Operação Inválida");
                System.out.println("Deseja continuar? introduza s/n ");
                continuar = input.next();
            }


        }while (continuar.equalsIgnoreCase("s"));


        }
    }



