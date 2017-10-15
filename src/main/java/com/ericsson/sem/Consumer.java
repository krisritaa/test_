package com.ericsson.sem;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    Shared shared;
    Semaphore consumerSema;
    Semaphore productSema;
   Consumer(Semaphore consumerSema,Semaphore productSema,Shared shared){
       this.shared=shared;
       this.consumerSema=consumerSema;
       this.shared=shared;
   }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            try {
                consumerSema.acquire();
                shared.get();
                productSema.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
