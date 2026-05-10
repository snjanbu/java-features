package main.com.learning.java8.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortWithDefault {

    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("Jack", "Doe", "Anne", "Jim", null, "Ronald");

        Comparator<String> nameFirstComparator = Comparator.nullsFirst(Comparator.naturalOrder());
        namesList.sort(nameFirstComparator);

        System.out.println("Nulls first " + namesList);

        Comparator<String> nameLastComparator = Comparator.nullsLast(Comparator.naturalOrder());
        namesList.sort(nameLastComparator);

        System.out.println("nulls last " + namesList);


        namesList.sort(Comparator.naturalOrder());
    }
}
