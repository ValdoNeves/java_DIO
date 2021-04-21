package com.orgfree.valdoneves.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        //adiciona notas
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        //remove a nota do set
        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);

        //retorna a quantidade de itens do set e imprime
        System.out.println(notasAlunos.size());

        //navega em todos os itens do iterador
        Iterator<Double> iterador = notasAlunos.iterator();

        while (iterador.hasNext()){
            System.out.println(iterador.next());
        }
        for(double nota: notasAlunos){
            System.out.println(nota);
        }

        //limpa todos os itens
        notasAlunos.clear();

        //verifica se esta vazia
        System.out.println(notasAlunos.isEmpty());

    }
}
