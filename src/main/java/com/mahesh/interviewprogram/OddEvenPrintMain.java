package com.mahesh.interviewprogram;

import java.util.stream.IntStream;

public class OddEvenPrintMain {



    // Starting counter
    int counter = 1;

    static int N;

    // Function to print odd numbers
    public void printOddNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < 10) {

                // If count is even then print
                while (counter % 2 == 1) {

                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number
                System.out.print(counter + " ");

                // Increment counter
                counter++;

                // Notify to second thread
                notify();
            }
        }
    }

    // Function to print even numbers
    public void printEvenNumber()
    {
        synchronized (this)
        {
            // Print number till the N
            while (counter < 10) {

                // If count is odd then print
                while (counter % 2 == 0) {

                    // Exception handle
                    try {
                        wait();
                    }
                    catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Print the number
                System.out.print(
                        counter + " ");

                // Increment counter
                counter++;

                // Notify to 2nd thread
                notify();
            }
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Given Number N
        N = 10;

        // Create an object of class
       OddEvenPrintMain mt = new OddEvenPrintMain();

        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.printEvenNumber();
            }
        });

        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                mt.printOddNumber();
            }
        });

        // Start both threads
        t1.start();
        t2.start();
    } /*

    int counter=1;

    public static void main(String[] args) {
        OddEvenPrintMain oddEvenPrintMain = new OddEvenPrintMain();
        Runnable runnableEven= ()->{oddEvenPrintMain.printEven();};
        Runnable runnableOdd= ()->{oddEvenPrintMain.printOdd();};

        Thread thread1= new Thread(runnableEven,"Even");
        Thread thread2= new Thread(runnableEven,"Odd");

        thread1.start();
        thread2.start();


    }
    public void printEven(){

        synchronized (this){
            while(counter<10){

                while(counter%2==0){
                    try {
                        wait();
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName()+" "+ counter);

                counter++;
                notify();
            }
        }

    }

    public void printOdd(){
        {
            synchronized (this){
                while(counter<10){

                    while(counter%2==1){
                        try {
                            wait();
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println(Thread.currentThread().getName()+" "+ counter);

                    counter++;
                    notify();
                }
            }

        }
    }*/
}
