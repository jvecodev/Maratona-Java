package study.jvecodev.maratonajava.polimorfismo;

import java.time.LocalDate;
import java.util.Scanner;

// Classe CartaoCredito
public class CartaoCredito extends Pagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String cvv;

    private static final Scanner scanner = new Scanner(System.in);

    public CartaoCredito(double valor, LocalDate data, int metodoPagamento, String numeroCartao, String nomeTitular, String cvv) {
        super(valor, data, metodoPagamento);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.cvv = cvv;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getCvv() {
        return cvv;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public void processarPagamento() {
        System.out.print("Digite o Valor do Pagamento: ");
        Double valor = scanner.nextDouble();
        setValor(valor);
        scanner.nextLine(); // Limpa o buffer

        System.out.print("Digite o número do cartão: ");
         numeroCartao= scanner.nextLine();
        setNumeroCartao(numeroCartao);

        System.out.print("Digite o nome do titular: ");
        nomeTitular = scanner.nextLine();
        setNomeTitular(nomeTitular);

        System.out.print("Digite o CVV: ");
        cvv = scanner.nextLine();
        setCvv(cvv);


        setData(LocalDate.now());

        int numDigitosVisiveis = 4;
        String senhaOcultada = "*".repeat(numeroCartao.length() - numDigitosVisiveis)
                + numeroCartao.substring(numeroCartao.length() - numDigitosVisiveis);

        setNumeroCartao(senhaOcultada);

        int numeroVisiveis = 2;
        String cvvMisterioso = "*".repeat(cvv.length() - numeroVisiveis) +
                cvv.substring(cvv.length() - numeroVisiveis);

        setCvv(cvvMisterioso);



        System.out.println("Processando pagamento via Pix de R$ "  + getValor() +
                "\n Nome do Titular: " + getNomeTitular() +
                "\n Data do pagamento: " + getData() +
                "\n Número do cartão: " +  getNumeroCartao() +
                "\n Código de segurança: " + getCvv());

    }
}
