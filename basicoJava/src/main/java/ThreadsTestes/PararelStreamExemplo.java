package ThreadsTestes;

import java.util.stream.IntStream;

public class PararelStreamExemplo {

    public static void main(String[] args) {
        //tempo em milissegundos
        long inicio = System.currentTimeMillis();
        IntStream.range(1,10000).forEach(num -> fatorial(num));
        long fim = System.currentTimeMillis();
        System.out.println("tempo de Execução Serial :: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1,10000).parallel().forEach(num -> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println("tempo de Execução Paralela:: " + (fim - inicio));

    }

    public static long fatorial(long num){
        long fat = 1;

        for (long i = 2; i <= num; i++){
            fat *= i;
        }

        return fat;
    }
}
