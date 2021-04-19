package com.orgfree.valdoneves.orientacaoAObjeto;

public class testeCarros {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setQtdPessoas(4);
        System.out.println(carro.getQtdPessoas());
        carro.addPessoas(1);
        System.out.println(carro.getQtdPessoas());
        carro.addPessoas(1);
        System.out.println(carro.getQtdPessoas());

        carro.removePessoas(4);
        System.out.println(carro.getQtdPessoas());
    }
}
