package exercicio1;

public final class EnsinoMedio extends ColegioAplicacao {
    private int numeroAlunos;

    public EnsinoMedio(String nome, String nomeCoordenador, int numeroAlunos) {
        super(nome, nomeCoordenador);
        this.numeroAlunos = numeroAlunos;
    }

    @Override
    public void reuniaoDePais() {

    }
    public void fazerMatricula(){

    }

	public int getNumeroAlunos() {
		return numeroAlunos;
	}
}
