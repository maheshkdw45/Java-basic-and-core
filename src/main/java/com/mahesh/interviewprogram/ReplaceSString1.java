package com.mahesh.interviewprogram;

import org.apache.commons.lang3.StringUtils;

public class ReplaceSString1 {
    public static void main(String[] args) {
        String str ="devint.hall025.rnd.ericsson.com/partyMangment/v4/partyINteractions/";

        System.out.println("Before replacement :"+str);
//        str= StringUtils.removeEnd(str,"/");
        System.out.println("After remove : "+StringUtils.removeEnd(str,"/"));
    }
}
