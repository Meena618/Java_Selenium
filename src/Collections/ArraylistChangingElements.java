package Collections;
import java.util.ArrayList;
public class ArraylistChangingElements {
	public static void main(String args[])
	{
		ArrayList<String>Languages=new ArrayList<>();
		Languages.add("Java");
		Languages.add("Python");
		Languages.add("C++");
		Languages.add("ASP.Net");
		System.out.println("Languages before changing"+Languages);
		Languages.set(3, "Javascript");
		System.out.println("After modifying"+Languages);
	}
	

}
