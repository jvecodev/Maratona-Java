package study.jvecodev.maratonajava.primeirospassos.EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        // Loop para garantir que o número inicial seja maior que zero
        do {
            System.out.print("Digite um número maior que zero:");
            numero = scanner.nextInt();

            scanner.nextLine(); // Consome a nova linha residual, Permite que o usario digite outra entrada

            if (numero <= 0) {
                System.out.println("Erro: O número deve ser maior que zero.");
            }
        } while (numero <= 0);

        // Loop principal do programa
        while (numero > 0) {
            System.out.println("Ok, número correto");

            System.out.print("Deseja continuar? S/N");
            String outroNumero = scanner.nextLine().toUpperCase();

            if (outroNumero.equals("S")) {
                do {
                    System.out.print("Digite um número maior que zero:");
                    numero = scanner.nextInt();

                    scanner.nextLine(); // Consome a nova linha residual

                    if (numero <= 0) {
                        System.out.println("Erro: O número deve ser maior que zero.");
                    }
                } while (numero <= 0);
            } else {
                break;
            }
        }

        System.out.println("Fim do programa");
    }
}
