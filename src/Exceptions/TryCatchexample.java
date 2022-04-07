package Exceptions;

public class TryCatchexample {
	public static void main(String args[]) {
	int a=100,b=0;
	int data;
	try
	{
	data=a/b;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("print the value:"+a/(b+2));
	}
	

}
