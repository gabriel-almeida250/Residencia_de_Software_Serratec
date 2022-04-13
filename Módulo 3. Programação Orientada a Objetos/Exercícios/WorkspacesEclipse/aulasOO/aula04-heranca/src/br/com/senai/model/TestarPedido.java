package br.com.senai.model;

import java.time.LocalDate;

public class TestarPedido {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(123, LocalDate.of(2022, 04, 12), 4, 12.0);
		Pedido pedido2 = new Pedido(321, LocalDate.of(2022, 04, 17), 2, 10.0);
		Pedido pedido3 = new Pedido(567, LocalDate.now(), 3, 100.0);

		System.out.println(pedido1.finalizarPedido());
		System.out.println(pedido2.finalizarPedido());
		System.out.println(pedido3.finalizarPedido());
		System.out.println(Pedido.getContador());
	}
}
