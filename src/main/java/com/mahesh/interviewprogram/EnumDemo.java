package com.mahesh.interviewprogram;

public class EnumDemo {
    public static void main(String[] args) {

        System.out.println(PaymentContext.POSTPAID.getValue());
        System.out.println(PaymentContext.POSTPAID.name());
    }
}

enum PaymentContext
{
PREPAID("prepaid"),
 POSTPAID("postpaid");

 private String value;

 private PaymentContext(String value)
 {
 this.value = value;
 }

 public String getValue()
 {
 return value;
 }
}


