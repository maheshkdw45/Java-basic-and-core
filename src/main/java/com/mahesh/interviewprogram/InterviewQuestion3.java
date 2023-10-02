package com.mahesh.interviewprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewQuestion3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 2, 1, 9, 11);

        System.out.println(list.stream().sorted().reduce((integer, integer2) -> integer).orElse(0));


        System.out.println(list.stream().min(Comparator.comparingInt(Integer::intValue)).get());
    }
}
