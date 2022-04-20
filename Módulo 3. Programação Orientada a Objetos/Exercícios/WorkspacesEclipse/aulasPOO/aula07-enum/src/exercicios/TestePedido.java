package exercicios;

import java.time.LocalDate;

public class TestePedido {

    public static void main(String[] args) {
        Pedido p1 = new Pedido(LocalDate.now(), Bebida.REFRIGERANTE, Sanduiche.HOTDOG);


        System.out.println(p1);
        p1.imprimirCardapio();
        System.out.println("Total do Pedido: " + p1.calcularPedido());

    }

}
