package study.jvecodev.maratonajava.polimorfismo;

import java.util.Scanner;

// Classe Teste
public class Teste {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Inicia o menu
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("======================================================");

            System.out.println("1 - Pagamento via Pix");
            System.out.println("2 - Pagamento via Boleto");
            System.out.println("3 - Pagamento via Cartão de Crédito");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opção:");
            String opcao = scanner.nextLine().trim();
            System.out.println("====================================");

            switch (opcao) {
                case "1":
                    Pix pix = new Pix(0, null, 1, "");
                    pix.processarPagamento();
                    break;

                case "2":
                    Boleto boleto = new Boleto(0, null, 2, 0, null);
                    boleto.processarPagamento();
                    break;

                case "3":
                    CartaoCredito cartao = new CartaoCredito(0, null, 3, "", "", "0");
                    cartao.processarPagamento();
                    break;

                case "4":
                    System.out.println("Saindo ...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
