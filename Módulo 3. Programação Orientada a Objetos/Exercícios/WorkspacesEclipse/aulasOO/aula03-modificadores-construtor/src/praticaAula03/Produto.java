package praticaAula03;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	
	
	public Produto(int codigo, String descricao, int valor) {
		this.descricao = descricao;
		this.codigo = codigo;
		this.valor = valor;
		System.out.println("Construtor cheio");
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	

}
