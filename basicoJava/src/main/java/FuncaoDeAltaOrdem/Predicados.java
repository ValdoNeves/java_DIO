package FuncaoDeAltaOrdem;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        Predicate<String> estaVazio = valor -> valor.isEmpty();

        //outra forma de informa o mesmo lambda mas tratando diretamente com o atributo
        Predicate<String> estaVazio2 = String::isEmpty;

        //não tem nada escrito apenas "" logo é verdadeira
        System.out.println(estaVazio.test("")); //true

        //agora temos uma String logo não esta vazia deve retornar false
        System.out.println(estaVazio.test("Teste 2")); // false
    }
}
