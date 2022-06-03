package com.example.ecommerce.dtos;

public class ItemPedidoDTO {
	
	private Integer idItemPedido;

	private Integer qtdItemPedido;

	private Float precoVenda;

	private Float percentualDesconto;

	private Float valorBruto;

	private Float valorLiquido;

	private PedidoDTO pedido;

	private ProdutoDTO produto;

	public Integer getIdItemPedido() {
		return idItemPedido;
	}

	public void setIdItemPedido(Integer idItemPedido) {
		this.idItemPedido = idItemPedido;
	}

	public Integer getQtdItemPedido() {
		return qtdItemPedido;
	}

	public void setQtdItemPedido(Integer qtdItemPedido) {
		this.qtdItemPedido = qtdItemPedido;
	}

	public Float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Float precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Float getPercentualDesconto() {
		return percentualDesconto;
	}

	public void setPercentualDesconto(Float percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public Float getValorBruto() {
		
		return valorBruto;
	}

	public void setValorBruto(Float valorBruto) {
		this.valorBruto = valorBruto;
	}

	public Float getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(Float valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public PedidoDTO getPedido() {
		return pedido;
	}

	public void setPedido(PedidoDTO pedido) {
		this.pedido = pedido;
	}

	public ProdutoDTO getProduto() {
		return produto;
	}

	public void setProduto(ProdutoDTO produto) {
		this.produto = produto;
	}
	
	
}
