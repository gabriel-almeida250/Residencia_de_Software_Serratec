package com.example.ecommerce.dtos;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ecommerce.entities.Cliente;
import com.example.ecommerce.entities.Endereco;
import com.example.ecommerce.services.EnderecoService;

public class ClienteDTO {

	private Integer idCliente;

	private String emailCliente;

	private String nomeCliente;

	private String cpfCliente;

	private String telefoneCliente;

	private EnderecoDTO endereco;

	public ClienteDTO() {
		super();
	}

	public ClienteDTO(Integer idCliente, String emailCliente, String nomeCliente, String cpfCliente,
			String telefoneCliente, EnderecoDTO endereco) {
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
		return "ClienteDTO [idCliente=" + idCliente + ", emailCliente=" + emailCliente + ", nomeCliente=" + nomeCliente
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

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
	@Autowired
	EnderecoService enderecoService;
	
	public Cliente converterDTOparaEntidade() {
		Cliente cliente = new Cliente();
		Endereco endereco = enderecoService.findEnderecoById(cliente.getEndereco().getIdEndereco());
		return new Cliente(idCliente, emailCliente, nomeCliente, cpfCliente, telefoneCliente, endereco);
	}
}
