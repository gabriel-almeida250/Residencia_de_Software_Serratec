package exercicios;

public enum Bebida {
    REFRIGERANTE("refrigerante", 3.00), SUCO("Suco", 6.5), AGUA("Agua Mineral", 3.00);

    private String tipoBebida;
    private double valor;

    private Bebida(String tipoBebida, double valor) {
        this.tipoBebida = tipoBebida;
        this.valor = valor;
    }

    public String getTipoBebida() {
        return tipoBebida;
    }

    public double getValor() {
        return valor;
    }

}