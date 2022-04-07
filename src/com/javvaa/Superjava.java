package com.javvaa;

class Animal{
	int animals =5;
	String color ="White";
}
class Dog extends Animal{
	String color="Black";
	int dogs=3;
	void printColor()
	
	{
		System.out.println(color);
		System.out.println(animals);
		System.out.println(super.color);
	}
}
class Superjava
{
	public static void main(String args[]){  
		Dog d=new Dog();
		d.printColor();
	}
}



