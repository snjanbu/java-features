package main.com.learning.java8.mulinheritance;

public interface Interface3 {

    default void methodC() {
        System.out.println(" Inside Method C " + Interface3.class);
    }
}
