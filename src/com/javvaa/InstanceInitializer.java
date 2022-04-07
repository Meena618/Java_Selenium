package com.javvaa;

 public class InstanceInitializer{
	InstanceInitializer(){System.out.println("Invokes parent constructor");}
 }																						
class Instance extends InstanceInitializer{
	Instance(){
		super();
		System.out.println("Invokes child class constructor");}

	Instance(int a){
		super();
		System.out.println("Child class constructor invokes"+a);}
		{System.out.println("Invokes instance initializer block");}
		
		public static void main (String args[]) {
		Instance b1 = new Instance();
		Instance b2=new Instance(10);
		}
	
	
	
	}



