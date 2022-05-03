package model;

public class Autor {
	private String nome;
	private String telefone;
	public Autor(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", telefone=" + telefone + "]";
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	
	public void imprimir() {
		System.out.println(nome);
	}
}
