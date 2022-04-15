package br.com.senai.model;

public class TesteLuta {

	public static void main(String[] args) {
		CategoriaLuta pm = new CategoriaLuta(1, "Peso Médio");
		CategoriaLuta pp = new CategoriaLuta(2, "Peso Pesado");
		Lutador lutador1 = new Lutador("Rebeca", pm, 20, 70);
		Lutador lutador2 = new Lutador("Juliana", pm, 25, 73);
		Lutador lutador3 = new Lutador("Gabriel", pp, 20, 96);
		Luta luta1 = new Luta(lutador2, lutador3, 7);

		System.out.println(luta1);
		if (luta1.confirmarLuta()) {
			System.out.println("Luta confirmada");
			luta1.setConfirmado(true);
		} else {
			System.out.println("Luta cancelada");
		}
	}