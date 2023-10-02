package com.mahesh.interviewprogram;

public class InterviewQuestions3 {
    public static void main(String[] args) {

    }
}
/*
* There are two threads T1 and T2. T1 is accessing m1 method.
* Will T2 be able to access m2 method on the same instance at the same time?`
* */
class AThread
{
    synchronized void m1()
    {
        System.out.println("In m1 A");
    }
    void m2()
    {
        System.out.println("In m2 A");
    }
}

