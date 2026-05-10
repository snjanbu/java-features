package main.com.learning.java8.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreamsMapExample {

    public static void main(String[] args) {

        Stream<Integer> a = IntStream.range(1, 3)
                .mapToObj(x -> new Integer(x));
    }
}
