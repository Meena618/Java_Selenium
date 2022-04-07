package com.javvaa;

public class AscendingOrderArray {
	public static void main(String args[])
	{
		int arr[]= new int[] {5,8,3,4,2};
		int temp=0;
		System.out.println("Print original array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Print sorted array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"");
		}
	}
}

