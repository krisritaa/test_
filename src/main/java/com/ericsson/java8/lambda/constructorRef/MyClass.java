package com.ericsson.java8.lambda.constructorRef;

public class MyClass<T> {
    T ints;
    public MyClass(T i) {
        ints=i;
    }
    public MyClass(){

    }

    public T getInts() {
        return ints;
    }
}
