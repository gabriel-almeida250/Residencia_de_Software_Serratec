package exercicio2Cliente;

public class Cliente {

    private int id;
    private String nome;
    private int idade;
    private String telefone;

    public Cliente(int id, String nome, int idade, String telefone) {
        super();
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nCliente [ID=" + id + ", Nome: " + nome + ", Idade: " + idade + ", Telefone: " + telefone + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void getTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String apresentarCliente() {
        System.out.println("===================");
        System.out.println("Cliente: " + this.nome);
        System.out.println("ID: " + this.id);
        System.out.println("Idade: " + this.idade);
        System.out.println("Número: " + this.telefone);
        System.out.println("===================");
        return apresentarCliente();
    }

}