package com.mahesh.interviewprogram;

public class Interquestions1 {
    public static void main(String[] args) {
        A a=new B();
//        a.m2();

    }
}
class A
{
    void m1()
    {
        System.out.println(" m1 A");
    }
}
class B extends A
{
    void m1()
    {
        System.out.println(" m1 B");
    }
    void m2()
    {
        System.out.println("m2 B");
    }
}
