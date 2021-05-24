package com.orgfree.valdoneves.comparator;

public class Estudantes implements Comparable<Estudantes>{

    private final String nome;
    private final int idade;

    public Estudantes(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + "--" + idade;
    }


    @Override
    public int compareTo(Estudantes o) {
        return this.getIdade() - o.getIdade();
    }
}
