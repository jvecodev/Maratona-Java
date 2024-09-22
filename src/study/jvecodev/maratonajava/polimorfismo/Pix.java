package study.jvecodev.maratonajava.polimorfismo;

import java.time.LocalDate;
import java.util.Scanner;


// Classe Pix
public class Pix extends Pagamento {
    private String chavePix;


    private static final Scanner scanner = new Scanner(System.in);

    public Pix(double valor, LocalDate data, int metodoPagamento, String chavePix) {
        super(valor, data, metodoPagamento);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.print("Digite o Valor do Pagamento: ");
        Double valor = scanner.nextDouble();
        setValor(valor);
        scanner.nextLine();

        System.out.print("Digite a chave Pix: ");
        String chavePix = scanner.nextLine();
        setData(LocalDate.now());

        System.out.println("Processando pagamento via Pix de R$ "  + getValor() +
                "\n Chave Pix: " + chavePix +
                "\n Data do pagamento: " + getData());


    }
}
