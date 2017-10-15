package com.ericsson.cocurrent.Sem.simple;

import java.util.concurrent.Semaphore;

public class DecThread implements Runnable {
    String name;
    Semaphore semaphore;//consumer and product need to get the semaphore to run their thread

    public DecThread(String name) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println("DecThread start");
        try {
            //semaphore.acquire();

            System.out.println("get semaphore");
            for (int i = 0; i < 10; i++) {
                Shared.sum--;
                System.out.println(name + " : " + Shared.sum);
                Thread.sleep(5);
            }

            System.out.println(name + "release semaphore");
            //semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
