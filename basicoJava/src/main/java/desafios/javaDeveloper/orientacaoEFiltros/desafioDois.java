package desafios.javaDeveloper.orientacaoEFiltros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;

public class desafioDois {
    public static void main(String[] args) throws FileNotFoundException {
        //le arquivos
//        Scanner scan = new Scanner(System.in);

        File arquivo = new File("C:/Users/valdoneves/Documents/DIO_Java/basicoJava/src/main/java/desafios/javaDeveloper/orientacaoEFiltros/desafioDois.txt");
        Scanner scan = new Scanner(arquivo);
        

        List<String> listaDeCompras = new ArrayList<>();

        while (scan.hasNext()){
            listaDeCompras.add(scan.nextLine());
        }

        int qtdListas = parseInt(listaDeCompras.get(0));



    }
}


