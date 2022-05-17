package exercicios;

public class TesteLivro {

	public static void main(String[] args) {
		Livro l1 = new Livro("Fulano", "Livro do Fulano", 85);
		Livro l2 = new Livro("Marreco", "A História do Marreco, A Origem", 85);
		Operacao op1 = new Operacao("Empréstimo", l1);
		Operacao op2 = new Operacao("Venda", l2);
		
		l2.reajuste(6);
		l1.reajuste(0);
		op2.venderLivro();
		op1.emprestarLivro();
		
		System.out.println(op1);
		System.out.println(op2);
	}
}
