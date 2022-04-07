package com.javvaa;

public class ArrayMin {
	static void min(int arr[]) {
		int min=arr[0];
	for(int i=1;i<arr.length;i++)
	if(min>arr[i])
	min=arr[i];
	System.out.print(min);
	}
	public static void main(String args[])
	{
	int arr[]= {33,45,6,8};
	min(arr);
	}

}
