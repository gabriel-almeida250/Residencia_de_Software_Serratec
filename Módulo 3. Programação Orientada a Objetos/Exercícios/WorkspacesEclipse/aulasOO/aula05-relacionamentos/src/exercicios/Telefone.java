package exercicios;

public class Telefone {
    private String numero;

    public Telefone(String numero) {
        super();
        this.numero = numero;
    }
    

    @Override
	public String toString() {
		return numero;
	}


	public String getNumero() {
        return numero;
    }

}