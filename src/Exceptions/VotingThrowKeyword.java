package Exceptions;
import java.util.Scanner;

public class VotingThrowKeyword extends RuntimeException{
	VotingThrowKeyword(String msg)
	{
	super(msg);
	}

}
class Voting{
	public static void main(String args[]) {
	Scanner sd=new Scanner(System.in);
	System.out.println("Enter your age:");
	int age=sd.nextInt();
	if(age<18) {
		throw new VotingThrowKeyword("You are not eligible for");
	}
	else {
		System.out.println("you can vote");
	}
}}