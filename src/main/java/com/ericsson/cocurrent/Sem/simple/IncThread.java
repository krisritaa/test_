package com.ericsson.cocurrent.Sem.simple;

import java.util.concurrent.Semaphore;

public class IncThread implements Runnable {
    String name;
    Semaphore semaphore;//consumer and product need to get the semaphore to run their thread

    public IncThread(String name) {
        this.name = name;

    }

    @Override
    public void run() {
        System.out.println("IncThread start");
        try {
          //  semaphore.acquire();

            System.out.println("get semaphore");
            for (int i = 0; i < 10; i++) {
                Shared.sum++;
                System.out.println(name + " : " + Shared.sum);
                Thread.sleep(5);
            }

            System.out.println(name + "release semaphore");
           // semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
