# Date/Time API

Java 8 intoduced new API's for Date and Time to overcome shortcomings of older java.util.Date and java.util.Calender

## Issues with existing Date/Time API's :

1. Thread safety : The Date and calender classes are not thread safe
   Ex : If you create two objects of date class and try to modify both of them it used to modify the actual date object.

On the contrary new Date and Api's are immutable and thread safe.
Ex : LocalDate date = LocalDate.now();
//to fetch date of one month earlier
LocalDate backDate = date.minusMonths(1);
System.out.println(backDate);

2. API design and ease of understanding :

Earlier that was poorely design with inadequate methods to perform day to day operations.
Now there are wide veriety of utility methods that support the most common operations.

3. ZonedDate and Time :

Earlier this handling was not available developers had to write logic for that.
Now new API's handling of time zone can be done with LocalDate and ZonedDate/Time API's.

## LocalTime:

LocalTime represents time without date 
