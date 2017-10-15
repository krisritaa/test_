package com.ericsson.map;

import java.util.ArrayList;
import java.util.Spliterator;

public class MapStream {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student s1 = new Student("KIRS", 11, "110@QQ.COM");
        Student s2 = new Student("JESSE", 12, "120@QQ.COM");
        Student s3 = new Student("YOYO", 13, "130@QQ.COM");
        Student s4= new Student("Jojo", 14, "130@QQ.COM");
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
//        trySplite :
//        Student{name='KIRS', age=11, email='110@QQ.COM'}
//        Student{name='JESSE', age=12, email='120@QQ.COM'}
//=========
//        the other part :
//        Student{name='YOYO', age=13, email='130@QQ.COM'}
//        Student{name='Jojo', age=14, email='130@QQ.COM'}
//=========
        Spliterator<Student> spliterator = arrayList.spliterator();
        Spliterator<Student> trySplit = spliterator.trySplit();
        if(trySplit!=null){
            System.out.println("trySplite : ");
            trySplit.forEachRemaining((n)-> System.out.println(n));
        }

        System.out.println("========= ");
        System.out.println("the other part : ");
       spliterator.forEachRemaining((n)-> System.out.println(n));

        System.out.println("========= ");
//        arrayList.stream().forEach((n)-> System.out.println(n.toString()));
//        Stream<SimpleStudent> simpleStudentStream = arrayList.stream().
//                map((n) -> (new SimpleStudent(n.getName(), n.getAge()))).
//                filter((n)->(n.getName().equals("YOYO")));
//
//        List<SimpleStudent> collect = simpleStudentStream.collect(Collectors.toList());
//        System.out.println(collect);
       // simpleStudentStream.forEach((n) -> System.out.println(n.toString()));


    }
}
