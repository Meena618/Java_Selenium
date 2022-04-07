package Collections;
import java.util.ArrayList;
import java.util.HashSet;
public class RemoveallHashset {
	public static void main(String args[]) {
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		System.out.println("ArrayList"+numbers);
		HashSet<Integer>primenumbers=new HashSet<>();
		primenumbers.add(2);
		primenumbers.add(4);
		System.out.println("Hashset"+primenumbers);
		numbers.removeAll(primenumbers);
		System.out.println("Arraylist after removeall:"+numbers);
		
	}

}
