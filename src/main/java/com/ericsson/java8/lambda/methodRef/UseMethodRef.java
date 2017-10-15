package com.ericsson.java8.lambda.methodRef;

import java.util.ArrayList;
import java.util.Collections;

public class UseMethodRef {
    static int compare(MyClass a,MyClass b){
       // return  a.getAge()-b.getAge();
        return a.getVal().length()-b.getVal().length();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> arrayList=new ArrayList<>();
        arrayList.add(new MyClass("a",1));
        arrayList.add(new MyClass("bb",2));
        arrayList.add(new MyClass("ccc",3));


        MyClass max = Collections.max(arrayList, UseMethodRef::compare);
        System.out.println(max.getAge());
    }
}
