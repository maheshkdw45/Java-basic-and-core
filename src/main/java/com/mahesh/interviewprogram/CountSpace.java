package com.mahesh.interviewprogram;

public class CountSpace {
    public static void main(String[] args) {
        String str = "This is program to test the count";

        // Using java-8
        long spaceCount = str.chars().filter(Character::isWhitespace).count();

        System.out.println(" Space count using java-8 : "+ spaceCount);

        //without lambda
        int length = str.replaceAll("[^ ]", "").length();
        System.out.println("Space count length : "+ length);

        // legacy ways
        int spaceCounter=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                spaceCounter++;
            }
        }

        System.out.println("Space count using loop : "+ spaceCounter);

    }
}
