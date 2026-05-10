package main.com.learning.java8.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    public static void main(String[] args) {

        Function<String, String> toUpperCase = s -> s.toUpperCase();

        Function<String, String> toUpperCaseMethodReference = String::toUpperCase;

        System.out.println(toUpperCase.apply("hello"));
        System.out.println(toUpperCaseMethodReference.apply("hello"));
    }
}
