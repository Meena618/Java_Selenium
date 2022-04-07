package Collections;
import java.util.ArrayList;
public class ArraylistFirstOccuerence {
	public static void main(String args[])
	{
		ArrayList<String>Languages=new ArrayList<>();
		Languages.add("Java");
		Languages.add("Python");
		Languages.add("C++");
		Languages.add("ASP.Net");
		Languages.add("Java");
		System.out.println("Programming Languages"+Languages);
		int position=Languages.indexOf("Java");
		System.out.println("First occurence of java is"+position);
	}

}
