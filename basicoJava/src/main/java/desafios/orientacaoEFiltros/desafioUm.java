package desafios.orientacaoEFiltros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class desafioUm {

    public static void main(String[] args) throws FileNotFoundException {

        File arquivo = new File("C:/Users/valdoneves/Documents/DIO_Java/basicoJava/src/main/java/desafios/orientacaoEFiltros/numerosDesafio.txt");
        Scanner scan = new Scanner(arquivo);
//        Scanner scan = new Scanner(System.in);

        List<Integer> numeros = new ArrayList();
        while(scan.hasNextInt()){
//            System.out.println(scan.nextInt());
            numeros.add(scan.nextInt());
//            numeros.add(scan.nextInt(scan.radix()));
        }
//        Scanner scan = new Scanner(System.in);
        scan.close();
        var primeiroValor = numeros.get(0);
        for(var i = 1; i <= primeiroValor; i++){
            numeros.stream().filter(numero -> {
                if(numero%2 == 0){
                    System.out.println(numero);
                }

            }).collect(Collectors.toList());
        }



        System.out.println(numeros.get(0));

//        int numeroDeLinhas = scan.nextInt();


    }


}
