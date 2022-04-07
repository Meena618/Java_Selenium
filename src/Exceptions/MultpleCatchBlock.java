package Exceptions;

public class MultpleCatchBlock {
	public static void main(String args[])
	{
		try {

			int a=50,b=0,c;
			c=a/b;
			int arr[]= {3,4,6,7};
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs");

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arrayoutofbound exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent exception occurs:");
		}
		String s="welcome to multicatch block";
		System.out.println(s);
	}
}