package main.com.learning.java8.terminaloperations;

import main.com.learning.java8.data.Student;
import main.com.learning.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy2 {

    public static void main(String[] args) {

        Map<String, Map<Integer, List<Student>>> genderMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.groupingBy(Student::getGradeLevel)));
        
        Map<String, List<String>> customMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.mapping(Student::getName, Collectors.toList())));

        System.out.println(genderMap);
        System.out.println(customMap);
    }
}
