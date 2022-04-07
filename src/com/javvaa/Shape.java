package com.javvaa;

abstract class Shape {
	abstract void draw();

}
class Rectangle extends Shape{
	void draw() {System.out.println("Draw a rectangle");}
}
class Circle1 extends Shape{
	void draw() {System.out.println("Draw a circle");}
}
class Test5
{
	public static void main(String args[]) {
		Shape s=new Circle1();
		Shape s1=new Rectangle();
		s.draw();
		s1.draw();
	}
}
