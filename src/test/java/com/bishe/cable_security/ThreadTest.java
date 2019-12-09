package com.bishe.cable_security;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadTest {


    public static void main(String[] args) {
        ArrayBlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue(1000);
        ThreadFactory factory = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 10, 30, TimeUnit.MINUTES, blockingQueue, factory);
        int a = 3, b = 1;
        do {
            List<Future> futures = new ArrayList<>();
            for (int i = b; i < b * 10; i++) {
                while (blockingQueue.size() > 800) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int finalI = i;
                Future future = threadPoolExecutor.submit(() -> {
                    System.out.print(finalI + " , ");
                    try {
                        Thread.sleep(2000-finalI);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                futures.add(future);
            }
            try {
                for (int i = 0; i < futures.size(); i++) {
                    futures.get(i).get();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("一遍执行完毕");
            b += 2;
            a--;
        } while (a > 0);
        threadPoolExecutor.shutdown();

    }
}
