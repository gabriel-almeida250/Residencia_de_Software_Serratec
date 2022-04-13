package br.com.senai.model;

public class AssistenteExercicio extends FuncionarioExercicio {
	private double adicional;

	public AssistenteExercicio(String nome, String cpf, double salario, String turno, double adicional) {
		super(nome, cpf, salario, turno);
		this.adicional = adicional;
	}
	@Override
	public String toString() {
		return super.toString() + "\nAdicional: " + adicional;
	}

	public double getAdicional() {
		return adicional;
	}
	public void aumentarSalario(double aumento) {
		salario += (salario * 0.02) + adicional; 
	}

	
}
