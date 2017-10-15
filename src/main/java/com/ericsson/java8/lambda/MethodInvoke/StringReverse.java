package com.ericsson.java8.lambda.MethodInvoke;

public class StringReverse {
      String  reverse(String str){
         String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
}
