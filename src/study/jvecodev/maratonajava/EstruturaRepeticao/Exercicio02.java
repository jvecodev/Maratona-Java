package study.jvecodev.maratonajava.EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner pergunta = new Scanner(System.in);

        System.out.print("digite um numero para começar a contagem até 15: ");
        int numero = pergunta.nextInt();

        for (int indice = numero; indice <= 15; indice++) {

            if (indice == numero) {
                System.out.println(indice + " -> Numero Escolhido");
            } else {
                System.out.println(indice);
            }
        }
    }
}

