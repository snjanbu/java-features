package main.com.learning.java8.terminaloperations;

import main.com.learning.java8.data.Student;
import main.com.learning.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static void main(String[] args) {

        List<String> studentNameList = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        List<String> nameList = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));

        System.out.println("StudentNameList " + studentNameList);
        System.out.println("Name List " + nameList);
    }
}
