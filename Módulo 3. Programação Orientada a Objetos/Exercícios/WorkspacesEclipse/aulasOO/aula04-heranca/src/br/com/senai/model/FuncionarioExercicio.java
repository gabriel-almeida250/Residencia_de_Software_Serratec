package br.com.senai.model;

public class FuncionarioExercicio {
	protected String nome, cpf;
	protected double salario;
	protected String turno;
	
	public FuncionarioExercicio(String nome, String cpf, double salario, String turno) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.turno = turno;
	}
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nCpf: " + cpf + "\nSalario: " + salario + "\nTurno: " + turno;
	}

	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public double getSalario() {
		return salario;
	}
	public String getTurno() {
		return turno;
	}
	public void aumentarSalario(double aumento) {
		salario += (salario * 0.02); 
	}
}

