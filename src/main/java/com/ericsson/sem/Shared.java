package com.ericsson.sem;

public class Shared {
    int num;


    public void get() throws InterruptedException {

        System.out.println("get: "+num);

    }
    public void put(int n) throws InterruptedException {
        this.num=n;
        System.out.println("put:  "+num);
    }

}
