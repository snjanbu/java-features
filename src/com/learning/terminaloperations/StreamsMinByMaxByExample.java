package com.learning.terminaloperations;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    public static void main(String[] args) {

        Optional<Student> minStudent = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));

        System.out.println(minStudent);

        Optional<Student> maxStudent = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));

        System.out.println(maxStudent);
    }
}
