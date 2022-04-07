package com.javvaa;

public class ReverseArray {
	public static void main(String args[])
	{
	int[] arr=new int[] {5,6,7,8,9};
	System.out.println("print original array:");
	for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]+"");
	}
	System.out.println();
	System.out.println("Print reverse order:");
	for(int i=arr.length-1;i>=0;i--) {
	System.out.println(arr[i]+"");
	}
	}
	}


