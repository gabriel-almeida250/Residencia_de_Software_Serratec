package praticaAula;

public class Funcionario {
	private String funcionario;
	private String cargo;
	private double salario;
	public Funcionario(String funcionario, String cargo, double salario) {
		super();
		this.funcionario = funcionario;
		this.cargo = cargo;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [funcionario=" + funcionario + ", cargo=" + cargo + ", salario=" + salario + "]";
	}
	public String getFuncionario() {
		return funcionario;
	}
	public String getCargo() {
		return cargo;
	}
	public double getSalario() {
		return salario;
	}
	public double abonoSalario(double valor) {
		return salario+=valor;
	}
	
}
