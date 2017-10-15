package com.ericsson.java8.lambda.withoutParam;

public class NumericTestWithoutParam {
    public static void main(String[] args) {
        MyNumber myNumber;
        myNumber =() -> 123;

        System.out.println(myNumber.getValue());

        myNumber =() -> Math.random()*100;
        System.out.println(myNumber.getValue());

        myNumber=()->Math.random()*1212;
        System.out.println(myNumber.getValue());
    }
}
