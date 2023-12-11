package com.yojita.java.java8_practice.datetimeapi;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeAPI {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println(sixThirty);

        LocalTime sixTwenty = LocalTime.parse("06:20");
        System.out.println(sixTwenty);

        LocalTime sevenFourty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        System.out.println(sevenFourty);

        int six = LocalTime.parse("06:20").getHour();
        System.out.println(six);

        boolean isBefore = LocalTime.parse("06:20").isBefore(sevenFourty);
        System.out.println(isBefore);

        boolean isAfter = LocalTime.parse("06:20").isAfter(sevenFourty);
        System.out.println(isAfter);

        LocalTime maxTime = LocalTime.MAX;
        System.out.println(maxTime);

    }
}
