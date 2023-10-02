package com.mahesh.interviewprogram;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class ListCheckDemo {
    public static void main(String[] args) {


        List<String > stringList = new ArrayList<>();
        stringList.add("test");
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("test");

        stringList.retainAll(stringList1);
        System.out.println(stringList);
        System.out.println(stringList.retainAll(stringList1));



        /*Employee1 employee = new Employee1();

        List<String> stringList = null;
       employee.setTest(stringList);
        List<Employee1> list = new ArrayList<>();

        list.add(employee);

        for (Employee1 employee1 : list) {
            boolean isItemavailable = null != list && CollectionUtils.isNotEmpty(employee1.getTest()) && employee1.getTest().contains("demo");
            System.out.println(isItemavailable);
        }
*/

    }
}

class Employee1 {

    private List<String> test;

    public List<String> getTest() {
        return test;
    }

    public void setTest(List<String> test) {
        this.test = test;
    }
}

