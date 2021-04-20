package com.orgfree.valdoneves.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args){

        List<String> esportes = new Vector<>();

        //Adicionando 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        //Alterar o valor da posicao 2 do vetor
        esportes.set(2, "Ping Pong");

        //remove o esporte da posicao 2
        esportes.remove(2);

        //remove o esporte handebol do vetor
        esportes.remove("Handebol");

        //retorna o primeiro item do vetor e impreme na tela
        System.out.println(esportes.get(0));

        //navega no vetor
        for(String esporte: esportes){
            System.out.println("-->" + esporte);
        }

    }
}
