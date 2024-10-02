package study.jvecodev.maratonajava.ModifcadoresEstáticos;

public class TesteCarro {
    // um método que se chama main, porém não precisa, Estático, que não retorna nada.
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(180);
        Carro c1 = new Carro ("BMW", 280);
        Carro c2 = new Carro ( "Mercedes", 300);
        Carro c3 = new Carro ("Audi TT", 310);


        // O set/get sempre aparece por uma variável de referência, quando o atributo nao for estatico
        // Seo metodo ou atributo for estatico acessamos pelo nome da classe

        
        c3.imprime();
        c1.imprime();
        c2.imprime();
        

    }
}
