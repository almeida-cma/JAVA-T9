import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public double getAltura() {
        return altura;
    }
    
    // Setters com validação
    public boolean setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: Nome não pode ser vazio!");
            return false;
        }
        this.nome = nome;
        return true;
    }
    
    public boolean setIdade(int idade) {
        if (idade < 0 || idade > 120) {
            System.out.println("Erro: Idade deve ser entre 0 e 120 anos!");
            return false;
        }
        this.idade = idade;
        return true;
    }
    
    public boolean setAltura(double altura) {
        if (altura <= 0 || altura > 3.0) {
            System.out.println("Erro: Altura deve ser entre 0 e 3 metros!");
            return false;
        }
        this.altura = altura;
        return true;
    }
    
    // Método para ler dados do console
    public static Pessoa lerDadosPessoa(Scanner scanner) {
        Pessoa p = new Pessoa();
        
        // Ler nome
        while (true) {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            if (p.setNome(nome)) break;
        }
        
        // Ler idade
        while (true) {
            try {
                System.out.print("Digite a idade: ");
                int idade = Integer.parseInt(scanner.nextLine());
                if (p.setIdade(idade)) break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número válido para idade!");
            }
        }
        
        // Ler altura
        while (true) {
            try {
                System.out.print("Digite a altura (em metros): ");
                double altura = Double.parseDouble(scanner.nextLine());
                if (p.setAltura(altura)) break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número válido para altura!");
            }
        }
        
        return p;
    }
    
    // Método para mostrar informações
    public void mostrarInformacoes() {
        System.out.println("\nInformações da Pessoa:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
    }
}
