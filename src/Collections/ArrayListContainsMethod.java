package Collections;

import java.util.ArrayList;

public class ArrayListContainsMethod {
	public static void main(String[] args) {
	    // create an ArrayList
	    ArrayList<String> languages = new ArrayList<>();
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("JavaScript");
	    System.out.println("ArrayList: " + languages);

	    // checks if 3 is present in the arraylist
	    System.out.print("Is Java present in the arraylist: ");
	    System.out.println(languages.contains("Java"));

	  }
	}



