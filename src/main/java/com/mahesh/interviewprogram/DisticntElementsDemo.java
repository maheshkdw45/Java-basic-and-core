package com.mahesh.interviewprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class DisticntElementsDemo {
    public static void main(String[] args) {
        int[] nums = {5,2,7,2,4,7,8,2,3};
        List<String> numsArr = Arrays.asList("5","2","7","2","4","7","8","2","3");

        List<String> stringList = numsArr.stream().distinct().collect(Collectors.toList());
        System.out.println("String Distinct list :"+stringList);

        List<Integer> integerList = Arrays.stream(nums).distinct().boxed().collect(Collectors.toList());
        System.out.println(integerList);

//        List<Integer> integerList1 = Arrays.stream(nums).distinct().map(i -> i).collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        List<Integer> integerList1 = Arrays.stream(nums).distinct().collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        System.out.println(integerList1);

        List<Integer> integerList2 = Arrays.stream(nums).distinct().mapToObj(i -> i).collect(Collectors.toList());
        System.out.println(integerList2);


    }
}
