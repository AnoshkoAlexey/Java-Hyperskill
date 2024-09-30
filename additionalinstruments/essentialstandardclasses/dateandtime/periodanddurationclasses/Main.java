package additionalinstruments.essentialstandardclasses.dateandtime.periodanddurationclasses;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Period period = Period.of(1995, 5, 23);
        System.out.println(period);
        LocalDate startDate = LocalDate.of(1995, 5, 23);
        LocalDate endDate = LocalDate.of(1995, 8, 25);
        Period period1 = Period.between(startDate, endDate);
        System.out.println(period1);

        // 23 days
        System.out.println(Period.parse("P23D")); // P23D

        // 5 months 23 days
        System.out.println(Period.parse("P5M23D")); // P5M23D

        // -1995 years 5 months 23 days
        System.out.println(Period.parse("P-1995Y5M23D")); // P-1995Y5M23D

        // -23 days
        System.out.println(Period.parse("P-23D")); // P-23D
        
        // -5 months -23 days
        System.out.println(Period.parse("P-5M-23D")); // P-5M-23D
        
        // -1995 years -5 months -23 days
        System.out.println(Period.parse("P-1995Y-5M-23D"));

        // -1995 years - 5 months -2 days
        System.out.println(Period.parse("P-1995Y-5M-2D"));

        Period period2 = Period.of(1995, 5, 23);
        System.out.println(period2.getYears()); // 1995
        System.out.println(period2.getMonths()); // 5
        System.out.println(period2.getDays()); // 23

        Period period3 = Period.of(1995, 5, 23);
        System.out.println(period3.get(ChronoUnit.YEARS)); // 1995
        System.out.println(period3.get(ChronoUnit.MONTHS)); // 5
        System.out.println(period3.get(ChronoUnit.DAYS)); // 23

        Period period4 = Period.of(1, 1, 1);
        System.out.println(period4.addTo(LocalDate.of(1995, 5, 23))); // 1996-06-24
        System.out.println(period4.subtractFrom(LocalDate.of(1995, 5, 23))); // 1994-04-22
        System.out.println(period4); // P1Y1M1D

        Period period5 = Period.of(1, 1, 1);
        System.out.println(period5.plus(Period.of(1995, 5, 23))); // P1996Y6M24D
        System.out.println(period5.minus(Period.of(1995, 5, 23))); // P-1994Y-4M-22D
        System.out.println(period5); // P1Y1M1D

        Duration durationOf = Duration.of(3, ChronoUnit.DAYS);
        Duration durationOf1 = Duration.of(3l, ChronoUnit.MINUTES);
        Duration durationOf2 = Duration.of(3, ChronoUnit.NANOS);

        System.out.println(durationOf); // PT172H
        System.out.println(durationOf1); // PT3M
        System.out.println(durationOf2); // PT0.0000000035

        LocalTime startTime = LocalTime.of(11, 45, 30);
        LocalTime  endTime = LocalTime.of(12, 50, 30);

        System.out.println(Duration.between(startTime, endTime)); // PT1H15M

        Duration duration1 = Duration.parse("PT1H20M");
        Duration duration2 = Duration.parse("PT30M");

        System.out.println(duration1); // PT1H20M
        System.out.println(duration2); // PT30M
        
        System.out.println(Duration.of(1, ChronoUnit.DAYS).getSeconds()); // 86400
        System.out.println(Duration.of(1, ChronoUnit.HOURS).getSeconds()); // 3600
        System.out.println(Duration.of(90, ChronoUnit.MINUTES).getSeconds()); // 5400
        System.out.println(Duration.of(90, ChronoUnit.SECONDS).getSeconds()); // 90
        System.out.println(Duration.of(90,ChronoUnit.SECONDS).getNano()); // 0
        System.out.println(Duration.of(90, ChronoUnit.NANOS).getNano()); // 90

        Duration duration3 = Duration.ofSeconds(3675, 75);
        System.out.println(duration3); // PT1H1M15.000000075S
        System.out.println(duration3.getSeconds()); // 3675
        System.out.println(duration3.getNano()); // 75

        Duration duration4 = Duration.of(10, ChronoUnit.MINUTES);
        System.out.println(duration4.get(ChronoUnit.SECONDS)); // 600

        Duration duration5 = Duration.of(90, ChronoUnit.MINUTES);
        System.out.println(duration5.addTo(LocalTime.of(19, 5, 23))); // 20:35:23
        System.out.println(duration5.subtractFrom(LocalTime.of(19, 5, 23))); //17:35:23
        System.out.println(duration5); // PT1H30M

        Duration duration6 = Duration.of(90, ChronoUnit.MINUTES);
        System.out.println(duration6.plus(Duration.of(10, ChronoUnit.MINUTES))); // PT1H40M
        System.out.println(duration6.minus(Duration.of(10, ChronoUnit.MINUTES))); // PT1H20M
        System.out.println(duration6); // PT1H30M

        // Examples from exercises
        Duration duration7 = Duration.of(75, ChronoUnit.MINUTES);
        System.out.println(duration7.addTo(LocalTime.of(20, 2, 22)));

        // Answer: 21:17:22

        Period period6 = Period.of(1, 1, 1);
        System.out.println(period6.addTo(LocalDate.of(2000, 2, 22)));
    }
}
