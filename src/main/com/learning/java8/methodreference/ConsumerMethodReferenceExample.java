package main.com.learning.java8.methodreference;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    public static void main(String[] args) {

        Consumer<String> printWord = (s) -> System.out.println(s);
        Consumer<String> printWordRef = System.out::println;

        printWord.accept("Sanjay");
        printWordRef.accept("Welcome");
    }
}
