package main.com.learning.java8.dates;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime randomTime = LocalTime.of(23, 3);
        System.out.println(randomTime);

        LocalTime timeWithSeconds = LocalTime.of(3, 2, 2);
        System.out.println(timeWithSeconds);

        LocalTime timeWithNanoSeconds = LocalTime.of(2, 3, 2, 3);
        System.out.println(timeWithNanoSeconds);

        /**
         * Get values
         */

    }
}
