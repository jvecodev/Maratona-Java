package study.jvecodev.maratonajava.polimorfismo;

import java.time.LocalDate;
import java.util.Scanner;

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

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public void processarPagamento() {
        System.out.print("Digite o Valor do Pagamento: ");
        Double valor = scanner.nextDouble();
        setValor(valor);
        scanner.nextLine();

        System.out.print("Digite o número do cartão: ");
        numeroCartao = scanner.nextLine();


        System.out.print("Digite o nome do titular: ");
        nomeTitular = scanner.nextLine();
        setNomeTitular(nomeTitular);

        System.out.print("Digite o CVV: ");
        cvv = scanner.nextLine();


        setData(LocalDate.now());


        String numeroCartaoOculto = ocultarNumeroCartao(numeroCartao);
        String cvvOculto = ocultarCvv(cvv);

        setNumeroCartao(numeroCartaoOculto);
        setCvv(cvvOculto);

        System.out.println("==========================================");



    }


    private String ocultarNumeroCartao(String numeroCartao) {
        if (numeroCartao.length() <= 4) {
            return numeroCartao;
        }
        int numDigitosVisiveis = 4;
        return "*".repeat(numeroCartao.length() - numDigitosVisiveis)
                + numeroCartao.substring(numeroCartao.length() - numDigitosVisiveis);
    }


    private String ocultarCvv(String cvv) {
        if (cvv.length() <= 2) {
            return cvv;
        }
        int numDigitosVisiveis = 2;
        return "*".repeat(cvv.length() - numDigitosVisiveis)
                + cvv.substring(cvv.length() - numDigitosVisiveis);
    }

    public void exibirDetalhes() {

        System.out.println( "Processando pagamento via Cartão de Crédito de R$ " + getValor()
                + "\n Nome do titular do cartão: " + nomeTitular +
                "\n Data do pagamento: " + getData() +
                "\n Número do cartão: " +  getNumeroCartao() +
                "\n Código de segurança: " + getCvv());
        System.out.println("===================================================");
    }
}
