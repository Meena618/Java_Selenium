package com.javvaa;

public class ASCIIProgram {
	public static void main(String args[]) {
		char a='A';
		char b='c';
		int c= 9;
		int asciivalue1 = a;
		int asciivalue2 = b;
		System.out.println("the ASCCI Value of"+a+"is"+asciivalue1);
		System.out.println("the ASCCI Value of"+b+"is"+asciivalue2);
		for(int i=0;i<=255;i++) {
			System.out.println("The ASCII Value of"+(char)i+"="+i);
		}
	}

}
