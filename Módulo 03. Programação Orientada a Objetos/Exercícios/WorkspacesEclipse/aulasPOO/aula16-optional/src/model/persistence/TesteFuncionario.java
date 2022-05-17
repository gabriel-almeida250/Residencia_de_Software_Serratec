package model.persistence;

import java.util.Optional;

import model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		FuncionarioDao dao = new FuncionarioDao();
		
		Optional<Funcionario> funcionario = dao.buscar("Gabriel");
		/*if (funcionario.isPresent()) {
			System.out.println("Resultado " + funcionario.get().getNome());
		}*/
		
		funcionario.ifPresent(f -> f.getNome());
		//Optional<Funcionario> f2 = funcionario.orElse(new Funcionario(1, "Ana", "RH", 1500.)).getNome();
	}

}
