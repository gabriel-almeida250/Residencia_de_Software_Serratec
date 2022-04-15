package praticaAula05;

public class Lutador {
	private String nomeLutador;
	private CategoriaLuta categoriaLuta;
	private int idade;
	private double peso;
	
	public Lutador(String nomeLutador, CategoriaLuta categoriaLuta, int idade, double peso) {
		super();
		this.nomeLutador = nomeLutador;
		this.categoriaLuta = categoriaLuta;
		this.idade = idade;
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "\nLutador: " + nomeLutador + "\nCategoria Luta: " + categoriaLuta + "\nIdade: " + idade
				+ " anos" + "\nPeso: " + peso + "Kg";
	}
	public String getNomeLutador() {
		return nomeLutador;
	}
	public CategoriaLuta getCategoriaLuta() {
		return categoriaLuta;
	}
	public int getIdade() {
		return idade;
	}
	public double getPeso() {
		return peso;
	}
	

}
