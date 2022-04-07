package Collections;
import java.util.HashMap;
public class HashMapClonemethod {
	public static void main(String args[])
	{
		HashMap<String,Integer>languages=new HashMap<>();
		languages.put("Java", 35);
		languages.put("Javascript", 4);
		languages.put("C++", 45);
		languages.put("Asp.net", 65);
		languages.put("Python", 7);
		System.out.println("Hashmap:"+languages);
		HashMap<String,Integer>clonelanguages=(HashMap<String,Integer>)languages.clone();
		System.out.println("Cloned HashMap"+clonelanguages);
	}

}
	