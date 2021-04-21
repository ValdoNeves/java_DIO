package com.orgfree.valdoneves.set;

import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        //monta a arvore com as capitaos
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.first());

        //retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.last());

        //retorna a primeira capital abaixo na arvore de capital parametrizada
        System.out.println(treeCapitais.lower("Florianopolis"));

        //retorna a primeira capital acima na arvore de capital parametrizada
        System.out.println(treeCapitais.higher("Florianopolis"));

        //exibe todas as capitais no console
        System.out.println(treeCapitais);


    }
}
