package com.learning.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        UnaryOperator<String> unaryOperator = s -> s.concat(" World");

        System.out.println(unaryOperator.apply("Hello"));

    }
}
