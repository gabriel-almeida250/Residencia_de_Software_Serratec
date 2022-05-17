package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteDao {
	private Connection connection;

	public ClienteDao() {
		connection = new ConnectionFactory().getConnection();
	}
	
	public void inserir(Cliente cliente) {
		try {
			String sql = "Insert into cliente (nome,telefone,email) values(?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			System.out.println("Não foi possível gravar!");
		}
	}
	
	public void atualizar(Cliente cliente) {
		try {
			String sql = "update cliente set nome=?,telefone=?,email=? where codigo=?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.setInt(4, cliente.getCodigo());
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Não possível atualizar o registro !");
		}
	}
	public void apagar(int codigo) {
		try {
			String sql = "delete from cliente where codigo=?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao excluir um cliente!");
		}
		
	}
	
	public List<Cliente> listar(){
		String sql = "select * from cliente";
		List<Cliente>clientes = new ArrayList<>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente(rs.getInt("codigo"), 
											  rs.getString("nome"), 
											  rs.getString("telefone"), 
											  rs.getString("email"));
				clientes.add(cliente);
			}
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao listar");
		}
		return clientes;
	}
	public Cliente buscar(int codigo) {
		String sql = "select * from cliente where codigo=?";
		Cliente cliente = null;
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, codigo);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				 cliente = new Cliente(rs.getInt("codigo"), 
						  			   rs.getString("nome"), 
						  			   rs.getString("telefone"), 
						  			   rs.getString("email"));
			}
			stmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Erro ao buscar");
		}
		return cliente;
	}
		
}
