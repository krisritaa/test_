package com.ericsson.sem;

import java.util.concurrent.Semaphore;

public class Product implements Runnable {
    Shared shared;
    Semaphore productSema;
    Semaphore cosumerSema;

    public Product(Semaphore productSema,Semaphore cosumerSema,Shared shared) {
        this.shared = shared;
        this.productSema=productSema;
        this.cosumerSema=cosumerSema;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                productSema.acquire();
                shared.put(i);
                cosumerSema.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
