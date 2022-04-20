package exercicios;

import java.time.LocalDate;

public class Pedido {
    private LocalDate dataPedido;
    private Bebida bebida;
    private Sanduiche sanduiche;

    public Pedido(LocalDate dataPedido, Bebida bebida, Sanduiche sanduiche) {
        super();
        this.dataPedido = dataPedido;
        this.bebida = bebida;
        this.sanduiche = sanduiche;
    }

    @Override
    public String toString() {
        return "Pedido [dataPedido=" + dataPedido + ", bebida=" + bebida + ", sanduiche=" + sanduiche + "]";
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void imprimirCardapio() {
        for (Bebida bebida : Bebida.values()) {
            System.out.println(bebida.getTipoBebida() + ":" + bebida.getValor());
        }

        for (Sanduiche sanduiche : Sanduiche.values()) {
            System.out.println(sanduiche.getTipoSanduiche() + ":" + sanduiche.getValor());
        }

    }

    public double calcularPedido() {
        return bebida.getValor() + sanduiche.getValor();
    }
}
