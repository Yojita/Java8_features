package com.yojita.practice.java8.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateAPI {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // To fetch system date 
        System.out.println(date);

        System.out.println(LocalDate.of(2023, 12, 9));
        System.out.println(LocalDate.parse("2023-12-09"));

        LocalDate tomorrow = LocalDate.now().plusDays(1); // To calculate next day
        System.out.println(tomorrow);

        LocalDate dateOneMonthBack1 = LocalDate.now().minusMonths(1);
        System.out.println(dateOneMonthBack1);
        LocalDate dateOneMonthBack2 = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(dateOneMonthBack2);

        DayOfWeek day = LocalDate.parse("2023-12-09").getDayOfWeek();  // To get day of week
        System.out.println(day);
        int date1 = LocalDate.parse("2023-12-09").getDayOfMonth();  //To get day of the month
        System.out.println(date1);

        boolean isleapYear = LocalDate.now().isLeapYear();
        System.out.println(isleapYear);

        boolean notBefore = LocalDate.parse("2023-11-13").isBefore(LocalDate.parse("2023-11-12"));  // To check the first date is before the second or not
        System.out.println(notBefore);

        boolean isAfter = LocalDate.parse("2023-11-11").isAfter(LocalDate.parse("2023-11-10"));  //To check the the first date is after the second data
        System.out.println(isAfter);

        LocalDate getFirstDayOfTheMonth = LocalDate.parse("2023-12-12").with(TemporalAdjusters.firstDayOfMonth());  //To get first day of the month
        System.out.println(getFirstDayOfTheMonth);

        LocalDateTime beginingOfTheDay = LocalDate.parse("2023-12-11").atStartOfDay();
        System.out.println(beginingOfTheDay);

        LocalDate initiDate = LocalDate.parse("2023-12-20");
        LocalDate finalDate = LocalDate.parse("2023-12-12");

        int inBetweenDays = Period.between(initiDate, finalDate).getDays();
        System.out.println(inBetweenDays);

        long days = ChronoUnit.DAYS.between(initiDate, finalDate);
        System.out.println(days);
    }
}
