package exercicios;

public class Exercicio2Fixacao {

    public static void main(String[] args) {
        // Fa�a uma tabela de multiplica��o para 
        // o n�mero 2 multiplicando do 1 at� 10.
        int numero = 2, resultado = 0;
        for (int contador = 1; contador <= 10; contador++) {
            resultado = contador * numero;
            System.out.println(numero + " x " + contador + " = " + resultado);

        }
    }

}