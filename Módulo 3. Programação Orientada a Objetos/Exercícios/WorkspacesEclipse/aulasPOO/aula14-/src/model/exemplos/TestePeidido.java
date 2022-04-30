package model.exemplos;

import model.Pedido;

public class TestePeidido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		pedido.finalizarPedido();
		
		System.out.println("---------------------");
		System.out.println("----Classe Anônima---");
		Pedido pedido2 = new Pedido() {

			@Override
			public void finalizarPedido() {
				System.out.println("Pedido encerrado");
			}
			
	};
	pedido2.finalizarPedido();
	}
}
