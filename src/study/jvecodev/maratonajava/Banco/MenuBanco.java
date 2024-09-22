package study.jvecodev.maratonajava.Banco;

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
            System.out.print("(1) Cadastro \n" +
                    "(2) Sacar\n" +
                    "(3) Depositar\n" +
                    "(4) Pagar\n" +
                    "(5) Verificar Saldo\n" +
                    "(6) Alterar infos pessoais\n" +
                    "(7) Obter informações pessoais\n" +
                    "(8) Sair\n");

            System.out.println(" ");
            System.out.print("Digite a sua opção:");
            String opcao = scanner.nextLine().trim();

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
        String nome;
        while (true) {
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();
            if (nome != null &&  nome.matches("[a-zA-Z]+")) {
                break;
            }
            System.out.println("Nome incorreto. Deve conter pelo menos 5 letras e não pode conter números.");
        }

        String email;
        while (true) {
            System.out.print("Digite seu email: ");
            email = scanner.nextLine();
            if (email != null && email.contains("@") && email.length() >= 5) {
                break;
            }
            System.out.println("Email incorreto. Deve conter '@' e ter pelo menos 5 caracteres.");
        }

        String senha;
        while (true) {
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();
            if (senha != null && senha.length() >= 8 && senha.matches(".*[A-Z].*") && senha.matches(".*\\d.*")) {
                break;
            }
            System.out.println("Senha incorreta. Deve ter pelo menos 8 caracteres, uma letra maiúscula e um número.");
        }

        int idade;
        while (true) {
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner
            if (idade >= 0 && idade <= 150) {
                break;
            }
            System.out.println("Idade não permitida. Deve estar entre 0 e 150 anos.");
        }

        String cpf;
        while (true) {
            System.out.print("Digite seu CPF: ");
            cpf = scanner.nextLine();
            if (cpf != null && cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                break;
            }
            System.out.println("CPF inválido. Deve estar no formato ###.###.###-##.");
        }

        cliente = new Cliente(nome, email, senha, idade, cpf);
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
            String cpf = cliente.getcpf();

            int numDigitosVisiveis = 4; // Número de dígitos da senha que serão visíveis
            String senhaOcultada = "*".repeat(senha.length() - numDigitosVisiveis)
                    + senha.substring(senha.length() - numDigitosVisiveis);

            int cpfVisivel = 4; // Número de dígitos da senha que serão visíveis
            String cpfOcultado = "*".repeat(cpf.length() - cpfVisivel)
                    + cpf.substring(cpf.length() - numDigitosVisiveis);




            System.out.println("Informações do Cliente:");
            System.out.println("Nome: " + nome);
            System.out.println("Email: " + email);
            System.out.println("Senha: " + senhaOcultada);
            System.out.println("Idade: " + idade);
            System.out.println("Cpf: " + cpfOcultado);
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
            String novoNome;
            while (true) {
                System.out.print("Digite seu nome: ");
                novoNome = scanner.nextLine();
                if (novoNome != null &&  novoNome.matches("[a-zA-Z]+")) {
                    break;
                }
                System.out.println("Nome incorreto. Deve conter pelo menos 5 letras e não pode conter números.");
            }

            String novoEmail;
            while (true) {
                System.out.print("Digite seu email: ");
                novoEmail = scanner.nextLine();
                if (novoEmail != null && novoEmail.contains("@") && novoEmail.length() >= 5) {
                    break;
                }
                System.out.println("Email incorreto. Deve conter '@' e ter pelo menos 5 caracteres.");
            }

            String novaSenha;
            while (true) {
                System.out.print("Digite sua senha: ");
                novaSenha = scanner.nextLine();
                if (novaSenha != null && novaSenha.length() >= 8 && novaSenha.matches(".*[A-Z].*") && novaSenha.matches(".*\\d.*")) {
                    break;
                }
                System.out.println("Senha incorreta. Deve ter pelo menos 8 caracteres, uma letra maiúscula e um número.");
            }

            int novaIdade;
            while (true) {
                System.out.print("Digite sua idade: ");
                novaIdade = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do scanner
                if (novaIdade >= 0 && novaIdade <= 150) {
                    break;
                }
                System.out.println("Idade não permitida. Deve estar entre 0 e 150 anos.");
            }

        }
        System.out.println("====================================");
    }


}
