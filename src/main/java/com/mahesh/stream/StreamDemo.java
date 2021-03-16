package com.mahesh.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4);
        List<Integer> list1= Arrays.asList(5,6,7,8);
        List<Integer> list2= Arrays.asList(122,21,30,34);
        List<List<Integer>> list3=Arrays.asList(list,list1,list2);
        List<String> list4= Arrays.asList("Ramesh","Suresh","Mahesh");


        List<String> list5 = Arrays.asList("Ramesh", "Suresh", "Mahesh");
        list4.stream().map(String::toUpperCase).sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
//        System.out.println(l);
        List<Integer> integerList= list3.stream().flatMap(integers -> integers.stream()).collect(Collectors.toList());
        System.out.println(integerList);

    }

    private  String Test(){
        return  "";
    }
}
