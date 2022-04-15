package exercicios;

public class Produto2 {
	private String nome;
	private double valor;
	private int quantidade;
	
	public Produto2(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double totalProduto() {
		double total;
		total = valor * quantidade;
		return total;
	}
	public double calcularIcms() {
		double icms;
		icms = totalProduto() * 0.12;
		return icms;
	}
}
