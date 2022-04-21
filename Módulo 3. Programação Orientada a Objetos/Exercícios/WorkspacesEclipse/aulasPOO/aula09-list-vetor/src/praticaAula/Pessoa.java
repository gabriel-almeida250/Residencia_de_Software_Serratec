package praticaAula;

public class Pessoa {
	private String nome;
	private String email;
	private int idade;
	public Pessoa(String nome, String email, int idade) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public int getIdade() {
		return idade;
	}
	
}
