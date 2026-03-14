package com.learning.terminaloperations;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy1 {

    public static void main(String[] args) {

        Map<String, List<Student>> genderMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));
        
        Map<String, List<Student>> customMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() > 3 ? "OUTSTANDING" : "NORMAL"));

        System.out.println(genderMap);
        System.out.println(customMap);
    }
}
