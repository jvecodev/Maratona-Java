package study.jvecodev.maratonajava.primeirospassos.condicionais;


/**
   Em uma estrutura condicional, sempre retornara um valor boolean de acordo com a condicao
 */
public class Estruturas {
    public static void main(String[] args) {

        int idade = 18;

        if (18 >= idade) {
            System.out.println("Este individuo ainda não pode comprar bebida alcólica");
        } else {
            System.out.println("Dentro da legalidade para comprar bebidas");
        }

        //Outra maneira

      boolean isAutorizadoComprarBebida = idade >= 18;

      if(isAutorizadoComprarBebida){
          System.out.println("Dentro da legalidade para comprar bebidas");
      }
      //Sem utilizar o else neste caso

      if (isAutorizadoComprarBebida == false){
          System.out.println("Este individuo ainda não pode comprar bebida alcólica");
      }

      /**
       Ou
       if (!isAutorizadoComprarBebida){
                 System.out.println("Este individuo ainda não pode comprar bebida alcólica");
             }
       */


    }
}
