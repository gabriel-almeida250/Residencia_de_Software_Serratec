package persistence;

import java.sql.Connection;

public class TestarConexao {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Connection connection = new ConnectionFactory().getConnection();

	}

}
