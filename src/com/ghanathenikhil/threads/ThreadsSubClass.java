package com.ghanathenikhil.threads;

public class ThreadsSubClass extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        ThreadsSubClass obj = new ThreadsSubClass();
        obj.start();
    }
}
