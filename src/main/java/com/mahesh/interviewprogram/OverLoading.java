package com.mahesh.interviewprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OverLoading {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(-7, -3, -1, 6, 0, 10, 2, 1, 9, 11);
        Map<Boolean, List<Integer>> collect = integerList.stream().sorted().collect(Collectors.partitioningBy(number -> number >= 0));
        System.out.println(collect);

        List<Integer> integerList1 = new ArrayList<>();
        integerList1.addAll(collect.get(true).stream().sorted().collect(Collectors.toList()));
        integerList1.addAll(collect.get(false).stream().sorted().collect(Collectors.toList()));
        System.out.println(integerList1);
    }

}
class  OverLoadingTest{

    private void m1(int a, int b){
        
    }

    private float m1(int a, float b){
        return 0.0F;
    }

}
