package Exceptions;
import java.io.FileNotFoundException;//checked exceptions
import java.io.PrintWriter;
public class Filenotfoundexception {
	public static void main(String args[]) {
	
		PrintWriter pw;
		try {
			pw=new PrintWriter("jtp.txt");
			pw.println("Saved");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("File saved succesfully");
	}

}
