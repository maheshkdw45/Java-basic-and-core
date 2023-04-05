package com.mahesh.designpattern.factory;

public class DomisticBill implements Plan{
    @Override
    public double getRate() {
        return 3.5;
    }
}
