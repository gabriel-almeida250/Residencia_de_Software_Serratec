package com.residencia.comercio.dtos;

import javax.validation.constraints.NotBlank;

public class CategoriaDTO {
	private Integer idCategoria;
	@NotBlank(message = "O Nome da categoria não pode estar vazio")
	private String nomeCategoria;

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

	@Override
	public String toString() {
		return "CategoriaDTO [idCategoria=" + idCategoria + ", nomeCategoria=" + nomeCategoria + "]";
	}

}
