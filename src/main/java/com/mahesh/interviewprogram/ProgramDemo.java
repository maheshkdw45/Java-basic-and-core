package com.mahesh.interviewprogram;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProgramDemo {
    public static void main(String[] args) {
        String str="Capgemini Engineering";

        Map<Character, Long> collect = str.chars().mapToObj(value -> (char) value).collect(Collectors.groupingBy(character -> character, Collectors.counting()
        ));

        System.out.println("Count using stream "+collect);
        Map<Character,Integer> map = new HashMap<>();
        char[] chArr = str.toLowerCase().toCharArray();
        for (int i=0;i<chArr.length-1;i++){
            if(map.containsKey(chArr[i])){

                map.put(chArr[i],map.get(chArr[i])+1);
            }else{
                map.put(chArr[i],1);
            }

        }
        System.out.println(map);
    }
}
