package com.mahesh.interviewprogram;

public class HighestNumber {


    public static void main(String[] args) {

        int[] arrA = { 4,4,4,3,3,6,6,1,11,43 };
        int element=0;
        for (int i = 0; i <arrA.length-1 ; i++) {
            int counter =1;
            for (int j = i+1; j <arrA.length ; j++) {
//                For min number
                if(arrA[i]>arrA[j]){
                    element = arrA[j];
                }

//                For max number
                /*if(arrA[i]<arrA[j]){
                    element = arrA[j];
                }*/
            }

        }
        System.out.println(element);
    }
}
