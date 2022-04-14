package br.com.senai.model;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Sul América", "Checkup", "25256411");
		Medico medico = new Medico("Golden Cross", "2225545", "Ana Luiza");
		Anestesista anestesista = new Anestesista("Amil", "25412", "Carlos", "Geral");
		
		ControlePagamento cp = new ControlePagamento();
		
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		
		cp.calcularTotalPago(clinica);
		cp.calcularTotalPago(medico);
		cp.calcularTotalPago(anestesista);

		
		System.out.println(clinica);
		System.out.println("=========");
		System.out.println(medico);
		System.out.println("=========");
		System.out.println(anestesista);
		System.out.println("=========");
		System.out.println("O valor total pago é: " + String.format("%.2f", cp.getTotalPago()));
	}
	
	

}
