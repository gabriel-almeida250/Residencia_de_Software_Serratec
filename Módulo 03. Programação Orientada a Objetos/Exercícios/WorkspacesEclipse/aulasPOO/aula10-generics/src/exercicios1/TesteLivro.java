package exercicios1;

public class TesteLivro {
public static void main(String[] args) {

	Livro l1 = new Livro("Fulano de Tal", "Fulaninho", 100);
	Livro l2 = new Livro("Beutrano de Tal", "Beutraninho", 200);
	Biblioteca<Livro> biblioteca = new Biblioteca<Livro>();
	biblioteca.adicionar(l1);
	biblioteca.adicionar(l2);
	biblioteca.listar();
	System.out.println(biblioteca.pesquisarFaixaDePreco(l1.getPreco(), l2.getPreco()));
}
}
