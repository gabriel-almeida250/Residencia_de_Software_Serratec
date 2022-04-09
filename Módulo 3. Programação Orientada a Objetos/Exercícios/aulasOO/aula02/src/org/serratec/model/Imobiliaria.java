package org.serratec.model;

public class Imobiliaria {
	String tipoImovel;
	double valorImovel;
	String local;
	
	public void reajustarImovel() {
		if (tipoImovel.equals("Apto")) {
			valorImovel = valorImovel * 1.10;
		}else {
			valorImovel = valorImovel * 1.05;
		}
	}
	public static void main(String[] args) {
		Imobiliaria i1 = new Imobiliaria();
		i1.local="Centro";
		i1.tipoImovel="Apto";
		i1.valorImovel = 55800;
		
		i1.reajustarImovel();
		System.out.println("Valor reajustado é:"+i1.valorImovel);
	}
}
