package com.learning.streams;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static void main(String[] args) {

        List<String> nameList = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(nameList);
    }
}
