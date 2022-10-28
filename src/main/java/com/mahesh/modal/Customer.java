package com.mahesh.modal;

import lombok.Data;

import java.util.List;

@Data
public class Customer {
    private String name;
    private String mobileNumber;
    private String email;
    private Integer age;
    private String address;

    public Customer(String name, String mobileNumber, String email, Integer age, String address) {

        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.age = age;
        this.address = address;
    }

}
