import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactorySingleton {
	private static String urlConexao="jdbc:postgresql://localhost:5432/testebd";
	private static String usuario = "postgres";
	private static String senha = "10971526";
	private static Connection connection;
	//Padr�o Singleton - tenho uma �nica conex�o
	public static Connection newConnection() {
		try {
			connection = DriverManager.getConnection(urlConexao, usuario, senha);
			System.out.println("Conectado");
		} catch (Exception e) {
			System.out.println("N�o foi poss�vel conectar!");
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
