package com.example.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ecommerce.dtos.ClienteDTO;
import com.example.ecommerce.dtos.EnderecoDTO;
import com.example.ecommerce.services.EnderecoService;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "cliente")
@JsonIdentityInfo(scope = Cliente.class, generator = ObjectIdGenerators.PropertyGenerator.class, 
property = "idCliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Integer idCliente;
	
	@Column(name = "email")
	private String emailCliente;
	
	@Column(name = "nome_completo")
	private String nomeCliente;
	
	@Column(name = "cpf")
	private String cpfCliente;
	
	@Column(name = "telefone")
	private String telefoneCliente;
	
	@ManyToOne
    @JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
    private Endereco endereco;
	

	public Cliente() {
		super();
	}

	public Cliente(Integer idCliente, String emailCliente, String nomeCliente, String cpfCliente,
			String telefoneCliente, Endereco endereco) {
		super();
		this.idCliente = idCliente;
		this.emailCliente = emailCliente;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.telefoneCliente = telefoneCliente;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", emailCliente=" + emailCliente + ", nomeCliente=" + nomeCliente
				+ ", cpfCliente=" + cpfCliente + ", telefoneCliente=" + telefoneCliente + ", endereco=" + endereco
				+ "]";
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Autowired
	EnderecoService enderecoService;
	
	public ClienteDTO converterEntidadeparaDTO() {
		ClienteDTO clienteDTO = new ClienteDTO();
		EnderecoDTO enderecoDTO = enderecoService.findEnderecoDTOById(clienteDTO.getEndereco().getIdEndereco());
		return new ClienteDTO(idCliente, emailCliente, nomeCliente, cpfCliente, telefoneCliente, enderecoDTO);
	}
}
