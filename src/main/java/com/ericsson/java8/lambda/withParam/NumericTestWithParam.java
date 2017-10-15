package com.ericsson.java8.lambda.withParam;

public class NumericTestWithParam {

    public static void main(String[] args) {
        MyValue isEven;

        isEven = (n) -> n%2==0 ;
        System.out.println(isEven.getVal(1));
        System.out.println(isEven.getVal(2));

        //object-
        MyValue isNotNeg;
        isNotNeg=(n) -> n>0;
        System.out.println(isNotNeg.getVal(-1));
        System.out.println(isNotNeg.getVal(3));


    }
}
