package exercicio1;

public abstract class ColegioAplicacao extends Universidade {
	private String nomeCoordenador;

	public ColegioAplicacao(String nome, String nomeCoordenador) {
		super(nome);
		this.nomeCoordenador = nomeCoordenador;
	}

	@Override
	public void fazerMatricula() {

	}

	public abstract void reuniaoDePais();

	public String getNomeCoordenador() {
		return nomeCoordenador;
	}
}
