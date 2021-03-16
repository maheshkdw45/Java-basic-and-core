package com.mahesh.thread;

public class ThreadDemo {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> System.out.println("Thread "+Thread.currentThread().getName()+" running "));
        Thread thread2 = new Thread(() -> System.out.println("Thread "+Thread.currentThread().getName()+" running "));

        thread1.start();
        thread2.start();
    }
}
