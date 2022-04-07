package com.javvaa;

public class CalculatorSwitchcase {
	public static void main(String args[]) {
	int no1=10,no2=20,result;
	String Symbol="+,-,*/";
	switch("+") 
	{
	case "+":result=no1+no2;
	System.out.println("resu-lt"+result);
	break;
	case "-":result=no1-no2;
	System.out.println("result");
	break;
	case "*":result=no1*no2;
	System.out.println("result");
	break;
	case "/":result=no1*no2;
	System.out.println("result");
	break;
	default:
	System.out.println("Invalid symbol");
	break;
	}
	}

}