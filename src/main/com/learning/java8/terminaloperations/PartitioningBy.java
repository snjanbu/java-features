package main.com.learning.java8.terminaloperations;

import main.com.learning.java8.data.Student;
import main.com.learning.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningBy {

    public static void main(String[] args) {

        Predicate<Student> gpaPredicate = student -> student.getGpa() > 3.5;

        Map<Boolean, List<Student>> smap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate));

        System.out.println(smap);

        Map<Boolean, List<String>> nmap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate,
                        Collectors.mapping(Student::getName, Collectors.toList())));

        System.out.println(nmap);
    }
}
