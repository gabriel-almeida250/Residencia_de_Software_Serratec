package praticaAula04;

public class Anestesista extends Medico {
	private double valorAnestesista;

	public Anestesista(String crm, String nome, double valorConsult, double valorAnestesista) {
		super(crm, nome, valorConsult);
		this.valorAnestesista = valorAnestesista;
	}
	@Override
	public String toString() {
		return super.toString() + "\nValor da Anestesia: " + valorAnestesista;

	}

	public double getValorAnestesista() {
		return valorAnestesista;
	}
	
}
