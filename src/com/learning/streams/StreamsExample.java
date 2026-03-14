package com.learning.streams;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> gpaPredicate = student -> student.getGpa() > 3;
        Predicate<Student> gradeLevelPredicate = student -> student.getGradeLevel() > 2;
        List<Student> studentList = StudentDataBase.getAllStudents();
        Map<String, List<String>> resultMap = studentList.stream()
                .filter(gpaPredicate.and(gradeLevelPredicate))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(resultMap);
    }
}
