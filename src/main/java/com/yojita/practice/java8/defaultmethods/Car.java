package com.yojita.practice.java8.defaultmethods;

public class Car implements Vehicle {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrandName() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "Increasing the speed";
    }

    @Override
    public String slowdown() {
        return "Decreasing the speed";
    }
}
