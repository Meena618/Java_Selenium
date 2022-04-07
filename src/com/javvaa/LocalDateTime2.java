package com.javvaa;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime2 {
	public static void main(String args[])
	{
		LocalDateTime now=LocalDateTime.now();
		System.out.println("Before formatting "+now);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
		String formatDateTime=now.format(format);
		System.out.println("After formattion date and time"+formatDateTime );
}
	
}
