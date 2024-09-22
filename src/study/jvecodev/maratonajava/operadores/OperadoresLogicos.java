package study.jvecodev.maratonajava.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //Operadores Aritméticos retornam sempre valores numéricos
        //Default compared with another languages - + * / - %

        int numero1 = 10;
        int numero2 = 5;
        int soma = numero2 + numero1;
        System.out.println("Resultado da soma entre " + numero1 + " e " + numero2 + " = " + soma);


        //Operadoes Lógicas, also default compared with another languages
        // < > <= >= == !=, always comeback boolean values// < > <= >= == !=, always comeback boolean values

        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenSmallerThanTwenty = 10 < 20;
        System.out.println("Is ten bigger than twenty? " + isTenBiggerThanTwenty);
        System.out.println("Is ten smaller than twenty? " + isTenSmallerThanTwenty);

        //Also Logic Operators, && (and), || (or);
        // Assignment Operators, ++ += -= %= *= --


    }
}
