package study.jvecodev.maratonajava.teste2;
import java.util.ArrayList;
public interface Pedido {
    void addProduto(Produto produto);  // Nome do parâmetro adicionado
    ArrayList<Produto> getProduto();        // Retornar List em vez de ArrayList
    double calculaValorTotal();
}

