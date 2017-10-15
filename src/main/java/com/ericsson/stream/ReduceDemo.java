package com.ericsson.stream;

import java.util.ArrayList;

public class ReduceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);


        Integer reduce = arrayList.parallelStream().reduce(1,(a, b) -> a * b );

        System.out.println(
                reduce
        );


    }
}
