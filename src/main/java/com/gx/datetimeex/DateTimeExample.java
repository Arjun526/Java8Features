package com.gx.datetimeex;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTimeExample {

	public static void main(String[] args) throws InterruptedException {

		//Instant Date Time
		Instant start = Instant.now();
		System.out.println(start);
		Thread.sleep(1000);
		Instant end = Instant.now();
		System.out.println("Demonstarting Duration  Class Usage");
		Duration duration = Duration.between(start, end);
		System.out.println(duration.getSeconds());
		
		//Local Date
		LocalDate date =LocalDate.of(2017,Month.MAY,31); //LocalDate.now();
		
		LocalDate satvikBD = LocalDate.of(2014,Month.MARCH,12);
		System.out.println(date);
		System.out.println("Demonstarting  Period Class Usage");
		Period period = Period.between(satvikBD, date);
		
		System.out.println("Satvik is " + period.getYears() + " years, " + period.getMonths() + "months, " + period.getDays() + " days old");
		System.out.println("Satvik is " + satvikBD.until(date,ChronoUnit.MONTHS) + " months old");
		
		//Date Adjuster
		System.out.println("Demonstarting  LocalDate Class Usage");
		LocalDate today = LocalDate.now();
		LocalDate nextSunday = today.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println("Next Sunday is " + nextSunday);
		System.out.println(today.withMonth(Month.APRIL.getValue()));
		System.out.println(today.getChronology().getId());
	}

}
