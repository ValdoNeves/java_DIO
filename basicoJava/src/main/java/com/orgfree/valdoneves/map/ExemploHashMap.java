package com.orgfree.valdoneves.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {
        Map<String, Integer> campeoes = new HashMap<>();

        //populando map
        campeoes.put("Brasil", 5);
        campeoes.put("Alemanhã", 4);
        campeoes.put("Itália", 4);
        campeoes.put("Uruguai", 2);
        campeoes.put("Argentina", 2);
        campeoes.put("França", 2);
        campeoes.put("Inglaterra", 1);
        campeoes.put("Espanha", 1);

        System.out.println(campeoes);

        //atualiza o valor para a chave Brasil
        campeoes.put("Brasil", 6);
        System.out.println(campeoes);

        //retorna a argentina
        System.out.println(campeoes.get("Argentina"));

        //retorna se existir ou não um campeao franca
        System.out.println(campeoes.containsKey("França"));

        //remove o campeao franca
        campeoes.remove("França");
        System.out.println(campeoes);

        //laço utilizando um Map
        for(Map.Entry<String, Integer> analisa : campeoes.entrySet()) {

            System.out.println(analisa.getKey() + " -----> " + analisa.getValue());
        }
    }
}
