package javaapplication1;

public class Contrato {
    private int id;
    private Cliente cliente;
    private String descricaoServico;
    private double valor;
    private String status;

    public Contrato(int id, Cliente cliente, String descricaoServico, double valor, String status) {
        this.id = id;
        this.cliente = cliente;
        this.descricaoServico = descricaoServico;
        this.valor = valor;
        this.status = status;
    }

    public void gerarRecibo() {
        System.out.println("-----------------------------------");
        System.out.println("📄 RESUMO DO CONTRATO GERADO");
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Serviço: " + descricaoServico);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}