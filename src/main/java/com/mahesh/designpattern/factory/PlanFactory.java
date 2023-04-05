package com.mahesh.designpattern.factory;

public class PlanFactory {

    public Plan getPlan(String planType) {

        if (planType == null) {
            return null;
        } else if ("domestic".equalsIgnoreCase(planType)) {
            return new DomisticBill();

        } else if ("inter".equalsIgnoreCase(planType)) {
            return new InternationalBill();
        }
        return null;
    }
}
