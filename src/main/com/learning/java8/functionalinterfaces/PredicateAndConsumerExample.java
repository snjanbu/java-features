package main.com.learning.java8.functionalinterfaces;

import main.com.learning.java8.data.Student;
import main.com.learning.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String, List<String>> biConsumer = (a, b) ->
                System.out.println("Name " + a + " Activities " + b);
        Predicate<Student> gradeGreaterThan3 = student -> student.getGradeLevel() > 3;
        Predicate<Student> gpaGreaterThan3 = student -> student.getGpa() > 3;
        BiPredicate<Integer, Double> biPredicate = (a, b) -> a> 3 && b > 3;

        Consumer<Student> studentConsumer = student -> {
            if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
                biConsumer.accept(student.getName(), student.getActivities());
            }
        };

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);


    }
}
