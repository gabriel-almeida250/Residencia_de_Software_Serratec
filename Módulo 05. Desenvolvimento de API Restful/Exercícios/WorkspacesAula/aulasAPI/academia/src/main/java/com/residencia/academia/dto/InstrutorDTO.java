package com.residencia.academia.dto;

import java.util.Date;
import java.util.List;

public class InstrutorDTO {

	private Integer idInstrutor;
	private Integer rgInstrutor;
	private String nomeInstrutor;
	private Date dataNascimentoInstrutor;
	private Integer titulacaoInstrutor;
	private List<TurmaDTO> turmaList;

	public Integer getIdInstrutor() {
		return idInstrutor;
	}

	public InstrutorDTO() {
		super();
	}

	@Override
	public String toString() {
		return "InstrutorDTO [idInstrutor=" + idInstrutor + ", rgInstrutor=" + rgInstrutor + ", nomeInstrutor="
				+ nomeInstrutor + ", dataNascimentoInstrutor=" + dataNascimentoInstrutor + ", titulacaoInstrutor="
				+ titulacaoInstrutor + ", turmaList=" + turmaList + "]";
	}

	public void setIdInstrutor(Integer idInstrutor) {
		this.idInstrutor = idInstrutor;
	}

	public Integer getRgInstrutor() {
		return rgInstrutor;
	}

	public void setRgInstrutor(Integer rgInstrutor) {
		this.rgInstrutor = rgInstrutor;
	}

	public String getNomeInstrutor() {
		return nomeInstrutor;
	}

	public void setNomeInstrutor(String nomeInstrutor) {
		this.nomeInstrutor = nomeInstrutor;
	}

	public Date getDataNascimentoInstrutor() {
		return dataNascimentoInstrutor;
	}

	public void setDataNascimentoInstrutor(Date dataNascimentoInstrutor) {
		this.dataNascimentoInstrutor = dataNascimentoInstrutor;
	}

	public Integer getTitulacaoInstrutor() {
		return titulacaoInstrutor;
	}

	public void setTitulacaoInstrutor(Integer titulacaoInstrutor) {
		this.titulacaoInstrutor = titulacaoInstrutor;
	}

	public List<TurmaDTO> getTurmaList() {
		return turmaList;
	}

	public void setTurmaList(List<TurmaDTO> turmaList) {
		this.turmaList = turmaList;
	}
}
