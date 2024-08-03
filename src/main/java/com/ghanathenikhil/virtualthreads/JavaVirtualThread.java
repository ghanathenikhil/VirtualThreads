package com.ghanathenikhil.virtualthreads;

public class JavaVirtualThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for(int i=0; i<10; i++) {
                System.out.println("Index: " + i);
            }
        };

        Thread vThread = Thread.ofVirtual().start(runnable);
        vThread.join();

        Thread vThreadUnstarted = Thread.ofVirtual().unstarted(runnable);
        vThreadUnstarted.start();
        vThreadUnstarted.join();




    }
}
