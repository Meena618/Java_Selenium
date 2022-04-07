package Exceptions;

public class Arrayindexoutofboundexception {
	public static void main(String args[]) {
		try {
		int arr[]= {6,5,4,3,2,1};
	System.out.println(arr[10]);
	}
		//catch(ArrayIndexOutOfBoundsException e)
		catch(Exception e)
	{
			System.out.println(e);
	
	}
		System.out.println("Print rest of the code");
}
}