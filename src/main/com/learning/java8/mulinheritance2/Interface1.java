package main.com.learning.java8.mulinheritance2;

public interface Interface1 {

    default void methodA() {
        System.out.println(" Inside method A " + Interface1.class);
    }
}
