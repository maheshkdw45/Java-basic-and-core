package com.mahesh.interviewprogram;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("changeSimNumber");
        stringList.add("unbar");
        stringList.add("changePlan");

        List<String> compareList = new ArrayList<>();
        compareList.add("changeSimNumber");
        compareList.add("changePlan");
        compareList.add("unbar");
        compareList.add("demo");
        System.out.println(compareList.containsAll(stringList));


    }
}
