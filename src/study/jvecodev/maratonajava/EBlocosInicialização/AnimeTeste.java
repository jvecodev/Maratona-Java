package study.jvecodev.maratonajava.EBlocosInicialização;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }


    }
}
