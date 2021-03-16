package com.mahesh.defaultmethod;

public class DefaultDemo implements DefaultInterface{
    @Override
    public void Test1() {
        System.out.println("Testing!!!!!!");
    }

    public static void main(String[] args) {
        DefaultInterface defaultInterface = new DefaultDemo();
        defaultInterface.Test();
        defaultInterface.Test1();
    }
}

interface  DefaultInterface{
    public  void Test1();
    default  public  void  Test(){
        System.out.println("This is Default testing");
    }
}

