package study.jvecodev.maratonajava.arrays;

public class Aula01Arrays {
    public static void main(String[] args) {
        int [] idade = new int[3];
        idade [0] = 21;
        idade [1] = 13;
        idade [2] = 13;

        // podemos repetir o valor

        System.out.println(idade[1]);
        System.out.println(idade[2]);


        // Padrões primitivos
        /**
         * Para esses tipos temos padores de inicialização
         * byte, short, int, long, float e double = 0
         * char = \u0000
         * bolean = false
         * String null
         */




        int [] numero = new int [2];
        //Para mudar o tipo, precisamos do cast
         numero[0] = (int) 21F;

        double[] numero1 = new double[2];
        numero1[0] = 21F;  // Aqui não precisa de cast, pois o `float` pode ser atribuído diretamente a um `double`


    }

}
