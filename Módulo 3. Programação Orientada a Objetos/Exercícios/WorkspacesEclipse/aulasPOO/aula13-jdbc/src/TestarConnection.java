import java.sql.Connection;

public class TestarConnection {

	static {
		System.out.println("Bloco de inicialização estático");
	}
	public static void main(String[] args) {
		Connection connection = ConnectionFactorySingleton.getConnection();
		System.out.println(connection);
		
	}

}
