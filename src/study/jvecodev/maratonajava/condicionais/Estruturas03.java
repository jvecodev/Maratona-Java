package study.jvecodev.maratonajava.condicionais;

/**
  Operacao Ternária
 */
public class Estruturas03 {
    public static void main(String[] args) {
        //utilizada para facilitar condicionais
        //Sintaxe -> variavel = (condicao) ? True : False;

        double salario = 3600;
        double precops5 = 3000;

        String comprar = "Devo comprar o videogame";
        String naoComprar = "Não devo comprar o videogame";
        String resultado = salario >= precops5 ? comprar : naoComprar;

        System.out.println(resultado);

        //Outra maneira

//        System.out.println(resultado = salario >= precops5 ? comprar : naoComprar);



    }
}
