package com.orgfree.valdoneves.list;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(nomes);

        System.out.println(nomes);

        //atualizando um dado da lista
        nomes.set(3, "Larissa");

        System.out.println(nomes);
    }
}
