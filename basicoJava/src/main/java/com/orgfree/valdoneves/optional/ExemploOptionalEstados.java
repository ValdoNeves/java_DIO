package com.orgfree.valdoneves.optional;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor Presente");

        System.out.println("Valor opcional que está presente");
        //lambda
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        Optional<String> optionalNull = Optional.ofNullable("null");

        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null = Não está presente"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));
    }
}
