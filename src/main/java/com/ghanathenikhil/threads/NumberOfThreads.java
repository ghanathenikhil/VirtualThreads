package com.ghanathenikhil.threads;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class NumberOfThreads {

    private static final int TOTAL_NO_OF_THREADS = 40000;

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        Instant start = Instant.now();

        // Creating 1 million Java Platform Threads
        for (int i = 0; i < TOTAL_NO_OF_THREADS; i++) {
            Thread thread = new Thread(() -> {
                // Thread work goes here
            });
            threads.add(thread);
            thread.start();
        }

        // Wait for all platform threads to finish
        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Instant end = Instant.now();
        Duration platformThreadCreationTime = Duration.between(start, end);



        System.out.println("Time taken to create 1 million Java Platform Threads: " + platformThreadCreationTime);

    }

}