package com.yojita.java.java8_practice.staticmethods;

public interface Vehicle {
    static int getHoursePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}
