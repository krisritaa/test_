package com.ericsson.java8.lambda.MethodInvoke;

public class MethodInvokeTest {
    static String stringOpt(StringFunc sf,String  s){
        return sf.func(s);
    }
    public static void main(String[] args) {
        StringReverse stringReverse =new StringReverse();
        System.out.println(stringOpt(stringReverse::reverse,"java app"));
    }
}
