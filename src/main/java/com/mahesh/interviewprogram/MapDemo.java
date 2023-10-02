package com.mahesh.interviewprogram;

import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("test1","test1");
        map.put("test2","test2");
        map.put("test3","test3");

        Set<String> strings =  map.keySet();
        List<String> list1 = new ArrayList<>(strings);
        String lastValue = list1.get(list1.size()-1);
        System.out.println("Last value : "+lastValue);
       /* System.out.println("Last value : "+lastValue);
        List<String> list = new ArrayList<>();
    list.add("");
        System.out.println("List : "+list.size());
        System.out.println(CollectionUtils.isNotEmpty(list));*/
                
    }
}
