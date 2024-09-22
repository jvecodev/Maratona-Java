package study.jvecodev.maratonajava.herança;


public class InstrumentoMusical {
    private String nome;
    private String material;
    private String anoFabricacao;
    private String afinacao;

    // Construtor
    public InstrumentoMusical(String nome, String material, String anoFabricacao, String afinacao) {
        this.nome = nome;
        this.material = material;
        this.anoFabricacao = anoFabricacao;
        this.afinacao = afinacao;
    }

    // Método para exibir as informações básicas
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Material: " + material);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Afinação: " + afinacao);
    }
}
