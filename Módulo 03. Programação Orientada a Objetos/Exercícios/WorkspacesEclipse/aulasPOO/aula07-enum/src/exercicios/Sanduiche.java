package exercicios;

public enum Sanduiche {
    HOTDOG("Hot Dog", 7.00), HAMBURGUER("HAMBURGUER", 15.00), MISTO("MISTO QUENTE", 6.5);

    private String tipoSanduiche;
    private double valor;
    private Sanduiche(String tipoSanduiche, double valor) {
        this.tipoSanduiche = tipoSanduiche;
        this.valor = valor;
    }
    public String getTipoSanduiche() {
        return tipoSanduiche;
    }
    public double getValor() {
        return valor;
    }


}
