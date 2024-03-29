package com.orgfree.valdoneves.orientacaoAObjeto;

public class Carro {

    private int qtdPessoas;
    private final String marca;
    private final String modelo;
    private final int ano;
    private String variante;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

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
