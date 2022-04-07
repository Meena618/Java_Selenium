package RegularExpression;
import java.util.regex.*;
class RegexExample{
	public static void main (String args[]) {
		System.out.println(Pattern.matches(".s","as"));
		System.out.println(Pattern.matches(".s","n"));
	System.out.println(Pattern.matches(".s","gs"));
	System.out.println(Pattern.matches(".s","mk"));
	System.out.println(Pattern.matches("..s","pmsk"));
	}
}
