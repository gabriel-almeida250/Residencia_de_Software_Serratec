package praticaAula05;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private String confirmado;
	public Luta(Lutador desafiante, Lutador desafiado, int rounds) {
		super();
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.rounds = rounds;
		this.confirmado = statusLuta();
	}
	@Override
	public String toString() {
		return "\nDesafiante: " + desafiante + "\n\nDesafiado: " + desafiado + "\nRounds: " + rounds + "\nStatus da Luta: " + confirmado;
	}
	public String getConfirmado() {
		return confirmado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public int getRounds() {
		return rounds;
	}
	
	public boolean confirmarLuta() {
        if (desafiante != desafiado && desafiante.getCategoriaLuta() == desafiado.getCategoriaLuta()) {
            return true;
        } else {
            return false;
        }
    }
	public String statusLuta() {
		if (confirmarLuta() == true) {
			return confirmado = "\nLuta confirmada!! ";
		} else {
			return confirmado = "\nLuta anulada!!";
		}
	}
}