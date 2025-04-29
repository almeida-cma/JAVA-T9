import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("== SISTEMA DE CADASTRO DE PESSOAS ==");
        System.out.println("1. Cadastrar nova pessoa");
        System.out.println("2. Exibir pessoas cadastradas");
        System.out.println("3. Sair");
        
        Pessoa[] pessoas = new Pessoa[10];
        int totalPessoas = 0;
        
        while (true) {
            System.out.print("\nEscolha uma opção: ");
            String opcao = scanner.nextLine();
            
            switch (opcao) {
                case "1":
                    if (totalPessoas < pessoas.length) {
                        System.out.println("\nCadastro da Pessoa " + (totalPessoas + 1));
                        pessoas[totalPessoas] = Pessoa.lerDadosPessoa(scanner);
                        totalPessoas++;
                        System.out.println("Pessoa cadastrada com sucesso!");
                    } else {
                        System.out.println("Limite de pessoas atingido!");
                    }
                    break;
                    
                case "2":
                    if (totalPessoas == 0) {
                        System.out.println("Nenhuma pessoa cadastrada ainda!");
                    } else {
                        System.out.println("\nPESSOAS CADASTRADAS:");
                        for (int i = 0; i < totalPessoas; i++) {
                            System.out.println("\nPessoa " + (i + 1));
                            pessoas[i].mostrarInformacoes();
                        }
                    }
                    break;
                    
                case "3":
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
