package Collections;
import java.util.*;

public class LinkedListMthod {
	
		public static void main(String args[])
		{
			LinkedList<String>A1=new LinkedList<String>();
			A1.add("America");
			A1.add("India");
			A1.add("Australia");
			A1.add("London");	
			A1.add("Sydney");
			A1.add("Malasia");
			A1.add("Singapore");	
			A1.add("Russuia");
			System.out.println("Initial list elements:"+A1);
			A1.remove("Malasia");
			System.out.println("After invoking remove method"+A1);
			A1.remove(0);
			System.out.println("After invoking remove index method"+A1);
			LinkedList<String>A2=new LinkedList<String>();
			A2.add("Africa");
			A2.add("Indonasia");
			A1.addAll(A2);
			System.out.println("Updated List"+A1);
			A1.removeAll(A2);
			System.out.println("After invoking removeall method"+A1);
			A1.removeFirst();
			System.out.println("After invoking removefirst method"+A1);
			A1.removeLast();
			System.out.println("After invoking removelast method"+A1);
			A1.removeFirstOccurrence("India");
			System.out.println("After invoking removefirst occurance method"+A1);
			A1.removeLastOccurrence("Russia");
			System.out.println("After invoking removeLast occurance method"+A1);
			A1.clear();
			System.out.println("After invoking clear method"+A1);
			
			
			
			
			
			

}
}
