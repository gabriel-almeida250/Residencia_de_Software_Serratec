package exercicios;

//Faça um programa que percorra números entre 0 e 30 e 
//exiba a quantidade de números pares e impares.
public class ParesImpares {

    public static void main(String[] args) {
        int contPar = 0;
        int contImpar = 0;
        for (int contador = 0; contador <= 30; contador++) {
            System.out.println(contador);

            if (contador % 2 == 0) {
                contPar += 1;
            } else {
                contImpar += 1;
            }
        }
        System.out.println("Total de números pares: " + contPar);
        System.out.println("Total de números ímpares: " + contImpar);
    }
}