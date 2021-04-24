package com.orgfree.valdoneves.fatorialRecursivo;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retornaODobro = valorRecebido -> valorRecebido * 2;
        System.out.println(retornaODobro.apply(valor));//retorna o dobro do valor
        System.out.println(valor); //valor nao sera alterado

    }
}
