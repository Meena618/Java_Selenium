package com.javvaa;

public class SampleReturn1 {
	 public int CompareNum() 
	{
	int x=10;
	int y=8;
	  System.out.println("x = " + x + "\ny = " + y); 
	  if(x>y)
		  return x;
	  else
		  return y;
	  
	}
 public static void main(String args[]) {
	 SampleReturn1 r=new SampleReturn1();
	 int result=r.CompareNum();
	 System.out.println("The greater number of x and y is-"+result);
 }
}
