package praticaAula04;

public class Gerente extends Funcionario{
	private int senha;
	private int numeroDeFuncionarios;
	
	public boolean autentica(int senha) {
		return false;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

}
