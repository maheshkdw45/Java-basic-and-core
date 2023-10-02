package com.mahesh.interviewprogram;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Demo {
    public static void main(String[] args) {

        String str="Test,";
        System.out.println(Arrays.asList(str.split(",")));
        List<Integer> integerList = Arrays.asList(-7, -1, 0, 2, -4, -3, -3, 1, 2);

        Map<Boolean, List<Integer>> listMap = integerList.stream().distinct().collect(Collectors.partitioningBy(number -> number >= 0));

        System.out.println("Before sort: "+listMap);

        List<Integer> sortedList= new ArrayList<>();

        sortedList.addAll( listMap.get(true).stream().sorted(Comparator.comparingInt(Integer::intValue)).collect(Collectors.toList()));
        sortedList.addAll( listMap.get(false).stream().sorted(Comparator.comparingInt(Integer::intValue)).collect(Collectors.toList()));

        System.out.println(sortedList);

        System.out.println(highestNumber(new int[]{3,4,5,11,2,1,9,10}));

        highestNumber1(new int[]{3,4,5,11,2,1,9,10});


    }



    public static int highestNumber(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    public static void highestNumber1(int[] arrays){

        int tmp;
        for(int i=0; i<arrays.length;i++)
        {
            for(int j=i+1;j<arrays.length;j++)
            {
                if(arrays[i]>arrays[j])
                {
                    tmp = arrays[i];
                    arrays[i] = arrays[j];

                    arrays[j]= tmp;
                }
            }

            System.out.println("Largest number in current Array is: " +arrays[0]);
        }
    }


    @Test
    public void test() {
        System.out.println("This is test case testing ");
    }

}

