package praticaAula04;

public class Medico {
	protected String crm;
	protected String nome;
	protected double valorConsult;
	public Medico(String crm, String nome, double valorConsult) {
		this.crm = crm;
		this.nome = nome;
		this.valorConsult = valorConsult;
	}
	
	@Override
	public String toString() {
		return "Crm: " + crm + ".\nNome: " + nome + ".\nValor Consulta: " + valorConsult;
	}

	public String getCrm() {
		return crm;
	}
	public String getNome() {
		return nome;
	}
	public double getValorConsult() {
		return valorConsult;
	}
}
