package study.jvecodev.maratonajava.ModifcadoresEstáticos;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static int velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-------------------");
        System.out.println("Nome" + this.nome);
        System.out.println("Velocidade máxima"  + this.velocidadeMaxima);
        System.out.println("Velocidade Limite " + Carro.velocidadeLimite);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public static void setVelocidadeLimite(int velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
