package exercicios;

public class MultiplosDe2 {

    public static void main(String[] args) {
        //Faça um programa que percorra todos os número de 1 até 22. Para os números 
        //múltiplos de 2, imprima a palavra“Java”, e mostre o total de múltiplos de 2 encontrado.
        int totalPar = 0;
        for (int num = 1; num <= 22; num++) {
            System.out.println(num);

            if (num % 2 == 0) {
                System.out.println("Java");
                totalPar += 1;
            } else {
                System.out.println("Esse número não é múltiplo de 2");
            }
        }

    }

}