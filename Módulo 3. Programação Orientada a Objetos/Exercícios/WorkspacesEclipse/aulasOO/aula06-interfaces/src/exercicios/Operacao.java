package exercicios;

public class Operacao implements Livraria {
	private String tipo;
	private double valorOperacao;
	private Livro livro;

	public Operacao(String tipo, Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}
	
	

	@Override
	public String toString() {
		return "\nTipo da Opera��o: " + tipo + String.format("\nValor Operacao: %.2f", valorOperacao) + "\nLivro: " + livro ;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	@Override
	public void emprestarLivro() {
		valorOperacao = livro.getValor() * 0.02 + taxaEmprestimo;
	}

	@Override
	public void venderLivro() {
		valorOperacao = livro.getValor() + livro.getValor() * 0.09;
	} 
}
