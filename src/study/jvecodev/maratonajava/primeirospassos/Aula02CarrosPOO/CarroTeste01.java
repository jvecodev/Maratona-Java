package study.jvecodev.maratonajava.primeirospassos.Aula02CarrosPOO;

import java.util.Scanner;

public class CarroTeste01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Digite a cor do carro: ");
        String cor = scanner.nextLine();

        System.out.print("Digite o chassi do carro: ");
        String chassi = scanner.nextLine();

        // Criando o objeto Carro com as informações fornecidas pelo usuário
        Carro carro = new Carro(marca, modelo, ano, cor, chassi);

        // Testando os métodos
        carro.ligar();
        carro.acelerar();
        carro.trocarMarcha(3);
        carro.frear();
        carro.desligar();

        carro.toString();

        // Exibindo as características do carro no final
        System.out.println("\nCaracterísticas do carro escolhido:");
        System.out.println(carro.getDetalhes());

        //Boas práticas
        scanner.close();
    }
}


