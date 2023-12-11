package com.yojita.practice.java8.datetimeapi;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class LocalDateTimeAPI {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime dateAndTime = LocalDateTime.of(2023, Month.DECEMBER, 12, 20, 10, 05);
        System.out.println(dateAndTime);

        LocalDateTime dateAndTime2 = LocalDateTime.parse("2015-02-01T06:30:20");
        System.out.println(dateAndTime2);

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);

        Set<String> allZoneId = ZoneId.getAvailableZoneIds();
        System.out.println(allZoneId);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateAndTime2, zoneId);
        System.out.println(zonedDateTime);

    }
}
