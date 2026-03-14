package com.learning.functionalinterfaces;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> isEven = a -> a%2 == 0;
        Predicate<Integer> isOdd = isEven.negate();
        Predicate<Integer> isGreaterThanTen = a -> a > 10;
        Predicate<Student> gradeGreaterThan3 = student -> student.getGradeLevel() > 3;



        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if (gradeGreaterThan3.test(student)) {
                System.out.println(student);
            }
        });

        System.out.println(isEven.test(10));
        System.out.println(isGreaterThanTen.test(15));
        System.out.println(isEven.and(isGreaterThanTen).test(15));
        System.out.println(isEven.or(isGreaterThanTen).test(15));
        System.out.println(isOdd.test(9));
    }
}
