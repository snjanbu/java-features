package com.learning.constructorreference;

import com.learning.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    public static void main(String[] args) {

        Supplier<Student> s1 = Student::new;
        Function<String, Student> f1 = Student::new;

        System.out.println(s1.get());
        System.out.println(f1.apply("Sanjay"));
    }
}
