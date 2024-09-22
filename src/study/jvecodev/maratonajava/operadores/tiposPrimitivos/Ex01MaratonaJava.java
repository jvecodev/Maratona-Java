package study.jvecodev.maratonajava.operadores.tiposPrimitivos;
import java.util.Scanner;
public class Ex01MaratonaJava {
    public static void main(String[] args) {

        Scanner perguntas = new Scanner(System.in);

        System.out.println("Digite do data atual: ");
        String date = perguntas.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = perguntas.nextLine();
        System.out.println("DIgite seu Endereço: ");
        String endereco = perguntas.nextLine();
        System.out.println("Digite seu salario");
        float salario = perguntas.nextFloat();

        System.out.println(" Inicio " + date);
        System.out.println("Eu " + nome + " confirmo meu endereço " + endereco + " e meu salario " +salario);



     }
}
