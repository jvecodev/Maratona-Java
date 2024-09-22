package study.jvecodev.maratonajava.polimorfismo;

import java.time.LocalDate;
import java.util.Scanner;

public class Boleto extends Pagamento {
    private int codigoBarras;
    private LocalDate dataVencimento;
    private static final Scanner scanner = new Scanner(System.in);

    public Boleto(double valor, LocalDate data, int metodoPagamento, int codigoBarras, LocalDate dataVencimento) {
        super(valor, data, metodoPagamento);
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
    }

    // Método exclusivo da classe Boleto
    public void exibirCodigoBarras() {

        System.out.println("Processando pagamento via Boleto de R$ " + getValor() +
                "\n Data de pagamento: " + getData() +
                "\n Data de vencimento: " + getDataVencimento());
        System.out.println("Código de barras do boleto: " + codigoBarras);
        System.out.println("==========================================");
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void processarPagamento() {
        System.out.print("Digite o valor do pagamento: ");
        double valor = scanner.nextDouble();
        setValor(valor);
        scanner.nextLine();

        System.out.print("Digite o codigo do Boleto: ");
        codigoBarras = scanner.nextInt();
        setCodigoBarras(codigoBarras);

        setData(LocalDate.now());
        setDataVencimento(LocalDate.now().plusDays(5));
        System.out.println("==========================================");

    }
}
