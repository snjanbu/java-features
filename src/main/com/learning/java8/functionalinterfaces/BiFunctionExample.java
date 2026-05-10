package main.com.learning.java8.functionalinterfaces;

import main.com.learning.java8.data.Student;
import main.com.learning.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    public static void main(String[] args) {

        Predicate<Student> studentGpaPredicate = student -> student.getGpa() > 3;
        BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunctionPredicate = (studentList, studentPredicate) -> {

            Map<String, Double> gradeMap = new HashMap<>();
            studentList.forEach(student -> {
                if (studentPredicate.test(student)) {
                    gradeMap.put(student.getName(), student.getGpa());
                }
            });
            return gradeMap;
        };

        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(biFunctionPredicate.apply(studentList, studentGpaPredicate));
    }
}
