package study.jvecodev.maratonajava.primeirospassos.arrays;

public class Aula02Arrays {

    public static void main(String[] args) {
        String [] nomes = new String[3];
        nomes[0] = "João";
        nomes[1] = "Felipe";
        nomes[2] = "Pedro";

        for (int i = 0; i < nomes.length ; i++){
            System.out.println(nomes[i]);
        }

        int [] numeros = new int[3];
        numeros [0] = 10;

        //Outra forma de inicialização

        int [] numeros1 = {1,2,3,4,5};
        //                 aqui ja são os valores e automaticamente já é calculado o tamanho do array

        for (int i=0 ; i < numeros1.length; i++){
            System.out.println(numeros1[i]);
        }

        // outra forma
//        int [] numeros2 = new int []{1,2,3,4,5};
//
//        for (int i = 0 ; i < numeros2.length ; i++){
//            System.out.println(numeros2[i]);
//        }

//        for each → não te dara o indices, se quiser acessar o indices nao funcionara

        for ( int num : numeros1){
            System.out.println(num);  //→ Aqui nos temos uma variável de referencia
                                      // Pegando todos as posições do (numero1)

            // num é uma variável local, por isso podemos usar ela depois do for, mas nunca antes do for

        }


    }
}
