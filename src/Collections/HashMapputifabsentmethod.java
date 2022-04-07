package Collections;
import java.util.HashMap;
public class HashMapputifabsentmethod {
	public static void main(String args[])
	{
		HashMap<Integer,String>languages=new HashMap<>();
		languages.put(1, "Python");
		languages.put(2, "Java");
		languages.put(3,"C++");
		System.out.println("HashMap:"+languages);
		languages.putIfAbsent(4, "Javascript");
		languages.putIfAbsent(2, "Swift");
		System.out.println("Updated languages"+languages);
	}
	

}
