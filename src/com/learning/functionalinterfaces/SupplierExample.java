package com.learning.functionalinterfaces;

import com.learning.data.Student;
import com.learning.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println(listSupplier.get());
    }
}
