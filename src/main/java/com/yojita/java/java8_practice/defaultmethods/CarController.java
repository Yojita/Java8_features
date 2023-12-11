package com.yojita.java.java8_practice.defaultmethods;

public class CarController {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        System.out.println(car.getBrandName());
        System.out.println(car.speedUp());
        System.out.println(car.slowdown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());

    }
}
