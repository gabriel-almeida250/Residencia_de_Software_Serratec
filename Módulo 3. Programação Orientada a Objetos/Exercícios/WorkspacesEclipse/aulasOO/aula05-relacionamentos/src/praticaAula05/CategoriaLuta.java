package praticaAula05;

public class CategoriaLuta {
	private int codigo;
	private String nomeCategoria;
	public CategoriaLuta(int codigo, String nomeCategoria) {
		super();
		this.codigo = codigo;
		this.nomeCategoria = nomeCategoria;
		
		
	}
	@Override
	public String toString() {
		return  codigo + "\nNome Categoria: " + nomeCategoria;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}

}
