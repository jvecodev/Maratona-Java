package study.jvecodev.maratonajava.polimorfismo;

import java.time.LocalDate;

// Classe base Pagamento
public class Pagamento {
    private double valor;
    private LocalDate data;
    private int metodoPagamento;



    public Pagamento(double valor, LocalDate data, int metodoPagamento) {
        this.valor = valor;
        this.data = data;
        this.metodoPagamento = metodoPagamento;
    }

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



    // Método processarPagamento a ser sobrescrito
    public void processarPagamento(){};
}
