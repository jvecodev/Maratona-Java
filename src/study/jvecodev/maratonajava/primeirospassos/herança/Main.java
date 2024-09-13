package study.jvecodev.maratonajava.primeirospassos.herança;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {


            System.out.println("=================================================");

            // Solicita informações comuns para todos os instrumentos musicais
            System.out.print("Digite o nome do instrumento, ou digite 'Sair': \n");
            String nome = scanner.nextLine().trim().toLowerCase();

            if (nome.equals("sair")) {

                System.out.println("saindo...");
                break;

            }

            System.out.println("=================================================");

            System.out.print("Digite o material do instrumento: ");

            String material = scanner.nextLine().trim();
            System.out.println("=================================================");

            System.out.print("Digite o ano de fabricação: ");
            String anoFabricacao = scanner.nextLine().trim();
            System.out.println("=================================================");

            System.out.print("Digite a afinação: ");
            String afinacao = scanner.nextLine().trim();
            System.out.println("=================================================");

            // Verifica o instrumento digitado pelo usuário


             if (nome.equals("violão")) {

                System.out.print("Digite o número de cordas: ");
                int numeroCordas = Integer.parseInt(scanner.nextLine().trim());
                Violao violao = new Violao(numeroCordas, nome, afinacao, material, anoFabricacao);
                System.out.println("=================================================");
                violao.mostrarInformacoes();

            } else if (nome.equals("piano")) {

                System.out.print("Digite o número de teclas: ");
                int numeroTeclas = Integer.parseInt(scanner.nextLine().trim());
                Piano piano = new Piano(numeroTeclas, nome, afinacao, material, anoFabricacao);
                System.out.println("=================================================");
                piano.mostrarInformacoes();

            }  else {

                System.out.println("Opção inválida. Por favor, digite 'Violão' ou 'Piano'.");

            }
        }
    }
}
