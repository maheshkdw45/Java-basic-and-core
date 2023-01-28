package com.mahesh.functionalinterface;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface =() -> System.out.println("This is dummy override!!!");
        functionalInterface.dummy();
        functionalInterface.dummyDefault();
    }
}

interface FunctionalInterface{

    public  void dummy();
//    public  void dummy1();

    default  public void dummyDefault(){
        System.out.println("This default dummy testing ");
    }

    default  public void dummyDefault1(){
        System.out.println("This default dummy testing-1 ");
    }
}
