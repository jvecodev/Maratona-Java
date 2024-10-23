package study.jvecodev.maratonajava.teste2;
import java.util.ArrayList;

public class PedidoJogo implements Pedido {
    private ArrayList<Produto> produtos;

    public PedidoJogo() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public ArrayList<Produto> getProduto() {
        return produtos;
    }

    @Override
    public double calculaValorTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getValor();
        }
        return total;
    }

    // Método auxiliar para exibir os detalhes do pedido
    public void exibeDetalhesPedido() {
        System.out.println("Detalhes do Pedido:");
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + " | Valor: R$ " + produto.getValor());
        }
        System.out.println("Valor total: R$ " + calculaValorTotal());
    }
}

