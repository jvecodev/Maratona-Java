package study.jvecodev.maratonajava.teste2;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Jogo 1", 199.99);
        Produto produto2 = new Produto("Jogo 2", 149.99);

        PedidoJogo pedido = new PedidoJogo();
        pedido.addProduto(produto1);
        pedido.addProduto(produto2);

        pedido.exibeDetalhesPedido();  // Exibe os detalhes do pedido e o valor total
    }
}

