package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Time2Postmortem {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime dateTime =LocalDateTime.now();
        ZoneId zoneId= ZoneId.systemDefault();
        ZonedDateTime zonedDateTime=ZonedDateTime.of(dateTime,zoneId);
        long epochSeconds=0;
        Instant instant=zonedDateTime.toInstant();

    }
}

class Test11{
    public static void main(String[] args) {
        String m1 =Duration.of(1, ChronoUnit.MINUTES).toString();
        String m2= Duration.ofMinutes(1).toString();
        String s= Duration.of(60,ChronoUnit.SECONDS).toString();
        String d=Duration.ofDays(1).toString();
        String p= Period.ofDays(1).toString();

        System.out.println(m1.equals(s));
    }
}
class Test12{
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2016,Month.MARCH,13);
        LocalTime time = LocalTime.of(1,30);
        ZoneId zone= ZoneId.of("US/Eastern");
        ZonedDateTime dateTime1=ZonedDateTime.of(date,time,zone);
        ZonedDateTime dateTime2=dateTime1.plus(1,ChronoUnit.HOURS);

            long hours =ChronoUnit.HOURS.between(dateTime1,dateTime2);
            int clock1=dateTime1.getHour();
            int clock2=dateTime2.getHour();
            System.out.println(hours+", "+clock1+" ,"+ clock2);
    }
}
class Test13{
    public static void main(String[] args) {
        LocalDateTime d=LocalDateTime.of(2015,5,10,11,22,33);
        Period p=Period.ofDays(1).ofYears(2);
        d=d.minus(p);
        DateTimeFormatter f=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(d));
    }
}
class Test14{
    public static void main(String[] args) {
        LocalDateTime d=LocalDateTime.of(2015,5,11,22,33);
        Period p=Period.of(1,2,3);
        d=d.minus(p);
        DateTimeFormatter f=DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));
    }
}
class Test15{
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2018,Month.APRIL,30);
        date.plusDays(2);
        date.plusYears(3);
        System.out.println(date.getYear()+" "+date.getMonth()+" "+date.getDayOfMonth());
    }
}
class  test16{
    public static void main(String[] args) {
        LocalDate date=LocalDate.parse("2018-04-30",DateTimeFormatter.ISO_DATE);
        date.plusDays(2);
        System.out.println(date.getYear()+" "+date.getMonth()+" "+date.getMonth());
    }
}