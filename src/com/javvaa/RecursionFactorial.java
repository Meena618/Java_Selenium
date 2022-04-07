package com.javvaa;

public class RecursionFactorial {
	static int fact=1;
	public static void main(String args[])
	{
		int no=5;
		RecursionFactorial ob=new RecursionFactorial();
		ob.calcfact(no);
		System.out.println("Print the factorial of"+no+"is"+fact);
		
	}
	void calcfact(int no)
	{if(no>=1)
	{
		fact=fact*no;
		calcfact(no-1);
	}
	}
}


