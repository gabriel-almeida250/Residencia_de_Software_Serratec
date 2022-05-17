package model.persistence;

import java.sql.Connection;
import java.util.Optional;

import model.Funcionario;

public class FuncionarioDao {
	@SuppressWarnings("unused")
	public FuncionarioDao() {
		Connection connection = ConnectionFactorySingleton.getConnection();
	}
	
	public Optional<Funcionario> buscar(String nome) {
		
		return Optional.ofNullable(null);
	}
}
