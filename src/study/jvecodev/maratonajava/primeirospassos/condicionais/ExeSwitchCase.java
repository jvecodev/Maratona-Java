package study.jvecodev.maratonajava.primeirospassos.condicionais;

import java.util.Scanner;

public class ExeSwitchCase {
    public static void main(String[] args) {

        Scanner pergunta = new Scanner(System.in);

        System.out.print("Digite um numero relacionado ao dia de sua prefência:\n" +
                "1- domingo\n" +
                "2- Segunda\n" +
                "3- Terça\n" +
                "ETC");
        char dia = pergunta.nextLine().charAt(0);//Utilizado para capturar o primeiro caracter

        switch (dia) {
            default:
                System.out.println("Dia invalido");
                break;
            case '1':
                System.out.println("Final de semana - Domingo");
                break;
            case '7':
                System.out.println("Final de semana - Sabado");
                break;
            case '2', '3', '4', '5', '6':
                System.out.println("Dia útil");
                break;

        }

    }
}
