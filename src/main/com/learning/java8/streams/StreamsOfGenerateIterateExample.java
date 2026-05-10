package main.com.learning.java8.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamsOfGenerateIterateExample {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("sanjay", "anbu");
        stringStream.forEach(System.out::println);

        Stream.iterate(1, x -> x+ 5)
                .limit(3)
                .forEach(System.out::println);

        Stream.generate(() -> new Random().nextInt())
                .limit(3)
                .forEach(System.out::println);

    }
}
