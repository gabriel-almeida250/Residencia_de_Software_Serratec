package com.example.ecommerce.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.ecommerce.dtos.CategoriaDTO;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "categoria")
@JsonIdentityInfo(scope = Categoria.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "idCategoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private Integer idCategoria;

	@Column(name = "nome")
	private String nomeCategoria;

	@Column(name = "descricao")
	private String descricaoCategoria;

	@OneToMany(mappedBy = "categoria")
	private List<Produto> produtoList;

	public Categoria() {
		super();
	}

	public Categoria(Integer idCategoria, String nomeCategoria, String descricaoCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.descricaoCategoria = descricaoCategoria;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", nomeCategoria=" + nomeCategoria + ", descricaoCategoria="
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

	public List<Produto> getProdutoList() {
		return produtoList;
	}

	public void setProdutoList(List<Produto> produtoList) {
		this.produtoList = produtoList;
	}
	
	public CategoriaDTO converterEntidadeParaDTO() {
		
		return new CategoriaDTO(idCategoria, nomeCategoria, descricaoCategoria);
	}

}
