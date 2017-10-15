package com.ericsson.java8.lambda.generic;

public class GenericTest {

    public static void main(String[] args) {
        SomeFun<String> reverseStr=(n) ->{
            String result="";
            for (int i = n.length()-1; i >=0 ; i--) {
                result +=n.charAt(i);
            }
            return result;
        };
        System.out.println(reverseStr.func("abcdefghijklmn"));


        SomeFun<Integer> factorial=(n) ->{
            Integer sum=1;
            for (int i = 1; i <=n ; i++) {
                sum=sum *i;
            }
            return  sum;
        };
        System.out.println(factorial.func(3));
    }
}
