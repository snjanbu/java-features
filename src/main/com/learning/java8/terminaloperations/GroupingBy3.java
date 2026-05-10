package main.com.learning.java8.terminaloperations;

import main.com.learning.java8.data.Student;
import main.com.learning.java8.data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingBy3 {

    public static void main(String[] args) {


        LinkedHashMap<String, List<String>> customMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        LinkedHashMap::new,
                        Collectors.mapping(Student::getName, Collectors.toList())));

        System.out.println(customMap);
    }
}
