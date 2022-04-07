package Exceptions;

public class ExceptionExample {
	public static void main(String args[])
	{
		try
		{
			int data=100/0;
		}
		catch(ArithmeticException e)
		{
		System.out.println(e);
		}
		int id=101;
		String name ="Sridhar";
		
	System.out.println("employee ID:"+id);
	System.out.println("emlpoyee name:"+name);
	}

}
