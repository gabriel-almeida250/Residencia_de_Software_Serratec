package exercicios;

//Fa�a um programa que percorra n�meros entre 0 e 30 e 
//exiba a quantidade de n�meros pares e impares.
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
        System.out.println("Total de n�meros pares: " + contPar);
        System.out.println("Total de n�meros �mpares: " + contImpar);
    }
}