package com.ericsson.java8.lambda.defineInterface;

import java.util.function.Function;

public class UseFunctionInterfaceDemo {


    public static void main(String[] args) {

        Function<Integer, Integer> factorial =
                (n) -> {
                    Integer sum = 1;
                    for (int i = 1; i <= n; i++) {
                        sum *= i;
                    }
                    return sum;
                };
        System.out.println(factorial.apply(3));
    }

}
