package com.mahesh.designpattern.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getSingletonInstance();
        Singleton singletonInstance1 = Singleton.getSingletonInstance();
        System.out.println(singletonInstance == singletonInstance1);
//        Singleton singleton = new Singleton();


    }

}

class Singleton {
    //Lazy initilization
    public static Singleton singletonInstance = null;

    public static Singleton getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    private Singleton() {

    }
}
