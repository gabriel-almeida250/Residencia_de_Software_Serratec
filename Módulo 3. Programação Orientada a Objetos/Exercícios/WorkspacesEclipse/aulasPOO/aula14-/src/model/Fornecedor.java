package model;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author Gabriel
 * @version 1.0
 * @since Criada em 04 de 2022
 */
public class Fornecedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @implNote Cadastro único das empresas junto ao Governo Federal
	 */
	private String cnpj;
	private String nome;
	private String email;
	/**
	 * 
	 */
	private Double comissao;
/**
 * 
 * @param cnpj
 * cnpj
 * @param nome
 * nome
 * @param email
 * email
 * @param comissao
 * comissao
 */
	public Fornecedor(String cnpj, String nome, String email, Double comissao) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", nome=" + nome + ", email=" + email + ", comissao=" + comissao + "]";
	}

	/**
	 * 
	 * @return Retorna o cnpj do cliente
	 */

	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Double getComissao() {
		return comissao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Fornecedor))
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(cnpj, other.cnpj);
	}
	/** Método criado para calcular o pagamento dos fornecedores.
	 * Na fórmula de cáculo deverá ser acrescida a comissão.
	 * @author Gabriel
	 * @since 29/04/2022
	 * @param valor recebe o valor de entrada do pagamento
	 * @return retorna o valor do cálculo do pagamento
	 * @throws IllegalArgumentException caso o valor for negativo o método deverá lançar uma execeção
	 */
	public Double calcularPagamento(double valor) throws IllegalArgumentException{
		return 0.0;
	}
	/**
	 * Este método imprime uma listagem de todos os fornecedores
	 * @author Gabriel
	 * @since 29/04/2022
	 */
	public void listarFornecedores() {
		
	}
}
