package com.ericsson.sem;

import java.util.concurrent.Semaphore;

public class Demo {
    public static void main(String[] args) {
        Semaphore conSem=new Semaphore(0);//consumer
        Semaphore proSem=new Semaphore(1);//product
        Shared shared=new Shared();
        Product product = new Product(proSem,conSem,shared);
        Consumer consumer = new Consumer(conSem,proSem,shared);
        Thread productThread = new Thread(product, "productThread");
        Thread consumerThread = new Thread(consumer, "consumerThread");

        productThread.run();
        consumerThread.run();

    }
}
