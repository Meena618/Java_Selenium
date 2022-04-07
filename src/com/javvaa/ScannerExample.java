package com.javvaa;
import java.util.*;
public class ScannerExample {
	public static void main(String args[]) {
		String s = "Welcome to Hyderabad";
		Scanner scan = new Scanner(s);
		System.out.println("Boolean Result:"+scan.hasNext());
		System.out.println("String:"+scan.nextLine());		
		scan.close();
		System.out.println("---------Enter the Details---------");
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scan1.next();
		System.out.println("Ënter your card number:");
		String number = scan2.next();
		System.out.print("Enter your age: "); 
		int i = scan3.nextInt();
		System.out.println("Age: " + i);  
        System.out.print("Enter your salary: ");  
        double d = scan4.nextDouble();  
        System.out.println("Salary: " + d);         
        scan4.close();    
		
		
		
		
	};
		
	

}
