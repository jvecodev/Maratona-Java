package study.jvecodev.maratonajava.condicionais;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);

        System.out.println("Digite seu Sexo");
        char sexo = pergunta.nextLine().charAt(0);//Utilizado para capturar o primeiro caracter

        switch (sexo) {
            default:
                System.out.println("Invalido");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;

        }
    }
}
