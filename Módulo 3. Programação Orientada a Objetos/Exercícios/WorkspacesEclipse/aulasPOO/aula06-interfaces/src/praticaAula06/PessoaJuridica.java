package praticaAula06;

public class PessoaJuridica extends Pessoa implements Tributos {
	private String cnpj;
	private String razaosocial;
	
	public PessoaJuridica(String nome, String endereco, double rendimentos, String cnpj, String razaosocial) {
		super(nome, endereco, rendimentos);
		this.cnpj = cnpj;
		this.razaosocial = razaosocial;
	}
	
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", razaosocial=" + razaosocial + ", nome=" + nome + ", endereco="
				+ endereco + ", rendimentos=" + rendimentos + "]";
	}

	@Override
	public double calcularImpostoDeRenda() {
		return rendimentos * irendaPessoaJuridica;
	}

	@Override
	public double calcularICMS() {
		return rendimentos * icms;
	}

}
