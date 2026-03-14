package com.learning.terminaloperations;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingByMax {

    public static void main(String[] args) {

        Map<String, Optional<Student>> optionalMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(optionalMap);

        Map<Integer, Student> gradeLevelTopperMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)));

        System.out.println(gradeLevelTopperMap);
    }
}
