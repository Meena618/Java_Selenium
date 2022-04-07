package Collections;
import java.util.*;

public class LinkedListExample {
	public static void main(String args[])
	{
		LinkedList<String>am=new LinkedList<String>();
		am.add("Meena");
		am.add("Sridhar");
		am.add("Adwaith");
		am.add("Tanooja");
		am.add("Kishan");
		am.add("Vihaan");
		System.out.println(am);	
		LinkedList<String>al=new LinkedList<String>();
		al.add("9908212383");
		al.add("9550452329");
		al.add("7386325816");
		al.add("7794985325");
		al.add("9949257079");
		al.add("8143441664");
		System.out.println(al);	
		Iterator<String>itr=al.iterator();
		Iterator<String>itr1=am.iterator();
		while(itr.hasNext()){
			while(itr1.hasNext())
				System.out.println(itr.next());
			   System.out.println(itr1.next());
	
		
	}

	}
}
