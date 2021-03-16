package com.mahesh.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadSquenceUsingTwoThread {


    public static void main(String[] args) throws InterruptedException {

        Executor executor= Executors.newFixedThreadPool(2);

        Runnable runnable= () ->{


            IntStream.rangeClosed(0,10).forEach(i -> {
                System.out.println(Thread.currentThread().getName() +" "+i);
                /*try {
//                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            });
        };

        Thread t1= new Thread(runnable,"T1");
        Thread t2= new Thread(runnable,"T2");

//        executor.execute(runnable);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }
}
