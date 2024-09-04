package study.jvecodev.maratonajava.primeirospassos.EstruturaRepeticao;

import java.util.ArrayList;
import java.util.List;

public class AulaForEach {
    //ForEach maneira siplificada de interar um elemento

    /**
     * exemplo:
     * for (Tipo elemento : coleção) {
     * // Código a ser executado para cada elemento
     * }
     */

    //Exemplo 2

        public static void main(String[] args) {
//            int[] numeros = {1, 2, 3, 4, 5};
//
//            for (int numero : numeros) {
//                System.out.println(numero);
//            }
//            List<String> nomes = new ArrayList<>();
//            nomes.add("João");
//            nomes.add("Maria");
//            nomes.add("José");
//
//            System.out.println("====================");
//
//            for (String nome : nomes) {
//                System.out.println(nome);
//            }


            //fibonacci em java
            int n = 10; // Número de termos na sequência de Fibonacci
            int num1 = 0, num2 = 1;

            System.out.print("Sequência de Fibonacci até " + n + " termos: ");

            for (int i = 1; i <= n; ++i) {
                System.out.print(num1 + " ");

                // Calcula o próximo termo
                int soma = num1 + num2;
                num1 = num2;
                num2 = soma;
            }





    }




}




