package exercicios1;

import java.util.ArrayList;

@SuppressWarnings("hiding")
public class Biblioteca <Livro>{

	private String responsavel;
	private ArrayList<Livro> listaLivros = new ArrayList<Livro>();

	public String getResponsavel() {
		return responsavel;
	}

	public ArrayList<Livro> getListalivros() {
		return listaLivros;
	}

	public void adicionar(Livro livro) {
		listaLivros.add(livro);
	}

	public void listar() {
		for (Livro livros : listaLivros) {
			System.out.println(livros);
		}
	}

	public int pesquisarFaixaDePreco(double valorInicial, double valorFinal) {
		int valor = (int) (valorInicial + valorFinal) / 2;
		return valor;
	}

	public double calcularTotalLivros() {
		return 0;		
	}
}
