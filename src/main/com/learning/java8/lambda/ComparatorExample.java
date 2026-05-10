package main.com.learning.java8.lambda;

import java.util.Comparator;

public class ComparatorExample {

    public static void main(String[] args) {

        // Prior to Java 8
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        compareInt(comparator);

        // Java 8

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);

        Comparator<Integer> integerComparator = (a, b) -> a.compareTo(b);

        compareInt(comparatorLambda);
        compareInt(integerComparator);
    }

    private static void compareInt(Comparator<Integer> comparator) {
        System.out.println("Comparing " + comparator.compare(2, 3));
    }
}
