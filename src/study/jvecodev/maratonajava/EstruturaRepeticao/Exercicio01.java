package study.jvecodev.maratonajava.EstruturaRepeticao;

public class Exercicio01 {
    public static void main(String[] args) {

        System.out.println("Apenas numeros pares");

        for (int indice = 0; indice < 50; indice++) {

            if (indice % 2 == 0) {

                if (indice == 48) {

                    System.out.print(indice + ".");

                } else {
                    System.out.print(indice + " - ");
                }

            }

        }

        System.out.println();

        // exemplo se eu nao souber o ultimo numero par para colocar o ponto final



        int ultimoPar = -1;

        // Primeiro loop para encontrar o último número par
        for (int indice = 0; indice < 50; indice++) {

            if (indice % 2 == 0) {

                ultimoPar = indice;

            }

        }

        // Segundo loop para imprimir os números pares
        for (int indice = 0; indice < 50; indice++) {

            if (indice % 2 == 0) {

                if (indice == ultimoPar) {

                    System.out.print(indice + ".");

                } else {

                    System.out.print(indice + " - ");

                }

            }

        }

    }

}
