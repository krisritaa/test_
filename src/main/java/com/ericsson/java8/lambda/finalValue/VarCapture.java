package com.ericsson.java8.lambda.finalValue;

public class VarCapture {
    public static void main(String[] args) {
        Myfunc myfunc;
        int num=10;
        myfunc=(n)-> num+n;
        System.out.println(myfunc.func(10));

        myfunc =(n)->{
            return num+n;
        };
        System.out.println(myfunc.func(110));
    }
}
