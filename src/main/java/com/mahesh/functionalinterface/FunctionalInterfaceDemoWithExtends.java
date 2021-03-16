package com.mahesh.functionalinterface;

public class FunctionalInterfaceDemoWithExtends {
    public static void main(String[] args) {

    }
}


@java.lang.FunctionalInterface
interface  Something{

//    void saySomething(String msge);

    void say(String msge);
}

@java.lang.FunctionalInterface
interface  SaySomething extends  Something{
    /**
     *
     * Multiple non-overriding abstract methods found in interface com.mahesh.functionalinterface.SaySomething
     * If extends the other interface and that interface contain the other method then compile time error will generate
     *
     * If extending the other interface and declaring the
     * interface as functional Interface then extended interface should contain the same method as child have.
     */

    void say(String msge);

}