package study.jvecodev.maratonajava.polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe Teste
public class Teste {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Pagamento> pagamentos = new ArrayList<>();

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
            System.out.println("4 - Listar Pagamentos");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine().trim();
            System.out.println("======================================================");

            switch (opcao) {
                case "1":
                    Pix pix = new Pix(0, null, 1, "");
                    pix.processarPagamento();
                    pix.exibirChavePix();
                    pagamentos.add(pix);
                    break;

                case "2":
                    Boleto boleto = new Boleto(0, null, 2, 0, null);
                    boleto.processarPagamento();
                    boleto.exibirCodigoBarras();
                    pagamentos.add(boleto);
                    break;

                case "3":
                    CartaoCredito cartao = new CartaoCredito(0, null, 3, "", "", "0");
                    cartao.processarPagamento();
                    cartao.exibirDetalhes();
                    pagamentos.add(cartao);
                    break;

                case "4":
                    listarPagamentos();
                    break;

                case "5":
                    System.out.println("Saindo ...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void listarPagamentos() {
        System.out.println("Listando Pagamentos:");
        for (Pagamento pagamento : pagamentos) {
            System.out.println("===================================================");
            if (pagamento instanceof CartaoCredito) {
                ((CartaoCredito) pagamento).exibirDetalhes();
            } else if (pagamento instanceof Boleto) {
                ((Boleto) pagamento).exibirCodigoBarras();
            } else if (pagamento instanceof Pix) {
                ((Pix) pagamento).exibirChavePix();
            }
        }
    }
}
