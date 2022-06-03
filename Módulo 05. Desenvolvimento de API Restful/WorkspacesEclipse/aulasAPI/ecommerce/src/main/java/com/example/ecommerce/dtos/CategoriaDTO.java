package com.example.ecommerce.dtos;

import java.util.List;

import com.example.ecommerce.entities.Categoria;

public class CategoriaDTO {
	
	private Integer idCategoria;

	private String nomeCategoria;

	private String descricaoCategoria;

	private List<ProdutoDTO> produtoList;

	public CategoriaDTO() {
		super();
	}

	public CategoriaDTO(Integer idCategoria, String nomeCategoria, String descricaoCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.descricaoCategoria = descricaoCategoria;
	}

	@Override
	public String toString() {
		return "CategoriaDTO [idCategoria=" + idCategoria + ", nomeCategoria=" + nomeCategoria + ", descricaoCategoria="
				+ descricaoCategoria + ", produtoList=" + produtoList + "]";
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	public List<ProdutoDTO> getProdutoList() {
		return produtoList;
	}

	public void setProdutoList(List<ProdutoDTO> produtoList) {
		this.produtoList = produtoList;
	}
	
	public Categoria converterDTOParaEntidade() {
		
		return new Categoria(idCategoria, nomeCategoria, descricaoCategoria);
	}
	
}
