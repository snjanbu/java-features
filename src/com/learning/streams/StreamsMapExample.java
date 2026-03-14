package com.learning.streams;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

public class StreamsMapExample {

    public static void main(String[] args) {

        StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
