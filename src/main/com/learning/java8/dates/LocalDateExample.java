package main.com.learning.java8.dates;

import java.time.LocalDate;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date " + currentDate);

        LocalDate randomDate = LocalDate.of(2022, 10,2);
        System.out.println("Random date " + randomDate);

        LocalDate dateFromYear = LocalDate.ofYearDay(2021,34);
        System.out.println("Date from year" + dateFromYear);

        /**
         * Get values
         */
        System.out.println("Get Month "+ currentDate.getMonth());
        System.out.println("Get Month value " + currentDate.getMonthValue());
        System.out.println("GetDayofweek " + currentDate.getDayOfWeek());
        System.out.println("getDayofyear" + currentDate.getDayOfYear());
        System.out.println("get current day value of month " + currentDate.getDayOfMonth());

        /**
         * Modifying the values
         */
        System.out.println("Add days " + currentDate.plusDays(2));
        System.out.println("Add months " + currentDate.plusMonths(3));
        System.out.println("Add year" + currentDate.plusYears(2));
        System.out.println("Add weeks " + currentDate.plusWeeks(3));

        System.out.println("Minus days " + currentDate.minusDays(3));
    }
}
