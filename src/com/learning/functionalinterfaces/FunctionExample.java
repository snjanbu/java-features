package com.learning.functionalinterfaces;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<String, String> changeToUpperCaseFunction = s -> s.toUpperCase();
        Function<String, String> concatDefaultFunction = s -> s.concat(" default");
        Function<List<Student>, Map<String, Double>> studentMapFunction = studentList -> {
            Map<String, Double>  studentMap = new HashMap<>();
            studentList.forEach(student -> {
                studentMap.put(student.getName(), student.getGpa());
            });
            return studentMap;
        };

        List<Student> studentList = StudentDataBase.getAllStudents();

        System.out.println(changeToUpperCaseFunction.apply("Sanjay"));
        System.out.println(changeToUpperCaseFunction.andThen(concatDefaultFunction).apply("Sanjay"));
        System.out.println(changeToUpperCaseFunction.compose(concatDefaultFunction).apply("Sanjay"));
        System.out.println(studentMapFunction.apply(studentList));
    }
}
