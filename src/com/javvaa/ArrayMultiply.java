package com.javvaa;

public class ArrayMultiply {
	public static void main(String args[])
	{
		int a[][]= {{2,3,5},{8,9,6},{6,7,8}};
		int b[][]= {{6,8,9},{7,6,9},{6,7,8}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) {
					c[i][j]+=a[i][j]*b[i][j];
					System.out.print("Print:"+c[i][j]+"  ");
				}
				System.out.println();

			}
		}
	}
}

