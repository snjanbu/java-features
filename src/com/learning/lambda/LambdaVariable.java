package com.learning.lambda;

import java.util.function.Consumer;

public class LambdaVariable {

    static int z = 3;
    public static void main(String[] args) {

        int i = 10;

        Consumer<Integer> consumer  = (y) -> {
            LambdaVariable.z++;
            System.out.println(LambdaVariable.z + y);
        };

        consumer.accept(333);
        System.out.println(i);
    }
}
