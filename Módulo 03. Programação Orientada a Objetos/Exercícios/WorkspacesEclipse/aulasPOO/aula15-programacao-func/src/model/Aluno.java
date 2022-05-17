package model;

public class Aluno {
	private Integer codigo;
	private String nome;
	private String email;
	private Integer idade;

	public Aluno(Integer codigo, String nome, String email, Integer idade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aluno [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Integer getIdade() {
		return idade;
	}
}
