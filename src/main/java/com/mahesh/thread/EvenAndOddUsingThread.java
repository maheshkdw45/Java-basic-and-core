package com.mahesh.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenAndOddUsingThread {
    private static AtomicInteger atomicInteger = new AtomicInteger(1);
    public static void main(String[] args) {

        Runnable runnable = ()->{

            while(atomicInteger.get()<10){
                synchronized (atomicInteger){
                    if(atomicInteger.get() % 2==0 && "Even".equalsIgnoreCase(Thread.currentThread().getName())){
                        System.out.println("Even : "+ atomicInteger.getAndIncrement());
                    }else if(atomicInteger.get() % 2!=0 && "Odd".equalsIgnoreCase(Thread.currentThread().getName())){
                        System.out.println("Odd : "+ atomicInteger.getAndIncrement());
                    }
                }

            }

        };

        Thread t1= new Thread(runnable,"Even");
        Thread t2= new Thread(runnable,"Odd");

        t1.start();
        t2.start();



    }
}
