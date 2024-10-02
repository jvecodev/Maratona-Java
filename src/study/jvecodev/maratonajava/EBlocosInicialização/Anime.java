package study.jvecodev.maratonajava.EBlocosInicialização;

public class Anime {
    private String nome;
    //Declarado manualmente
//    private int [] episodios = {1,2,3,4,5,6,7,8,9,10};
    private int [] episodios;

    {
        System.out.println("Dentro do bloco ");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    //Construtor sem nenhum parâmetro

    public Anime(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }

    public Anime() {

        for ( int episodio : this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println(" ");
    }
}
