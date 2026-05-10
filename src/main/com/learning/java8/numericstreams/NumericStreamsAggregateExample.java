package main.com.learning.java8.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamsAggregateExample {

    public static void main(String[] args) {

        int sum = IntStream.range(1, 50)
                .sum();

        System.out.println("Sum " + sum);

        OptionalInt optionalInt = IntStream.range(1, 50)
                .max();

        System.out.println("max " + (optionalInt.isPresent() ? optionalInt.getAsInt() : 0));

        OptionalDouble optionalDouble = IntStream.range(1, 50)
                .average();

        System.out.println("average " + (optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0));
    }
}
