package Algoritmia.Exercicios_Extras_Ciclos;

public class ex_02 {
    public static void main(String[] args) {


        //imprimir numeros de 1 a 255, multiplos de 3

        int numero = 1;

        while (numero <= 255) {
            if (numero % 3 == 0) {
                System.out.println(numero);

            }
            numero++;
        }
    }
}



