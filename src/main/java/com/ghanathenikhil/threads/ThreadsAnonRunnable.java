package com.ghanathenikhil.threads;

public class ThreadsAnonRunnable {


    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run(){
                System.out.println("Thread Running");
            }
        };

        thread.start();
    }
}
