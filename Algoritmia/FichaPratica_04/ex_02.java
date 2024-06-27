import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        // Apresentar as opções
        do {

            System.out.println("1. Criar \n2. Atualizar \n3. Eliminar \n4. Sair");
            System.out.println(" - Escolha uma opção:  ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Criar
                    System.out.println("*** Criar ***");
                    break;

                case 2: // Atualizar
                    System.out.println("*** Atualizar ***");
                    break;

                case 3: // Eliminar
                    System.out.println("*** Eliminar ***");
                    break;

                case 4: // Sair
                    break;

                default:
                    System.out.println("<<< Opção Inválida! >>>");
                    break;

            }

        }while (opcao != 4) ;
    }
}
