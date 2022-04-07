package RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexExpression5 {
	private static String REGEX="dog";
	private static String INPUT="The dog says meow."+"All dogs says meow";
	private static String REPLACE="Cat";
	public static void main(String args[]) {
		Pattern p=Pattern.compile(REGEX);
		
		Matcher m=p.matcher(INPUT);
		INPUT=m.replaceAll(REPLACE);
		System.out.println(INPUT);
	}
	

}
