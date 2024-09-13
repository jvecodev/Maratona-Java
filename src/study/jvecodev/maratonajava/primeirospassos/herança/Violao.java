package study.jvecodev.maratonajava.primeirospassos.herança;

public class Violao extends InstrumentoMusical {
    private int numeroCordas;


    public Violao(int numeroCordas, String nome, String afinacao, String material, String anoFabricacao) {
        super(nome, material, anoFabricacao, afinacao);
        this.numeroCordas = numeroCordas;
    }

    // Método para exibir as informações do violão
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Número de Cordas: " + numeroCordas);
    }
}

