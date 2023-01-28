package com.mahesh.interviewprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestStringDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "pie", "pineapple", "apricots");

        System.out.println("Using min "+fruits.stream().min(Comparator.comparingInt(String::length)).get());
        System.out.println("Using max "+fruits.stream().max(Comparator.comparingInt(String::length)).get());


        List<String>  fruitsList =fruits.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(fruitsList.get(0));
        System.out.println(fruitsList.get(fruitsList.size()-1));

        System.out.println(fruits.stream().max(Comparator.comparingInt(String::length)).get());
    }
}
