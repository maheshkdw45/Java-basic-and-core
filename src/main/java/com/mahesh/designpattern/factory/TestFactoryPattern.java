package com.mahesh.designpattern.factory;

public class TestFactoryPattern {
    public static void main(String[] args) {

        PlanFactory planFactory = new PlanFactory();
        Plan plan = planFactory.getPlan("inter");
        System.out.println("Internation rate :"+plan.getRate());

         plan = planFactory.getPlan("domestic");
        System.out.println("domestic rate :"+plan.getRate());
    }
}
