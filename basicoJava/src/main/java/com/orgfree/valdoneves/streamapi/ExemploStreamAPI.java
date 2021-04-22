package com.orgfree.valdoneves.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        //instancia coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        //populando coleção
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        //retorna a contagem de elementos
        System.out.println("contagem: " + estudantes.stream().count() +"\n");

        //retorna o maior valor em relação a quantidade de caracteres de uma string
        System.out.println("Maior numero de letras: "+ estudantes.stream().max(Comparator.comparingInt(String::length))
                + "\n");

        //retorna o menor valor em relação a quantidade de caracteres de uma string
        System.out.println("Menor numero de letras: "+ estudantes.stream().min(Comparator.comparingInt(String::length))
                + "\n");

        //filter retorna os elementos que tem a letra R no nome
        System.out.println("Com a letra r no nome: "+ estudantes.stream().filter((estudante) ->
        estudante.toLowerCase().contains("r")).collect(Collectors.toList()) +"\n");

        //Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna umanova coleção com a quantidade de letras? "+ estudantes.stream().map(estudante ->
                estudante.concat(" -- ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()) +"\n");

        //retorna somente os 3 primeiros elementos
        System.out.println("Retorna os 3 primeiros elementos: "+ estudantes.stream().limit(3)
                .collect(Collectors.toList())
                +"\n");

        //retorna se existem elementos com a letra W
        System.out.println("Retorna itens com w no nome: "+ estudantes.stream().allMatch((elemento) ->
                elemento.contains("w")) +"\n"); //nesse casos retorna false

        //peek exibe cada elemento no console, e depois retorna a mesma colecao, é preciso passar a colection no final
        System.out.println("Retorna os elementos: "+ estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("ForEach: ");
        
        estudantes.stream().forEach(System.out::println);
    }
}
