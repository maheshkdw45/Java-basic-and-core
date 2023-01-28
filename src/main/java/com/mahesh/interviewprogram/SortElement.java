package com.mahesh.interviewprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortElement {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6);

        System.out.println("removing duplicate value : " + list.stream().distinct().collect(Collectors.toList()));

        List<Integer> largestInt=Arrays.asList(3, 4, 5, 10, 2, 1, 9, 11);

        System.out.println("Largest number : "+ largestInt.stream().sorted(Comparator.comparingInt(value -> value)).reduce(0,(integer, integer2) -> integer2));

        List sortedElement =Arrays.asList(3, 4, 5, 10, 2, 1, 9, 11).stream().sorted().collect(Collectors.toList());

        System.out.println("Using min :"+Arrays.asList(3, 4, 5, 10, 2, 1, 9, 11).stream().min(Comparator.comparingInt(value ->value)).get());
        System.out.println("With sorted list : "+sortedElement.get(sortedElement.size()-1));

//        {5,-4,-1,8,3,-6,7,-9,1,-2};

    }
}
