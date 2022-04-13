package br.com.senai.model;

public class TesteIR {

	public static void main(String[] args) {
		ImpostoDeRenda ir1 = new PessoaFisica("Gabriel", 11000, "123.454.654-12", "50.254.332-9");
		PessoaJuridica ir2 = new PessoaJuridica("Xpto comercio LTDA", 11000, "34.466.654/0001-10", "123");

		System.out.println(ir1);
		System.out.println("---------");
		System.out.println(ir2);

	}

}
