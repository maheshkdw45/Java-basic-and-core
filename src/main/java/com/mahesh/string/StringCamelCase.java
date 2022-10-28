package com.mahesh.string;

public class StringCamelCase {
    public static void main(String[] args) {
        String str ="this is testing  of camel case string";

        StringBuilder stringBuilder = new StringBuilder();
        String[] split = str.split(" ");

        for (String s:split){
            if(s.length()>0){
                stringBuilder.append(s.substring(0,1).toUpperCase()).append(s.substring(1).toLowerCase()).append(" ");
            }
        }

        System.out.println("Camel case String :: " + stringBuilder);
    }
}
