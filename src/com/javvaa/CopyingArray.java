package com.javvaa;

public class CopyingArray {
	public static void main(String args[])
	{
	char[] copyFrom=  { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
            'i', 'n', 'a', 't', 'e', 'd' };
	char[] copyTo=new char[10];
System.arraycopy(copyFrom, 0, copyTo, 0, 10);
System.out.println(String.valueOf(copyTo));
	}

}
