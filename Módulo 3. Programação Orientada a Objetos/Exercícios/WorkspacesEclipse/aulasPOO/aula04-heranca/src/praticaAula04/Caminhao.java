package praticaAula04;

public class Caminhao extends Veiculo {
	private int cargaMaxima;

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	//Sobreescrita de método
	//Overrinding
	@Override
	public void adicionarValorIPVA(double valor) {
		valorIPVA += valor * 2;
		//super.adicionarValorIPVA(valor*2);
	}
}
