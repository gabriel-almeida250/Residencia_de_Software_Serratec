package praticaAula06;

public class AssistenteFinanceiro extends Assistente {
	private int sala;

	public AssistenteFinanceiro(String nome, double salario, String categoria, int sala) {
		super(nome, salario, categoria);
		this.sala = sala;
	}

	public int getSala() {
		return sala;
	}

}
