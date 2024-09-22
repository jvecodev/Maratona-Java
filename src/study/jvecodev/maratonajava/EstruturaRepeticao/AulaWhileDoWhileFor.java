package study.jvecodev.maratonajava.EstruturaRepeticao;

public class AulaWhileDoWhileFor {
    public static void main(String[] args) {
//        While, do while, for
        int count = 0;
        //Primeira maneira
        //Trabalhamos com condição
        while (count < 10) {
            System.out.println(++ count);

//        while (count <= 10){
//            System.out.println(count);
//            count += 1;
//        }
        }
         // Do while, inpedendente se a variavel esta correta ou nao, o loop será executado
        // Mostrando a variavel novamente é diferente de declarar

        System.out.println("============================================================");

        count = 0;
        do {

            System.out.println("Dentro do  do while " + ++ count);
            // System.out.println("Dentro do  do while " + count);
//            count += 1;  Dara na mesma porem uma forma mais extensa

        } while (count < 10 );

        System.out.println("============================================================");

        //Trabalhamos com índice

        for (int indice = 0; indice < 10 ; indice ++){
            System.out.println("For " + indice);
        }


    }
}
