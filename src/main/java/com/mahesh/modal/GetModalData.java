package com.mahesh.modal;

import java.util.ArrayList;
import java.util.List;

public class GetModalData {

    public static List<Customer> getCustomerDetails() {

        List<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer("Mahesh Kumar", "883483883", "abc@gmail.com", 25, "Gurgaon");
        Customer customer2 = new Customer("Pankaj Singh", "4547787", "abc@gmail.com", 32, "Gurgaon");
        Customer customer3 = new Customer("Ram Lal", "4343455", "abc@gmail.com", 45, "Noida");
        Customer customer4 = new Customer("Mohan Ram", "56856", "abc@gmail.com", 28, "Delhi");
        Customer customer5 = new Customer("Vaibhav Sharma", "9898976756", "abc@gmail.com", 25, "Delhi");
        Customer customer6 = new Customer("Amit Arora", "45454565767", "abc@gmail.com", 26, "Bangalore");
        Customer customer7 = new Customer("Dhirendra Singh", "3434334565", "abc@gmail.com", 29, "Gurgaon");
        Customer customer8 = new Customer("Ranjit Singh", "5655656", "abc@gmail.com", 22, "Bangalore");
        Customer customer9 = new Customer("Nitin Singh", "454545667", "abc@gmail.com", 35, "Gurgaon");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);
        customers.add(customer7);
        customers.add(customer8);
        customers.add(customer9);


        return customers;
    }
}
