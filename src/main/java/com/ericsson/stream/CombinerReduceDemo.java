package com.ericsson.stream;

import java.util.ArrayList;

public class CombinerReduceDemo {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(25.0);
        arrayList.add(9.0);
        arrayList.add(4.0);
        arrayList.add(16.0);
        arrayList.add(100.0);


        Double reduce = arrayList.stream().reduce(1.0,//1200.0
                (a,b)->(a* Math.sqrt(b))
        );

        System.out.println(reduce);
    }
}
