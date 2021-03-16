package com.mahesh.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {
    public static void main(String[] args) {
        System.out.println("This is lambda Demo ");

        List<String> list= Arrays.asList("a","b","c","d","e","f","g");

        list.stream().filter(item -> "a".equals(item)).collect(Collectors.toList()).get(0);
//        list.forEach(System.out::println);

        list.stream().filter(item -> "a".equals(item)).map(String::toUpperCase).forEach(System.out::println);
    }
}
