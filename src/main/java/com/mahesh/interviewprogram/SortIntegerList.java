package com.mahesh.interviewprogram;

import java.util.*;
import java.util.stream.Collectors;

public class SortIntegerList {
    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(-3,-9,-7,-3,-1,6,0,10,2,1,9,11);
        Map<Boolean, List<Integer>> collect = integerList.stream().collect(Collectors.partitioningBy(number -> number >= 0));
        List<Integer> finalListInt= new ArrayList<>();
        System.out.println("Map details :"+collect);
        finalListInt.addAll(collect.get(true).stream().sorted().collect(Collectors.toList()));
        finalListInt.addAll(collect.get(false).stream().sorted().collect(Collectors.toList()));

        System.out.println("Final list after sort: "+finalListInt);
    }
}
