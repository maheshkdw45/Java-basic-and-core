package com.mahesh.interviewprogram;

import java.util.*;
import java.util.stream.Collectors;

public class SortingDemo {
    public static void main(String[] args) {

        List<Student> listOfStudents = getListOfStudents();

        listOfStudents.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("----------------------");
        listOfStudents.stream().sorted((student, t1) -> student.getAge()-t1.getAge()).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("----------------------");
//        When using the custom object to sort and if we are using the inbuilt api to sort like reverseOrder or natural sort then
//        Sorting class should be implement the Comparable interface.
//        Comparable interface is not mandatory to implement, if we will writing the logic inside the sorted method.
//        listOfStudents.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

    }

    public static List<Student> getListOfStudents()
    {

        Student s1=new Student("Peter",21);
        Student s2=new Student("Harshal",18);
        Student s3=new Student("Andy",17);
        Student s4=new Student("Mary",20);
        Student s5=new Student("Peter",19);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);


        return students;
    }
}


class Student{

    String name;
    int age;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}