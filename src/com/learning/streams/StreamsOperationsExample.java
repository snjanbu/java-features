package com.learning.streams;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperationsExample {

    public static void main(String[] args) {

        // Distinct
        System.out.println("DISTINCT");
        StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .forEach(System.out::print);
        System.out.println();
        System.out.println("COUNT");
        System.out.println(StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .count());
        System.out.println("SORTED");
        System.out.println(StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toUnmodifiableList()));
        System.out.println("CUSTOMIZED SORT");
        System.out.println(StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(s -> s.getName().charAt(1), Comparator.reverseOrder()))
                .collect(Collectors.toUnmodifiableList())
        );
    }
}
