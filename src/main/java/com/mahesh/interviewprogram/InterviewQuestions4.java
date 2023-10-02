package com.mahesh.interviewprogram;

public class InterviewQuestions4 {
    public static void main(String[] args) {
        String str = "Test";
        String str1 = new String("Test");
        String str3 = "Test";
        System.out.println(str.equals(str1));
        System.out.println(str == str1);
        System.out.println(str == str3);

//        AA aa = new AA();

    }
}

class AA {

    private AA() {
        System.out.println("Private Constractor");
    }
}