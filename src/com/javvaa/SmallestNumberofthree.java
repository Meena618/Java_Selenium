package com.javvaa;
import java.util.Scanner;

public class SmallestNumberofthree {
public static void main(String args[]) {
	int a,b,c,largest,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	a=sc.nextInt();
	System.out.println("Ënter the second number");
	b=sc.nextInt();
	System.out.println("Ënter the third number");
	c=sc.nextInt();
	temp=a>b?a:b;
	largest=c>temp?c:temp;
	System.out.println("The Largest number is:"+largest);
}
}
