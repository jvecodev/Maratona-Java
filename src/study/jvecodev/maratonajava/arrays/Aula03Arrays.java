package study.jvecodev.maratonajava.arrays;
import java.util.Scanner;

public class Aula03Arrays {

    // Arrays multidimensionais
    public static void main(String[] args) {
//        // Um array dentro do outro
//        Scanner scanner = new Scanner(System.in);
//        int[][] matriz = new int[3][5];
//
//        // Preenchendo a matriz
//        for (int linha = 0; linha < 3; linha++) {
//            for (int coluna = 0; coluna < 5; coluna++) {
//                System.out.print("Digite um valor para [" + linha + ", " + coluna + "]: ");
//                matriz[linha][coluna] = scanner.nextInt();
//            }
//        }
//
//        // Imprimindo a matriz
//
//        for (int linha = 0; linha < 3; linha++) {
//            for (int coluna = 0; coluna < 5; coluna++) {
//
//                // printf = print formatado
//                System.out.printf("[%3d] ", matriz[linha][coluna]);
//            }
//            System.out.println(); // Adicionado para formatar a saída
//        }

//         Formando uma torre
        int [][] arrayInt = new int [3][];
        arrayInt [0]= new int[2];
        arrayInt [1] = new int[4];
        arrayInt [2] = new int[6];
              //Tipo de coleção : coleção
        for (int[] arrayBase: arrayInt){
            System.out.println("\n -----------");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
        }

    }


}



