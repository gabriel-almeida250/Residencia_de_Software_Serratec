package praticaAula06;

public class AxuliarADM extends Auxiliar {
	private String sala;
	
	public AxuliarADM(String nome, double salario, String setor, String sala) {
		super(nome, salario, setor);
		this.setSala(sala);
	}

	@Override
	public void calcularAlgumaCoisa() {
		// TODO Auto-generated method stub

	}

	@Override
	public void calcularAumentoSalario() {
		// TODO Auto-generated method stub

	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

}
