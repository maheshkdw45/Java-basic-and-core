package com.mahesh.interviewprogram;

public class StringObject {
    public static void main(String[] args) {

        StringObject stringObject = new StringObject();
        stringObject.demo(null);
    }

    public void demo(String object) {
        System.out.println("String objects");
    }

    public void demo(Object object) {
        System.out.println("Object method invoke");
    }

    /*Ambiguous method call.*/
   /* public void demo(Integer object) {
        System.out.println("Integer method invoke");
    }*/
}
