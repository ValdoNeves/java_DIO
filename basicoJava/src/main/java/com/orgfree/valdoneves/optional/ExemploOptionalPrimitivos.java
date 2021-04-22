package com.orgfree.valdoneves.optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {
    public static void main(String[] args) {
        System.out.println("***Valor Inteiro opcional***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("***Valor Double opcional***");
        OptionalDouble.of(12.5).ifPresent(System.out::println);

        System.out.println("***Valor long opcional***");
        OptionalLong.of(12L).ifPresent(System.out::println);
    }
}
