package com.javvaa;

public class AdditionMatrix {
public static void main(String args[])
{
	int a[][]= {{1,4,6},{5,7,9}};
	int b[][]= {{2,8,7},{8,8,9}};
	int c[][]=new int[2][3];
	for(int i=0;i<2;i++) {
    for(int j=0;j<3;j++)
    {
    c[i][j]=a[i][j]+b[i][j];
    System.out.println(c[i][j]+"");
    
    }
    System.out.println();
}
}
}
