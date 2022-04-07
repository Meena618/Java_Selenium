package Exceptions;

public class NestedTry {
	public static void main(String args[])
	{
		try {
			try {
				System.out.print("Going to divide by 0");
				int a=40/0;
			
			}
			catch(ArithmeticException e) {
				
			System.out.println(e);
			
			}
			try {
				int a[]=new int[5];
				a[5]=3;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("Welcome to nested try block");
		}
		catch (Exception e)
		{
			System.out.println("Handled the exception(outer catch)");
		}
		System.out.println("Normal flow..");
	}
		
}
