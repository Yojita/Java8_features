package com.yojita.java.java8_practice.defaultmethods.multipleinheritance;

public interface Alarm {
    default String turnAlarmOn() {
        return "Turning on the alarm";
    }

    default String turnAlarmOff() {
        return "Turning off the alarm";
    }
}
