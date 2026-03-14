package com.learning.methodreference;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static boolean verifyIfGradeGreaterThan3(Student student) {
        return student.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {

        Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;

        Predicate<Student> p2 = RefactorMethodReferenceExample::verifyIfGradeGreaterThan3;

        System.out.println(p1.test(StudentDataBase.getAllStudents().getFirst()));
        System.out.println(p2.test(StudentDataBase.getAllStudents().getFirst()));
    }
}
