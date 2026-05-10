package main.com.learning.java8.terminaloperations;

import main.com.learning.java8.data.Student;
import main.com.learning.java8.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

    public static void main(String[] args) {

        int sum = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));

        System.out.println(sum);
    }
}
