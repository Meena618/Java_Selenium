package Collections;
import java.util.ArrayList;
public class ArraylistAccessing {
public static void main(String args[])

{
	ArrayList<String>animals=new ArrayList<>();
	animals.add("Dog");
	animals.add("Cow");
	animals.add("Cat");
	animals.add("Pig");
	System.out.println("Arraylist"+animals);
	String str=animals.get(3);
	System.out.println("Elements at index 3"+str);
}
}
