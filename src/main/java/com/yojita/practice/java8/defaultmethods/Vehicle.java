package com.yojita.practice.java8.defaultmethods;

public interface Vehicle {
    String getBrandName();

    String speedUp();

    String slowdown();

    default String turnAlarmOn() {
        return "Turning on the alarm";
    }

    default String turnAlarmOff() {
        return "Turning off the alarm";
    }
}
