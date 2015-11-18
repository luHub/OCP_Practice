package chapter8.datesCalendar;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Locale;

public class TestDates {
	
	public TestDates(){
		
		Locale loc = new Locale.Builder().setLanguage("us").setRegion("US").build();
		Locale.setDefault(loc);
		
		Date date =  new Date(1_000_000_000_000L);
		System.out.println("Date: "+date.toString());
		date.setTime(date.getTime()+ 3_600_000);
		System.out.println("Date Updated: "+date.toString());
		
		
		//U.S output with all:
		System.out.println("Default Locale: "+Locale.getDefault());
		DateFormat formatter = DateFormat.getDateTimeInstance(
                DateFormat.FULL, 
                DateFormat.FULL, 
                Locale.getDefault());
		
		System.out.println(formatter.format(date));
	}
}
