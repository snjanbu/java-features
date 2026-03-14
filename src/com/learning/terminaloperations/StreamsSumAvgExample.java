package com.learning.terminaloperations;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

    public static void main(String[] args) {

        int sum = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));

        System.out.println(sum);
    }
}
