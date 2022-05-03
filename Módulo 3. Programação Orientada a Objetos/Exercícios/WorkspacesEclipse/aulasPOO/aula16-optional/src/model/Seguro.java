package model;

public class Seguro {
	private String corbetura;
	private Double valorSeguro;

	public Seguro() {
		// TODO Auto-generated constructor stub
	}

	public Seguro(String corbetura, Double valorSeguro) {
		super();
		this.corbetura = corbetura;
		this.valorSeguro = valorSeguro;
	}

	@Override
	public String toString() {
		return "Seguro [corbetura=" + corbetura + ", valorSeguro=" + valorSeguro + "]";
	}

	public String getCorbetura() {
		return corbetura;
	}

	public Double getValorSeguro() {
		return valorSeguro;
	}

}
