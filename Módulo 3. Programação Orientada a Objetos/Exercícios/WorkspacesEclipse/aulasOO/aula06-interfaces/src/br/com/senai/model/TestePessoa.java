package br.com.senai.model;

public class TestePessoa {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Fulano", "Rua A 80 Centro", 85000, 313131351);
		PessoaJuridica pj = new PessoaJuridica("XPTO LTDA", "Rua Bingen 185, Bingen", 250900, "12541", "XPTO comércio roupas");
		TotalTributos tt = new TotalTributos();
			
		System.out.println("Total IR: " + pf.calcularImpostoDeRenda());
		System.out.println("Total IR PJ: " + pj.calcularImpostoDeRenda());
		System.out.println("Total ICMS PJ: " + pj.calcularICMS());
		
		tt.calcularTotalPago(pf);
		tt.calcularTotalPago(pj);
		
		System.out.println("Tota geral: " + tt.getTotal());
	}

}
