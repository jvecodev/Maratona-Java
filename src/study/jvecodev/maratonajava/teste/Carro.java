package study.jvecodev.maratonajava.teste;

public class Carro extends Veiculo{
    public Carro(String marca, String nome) {
        super(marca, nome);
    }

    @Override
    public void Ligar() {

        System.out.println("Ligando Carro");
    }
}
