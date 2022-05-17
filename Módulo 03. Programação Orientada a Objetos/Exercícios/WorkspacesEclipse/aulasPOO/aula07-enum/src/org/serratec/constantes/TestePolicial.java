package org.serratec.constantes;

public class TestePolicial {
 
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	Policial p1 =  new PolicialFederal("452.543.654-45", "Fulano", 6000, "Brasília", "123");
	Policial p2 =  new PolicialFederal("111.145.984-45", "Beutrano", 6500, "Rio de Janeiro", "321");

	System.out.println("Total de Policiais: " + Policial.getTotalPolicias());
	}
}
