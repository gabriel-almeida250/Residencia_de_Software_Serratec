package exercicios;

public class MultiplosDe2 {

    public static void main(String[] args) {
        for (int num = 1; num <= 22; num++) {
            System.out.println(num);

            if (num % 2 == 0) {
                System.out.println("Java");
            } else {
                System.out.println("Esse número não é múltiplo de 2");
            }
        }

    }

}