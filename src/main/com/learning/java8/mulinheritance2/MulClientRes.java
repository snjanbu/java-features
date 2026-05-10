package main.com.learning.java8.mulinheritance2;

public class MulClientRes implements Interface1, Interface2 {

    public void methodA() {
        System.out.println("Inside methodA " + MulClientRes.class);
    }

    public static void main(String[] args) {
        MulClientRes mulClientRes = new MulClientRes();
        mulClientRes.methodA();
    }
}
