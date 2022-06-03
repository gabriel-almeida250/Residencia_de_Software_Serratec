package com.example.ecommerce.dtos;

import java.util.Date;
import java.util.List;

public class ProdutoDTO {

	private Integer idProduto;

	private String nomeProduto;

	private String descricaoProduto;

	private Integer qtdEstoque;

	private Date dataCadastro;

	private Double valorUnitario;

	private String imagemProduto;

	private CategoriaDTO categoria;

	List<ItemPedidoDTO> itemPedidosList;

	public ProdutoDTO() {
		super();
	}

	public ProdutoDTO(Integer idProduto, String nomeProduto, String descricaoProduto, Integer qtdEstoque,
			Date dataCadastro, Double valorUnitario, String imagemProduto, CategoriaDTO categoria,
			List<ItemPedidoDTO> itemPedidosList) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.qtdEstoque = qtdEstoque;
		this.dataCadastro = dataCadastro;
		this.valorUnitario = valorUnitario;
		this.imagemProduto = imagemProduto;
		this.categoria = categoria;
		this.itemPedidosList = itemPedidosList;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public Integer getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public String getImagemProduto() {
		return imagemProduto;
	}

	public void setImagemProduto(String imagemProduto) {
		this.imagemProduto = imagemProduto;
	}

	public CategoriaDTO getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaDTO categoria) {
		this.categoria = categoria;
	}

	public List<ItemPedidoDTO> getItemPedidosList() {
		return itemPedidosList;
	}

	public void setItemPedidosList(List<ItemPedidoDTO> itemPedidosList) {
		this.itemPedidosList = itemPedidosList;
	}

}
