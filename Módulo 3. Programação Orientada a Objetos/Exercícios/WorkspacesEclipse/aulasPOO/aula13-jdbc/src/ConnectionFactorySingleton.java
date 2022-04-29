import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactorySingleton {
	private static String urlConexao="jdbc:postgresql://localhost:5432/testebd";
	private static String usuario = "postgres";
	private static String senha = "10971526";
	private static Connection connection;
	//Padrão Singleton - tenho uma única conexão
	public static Connection newConnection() {
		try {
			connection = DriverManager.getConnection(urlConexao, usuario, senha);
			System.out.println("Conectado");
		} catch (Exception e) {
			System.out.println("Não foi possível conectar!");
		}
		return connection;
	}

	public static Connection getConnection() {
		if (connection == null) {
			connection = newConnection();
		}
		return connection;
	}
}
