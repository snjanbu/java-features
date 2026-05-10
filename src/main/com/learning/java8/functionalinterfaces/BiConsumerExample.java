package main.com.learning.java8.functionalinterfaces;

import main.com.learning.java8.data.Student;
import main.com.learning.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a.concat(b));
        biConsumer.accept("I am", " Learning");

        BiConsumer<Integer, Integer> multiplyConsumer = (a, b) -> System.out.println("MUL: " + a*b);
        BiConsumer<Integer, Integer> divisionConsumer = (a, b) -> System.out.println("DIV: " + a/b);

        multiplyConsumer
                .andThen(divisionConsumer)
                .accept(10, 5);


        List<Student> studentList = StudentDataBase.getAllStudents();

        BiConsumer<String, List<String>> activityConsumer = (a, b) -> System.out.println("Name: " + a + " Activities: " + b);
        Consumer<Student> studentConsumer = student -> activityConsumer.accept(student.getName(), student.getActivities());

        studentList.forEach(studentConsumer);

    }
}
