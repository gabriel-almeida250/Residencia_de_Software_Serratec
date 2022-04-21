package praticaAula;

public class Cliente {
	private String nome;

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
}
