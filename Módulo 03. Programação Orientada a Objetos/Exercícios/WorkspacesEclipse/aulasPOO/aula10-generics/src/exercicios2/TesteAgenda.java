package exercicios2;

public class TesteAgenda {
	public static void main(String[] args) {
		AgendaTelefonica agendaTelefonica = new AgendaTelefonica();
		agendaTelefonica.inserir("Gabriel", "988542173");
		agendaTelefonica.inserir("Fulano", "20204616");
		agendaTelefonica.inserir("Jos�", "987541236");
		
		agendaTelefonica.buscarNumero("Gabriel");
		agendaTelefonica.remover("Fulano");
		System.out.println("Voc� tem " + agendaTelefonica.tamanho() + " Contatos na agenda");
		agendaTelefonica.mostrarContatos();
	}
}