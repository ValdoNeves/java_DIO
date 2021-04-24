package com.orgfree.valdoneves.lambdas;

public class FuncoesAnonimas {
    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString = new Funcao(){
          @Override
          public String gerar(String valor){
              return "Sr. " + valor;
          }
        };
        System.out.println(colocarPrefixoSenhorNaString.gerar("Valdo"));
    }
}

@FunctionalInterface
interface Funcao{
    String gerar(String valor);
}
