package com.example.ecommerce.dtos;

import java.util.Date;
import java.util.List;

import com.example.ecommerce.entities.Pedido;

public class PedidoDTO {

	private Integer idPedido;

	private Date dataPedido;

	private Date dataEntrega;

	private Date dataEnvio;

	private Boolean statusPedido;

	List<ItemPedidoDTO> itemPedidosList;

	public PedidoDTO() {
		super();
	}

	public PedidoDTO(Integer idPedido, Date dataPedido, Date dataEntrega, Date dataEnvio, Boolean statusPedido) {
		super();
		this.idPedido = idPedido;
		this.dataPedido = dataPedido;
		this.dataEntrega = dataEntrega;
		this.dataEnvio = dataEnvio;
		this.statusPedido = statusPedido;
	}

	@Override
	public String toString() {
		return "PedidoDTO [idPedido=" + idPedido + ", dataPedido=" + dataPedido + ", dataEntrega=" + dataEntrega
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

	public List<ItemPedidoDTO> getItemPedidosList() {
		return itemPedidosList;
	}

	public void setItemPedidosList(List<ItemPedidoDTO> itemPedidosList) {
		this.itemPedidosList = itemPedidosList;
	}

	public Pedido converterDTOParaEntidade() {
		return new Pedido(idPedido, dataPedido, dataEntrega, dataEnvio, statusPedido);
	}
}
