package br.com.senai.model;

public class Medico extends Plano {
	private String crm;
	private String nomeMedico;
	public Medico(String nome, String crm, String nomeMedico) {
		super(nome);
		this.crm = crm;
		this.nomeMedico = nomeMedico;
	}
	public String toString() {
		return super.toString() + "\nCrm: " + crm + "\nNome: " + nomeMedico;
	}
	
	public String getCrm() {
		return crm;
	}
	public String getNomeMedico() {
		return nomeMedico;
	}
	@Override
	public double calcularPagamento() {
		valorPago += super.calcularPagamento() * 0.10;
		return valorPago;
	}

}
