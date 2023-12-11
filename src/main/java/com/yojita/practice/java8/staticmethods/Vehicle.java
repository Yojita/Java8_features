package com.yojita.practice.java8.staticmethods;

public interface Vehicle {
    static int getHoursePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}
