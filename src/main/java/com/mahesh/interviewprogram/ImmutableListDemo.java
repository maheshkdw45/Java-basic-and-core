package com.mahesh.interviewprogram;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableListDemo {

    public static void main(String[] args) {

        Person person = new Person();
//         person.getAddress().add("adding new Adress");

//         List<String> immutableList = Collections.list();

//         immutableList.add("Immutable test ");
//        System.out.println("immu ::: "+ immutableList);

        System.out.println(person);
    }

}

class Person{

    private List<String> address;

    public List<String> getAddress() {
        return Collections.emptyList();
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }
}
