package com.learning.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingExample {

    public static void main(String[] args) {


        List<Integer> resultList = IntStream.range(1, 50)
                .boxed()
                .collect(Collectors.toUnmodifiableList());

        int sum = resultList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
