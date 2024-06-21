package FichaPratica_03;

public class Ex_07 {
    public static void main(String[] args) {

        int count = 1, soma = 0;
        //Imprimir numeros de 1 a 100 e a soma deles

        while (count <= 100){
            System.out.println(count);
            soma = soma + count;
            count++;
        }
        System.out.println("Soma: "+ soma);
    }
}
