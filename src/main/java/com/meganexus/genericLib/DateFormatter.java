package com.meganexus.genericLib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	public static void main(String args[]) {
		System.out.println(changeDateFormat("2016-08-09"));
	}
	
	public static  String changeDateFormat(String oldDateString){
		
		 SimpleDateFormat old_dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		 SimpleDateFormat new_dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		 
		 Date date = null;
		 try {
			 date = old_dateFormat.parse(oldDateString);
		 } catch (ParseException e) {
			 e.printStackTrace();
		 }
		 
		 return new_dateFormat.format(date).toString();
	}
}
