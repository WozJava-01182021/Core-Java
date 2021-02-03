/*
 * 
 * Dates overview
 * Date class holds the value of the date in milliseconds from the start of the epoch
 * 		Most of this class's methods have been deprecated, but you can use
 * 		this class to bridge between the Calendar and DateFormat classes.
 * Calendar class allows you to manipulate dates and times
 * DateFormat class lets you to display the value in a human understandable format
 *
 * epoch - starts January 1, 1970 at midnight
 */
package robertd.core_java.lesson07;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatesAndTimeBeforeJava8 {

public void inClassWork() {
	System.out.println(this.getClass() + ".inClassWork():\n");
	System.out.println();
	
	theDateClass();
	theCalendarClass();
	usingDateFormatClass();

	System.out.println("===================================================================\n\n");
}

	private void theDateClass() {
		Date now = new Date();
		System.out.println("The current date is " + now);
		System.out.println();
		System.out.println(now.getTime());
		Date then = new Date(1_000_000_000_000L);
		System.out.println("The current date is " + then);
		System.out.println();
		System.out.println(then.getTime());
		System.out.println();
		
		System.out.println(then.getMonth());
		System.out.println();
	}
	
	private void theCalendarClass() {
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println();
		System.out.println(now.getTime());
		System.out.println();
		
		Calendar future = Calendar.getInstance();
		
		future.add(Calendar.MONTH, 1);
		System.out.println(future.getTime());
		System.out.println();
		
		future.setTime(now.getTime());
		System.out.println(future.getTime());
		System.out.println();
		future.add(Calendar.DAY_OF_MONTH, 31);
		System.out.println(future.getTime());
		System.out.println();

	}
	
	private void usingDateFormatClass() {
		Calendar c1 = Calendar.getInstance();
		c1.set(2015, 6, 4);
		
		DateFormat df1 = DateFormat.getDateInstance();
		System.out.println(df1.format(c1.getTime()));
		System.out.println();
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df2.format(c1.getTime()));
		System.out.println();
		
		DateFormat df3 = DateFormat.getDateTimeInstance();
		System.out.println(df3.format(c1.getTime()));
		System.out.println();
		}
}