package com.ghanathenikhil.virtualttreads;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class JavaVirtual {
    public static void main(String[] args) throws InterruptedException {


        List<Thread> vThreads = new ArrayList<>();

        int vThreadCount = 100_000;

        for(int i=0; i<vThreadCount; i++) {
            int vThreadIndex = i;
            Thread vThread = Thread.ofVirtual().start(() -> {
                BigInteger result = new BigInteger("1");
                for(int j=0; j<100; j++) {
                    result = result.multiply(new BigInteger("" + j + 1));
                }
                System.out.println("Result[" + vThreadIndex + "]: " + result);
            });

            vThreads.add(vThread);
        }
        for(int i=0; i<vThreads.size(); i++) {
            try {
                vThreads.get(i).join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
