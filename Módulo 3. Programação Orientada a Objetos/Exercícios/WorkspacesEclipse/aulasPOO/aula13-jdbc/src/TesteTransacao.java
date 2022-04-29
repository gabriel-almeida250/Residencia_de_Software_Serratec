import java.sql.Connection;
import java.sql.SQLException;

import senai.model.Produto;

public class TesteTransacao {

	public static void main(String[] args) {
		Produto p1 = new Produto(null, "Goaiaba", "Fruta", 10.0, 3000);
		Produto p2 = new Produto(null, "Uva", "Passa", 10.0, 10000);
		Produto p3 = new Produto(null, "Pilha", "Palito", 10.0, 4000);
		Connection connection = ConnectionFactorySingleton.getConnection();
		try {
			connection.setAutoCommit(false);
			ProdutoDao dao = new ProdutoDao(connection); 
			dao.inserir(p1);
			dao.inserir(p2);
			dao.inserir(p3);
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}
