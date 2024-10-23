package study.jvecodev.maratonajava.Biblioteca;

import java.util.Scanner;

public class Ebook extends ItemBlibliotecaDigital implements Baixavel {

    private static String[] autores = {
            "Robert C. Martin",
            "Herbert Schildt",
            "Joshua Bloch",
            "Kathy Sierra, Bert Bates",
            "Craig Walls"
    };

    private static String[] ebooksDisponiveis = {
            "Clean Code",
            "Java: The Complete Reference",
            "Effective Java",
            "Head First Java",
            "Spring in Action"
    };

    // Array de descrições detalhadas
    private static String[] descricoes = {
            "Clean Code - Um guia essencial para escrever código legível e manutenível, abrangendo princípios e práticas de desenvolvimento.",
            "Java: The Complete Reference - Um livro abrangente sobre Java que cobre todos os aspectos da linguagem, incluindo programação orientada a objetos, interfaces gráficas, e muito mais.",
            "Effective Java - Um conjunto de boas práticas para programadores Java, focando em padrões e soluções para problemas comuns na programação em Java.",
            "Head First Java - Uma abordagem visual e interativa para aprender Java, ideal para iniciantes, com exercícios e exemplos práticos.",
            "Spring in Action - Um guia prático para o desenvolvimento de aplicações usando o framework Spring, cobrindo conceitos e práticas recomendadas."
    };

    public Ebook(String autor, String titulo, double peso) {
        super(autor, titulo, peso);
    }

    @Override
    public String Descricao() {
        return "Ebook: " + getTitulo() + " | Autor: " + getAutor() + "\n" + getDetalhes();
    }

    // Método para retornar a descrição detalhada do ebook
    private String getDetalhes() {
        for (int i = 0; i < ebooksDisponiveis.length; i++) {
            if (getTitulo().equals(ebooksDisponiveis[i])) {
                return descricoes[i];
            }
        }
        return "Descrição não disponível.";
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o ebook: " + getTitulo());
        // Simulação do processo de download com barra de progresso
        try {
            for (int i = 0; i <= 100; i += 25) {
                System.out.println("Progresso: " + i + "%");
                Thread.sleep(1000); // Simula o tempo de download
            }
        } catch (InterruptedException e) {
            System.out.println("Erro no download.");
        }
        System.out.println("Download concluído do ebook: " + getTitulo());
    }

    // Método para mostrar ebooks disponíveis e permitir escolha
    public static void mostrarEbooksDisponiveis() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ebooks disponíveis:");
        for (int i = 0; i < ebooksDisponiveis.length; i++) {
            System.out.println((i + 1) + ". " + ebooksDisponiveis[i]);
        }

        System.out.println("\nDigite o número do ebook que deseja baixar:");
        int escolha = scanner.nextInt();

        if (escolha > 0 && escolha <= ebooksDisponiveis.length) {
            // Obtemos o autor correspondente ao ebook escolhido
            String autorEscolhido = autores[escolha - 1];
            Ebook ebookEscolhido = new Ebook(autorEscolhido, ebooksDisponiveis[escolha - 1], 0.5);
            System.out.println("Você escolheu: " + ebooksDisponiveis[escolha - 1]);
            System.out.println(ebookEscolhido.Descricao()); // Chama a descrição do ebook
            ebookEscolhido.baixar(); // Chama o método sobrescrito baixar()
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}