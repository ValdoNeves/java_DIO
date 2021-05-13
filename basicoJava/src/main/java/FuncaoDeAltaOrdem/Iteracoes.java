package FuncaoDeAltaOrdem;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

    public static void main(String[] args) {
        String[] nomes = {"João", "Paulo", "Oliveira", "Santos", "Instrutor", "Java"};
        Integer[] numeros = {1,2,3,4,5};
        imprimirNomesFiltrados(nomes);
        String[] audios = {"vaid.wav", "tas.wav", "tsre.mp3", "eteste.avi", "tete.wav", "debora.wav"};
        imprimirNomesFiltrados(audios);
    }

    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir = "";
//        for(int i =0; i < nomes.length; i++){
//            if(nomes[i].equals("João")){
//                nomesParaImprimir += ""+nomes[i];
//            }
//        }
//
//        String nomesParaImprimirDaStream = Stream.of(nomes)
//                .filter(nome -> nome.equals("João"))
//                .collect(Collectors.joining()); // o joing pega toda as strings

        List<String> musicas = Stream.of(nomes) //Stream de nomes
//                .sorted() // organizadas ordem alfabetica
                .filter(nome -> nome.endsWith(".wav")) //filtradas pelo final com .wav
                .collect(Collectors.toList()); // coletadas em uma lista
//                .removeAll();
        System.out.println(musicas);


//        System.out.println(nomesParaImprimir);
//        System.out.println(nomesParaImprimirDaStream);
    }
}
