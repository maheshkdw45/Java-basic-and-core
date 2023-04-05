package com.mahesh.designpattern.factory;

public class InternationalBill implements Plan{
    @Override
    public double getRate() {
        return 4.5;
    }
}
