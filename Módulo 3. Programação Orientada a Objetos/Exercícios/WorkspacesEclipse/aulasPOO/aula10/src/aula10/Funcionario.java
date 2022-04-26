package aula10;

public class Funcionario {
	private String nome;
	private String cargo;
	private String depto;
	public Funcionario(String nome, String cargo, String depto) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.depto = depto;
	}
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", depto=" + depto + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
}
