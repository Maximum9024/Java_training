package com.company;

        import java.time.*;
        import java.time.format.DateTimeFormatter;
        import java.time.format.FormatStyle;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Date;
        import java.util.TimeZone;

public class TimePostmortem {
    public static void main(String[] args) {
        LocalDate valdate= LocalDate.of(2018,2,4);
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("DD-MM-uuuu");
        System.out.println(formatter.format(valdate));
    }
}

class Time{
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2018,11,4);
        LocalTime time = LocalTime.of(1,59,59);
        ZonedDateTime dt = ZonedDateTime.of(date,time, ZoneId.of("America/New_York"));
        dt =dt.plusSeconds(100);
        System.out.println(dt.getHour()+" : "+dt.getMinute()+":"+dt.getSecond());
    }
}
class Test1{
    public static void main(String[] args) {
        LocalDate date1= LocalDate.of(2019,2,1);
        Duration d= Duration.ofDays(1);
        System.out.println(date1.plus(d));
    }
}
class Test2{
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2019,1,2);
        date1.minus(Period.ofDays(1));
        LocalDate date2=LocalDate.of(2018,12,31);
        date2.plus(Period.ofDays(1));
        System.out.println(date1.equals(date2)+":"+date1.isEqual(date1));
    }
}
class Test3 {
    public static void main(String[] args) {
        LocalTime t1=LocalTime.now();
        LocalDateTime t2=LocalDateTime.now();

        System.out.println(Duration.between(t2,t1));
    }

        }
        class Test4{
            public static void main(String[] args) {
                LocalDate d1=LocalDate.now();

                System.out.println(Period.ofWeeks(-3));
            }
        }
        class Test5{
    public static void main(String[] args) {
        LocalDate startDate=LocalDate.of(2019,Month.MARCH,1);
        LocalDate endDate=LocalDate.of(2018,Month.MARCH,11);
        System.out.println(Period.between(endDate,startDate));
    }
}
class Test7 {

    public static void main(String[] args) {
     LocalTime time =LocalTime.parse("14:14:59.1111");
     LocalDate date = LocalDate.of(2018,Month.MARCH,40);
     System.out.println(date);
    }
}
class  test6{
    public static void main(String[] args) {
        TimeZone tm1=TimeZone.getTimeZone("Europe/Copenhagen");
        System.out.println(tm1);
    }
}
class test7{
    public static void main(String[] args) {
        ZoneId zid=ZoneId.of("US/Eastern");
        Instant i=Instant.now();
        ZonedDateTime zdt=i.atZone(zid);
        System.out.println(zdt.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
    }

}
class Test8{
    public static void main(String[] args) {
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //   String formattedDateTime= Datetime.now().format(formatter);
        //     System.out.println("Formatted DateTime: "+formattedDateTime);
    }

}
class Test9{
    public static void main(String[] args) {
        ZonedDateTime zd=ZonedDateTime.parse("2020-05-04T08:05:00");
        System.out.println(zd.getMinute()+" "+zd.getDayOfMonth());

    }
}
class Test10{
    public static void main(String[] args) {
        LocalDate babyDOB=LocalDate.of(2015,Month.FEBRUARY,20);
        LocalDate now=LocalDate.of(2016,Month.APRIL,10);
        System.out.println(Period.between(now,babyDOB).getYears());//
    }
}

class Test111{
    public static void main(String[] args) {
       Date date= new Date();
       LocalDate localDate=date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
class Test112{
    public static void main(String[] args) {
        try{

        }finally {

        }
        LocalDateTime date =LocalDateTime.of(2019,1,1,10,10);
        DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        System.out.println(formatter.format(date));
    }
}
class test113{
    static Integer m= new Integer(2);
    public static void main(String[] args) {

        LocalDate date=LocalDate.of(2018,6,1);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("DD'nd day of' uuuu");
        System.out.println(formatter.format(date));
    }
}