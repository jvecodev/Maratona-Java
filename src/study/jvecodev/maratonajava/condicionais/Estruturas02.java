package study.jvecodev.maratonajava.condicionais;
import java.util.Scanner;

public class Estruturas02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        String categoria;

        //Utilizado para converter o valor para int

        int idade = Integer.parseInt(scanner.nextLine());  // Converte a string para int

        if(idade < 15 ){

            categoria = ("Categoria Infantil");
        }

        else if (idade >= 15 && idade < 18) {

            categoria = ("Categoria Juvenil");

        }
        else{

            categoria = ("Categoria Adulta");

        }

        System.out.println(categoria);
    }
}

