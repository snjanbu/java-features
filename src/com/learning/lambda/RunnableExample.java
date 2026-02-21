package com.learning.lambda;

public class RunnableExample {
    public static void main(String[] args) {

        // Prior to Java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        };

        runThread(runnable);

        // Java 8
        Runnable runnableLambda1 = () -> {
            System.out.println("Runnable with lambda body");
        };
        Runnable runnableLambda2 = () -> System.out.println("Runnable Lambda");

        runThread(runnableLambda1);
        runThread(runnableLambda2);

        // Comparing
        runThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Old version");
            }
        });

        runThread(() -> System.out.println("New version"));
    }

    private static void runThread(Runnable runnable) {
        new Thread(runnable).start();
    }
}
