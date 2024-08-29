package study.jvecodev.maratonajava.primeirospassos.EstruturaRepeticao;

public class ContinueAula04 {

        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    continue; // Pula a iteração quando i é par
                }
                System.out.print(i); //retorno 1 3 5 7 9
            }
        }

}
