package study.jvecodev.maratonajava.primeirospassos.Aula02CarrosPOO;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String chassi;

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                ", chassi='" + chassi + '\'' +
                '}';
    }

    // Construtor
    public Carro(String marca, String modelo, int ano, String cor, String chassi) {
        //this usada quando nos referimos ao atributo

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.chassi = chassi;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    // Métodos
    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    public void desligar() {
        System.out.println("O carro está desligado.");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }

    public void trocarMarcha(int marcha) {
        System.out.println("O carro trocou para a marcha " + marcha);
    }

    // Método para exibir as características do carro
    public String getDetalhes() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nCor: " + cor + "\nChassi: " + chassi;
    }

}