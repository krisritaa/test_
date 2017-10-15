package com.ericsson.stream;


import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.stream().sorted().filter((n) -> (n % 2 == 1)).forEach((n) -> System.out.println(n));


//        Stream<Integer> stream = arrayList.stream();
//
//        Optional<Integer> min = stream.min(Integer::compare);
//        if(min.isPresent()){
//            System.out.println(min.get());
//        }
//
//         stream = arrayList.stream();
//        Integer max1 = Collections.max(arrayList, Integer::compare);
//        System.out.println(max1);
//
//        Optional<Integer> max = stream.max(Integer::compare);
//        if(max.isPresent()){
//            System.out.println(max.get());
//        }


    }


}
