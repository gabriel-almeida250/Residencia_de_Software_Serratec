package br.com.senai.model;

import java.time.LocalDate;

public class Pedido {
	private int numero;
	private LocalDate dataDoPedido;
	private int quantidade;
	private double valor;
	private static double contador;

	public Pedido(int numero, LocalDate dataSoPedido, int quantidade, double valor) {
		this.numero = numero;
		this.dataDoPedido = dataSoPedido;
		this.quantidade = quantidade;
		this.valor = valor;


	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDataDoPedido() {
		return dataDoPedido;
	}

	public void setDataSoPedido(LocalDate dataSoPedido) {
		this.dataDoPedido = dataSoPedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double finalizarPedido() {
		if (dataDoPedido.getDayOfWeek().getValue() == 7) {
			double total = quantidade * valor * 0.9;
			contador += total = quantidade * valor;
			return total;
		}else {
			double total = quantidade * valor;
			contador += total = quantidade * valor;
			return total;}
		}
		public static double getContador() {
			return contador;
		}
		

	}

