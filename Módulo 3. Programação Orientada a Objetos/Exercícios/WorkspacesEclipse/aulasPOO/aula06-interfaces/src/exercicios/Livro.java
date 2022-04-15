package exercicios;

public class Livro {
	private String autor;
	private String titulo;
	private double valor;
	public Livro(String autor, String titulo, double valor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "\nLivro do autor: " + autor + "\nTitulo: " + titulo + "\nValor: " + valor;
	}
	public String getAutor() {
		return autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public double getValor() {
		return valor;
	}
	public void reajuste(double valor) {
		this.valor = this.valor + this.valor * valor/100;
	}
}
