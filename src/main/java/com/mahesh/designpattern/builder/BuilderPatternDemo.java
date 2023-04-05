package com.mahesh.designpattern.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {

//        This pattern also provide the immutable object because we don't have any setter for only will be getter
        Student student = new Student.Builder().name("mahesh").age(26).id("testRoll").build();
        System.out.println("Student details : " + student);
    }
}


class Student {

    private String name;
    private int age;
    private String id;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.id = builder.id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public static class Builder {

        private String name;
        private int age;
        private String id;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}