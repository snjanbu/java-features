package com.learning.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        BinaryOperator<String> binaryOperator = (a, b) -> a.concat(b);

        System.out.println(binaryOperator.apply("Hello", " World"));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxByBinary = BinaryOperator.maxBy(comparator);
        BinaryOperator<Integer> minByBinary = BinaryOperator.minBy(comparator);

        System.out.println(maxByBinary.apply(4, 5));
        System.out.println(minByBinary.apply(4, 5));

    }

}
