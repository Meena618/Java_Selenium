package Collections;
import java.util.ArrayList;

public class ArraylistIndexofMethod {
	public static void main(String args[])
	{
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(24);
		numbers.add(56);
		numbers.add(35);
		numbers.add(28);
		System.out.println("Arraylist:"+numbers);
		int position2=numbers.indexOf(35);
		System.out.println("Index of 35:"+position2);
		int position3=numbers.indexOf(67);
		System.out.println("Index of 67:"+position3);
}
}
