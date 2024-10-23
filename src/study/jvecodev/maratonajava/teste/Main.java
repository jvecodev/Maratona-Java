package study.jvecodev.maratonajava.teste;

public class Main {
    public static void main(String[] args) {
        Veiculo a = new Carro ("Hyundai", "HB20");
        Veiculo b = new Moto ("Yamaaha", "YBR 125");

        System.out.println(a.getMarca() + " - " + a.getNome());
        a.Ligar();

        System.out.println(b.getMarca() + " - " + b.getNome());
        b.Ligar();
    }
}
