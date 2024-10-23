package study.jvecodev.maratonajava.teste;

public abstract class  Veiculo {
    private String marca;
    private String nome;
    public Veiculo (String marca, String nome){
        this.marca = marca;
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract void Ligar();

}
