package study.jvecodev.maratonajava.polimorfismo;

import java.time.LocalDate;
import java.util.Scanner;

public class Pix extends Pagamento {
    private String chavePix;
    private static final Scanner scanner = new Scanner(System.in);

    public Pix(double valor, LocalDate data, int metodoPagamento, String chavePix) {
        super(valor, data, metodoPagamento);
        this.chavePix = chavePix;
    }

    // Método exclusivo da classe Pix
    public void exibirChavePix() {

        System.out.println("Chave Pix: " + chavePix);
        System.out.println("Processando pagamento via Pix de R$ " + getValor() +
                "\n Data do pagamento: " + getData());
        System.out.println("======================================================");
    }

    @Override
    public void processarPagamento() {
        System.out.print("Digite o Valor do Pagamento: ");
        Double valor = scanner.nextDouble();
        setValor(valor);
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Escolha o Formato da Chave Pix:" +
                "\n (1) CPF" +
                "\n (2) EMAIL" +
                "\n (3) NÚMERO");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer novamente

        switch (opcao) {
            case 1:
                System.out.print("Digite o CPF: ");
                chavePix = scanner.nextLine();
                break;
            case 2:
                System.out.print("Digite o EMAIL: ");
                chavePix = scanner.nextLine();
                break;
            case 3:
                System.out.print("Digite o NÚMERO de telefone: ");
                chavePix = scanner.nextLine();
                break;
            default:
                System.out.println("Opção inválida!");
                return; // Sai do método se a opção for inválida
        }

        setData(LocalDate.now());
        System.out.println("==========================================");
    }
}
