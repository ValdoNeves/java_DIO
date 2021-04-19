package com.orgfree.valdoneves.orientacaoAObjeto;

public class Carro {
    private int qtdPessoas;

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        if(qtdPessoas > 0 && qtdPessoas <= 5) {
            this.qtdPessoas = qtdPessoas;
        }else{
            System.out.println("valor maximo de 5 pessoas");
            this.qtdPessoas = 5;
        }
    }

    public void removePessoas(int qtd){
        if(qtd <= qtdPessoas && qtdPessoas > 0) {
            qtdPessoas = qtdPessoas - qtd;
        }else{
            System.out.println("Operação invalida");
        }
    }

    public void addPessoas(int qtd){
        if(qtdPessoas > 0 && qtdPessoas < 5){
            qtdPessoas = qtdPessoas + qtd;
        }else{
            System.out.println("Limite excedido");
        }
    }
}
