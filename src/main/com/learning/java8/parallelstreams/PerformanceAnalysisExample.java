package main.com.learning.java8.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class PerformanceAnalysisExample {

    public static long measurePerformance(Supplier<Integer> supplier, int numberOfTimes) {

        long startTime = System.currentTimeMillis();
        for (int i=0;i<numberOfTimes;i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static Integer sumSequential() {
        return IntStream.rangeClosed(1, 10000000)
                .sum();
    }

    public static Integer sumParallel() {
        return IntStream.rangeClosed(1, 1000000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential " + measurePerformance(PerformanceAnalysisExample::sumSequential, 200));
        System.out.println("Parallel " + measurePerformance(PerformanceAnalysisExample::sumParallel, 200));
    }
}
