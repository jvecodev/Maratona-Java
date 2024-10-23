package study.jvecodev.maratonajava.teste;

public class Moto extends Veiculo{
    public Moto(String marca, String nome) {
        super(marca, nome);
    }

    @Override
    public void Ligar() {

        System.out.println("Ligando moto");
    }
}
