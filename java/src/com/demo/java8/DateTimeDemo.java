package com.demo.java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.concurrent.SynchronousQueue;

public class DateTimeDemo {

	public static void main(String[] args) {
		
		//current date & time 
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println(timePoint);
		// formatting
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedTime = timePoint.format(format);
		System.out.println(formattedTime);
//		timePoint.
		// date from values
		LocalDate localDate = LocalDate.of(2012, Month.APRIL, 6);
		System.out.println(localDate);
		
		// time from value
		LocalTime localTime = LocalTime.of(17, 18);
		System.out.println(localTime);
		
//		LocalDateTime.of(localDate, localTime);
		
		localTime = LocalTime.parse("10:15:40");
		System.out.println(localTime.getHour());
		
		LocalDateTime thePast = timePoint.withYear(2010);
		System.out.println(thePast);
		LocalDateTime firstDayOfMonth = timePoint.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("***" + firstDayOfMonth);
		LocalDateTime yetAnother = thePast.plusWeeks(3).minus(1, ChronoUnit.DAYS);
		System.out.println(yetAnother);
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
//		timePoint = LocalDateTime.now();
//		ZonedDateTime tokyoZone= ZonedDateTime.of(timePoint,tokyo );
		ZonedDateTime tokyoZone = ZonedDateTime.now(tokyo);
		System.out.println(tokyoZone);
		
//		;
		Period gap = Period.between(LocalDate.of(1982, Month.APRIL, 6), LocalDate.now());
		System.out.println(gap);
		
		
		Duration gapInTime = Duration.between(LocalTime.now(), LocalTime.MIDNIGHT);
		System.out.println(gapInTime);
		
		Instant instant = Instant.now();
		System.out.println(instant);
	}

}
