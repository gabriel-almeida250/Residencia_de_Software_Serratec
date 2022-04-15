package praticaAula06;

public class TotalTributos {
	private double total;

	public double getTotal() {
		return total;
	}

	public void setTotaltributos(double total) {
		this.total = total;
	}
	public void calcularTotalPago(Tributos tributos) {
		total += tributos.calcularICMS();
		total += tributos.calcularImpostoDeRenda();
		//System.out.println(tributos.toString() + "\n" + " ICMS:" + tributos.calcularICMS());
		//System.out.println(tributos.toString() + "\n" + " IR" + tributos.calcularImpostoDeRenda());
	}

}
