package com.javvaa;

public class ArrayRightrotate {
	public static void main(String args[]) {
		int arr[]= new int[]{1,2,3,4,5};
		int n=3;
		System.out.println("Print original array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");

		}

		for(int i=0;i<n;i++) {
			int last,j;
			last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
			System.out.println();

		}

		System.out.println("Print right rotate array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}

	}
}


