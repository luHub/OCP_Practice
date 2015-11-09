package datesCalendar;

import java.sql.Date;

public class TestDates {
	
	public TestDates(){
		Date date =  new Date(1_000_000_000_000L);
		System.out.println("Date: "+date.toString());
		date.setTime(date.getTime()+ 3_600_000);
		System.out.println("Date Updated: "+date.toString());
	}
}
