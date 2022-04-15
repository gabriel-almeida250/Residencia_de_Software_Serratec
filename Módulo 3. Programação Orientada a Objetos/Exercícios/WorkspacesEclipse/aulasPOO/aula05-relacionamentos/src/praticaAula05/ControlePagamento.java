package praticaAula05;

public class ControlePagamento {
	private double totalPago;

	public void setTotalPago(double totalPago) {
		this.totalPago = totalPago;
	}

	public double getTotalPago() {
		return totalPago;
	}
	
	public void calcularTotalPago(Plano plano) {
		totalPago += plano.getValorPago();
	}
}
