package desafios.javaDeveloper.orientacaoEFiltros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.compare;
import static java.lang.Integer.parseInt;

public class DesafioTres {
    public static void main(String[] args) throws FileNotFoundException {
        //le arquivos
//        Scanner scan = new Scanner(System.in);

        File arquivo = new File("C:/Users/valdoneves/Documents/DIO_Java/basicoJava/src/main/java/desafios/javaDeveloper/orientacaoEFiltros/desafioTres.txt");
        //Pega Arquivos
        Scanner scan = new Scanner(arquivo);

        //cria lista
        List<String> arquivoCompleto = new ArrayList<>();
        List<String> segundaLinha = new ArrayList<>();
        List<String> cores = new ArrayList<>();
        List<String> tamanos = new ArrayList<>();
        List<String> nomes = new ArrayList<>();


        //adiciona todos os valores dos arquivos em uma lista
        while (scan.hasNext()) {
            arquivoCompleto.add(scan.nextLine());

        }

        //pega a quantidade de listas
        int numero = parseInt(arquivoCompleto.get(0));
        int ultimo = parseInt(arquivoCompleto.get(arquivoCompleto.size() -1 ));


        for(var i = 1; i <= (numero*2); i = i+2){
            if(arquivoCompleto.get(i) != String.valueOf(ultimo)){
                nomes.add(arquivoCompleto.get(i));
            }
        }
        nomes.stream().sorted().collect(Collectors.toList());
        for(var i = 2; i <= (numero*2); i = i+2){

            if(arquivoCompleto.get(i) != String.valueOf(ultimo)){

                segundaLinha.add(arquivoCompleto.get(i));

//                segundaLinha = Arrays.stream(arquivoCompleto.get(i).split(" ")).collect(Collectors.toList());

//                for(var x = 0; x < segundaLinha.size(); x++){
//                    if(x % 2 == 0){
//                        cores.add(segundaLinha.get(x));
//                    }else {
//                        tamanos.add(segundaLinha.get(x));
//                    }

//                }
            }



        }


        System.out.println(nomes);
        System.out.println(segundaLinha);

        List<String> unicaLinha = new ArrayList<>();
//        Stream.concat(segundaLinha.stream().toString() + nomes.get()).collect(Collectors.toList());

        for(var i = 0; i < numero; i++){
            unicaLinha.add(segundaLinha.get(i) +" "+ nomes.get(i));
        }
//        Stream<String> ordenadas = unicaLinha.stream().sorted();
        System.out.println("adicionei agora " + unicaLinha);
        System.out.println("ordenada:" +unicaLinha.stream().sorted().collect(Collectors.toList()));




//        segundaLinha.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//        List<String> pegandoNomes = nomes.stream().collect(Collectors.toList());
//        pegandoNomes.sort(Comparator.naturalOrder());


//        cores.stream().sorted(Comparator.naturalOrder());
//        tamanos.stream().sorted(Comparator.reverseOrder());
//        String nome = String.valueOf(nomes.stream().sorted(Comparator.naturalOrder()));

        for(var i = 0; i < numero; i++) {
//            if(cores.get(i).equals("branco")){
//                System.out.println(cores.get(i) + " "+ tamanos.get(i)+" "+ pegandoNomes.get(i));
//            }
            if(unicaLinha.get(i).startsWith("branco") && !unicaLinha.stream().sorted().collect(Collectors.toList()).isEmpty()){
//                if(unicaLinha.stream().allMatch(s)) {
                    System.out.println(unicaLinha.get(i));
//                }
            }

        }
        for(var i = 0; i < numero; i++) {
//            if (cores.get(i).equals("vermelho")) {
//                System.out.println(cores.get(i) + " " + tamanos.get(i) + " " + pegandoNomes.get(i));
//            }
            if(unicaLinha.get(i).startsWith("vermelho")){
                System.out.println(unicaLinha.get(i));
            }
        }

        //            //adiciona a primeira linha(lista), com valores unicos
//            listaUnica = Arrays.stream(listaDeCompras.get(i).split(" ")).collect(Collectors.toSet());
//            //converte valores para string
//            String lista = String.valueOf(listaUnica.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
//            //imprime string de listas
//            System.out.println(lista.replace(",", "").replace("[", "").replace("]", ""));
//        }



    }
}
