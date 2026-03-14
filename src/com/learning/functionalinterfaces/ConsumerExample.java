package com.learning.functionalinterfaces;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();
    static Consumer<Student> studentConsumer = student -> System.out.println(student);
    static Consumer<Student> studentNameConsumer = student -> System.out.print(student.getName());
    static Consumer<Student> studentActivityConsumer = student -> System.out.println(student.getActivities());

    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("Sanjay");

        printAllStudents();
        printAllStudentNameAndActivities();
        printAllStudentNameAndActivitiesFiltered();
    }

    private static void printAllStudents() {

        System.out.println("PRINT ALL STUDENTS");
        studentList.forEach(studentConsumer);
    }

    private static void printAllStudentNameAndActivities() {

        System.out.println("PRINT ALL STUDENT Name and Activities");
        studentList.forEach(studentNameConsumer.andThen(studentActivityConsumer));
    }

    private static void printAllStudentNameAndActivitiesFiltered() {

        System.out.println("PRINT ALL STUDENT Name and Activities FILTERED");
        studentList.forEach(student -> {
            if (student.getGpa() > 3) {
                studentNameConsumer
                        .andThen(studentActivityConsumer)
                        .accept(student);
            }
        });
    }
}
