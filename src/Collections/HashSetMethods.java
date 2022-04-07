package Collections;
import java.util.*;
public class HashSetMethods {
	public static void main(String args[])
	{
		HashSet<String>names=new HashSet<>();
	names.add("Meena");
	names.add("Sridhar");
	names.add("Adwaith");
	names.add("Tanooja");
	names.add("Kishan");
	System.out.println("Hashset elements"+names);
	names.remove("Tanooja");
	System.out.println("After remove method"+names);
	HashSet<String>set1=new HashSet<>();
	set1.add("Vihaan");
	set1.add("Vishnu");
	names.addAll(set1);
	System.out.println("After adding elements"+names);
	names.removeAll(set1);
	System.out.println("after remove all method"+names);
	names.removeIf(str->str.contains("kishan"));
	   System.out.println("After invoking removeIf() method: "+names); 
	 names.clear();
	 System.out.println("After invoking clear() method: "+names);  
	

	
	}
}
