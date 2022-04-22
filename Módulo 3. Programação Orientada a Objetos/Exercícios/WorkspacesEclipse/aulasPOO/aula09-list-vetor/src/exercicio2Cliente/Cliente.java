package exercicio2Cliente;

public class Cliente {
	private int id;
	private String nome;
	private String idade;
	private String telefone;
	
	public Cliente() {
		super();
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getIdade() {
		return idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}