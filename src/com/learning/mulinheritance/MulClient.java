package com.learning.mulinheritance;

public class MulClient implements Interface1, Interface2, Interface3 {

    public static void main(String[] args) {

        MulClient mulClient = new MulClient();
        mulClient.methodA();
        mulClient.methodB();
        mulClient.methodC();
    }
}
