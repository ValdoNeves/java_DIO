package FuncaoDeAltaOrdem;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornaNomeAoContrario.apply("Teste"));

        //as duas formas fazem exatamente a mesma coisa
        //recebe um valor String e o converte em Inteiro
        Function<String, Integer> converteStringEmInteger = Integer::valueOf;
        Function<String, Integer> converteStringEmInteger2 = string -> Integer.valueOf(string);

//        Converte a String em Inteiro e multiplica por 2
        System.out.println(converteStringEmInteger.apply("10") * 2);
    }
}
