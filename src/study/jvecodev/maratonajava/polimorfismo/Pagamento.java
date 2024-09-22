package study.jvecodev.maratonajava.polimorfismo;

import java.time.LocalDate;

public class Pagamento {
    private double valor;
    private LocalDate data;
    private int metodoPagamento;

    // Construtor sem parâmetros
    public Pagamento() {
    }

    // Construtor com parâmetros
    public Pagamento(double valor, LocalDate data, int metodoPagamento) {
        this.valor = valor;
        this.data = data;
        this.metodoPagamento = metodoPagamento;
    }

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public int getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setMetodoPagamento(int metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    // Método não sobrescrito
    public void exibirRecibo() {
        System.out.println("Exibindo recibo do pagamento de R$ " + valor + " na data " + data);
    }

    // Método a ser sobrescrito
    public void processarPagamento() {
        System.out.println("Processando pagamento genérico.");
    }
}
