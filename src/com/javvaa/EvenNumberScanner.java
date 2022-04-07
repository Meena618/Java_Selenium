package com.javvaa;
import java.util.Scanner;

public class EvenNumberScanner {
	public static void main(String args[])
	{
int number,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit:");
number=sc.nextInt();
i=2;
System.out.println("List of even numbers:");
while(i<=number)	
{
	System.out.print(i +" ");
	i=i+2;
	}
	}
}