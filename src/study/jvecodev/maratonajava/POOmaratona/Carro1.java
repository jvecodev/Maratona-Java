package study.jvecodev.maratonajava.POOmaratona;

public class Carro1 {
    private String nome;
    private String modelo;
    private int ano;

    @Override
    public String toString() {
        return "Carro1" +
                "\nnome = " + nome  +
                "\nmodelo = " + modelo +
                "\nano = " + ano
                ;
    }

    public Carro1(String nome, String modelo, int ano){
       this.ano = ano;
       this.modelo = modelo;
       this.nome = nome;
   }
   public String getNome() {
       return nome;
    };

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }



    public String agradecimento(){
      return "Obrigado por comprar conosco";

    };
}
