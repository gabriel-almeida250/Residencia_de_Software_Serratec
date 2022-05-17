package br.com.senai.model;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean confirmado;
	public Luta(Lutador desafiante, Lutador desafiado, int rounds) {
		super();
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.rounds = rounds;
	}
	@Override
	public String toString() {
		return "\nDesafiante: " + desafiante + "\n\nDesafiado: " + desafiado + "\nRounds: " + rounds;
	}
	
	public boolean isConfirmado() {
		return confirmado;
	}
	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
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
    public String statusLuta(){
    String status;
    if (luta1.confirmarLuta()) {
			luta1.setConfirmado(true);
			return  status ="Luta confirmada";
		} else {
		return  status ="Luta cancelada";
		}
	}
}
