package com.ericsson.java8.lambda.twoParam;

public class LambdaTest3 {
    public static void main(String[] args) {
        NumericTest2 numericTest2;
        numericTest2 =(n,m) -> (m % n==0);
        System.out.println(numericTest2.isFactor(3,12));

        numericTest2=(n,m) -> n>m;
        System.out.println(numericTest2.isFactor(2,3));
    }
}
