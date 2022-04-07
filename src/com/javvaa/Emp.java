package com.javvaa;


public class Emp {

	int id;
	String name;
	int age;
	
 static String ebankname="indianbank";
	
	Emp(int i,String n)
	{
	id=i;
	name=n;
	}
	Emp(int i,String n, int a)
	{
		id=i;
		name=n;
		age=a;
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age+" "+ebankname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp e1=new Emp(10,"harshi");
Emp e2=new Emp(20,"mani",28);
e1.display();
e2.display();
	}

}