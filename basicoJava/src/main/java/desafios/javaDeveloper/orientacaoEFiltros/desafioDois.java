package desafios.javaDeveloper.orientacaoEFiltros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class desafioDois {
    public static void main(String[] args) throws FileNotFoundException {
        //le arquivos
//        Scanner scan = new Scanner(System.in);

        File arquivo = new File("C:/Users/valdoneves/Documents/DIO_Java/basicoJava/src/main/java/desafios/javaDeveloper/orientacaoEFiltros/desafioDois.txt");
        //Pega Arquivos
        Scanner scan = new Scanner(arquivo);

        //cria lista
        List<String> listaDeCompras = new ArrayList<>();
        //cria set
        Set<String> listaUnica;

        //adiciona todos os valores dos arquivos em uma lista
        while (scan.hasNext()) {
            listaDeCompras.add(scan.nextLine());

        }

        //pega a quantidade de listas
        int numero = parseInt(listaDeCompras.get(0));
        //varre a lista
        for (var i = 1; i <= numero; i++) {
            //adiciona a primeira linha(lista), com valores unicos
            listaUnica = Arrays.stream(listaDeCompras.get(i).split(" ")).collect(Collectors.toSet());
            //converte valores para string
            String lista = String.valueOf(listaUnica.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
            //imprime string de listas
            System.out.println(lista.replace(",", "").replace("[", "").replace("]", ""));
        }
    }
}


