package com.mahesh.interviewprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SecondLargest {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(new String[]{"test2", "test23", "test4433", "test"});

        List<String> list1= new ArrayList<String>(new TreeSet(list));

        System.out.println(list1.get(list1.size()-2));


        List<Integer> listInteger=Arrays.asList(1,2,3,4,5,6,15);

        List<Integer> filterList=listInteger.stream().filter(number -> number%3==0 && number%5==0).collect(Collectors.toList());

        System.out.println(filterList);




    }
}
