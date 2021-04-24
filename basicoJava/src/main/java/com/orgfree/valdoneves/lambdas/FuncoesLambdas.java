package com.orgfree.valdoneves.lambdas;

public class FuncoesLambdas {
    public static void main(String[] args) {
        FuncaoUm colocarPrefixoSenhorNaString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
    }
}

@FunctionalInterface
interface FuncaoUm{
    String gerar(String valor);
}