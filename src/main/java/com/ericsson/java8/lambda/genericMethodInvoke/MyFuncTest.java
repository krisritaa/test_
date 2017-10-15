package com.ericsson.java8.lambda.genericMethodInvoke;

public class MyFuncTest {

    static <T> int myOpt(MyFunc<T> func,T[] vals,T v){
        return func.func(vals,v);
    }

    public static void main(String[] args) {
        Integer[] ints=new Integer[]{1,2,3,4,5,4};
        System.out.println(myOpt(MyFuncImpl::<Integer>count,ints,4));

        String[] strs=new String[]{"Java","C","Java"};

        System.out.println(myOpt(MyFuncImpl::<String>count,strs,"Java"));
    }

}
