package praticaAula06;

public abstract class Auxiliar extends Funcionario {
	private String setor;

	public Auxiliar(String nome, double salario, String setor) {
		super(nome, salario);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public abstract void calcularAlgumaCoisa();

}
