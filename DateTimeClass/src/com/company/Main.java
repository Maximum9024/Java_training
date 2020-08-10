package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class LocalDateTest {
    public static void main(String[] args) {
        ZonedDateTime date =ZonedDateTime.now();

        System.out.println("today’s Date is : "+ date.minusMinutes(19) );

    }
}

 class LocalDateTest2 {
    public static void main(String[] args) {
        LocalDateTime currentDate =LocalDateTime.now();
        System.out.println("today’s Date is : "+ currentDate.getMonthValue()) ;

    }
}
class LocalTime1 {
    public static void main(String[] args) {
        LocalTime currentTime =LocalTime.now();
        System.out.println("today’s Date is : "+ currentTime.getHour()) ;

    }
}
class LocalDateTest3 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);
        LocalDateTime localDateTime= LocalDateTime.now();
        Period p = Period.between(birthday, currentDate);

        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                " months, and " + p.getDays() + " days old.");
        System.out.println(p.minusYears(5));
    }
}
class DateTimeFormatterTest{
    public static void main(String [] args){
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Before : " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-yy-MM ");

        String formatDateTime = now.format(formatter);

        System.out.println("After : " + formatDateTime);
    }
}



