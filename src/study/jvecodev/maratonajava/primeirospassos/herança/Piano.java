package study.jvecodev.maratonajava.primeirospassos.herança;

public class Piano extends InstrumentoMusical {
    private int numeroTeclas;

    public Piano(int numeroCordas, String nome, String afinacao, String material, String anoFabricacao) {
        super(nome, material, anoFabricacao, afinacao);
        this.numeroTeclas  = numeroTeclas;
    }

    // Método para exibir as informações do violão
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Número de Cordas: " + numeroTeclas);
    }
}
