package study.jvecodev.maratonajava.primeirospassos.arrays;

import java.util.ArrayList;

public class Aula04Arrays {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Exibindo os elementos do ArrayList
        System.out.println("Frutas: " + frutas);

        ArrayList<String> frutas1 = new ArrayList<>();
        frutas1.add("Maçã");
        frutas1.add("Banana");
        frutas1.add("Laranja");

        // Acessando o elemento no índice 1
        String fruta = frutas1.get(1);
        System.out.println("Fruta no índice 1: " + fruta);
    }





}



