package study.jvecodev.maratonajava.Biblioteca;

import java.util.Scanner;

public class VideoDigital extends ItemBlibliotecaDigital implements Baixavel, Vizualizavel {

    private static String[] videosDisponiveis = {
            "Curso de Java Completo - 10 horas",
            "Documentário: A História da Tecnologia",
            "Série: Inovações do Futuro",
            "Tutorial: Introdução ao Spring Boot",
            "Palestra: Clean Code e Boas Práticas de Programação"
    };

    private static String[] autores = {
            "Professor Java",
            "Dr. Tecnologia",
            "Série Inovações",
            "João Developer",
            "Ana Programadora"
    };

    private static String[] descricoes = {
            "Um curso abrangente sobre Java, cobrindo conceitos fundamentais e avançados.",
            "Um documentário que explora a evolução da tecnologia ao longo dos anos.",
            "Uma série que apresenta inovações que estão moldando o futuro.",
            "Um tutorial prático que ensina como usar o Spring Boot para desenvolvimento de aplicações.",
            "Uma palestra que discute os princípios do Clean Code e boas práticas de programação."
    };

    public VideoDigital(String autor, String titulo, double peso) {
        super(autor, titulo, peso);
    }

    public String Descricao() {
        return "Video digital: " + getTitulo() + "| Autor " + "\n" + getDetalhes();

    }
    private String getDetalhes(){
        for (int i = 0 ; i < videosDisponiveis.length; i ++){
            if (getTitulo().equals(videosDisponiveis[i])){
                return descricoes[i];
            }
        }
        return "Descricao não disponível";
    }

    public void baixar(){
        System.out.println("Baixando o video digital" + getTitulo());
        try {
            for ( int i = 0 ; i <= 100;  i += 25){
                System.out.println("Progresso: " + i + "%");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Erro no dowload.");
        }
        System.out.println("Dowload concluído do video" + getTitulo());
    }

    public void vizualizar() {
        System.out.println("Vídeo iniciado: " + getTitulo());
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print("\rTempo de visualização: " + i + " segundo(s)");
                Thread.sleep(1000); // Pausa de 1 segundo entre cada exibição
            }
            System.out.println("\nVídeo finalizado.");
        } catch (InterruptedException e) {
            System.out.println("Erro ao iniciar seu vídeo, reinicie a plataforma.");
        }
    }



    public static void mostrarVideosDisponiveis (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Videos disponiveis");
        for (int i = 0; i < videosDisponiveis.length; i ++){
            System.out.println((i + 1) + "." + videosDisponiveis[i]);

        }

        System.out.println("\ndigite o numero do vídeo que deseja baixar");
        int escolha = scanner.nextInt();

        if (escolha > 0 && escolha <= videosDisponiveis.length) {
            // Obtemos o autor correspondente ao ebook escolhido
            String autorEscolhido = autores[escolha - 1];
            VideoDigital videoEscolhido = new VideoDigital(autorEscolhido, videosDisponiveis[escolha - 1], 0.5);
            System.out.println(videoEscolhido.Descricao());
            acaosobreovideo(videoEscolhido);
        } else {
            System.out.println("Escolha inválida.");
        }


    }

    public static void acaosobreovideo(VideoDigital video){
        Scanner scanner = new Scanner(System.in);
        System.out.println("você deseja:");
        System.out.println("(1) Vizualizar ");
        System.out.println("(2) Baixar ");
        int opcao = scanner.nextInt();
        if (opcao == 1){
            video.vizualizar();
        }
        else if(opcao == 2){
            video.baixar();
        }
        else{
            System.out.println("Escolha inválida");
        }

    }


}
