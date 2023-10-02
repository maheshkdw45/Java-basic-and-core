package com.mahesh.interviewprogram;

import org.apache.commons.lang3.StringUtils;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Customer interaction has been saved with Failed Status, with Id  : a6aa7668-5d72-40d9-a199-fb548519288a, Reason for Failure : Party Updation has Failed";

        String[] subStr = str.split(" : ");
        System.out.println("Sub String " + StringUtils.substringBefore(subStr[1], ","));

        String payload="{\"externalId\":\"70000065101000\",\"partyInteractionId\":\"PIN100000215972\"}";
        System.out.println(payload.contains("partyInteractionId"));

    }
}
