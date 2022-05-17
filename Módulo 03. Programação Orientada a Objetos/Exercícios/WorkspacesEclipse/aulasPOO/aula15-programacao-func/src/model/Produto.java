package model;

import java.time.LocalDate;

public class Produto{
	private Integer codigo;
	private String nome;
	private Integer quantidadeEstoque;
	private LocalDate dataCadastro;
	public Produto(Integer codigo, String nome, Integer quantidadeEstoque, LocalDate dataCadastro) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.quantidadeEstoque = quantidadeEstoque;
		this.dataCadastro = dataCadastro;
	}
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", quantidadeEstoque=" + quantidadeEstoque
				+ ", dataCadastro=" + dataCadastro + "]";
	}
	public Integer getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	
}
