package com.orgfree.valdoneves.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        //instanciando lista
        List<String> nomes = new ArrayList<>();

        //populando lista
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");

        //imprimindo lista
        System.out.println(nomes);

        //ordenando por ordem alfabetica
        List<String> teste;
        teste = Collections.sort(nomes);

        System.out.println(nomes);

        //atualizando um dado da lista
        nomes.set(3, "Larissa");

        System.out.println(nomes);

        //remove baseado na posicao
        nomes.remove(0);
        System.out.println(nomes);

        //remove baseado no objeto
        nomes.remove("João");
        System.out.println(nomes);

        //pega o objeto baseando-se na sua posição
        String nome = nomes.get(2);

        System.out.println(nome);

        //tamanho da lista size()
        int tamanho = nomes.size();
        System.out.println(tamanho);

        for (String nomeDoItem: nomes) {
            System.out.println(nomeDoItem);
        }
        //utilizando uma lista junto com um iterator, ela pode ser
        // usada com o laço de repeticao While
        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            //o next retorna o objeto que o iterator estiver interagindo no momento
            System.out.println(iterator.next());
        }


    }
}
