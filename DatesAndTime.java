/*
 * New classes introduced in Java 8 for managing dates and time in package java.time:
 *		LocalDateTime: immutable objects which contain date and time information
 *		LocalDate: immutable objects which contain date information
 *		LocalTime: immutable objects which contain time information
 *		DateTimeFormatter: formats data and time information to a desires string and parses Strings into a LocalDate and/or Time object
 *		Period: represents a date interval
 *		Duration: represents a time interval
 * New interface in Java 8 in package java.time.temporal
 */
package robertd.core_java.lesson07;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;

public class DatesAndTime {
	
	public void inClassWork() {
		System.out.println(this.getClass() + ".inClassWork():\n");
		System.out.println();
		
		theLocalDateClass();
		theLocalTimeClass();
		theLocalDateTimeClass();
		
		thePeriodClass();
		theDurationClass();
		
		manipulatingDatesAndTimes();

		System.out.println("===================================================================\n\n");
	}
	
	private void theLocalDateClass() {
		System.out.println("1. The LocalDate class: ");
		System.out.println();
		LocalDate date1 = LocalDate.now();
		System.out.println("Using now: " + date1);
		System.out.println();
		LocalDate date2 = LocalDate.of(2010, Month.SEPTEMBER, 25);
		System.out.println("Using of: " + date2);
		System.out.println();		
		LocalDate date3 = LocalDate.from(LocalDateTime.now());
		System.out.println("Using from: " + date3);		
		System.out.println();		
		JapaneseDate date4 = JapaneseDate.from(LocalDate.now());
		System.out.println("JapaneseDate: " + date4);
		System.out.println();
	}
	
	private void theLocalTimeClass() {
		System.out.println("2. The LocalTime class: ");
		System.out.println();
		LocalTime time1 = LocalTime.now();
		System.out.println("Using now: " + time1);
		System.out.println();
		LocalTime time2 = LocalTime.of(15, 38, 24);
		System.out.println("Using of: " + time2);
		System.out.println();		
		LocalTime time3 = LocalTime.from(LocalDateTime.now());
		System.out.println("Using from: " + time3);		
		System.out.println();		
	}
	
	private void theLocalDateTimeClass() {
		System.out.println("3. The LocalDateTime class: ");
		System.out.println();
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println("Using now: " + dt1);
		System.out.println();
		LocalDateTime dt2 = LocalDateTime.of(2010, 9, 25, 15, 38, 24);
		System.out.println("Using of: " + dt2);
		System.out.println();		
		LocalDateTime dt3 = LocalDateTime.from(LocalDateTime.now());
		System.out.println("Using from: " + dt3);		
		System.out.println();
		
		LocalDateTime dt4 = LocalDateTime.parse("1776-07-04T17:30");
		System.out.println("Using parse: " + dt4);
		System.out.println();		
	}
	
	private void thePeriodClass() {
		System.out.println("4. The Period class measures the difference between dates");
		System.out.println();
		LocalDate independance = LocalDate.of(1776, Month.JULY, 4);
		
		Period p1 = Period.between(independance, LocalDate.now());
		System.out.println("Using between: " + p1);
		System.out.println();
		
		System.out.println(p1.getYears() + " years");
		System.out.println();
		System.out.println(p1.toTotalMonths() + " months");
		System.out.println();
		System.out.println(p1.getDays() + " days");
		System.out.println();
		
	}
	
	private void theDurationClass() {
		System.out.println("5. The Duration class measures the difference between times: ");
		System.out.println();
		LocalTime thisMorning = LocalTime.of(8, 23, 42);
		
		Duration d1 = Duration.between(thisMorning, LocalTime.now());
		System.out.println("Using between: " + d1);
		System.out.println();
		
		System.out.println(d1.toHours());
		System.out.println();
		System.out.println(d1.toMinutes());
		System.out.println();
		System.out.println(d1.getSeconds());
		System.out.println();
	}
	
	private void manipulatingDatesAndTimes() {
		System.out.println("6. Manipulating Dates using LocalDate: ");
		System.out.println();
		LocalDate date1 = LocalDate.of(2000, 10, 10);
		Period p1 = Period.ofMonths(200);
		System.out.println(date1);
		System.out.println();
		LocalDate date2 = date1.plus(p1);
		System.out.println(date2);
		System.out.println();
		
		Period p2 = Period.of(0, 6, 30);
		LocalDate date3 = date2.minus(p2);
		System.out.println(date3);
		System.out.println();
		
		System.out.println("5b. Manipulating time using LocalTime:");
		System.out.println();
		LocalTime thisMorning = LocalTime.of(8, 23, 42);
		
		Duration d1 = Duration.of(325, ChronoUnit.MINUTES);
		LocalTime time2 = thisMorning.plus(d1);
		System.out.println(time2);
		System.out.println();

		
	}

}
