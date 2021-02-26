package com.mahesh.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        System.out.println("This is lambda Demo ");

        List<String> list= Arrays.asList("a","b","c","d","e","f","g");

        list.forEach(s -> System.out.println(s));
    }
}
