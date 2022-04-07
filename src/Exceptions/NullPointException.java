package Exceptions;

public class NullPointException {
	public static void main(String args[])
	{
		try {
	String s =null;
	System.out.println(s.length());
	
	}
catch(ArithmeticException e) {
	System.out.println("Arithmetic exception occurs");
}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arrayindexoutofbound exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent exception occurs ");
		}
		System.out.println("Rest of the code executed");
}
}