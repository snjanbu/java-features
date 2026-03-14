package com.learning.sort;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {

        Multiplier multiplier = new MultiplierImpl();

        List<Integer> integerList = Arrays.asList(1, 3, 5);

        System.out.println(" Multiply Result is : " + multiplier.multiply(integerList));
        System.out.println(" Multiply Size is : " + multiplier.size(integerList));
        System.out.println(" Multiply null check is " + Multiplier.isNotEmpty(integerList));
    }
}
