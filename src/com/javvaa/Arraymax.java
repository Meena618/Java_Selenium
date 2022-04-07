package com.javvaa;

public class Arraymax {
	 
	public static void main(String[] args) 
	{  
	int [] arr = new int [] {25, 11, 17, 57, 62, 91, 31, 29, 73};  
	int min = arr[0];  
	for (int i = 0; i < arr.length; i++) 
	{  
	if(arr[i] < min)  
	min = arr[i];  
	}  
	System.out.println("Largest element present in given array: " + min);  
	}  
	}




























