package com.javvaa;

public class CloneArray {
	public static void main(String args[])
	{
	int arr[]= {33,85,7,9};
	System.out.println("Print original array:");
	for(int i:arr)
	System.out.println(i);
	System.out.println("Print clone array:");

	int carr[]=arr.clone();  
	for(int i:carr)
	System.out.println(i);
	System.out.println("Äre both equal?");
	System.out.println(arr=carr);
	
}
}