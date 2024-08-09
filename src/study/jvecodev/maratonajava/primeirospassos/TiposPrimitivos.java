package study.jvecodev.maratonajava.primeirospassos;

/**
 Int, double, float, char, byte, long, boolean
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
      int idade = 10; //4 byte
      long vizualizacoesMensaisGoogle = 1000000000; //8 byte
      float salario = 3300.50f; //4 byte
      double valuationApple = 320000000; //8 byte
      short idadeMenor = 18; // 2 byte
      boolean verdadeiro = true; //1bit
      boolean falso = false;//1bit
      char caractere = 'M'; //2 byte utilizando letras
      char caractere1 = 65; //2 byte utilizando a tabela ASCII
      char caractere2 = '\u0041'; // 2 byte tabela unicode

        System.out.println("idade: "+ idade + " / Vizualizacoes Mensais do google:" + vizualizacoesMensaisGoogle +
                " / Salario:"+ salario+ " / Idade/ Short:" + idadeMenor );

    }
}
