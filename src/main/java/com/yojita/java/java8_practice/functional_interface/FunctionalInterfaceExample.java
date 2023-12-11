package com.yojita.java.java8_practice.functional_interface;

public class FunctionalInterfaceExample implements Sayable {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }
}
