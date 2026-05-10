package main.com.learning.java8.mulinheritance2;

public interface Interface2 {

    default void methodA() {
        System.out.println(" Inside method A " + Interface2.class);
    }
}
