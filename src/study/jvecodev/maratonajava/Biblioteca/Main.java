package study.jvecodev.maratonajava.Biblioteca;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Inicia o menu
        menu();
    }
    public static void menu() {
        while (true) {
            System.out.println("======================================================");
            System.out.println("(1) Ebook");
            System.out.println("(2) Video digital");

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine().trim();
            System.out.println("======================================================");

            switch (opcao) {
                case "1":
                    Ebook.mostrarEbooksDisponiveis();
                    break;

                case "2":
                    VideoDigital.mostrarVideosDisponiveis();
                    break;


            }
        }
    }
}