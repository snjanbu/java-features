package main.com.learning.java8.functionalinterfaces;

import main.com.learning.java8.data.Student;
import main.com.learning.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println(listSupplier.get());
    }
}
