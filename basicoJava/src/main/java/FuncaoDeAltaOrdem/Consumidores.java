package FuncaoDeAltaOrdem;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {

        Consumer<String> imprimeUmaFrase = System.out::println;
        Consumer<String> imprimeUmaFraseDois = frase -> System.out.println(frase);
        imprimeUmaFrase.accept("Teste 1");
        imprimeUmaFraseDois.accept("Teste 2");

    }
}
