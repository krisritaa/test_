package com.ericsson.cocurrent.Sem.simple;

public class SemDemo {
    public static void main(String[] args) {
        IncThread jojo = new IncThread("jojo");
        DecThread yoyo = new DecThread("yoyo");

        Thread jojoThread = new Thread(jojo, "jojo");
        Thread yoyoThread = new Thread(yoyo, "yoyo");
        jojoThread.run();
        yoyoThread.run();
    }
}
