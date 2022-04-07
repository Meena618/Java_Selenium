package com.javvaa;

public class ArrayElements {
	public static void main(String args[])
	{
		int[] arr1=new int[]{1,3,4,6,7};
		int[] arr2=new int [arr1.length];
	for(int i=0;i<arr1.length;i++)
	{
		arr2[i]=arr1[i];
	}
	System.out.println("Elements of original array:");	
    for(int i=0;i<arr1.length;i++)
    {
    System.out.println(arr1[i]+"");
    }
    System.out.println();
	
	System.out.println("Elements of new array: ");
	for(int i=0;i<arr2.length;i++)
	{
		System.out.println(arr1[i]+"");
}
	}
}
