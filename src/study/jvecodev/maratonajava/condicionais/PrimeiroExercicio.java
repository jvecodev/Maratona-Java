package study.jvecodev.maratonajava.condicionais;


import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double imposto;
        System.out.print("Digite seu salario: ");
        double valor = Integer.parseInt(scanner.nextLine());

        if (valor > 0 && valor <= 3472){

            imposto = (9.70/100) * valor;

        }
        else if (valor > 3472 && valor <= 68507 ) {

            imposto = (37.35 / 100) * valor;

        }
        else {

            imposto = (49.50 / 100) * valor;

        }

        System.out.printf("Definido o valor do seu imposto anual → %.2f", imposto);


    }
}
