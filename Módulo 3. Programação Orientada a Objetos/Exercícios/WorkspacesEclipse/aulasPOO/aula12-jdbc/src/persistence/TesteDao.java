package persistence;

public class TesteDao {

	public static void main(String[] args) {
		ClienteDao dao = new ClienteDao();
		/*Cliente cliente = new Cliente(null, "Marta", "234433", "marta@gmail.com");
		dao.inserir(cliente);*/
		
		/*Cliente cliente = new Cliente(2, "Fulano", "2344335", "fulano@gmail.com");
		dao.atualizar(cliente);*/
		
		//dao.apagar(1);
		//System.out.println(dao.listar());
		/*for (Cliente cliente : dao.listar()) {
			System.out.println(cliente);
		}*/
		System.out.println(dao.buscar(2));
	}
}
