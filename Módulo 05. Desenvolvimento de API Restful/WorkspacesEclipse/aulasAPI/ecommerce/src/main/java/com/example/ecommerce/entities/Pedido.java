package com.example.ecommerce.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.example.ecommerce.dtos.PedidoDTO;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "pedido")
@JsonIdentityInfo(scope = Pedido.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "idPedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private Integer idPedido;

	@Column(name = "data_pedido")
	private Date dataPedido;

	@Column(name = "data_entrega")
	private Date dataEntrega;

	@Column(name = "data_envio")
	private Date dataEnvio;

	@Column(name = "status")
	private Boolean statusPedido;

	@OneToMany(mappedBy = "pedido")
	List<ItemPedido> itemPedidosList;
	
	@Transient
    public Float getTotalItemPedidos() {
        Float soma = 0f;
        List<ItemPedido> itemPedidos = getItemPedidosList();
        for (ItemPedido op : itemPedidos) {
            soma += op.getValorLiquido();
        }
        return soma;
    }

    @Transient
    public Integer getNumberOfProducts() {
        return this.itemPedidosList.size();
    }

	public Pedido(Integer idPedido, Date dataPedido, Date dataEntrega, Date dataEnvio, Boolean statusPedido) {
		super();
		this.idPedido = idPedido;
		this.dataPedido = dataPedido;
		this.dataEntrega = dataEntrega;
		this.dataEnvio = dataEnvio;
		this.statusPedido = statusPedido;
	}

	public Pedido() {
		super();
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", dataPedido=" + dataPedido + ", dataEntrega=" + dataEntrega
				+ ", dataEnvio=" + dataEnvio + ", statusPedido=" + statusPedido + ", itemPedidosList=" + itemPedidosList
				+ "]";
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public Boolean getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(Boolean statusPedido) {
		this.statusPedido = statusPedido;
	}

	public List<ItemPedido> getItemPedidosList() {
		return itemPedidosList;
	}

	public void setItemPedidosList(List<ItemPedido> itemPedidosList) {
		this.itemPedidosList = itemPedidosList;
	}

	public PedidoDTO converterEntidadeParaDTO() {
		return new PedidoDTO(idPedido, dataPedido, dataEntrega, dataEnvio, statusPedido);
	}
}
