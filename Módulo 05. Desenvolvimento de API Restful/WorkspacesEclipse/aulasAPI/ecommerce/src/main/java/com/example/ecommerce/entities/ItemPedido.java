package com.example.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "item_pedido")
@JsonIdentityInfo(scope = ItemPedido.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "idItemPedido")
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_item_pedido")
	private Integer idItemPedido;

	@Column(name = "quantidade")
	private Integer qtdItemPedido;

	@Column(name = "preco_venda")
	private Float precoVenda;

	@Column(name = "percentual_desconto")
	private Float percentualDesconto;

	@Column(name = "valor_bruto")
	private Float valorBruto;

	@Column(name = "valor_liquido")
	private Float valorLiquido;

	@ManyToOne
	@JoinColumn(name = "id_pedido", referencedColumnName = "id_pedido")
	private Pedido pedido;

	@ManyToOne
	@JoinColumn(name = "id_produto", referencedColumnName = "id_produto")
	private Produto produto;

	public ItemPedido(Integer idItemPedido, Integer qtdItemPedido, Float precoVenda, Float percentualDesconto,
			Float valorBruto, Float valorLiquido, Pedido pedido, Produto produto) {
		super();
		this.idItemPedido = idItemPedido;
		this.qtdItemPedido = qtdItemPedido;
		this.precoVenda = precoVenda;
		this.percentualDesconto = percentualDesconto;
		this.valorBruto = valorBruto;
		this.valorLiquido = valorLiquido;
		this.pedido = pedido;
		this.produto = produto;
	}

	public ItemPedido() {
		super();
	}

	@Override
	public String toString() {
		return "ItemPedido [idItemPedido=" + idItemPedido + ", qtdItemPedido=" + qtdItemPedido + ", precoVenda="
				+ precoVenda + ", percentualDesconto=" + percentualDesconto + ", valorBruto=" + valorBruto
				+ ", valorLiquido=" + valorLiquido + ", pedido=" + pedido + ", produto=" + produto + "]";
	}
	

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
		return valorBruto = this.precoVenda * this.qtdItemPedido;
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

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
