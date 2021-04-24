package com.orgfree.valdoneves.fatorialRecursivo;

import java.util.function.UnaryOperator;

public class ParadigmaFuncional {
    public static void main(String[] args) {
        //paradigma declarativo, passar um valor lambda, o que eu quero quando passar um parametro
        UnaryOperator<Integer> calcularValorVezesTres = valor -> valor*3;// conceito do paradigma funcional
        int valor = 10;
        System.out.println("O resultado é  ::"+ calcularValorVezesTres.apply(valor));
    }
}
