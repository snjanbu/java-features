package main.com.learning.java8.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangeExample {

    public static void main(String[] args) {

        System.out.println("Intstream Range Closed");
        IntStream.rangeClosed(1, 50).forEach(System.out::print);

        System.out.println("Intstream Range");
        IntStream.range(1, 50).forEach(System.out::print);

        System.out.println("LongStream Range Closed");
        LongStream.rangeClosed(1, 50).forEach(System.out::print);

        System.out.println("LongStream Range");
        LongStream.range(1, 50).forEach(System.out::print);

        System.out.println("Double Stream");
        IntStream.range(1, 50).asDoubleStream().forEach(System.out::print);
    }
}
