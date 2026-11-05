package javaapplication1;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente(int id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void exibirDadosCliente() {
        System.out.println("CLIENTE CADASTRADO: " + this.nome + " | CPF: " + this.cpf);
    }

    public String getNome() { return nome; }
}