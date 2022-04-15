package praticaAula06;

public abstract class Imovel {
	private String local;
	private double valor;
	public Imovel(String local, double valor) {
		super();
		this.local = local;
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Imovel [local=" + local + ", valor=" + valor + "]";
	}
	public String getLocal() {
		return local;
	}
	public double getValor() {
		return valor;
	}
	public double calcularITBI() {
		return valor * 0.035;
	}
}
