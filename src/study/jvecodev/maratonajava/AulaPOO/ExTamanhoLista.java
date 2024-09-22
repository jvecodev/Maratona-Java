package study.jvecodev.maratonajava.AulaPOO;

import java.util.Random;
import java.util.Scanner;


public class ExTamanhoLista {

        public static int[] randomValuesArray(int size) {
            int[] values = new int[size];
            Random random = new Random();
            int bound = 21; // Definir o limite

            for (int i = 0; i < values.length; i++) {
                values[i] = random.nextInt(bound);
            }

            return values;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o tamanho do array:");
            int size = scanner.nextInt();

            int[] values = randomValuesArray(size);

            System.out.println("---Resultado---");
            for (var value : values) {
                if (value % 3 == 0) {
                    System.out.println(value + " - Número múltiplo de 3");
                } else if (value % 2 == 0) {
                    System.out.println(value + " - Número Par");
                } else {
                    System.out.println(value + " - Número Ímpar");
                }
            }
        }
    }


