package com.ghanathenikhil.threads;

public class ThreadsRunnable  {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread obj = new Thread(myRunnable);
        obj.start();
        try {
            Thread.sleep(10L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myRunnable.doStop();

        Runnable myRunnable1 =
                new Runnable(){
                    public void run(){
                        System.out.println("Runnable running" + Thread.currentThread().getName());
                    }
                };
        Thread obj1 = new Thread(myRunnable1);
        obj1.start();


        Runnable runnable =
                () -> {
            System.out.println("Lambda Runnable running" + Thread.currentThread().getName());
        };
        Thread obj2 = new Thread(runnable);
        obj2.start();

    }
}
