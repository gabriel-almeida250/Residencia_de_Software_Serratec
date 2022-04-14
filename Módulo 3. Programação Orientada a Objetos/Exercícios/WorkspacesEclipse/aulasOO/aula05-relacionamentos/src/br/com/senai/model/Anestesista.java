package br.com.senai.model;

public class Anestesista extends Medico {
	private String tipoAnestesia;

	public Anestesista(String nome, String crm, String nomeMedico, String tipoAnestesia) {
		super(nome, crm, nomeMedico);
		this.tipoAnestesia = tipoAnestesia;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nTipo Anestesia: " + tipoAnestesia;
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}
	@Override
	public double calcularPagamento() {
		valorPago = super.calcularPagamento() + 1000;
		return valorPago;
	}
	

}
