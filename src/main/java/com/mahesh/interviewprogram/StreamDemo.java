package com.mahesh.interviewprogram;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        {
            List<Integer> integerList = Arrays.asList(-7, -1, 0, 2, -4, -3, -3, 1, 2);


            Map<Boolean, List<Integer>> listMap = integerList.stream().distinct().collect(Collectors.partitioningBy(number -> number > 0));

            System.out.println(listMap);


            List<Employee> listEmp = new ArrayList();

            listEmp.add(new Employee(1, "Mahesh", "Gurgaon"));
            listEmp.add(new Employee(1, "Ramesh", "Delhi"));
            listEmp.add(new Employee(1, "Suresh", "Gurgaon"));
            listEmp.add(new Employee(1, "Prince", "Delhi"));

            Map<String, List<Employee>> listEmpMap = listEmp.stream().collect(Collectors.groupingBy(Employee::getAddress));
            System.out.println(listEmpMap);


            listEmp.sort(Comparator.comparing(Employee::getName).thenComparing(Comparator.comparing(Employee::getId)));


        }
    }
}

class Employee {

    private int Id;
    private String name;
    private String address;
    private List<String> test;

    public Employee(int id, String name, String address) {
        Id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getTest() {
        return test;
    }

    public void setTest(List<String> test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}