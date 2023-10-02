package com.mahesh.interviewprogram;

public class LengthOfStringDemo {
    public static void main(String[] args) {
        String str= "This is hello word program";
            str=str.trim();
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }

    }
}
