package br.com.senai.model;

public class GerenteExercicio extends FuncionarioExercicio {
	private String setor;

	public GerenteExercicio(String nome, String cpf, double salario, String turno, String setor) {
		super(nome, cpf, salario, turno);
		this.setor = setor;
	}
	@Override
	public String toString() {
		return super.toString() + "\nSetor: " + setor;
	}

	public String getSetor() {
		return setor;
	}
	public void aumentarSalario(double aumento) {
		salario += (salario * 0.02) + 200;
	}
}
