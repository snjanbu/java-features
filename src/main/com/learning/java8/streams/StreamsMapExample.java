package main.com.learning.java8.streams;

import main.com.learning.java8.data.Student;
import main.com.learning.java8.data.StudentDataBase;

public class StreamsMapExample {

    public static void main(String[] args) {

        StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
