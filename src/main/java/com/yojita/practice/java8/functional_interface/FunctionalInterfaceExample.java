package com.yojita.practice.java8.functional_interface;

public class FunctionalInterfaceExample implements Sayable {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }
}
