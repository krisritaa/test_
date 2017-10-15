package com.ericsson.java8.lambda.genericMethodInvoke;

public class MyFuncImpl {
  static <T> int count(T[] vals,T val){
        int sum=0;
        for (int i = 0; i <vals.length ; i++) {
            if (vals[i]==val){
                sum ++;
            }
        }
        return sum;
    }
}
