package com.javvaa;

	public class FinalMethod {
	    // create a final method
	    public void display() {
	      System.out.println("This is a final method.");
	    }
	}

	class Child extends FinalMethod {
	  // try to override final method
	  public void display() {
	    System.out.println("The final method is overridden.");
	  }

	  
	  //public static void main(String[] args)
	  public static void main(String[] args) {
	    Child obj = new Child();
	    obj.display();
	  }
	}

