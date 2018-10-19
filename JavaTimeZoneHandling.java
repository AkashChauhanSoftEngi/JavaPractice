package com.project.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/*
 * With Calendar you can set time zone as well 
 * Daylight saving time: adjust the clock where day light time is considered
 * GMT does not affect by Day light time
 * JODA time API, easy to play with time, date and time zone{TimeZone specific calculations}
 * Do not compare client date time with server date time
 * epoch time (Since January 1, 1970 00:00:00.000 GMT).
 * 
 * java.util.Date class is not TimeZone aware
 * If you are using JDK >= 8, use the new java.time.* framework. {ZoneId, ZonedDateTime, LocalDateTime}
 * If you are using JDK < 8, use Joda Time. (The new Java 8 java.time.* framework is inspired by this library)
 * Reference: https://www.mkyong.com/java/java-convert-date-and-time-between-timezone/
 * */
public class JavaTimeZoneHandling {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date sample = new Date();
		System.out.println(sample.getDay());
		System.out.println(sample.getTime());
		System.out.println(sample.getDate());
		
		/*Set time zone of your JVM machine*/
		TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
		System.out.println(TimeZone.getDefault());
		Calendar instance = Calendar.getInstance();
		
		instance.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
		Date date = instance.getTime();
		System.out.println("date1 = " + date);
		
		instance.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date date2 = instance.getTime();
		System.out.println("date2 = " + date2);
		
		if(date.equals(date2)){
			System.out.println("Date class object is always printed in local TimeZone");
		}
		
		/*Format the date*/
		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss Z");
		System.out.println(formatter.format(date));
		
		System.out.println(addBusinessDays(date, 24));
		
		
	}

	public static Date addBusinessDays(Date date, int numberOfDays) {
		int count = 0;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		while (count < numberOfDays) {
			calendar.add(Calendar.DAY_OF_YEAR, 1);
			if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY
					|| calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY)
				count++;
		}
		return calendar.getTime();
	}
}
