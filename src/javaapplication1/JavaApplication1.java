package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("JP SOLUCOES - SISTEMA ACADEMICO");
        System.out.println("=====================================");
        
        Usuario admin = new Usuario(1, "admin", "1234", "DIRETOR");
        System.out.println("Login de Acesso:");
        System.out.print("Usuario: ");
        String login = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        
        if (admin.autenticar(login, senha)) {
            System.out.println("\nAcesso Permitido! Bem-vindo, Diretor.\n");
            
            System.out.println("--- NOVO CADASTRO DE CLIENTE ---");
            System.out.print("Nome do Cliente: ");
            String nomeCli = scanner.nextLine();
            System.out.print("CPF: ");
            String cpfCli = scanner.nextLine();
            
            Cliente novoCliente = new Cliente(101, nomeCli, cpfCli, "49999999999");
            novoCliente.exibirDadosCliente();
            
            System.out.println("\n--- VINCULAR SERVICO ---");
            System.out.print("Descricao (Ex: Limpa Nome): ");
            String servico = scanner.nextLine();
            System.out.print("Valor do Contrato (R$): ");
            double valor = scanner.nextDouble();
            
            Contrato novoContrato = new Contrato(5001, novoCliente, servico, valor, "Aguardando Pagamento");
            System.out.println("\nSalvando no banco de dados ficticio...\n");
            
            novoContrato.gerarRecibo();
            
        } else {
            System.out.println("\nAcesso Negado.");
        }
        
        scanner.close();
    }
}