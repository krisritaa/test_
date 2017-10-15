package com.ericsson.java8.lambda.reverseString;

public class BlockLambdaTest2 {
    public static void main(String[] args) {
        ReverseStr reverseStr;
        reverseStr =(n) -> {
            String result="";
            for (int i = n.length()-1; i>=0 ; i--) {
                result+=n.charAt(i);
            }
            return result;
        };
        System.out.println(reverseStr.reverse("java 8 lambda"));
    }
}
