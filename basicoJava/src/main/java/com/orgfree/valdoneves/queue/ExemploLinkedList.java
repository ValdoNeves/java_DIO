package com.orgfree.valdoneves.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {

        Queue<String> filaDeBanco = new LinkedList<>();

        //adicionar itens
        filaDeBanco.add("Patricia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flávio");
        filaDeBanco.add("Pamela");
        filaDeBanco.add("Anderson");

        System.out.println(filaDeBanco);

        //imprime o primeiro item da lista, mas o exclui
        String clienteASerAtendidoComPoll = filaDeBanco.poll();

        System.out.println(clienteASerAtendidoComPoll);
        System.out.println(filaDeBanco);

        //imprime o primeiro item da lista, mas não o exclui
        String clienteASerAtendidoComPeek = filaDeBanco.peek();
        System.out.println(clienteASerAtendidoComPeek);
        System.out.println(filaDeBanco);

        //imprime o primeiro item da lista, mas não o exclui mas pode voltar uma exception em caso de lista vazia
        String clienteASerAtendidoComElement = filaDeBanco.element();
        System.out.println(clienteASerAtendidoComElement);
        System.out.println(filaDeBanco);

    }
}
