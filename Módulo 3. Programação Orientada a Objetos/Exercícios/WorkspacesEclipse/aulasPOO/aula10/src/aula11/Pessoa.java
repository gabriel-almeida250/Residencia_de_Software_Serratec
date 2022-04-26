package aula11;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String cpf;
	private int idade;
	public Pessoa(String nome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public int compareTo(Pessoa outraPessoa) {
		/*if (idade > outraPessoa.getIdade()) {
			return -1;
		}else if (idade < outraPessoa.getIdade()) {
			return 1;
		} else {
		return 0;
		}*/
		return idade - outraPessoa.getIdade();
	}
}
