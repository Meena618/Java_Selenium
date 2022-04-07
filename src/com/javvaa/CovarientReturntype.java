package com.javvaa;

class Car {
 Car Show() {
	 System.out.println("Car has four wheels");
	 return this;
 }}

class Bike extends Car	
{
	@Override
	Bike Show() {
		super.Show();
		System.out.println("Bike has two wheels");
		return this;
}
}

 class CovarientReturntype
{
	public static void main(String[] args)
	{
		Bike b=new Bike();
		b.Show();
	
}

}
