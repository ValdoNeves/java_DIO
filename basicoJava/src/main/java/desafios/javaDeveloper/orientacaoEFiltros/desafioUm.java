package desafios.javaDeveloper.orientacaoEFiltros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class desafioUm {
    public static void main(String[] args) throws FileNotFoundException {

//        File arquivo = new File("C:/Users/valdoneves/Documents/DIO_Java/basicoJava/src/main/java/desafios/javaDeveloper/orientacaoEFiltros/numerosDesafio.txt");
//        Scanner scan = new Scanner(arquivo);
        Scanner scan = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        while (scan.hasNextInt()){
            numeros.add(scan.nextInt());
        }

        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        for(var i = 1; i <= numeros.get(0); i++){

            if(numeros.get(i)%2 == 0){
                par.add(numeros.get(i));
            }else{
                impar.add(numeros.get(i));
            }
        }

        par.stream().sorted().forEach(e -> System.out.println(e));

        impar.stream().sorted(Comparator.reverseOrder()).forEachOrdered(e -> System.out.println(e));

    }
}