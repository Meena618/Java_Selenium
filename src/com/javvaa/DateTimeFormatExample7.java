package com.javvaa;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample7 {
public static void main(String args[]) {
	LocalDateTime datetime1=LocalDateTime.of(2018,2,14,10,35);
	LocalDateTime datetime2=datetime1.minusDays(150);
	System.out.println("Before formatting:"+datetime2);
	DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-YYYY HH: mm");
	String formatDateTime=datetime2.format(format);
	System.out.println("After formatting:"+formatDateTime);
	
	
}
}