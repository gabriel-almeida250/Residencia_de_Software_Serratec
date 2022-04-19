package org.serratec.enumeradores;

import org.serratec.enumeradores.Pessoa.Escolaridade;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Fulano", "Fulano@gmail.com", Setor.COMPRAS, EstadoCivil.SOLTEIRO, Escolaridade.GRADUACAO);
		System.out.println(p1);
		System.out.println(p1.getSetor().getSala());
		System.out.println(p1.getSetor().ordinal());
		//System.out.println(p1.getSetor().valueOf("CONTABILIDADE"));
		
		for (EstadoCivil estadoCivil : EstadoCivil.values()) {
			System.out.println(estadoCivil);
			
		}
	}

}
