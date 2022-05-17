package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String urlConexao="jdbc:postgresql://localhost:5432/testebd";
	private String usuario = "postgres";
	private String senha = "10971526";
	
	private Connection connection;

	public Connection getConnection() {
		System.out.println("Conectando ao banco de dados!");
		try {
			connection = DriverManager.getConnection(urlConexao, usuario, senha);
			if (connection == null) {
				System.out.println("Não foi possível conectar");
			}else {
				System.out.println("Conectado com sucesso!");
			}
		} catch (SQLException e) {
			System.out.println("Erro ao conectar ao banco de dados!");
		}
		return connection;
	}

}
