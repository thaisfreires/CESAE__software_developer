package Algoritmia.Exercicios_Extras_Ciclos;

public class ex_03 {
    public static void main(String[] args) {

        //Exibir tabuada de multiplicação de 1 a 10

        //Declarar variáveis

        int numero = 1, multiplicador;

        while (numero < 10) { //ou true

            System.out.println("Tabuada do " +numero+ ": ");
            multiplicador = 1;
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));

            while (multiplicador < 10) {

                multiplicador++;
                System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));

            }
            numero++;



        }
    }
}

