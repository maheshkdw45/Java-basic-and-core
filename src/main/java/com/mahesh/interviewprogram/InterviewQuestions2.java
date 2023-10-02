package com.mahesh.interviewprogram;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InterviewQuestions2 {
    public static void main(String[] args) {
        A1 a = new B1();
        try {
            a.m1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class A1 {
    void m1() throws IOException {
        System.out.println(" m1 A");
    }
}

class B1 extends A1 {
    void m1() throws FileNotFoundException {
        System.out.println(" m1 B");
    }
}
