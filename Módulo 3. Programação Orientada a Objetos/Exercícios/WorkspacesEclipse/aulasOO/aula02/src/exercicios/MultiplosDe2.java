package exercicios;

public class MultiplosDe2 {

    public static void main(String[] args) {
        //Fa�a um programa que percorra todos os n�mero de 1 at� 22. Para os n�meros 
        //m�ltiplos de 2, imprima a palavra�Java�, e mostre o total de m�ltiplos de 2 encontrado.
        int totalPar = 0;
        for (int num = 1; num <= 22; num++) {
            System.out.println(num);

            if (num % 2 == 0) {
                System.out.println("Java");
                totalPar += 1;
            } else {
                System.out.println("Esse n�mero n�o � m�ltiplo de 2");
            }
        }

    }

}