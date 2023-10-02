package com.mahesh.interviewprogram;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        String str="items 1-2/2";

        String s = StringUtils.substringAfter(str, "/");

        System.out.println(s);
      /*  List<String> stList = new ArrayList<>();
        stList.add("1");
        stList.add("2");
        stList.add("3");
        stList.add("4");

        Optional<String> first = stList.stream().findFirst();
        if (first.isPresent()){
            System.out.println(first.get());
        }*/


    }
}
