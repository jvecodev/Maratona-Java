package study.jvecodev.maratonajava.POOmaratona;


import java.util.Scanner;

public class CarroTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Consumir o '\n' deixado pelo nextInt()

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        // Criando o objeto Carro1 com as informações fornecidas
        Carro1 carro1 = new Carro1(nome, modelo, ano);

        // Exibindo mensagem de agradecimento
        System.out.println(carro1.agradecimento());

        // Exibindo as características do carro
        System.out.println("Características do carro:");
        System.out.println(carro1.toString());
    }
}


