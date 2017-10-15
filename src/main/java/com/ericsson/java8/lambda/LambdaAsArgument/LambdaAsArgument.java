package com.ericsson.java8.lambda.LambdaAsArgument;

public class LambdaAsArgument {
    static String stringOpt(StringFunc stringFunc,String s){
       return stringFunc.func(s);
    }
    public static void main(String[] args) {

        StringFunc sf= (s) ->  {
                    String result="";
                    for (int i = s.length()-1; i >=0 ; i--) {
                        result+=s.charAt(i);
                    }
                    return result;
                };
        System.out.println(stringOpt(sf,"Java"));


        System.out.println(stringOpt((s) -> s.toUpperCase() ,"abcd"));
    }
}
