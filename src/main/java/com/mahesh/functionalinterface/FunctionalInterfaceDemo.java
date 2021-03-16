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

    default  public void dummyDefault(){
        System.out.println("This default dummy testing ");
    }
}
