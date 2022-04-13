package br.com.senai.model;

public class TestarMedico {

	public static void main(String[] args) {
		Medico anestesista = new Anestesista("123", "Fulano", 220, 1000);
		Medico medico = new Medico("2343", "Ana", 1000);
		
	
		System.out.println(anestesista);
		System.out.println(medico);
	}
}
