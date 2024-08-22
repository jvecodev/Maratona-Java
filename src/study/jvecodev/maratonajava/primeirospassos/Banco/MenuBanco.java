package study.jvecodev.maratonajava.primeirospassos.Banco;

import java.util.Scanner;

public class MenuBanco {

    private static final Scanner scanner = new Scanner(System.in);
    private static Cliente cliente;
    private static FerramentasBanco ferramentasBanco;

    public static void main(String[] args) {
        // Inicia o menu
        menu();
    }

    public static void menu() {
        while (true) { // Loop para manter o menu ativo após cada operação
            System.out.print("(1) Cadastro\n" +
                    "(2) Sacar\n" +
                    "(3) Depositar\n" +
                    "(4) Pagar\n" +
                    "(5) Verificar Saldo\n" +
                    "(6) Alterar infos pessoais\n" +
                    "(7) Obter informações pessoais\n" +
                    "(8) Sair\n");

            System.out.println(" ");
            System.out.print("Digite a sua opção:");
            String opcao = scanner.nextLine();

            System.out.println("====================================");

            switch (opcao) {
                case "1":
                    cadastrarCliente();
                    break;
                case "2":
                    sacarDinheiro();
                    break;
                case "3":
                    depositarDinheiro();
                    break;
                case "4":
                    pagarConta();
                    break;
                case "5":
                    verificarSaldo();
                    break;
                case "6":
                    alterarInformacoesPessoais();
                    break;
                case "7":
                    obterInformacoes();
                    break;
                case "8":
                    System.out.println("Saindo do sistema...");
                    return; // Sai do método main e encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void cadastrarCliente() {
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        cliente = new Cliente(nome, email, senha, idade);
        ferramentasBanco = new FerramentasBanco(0.0); // Inicializa com saldo 0.0

        System.out.println("Cliente cadastrado com sucesso!");

        System.out.println("====================================");
    }

    public static void obterInformacoes() {
        if (cliente == null) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            String nome = cliente.getnome();
            String email = cliente.getEmail();
            String senha = cliente.getSenha();
            int idade = cliente.getIdade();

            int numDigitosVisiveis = 4; // Número de dígitos da senha que serão visíveis
            String senhaOcultada = "*".repeat(senha.length() - numDigitosVisiveis)
                    + senha.substring(senha.length() - numDigitosVisiveis);

            System.out.println("Informações do Cliente:");
            System.out.println("Nome: " + nome);
            System.out.println("Email: " + email);
            System.out.println("Senha: " + senhaOcultada);
            System.out.println("Idade: " + idade);
        }

        System.out.println("====================================");
    }

    public static void sacarDinheiro() {
        if (cliente == null) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.print("Digite o valor a sacar: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer do scanner

            ferramentasBanco.sacar(valor);
        }
        System.out.println("====================================");
    }

    public static void depositarDinheiro() {
        if (cliente == null) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.print("Digite o valor a depositar: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer do scanner

            ferramentasBanco.depositar(valor);
        }
        System.out.println("====================================");
    }

    public static void pagarConta() {
        if (cliente == null) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.print("Digite o valor a pagar: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer do scanner

            ferramentasBanco.pagarConta(valor);
        }
        System.out.println("====================================");
    }

    public static void verificarSaldo() {
        if (cliente == null) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("Seu saldo atual é: R$" + ferramentasBanco.verificarSaldo());
        }
        System.out.println("====================================");
    }

    public static void alterarInformacoesPessoais() {
        if (cliente == null) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.print("Digite o novo nome: ");
            String novoNome = scanner.nextLine();

            System.out.print("Digite o novo email: ");
            String novoEmail = scanner.nextLine();

            System.out.print("Digite a nova senha: ");
            String novaSenha = scanner.nextLine();

            System.out.print("Digite a nova idade: ");
            int novaIdade = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            ferramentasBanco.alterarInfoPessoal(cliente, novoNome, novoEmail, novaSenha, novaIdade);
            System.out.println("Informações pessoais alteradas com sucesso.");
        }
        System.out.println("====================================");
    }
}
