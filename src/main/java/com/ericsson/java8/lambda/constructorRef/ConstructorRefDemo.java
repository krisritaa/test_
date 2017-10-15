package com.ericsson.java8.lambda.constructorRef;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc<String> myFunc=MyClass<String>::new;

        MyClass myClass = myFunc.func("JAVA");
        System.out.println(myClass.getInts());
    }
}
