package praticaAula05;

public class Plano {
	protected String nome;
	protected double valorPago = 80.0;
	protected double valorIss = 5.0;
	
	public Plano(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Plano: " + nome + "\nValor Pago: " + String.format("%.2f", valorPago);
	}
	public String getNome() {
		return nome;
	}
	public double getValorPago() {
		return valorPago;
	}
	public double getValorIss() {
		return valorIss;
	}
	public double calcularPagamento() {
		valorPago = valorPago - (valorPago * valorIss)/100;
		return valorPago;
	}
	

}
