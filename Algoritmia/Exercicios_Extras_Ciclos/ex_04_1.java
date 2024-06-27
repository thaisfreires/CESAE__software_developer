package Algoritmia.Exercicios_Extras_Ciclos;

public class ex_04_1 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++){
            System.out.println("**********");
        }

        for (int i = 0; i < 4; i++){
            System.out.println("*");

            while (i <5){ //ideia: igualar strings com numeros com CASE
                System.out.println("*");
                i++;
                System.out.println("**");
            }
        }
    }
}
