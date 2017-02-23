package com.thara.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HibernateCommon {
	
	public static Date getEmployeeJoinDate(String joinDate){
		/** Pattern to use for String representation of Dates/Times. */
		final String dateTimeFormatPattern = "yyyy/MM/dd";
		/**
		 * java.util.Date instance representing now that can
		 * be formatted using SimpleDateFormat based on my
		 * dateTimeFormatPattern field.
		 */
		final SimpleDateFormat format = new SimpleDateFormat(dateTimeFormatPattern);
		Date nowString = new Date();
		try {
			nowString = format.parse(joinDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nowString;
	}

}
