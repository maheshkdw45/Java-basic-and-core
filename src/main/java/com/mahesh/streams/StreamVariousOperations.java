package com.mahesh.streams;

import com.mahesh.modal.Customer;
import com.mahesh.modal.GetModalData;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamVariousOperations {
    public static void main(String[] args) {

        List<Customer> customerDetails = GetModalData.getCustomerDetails();

//        Filter operations

        List<Customer> filterList = customerDetails.stream().filter(customer -> customer.getAge() > 25).collect(Collectors.toList());
        System.out.println("Filter list based on the Age : " + filterList);

//        Sort based on the name

        List<Customer> sortBasedOntheName = customerDetails.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
        System.out.println("Sorted list based on the Name : " + sortBasedOntheName);

//        Sort list based on the name and age

        List<Customer> sortedBasedOnTheAgeAndName = customerDetails.stream().sorted(Comparator.comparing(Customer::getAge).thenComparing(Customer::getName)).collect(Collectors.toList());
        System.out.println("Sorted based on the age and Name : " + sortedBasedOnTheAgeAndName);

//        Map operation demo, mapping one object to different object
        List<String> mapOperation = customerDetails.stream().map(Customer::getName).collect(Collectors.toList());
        System.out.println("Map operation demo : " + mapOperation);

//        Map  sorting
        List<String> mapOperationSort = customerDetails.stream().map(Customer::getName).sorted().collect(Collectors.toList());
        System.out.println("Map operation sorting based : " + mapOperationSort);

//        Reduce operation
        Optional<Customer> reduce = customerDetails.stream().reduce((customer, customer2) -> customer.getAge() > customer2.getAge() ? customer2 : customer);
        System.out.println(" get highest number based on reduce ::: " + reduce.get());

//        Grouping by operation

        Map<String, List<Customer>> groupingOperation = customerDetails.stream().collect(Collectors.groupingBy(Customer::getAddress));
        System.out.println("Grouping by  operation :: " + groupingOperation);

//        Partition by
        Map<Boolean, List<Customer>> partitionByOperation = customerDetails.stream().sorted(Comparator.comparing(Customer::getName)).collect(Collectors.partitioningBy(customer -> customer.getAge() > 30));
        System.out.println("Partition by operation :: " + partitionByOperation);

        List<Customer> customerDetailsWithMultiplePhone = GetModalData.getCustomerDetailsWithMultiplePhone();
//        Flat map operation, It's combination of a map and a flat operation i.e, it first applies map function and then flattens the result.
        List<String> flatMapOperation = customerDetailsWithMultiplePhone.stream().flatMap(customer -> {

            if (customer.getMobileNumbers() != null) {
                return customer.getMobileNumbers().stream();
            }
            return null;
        }).collect(Collectors.toList());
        System.out.println("Flat map operation ::: " + flatMapOperation);
    }
}
