package com.ericsson.java8.lambda.block;

import java.util.concurrent.ThreadFactory;

public class BlockLambdaDemo {
    public static final ThreadFactory THREADLOCAL= r -> new Thread(r);
    public static void main(String[] args) {
        NumericFun factorial;
        factorial = (n) -> {
            int sum = 1;
            for (int i = 1; i <=n; i++) {
                sum = sum * i;
            }
            return sum;
        };
        System.out.println(factorial.func(3));
    }
}
