package exercicio1;

public final class TecnicoConcomitante extends ColegioAplicacao {
	public String nomeCurso;

	public TecnicoConcomitante(String nome, String nomeCoordenador, String nomeCurso) {
		super(nome, nomeCoordenador);
		this.nomeCurso = nomeCurso;
	}

	@Override
	public void reuniaoDePais() {

	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void fazerMatricula() {

	}
}
