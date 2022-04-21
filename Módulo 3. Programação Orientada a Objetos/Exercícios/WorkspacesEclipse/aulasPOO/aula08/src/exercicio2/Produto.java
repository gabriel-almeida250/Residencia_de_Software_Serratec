package exercicio2;

public class Produto {

    private int codigo;
    private String descricao;
    private double valor;
    private Categoria categoria;

    public Produto(int codigo, String descricao, double valor, Categoria categoria) {
        super();
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto: " + descricao + "-" + valor;

    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

}
