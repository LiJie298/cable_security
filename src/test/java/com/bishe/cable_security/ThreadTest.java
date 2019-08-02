package com.bishe.cable_security;

import java.util.concurrent.*;

public class ThreadTest {


    public static void main(String[] args) {
        ArrayBlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue(1000);
        ThreadFactory factory = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10, 30, TimeUnit.MINUTES, blockingQueue, factory);
        int a = 5;
        do {
            for (int i = 0; i < 800; i++) {
                while (blockingQueue.size() > 800) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int finalI = i;
                threadPoolExecutor.execute(() -> {
                    System.out.print(finalI + " , ");
                });
            }
            System.out.println("");
            System.out.println("一遍执行完毕");
            a--;
        } while (a > 0);
        threadPoolExecutor.shutdown();
        try {
            while (true) {
                if (threadPoolExecutor.isTerminated()) {
                    break;
                }
            }
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
