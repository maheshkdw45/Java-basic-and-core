package com.mahesh.defaultmethod;

/**
 * Created by z001qgd on 8/2/18.
 */
public interface Interface4 {

    default void methodA(){
        System.out.println("Inside method A"+Interface4.class);
    }
}
