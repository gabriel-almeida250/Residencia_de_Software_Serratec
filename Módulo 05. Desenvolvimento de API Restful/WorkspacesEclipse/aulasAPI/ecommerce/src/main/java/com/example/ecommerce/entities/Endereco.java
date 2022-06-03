package com.example.ecommerce.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.ecommerce.dtos.EnderecoDTO;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "endereco")
@JsonIdentityInfo(scope = Endereco.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "idEndereco")
public class Endereco {

	// id_endereco SERIAL PRIMARY KEY,
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Integer idEndereco;
	// cep varchar(9) NOT NULL,
	@Column(name = "cep")
	private String cep;
	// rua varchar(100) NOT NULL,
	@Column(name = "rua")
	private String rua;
	// bairro varchar(50) NOT NULL,
	@Column(name = "bairro")
	private String bairro;
	// cidade varchar(30),
	@Column(name = "cidade")
	private String cidade;
	// numero INTEGER NOT NULL,
	@Column(name = "numero")
	private String numero;
	// complemento varchar(20),
	@Column(name = "complemento")
	private String complemento;
	// uf varchar(2)
	@Column(name = "uf")
	private String uf;

	@OneToMany(mappedBy = "endereco")
	private List<Cliente> clienteList;

	public Endereco() {
		super();
	}

	public Endereco(Integer idEndereco, String cep, String rua, String bairro, String cidade, String numero,
			String complemento, String uf) {
		super();
		this.idEndereco = idEndereco;
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.numero = numero;
		this.complemento = complemento;
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", cep=" + cep + ", rua=" + rua + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", numero=" + numero + ", complemento=" + complemento + ", uf=" + uf
				+ ", clienteList=" + clienteList + "]";
	}

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public EnderecoDTO converterEntidadeParaDTO() {
		return new EnderecoDTO(idEndereco, cep, rua, bairro, cidade, idEndereco, complemento, uf);
	}
}
